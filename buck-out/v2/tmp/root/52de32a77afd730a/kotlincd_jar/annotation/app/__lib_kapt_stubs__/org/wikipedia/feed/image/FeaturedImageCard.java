package org.wikipedia.feed.image;

import android.net.Uri;
import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0014J\u0006\u0010\r\u001a\u00020\u000bJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/image/FeaturedImageCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "featuredImage", "Lorg/wikipedia/feed/image/FeaturedImage;", "age", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/feed/image/FeaturedImage;ILorg/wikipedia/dataclient/WikiSite;)V", "baseImage", "description", "", "dismissHashCode", "filename", "image", "Landroid/net/Uri;", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class FeaturedImageCard extends org.wikipedia.feed.model.WikiSiteCard {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.image.FeaturedImage featuredImage = null;
    private final int age = 0;
    
    public FeaturedImageCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImage featuredImage, int age, @org.jetbrains.annotations.NotNull()
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
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.image.FeaturedImage baseImage() {
        return null;
    }
    
    public final int age() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String filename() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String description() {
        return null;
    }
}