package org.wikipedia.readinglist.sync;

import android.content.*;
import android.os.Bundle;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.ReadingListsEnableDialogEvent;
import org.wikipedia.events.ReadingListsEnabledStatusEvent;
import org.wikipedia.events.ReadingListsNoLongerSyncedEvent;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry;
import org.wikipedia.savedpages.SavedPageSyncService;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.RemoteConfig;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListSyncAdapter;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "createOrUpdatePage", "", "listForPage", "Lorg/wikipedia/readinglist/database/ReadingList;", "remotePage", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "deletePageByTitle", "title", "Lorg/wikipedia/page/PageTitle;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBooleanExtraFromData", "Landroid/os/Bundle;", "inputData", "Landroidx/work/Data;", "pageTitleFromRemoteEntry", "remoteEntry", "remoteEntryFromLocalPage", "localPage", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "Companion", "app.lib"})
public final class ReadingListSyncAdapter extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WORK_NAME = "readingListSyncAdapter";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SYNC_EXTRAS_FORCE_FULL_SYNC = "forceFullSync";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SYNC_EXTRAS_REFRESHING = "refreshing";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SYNC_EXTRAS_RETRYING = "retrying";
    private static boolean IN_PROGRESS = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.sync.ReadingListSyncAdapter.Companion Companion = null;
    
    public ReadingListSyncAdapter(@org.jetbrains.annotations.NotNull()
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
    
    private final android.os.Bundle getBooleanExtraFromData(androidx.work.Data inputData) {
        return null;
    }
    
    private final void createOrUpdatePage(org.wikipedia.readinglist.database.ReadingList listForPage, org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry remotePage) {
    }
    
    private final void deletePageByTitle(org.wikipedia.readinglist.database.ReadingList listForPage, org.wikipedia.page.PageTitle title) {
    }
    
    private final org.wikipedia.page.PageTitle pageTitleFromRemoteEntry(org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry remoteEntry) {
        return null;
    }
    
    private final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry remoteEntryFromLocalPage(org.wikipedia.readinglist.database.ReadingListPage localPage) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bJ\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListSyncAdapter$Companion;", "", "()V", "IN_PROGRESS", "", "SYNC_EXTRAS_FORCE_FULL_SYNC", "", "SYNC_EXTRAS_REFRESHING", "SYNC_EXTRAS_RETRYING", "WORK_NAME", "createIdsForDeletion", "", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "pages", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "inProgress", "manualSync", "", "extras", "Landroid/os/Bundle;", "manualSyncWithDeleteList", "manualSyncWithDeletePages", "", "manualSyncWithForce", "manualSyncWithRefresh", "setSyncEnabledWithSetup", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean inProgress() {
            return false;
        }
        
        public final void setSyncEnabledWithSetup() {
        }
        
        public final void manualSyncWithDeleteList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> createIdsForDeletion(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.Set<org.wikipedia.readinglist.database.ReadingListPage> pages) {
            return null;
        }
        
        public final void manualSyncWithDeletePages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
        }
        
        public final void manualSyncWithForce() {
        }
        
        public final void manualSyncWithRefresh() {
        }
        
        public final void manualSync(@org.jetbrains.annotations.NotNull()
        android.os.Bundle extras) {
        }
    }
}