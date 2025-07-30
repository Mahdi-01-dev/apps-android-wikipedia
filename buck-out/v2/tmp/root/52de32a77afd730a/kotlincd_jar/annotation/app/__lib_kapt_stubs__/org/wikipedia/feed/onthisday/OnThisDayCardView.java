package org.wikipedia.feed.onthisday;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewCardOnThisDayBinding;
import org.wikipedia.feed.view.CardFooterView;
import org.wikipedia.feed.view.DefaultFeedCardView;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.TransitionUtil;
import org.wikipedia.views.ImageZoomHelper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/onthisday/OnThisDayCard;", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "age", "", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/onthisday/OnThisDayCard;", "setCard", "(Lorg/wikipedia/feed/onthisday/OnThisDayCard;)V", "footer", "", "header", "onCardClicked", "view", "Landroid/view/View;", "onFooterClicked", "updateOtdEventUI", "app.lib"})
public final class OnThisDayCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.onthisday.OnThisDayCard> implements org.wikipedia.feed.view.CardFooterView.Callback {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private int age = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.onthisday.OnThisDayCard card;
    
    public OnThisDayCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void onFooterClicked() {
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
    public org.wikipedia.feed.onthisday.OnThisDayCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.onthisday.OnThisDayCard value) {
    }
    
    private final void header(org.wikipedia.feed.onthisday.OnThisDayCard card) {
    }
    
    private final void footer(org.wikipedia.feed.onthisday.OnThisDayCard card) {
    }
    
    private final void onCardClicked(android.view.View view) {
    }
    
    private final void updateOtdEventUI(org.wikipedia.feed.onthisday.OnThisDayCard card) {
    }
}