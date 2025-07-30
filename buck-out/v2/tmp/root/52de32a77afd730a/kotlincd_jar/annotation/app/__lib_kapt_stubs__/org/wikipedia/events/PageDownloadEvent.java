package org.wikipedia.events;

import org.wikipedia.readinglist.database.ReadingListPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/events/PageDownloadEvent;", "", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Lorg/wikipedia/readinglist/database/ReadingListPage;)V", "getPage", "()Lorg/wikipedia/readinglist/database/ReadingListPage;", "app.lib"})
public final class PageDownloadEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.database.ReadingListPage page = null;
    
    public PageDownloadEvent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.database.ReadingListPage getPage() {
        return null;
    }
}