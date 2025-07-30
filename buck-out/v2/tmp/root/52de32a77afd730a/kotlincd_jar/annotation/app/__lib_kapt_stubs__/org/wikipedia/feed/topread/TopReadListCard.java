package org.wikipedia.feed.topread;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.ListCard;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0014J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadListCard;", "Lorg/wikipedia/feed/model/ListCard;", "Lorg/wikipedia/feed/topread/TopReadItemCard;", "Landroid/os/Parcelable;", "articles", "Lorg/wikipedia/feed/topread/TopRead;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/feed/topread/TopRead;Lorg/wikipedia/dataclient/WikiSite;)V", "getSite", "()Lorg/wikipedia/dataclient/WikiSite;", "dismissHashCode", "", "footerActionText", "", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "Companion", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class TopReadListCard extends org.wikipedia.feed.model.ListCard<org.wikipedia.feed.topread.TopReadItemCard> implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.topread.TopRead articles = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite site = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.topread.TopReadListCard.Companion Companion = null;
    
    public TopReadListCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.topread.TopRead articles, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getSite() {
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
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerActionText() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadListCard$Companion;", "", "()V", "toItems", "", "Lorg/wikipedia/feed/topread/TopReadItemCard;", "articles", "Lorg/wikipedia/dataclient/page/PageSummary;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.feed.topread.TopReadItemCard> toItems(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> articles, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
    }
}