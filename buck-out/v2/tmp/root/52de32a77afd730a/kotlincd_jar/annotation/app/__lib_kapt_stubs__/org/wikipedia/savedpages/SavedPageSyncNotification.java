package org.wikipedia.savedpages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.views.NotificationWithProgressBar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/savedpages/SavedPageSyncNotification;", "Landroid/content/BroadcastReceiver;", "()V", "notification", "Lorg/wikipedia/views/NotificationWithProgressBar;", "cancelNotification", "", "context", "Landroid/content/Context;", "isSyncCanceled", "", "isSyncPaused", "onReceive", "intent", "Landroid/content/Intent;", "setNotificationPaused", "itemsTotal", "", "itemsProgress", "setNotificationProgress", "setSyncCanceled", "canceled", "setSyncPaused", "paused", "Companion", "app.lib"})
public final class SavedPageSyncNotification extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.NotificationWithProgressBar notification = null;
    private static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.savedpages.SavedPageSyncNotification instance = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.savedpages.SavedPageSyncNotification.Companion Companion = null;
    
    public SavedPageSyncNotification() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void setSyncPaused(boolean paused) {
    }
    
    public final void setSyncCanceled(boolean canceled) {
    }
    
    public final boolean isSyncCanceled() {
        return false;
    }
    
    public final boolean isSyncPaused() {
        return false;
    }
    
    public final void setNotificationProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemsTotal, int itemsProgress) {
    }
    
    public final void setNotificationPaused(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemsTotal, int itemsProgress) {
    }
    
    public final void cancelNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/savedpages/SavedPageSyncNotification$Companion;", "", "()V", "NOTIFICATION_ID", "", "instance", "Lorg/wikipedia/savedpages/SavedPageSyncNotification;", "getInstance", "()Lorg/wikipedia/savedpages/SavedPageSyncNotification;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.savedpages.SavedPageSyncNotification getInstance() {
            return null;
        }
    }
}