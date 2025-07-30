package org.wikipedia.notifications;

import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import java.util.Date;
import java.util.Random;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020\u0011H\u0002J\u0006\u0010)\u001a\u00020\u000bJ\u0010\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\tJ\b\u0010-\u001a\u00020+H\u0002J\u001c\u0010.\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u00100\u001a\u00020\tJ\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0002J\u0010\u00103\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u00010\u0011J\u000e\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\u000bR,\u0010\u0003\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R/\u0010$\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00067"}, d2 = {"Lorg/wikipedia/notifications/NotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lkotlin/Pair;", "", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "", "allUnreadCount", "", "getAllUnreadCount", "()I", "setAllUnreadCount", "(I)V", "currentContinueStr", "", "<set-?>", "currentSearchQuery", "getCurrentSearchQuery", "()Ljava/lang/String;", "dbNameMap", "", "Lorg/wikipedia/dataclient/WikiSite;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "mentionsUnreadCount", "getMentionsUnreadCount", "setMentionsUnreadCount", "notificationList", "", "Lorg/wikipedia/notifications/db/Notification;", "notificationRepository", "Lorg/wikipedia/notifications/NotificationRepository;", "selectedFilterTab", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "delimitedWikiList", "excludedFiltersCount", "fetchAndSave", "", "refresh", "filterAndPostNotifications", "markItemsAsRead", "items", "markUnread", "processList", "list", "updateSearchQuery", "query", "updateTabSelection", "position", "app.lib"})
public final class NotificationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.notifications.NotificationRepository notificationRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.notifications.db.Notification> notificationList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, org.wikipedia.dataclient.WikiSite> dbNameMap;
    private int selectedFilterTab = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentContinueStr;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    private int mentionsUnreadCount = 0;
    private int allUnreadCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Pair<java.util.List<org.wikipedia.notifications.NotificationListItemContainer>, java.lang.Boolean>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<java.util.List<org.wikipedia.notifications.NotificationListItemContainer>, java.lang.Boolean>>> uiState = null;
    
    public NotificationViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentSearchQuery() {
        return null;
    }
    
    public final int getMentionsUnreadCount() {
        return 0;
    }
    
    public final void setMentionsUnreadCount(int p0) {
    }
    
    public final int getAllUnreadCount() {
        return 0;
    }
    
    public final void setAllUnreadCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<java.util.List<org.wikipedia.notifications.NotificationListItemContainer>, java.lang.Boolean>>> getUiState() {
        return null;
    }
    
    private final void filterAndPostNotifications() {
    }
    
    private final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> processList(java.util.List<org.wikipedia.notifications.db.Notification> list) {
        return null;
    }
    
    private final java.lang.String delimitedWikiList() {
        return null;
    }
    
    public final int excludedFiltersCount() {
        return 0;
    }
    
    public final void fetchAndSave(boolean refresh) {
    }
    
    public final void updateSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final void updateTabSelection(int position) {
    }
    
    public final void markItemsAsRead(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.notifications.NotificationListItemContainer> items, boolean markUnread) {
    }
}