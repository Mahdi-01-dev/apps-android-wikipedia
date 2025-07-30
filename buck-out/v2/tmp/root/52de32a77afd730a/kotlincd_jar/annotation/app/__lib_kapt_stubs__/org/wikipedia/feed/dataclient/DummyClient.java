package org.wikipedia.feed.dataclient;

import android.content.Context;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.model.Card;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J(\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/feed/dataclient/DummyClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "()V", "cancel", "", "getNewCard", "Lorg/wikipedia/feed/model/Card;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "request", "context", "Landroid/content/Context;", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "app.lib"})
public abstract class DummyClient implements org.wikipedia.feed.dataclient.FeedClient {
    
    public DummyClient() {
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
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.feed.model.Card getNewCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki);
}