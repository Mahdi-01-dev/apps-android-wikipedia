package org.wikipedia.notifications;

import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryResponse;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DateUtil;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/notifications/AnonymousNotificationHelper;", "", "()V", "NOTIFICATION_DURATION_DAYS", "", "anonTalkPageHasRecentMessage", "", "response", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse;", "title", "Lorg/wikipedia/page/PageTitle;", "isWithinAnonNotificationTime", "maybeGetAnonUserInfo", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onEditSubmitted", "", "shouldCheckAnonNotifications", "app.lib"})
public final class AnonymousNotificationHelper {
    private static final long NOTIFICATION_DURATION_DAYS = 7L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.AnonymousNotificationHelper INSTANCE = null;
    
    private AnonymousNotificationHelper() {
        super();
    }
    
    public final void onEditSubmitted() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object maybeGetAnonUserInfo(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion) {
        return null;
    }
    
    public final boolean shouldCheckAnonNotifications(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResponse response) {
        return false;
    }
    
    public final boolean anonTalkPageHasRecentMessage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResponse response, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        return false;
    }
    
    public final boolean isWithinAnonNotificationTime() {
        return false;
    }
}