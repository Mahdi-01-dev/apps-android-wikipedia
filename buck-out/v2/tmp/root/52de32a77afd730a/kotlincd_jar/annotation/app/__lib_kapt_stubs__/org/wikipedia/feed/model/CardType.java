package org.wikipedia.feed.model;

import android.content.Context;
import org.wikipedia.feed.FeedContentType;
import org.wikipedia.feed.accessibility.AccessibilityCardView;
import org.wikipedia.feed.announcement.AnnouncementCardView;
import org.wikipedia.feed.becauseyouread.BecauseYouReadCardView;
import org.wikipedia.feed.dayheader.DayHeaderCardView;
import org.wikipedia.feed.featured.FeaturedArticleCardView;
import org.wikipedia.feed.image.FeaturedImageCardView;
import org.wikipedia.feed.mainpage.MainPageCardView;
import org.wikipedia.feed.news.NewsCardView;
import org.wikipedia.feed.offline.OfflineCardView;
import org.wikipedia.feed.onthisday.OnThisDayCardView;
import org.wikipedia.feed.places.PlacesCardView;
import org.wikipedia.feed.progress.ProgressCardView;
import org.wikipedia.feed.random.RandomCardView;
import org.wikipedia.feed.searchbar.SearchCardView;
import org.wikipedia.feed.suggestededits.SuggestedEditsCardView;
import org.wikipedia.feed.topread.TopReadCardView;
import org.wikipedia.feed.view.FeedCardView;
import org.wikipedia.feed.wikigames.WikiGamesCardView;
import org.wikipedia.model.EnumCode;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001&B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/feed/model/CardType;", "", "Lorg/wikipedia/model/EnumCode;", "code", "", "contentType", "Lorg/wikipedia/feed/FeedContentType;", "(Ljava/lang/String;IILorg/wikipedia/feed/FeedContentType;)V", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "SEARCH_BAR", "BECAUSE_YOU_READ_LIST", "TOP_READ_LIST", "FEATURED_ARTICLE", "RANDOM", "MAIN_PAGE", "NEWS_LIST", "FEATURED_IMAGE", "BECAUSE_YOU_READ_ITEM", "MOST_READ_ITEM", "NEWS_ITEM", "NEWS_ITEM_LINK", "ANNOUNCEMENT", "SURVEY", "FUNDRAISING", "ONBOARDING_OFFLINE", "ON_THIS_DAY", "ONBOARDING_CUSTOMIZE_FEED", "SUGGESTED_EDITS", "ACCESSIBILITY", "PLACES", "WIKI_GAMES", "YEAR_IN_REVIEW_ANNOUNCEMENT", "DAY_HEADER", "OFFLINE", "PROGRESS", "Companion", "app.lib"})
public enum CardType implements org.wikipedia.model.EnumCode {
    /*public static final*/ SEARCH_BAR /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$SEARCH_BAR;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) SEARCH_BAR(0, null){
    
    SEARCH_BAR() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ BECAUSE_YOU_READ_LIST /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$BECAUSE_YOU_READ_LIST;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) BECAUSE_YOU_READ_LIST(0, null){
    
    BECAUSE_YOU_READ_LIST() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ TOP_READ_LIST /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$TOP_READ_LIST;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) TOP_READ_LIST(0, null){
    
    TOP_READ_LIST() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ FEATURED_ARTICLE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$FEATURED_ARTICLE;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) FEATURED_ARTICLE(0, null){
    
    FEATURED_ARTICLE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ RANDOM /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$RANDOM;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) RANDOM(0, null){
    
    RANDOM() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ MAIN_PAGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$MAIN_PAGE;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) MAIN_PAGE(0, null){
    
    MAIN_PAGE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ NEWS_LIST /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$NEWS_LIST;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) NEWS_LIST(0, null){
    
    NEWS_LIST() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ FEATURED_IMAGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$FEATURED_IMAGE;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) FEATURED_IMAGE(0, null){
    
    FEATURED_IMAGE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ BECAUSE_YOU_READ_ITEM /* = new BECAUSE_YOU_READ_ITEM(0, null) */,
    /*public static final*/ MOST_READ_ITEM /* = new MOST_READ_ITEM(0, null) */,
    /*public static final*/ NEWS_ITEM /* = new NEWS_ITEM(0, null) */,
    /*public static final*/ NEWS_ITEM_LINK /* = new NEWS_ITEM_LINK(0, null) */,
    /*public static final*/ ANNOUNCEMENT /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$ANNOUNCEMENT;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) ANNOUNCEMENT(0, null){
    
    ANNOUNCEMENT() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ SURVEY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$SURVEY;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) SURVEY(0, null){
    
    SURVEY() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ FUNDRAISING /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$FUNDRAISING;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) FUNDRAISING(0, null){
    
    FUNDRAISING() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ ONBOARDING_OFFLINE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$ONBOARDING_OFFLINE;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) ONBOARDING_OFFLINE(0, null){
    
    ONBOARDING_OFFLINE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ ON_THIS_DAY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$ON_THIS_DAY;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) ON_THIS_DAY(0, null){
    
    ON_THIS_DAY() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ ONBOARDING_CUSTOMIZE_FEED /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$ONBOARDING_CUSTOMIZE_FEED;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) ONBOARDING_CUSTOMIZE_FEED(0, null){
    
    ONBOARDING_CUSTOMIZE_FEED() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ SUGGESTED_EDITS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$SUGGESTED_EDITS;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) SUGGESTED_EDITS(0, null){
    
    SUGGESTED_EDITS() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ ACCESSIBILITY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$ACCESSIBILITY;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) ACCESSIBILITY(0, null){
    
    ACCESSIBILITY() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ PLACES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$PLACES;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) PLACES(0, null){
    
    PLACES() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ WIKI_GAMES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$WIKI_GAMES;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) WIKI_GAMES(0, null){
    
    WIKI_GAMES() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ YEAR_IN_REVIEW_ANNOUNCEMENT /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$YEAR_IN_REVIEW_ANNOUNCEMENT;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) YEAR_IN_REVIEW_ANNOUNCEMENT(0, null){
    
    YEAR_IN_REVIEW_ANNOUNCEMENT() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ DAY_HEADER /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$DAY_HEADER;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) DAY_HEADER(0, null){
    
    DAY_HEADER() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ OFFLINE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$OFFLINE;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) OFFLINE(0, null){
    
    OFFLINE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */,
    /*public static final*/ PROGRESS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/model/CardType$PROGRESS;", "Lorg/wikipedia/feed/model/CardType;", "newView", "Lorg/wikipedia/feed/view/FeedCardView;", "ctx", "Landroid/content/Context;", "app.lib"}) PROGRESS(0, null){
    
    PROGRESS() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        return null;
    }
} */;
    private final int code = 0;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.feed.FeedContentType contentType = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.model.CardType.Companion Companion = null;
    
    CardType(int code, org.wikipedia.feed.FeedContentType contentType) {
    }
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.view.FeedCardView<?> newView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.FeedContentType contentType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.feed.model.CardType> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/model/CardType$Companion;", "", "()V", "of", "Lorg/wikipedia/feed/model/CardType;", "code", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.model.CardType of(int code) {
            return null;
        }
    }
}