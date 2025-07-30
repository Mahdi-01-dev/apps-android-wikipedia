package org.wikipedia.feed.news;

import android.net.Uri;
import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.Serializable;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.util.ImageUrlUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/news/NewsItem;", "Landroid/os/Parcelable;", "story", "", "links", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "(Ljava/lang/String;Ljava/util/List;)V", "getLinks", "()Ljava/util/List;", "getStory", "()Ljava/lang/String;", "getFirstImageUri", "Landroid/net/Uri;", "linkCards", "Lorg/wikipedia/feed/news/NewsLinkCard;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "thumb", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class NewsItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String story = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.page.PageSummary> links = null;
    
    public NewsItem(@org.jetbrains.annotations.NotNull()
    java.lang.String story, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> links) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.feed.news.NewsLinkCard> linkCards(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri thumb() {
        return null;
    }
    
    private final android.net.Uri getFirstImageUri(java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> links) {
        return null;
    }
    
    public NewsItem() {
        super();
    }
}