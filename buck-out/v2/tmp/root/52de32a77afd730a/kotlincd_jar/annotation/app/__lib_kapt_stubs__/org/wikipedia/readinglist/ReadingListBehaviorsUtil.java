package org.wikipedia.readinglist;

import android.app.Activity;
import android.content.DialogInterface;
import android.icu.text.ListFormatter;
import android.os.Build;
import android.text.Spanned;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003HIJB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J4\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J(\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J$\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020!J&\u0010\'\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001e\u0010*\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u001dJ<\u0010,\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00112\b\b\u0002\u00100\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J$\u00101\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010 \u001a\u00020!J \u00103\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020!J\u0010\u00104\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u001dH\u0002J&\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u00106\u001a\u00020\u000fH\u0002J$\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010 \u001a\u00020!J \u00107\u001a\u00020\t2\u0006\u00108\u001a\u0002092\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020:J \u0010;\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001fJ&\u0010<\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u001fJ0\u0010=\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002J.\u0010>\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00052\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010 \u001a\u00020\u001fJ\u0018\u0010@\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020AH\u0002J&\u0010B\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010C\u001a\u00020\u000fH\u0002J \u0010D\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u000fH\u0002J\u001e\u0010D\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J \u0010E\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020!J\u000e\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u001dR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil;", "", "()V", "allReadingLists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "addToDefaultList", "", "activity", "Landroid/app/Activity;", "title", "Lorg/wikipedia/page/PageTitle;", "addToDefault", "", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "listener", "Landroid/content/DialogInterface$OnDismissListener;", "applySearchQuery", "", "searchQuery", "", "lists", "deletePages", "Landroidx/appcompat/app/AppCompatActivity;", "listsContainPage", "readingListPage", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "snackbarCallback", "Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil$SnackbarCallback;", "callback", "Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil$Callback;", "deleteReadingList", "readingList", "showDialog", "deleteReadingLists", "readingLists", "getConfirmToggleOfflineMessage", "Landroid/text/Spanned;", "page", "getDeleteListMessage", "getListsContainPage", "moveToList", "sourceReadingListId", "", "source", "showDefaultList", "removePagesFromOffline", "selectedPages", "renameReadingList", "resetPageProgress", "savePagesForOffline", "forcedSave", "searchListsAndPages", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil$SearchCallback;", "showDeleteListUndoSnackbar", "showDeleteListsUndoSnackbar", "showDeletePageFromListsUndoSnackbar", "showDeletePagesUndoSnackbar", "pages", "showMobileDataWarningDialog", "Landroid/content/DialogInterface$OnClickListener;", "showMultiSelectOfflineStateChangeSnackbar", "offline", "toggleOffline", "togglePageOffline", "updateReadingListPage", "item", "Callback", "SearchCallback", "SnackbarCallback", "app.lib"})
public final class ReadingListBehaviorsUtil {
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<org.wikipedia.readinglist.database.ReadingList> allReadingLists;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListBehaviorsUtil INSTANCE = null;
    
    private ReadingListBehaviorsUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.database.ReadingList> getListsContainPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage readingListPage) {
        return null;
    }
    
    public final void savePagesForOffline(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> selectedPages, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    private final void savePagesForOffline(android.app.Activity activity, java.util.List<org.wikipedia.readinglist.database.ReadingListPage> selectedPages, boolean forcedSave) {
    }
    
    public final void removePagesFromOffline(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> selectedPages, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    public final void deleteReadingList(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList readingList, boolean showDialog, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    public final void deleteReadingLists(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    public final void deletePages(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> listsContainPage, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage readingListPage, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.SnackbarCallback snackbarCallback, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    public final void updateReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage item) {
    }
    
    public final void renameReadingList(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    private final void showDeletePageFromListsUndoSnackbar(android.app.Activity activity, java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, org.wikipedia.readinglist.database.ReadingListPage page, org.wikipedia.readinglist.ReadingListBehaviorsUtil.SnackbarCallback callback) {
    }
    
    public final void showDeletePagesUndoSnackbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.SnackbarCallback callback) {
    }
    
    public final void showDeleteListUndoSnackbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.SnackbarCallback callback) {
    }
    
    public final void showDeleteListsUndoSnackbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.SnackbarCallback callback) {
    }
    
    private final java.lang.String getDeleteListMessage(android.app.Activity activity, java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists) {
        return null;
    }
    
    public final void togglePageOffline(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    public final void toggleOffline(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.Callback callback) {
    }
    
    public final void addToDefaultList(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean addToDefault, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener listener) {
    }
    
    public final void moveToList(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, boolean showDefaultList, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener listener) {
    }
    
    private final void toggleOffline(android.app.Activity activity, org.wikipedia.readinglist.database.ReadingListPage page, boolean forcedSave) {
    }
    
    private final void showMobileDataWarningDialog(android.app.Activity activity, android.content.DialogInterface.OnClickListener listener) {
    }
    
    private final void showMultiSelectOfflineStateChangeSnackbar(android.app.Activity activity, java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean offline) {
    }
    
    private final void resetPageProgress(org.wikipedia.readinglist.database.ReadingListPage page) {
    }
    
    private final android.text.Spanned getConfirmToggleOfflineMessage(android.app.Activity activity, org.wikipedia.readinglist.database.ReadingListPage page, java.util.List<org.wikipedia.readinglist.database.ReadingList> lists) {
        return null;
    }
    
    public final void searchListsAndPages(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListBehaviorsUtil.SearchCallback callback) {
    }
    
    private final java.util.List<java.lang.Object> applySearchQuery(java.lang.String searchQuery, java.util.List<org.wikipedia.readinglist.database.ReadingList> lists) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil$Callback;", "", "onCompleted", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onCompleted();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil$SearchCallback;", "", "onCompleted", "", "lists", "", "app.lib"})
    public static abstract interface SearchCallback {
        
        public abstract void onCompleted(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Object> lists);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListBehaviorsUtil$SnackbarCallback;", "", "onUndoDeleteClicked", "", "app.lib"})
    public static abstract interface SnackbarCallback {
        
        public abstract void onUndoDeleteClicked();
    }
}