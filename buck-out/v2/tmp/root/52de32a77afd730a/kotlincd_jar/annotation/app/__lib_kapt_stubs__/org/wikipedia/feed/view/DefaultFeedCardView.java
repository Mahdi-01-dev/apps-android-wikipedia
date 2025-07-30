package org.wikipedia.feed.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.model.Card;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/feed/view/DefaultFeedCardView;", "T", "Lorg/wikipedia/feed/model/Card;", "Landroid/widget/LinearLayout;", "Lorg/wikipedia/feed/view/FeedCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/model/Card;", "setCard", "(Lorg/wikipedia/feed/model/Card;)V", "Lorg/wikipedia/feed/model/Card;", "setLayoutDirectionByWikiSite", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "rootView", "Landroid/view/View;", "app.lib"})
public abstract class DefaultFeedCardView<T extends org.wikipedia.feed.model.Card> extends android.widget.LinearLayout implements org.wikipedia.feed.view.FeedCardView<T> {
    @org.jetbrains.annotations.Nullable()
    private T card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public DefaultFeedCardView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public T getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback p0) {
    }
    
    protected final void setLayoutDirectionByWikiSite(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    android.view.View rootView) {
    }
}