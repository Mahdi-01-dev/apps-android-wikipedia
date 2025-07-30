package org.wikipedia.feed.onboarding;

import android.content.Context;
import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.announcement.Announcement;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.feed.model.Card;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J(\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/onboarding/OnboardingClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "()V", "cancel", "", "getCards", "", "Lorg/wikipedia/feed/model/Card;", "context", "Landroid/content/Context;", "request", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "Companion", "app.lib"})
public final class OnboardingClient implements org.wikipedia.feed.dataclient.FeedClient {
    private static final int SHOW_CUSTOMIZE_ONBOARDING_CARD_COUNT = 5;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.onboarding.OnboardingClient.Companion Companion = null;
    
    public OnboardingClient() {
        super();
    }
    
    @java.lang.Override()
    public void request(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
    }
    
    private final java.util.List<org.wikipedia.feed.model.Card> getCards(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/onboarding/OnboardingClient$Companion;", "", "()V", "SHOW_CUSTOMIZE_ONBOARDING_CARD_COUNT", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}