package org.wikipedia.views;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.app.PendingIntentCompat;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.notifications.NotificationCategory;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J@\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\u0006\u0010*\u001a\u00020+2\b\b\u0001\u0010,\u001a\u00020\u00152\b\b\u0001\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002J(\u0010/\u001a\u0002002\u0006\u0010(\u001a\u00020)2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015H\u0002J\u000e\u00105\u001a\u0002002\u0006\u0010(\u001a\u00020)J.\u00106\u001a\u0004\u0018\u0001072\u0006\u0010(\u001a\u00020)2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0015H\u0002J\u001e\u00108\u001a\u0002002\u0006\u0010(\u001a\u00020)2\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0015J\u001e\u0010;\u001a\u0002002\u0006\u0010(\u001a\u00020)2\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0015J\u0018\u0010<\u001a\u0002002\u0006\u0010(\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010 \u001a\u0006\u0012\u0002\b\u00030!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006="}, d2 = {"Lorg/wikipedia/views/NotificationWithProgressBar;", "", "()V", "isCanceled", "", "()Z", "setCanceled", "(Z)V", "isEnableCancelButton", "setEnableCancelButton", "isEnablePauseButton", "setEnablePauseButton", "isPaused", "setPaused", "notificationCategory", "Lorg/wikipedia/notifications/NotificationCategory;", "getNotificationCategory", "()Lorg/wikipedia/notifications/NotificationCategory;", "setNotificationCategory", "(Lorg/wikipedia/notifications/NotificationCategory;)V", "notificationDescription", "", "getNotificationDescription", "()I", "setNotificationDescription", "(I)V", "notificationId", "getNotificationId", "setNotificationId", "notificationTitle", "getNotificationTitle", "setNotificationTitle", "targetClass", "Ljava/lang/Class;", "getTargetClass", "()Ljava/lang/Class;", "setTargetClass", "(Ljava/lang/Class;)V", "actionBuilder", "Landroidx/core/app/NotificationCompat$Action;", "context", "Landroid/content/Context;", "intentExtra", "", "buttonDrawable", "buttonText", "requestCode", "build", "", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "total", "progress", "cancelNotification", "pendingIntentBuilder", "Landroid/app/PendingIntent;", "setNotificationPaused", "itemsTotal", "itemsProgress", "setNotificationProgress", "showNotification", "app.lib"})
public final class NotificationWithProgressBar {
    public org.wikipedia.notifications.NotificationCategory notificationCategory;
    public java.lang.Class<?> targetClass;
    private int notificationId = 0;
    private int notificationTitle = 0;
    private int notificationDescription = 0;
    private boolean isEnableCancelButton = false;
    private boolean isEnablePauseButton = false;
    private boolean isCanceled = false;
    private boolean isPaused = false;
    
    public NotificationWithProgressBar() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.notifications.NotificationCategory getNotificationCategory() {
        return null;
    }
    
    public final void setNotificationCategory(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationCategory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<?> getTargetClass() {
        return null;
    }
    
    public final void setTargetClass(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> p0) {
    }
    
    public final int getNotificationId() {
        return 0;
    }
    
    public final void setNotificationId(int p0) {
    }
    
    public final int getNotificationTitle() {
        return 0;
    }
    
    public final void setNotificationTitle(int p0) {
    }
    
    public final int getNotificationDescription() {
        return 0;
    }
    
    public final void setNotificationDescription(int p0) {
    }
    
    public final boolean isEnableCancelButton() {
        return false;
    }
    
    public final void setEnableCancelButton(boolean p0) {
    }
    
    public final boolean isEnablePauseButton() {
        return false;
    }
    
    public final void setEnablePauseButton(boolean p0) {
    }
    
    public final boolean isCanceled() {
        return false;
    }
    
    public final void setCanceled(boolean p0) {
    }
    
    public final boolean isPaused() {
        return false;
    }
    
    public final void setPaused(boolean p0) {
    }
    
    public final void setNotificationProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemsTotal, int itemsProgress) {
    }
    
    public final void setNotificationPaused(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemsTotal, int itemsProgress) {
    }
    
    private final void build(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, int total, int progress) {
    }
    
    public final void cancelNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void showNotification(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder) {
    }
    
    private final androidx.core.app.NotificationCompat.Action actionBuilder(android.content.Context context, java.lang.Class<?> targetClass, java.lang.String intentExtra, @androidx.annotation.DrawableRes()
    int buttonDrawable, @androidx.annotation.StringRes()
    int buttonText, int requestCode) {
        return null;
    }
    
    private final android.app.PendingIntent pendingIntentBuilder(android.content.Context context, java.lang.Class<?> targetClass, java.lang.String intentExtra, int requestCode) {
        return null;
    }
}