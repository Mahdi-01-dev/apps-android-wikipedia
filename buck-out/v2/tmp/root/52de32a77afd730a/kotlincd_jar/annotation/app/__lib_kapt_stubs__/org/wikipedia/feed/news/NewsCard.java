package org.wikipedia.feed.news;

import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.UtcDate;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.util.L10nUtil;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0006H\u0014J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/feed/news/NewsCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "news", "", "Lorg/wikipedia/feed/news/NewsItem;", "age", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Ljava/util/List;ILorg/wikipedia/dataclient/WikiSite;)V", "date", "Lorg/wikipedia/feed/model/UtcDate;", "dismissHashCode", "title", "", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class NewsCard extends org.wikipedia.feed.model.WikiSiteCard {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.news.NewsItem> news = null;
    private final int age = 0;
    
    public NewsCard(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.feed.news.NewsItem> news, int age, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.model.UtcDate date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.feed.news.NewsItem> news() {
        return null;
    }
}