package org.wikipedia.notifications;

import org.wikipedia.notifications.db.Notification;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/notifications/NotificationListItemContainer;", "", "notification", "Lorg/wikipedia/notifications/db/Notification;", "type", "", "selected", "", "(Lorg/wikipedia/notifications/db/Notification;IZ)V", "getNotification", "()Lorg/wikipedia/notifications/db/Notification;", "getSelected", "()Z", "setSelected", "(Z)V", "getType", "()I", "Companion", "app.lib"})
public final class NotificationListItemContainer {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.notifications.db.Notification notification = null;
    private final int type = 0;
    private boolean selected;
    public static final int ITEM_SEARCH_BAR = 0;
    public static final int ITEM_NOTIFICATION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationListItemContainer.Companion Companion = null;
    
    public NotificationListItemContainer(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification notification, int type, boolean selected) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification getNotification() {
        return null;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final boolean getSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public NotificationListItemContainer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/notifications/NotificationListItemContainer$Companion;", "", "()V", "ITEM_NOTIFICATION", "", "ITEM_SEARCH_BAR", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}