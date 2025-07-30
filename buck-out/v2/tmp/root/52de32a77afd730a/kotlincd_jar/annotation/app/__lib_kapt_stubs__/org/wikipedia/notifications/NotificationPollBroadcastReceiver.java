package org.wikipedia.notifications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.StringRes;
import androidx.core.app.PendingIntentCompat;
import androidx.core.app.RemoteInput;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.UnreadNotificationsEvent;
import org.wikipedia.games.onthisday.OnThisDayGameNotificationManager;
import org.wikipedia.main.MainActivity;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.page.PageTitle;
import org.wikipedia.push.WikipediaFirebaseMessagingService;
import org.wikipedia.readinglist.recommended.RecommendedReadingListNotificationManager;
import org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency;
import org.wikipedia.settings.Prefs;
import org.wikipedia.talk.NotificationDirectReplyHelper;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.log.L;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/notifications/NotificationPollBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app.lib"})
public final class NotificationPollBroadcastReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_POLL = "action_notification_poll";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CANCEL = "action_notification_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DIRECT_REPLY = "action_direct_reply";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DAILY_GAME = "action_daily_game";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_RECOMMENDED_READING_LIST = "action_recommended_reading_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_KEY_DIRECT_REPLY = "key_direct_reply";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_EXTRA_REPLY_TO = "extra_reply_to";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_EXTRA_ID = "extra_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_MULTIPLE = "multiple";
    private static final int FIRST_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY = 3;
    private static final int SECOND_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY = 7;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationPollBroadcastReceiver.Companion Companion = null;
    
    public NotificationPollBroadcastReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J,\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002JD\u0010#\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040%J\u0018\u0010\'\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010(\u001a\u00020\nJ\u000e\u0010)\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010*\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/notifications/NotificationPollBroadcastReceiver$Companion;", "", "()V", "ACTION_CANCEL", "", "ACTION_DAILY_GAME", "ACTION_DIRECT_REPLY", "ACTION_POLL", "ACTION_RECOMMENDED_READING_LIST", "FIRST_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY", "", "RESULT_EXTRA_ID", "RESULT_EXTRA_REPLY_TO", "RESULT_KEY_DIRECT_REPLY", "SECOND_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY", "TYPE_MULTIPLE", "getAlarmPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "getCancelNotificationPendingIntent", "id", "", "type", "markRead", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "notifications", "", "Lorg/wikipedia/notifications/db/Notification;", "unread", "", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeShowLocalNotificationForEditorReactivation", "onNotificationsComplete", "dbWikiSiteMap", "", "dbWikiNameMap", "showSuggestedEditsLocalNotification", "description", "startPollTask", "stopPollTask", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void startPollTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void stopPollTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final android.app.PendingIntent getAlarmPendingIntent(android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent getCancelNotificationPendingIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long id, @org.jetbrains.annotations.Nullable()
        java.lang.String type) {
            return null;
        }
        
        public final void onNotificationsComplete(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.notifications.db.Notification> notifications, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.dataclient.WikiSite> dbWikiSiteMap, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> dbWikiNameMap) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object markRead(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.notifications.db.Notification> notifications, boolean unread, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        private final void maybeShowLocalNotificationForEditorReactivation(android.content.Context context) {
        }
        
        public final void showSuggestedEditsLocalNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @androidx.annotation.StringRes()
        int description) {
        }
    }
}