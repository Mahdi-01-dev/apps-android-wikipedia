package org.wikipedia.events;

import org.wikipedia.readinglist.database.ReadingListPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/events/ArticleSavedOrDeletedEvent;", "", "isAdded", "", "pages", "", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Z[Lorg/wikipedia/readinglist/database/ReadingListPage;)V", "()Z", "", "getPages", "()Ljava/util/List;", "app.lib"})
public final class ArticleSavedOrDeletedEvent {
    private final boolean isAdded = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages = null;
    
    public ArticleSavedOrDeletedEvent(boolean isAdded, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage... pages) {
        super();
    }
    
    public final boolean isAdded() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPages() {
        return null;
    }
}