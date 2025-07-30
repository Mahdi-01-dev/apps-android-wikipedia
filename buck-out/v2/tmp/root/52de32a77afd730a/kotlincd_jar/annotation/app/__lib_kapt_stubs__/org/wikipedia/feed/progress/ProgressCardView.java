package org.wikipedia.feed.progress;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import org.wikipedia.databinding.ViewCardProgressBinding;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.feed.view.FeedCardView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/progress/ProgressCardView;", "Landroid/widget/FrameLayout;", "Lorg/wikipedia/feed/view/FeedCardView;", "Lorg/wikipedia/feed/model/Card;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/model/Card;", "setCard", "(Lorg/wikipedia/feed/model/Card;)V", "app.lib"})
public final class ProgressCardView extends android.widget.FrameLayout implements org.wikipedia.feed.view.FeedCardView<org.wikipedia.feed.model.Card> {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.model.Card card;
    
    public ProgressCardView(@org.jetbrains.annotations.NotNull()
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
    org.wikipedia.feed.view.FeedAdapter.Callback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.model.Card getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.model.Card p0) {
    }
}