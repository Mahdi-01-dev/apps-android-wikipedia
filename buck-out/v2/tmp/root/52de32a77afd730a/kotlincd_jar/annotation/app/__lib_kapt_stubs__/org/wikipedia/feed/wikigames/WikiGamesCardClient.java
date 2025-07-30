package org.wikipedia.feed.wikigames;

import android.content.Context;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.FeedContentType;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.games.onthisday.OnThisDayGameViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J(\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/feed/wikigames/WikiGamesCardClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "()V", "cancel", "", "request", "context", "Landroid/content/Context;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "app.lib"})
public final class WikiGamesCardClient implements org.wikipedia.feed.dataclient.FeedClient {
    
    public WikiGamesCardClient() {
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
}