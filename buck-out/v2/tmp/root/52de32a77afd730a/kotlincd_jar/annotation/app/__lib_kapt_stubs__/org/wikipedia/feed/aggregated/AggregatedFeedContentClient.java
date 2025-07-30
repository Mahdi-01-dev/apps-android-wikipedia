package org.wikipedia.feed.aggregated;

import android.content.Context;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.FeedContentType;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.feed.featured.FeaturedArticleCard;
import org.wikipedia.feed.image.FeaturedImageCard;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.news.NewsCard;
import org.wikipedia.feed.onthisday.OnThisDayCard;
import org.wikipedia.feed.topread.TopReadListCard;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "", "()V", "aggregatedResponseAge", "", "aggregatedResponses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "clientJob", "Lkotlinx/coroutines/Job;", "getClientJob", "()Lkotlinx/coroutines/Job;", "setClientJob", "(Lkotlinx/coroutines/Job;)V", "invalidate", "", "BaseClient", "FeaturedArticle", "FeaturedImage", "InTheNews", "OnThisDayFeed", "TopReadArticles", "app.lib"})
public final class AggregatedFeedContentClient {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> aggregatedResponses = null;
    private int aggregatedResponseAge = -1;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    
    public AggregatedFeedContentClient() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getClientJob() {
        return null;
    }
    
    public final void setClientJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    public final void invalidate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J:\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J(\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "cancel", "", "getCardFromResponse", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "request", "context", "Landroid/content/Context;", "requestAggregated", "app.lib"})
    public static abstract class BaseClient implements org.wikipedia.feed.dataclient.FeedClient {
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient = null;
        private org.wikipedia.feed.dataclient.FeedClient.Callback cb;
        private org.wikipedia.dataclient.WikiSite wiki;
        private int age = 0;
        
        public BaseClient(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super();
        }
        
        public abstract void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards);
        
        @java.lang.Override()
        public void request(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
        }
        
        @java.lang.Override()
        public void cancel() {
        }
        
        private final void requestAggregated() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$FeaturedArticle;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    public static final class FeaturedArticle extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public FeaturedArticle(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null, null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$FeaturedImage;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    public static final class FeaturedImage extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public FeaturedImage(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null, null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$InTheNews;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    public static final class InTheNews extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public InTheNews(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null, null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$OnThisDayFeed;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    public static final class OnThisDayFeed extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public OnThisDayFeed(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null, null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$TopReadArticles;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    public static final class TopReadArticles extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public TopReadArticles(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null, null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
}