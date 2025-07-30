package org.wikipedia.notifications;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.*;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.core.app.RemoteInput;
import androidx.core.content.ContextCompat;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.page.PageTitle;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.settings.Prefs;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.*;
import org.wikipedia.util.log.L;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J0\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0004J*\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020\u00182\b\b\u0001\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0004J,\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010#\u001a\u00020$J\u001c\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\'J\u0016\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0018Je\u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u001f\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u001a\u00a2\u0006\u0002\u0010/J&\u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lorg/wikipedia/notifications/NotificationPresenter;", "", "()V", "NOTIFICATION_TYPE_LOCAL", "", "lastPermissionRequestTime", "", "addAction", "", "context", "Landroid/content/Context;", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "link", "Lorg/wikipedia/notifications/db/Notification$Link;", "n", "Lorg/wikipedia/notifications/db/Notification;", "addActionForDiffLink", "addActionForTalkPage", "addActionWithDirectReply", "title", "Lorg/wikipedia/page/PageTitle;", "replyTo", "id", "", "addIntentExtras", "Landroid/content/Intent;", "intent", "type", "drawNotificationBitmap", "Landroid/graphics/Bitmap;", "color", "icon", "lang", "getDefaultBuilder", "notificationCategory", "Lorg/wikipedia/notifications/NotificationCategory;", "maybeRequestPermission", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "showMultipleUnread", "unreadCount", "showNotification", "text", "longText", "", "bodyIntent", "(Landroid/content/Context;Landroidx/core/app/NotificationCompat$Builder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;ILandroid/content/Intent;)V", "wikiSiteName", "app.lib"})
public final class NotificationPresenter {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_TYPE_LOCAL = "local";
    private static long lastPermissionRequestTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationPresenter INSTANCE = null;
    
    private NotificationPresenter() {
        super();
    }
    
    public final void maybeRequestPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String> launcher) {
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification n, @org.jetbrains.annotations.NotNull()
    java.lang.String wikiSiteName, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    public final void showMultipleUnread(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int unreadCount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent addIntentExtras(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder getDefaultBuilder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long id, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationCategory notificationCategory) {
        return null;
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder builder, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence longText, @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer icon, @androidx.annotation.ColorRes()
    int color, @org.jetbrains.annotations.NotNull()
    android.content.Intent bodyIntent) {
    }
    
    private final void addAction(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.notifications.db.Notification.Link link, org.wikipedia.notifications.db.Notification n) {
    }
    
    private final void addActionForDiffLink(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.notifications.db.Notification.Link link, org.wikipedia.notifications.db.Notification n) {
    }
    
    private final void addActionForTalkPage(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.notifications.db.Notification.Link link, org.wikipedia.notifications.db.Notification n) {
    }
    
    private final void addActionWithDirectReply(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.page.PageTitle title, java.lang.String replyTo, int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap drawNotificationBitmap(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int color, @androidx.annotation.DrawableRes()
    int icon, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
}