package org.wikipedia.database;

import androidx.room.TypeConverter;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.notifications.db.Notification;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/database/NotificationTypeConverters;", "", "()V", "agentToString", "", "agent", "Lorg/wikipedia/notifications/db/Notification$Agent;", "contentsToString", "contents", "Lorg/wikipedia/notifications/db/Notification$Contents;", "stringToAgent", "value", "stringToContents", "stringToTimestamp", "Lorg/wikipedia/notifications/db/Notification$Timestamp;", "stringToTitle", "Lorg/wikipedia/notifications/db/Notification$Title;", "timestampToString", "timestamp", "titleToString", "title", "app.lib"})
public final class NotificationTypeConverters {
    
    public NotificationTypeConverters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Contents stringToContents(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String contentsToString(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Contents contents) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Timestamp stringToTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String timestampToString(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Timestamp timestamp) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Title stringToTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String titleToString(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Title title) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Agent stringToAgent(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String agentToString(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Agent agent) {
        return null;
    }
}