package org.wikipedia.feed.becauseyouread;

import android.content.Context;
import org.wikipedia.feed.view.ListCardItemView;
import org.wikipedia.feed.view.ListCardRecyclerAdapter;
import org.wikipedia.feed.view.ListCardView;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCardView;", "Lorg/wikipedia/feed/view/ListCardView;", "Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "card", "getCard", "()Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCard;", "setCard", "(Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCard;)V", "header", "", "RecyclerAdapter", "app.lib"})
public final class BecauseYouReadCardView extends org.wikipedia.feed.view.ListCardView<org.wikipedia.feed.becauseyouread.BecauseYouReadCard> {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.becauseyouread.BecauseYouReadCard card;
    
    public BecauseYouReadCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.becauseyouread.BecauseYouReadCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.becauseyouread.BecauseYouReadCard value) {
    }
    
    private final void header(org.wikipedia.feed.becauseyouread.BecauseYouReadCard card) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCardView$RecyclerAdapter;", "Lorg/wikipedia/feed/view/ListCardRecyclerAdapter;", "Lorg/wikipedia/feed/becauseyouread/BecauseYouReadItemCard;", "items", "", "(Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCardView;Ljava/util/List;)V", "callback", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "onBindViewHolder", "", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/feed/view/ListCardItemView;", "i", "", "app.lib"})
    final class RecyclerAdapter extends org.wikipedia.feed.view.ListCardRecyclerAdapter<org.wikipedia.feed.becauseyouread.BecauseYouReadItemCard> {
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.becauseyouread.BecauseYouReadItemCard> items) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        protected org.wikipedia.feed.view.ListCardItemView.Callback callback() {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> holder, int i) {
        }
    }
}