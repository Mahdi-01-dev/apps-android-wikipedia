package org.wikipedia.page;

import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.readinglist.database.ReadingListPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/page/PageViewModel;", "", "()V", "cacheControl", "Lokhttp3/CacheControl;", "getCacheControl", "()Lokhttp3/CacheControl;", "curEntry", "Lorg/wikipedia/history/HistoryEntry;", "getCurEntry", "()Lorg/wikipedia/history/HistoryEntry;", "setCurEntry", "(Lorg/wikipedia/history/HistoryEntry;)V", "forceNetwork", "", "getForceNetwork", "()Z", "setForceNetwork", "(Z)V", "hasWatchlistExpiry", "getHasWatchlistExpiry", "setHasWatchlistExpiry", "isInReadingList", "isReadMoreLoaded", "setReadMoreLoaded", "isWatched", "setWatched", "page", "Lorg/wikipedia/page/Page;", "getPage", "()Lorg/wikipedia/page/Page;", "setPage", "(Lorg/wikipedia/page/Page;)V", "readingListPage", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "getReadingListPage", "()Lorg/wikipedia/readinglist/database/ReadingListPage;", "setReadingListPage", "(Lorg/wikipedia/readinglist/database/ReadingListPage;)V", "shouldLoadAsMobileWeb", "getShouldLoadAsMobileWeb", "title", "Lorg/wikipedia/page/PageTitle;", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "setTitle", "(Lorg/wikipedia/page/PageTitle;)V", "app.lib"})
public final class PageViewModel {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.Page page;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle title;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.history.HistoryEntry curEntry;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.database.ReadingListPage readingListPage;
    private boolean hasWatchlistExpiry = false;
    private boolean isWatched = false;
    private boolean forceNetwork = false;
    private boolean isReadMoreLoaded = false;
    
    public PageViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.Page getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.Page p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.history.HistoryEntry getCurEntry() {
        return null;
    }
    
    public final void setCurEntry(@org.jetbrains.annotations.Nullable()
    org.wikipedia.history.HistoryEntry p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.readinglist.database.ReadingListPage getReadingListPage() {
        return null;
    }
    
    public final void setReadingListPage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingListPage p0) {
    }
    
    public final boolean getHasWatchlistExpiry() {
        return false;
    }
    
    public final void setHasWatchlistExpiry(boolean p0) {
    }
    
    public final boolean isWatched() {
        return false;
    }
    
    public final void setWatched(boolean p0) {
    }
    
    public final boolean getForceNetwork() {
        return false;
    }
    
    public final void setForceNetwork(boolean p0) {
    }
    
    public final boolean isReadMoreLoaded() {
        return false;
    }
    
    public final void setReadMoreLoaded(boolean p0) {
    }
    
    public final boolean isInReadingList() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.CacheControl getCacheControl() {
        return null;
    }
    
    public final boolean getShouldLoadAsMobileWeb() {
        return false;
    }
}