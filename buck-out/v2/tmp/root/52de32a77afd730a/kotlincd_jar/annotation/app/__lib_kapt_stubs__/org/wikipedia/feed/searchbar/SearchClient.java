package org.wikipedia.feed.searchbar;

import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.dataclient.DummyClient;
import org.wikipedia.feed.model.Card;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/searchbar/SearchClient;", "Lorg/wikipedia/feed/dataclient/DummyClient;", "()V", "getNewCard", "Lorg/wikipedia/feed/model/Card;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
public final class SearchClient extends org.wikipedia.feed.dataclient.DummyClient {
    
    public SearchClient() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.Card getNewCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
}