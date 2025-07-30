package org.wikipedia.notifications;

import android.content.Context;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationChannelGroupCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import org.wikipedia.R;
import org.wikipedia.model.EnumCode;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001&BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000ej\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/notifications/NotificationCategory;", "", "Lorg/wikipedia/model/EnumCode;", "id", "", "title", "", "description", "iconResId", "iconColor", "importance", "group", "(Ljava/lang/String;ILjava/lang/String;IIIIILjava/lang/String;)V", "getDescription", "()I", "getGroup", "()Ljava/lang/String;", "getIconColor", "getIconResId", "getId", "getImportance", "getTitle", "code", "SYSTEM", "MILESTONE_EDIT", "EDIT_USER_TALK", "EDIT_THANK", "REVERTED", "LOGIN_FAIL", "MENTION", "EMAIL_USER", "USER_RIGHTS", "ARTICLE_LINKED", "ALPHA_BUILD_CHECKER", "READING_LIST_SYNCING", "SYNCING", "RECOMMENDED_READING_LISTS", "GAMES", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public enum NotificationCategory implements org.wikipedia.model.EnumCode {
    /*public static final*/ SYSTEM /* = new SYSTEM(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ MILESTONE_EDIT /* = new MILESTONE_EDIT(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ EDIT_USER_TALK /* = new EDIT_USER_TALK(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ EDIT_THANK /* = new EDIT_THANK(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ REVERTED /* = new REVERTED(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ LOGIN_FAIL /* = new LOGIN_FAIL(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ MENTION /* = new MENTION(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ EMAIL_USER /* = new EMAIL_USER(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ USER_RIGHTS /* = new USER_RIGHTS(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ ARTICLE_LINKED /* = new ARTICLE_LINKED(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ ALPHA_BUILD_CHECKER /* = new ALPHA_BUILD_CHECKER(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ READING_LIST_SYNCING /* = new READING_LIST_SYNCING(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ SYNCING /* = new SYNCING(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ RECOMMENDED_READING_LISTS /* = new RECOMMENDED_READING_LISTS(null, 0, 0, 0, 0, 0, null) */,
    /*public static final*/ GAMES /* = new GAMES(null, 0, 0, 0, 0, 0, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final int title = 0;
    private final int description = 0;
    private final int iconResId = 0;
    private final int iconColor = 0;
    private final int importance = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String group = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.notifications.NotificationCategory> MENTIONS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.notifications.NotificationCategory> FILTERS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationCategory.Companion Companion = null;
    
    NotificationCategory(java.lang.String id, @androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int description, @androidx.annotation.DrawableRes()
    int iconResId, @androidx.annotation.AttrRes()
    int iconColor, int importance, java.lang.String group) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int getTitle() {
        return 0;
    }
    
    public final int getDescription() {
        return 0;
    }
    
    public final int getIconResId() {
        return 0;
    }
    
    public final int getIconColor() {
        return 0;
    }
    
    public final int getImportance() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGroup() {
        return null;
    }
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.notifications.NotificationCategory> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/notifications/NotificationCategory$Companion;", "", "()V", "FILTERS_GROUP", "", "Lorg/wikipedia/notifications/NotificationCategory;", "getFILTERS_GROUP", "()Ljava/util/List;", "MENTIONS_GROUP", "createNotificationChannels", "", "context", "Landroid/content/Context;", "find", "id", "", "isFiltersGroup", "", "category", "isMentionsGroup", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.notifications.NotificationCategory> getFILTERS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.notifications.NotificationCategory find(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
        
        public final boolean isMentionsGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String category) {
            return false;
        }
        
        public final boolean isFiltersGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String category) {
            return false;
        }
        
        public final void createNotificationChannels(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}