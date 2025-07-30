package org.wikipedia.page.linkpreview;

import android.location.Location;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.log.L;
import org.wikipedia.watchlist.WatchlistExpiry;
import org.wikipedia.watchlist.WatchlistViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020+J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/page/linkpreview/LinkPreviewViewState;", "fromPlaces", "", "getFromPlaces", "()Z", "hasWatchlistExpiry", "getHasWatchlistExpiry", "setHasWatchlistExpiry", "(Z)V", "historyEntry", "Lorg/wikipedia/history/HistoryEntry;", "getHistoryEntry", "()Lorg/wikipedia/history/HistoryEntry;", "isInReadingList", "setInReadingList", "isWatched", "setWatched", "lastKnownLocation", "Landroid/location/Location;", "getLastKnownLocation", "()Landroid/location/Location;", "location", "getLocation", "setLocation", "(Landroid/location/Location;)V", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setPageTitle", "(Lorg/wikipedia/page/PageTitle;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadContent", "", "loadGallery", "watchOrUnwatch", "unwatch", "app.lib"})
public final class LinkPreviewViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.page.linkpreview.LinkPreviewViewState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.page.linkpreview.LinkPreviewViewState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.history.HistoryEntry historyEntry = null;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle pageTitle;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location location;
    private final boolean fromPlaces = false;
    @org.jetbrains.annotations.Nullable()
    private final android.location.Location lastKnownLocation = null;
    private boolean isInReadingList = false;
    private boolean isWatched = false;
    private boolean hasWatchlistExpiry = false;
    
    public LinkPreviewViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.page.linkpreview.LinkPreviewViewState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.history.HistoryEntry getHistoryEntry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final void setPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public final boolean getFromPlaces() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLastKnownLocation() {
        return null;
    }
    
    public final boolean isInReadingList() {
        return false;
    }
    
    public final void setInReadingList(boolean p0) {
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
    
    private final void loadContent() {
    }
    
    public final void loadGallery() {
    }
    
    public final void watchOrUnwatch(boolean unwatch) {
    }
}