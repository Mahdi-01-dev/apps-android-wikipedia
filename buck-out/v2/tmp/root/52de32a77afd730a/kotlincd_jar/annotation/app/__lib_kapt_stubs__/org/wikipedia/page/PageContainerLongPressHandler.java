package org.wikipedia.page;

import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.LongPressHandler.WebViewMenuCallback;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/page/PageContainerLongPressHandler;", "Lorg/wikipedia/LongPressHandler$WebViewMenuCallback;", "fragment", "Lorg/wikipedia/page/PageFragment;", "(Lorg/wikipedia/page/PageFragment;)V", "historyEntryId", "", "getHistoryEntryId", "()J", "referrer", "", "getReferrer", "()Ljava/lang/String;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "onAddRequest", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMoveRequest", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "onOpenInNewTab", "onOpenLink", "app.lib"})
public final class PageContainerLongPressHandler implements org.wikipedia.LongPressHandler.WebViewMenuCallback {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String referrer = null;
    
    public PageContainerLongPressHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment) {
        super();
    }
    
    @java.lang.Override()
    public void onOpenLink(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onAddRequest(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
    }
    
    @java.lang.Override()
    public void onMoveRequest(@org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getReferrer() {
        return null;
    }
    
    @java.lang.Override()
    public long getHistoryEntryId() {
        return 0L;
    }
    
    @java.lang.Override()
    public void onOpenInPlaces(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onRemoveRequest() {
    }
}