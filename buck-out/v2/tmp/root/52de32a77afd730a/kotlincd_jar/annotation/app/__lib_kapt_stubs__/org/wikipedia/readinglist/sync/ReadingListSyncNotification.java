package org.wikipedia.readinglist.sync;

import android.content.Context;
import org.wikipedia.R;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.views.NotificationWithProgressBar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListSyncNotification;", "", "()V", "notification", "Lorg/wikipedia/views/NotificationWithProgressBar;", "cancelNotification", "", "context", "Landroid/content/Context;", "setNotificationProgress", "itemsTotal", "", "itemsProgress", "Companion", "app.lib"})
public final class ReadingListSyncNotification {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.NotificationWithProgressBar notification = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.readinglist.sync.ReadingListSyncNotification instance = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_ID = "READING_LIST_SYNCING_CHANNEL";
    private static final int NOTIFICATION_ID = 1002;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.sync.ReadingListSyncNotification.Companion Companion = null;
    
    private ReadingListSyncNotification() {
        super();
    }
    
    public final void setNotificationProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemsTotal, int itemsProgress) {
    }
    
    public final void cancelNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListSyncNotification$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "instance", "Lorg/wikipedia/readinglist/sync/ReadingListSyncNotification;", "getInstance", "()Lorg/wikipedia/readinglist/sync/ReadingListSyncNotification;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.sync.ReadingListSyncNotification getInstance() {
            return null;
        }
    }
}