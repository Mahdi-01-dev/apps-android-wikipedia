package org.wikipedia.feed.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.wikipedia.feed.FeedCoordinatorBase;
import org.wikipedia.feed.accessibility.AccessibilityCard;
import org.wikipedia.feed.announcement.AnnouncementCardView;
import org.wikipedia.feed.dayheader.DayHeaderCardView;
import org.wikipedia.feed.image.FeaturedImageCardView;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.news.NewsCardView;
import org.wikipedia.feed.offline.OfflineCard;
import org.wikipedia.feed.offline.OfflineCardView;
import org.wikipedia.feed.random.RandomCardView;
import org.wikipedia.feed.searchbar.SearchCardView;
import org.wikipedia.feed.suggestededits.SuggestedEditsCardView;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.views.DefaultRecyclerAdapter;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\'B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001d\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001e\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010%\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016J\u0016\u0010&\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/wikipedia/feed/view/FeedAdapter;", "T", "Landroid/view/View;", "Lorg/wikipedia/views/DefaultRecyclerAdapter;", "Lorg/wikipedia/feed/model/Card;", "coordinator", "Lorg/wikipedia/feed/FeedCoordinatorBase;", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "(Lorg/wikipedia/feed/FeedCoordinatorBase;Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "feedView", "Lorg/wikipedia/feed/view/FeedView;", "lastCardReloadTrigger", "adjustDayHeaderView", "", "view", "Lorg/wikipedia/feed/dayheader/DayHeaderCardView;", "adjustSearchView", "Lorg/wikipedia/feed/searchbar/SearchCardView;", "getItemViewType", "", "position", "newView", "context", "Landroid/content/Context;", "viewType", "(Landroid/content/Context;I)Landroid/view/View;", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onDetachedFromRecyclerView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Callback", "app.lib"})
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
public final class FeedAdapter<T extends android.view.View> extends org.wikipedia.views.DefaultRecyclerAdapter<org.wikipedia.feed.model.Card, T> {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.FeedCoordinatorBase coordinator = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.feed.view.FeedAdapter.Callback callback = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedView feedView;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.model.Card lastCardReloadTrigger;
    
    public FeedAdapter(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.FeedCoordinatorBase coordinator, @org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback callback) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.views.DefaultViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.DefaultViewHolder<T> holder, int position) {
    }
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.DefaultViewHolder<T> holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.DefaultViewHolder<T> holder) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final T newView(android.content.Context context, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void adjustSearchView(org.wikipedia.feed.searchbar.SearchCardView view) {
    }
    
    private final void adjustDayHeaderView(org.wikipedia.feed.dayheader.DayHeaderCardView view) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "Lorg/wikipedia/feed/view/CardHeaderView$Callback;", "Lorg/wikipedia/feed/image/FeaturedImageCardView$Callback;", "Lorg/wikipedia/feed/searchbar/SearchCardView$Callback;", "Lorg/wikipedia/feed/news/NewsCardView$Callback;", "Lorg/wikipedia/feed/announcement/AnnouncementCardView$Callback;", "Lorg/wikipedia/feed/random/RandomCardView$Callback;", "Lorg/wikipedia/feed/view/ListCardView$Callback;", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView$Callback;", "onError", "", "t", "", "onRequestMore", "onRetryFromOffline", "app.lib"})
    public static abstract interface Callback extends org.wikipedia.feed.view.ListCardItemView.Callback, org.wikipedia.feed.view.CardHeaderView.Callback, org.wikipedia.feed.image.FeaturedImageCardView.Callback, org.wikipedia.feed.searchbar.SearchCardView.Callback, org.wikipedia.feed.news.NewsCardView.Callback, org.wikipedia.feed.announcement.AnnouncementCardView.Callback, org.wikipedia.feed.random.RandomCardView.Callback, org.wikipedia.feed.view.ListCardView.Callback, org.wikipedia.feed.suggestededits.SuggestedEditsCardView.Callback {
        
        public abstract void onRequestMore();
        
        public abstract void onRetryFromOffline();
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable t);
    }
}