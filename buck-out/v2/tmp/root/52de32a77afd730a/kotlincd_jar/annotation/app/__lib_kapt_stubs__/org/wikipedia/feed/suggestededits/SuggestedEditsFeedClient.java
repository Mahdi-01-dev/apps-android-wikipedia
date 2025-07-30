package org.wikipedia.feed.suggestededits;

import android.content.Context;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.descriptions.DescriptionEditUtil;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.usercontrib.UserContribStats;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsFeedClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "clientJob", "Lkotlinx/coroutines/Job;", "cancel", "", "request", "context", "Landroid/content/Context;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "Companion", "app.lib"})
public final class SuggestedEditsFeedClient implements org.wikipedia.feed.dataclient.FeedClient {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private org.wikipedia.feed.dataclient.FeedClient.Callback cb;
    private int age = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.descriptions.DescriptionEditActivity.Action> cardTypes = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.suggestededits.SuggestedEditsFeedClient.Companion Companion = null;
    
    public SuggestedEditsFeedClient(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @java.lang.Override()
    public void request(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsFeedClient$Companion;", "", "()V", "cardTypes", "", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}