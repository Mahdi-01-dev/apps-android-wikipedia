package org.wikipedia.feed.announcement;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.dataclient.FeedClient;
import org.wikipedia.feed.model.Card;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.GeoUtil;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.log.L;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/feed/announcement/AnnouncementClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "clientJob", "Lkotlinx/coroutines/Job;", "cancel", "", "request", "context", "Landroid/content/Context;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "Companion", "app.lib"})
public final class AnnouncementClient implements org.wikipedia.feed.dataclient.FeedClient {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PLATFORM_CODE = "AndroidApp";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PLATFORM_CODE_NEW = "AndroidAppV2";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.announcement.AnnouncementClient.Companion Companion = null;
    
    public AnnouncementClient(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @java.lang.Override()
    public void request(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\"\u0010\u0017\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/feed/announcement/AnnouncementClient$Companion;", "", "()V", "PLATFORM_CODE", "", "PLATFORM_CODE_NEW", "buildCards", "", "Lorg/wikipedia/feed/model/Card;", "announcements", "Lorg/wikipedia/feed/announcement/Announcement;", "matchesConditions", "", "announcement", "matchesCountryCode", "country", "matchesDate", "date", "Ljava/util/Date;", "matchesVersionCodes", "minVersion", "", "maxVersion", "shouldShow", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting()
        private final java.util.List<org.wikipedia.feed.model.Card> buildCards(java.util.List<org.wikipedia.feed.announcement.Announcement> announcements) {
            return null;
        }
        
        public final boolean shouldShow(@org.jetbrains.annotations.Nullable()
        org.wikipedia.feed.announcement.Announcement announcement, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.NotNull()
        java.util.Date date) {
            return false;
        }
        
        private final boolean matchesCountryCode(org.wikipedia.feed.announcement.Announcement announcement, java.lang.String country) {
            return false;
        }
        
        private final boolean matchesDate(org.wikipedia.feed.announcement.Announcement announcement, java.util.Date date) {
            return false;
        }
        
        private final boolean matchesConditions(org.wikipedia.feed.announcement.Announcement announcement) {
            return false;
        }
        
        private final boolean matchesVersionCodes(int minVersion, int maxVersion) {
            return false;
        }
    }
}