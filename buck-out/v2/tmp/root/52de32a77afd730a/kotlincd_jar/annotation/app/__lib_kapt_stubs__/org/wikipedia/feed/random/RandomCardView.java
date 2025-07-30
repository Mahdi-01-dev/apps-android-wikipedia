package org.wikipedia.feed.random;

import android.content.Context;
import org.wikipedia.feed.featured.FeaturedArticleCardView;
import org.wikipedia.feed.view.CardFooterView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/random/RandomCardView;", "Lorg/wikipedia/feed/featured/FeaturedArticleCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "footerCallback", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "getFooterCallback", "()Lorg/wikipedia/feed/view/CardFooterView$Callback;", "Callback", "app.lib"})
public final class RandomCardView extends org.wikipedia.feed.featured.FeaturedArticleCardView {
    
    public RandomCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.view.CardFooterView.Callback getFooterCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/random/RandomCardView$Callback;", "", "onRandomClick", "", "view", "Lorg/wikipedia/feed/random/RandomCardView;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onRandomClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.random.RandomCardView view);
    }
}