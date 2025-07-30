package org.wikipedia.analytics.eventplatform;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.WikipediaApp;
import java.util.concurrent.TimeUnit;

@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_daily_stats/2.1.0")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/DailyStatsEvent;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "app_install_age_in_days", "", "languages", "", "", "(JLjava/util/List;)V", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class DailyStatsEvent extends org.wikipedia.analytics.eventplatform.MobileAppsEventWithTemp {
    private final long app_install_age_in_days = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> languages = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STREAM_NAME = "android.daily_stats";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.DailyStatsEvent.Companion Companion = null;
    
    public DailyStatsEvent(long app_install_age_in_days, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languages) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/DailyStatsEvent$Companion;", "", "()V", "STREAM_NAME", "", "getInstallAge", "", "context", "Landroid/content/Context;", "getInstallAgeDays", "getInstallTime", "log", "", "app", "Lorg/wikipedia/WikipediaApp;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void log(@org.jetbrains.annotations.NotNull()
        org.wikipedia.WikipediaApp app) {
        }
        
        private final long getInstallAgeDays(android.content.Context context) {
            return 0L;
        }
        
        private final long getInstallAge(android.content.Context context) {
            return 0L;
        }
        
        public final long getInstallTime(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
    }
}