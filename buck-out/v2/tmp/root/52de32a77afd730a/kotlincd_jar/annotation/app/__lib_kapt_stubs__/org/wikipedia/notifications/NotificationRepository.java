package org.wikipedia.notifications;

import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.notifications.db.NotificationDao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/notifications/NotificationRepository;", "", "notificationDao", "Lorg/wikipedia/notifications/db/NotificationDao;", "(Lorg/wikipedia/notifications/db/NotificationDao;)V", "fetchAndSave", "", "wikiList", "filter", "continueStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnreadWikiDbNames", "", "Lorg/wikipedia/dataclient/WikiSite;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotifications", "", "Lorg/wikipedia/notifications/db/Notification;", "insertNotifications", "", "notifications", "updateNotification", "notification", "(Lorg/wikipedia/notifications/db/Notification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
public final class NotificationRepository {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.notifications.db.NotificationDao notificationDao = null;
    
    public NotificationRepository(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.NotificationDao notificationDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.notifications.db.Notification> getAllNotifications() {
        return null;
    }
    
    private final void insertNotifications(java.util.List<org.wikipedia.notifications.db.Notification> notifications) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchUnreadWikiDbNames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, org.wikipedia.dataclient.WikiSite>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAndSave(@org.jetbrains.annotations.Nullable()
    java.lang.String wikiList, @org.jetbrains.annotations.Nullable()
    java.lang.String filter, @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
}