package org.wikipedia.readinglist.recommended;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.notifications.NotificationPollBroadcastReceiver;
import org.wikipedia.notifications.NotificationPresenter;
import org.wikipedia.readinglist.ReadingListActivity;
import org.wikipedia.readinglist.ReadingListMode;
import org.wikipedia.settings.Prefs;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListNotificationManager;", "", "()V", "cancelRecommendedReadingListNotification", "", "context", "Landroid/content/Context;", "scheduleRecommendedReadingListNotification", "showNotification", "source", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "timeUntilNextUpdate", "Ljava/time/Duration;", "frequency", "app.lib"})
public final class RecommendedReadingListNotificationManager {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.recommended.RecommendedReadingListNotificationManager INSTANCE = null;
    
    private RecommendedReadingListNotificationManager() {
        super();
    }
    
    public final void scheduleRecommendedReadingListNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency source) {
    }
    
    public final void cancelRecommendedReadingListNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final java.time.Duration timeUntilNextUpdate(org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency frequency) {
        return null;
    }
}