package org.wikipedia.notifications;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.PluralsRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.MenuItemCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.databinding.ActivityNotificationsBinding;
import org.wikipedia.databinding.ItemNotificationBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.settings.NotificationSettingsActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.MultiSelectActionModeCallback;
import org.wikipedia.views.NotificationActionsOverflowView;
import org.wikipedia.views.SearchAndFilterActionProvider;
import org.wikipedia.views.SwipeableItemTouchHelperCallback;
import org.wikipedia.views.WikiCardView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 M2\u00020\u0001:\u0006MNOPQRB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010,\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020*H\u0002J9\u0010.\u001a\u00020*2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\u000b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u00103J\u0012\u00104\u001a\u00020*2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u000209H\u0016J\u001e\u0010:\u001a\u00020*2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u000b2\u0006\u00108\u001a\u000209H\u0016J\b\u0010@\u001a\u00020*H\u0014J\b\u0010A\u001a\u00020*H\u0014J\u0019\u0010B\u001a\u00020*2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020*H\u0002J\b\u0010H\u001a\u00020*H\u0002J\b\u0010I\u001a\u00020*H\u0002J\u001e\u0010J\u001a\u00020*2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u00100\u001a\u00020\u000bH\u0002J\u0018\u0010K\u001a\u00020*2\u0006\u0010L\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n \"*\u0004\u0018\u00010!0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&\u00a8\u0006S"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "externalLinkIcon", "Landroid/graphics/drawable/Drawable;", "fromContinuation", "", "multiSelectActionModeCallback", "Lorg/wikipedia/notifications/NotificationActivity$MultiSelectCallback;", "notificationActionOverflowView", "Lorg/wikipedia/views/NotificationActionsOverflowView;", "notificationContainerList", "", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "searchActionModeCallback", "Lorg/wikipedia/notifications/NotificationActivity$SearchCallback;", "selectedItemCount", "", "getSelectedItemCount", "()I", "selectedItems", "", "getSelectedItems", "()Ljava/util/List;", "typefaceSansSerifBold", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "viewModel", "Lorg/wikipedia/notifications/NotificationViewModel;", "getViewModel", "()Lorg/wikipedia/notifications/NotificationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adjustRefreshViewLayoutParams", "", "removeLayoutBehavior", "beginMultiSelect", "finishActionMode", "markReadItems", "items", "markUnread", "fromUndoOrClick", "position", "(Ljava/util/List;ZZLjava/lang/Integer;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onNotificationsComplete", "notifications", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onResume", "onStop", "postprocessAndDisplay", "(Ljava/lang/Integer;)V", "setErrorState", "throwable", "", "setLoadingState", "setSuccessState", "setUpEmptySearchMessage", "showMarkReadItemsUndoSnackbar", "toggleSelectItem", "container", "Companion", "MultiSelectCallback", "NotificationItemAdapter", "NotificationItemHolder", "NotificationSearchBarHolder", "SearchCallback", "app.lib"})
public final class NotificationActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityNotificationsBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private android.graphics.drawable.Drawable externalLinkIcon;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> notificationContainerList = null;
    private boolean fromContinuation = false;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.notifications.NotificationActivity.MultiSelectCallback multiSelectActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.notifications.NotificationActivity.SearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.NotificationActionsOverflowView notificationActionOverflowView;
    private final android.graphics.Typeface typefaceSansSerifBold = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationActivity.Companion Companion = null;
    
    public NotificationActivity() {
        super();
    }
    
    private final org.wikipedia.notifications.NotificationViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setLoadingState() {
    }
    
    private final void setSuccessState() {
    }
    
    private final void setErrorState(java.lang.Throwable throwable) {
    }
    
    private final void onNotificationsComplete(java.util.List<org.wikipedia.notifications.NotificationListItemContainer> notifications, boolean fromContinuation) {
    }
    
    private final void postprocessAndDisplay(java.lang.Integer position) {
    }
    
    private final void setUpEmptySearchMessage() {
    }
    
    private final void markReadItems(java.util.List<org.wikipedia.notifications.NotificationListItemContainer> items, boolean markUnread, boolean fromUndoOrClick, java.lang.Integer position) {
    }
    
    private final void showMarkReadItemsUndoSnackbar(java.util.List<org.wikipedia.notifications.NotificationListItemContainer> items, boolean markUnread) {
    }
    
    private final void finishActionMode() {
    }
    
    private final void beginMultiSelect() {
    }
    
    private final void toggleSelectItem(org.wikipedia.notifications.NotificationListItemContainer container, int position) {
    }
    
    private final void adjustRefreshViewLayoutParams(boolean removeLayoutBehavior) {
    }
    
    private final int getSelectedItemCount() {
        return 0;
    }
    
    private final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> getSelectedItems() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity$MultiSelectCallback;", "Lorg/wikipedia/views/MultiSelectActionModeCallback;", "(Lorg/wikipedia/notifications/NotificationActivity;)V", "checkAllItems", "", "mode", "Landroidx/appcompat/view/ActionMode;", "check", "", "onActionItemClicked", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteSelected", "onDestroyActionMode", "onPrepareActionMode", "app.lib"})
    final class MultiSelectCallback extends org.wikipedia.views.MultiSelectActionModeCallback {
        
        public MultiSelectCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.MenuItem menuItem) {
            return false;
        }
        
        @java.lang.Override()
        protected void onDeleteSelected() {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        private final void checkAllItems(androidx.appcompat.view.ActionMode mode, boolean check) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity$NotificationItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/notifications/NotificationActivity;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class NotificationItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public NotificationItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0012J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\'H\u0002R\u0013\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity$NotificationItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/notifications/NotificationActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "container", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "getContainer", "()Lorg/wikipedia/notifications/NotificationListItemContainer;", "setContainer", "(Lorg/wikipedia/notifications/NotificationListItemContainer;)V", "itemPosition", "", "getItemPosition", "()I", "setItemPosition", "(I)V", "linkHandler", "Lorg/wikipedia/notifications/NotificationLinkHandler;", "getLinkHandler", "()Lorg/wikipedia/notifications/NotificationLinkHandler;", "setLinkHandler", "(Lorg/wikipedia/notifications/NotificationLinkHandler;)V", "bindItem", "", "pos", "isSwipeable", "", "isValidAppLanguageCode", "langCode", "", "onClick", "v", "Landroid/view/View;", "onLongClick", "onSwipe", "showOverflowMenu", "anchorView", "app.lib"})
    final class NotificationItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
        @org.jetbrains.annotations.NotNull()
        private final ItemNotificationBinding binding = null;
        public org.wikipedia.notifications.NotificationListItemContainer container;
        public org.wikipedia.notifications.NotificationLinkHandler linkHandler;
        private int itemPosition = -1;
        
        public NotificationItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemNotificationBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.notifications.NotificationListItemContainer getContainer() {
            return null;
        }
        
        public final void setContainer(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationListItemContainer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.notifications.NotificationLinkHandler getLinkHandler() {
            return null;
        }
        
        public final void setLinkHandler(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationLinkHandler p0) {
        }
        
        public final int getItemPosition() {
            return 0;
        }
        
        public final void setItemPosition(int p0) {
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationListItemContainer container, int pos) {
        }
        
        private final boolean isValidAppLanguageCode(java.lang.String langCode) {
            return false;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            return false;
        }
        
        @java.lang.Override()
        public void onSwipe() {
        }
        
        @java.lang.Override()
        public boolean isSwipeable() {
            return false;
        }
        
        private final void showOverflowMenu(android.view.View anchorView) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity$NotificationSearchBarHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lorg/wikipedia/notifications/NotificationActivity;Landroid/view/View;)V", "notificationFilterButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getNotificationFilterButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "notificationFilterCountView", "Landroid/widget/TextView;", "getNotificationFilterCountView", "()Landroid/widget/TextView;", "updateFilterIconAndCount", "", "app.lib"})
    final class NotificationSearchBarHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatImageView notificationFilterButton = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView notificationFilterCountView = null;
        
        public NotificationSearchBarHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatImageView getNotificationFilterButton() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNotificationFilterCountView() {
            return null;
        }
        
        public final void updateFilterIconAndCount() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0014J\u0006\u0010\u0017\u001a\u00020\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/notifications/NotificationActivity$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/notifications/NotificationActivity;)V", "searchAndFilterActionProvider", "Lorg/wikipedia/views/SearchAndFilterActionProvider;", "getSearchAndFilterActionProvider", "()Lorg/wikipedia/views/SearchAndFilterActionProvider;", "setSearchAndFilterActionProvider", "(Lorg/wikipedia/views/SearchAndFilterActionProvider;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "refreshProvider", "app.lib"})
    final class SearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.views.SearchAndFilterActionProvider searchAndFilterActionProvider;
        
        public SearchCallback() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.views.SearchAndFilterActionProvider getSearchAndFilterActionProvider() {
            return null;
        }
        
        public final void setSearchAndFilterActionProvider(@org.jetbrains.annotations.Nullable()
        org.wikipedia.views.SearchAndFilterActionProvider p0) {
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        protected void onQueryChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected java.lang.String getSearchHintString() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected android.content.Context getParentContext() {
            return null;
        }
        
        public final void refreshProvider() {
        }
    }
}