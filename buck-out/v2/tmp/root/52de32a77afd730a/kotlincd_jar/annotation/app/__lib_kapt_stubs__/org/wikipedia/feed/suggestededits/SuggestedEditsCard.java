package org.wikipedia.feed.suggestededits;

import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "cardTypes", "", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "(Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;I)V", "getAge", "()I", "getCardTypes", "()Ljava/util/List;", "footerActionText", "", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class SuggestedEditsCard extends org.wikipedia.feed.model.WikiSiteCard {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.descriptions.DescriptionEditActivity.Action> cardTypes = null;
    private final int age = 0;
    
    public SuggestedEditsCard(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.descriptions.DescriptionEditActivity.Action> cardTypes, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.descriptions.DescriptionEditActivity.Action> getCardTypes() {
        return null;
    }
    
    public final int getAge() {
        return 0;
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