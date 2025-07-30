package org.wikipedia.feed.featured;

import android.net.Uri;
import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\u0005H\u0014J\n\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/feed/featured/FeaturedArticleCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "page", "Lorg/wikipedia/dataclient/page/PageSummary;", "age", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/page/PageSummary;ILorg/wikipedia/dataclient/WikiSite;)V", "articleSubtitle", "", "articleTitle", "dismissHashCode", "extract", "footerActionText", "historyEntry", "Lorg/wikipedia/history/HistoryEntry;", "historyEntrySource", "image", "Landroid/net/Uri;", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public class FeaturedArticleCard extends org.wikipedia.feed.model.WikiSiteCard {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.page.PageSummary page = null;
    private final int age = 0;
    
    public FeaturedArticleCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary page, int age, @org.jetbrains.annotations.NotNull()
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
    public java.lang.String subtitle() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.net.Uri image() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String extract() {
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
    
    public int historyEntrySource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String footerActionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String articleTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String articleSubtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.history.HistoryEntry historyEntry() {
        return null;
    }
}