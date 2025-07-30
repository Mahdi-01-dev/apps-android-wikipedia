package org.wikipedia.feed.random;

import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.featured.FeaturedArticleCard;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/random/RandomCard;", "Lorg/wikipedia/feed/featured/FeaturedArticleCard;", "page", "Lorg/wikipedia/dataclient/page/PageSummary;", "age", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/page/PageSummary;ILorg/wikipedia/dataclient/WikiSite;)V", "footerActionText", "", "historyEntrySource", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class RandomCard extends org.wikipedia.feed.featured.FeaturedArticleCard {
    
    public RandomCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary page, int age, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super(null, 0, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String footerActionText() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    public int historyEntrySource() {
        return 0;
    }
}