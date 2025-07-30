package org.wikipedia.watchlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.WatchlistAnalyticsHelper;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryResult;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import java.io.IOException;
import java.util.Calendar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\n\u0010$\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010%\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\bH\u0002J\u0010\u0010\'\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020!J\u0010\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "", "<set-?>", "", "currentSearchQuery", "getCurrentSearchQuery", "()Ljava/lang/String;", "displayLanguages", "", "getDisplayLanguages", "()Ljava/util/List;", "setDisplayLanguages", "(Ljava/util/List;)V", "finalList", "", "", "getFinalList", "setFinalList", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "watchlistItems", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "fetchWatchlist", "searchBarPlaceholder", "", "filtersCount", "", "latestRevisions", "showCriteriaString", "showTypesString", "updateList", "updateSearchQuery", "query", "Companion", "app.lib"})
public final class WatchlistViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem> watchlistItems;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Object> finalList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> displayLanguages;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Unit>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.watchlist.WatchlistViewModel.Companion Companion = null;
    
    public WatchlistViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getFinalList() {
        return null;
    }
    
    public final void setFinalList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDisplayLanguages() {
        return null;
    }
    
    public final void setDisplayLanguages(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> getUiState() {
        return null;
    }
    
    public final void updateList(boolean searchBarPlaceholder) {
    }
    
    public final void fetchWatchlist(boolean searchBarPlaceholder) {
    }
    
    public final void updateSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final int filtersCount() {
        return 0;
    }
    
    private final java.lang.String latestRevisions() {
        return null;
    }
    
    private final java.lang.String showCriteriaString() {
        return null;
    }
    
    private final java.lang.String showTypesString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJT\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0086@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistViewModel$Companion;", "", "()V", "showWatchlistSnackbar", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "isWatched", "", "message", "", "watchPageTitle", "Lkotlin/Pair;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "unwatch", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "isCurrentlyWatched", "isTalkPage", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/page/PageTitle;ZLorg/wikipedia/watchlist/WatchlistExpiry;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object watchPageTitle(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, boolean unwatch, @org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isCurrentlyWatched, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isTalkPage, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> $completion) {
            return null;
        }
        
        public final void showWatchlistSnackbar(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, boolean isWatched, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
}