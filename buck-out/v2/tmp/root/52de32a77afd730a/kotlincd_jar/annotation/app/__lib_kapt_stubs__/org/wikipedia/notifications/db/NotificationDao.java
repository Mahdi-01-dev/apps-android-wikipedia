package org.wikipedia.notifications.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\'J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/notifications/db/NotificationDao;", "", "deleteAll", "", "deleteNotification", "notification", "Lorg/wikipedia/notifications/db/Notification;", "(Lorg/wikipedia/notifications/db/Notification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotifications", "", "getNotificationById", "wiki", "", "id", "", "getNotificationsByWiki", "Lkotlinx/coroutines/flow/Flow;", "insertNotifications", "notifications", "updateNotification", "app.lib"})
@androidx.room.Dao()
public abstract interface NotificationDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertNotifications(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.notifications.db.Notification> notifications);
    
    @androidx.room.Update(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Notification")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "SELECT * FROM Notification")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.notifications.db.Notification> getAllNotifications();
    
    @androidx.room.Query(value = "SELECT * FROM Notification WHERE `wiki` IN (:wiki)")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<org.wikipedia.notifications.db.Notification>> getNotificationsByWiki(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> wiki);
    
    @androidx.room.Query(value = "SELECT * FROM Notification WHERE `wiki` IN (:wiki) AND `id` IN (:id)")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.notifications.db.Notification getNotificationById(@org.jetbrains.annotations.NotNull()
    java.lang.String wiki, long id);
}