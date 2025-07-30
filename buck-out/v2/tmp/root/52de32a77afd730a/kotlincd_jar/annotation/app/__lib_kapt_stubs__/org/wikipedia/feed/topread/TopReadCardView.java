package org.wikipedia.feed.topread;

import android.content.Context;
import org.wikipedia.feed.view.CardFooterView;
import org.wikipedia.feed.view.ListCardItemView;
import org.wikipedia.feed.view.ListCardRecyclerAdapter;
import org.wikipedia.feed.view.ListCardView;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadCardView;", "Lorg/wikipedia/feed/view/ListCardView;", "Lorg/wikipedia/feed/topread/TopReadListCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "card", "getCard", "()Lorg/wikipedia/feed/topread/TopReadListCard;", "setCard", "(Lorg/wikipedia/feed/topread/TopReadListCard;)V", "footer", "", "getFooterCallback", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "header", "Companion", "RecyclerAdapter", "app.lib"})
public final class TopReadCardView extends org.wikipedia.feed.view.ListCardView<org.wikipedia.feed.topread.TopReadListCard> {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.topread.TopReadListCard card;
    private static final int EVENTS_SHOWN = 5;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.topread.TopReadCardView.Companion Companion = null;
    
    public TopReadCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.topread.TopReadListCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.topread.TopReadListCard value) {
    }
    
    private final void footer(org.wikipedia.feed.topread.TopReadListCard card) {
    }
    
    private final void header(org.wikipedia.feed.topread.TopReadListCard card) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardFooterView.Callback getFooterCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.topread.TopReadListCard card) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadCardView$Companion;", "", "()V", "EVENTS_SHOWN", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadCardView$RecyclerAdapter;", "Lorg/wikipedia/feed/view/ListCardRecyclerAdapter;", "Lorg/wikipedia/feed/topread/TopReadItemCard;", "items", "", "(Lorg/wikipedia/feed/topread/TopReadCardView;Ljava/util/List;)V", "callback", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "onBindViewHolder", "", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/feed/view/ListCardItemView;", "position", "", "app.lib"})
    final class RecyclerAdapter extends org.wikipedia.feed.view.ListCardRecyclerAdapter<org.wikipedia.feed.topread.TopReadItemCard> {
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.topread.TopReadItemCard> items) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        protected org.wikipedia.feed.view.ListCardItemView.Callback callback() {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> holder, int position) {
        }
    }
}