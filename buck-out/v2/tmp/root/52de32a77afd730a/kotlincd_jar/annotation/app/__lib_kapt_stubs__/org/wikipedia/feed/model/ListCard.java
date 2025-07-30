package org.wikipedia.feed.model;

import org.wikipedia.dataclient.WikiSite;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/model/ListCard;", "T", "Lorg/wikipedia/feed/model/Card;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "items", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;)V", "app.lib"})
public abstract class ListCard<T extends org.wikipedia.feed.model.Card> extends org.wikipedia.feed.model.WikiSiteCard {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> items = null;
    
    public ListCard(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> items() {
        return null;
    }
}