package org.wikipedia.feed.becauseyouread;

import android.net.Uri;
import org.wikipedia.R;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.ListCard;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0003\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCard;", "Lorg/wikipedia/feed/model/ListCard;", "Lorg/wikipedia/feed/becauseyouread/BecauseYouReadItemCard;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "itemCards", "", "(Lorg/wikipedia/page/PageTitle;Ljava/util/List;)V", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "dismissHashCode", "", "extract", "", "image", "Landroid/net/Uri;", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class BecauseYouReadCard extends org.wikipedia.feed.model.ListCard<org.wikipedia.feed.becauseyouread.BecauseYouReadItemCard> {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    
    public BecauseYouReadCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.feed.becauseyouread.BecauseYouReadItemCard> itemCards) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.net.Uri image() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String extract() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String pageTitle() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
}