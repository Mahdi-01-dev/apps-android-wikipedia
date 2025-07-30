package org.wikipedia.feed.suggestededits;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayoutMediator;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewSuggestedEditsCardBinding;
import org.wikipedia.feed.view.CardFooterView;
import org.wikipedia.feed.view.DefaultFeedCardView;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.views.PositionAwareFragmentStateAdapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "setCard", "(Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;)V", "header", "", "onFooterClicked", "updateContents", "Callback", "SECardsPagerAdapter", "app.lib"})
public final class SuggestedEditsCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.suggestededits.SuggestedEditsCard> implements org.wikipedia.feed.view.CardFooterView.Callback {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.suggestededits.SuggestedEditsCard card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public SuggestedEditsCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.suggestededits.SuggestedEditsCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.suggestededits.SuggestedEditsCard value) {
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
    public void onFooterClicked() {
    }
    
    private final void updateContents(org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
    }
    
    private final void header(org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView$Callback;", "", "onSeCardFooterClicked", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSeCardFooterClicked();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView$SECardsPagerAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "card", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "(Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView;Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app.lib"})
    final class SECardsPagerAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.suggestededits.SuggestedEditsCard card = null;
        
        public SECardsPagerAdapter(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}