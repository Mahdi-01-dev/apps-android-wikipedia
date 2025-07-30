package org.wikipedia.feed.featured;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import org.wikipedia.databinding.ViewCardFeaturedArticleBinding;
import org.wikipedia.feed.view.CardFooterView;
import org.wikipedia.feed.view.DefaultFeedCardView;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.views.ImageZoomHelper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/feed/featured/FeaturedArticleCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/featured/FeaturedArticleCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/featured/FeaturedArticleCard;", "setCard", "(Lorg/wikipedia/feed/featured/FeaturedArticleCard;)V", "footerCallback", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "getFooterCallback", "()Lorg/wikipedia/feed/view/CardFooterView$Callback;", "articleSubtitle", "", "", "articleTitle", "extract", "footer", "header", "image", "uri", "Landroid/net/Uri;", "Companion", "app.lib"})
@kotlin.Suppress(names = {"LeakingThis"})
public class FeaturedArticleCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.featured.FeaturedArticleCard> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.featured.FeaturedArticleCard card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    public static final int EXTRACT_MAX_LINES = 8;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.featured.FeaturedArticleCardView.Companion Companion = null;
    
    public FeaturedArticleCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.featured.FeaturedArticleCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.featured.FeaturedArticleCard value) {
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
    
    private final void articleTitle(java.lang.String articleTitle) {
    }
    
    private final void articleSubtitle(java.lang.String articleSubtitle) {
    }
    
    private final void extract(java.lang.String extract) {
    }
    
    private final void header(org.wikipedia.feed.featured.FeaturedArticleCard card) {
    }
    
    private final void footer(org.wikipedia.feed.featured.FeaturedArticleCard card) {
    }
    
    private final void image(android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.view.CardFooterView.Callback getFooterCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/featured/FeaturedArticleCardView$Companion;", "", "()V", "EXTRACT_MAX_LINES", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}