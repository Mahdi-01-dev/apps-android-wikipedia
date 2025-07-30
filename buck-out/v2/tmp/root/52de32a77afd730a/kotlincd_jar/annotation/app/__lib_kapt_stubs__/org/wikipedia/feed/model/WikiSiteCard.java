package org.wikipedia.feed.model;

import org.wikipedia.dataclient.WikiSite;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/feed/model/WikiSiteCard;", "Lorg/wikipedia/feed/model/Card;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;)V", "getWiki", "()Lorg/wikipedia/dataclient/WikiSite;", "wikiSite", "app.lib"})
public abstract class WikiSiteCard extends org.wikipedia.feed.model.Card {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    
    public WikiSiteCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWiki() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite wikiSite() {
        return null;
    }
}