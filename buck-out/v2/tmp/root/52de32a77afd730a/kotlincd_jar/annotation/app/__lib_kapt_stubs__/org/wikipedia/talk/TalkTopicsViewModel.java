package org.wikipedia.talk;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor;
import org.wikipedia.edit.Edit;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.TalkAliasData;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.talk.db.TalkPageSeen;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.TalkTopicsSortOverflowView;
import org.wikipedia.watchlist.WatchlistExpiry;
import org.wikipedia.watchlist.WatchlistViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003KLMB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u00105J\u0006\u00106\u001a\u000207J\u001a\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\'2\b\b\u0002\u0010:\u001a\u00020\u001bJ\b\u0010;\u001a\u000207H\u0002J\u0016\u0010<\u001a\u0002072\u0006\u00104\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u001bJ\u0014\u0010>\u001a\u0004\u0018\u00010\r2\b\u00109\u001a\u0004\u0018\u00010\'H\u0002J\u0010\u0010?\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\'J\u001e\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DJ\u000e\u0010F\u001a\u0002072\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0004R \u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\'0/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u000b\u00a8\u0006N"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel;", "Landroidx/lifecycle/ViewModel;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/page/PageTitle;)V", "actionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "actionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState;", "getActionState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "", "currentSearchQuery", "getCurrentSearchQuery", "()Ljava/lang/String;", "setCurrentSearchQuery", "(Ljava/lang/String;)V", "", "currentSortMode", "getCurrentSortMode", "()I", "setCurrentSortMode", "(I)V", "handler", "hasWatchlistExpiry", "", "getHasWatchlistExpiry", "()Z", "setHasWatchlistExpiry", "(Z)V", "isWatched", "setWatched", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setPageTitle", "sortedThreadItems", "", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "getSortedThreadItems", "()Ljava/util/List;", "setSortedThreadItems", "(Ljava/util/List;)V", "talkPageDao", "Lorg/wikipedia/talk/db/TalkPageSeenDao;", "threadItems", "", "uiState", "Lorg/wikipedia/talk/TalkTopicsViewModel$UiState;", "getUiState", "isSubscribed", "commentName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopics", "", "markAsSeen", "threadItem", "force", "sortAndFilterThreadItems", "subscribeTopic", "subscribed", "threadSha", "topicSeen", "undoSave", "newRevisionId", "", "undoneSubject", "", "undoneBody", "updatePageTitle", "watchOrUnwatch", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "unwatch", "ActionState", "Factory", "UiState", "app.lib"})
public final class TalkTopicsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle pageTitle;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.db.TalkPageSeenDao talkPageDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler actionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> sortedThreadItems;
    private boolean isWatched = false;
    private boolean hasWatchlistExpiry = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    private int currentSortMode;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.talk.TalkTopicsViewModel.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.talk.TalkTopicsViewModel.ActionState> actionState = null;
    
    public TalkTopicsViewModel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final void setPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> getSortedThreadItems() {
        return null;
    }
    
    public final void setSortedThreadItems(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> p0) {
    }
    
    public final boolean isWatched() {
        return false;
    }
    
    public final void setWatched(boolean p0) {
    }
    
    public final boolean getHasWatchlistExpiry() {
        return false;
    }
    
    public final void setHasWatchlistExpiry(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentSearchQuery() {
        return null;
    }
    
    public final void setCurrentSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final int getCurrentSortMode() {
        return 0;
    }
    
    public final void setCurrentSortMode(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.talk.TalkTopicsViewModel.UiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.talk.TalkTopicsViewModel.ActionState> getActionState() {
        return null;
    }
    
    public final void loadTopics() {
    }
    
    public final void updatePageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    public final void undoSave(long newRevisionId, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence undoneSubject, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence undoneBody) {
    }
    
    public final void markAsSeen(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.discussiontools.ThreadItem threadItem, boolean force) {
    }
    
    public final boolean topicSeen(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.discussiontools.ThreadItem threadItem) {
        return false;
    }
    
    private final java.lang.String threadSha(org.wikipedia.dataclient.discussiontools.ThreadItem threadItem) {
        return null;
    }
    
    public final void subscribeTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String commentName, boolean subscribed) {
    }
    
    private final void sortAndFilterThreadItems() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isSubscribed(@org.jetbrains.annotations.NotNull()
    java.lang.String commentName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    public final void watchOrUnwatch(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry, boolean unwatch) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState;", "", "()V", "DoWatch", "OnError", "UndoEdit", "app.lib"})
    public static class ActionState {
        
        public ActionState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState$DoWatch;", "Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState;", "isWatched", "", "message", "", "hasWatchlistExpiry", "(ZLjava/lang/String;Z)V", "getHasWatchlistExpiry", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app.lib"})
        public static final class DoWatch extends org.wikipedia.talk.TalkTopicsViewModel.ActionState {
            private final boolean isWatched = false;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            private final boolean hasWatchlistExpiry = false;
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            public final boolean component3() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.talk.TalkTopicsViewModel.ActionState.DoWatch copy(boolean isWatched, @org.jetbrains.annotations.NotNull()
            java.lang.String message, boolean hasWatchlistExpiry) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public DoWatch(boolean isWatched, @org.jetbrains.annotations.NotNull()
            java.lang.String message, boolean hasWatchlistExpiry) {
                super();
            }
            
            public final boolean isWatched() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            public final boolean getHasWatchlistExpiry() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState$OnError;", "Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class OnError extends org.wikipedia.talk.TalkTopicsViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.talk.TalkTopicsViewModel.ActionState.OnError copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public OnError(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState$UndoEdit;", "Lorg/wikipedia/talk/TalkTopicsViewModel$ActionState;", "edit", "Lorg/wikipedia/edit/Edit;", "undoneSubject", "", "undoneBody", "(Lorg/wikipedia/edit/Edit;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getEdit", "()Lorg/wikipedia/edit/Edit;", "getUndoneBody", "()Ljava/lang/CharSequence;", "getUndoneSubject", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class UndoEdit extends org.wikipedia.talk.TalkTopicsViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            private final org.wikipedia.edit.Edit edit = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.CharSequence undoneSubject = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.CharSequence undoneBody = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.edit.Edit component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.talk.TalkTopicsViewModel.ActionState.UndoEdit copy(@org.jetbrains.annotations.NotNull()
            org.wikipedia.edit.Edit edit, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence undoneSubject, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence undoneBody) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public UndoEdit(@org.jetbrains.annotations.NotNull()
            org.wikipedia.edit.Edit edit, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence undoneSubject, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence undoneBody) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.edit.Edit getEdit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence getUndoneSubject() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence getUndoneBody() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/page/PageTitle;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app.lib"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.page.PageTitle pageTitle = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle) {
            super();
        }
        
        @java.lang.Override()
        @kotlin.Suppress(names = {"unchecked_cast"})
        @org.jetbrains.annotations.NotNull()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$UiState;", "", "()V", "LoadError", "LoadTopic", "UpdateNamespace", "app.lib"})
    public static class UiState {
        
        public UiState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$UiState$LoadError;", "Lorg/wikipedia/talk/TalkTopicsViewModel$UiState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class LoadError extends org.wikipedia.talk.TalkTopicsViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.talk.TalkTopicsViewModel.UiState.LoadError copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public LoadError(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$UiState$LoadTopic;", "Lorg/wikipedia/talk/TalkTopicsViewModel$UiState;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "threadItems", "", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "(Lorg/wikipedia/page/PageTitle;Ljava/util/List;)V", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "getThreadItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class LoadTopic extends org.wikipedia.talk.TalkTopicsViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final org.wikipedia.page.PageTitle pageTitle = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.page.PageTitle component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.talk.TalkTopicsViewModel.UiState.LoadTopic copy(@org.jetbrains.annotations.NotNull()
            org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
            java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public LoadTopic(@org.jetbrains.annotations.NotNull()
            org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
            java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.page.PageTitle getPageTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> getThreadItems() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsViewModel$UiState$UpdateNamespace;", "Lorg/wikipedia/talk/TalkTopicsViewModel$UiState;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/page/PageTitle;)V", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class UpdateNamespace extends org.wikipedia.talk.TalkTopicsViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final org.wikipedia.page.PageTitle pageTitle = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.page.PageTitle component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.talk.TalkTopicsViewModel.UiState.UpdateNamespace copy(@org.jetbrains.annotations.NotNull()
            org.wikipedia.page.PageTitle pageTitle) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public UpdateNamespace(@org.jetbrains.annotations.NotNull()
            org.wikipedia.page.PageTitle pageTitle) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.page.PageTitle getPageTitle() {
                return null;
            }
        }
    }
}