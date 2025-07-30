package org.wikipedia.feed.onthisday;

import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.L10nUtil;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0007H\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u0007R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "event", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "(Lorg/wikipedia/feed/onthisday/OnThisDay$Event;Lorg/wikipedia/dataclient/WikiSite;I)V", "getAge", "()I", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "date", "Ljava/util/Calendar;", "getEvent", "()Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "dismissHashCode", "footerActionText", "", "pages", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "subtitle", "text", "", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "year", "app.lib"})
public final class OnThisDayCard extends org.wikipedia.feed.model.WikiSiteCard {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.onthisday.OnThisDay.Event event = null;
    private final int age = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Calendar date = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public OnThisDayCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.onthisday.OnThisDay.Event event, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.onthisday.OnThisDay.Event getEvent() {
        return null;
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String subtitle() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerActionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence text() {
        return null;
    }
    
    public final int year() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary> pages() {
        return null;
    }
}