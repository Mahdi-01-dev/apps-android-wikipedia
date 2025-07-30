package org.wikipedia.games.onthisday;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.notifications.NotificationPollBroadcastReceiver;
import org.wikipedia.notifications.NotificationPresenter;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.FeedbackUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameNotificationManager;", "", "()V", "cancelDailyGameNotification", "", "context", "Landroid/content/Context;", "disableNotifications", "activity", "Landroid/app/Activity;", "showUndo", "", "enableNotifications", "handleNotificationClick", "scheduleDailyGameNotification", "showDisabledNotificationDialog", "showEnabledNotificationDialog", "showNotification", "app.lib"})
public final class OnThisDayGameNotificationManager {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGameNotificationManager INSTANCE = null;
    
    private OnThisDayGameNotificationManager() {
        super();
    }
    
    public final void handleNotificationClick(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    private final void showDisabledNotificationDialog(android.app.Activity activity) {
    }
    
    private final void showEnabledNotificationDialog(android.app.Activity activity) {
    }
    
    private final void disableNotifications(android.app.Activity activity, boolean showUndo) {
    }
    
    private final void enableNotifications(android.app.Activity activity, boolean showUndo) {
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void scheduleDailyGameNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void cancelDailyGameNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}