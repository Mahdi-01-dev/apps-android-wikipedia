package org.wikipedia.feed.aggregated;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.image.FeaturedImage;
import org.wikipedia.feed.news.NewsItem;
import org.wikipedia.feed.onthisday.OnThisDay;
import org.wikipedia.feed.topread.TopRead;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "", "tfa", "Lorg/wikipedia/dataclient/page/PageSummary;", "news", "", "Lorg/wikipedia/feed/news/NewsItem;", "topRead", "Lorg/wikipedia/feed/topread/TopRead;", "potd", "Lorg/wikipedia/feed/image/FeaturedImage;", "onthisday", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "(Lorg/wikipedia/dataclient/page/PageSummary;Ljava/util/List;Lorg/wikipedia/feed/topread/TopRead;Lorg/wikipedia/feed/image/FeaturedImage;Ljava/util/List;)V", "getNews", "()Ljava/util/List;", "getOnthisday", "getPotd$annotations", "()V", "getPotd", "()Lorg/wikipedia/feed/image/FeaturedImage;", "randomOnThisDayEvent", "getRandomOnThisDayEvent$annotations", "getRandomOnThisDayEvent", "()Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "setRandomOnThisDayEvent", "(Lorg/wikipedia/feed/onthisday/OnThisDay$Event;)V", "getTfa", "()Lorg/wikipedia/dataclient/page/PageSummary;", "getTopRead$annotations", "getTopRead", "()Lorg/wikipedia/feed/topread/TopRead;", "app.lib"})
public final class AggregatedFeedContent {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.page.PageSummary tfa = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.feed.news.NewsItem> news = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.feed.topread.TopRead topRead = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.feed.image.FeaturedImage potd = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> onthisday = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.onthisday.OnThisDay.Event randomOnThisDayEvent;
    
    public AggregatedFeedContent(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary tfa, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.feed.news.NewsItem> news, @org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.topread.TopRead topRead, @org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.image.FeaturedImage potd, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> onthisday) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary getTfa() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.feed.news.NewsItem> getNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.topread.TopRead getTopRead() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "mostread")
    @java.lang.Deprecated()
    public static void getTopRead$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.image.FeaturedImage getPotd() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "image")
    @java.lang.Deprecated()
    public static void getPotd$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> getOnthisday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.onthisday.OnThisDay.Event getRandomOnThisDayEvent() {
        return null;
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getRandomOnThisDayEvent$annotations() {
    }
    
    public final void setRandomOnThisDayEvent(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.onthisday.OnThisDay.Event p0) {
    }
    
    public AggregatedFeedContent() {
        super();
    }
}