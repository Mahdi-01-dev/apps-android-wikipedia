package org.wikipedia.feed.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewCardNewsBinding;
import org.wikipedia.feed.view.DefaultFeedCardView;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.ImageZoomHelper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/feed/news/NewsCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/news/NewsCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/news/NewsCard;", "setCard", "(Lorg/wikipedia/feed/news/NewsCard;)V", "isSnapHelperAttached", "", "prevImageDownloadSettings", "header", "", "setUpIndicatorDots", "setUpRecycler", "setUpSnapHelper", "Callback", "NewsAdapter", "NewsItemHolder", "app.lib"})
public final class NewsCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.news.NewsCard> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private boolean prevImageDownloadSettings;
    private boolean isSnapHelperAttached = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.news.NewsCard card;
    
    public NewsCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final void setUpIndicatorDots(org.wikipedia.feed.news.NewsCard card) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.news.NewsCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.news.NewsCard value) {
    }
    
    private final void setUpRecycler(org.wikipedia.feed.news.NewsCard card) {
    }
    
    private final void setUpSnapHelper() {
    }
    
    private final void header(org.wikipedia.feed.news.NewsCard card) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/feed/news/NewsCardView$Callback;", "", "onNewsItemSelected", "", "card", "Lorg/wikipedia/feed/news/NewsCard;", "view", "Lorg/wikipedia/feed/news/NewsItemView;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onNewsItemSelected(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCard card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItemView view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/news/NewsCardView$NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/feed/news/NewsCardView$NewsItemHolder;", "card", "Lorg/wikipedia/feed/news/NewsCard;", "(Lorg/wikipedia/feed/news/NewsCardView;Lorg/wikipedia/feed/news/NewsCard;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class NewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.feed.news.NewsCardView.NewsItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.news.NewsCard card = null;
        
        public NewsAdapter(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCard card) {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.feed.news.NewsCardView.NewsItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCardView.NewsItemHolder holder, int position) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCardView.NewsItemHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCardView.NewsItemHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/feed/news/NewsCardView$NewsItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "newsItemView", "Lorg/wikipedia/feed/news/NewsItemView;", "(Lorg/wikipedia/feed/news/NewsItemView;)V", "view", "getView", "()Lorg/wikipedia/feed/news/NewsItemView;", "bindItem", "", "newsItem", "Lorg/wikipedia/feed/news/NewsItem;", "app.lib"})
    static final class NewsItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.news.NewsItemView newsItemView = null;
        
        public NewsItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItemView newsItemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItem newsItem) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.news.NewsItemView getView() {
            return null;
        }
    }
}