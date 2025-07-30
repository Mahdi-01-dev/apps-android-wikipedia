package org.wikipedia.feed;

import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.feed.accessibility.AccessibilityCardClient;
import org.wikipedia.feed.aggregated.AggregatedFeedContentClient;
import org.wikipedia.feed.becauseyouread.BecauseYouReadClient;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.feed.mainpage.MainPageClient;
import org.wikipedia.feed.places.PlacesFeedClient;
import org.wikipedia.feed.random.RandomClient;
import org.wikipedia.feed.suggestededits.SuggestedEditsFeedClient;
import org.wikipedia.feed.wikigames.WikiGamesCardClient;
import org.wikipedia.model.EnumCode;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u00012B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0003\u001a\u00020\u0004H\u0016J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1\u00a8\u00063"}, d2 = {"Lorg/wikipedia/feed/FeedContentType;", "", "Lorg/wikipedia/model/EnumCode;", "code", "", "titleId", "subtitleId", "isPerLanguage", "", "showInConfig", "(Ljava/lang/String;IIIIZZ)V", "isEnabled", "()Z", "setEnabled", "(Z)V", "langCodesDisabled", "", "", "getLangCodesDisabled", "()Ljava/util/List;", "langCodesSupported", "getLangCodesSupported", "order", "getOrder", "()I", "setOrder", "(I)V", "getShowInConfig", "setShowInConfig", "getSubtitleId", "getTitleId", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "WIKI_GAMES", "FEATURED_ARTICLE", "TOP_READ_ARTICLES", "PLACES", "FEATURED_IMAGE", "BECAUSE_YOU_READ", "NEWS", "ON_THIS_DAY", "RANDOM", "MAIN_PAGE", "SUGGESTED_EDITS", "ACCESSIBILITY", "Companion", "app.lib"})
public enum FeedContentType implements org.wikipedia.model.EnumCode {
    /*public static final*/ WIKI_GAMES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$WIKI_GAMES;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) WIKI_GAMES(0, 0, 0, false, false){
    
    WIKI_GAMES() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ FEATURED_ARTICLE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$FEATURED_ARTICLE;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) FEATURED_ARTICLE(0, 0, 0, false, false){
    
    FEATURED_ARTICLE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ TOP_READ_ARTICLES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$TOP_READ_ARTICLES;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) TOP_READ_ARTICLES(0, 0, 0, false, false){
    
    TOP_READ_ARTICLES() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ PLACES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$PLACES;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) PLACES(0, 0, 0, false, false){
    
    PLACES() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ FEATURED_IMAGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$FEATURED_IMAGE;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) FEATURED_IMAGE(0, 0, 0, false, false){
    
    FEATURED_IMAGE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ BECAUSE_YOU_READ /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$BECAUSE_YOU_READ;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) BECAUSE_YOU_READ(0, 0, 0, false, false){
    
    BECAUSE_YOU_READ() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ NEWS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$NEWS;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) NEWS(0, 0, 0, false, false){
    
    NEWS() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ ON_THIS_DAY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$ON_THIS_DAY;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) ON_THIS_DAY(0, 0, 0, false, false){
    
    ON_THIS_DAY() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ RANDOM /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$RANDOM;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) RANDOM(0, 0, 0, false, false){
    
    RANDOM() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ MAIN_PAGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$MAIN_PAGE;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) MAIN_PAGE(0, 0, 0, false, false){
    
    MAIN_PAGE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ SUGGESTED_EDITS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$SUGGESTED_EDITS;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) SUGGESTED_EDITS(0, 0, 0, false, false){
    
    SUGGESTED_EDITS() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */,
    /*public static final*/ ACCESSIBILITY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$ACCESSIBILITY;", "Lorg/wikipedia/feed/FeedContentType;", "newClient", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "age", "", "app.lib"}) ACCESSIBILITY(0, 0, 0, false, false){
    
    ACCESSIBILITY() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age) {
        return null;
    }
} */;
    private final int code = 0;
    private final int titleId = 0;
    private final int subtitleId = 0;
    private final boolean isPerLanguage = false;
    private boolean showInConfig;
    private int order;
    private boolean isEnabled = true;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> langCodesSupported = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> langCodesDisabled = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.FeedContentType.Companion Companion = null;
    
    FeedContentType(int code, @androidx.annotation.StringRes()
    int titleId, @androidx.annotation.StringRes()
    int subtitleId, boolean isPerLanguage, boolean showInConfig) {
    }
    
    public final int getTitleId() {
        return 0;
    }
    
    public final int getSubtitleId() {
        return 0;
    }
    
    public final boolean isPerLanguage() {
        return false;
    }
    
    public final boolean getShowInConfig() {
        return false;
    }
    
    public final void setShowInConfig(boolean p0) {
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public final void setOrder(int p0) {
    }
    
    public final boolean isEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLangCodesSupported() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLangCodesDisabled() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.feed.dataclient.FeedClient newClient(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient, int age);
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.feed.FeedContentType> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/FeedContentType$Companion;", "", "()V", "restoreState", "", "saveState", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void saveState() {
        }
        
        public final void restoreState() {
        }
    }
}