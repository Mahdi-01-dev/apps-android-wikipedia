package org.wikipedia.feed.view;

import android.view.ViewGroup;
import org.wikipedia.views.DefaultRecyclerAdapter;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH$J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/view/ListCardRecyclerAdapter;", "T", "Lorg/wikipedia/views/DefaultRecyclerAdapter;", "Lorg/wikipedia/feed/view/ListCardItemView;", "items", "", "(Ljava/util/List;)V", "callback", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "onCreateViewHolder", "Lorg/wikipedia/views/DefaultViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onViewAttachedToWindow", "", "holder", "onViewDetachedFromWindow", "app.lib"})
public abstract class ListCardRecyclerAdapter<T extends java.lang.Object> extends org.wikipedia.views.DefaultRecyclerAdapter<T, org.wikipedia.feed.view.ListCardItemView> {
    
    public ListCardRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract org.wikipedia.feed.view.ListCardItemView.Callback callback();
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> holder) {
    }
}