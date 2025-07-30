package org.wikipedia.page;

import kotlinx.serialization.Serializable;
import org.wikipedia.history.HistoryEntry;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/page/PageBackStackItem;", "", "title", "Lorg/wikipedia/page/PageTitle;", "historyEntry", "Lorg/wikipedia/history/HistoryEntry;", "scrollY", "", "(Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/history/HistoryEntry;I)V", "getHistoryEntry", "()Lorg/wikipedia/history/HistoryEntry;", "setHistoryEntry", "(Lorg/wikipedia/history/HistoryEntry;)V", "getScrollY", "()I", "setScrollY", "(I)V", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "setTitle", "(Lorg/wikipedia/page/PageTitle;)V", "app.lib"})
public final class PageBackStackItem {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle title;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.history.HistoryEntry historyEntry;
    private int scrollY;
    
    public PageBackStackItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry historyEntry, int scrollY) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.history.HistoryEntry getHistoryEntry() {
        return null;
    }
    
    public final void setHistoryEntry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry p0) {
    }
    
    public final int getScrollY() {
        return 0;
    }
    
    public final void setScrollY(int p0) {
    }
}