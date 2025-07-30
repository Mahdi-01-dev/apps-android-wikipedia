package org.wikipedia.savedpages;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Request;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import org.wikipedia.WikipediaApp;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.RestService;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.events.PageDownloadEvent;
import org.wikipedia.page.PageTitle;
import org.wikipedia.pageimages.db.PageImage;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.readinglist.sync.ReadingListSyncEvent;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.*;
import org.wikipedia.util.log.L;
import org.wikipedia.views.CircularProgressBar;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150 H\u0082@\u00a2\u0006\u0002\u0010!J&\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010&J\u001c\u0010\'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0*H\u0082@\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lorg/wikipedia/savedpages/SavedPageSyncService;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "savedPageSyncNotification", "Lorg/wikipedia/savedpages/SavedPageSyncNotification;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRetryable", "", "t", "", "makeUrlRequest", "Lokhttp3/Request$Builder;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "url", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "reqMobileHTML", "Lokhttp3/Response;", "(Lorg/wikipedia/page/PageTitle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reqSaveFiles", "", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "urls", "", "(Lorg/wikipedia/readinglist/database/ReadingListPage;Lorg/wikipedia/page/PageTitle;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reqSaveUrl", "(Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePageFor", "", "(Lorg/wikipedia/readinglist/database/ReadingListPage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePages", "", "queue", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app.lib"})
public final class SavedPageSyncService extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.savedpages.SavedPageSyncNotification savedPageSyncNotification = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WORK_NAME = "savePageSyncService";
    private static final long ENQUEUE_DELAY = 2L;
    public static final int MEDIA_LIST_PROGRESS = 30;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.savedpages.SavedPageSyncService.Companion Companion = null;
    
    public SavedPageSyncService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> $completion) {
        return null;
    }
    
    private final java.lang.Object savePages(java.util.List<org.wikipedia.readinglist.database.ReadingListPage> queue, kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.Object savePageFor(org.wikipedia.readinglist.database.ReadingListPage page, kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    private final java.lang.Object reqMobileHTML(org.wikipedia.page.PageTitle pageTitle, kotlin.coroutines.Continuation<? super okhttp3.Response> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, java.lang.InterruptedException.class})
    private final java.lang.Object reqSaveFiles(org.wikipedia.readinglist.database.ReadingListPage page, org.wikipedia.page.PageTitle pageTitle, java.util.Set<java.lang.String> urls, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.lang.Object reqSaveUrl(org.wikipedia.page.PageTitle pageTitle, org.wikipedia.dataclient.WikiSite wiki, java.lang.String url, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final okhttp3.Request.Builder makeUrlRequest(org.wikipedia.dataclient.WikiSite wiki, java.lang.String url, org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    private final boolean isRetryable(java.lang.Throwable t) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/savedpages/SavedPageSyncService$Companion;", "", "()V", "ENQUEUE_DELAY", "", "MEDIA_LIST_PROGRESS", "", "WORK_NAME", "", "enqueue", "", "sendSyncEvent", "showMessage", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void enqueue() {
        }
        
        public final void sendSyncEvent(boolean showMessage) {
        }
    }
}