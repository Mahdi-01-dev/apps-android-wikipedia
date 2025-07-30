package org.wikipedia.feed.searchbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewSearchBarBinding;
import org.wikipedia.feed.view.DefaultFeedCardView;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/searchbar/SearchCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/searchbar/SearchCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Callback", "app.lib"})
public final class SearchCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.searchbar.SearchCard> {
    
    public SearchCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/searchbar/SearchCardView$Callback;", "", "onSearchRequested", "", "view", "Landroid/view/View;", "onVoiceSearchRequested", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSearchRequested(@org.jetbrains.annotations.NotNull()
        android.view.View view);
        
        public abstract void onVoiceSearchRequested();
    }
}