package org.wikipedia.feed.news;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.wikipedia.databinding.ViewHorizontalScrollListItemCardBinding;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ImageZoomHelper;
import org.wikipedia.views.WikiCardView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/feed/news/NewsItemView;", "Lorg/wikipedia/views/WikiCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "imageView", "getImageView", "()Lerror/NonExistentClass;", "newsItem", "Lorg/wikipedia/feed/news/NewsItem;", "getNewsItem", "()Lorg/wikipedia/feed/news/NewsItem;", "setNewsItem", "(Lorg/wikipedia/feed/news/NewsItem;)V", "removeImageCaption", "", "text", "Landroid/text/Spanned;", "setContents", "", "app.lib"})
public final class NewsItemView extends org.wikipedia.views.WikiCardView {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.news.NewsItem newsItem;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object imageView = null;
    
    public NewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.news.NewsItem getNewsItem() {
        return null;
    }
    
    public final void setNewsItem(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.news.NewsItem p0) {
    }
    
    private final java.lang.CharSequence removeImageCaption(android.text.Spanned text) {
        return null;
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.news.NewsItem newsItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getImageView() {
        return null;
    }
}