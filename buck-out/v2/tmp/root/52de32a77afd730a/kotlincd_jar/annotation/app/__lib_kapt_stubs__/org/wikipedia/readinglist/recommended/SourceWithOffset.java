package org.wikipedia.readinglist.recommended;

import kotlinx.serialization.Serializable;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.NewRecommendedReadingListEvent;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.RecommendedPage;
import org.wikipedia.settings.Prefs;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/recommended/SourceWithOffset;", "", "title", "", "language", "offset", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getLanguage", "()Ljava/lang/String;", "getOffset", "()I", "setOffset", "(I)V", "getTitle", "app.lib"})
public final class SourceWithOffset {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    private int offset;
    
    public SourceWithOffset(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String language, int offset) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final void setOffset(int p0) {
    }
}