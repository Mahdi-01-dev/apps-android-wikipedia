package org.wikipedia.feed.view;

import org.wikipedia.feed.model.Card;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u0004\u0018\u00018\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/view/FeedCardView;", "T", "Lorg/wikipedia/feed/model/Card;", "", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/model/Card;", "setCard", "(Lorg/wikipedia/feed/model/Card;)V", "app.lib"})
public abstract interface FeedCardView<T extends org.wikipedia.feed.model.Card> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract T getCard();
    
    public abstract void setCard(@org.jetbrains.annotations.Nullable()
    T p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.feed.view.FeedAdapter.Callback getCallback();
    
    public abstract void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback p0);
}