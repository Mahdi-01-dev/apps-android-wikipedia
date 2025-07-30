package org.wikipedia.feed;

import android.content.Context;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.accessibility.AccessibilityCard;
import org.wikipedia.feed.announcement.AnnouncementClient;
import org.wikipedia.feed.becauseyouread.BecauseYouReadClient;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.feed.dayheader.DayHeaderCard;
import org.wikipedia.feed.featured.FeaturedArticleCard;
import org.wikipedia.feed.image.FeaturedImageCard;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.feed.news.NewsCard;
import org.wikipedia.feed.offline.OfflineCard;
import org.wikipedia.feed.onthisday.OnThisDayCard;
import org.wikipedia.feed.places.PlacesFeedClient;
import org.wikipedia.feed.progress.ProgressCard;
import org.wikipedia.feed.suggestededits.SuggestedEditsFeedClient;
import org.wikipedia.feed.topread.TopReadListCard;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.ThrowableUtil;
import org.wikipedia.util.log.L;
import java.util.Collections;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\b&\u0018\u0000 G2\u00020\u0001:\u0003FGHB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u0010\u0010&\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0006H$J\u0018\u0010*\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010\u001c2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020$J\u0018\u00100\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020,2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u00020,2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u000e\u00104\u001a\u00020$2\u0006\u0010!\u001a\u00020\"J\b\u00105\u001a\u00020$H\u0002J\u0018\u00106\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0006H\u0002J\u0006\u00107\u001a\u00020$J\b\u00108\u001a\u00020$H\u0002J\u0010\u00109\u001a\u00020$2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010:\u001a\u00020$2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010;\u001a\u00020$J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0016J\u0010\u0010>\u001a\u00020$2\b\u0010?\u001a\u0004\u0018\u00010 J\b\u0010@\u001a\u00020$H\u0002J\u0012\u0010A\u001a\u00020,2\b\u0010B\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010C\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u0016\u0010D\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0006J\u0006\u0010E\u001a\u00020$R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\u0013\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00170\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinatorBase;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "age", "", "getAge", "()I", "setAge", "(I)V", "callback", "Lorg/wikipedia/feed/FeedCoordinatorBase$ClientRequestCallback;", "cards", "", "Lorg/wikipedia/feed/model/Card;", "getCards", "()Ljava/util/List;", "currentDayCardAge", "hiddenCards", "", "", "kotlin.jvm.PlatformType", "", "lastCard", "getLastCard", "()Lorg/wikipedia/feed/model/Card;", "pendingClients", "Lorg/wikipedia/feed/dataclient/FeedClient;", "progressCard", "Lorg/wikipedia/feed/progress/ProgressCard;", "updateListener", "Lorg/wikipedia/feed/FeedCoordinatorBase$FeedUpdateListener;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "addHiddenCard", "", "card", "addPendingClient", "client", "appendCard", "buildScript", "conditionallyAddPendingClient", "condition", "", "dismissCard", "finished", "incrementAge", "insertCard", "position", "isCardHidden", "isDailyCardType", "more", "removeAccessibilityCard", "removeCard", "removeOfflineCard", "removeProgressCard", "requestCard", "requestNextCard", "requestOfflineCard", "requestProgressCard", "reset", "setFeedUpdateListener", "listener", "setOfflineState", "shouldShowProgressCard", "pendingClient", "unHideCard", "undoDismissCard", "updateHiddenCards", "ClientRequestCallback", "Companion", "FeedUpdateListener", "app.lib"})
public abstract class FeedCoordinatorBase {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.dataclient.FeedClient> pendingClients = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.FeedCoordinatorBase.ClientRequestCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.progress.ProgressCard progressCard = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.WikiSite wiki;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.FeedCoordinatorBase.FeedUpdateListener updateListener;
    private int currentDayCardAge = -1;
    private final java.util.Set<java.lang.String> hiddenCards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.model.Card> cards = null;
    private int age = 0;
    private static final int MAX_HIDDEN_CARDS = 100;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.FeedCoordinatorBase.Companion Companion = null;
    
    public FeedCoordinatorBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.feed.model.Card> getCards() {
        return null;
    }
    
    public final int getAge() {
        return 0;
    }
    
    public final void setAge(int p0) {
    }
    
    public final void updateHiddenCards() {
    }
    
    public final void setFeedUpdateListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.FeedCoordinatorBase.FeedUpdateListener listener) {
    }
    
    public void reset() {
    }
    
    public final void incrementAge() {
    }
    
    public final void more(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
    }
    
    public final boolean finished() {
        return false;
    }
    
    public final int dismissCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.Card card) {
        return 0;
    }
    
    public final void undoDismissCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.Card card, int position) {
    }
    
    protected abstract void buildScript(int age);
    
    public final void addPendingClient(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.dataclient.FeedClient client) {
    }
    
    public final void conditionallyAddPendingClient(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.dataclient.FeedClient client, boolean condition) {
    }
    
    private final void requestCard(org.wikipedia.dataclient.WikiSite wiki) {
    }
    
    private final void requestNextCard(org.wikipedia.dataclient.WikiSite wiki) {
    }
    
    public final void requestOfflineCard() {
    }
    
    public final void removeOfflineCard() {
    }
    
    private final org.wikipedia.feed.model.Card getLastCard() {
        return null;
    }
    
    private final void requestProgressCard() {
    }
    
    private final void removeProgressCard() {
    }
    
    private final void setOfflineState() {
    }
    
    private final void removeAccessibilityCard() {
    }
    
    private final void appendCard(org.wikipedia.feed.model.Card card) {
    }
    
    private final void insertCard(org.wikipedia.feed.model.Card card, int position) {
    }
    
    private final void removeCard(org.wikipedia.feed.model.Card card, int position) {
    }
    
    private final void addHiddenCard(org.wikipedia.feed.model.Card card) {
    }
    
    private final boolean isCardHidden(org.wikipedia.feed.model.Card card) {
        return false;
    }
    
    private final void unHideCard(org.wikipedia.feed.model.Card card) {
    }
    
    private final boolean isDailyCardType(org.wikipedia.feed.model.Card card) {
        return false;
    }
    
    private final boolean shouldShowProgressCard(org.wikipedia.feed.dataclient.FeedClient pendingClient) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinatorBase$ClientRequestCallback;", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "(Lorg/wikipedia/feed/FeedCoordinatorBase;)V", "error", "", "caught", "", "success", "cards", "", "Lorg/wikipedia/feed/model/Card;", "app.lib"})
    final class ClientRequestCallback implements org.wikipedia.feed.dataclient.FeedClient.Callback {
        
        public ClientRequestCallback() {
            super();
        }
        
        @java.lang.Override()
        public void success(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.feed.model.Card> cards) {
        }
        
        @java.lang.Override()
        public void error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinatorBase$Companion;", "", "()V", "MAX_HIDDEN_CARDS", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinatorBase$FeedUpdateListener;", "", "finished", "", "shouldUpdatePreviousCard", "", "insert", "card", "Lorg/wikipedia/feed/model/Card;", "pos", "", "remove", "app.lib"})
    public static abstract interface FeedUpdateListener {
        
        public abstract void insert(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, int pos);
        
        public abstract void remove(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, int pos);
        
        public abstract void finished(boolean shouldUpdatePreviousCard);
    }
}