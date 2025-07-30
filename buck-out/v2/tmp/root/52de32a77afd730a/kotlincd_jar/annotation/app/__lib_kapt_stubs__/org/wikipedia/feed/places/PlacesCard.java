package org.wikipedia.feed.places;

import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.NearbyPage;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/places/PlacesCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "nearbyPage", "Lorg/wikipedia/dataclient/page/NearbyPage;", "(Lorg/wikipedia/dataclient/WikiSite;ILorg/wikipedia/dataclient/page/NearbyPage;)V", "getAge", "()I", "getNearbyPage", "()Lorg/wikipedia/dataclient/page/NearbyPage;", "footerActionText", "", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class PlacesCard extends org.wikipedia.feed.model.WikiSiteCard {
    private final int age = 0;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.page.NearbyPage nearbyPage = null;
    
    public PlacesCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.NearbyPage nearbyPage) {
        super(null);
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.NearbyPage getNearbyPage() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String subtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerActionText() {
        return null;
    }
}