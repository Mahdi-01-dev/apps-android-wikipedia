package org.wikipedia.watchlist;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialogViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/watchlist/WatchlistExpiryDialogViewModel$WatchlistExpiryChangeSuccess;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setPageTitle", "(Lorg/wikipedia/page/PageTitle;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeExpiry", "", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "WatchlistExpiryChangeSuccess", "app.lib"})
public final class WatchlistExpiryDialogViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle pageTitle;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.watchlist.WatchlistExpiryDialogViewModel.WatchlistExpiryChangeSuccess>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.watchlist.WatchlistExpiryDialogViewModel.WatchlistExpiryChangeSuccess>> uiState = null;
    
    public WatchlistExpiryDialogViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
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
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.watchlist.WatchlistExpiryDialogViewModel.WatchlistExpiryChangeSuccess>> getUiState() {
        return null;
    }
    
    public final void changeExpiry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialogViewModel$WatchlistExpiryChangeSuccess;", "", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "message", "", "(Lorg/wikipedia/watchlist/WatchlistExpiry;Ljava/lang/String;)V", "getExpiry", "()Lorg/wikipedia/watchlist/WatchlistExpiry;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app.lib"})
    public static final class WatchlistExpiryChangeSuccess {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.watchlist.WatchlistExpiry expiry = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.watchlist.WatchlistExpiry component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.watchlist.WatchlistExpiryDialogViewModel.WatchlistExpiryChangeSuccess copy(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public WatchlistExpiryChangeSuccess(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.watchlist.WatchlistExpiry getExpiry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
}