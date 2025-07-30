package org.wikipedia.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewListCardBinding;
import org.wikipedia.feed.model.Card;
import org.wikipedia.views.DrawableItemDecoration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001!B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001fH\u0004J\b\u0010 \u001a\u00020\u001dH\u0004R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/feed/view/ListCardView;", "T", "Lorg/wikipedia/feed/model/Card;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "footerView", "getFooterView", "()Lerror/NonExistentClass;", "headerView", "getHeaderView", "largeHeaderContainer", "getLargeHeaderContainer", "largeHeaderView", "getLargeHeaderView", "layoutDirectionView", "getLayoutDirectionView", "set", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "update", "Callback", "app.lib"})
public abstract class ListCardView<T extends org.wikipedia.feed.model.Card> extends org.wikipedia.feed.view.DefaultFeedCardView<T> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public ListCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
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
    
    protected final void set(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    protected final void update() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Object getHeaderView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Object getFooterView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Object getLargeHeaderContainer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Object getLargeHeaderView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Object getLayoutDirectionView() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/view/ListCardView$Callback;", "", "onFooterClick", "", "card", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onFooterClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card);
    }
}