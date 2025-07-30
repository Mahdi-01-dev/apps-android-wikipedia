package org.wikipedia.feed.becauseyouread;

import android.content.Context;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/feed/becauseyouread/BecauseYouReadClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "clientJob", "Lkotlinx/coroutines/Job;", "cancel", "", "request", "context", "Landroid/content/Context;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "toBecauseYouReadCard", "Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCard;", "results", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "pageSummary", "wikiSite", "app.lib"})
public final class BecauseYouReadClient implements org.wikipedia.feed.dataclient.FeedClient {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    
    public BecauseYouReadClient(@org.jetbrains.annotations.NotNull()
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
    
    private final org.wikipedia.feed.becauseyouread.BecauseYouReadCard toBecauseYouReadCard(java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> results, org.wikipedia.dataclient.page.PageSummary pageSummary, org.wikipedia.dataclient.WikiSite wikiSite) {
        return null;
    }
}