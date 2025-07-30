package org.wikipedia.readinglist;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlinx.coroutines.Runnable;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.databinding.FragmentReadingListBinding;
import org.wikipedia.events.NewRecommendedReadingListEvent;
import org.wikipedia.events.PageDownloadEvent;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.main.MainActivity;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageAvailableOfflineHandler;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.recommended.RecommendedReadingListNotificationManager;
import org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsActivity;
import org.wikipedia.readinglist.sync.ReadingListSyncEvent;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.RemoteConfig;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.CircularProgressBar;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.MultiSelectActionModeCallback;
import org.wikipedia.views.PageItemView;
import org.wikipedia.views.SwipeableItemTouchHelperCallback;
import java.util.Date;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0016\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020NH\u0002J\b\u0010P\u001a\u00020NH\u0002J\b\u0010Q\u001a\u00020NH\u0002J\u0014\u0010R\u001a\u00020N2\n\u0010S\u001a\u00060\u001dj\u0002`\u001eH\u0002J\b\u0010T\u001a\u00020NH\u0002J\u0012\u0010U\u001a\u0004\u0018\u00010@2\u0006\u0010V\u001a\u000201H\u0002J\u0010\u0010W\u001a\u00020;2\u0006\u0010X\u001a\u00020@H\u0002J\b\u0010Y\u001a\u00020NH\u0002J\b\u0010Z\u001a\u00020NH\u0002J\u0010\u0010[\u001a\u00020N2\u0006\u0010\\\u001a\u000201H\u0016J\u0018\u0010]\u001a\u00020N2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0016J$\u0010b\u001a\u00020c2\u0006\u0010`\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\u0010\u0010i\u001a\u00020N2\u0006\u0010\\\u001a\u000201H\u0016J\b\u0010j\u001a\u00020NH\u0016J\u0010\u0010k\u001a\u00020\u00132\u0006\u0010l\u001a\u00020mH\u0016J\u0010\u0010n\u001a\u00020N2\u0006\u0010\\\u001a\u000201H\u0016J\u0010\u0010o\u001a\u00020N2\u0006\u0010^\u001a\u00020_H\u0016J\b\u0010p\u001a\u00020NH\u0016J\u0010\u0010q\u001a\u00020N2\u0006\u0010\\\u001a\u000201H\u0016J\u0010\u0010r\u001a\u00020N2\u0006\u0010\\\u001a\u000201H\u0016J\u0010\u0010s\u001a\u00020N2\u0006\u0010\\\u001a\u000201H\u0016J\u001a\u0010t\u001a\u00020N2\u0006\u0010u\u001a\u00020c2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\b\u0010(\u001a\u00020NH\u0002J\b\u0010v\u001a\u00020NH\u0002J\b\u0010w\u001a\u00020NH\u0002J\b\u0010x\u001a\u00020NH\u0002J\b\u0010y\u001a\u00020NH\u0002J\b\u0010z\u001a\u00020NH\u0002J\u0012\u0010z\u001a\u00020N2\b\u0010{\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010|\u001a\u00020N2\u0006\u0010}\u001a\u00020;2\u0006\u0010~\u001a\u00020;H\u0002J\u0011\u0010\u007f\u001a\u00020N2\u0007\u0010\u0080\u0001\u001a\u00020\u0013H\u0002J\t\u0010\u0081\u0001\u001a\u00020NH\u0002J\t\u0010\u0082\u0001\u001a\u00020NH\u0002J\t\u0010\u0083\u0001\u001a\u00020NH\u0002J\u0013\u0010\u0084\u0001\u001a\u00020N2\b\u0010X\u001a\u0004\u0018\u00010@H\u0002J\t\u0010\u0085\u0001\u001a\u00020NH\u0002J\u0015\u0010\u0086\u0001\u001a\u00020N2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0014\u0010\u0087\u0001\u001a\u00020N2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018H\u0002J\u0007\u0010\u0089\u0001\u001a\u00020NJ\t\u0010\u008a\u0001\u001a\u00020NH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010$R\u0012\u0010&\u001a\u00060\'R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00102\u001a\u000603R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00106\u001a\u000607R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u00108\u001a\u000609R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020;8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010G\u001a\u00020H8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bI\u0010J\u00a8\u0006\u0096\u0001"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemAdapter;", "appBarListener", "Lorg/wikipedia/readinglist/ReadingListFragment$AppBarListener;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "articleLimitMessageShown", "", "binding", "getBinding", "()Lerror/NonExistentClass;", "currentSearchQuery", "", "displayedLists", "", "", "exclusiveTooltipRunnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "headerView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isPreview", "()Z", "isRecommendedList", "multiSelectActionModeCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$MultiSelectCallback;", "previewSaveDialog", "Landroidx/appcompat/app/AlertDialog;", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "getReadingList", "()Lorg/wikipedia/readinglist/database/ReadingList;", "setReadingList", "(Lorg/wikipedia/readinglist/database/ReadingList;)V", "readingListId", "", "readingListItemCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListItemCallback;", "readingListMode", "Lorg/wikipedia/readinglist/ReadingListMode;", "readingListPageItemCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemCallback;", "searchActionModeCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$SearchCallback;", "selectedPageCount", "", "getSelectedPageCount", "()I", "selectedPages", "", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "getSelectedPages", "()Ljava/util/List;", "showOverflowMenu", "toolbarExpanded", "touchCallback", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback;", "viewModel", "Lorg/wikipedia/readinglist/ReadingListFragmentViewModel;", "getViewModel", "()Lorg/wikipedia/readinglist/ReadingListFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addSelectedPagesToList", "", "beginMultiSelect", "delete", "deleteSelectedPages", "enqueueTooltip", "runnable", "finishActionMode", "getPageById", "id", "getPagePositionInList", "page", "maybeShowCustomizeSnackbar", "moveSelectedPagesToList", "onAddItemToOther", "pageId", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteItem", "onDestroyView", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "onMoveItemToOther", "onPrepareMenu", "onResume", "onSelectItem", "onShareItem", "onToggleItemOffline", "onViewCreated", "view", "rename", "requestPermissionAndScheduleRecommendedReadingNotification", "setHeaderView", "setRecyclerView", "setSearchQuery", "query", "setSortMode", "sortModeAsc", "sortModeDesc", "setStatusBarActionMode", "inActionMode", "setSwipeRefreshView", "setToolbar", "showRecommendedReadingListNotificationOffDialog", "toggleSelectPage", "unselectAllPages", "update", "updateEmptyState", "searchQuery", "updateNotificationIcon", "updateReadingListData", "AppBarListener", "Companion", "HeaderCallback", "MultiSelectCallback", "ReadingListHeaderHolder", "ReadingListItemCallback", "ReadingListItemHolder", "ReadingListPageItemAdapter", "ReadingListPageItemCallback", "ReadingListPageItemHolder", "SearchCallback", "app.lib"})
public final class ReadingListFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider, org.wikipedia.readinglist.ReadingListItemActionsDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentReadingListBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private org.wikipedia.views.SwipeableItemTouchHelperCallback touchCallback;
    private org.wikipedia.readinglist.ReadingListItemView headerView;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog previewSaveDialog;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.readinglist.ReadingListMode readingListMode = org.wikipedia.readinglist.ReadingListMode.DEFAULT;
    private long readingListId = 0L;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.Constants.InvokeSource invokeSource;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListFragment.ReadingListPageItemAdapter adapter = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListFragment.AppBarListener appBarListener = null;
    private boolean showOverflowMenu = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListFragment.ReadingListItemCallback readingListItemCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListFragment.ReadingListPageItemCallback readingListPageItemCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListFragment.SearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListFragment.MultiSelectCallback multiSelectActionModeCallback = null;
    private boolean toolbarExpanded = true;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Object> displayedLists;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    private boolean articleLimitMessageShown = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable exclusiveTooltipRunnable;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.database.ReadingList readingList;
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_PAGE_ITEM = 2;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListFragment.Companion Companion = null;
    
    public ReadingListFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.readinglist.ReadingListFragmentViewModel getViewModel() {
        return null;
    }
    
    private final boolean isPreview() {
        return false;
    }
    
    private final boolean isRecommendedList() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.readinglist.database.ReadingList getReadingList() {
        return null;
    }
    
    public final void setReadingList(@org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setToolbar() {
    }
    
    private final void setHeaderView() {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void setSwipeRefreshView() {
    }
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    private final void update(org.wikipedia.readinglist.database.ReadingList readingList) {
    }
    
    private final void updateReadingListData() {
    }
    
    private final void enqueueTooltip(java.lang.Runnable runnable) {
    }
    
    private final void setSearchQuery() {
    }
    
    private final void setSearchQuery(java.lang.String query) {
    }
    
    private final void updateEmptyState(java.lang.String searchQuery) {
    }
    
    private final void setSortMode(int sortModeAsc, int sortModeDesc) {
    }
    
    private final void rename() {
    }
    
    private final void finishActionMode() {
    }
    
    private final void beginMultiSelect() {
    }
    
    private final void toggleSelectPage(org.wikipedia.readinglist.database.ReadingListPage page) {
    }
    
    private final int getSelectedPageCount() {
        return 0;
    }
    
    private final void unselectAllPages() {
    }
    
    private final void previewSaveDialog() {
    }
    
    public final void updateNotificationIcon() {
    }
    
    private final java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getSelectedPages() {
        return null;
    }
    
    private final void deleteSelectedPages() {
    }
    
    private final void addSelectedPagesToList() {
    }
    
    private final void moveSelectedPagesToList() {
    }
    
    private final void delete() {
    }
    
    @java.lang.Override()
    public void onToggleItemOffline(long pageId) {
    }
    
    @java.lang.Override()
    public void onShareItem(long pageId) {
    }
    
    @java.lang.Override()
    public void onAddItemToOther(long pageId) {
    }
    
    @java.lang.Override()
    public void onMoveItemToOther(long pageId) {
    }
    
    @java.lang.Override()
    public void onSelectItem(long pageId) {
    }
    
    @java.lang.Override()
    public void onDeleteItem(long pageId) {
    }
    
    private final org.wikipedia.readinglist.database.ReadingListPage getPageById(long id) {
        return null;
    }
    
    private final void maybeShowCustomizeSnackbar() {
    }
    
    private final void showRecommendedReadingListNotificationOffDialog() {
    }
    
    private final void requestPermissionAndScheduleRecommendedReadingNotification() {
    }
    
    private final void setStatusBarActionMode(boolean inActionMode) {
    }
    
    private final int getPagePositionInList(org.wikipedia.readinglist.database.ReadingListPage page) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$AppBarListener;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onOffsetChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "", "app.lib"})
    final class AppBarListener implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
        
        public AppBarListener() {
            super();
        }
        
        @java.lang.Override()
        public void onOffsetChanged(@org.jetbrains.annotations.NotNull()
        com.google.android.material.appbar.AppBarLayout appBarLayout, int verticalOffset) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$Companion;", "", "()V", "TYPE_HEADER", "", "TYPE_ITEM", "TYPE_PAGE_ITEM", "newInstance", "Lorg/wikipedia/readinglist/ReadingListFragment;", "listId", "", "readingListMode", "Lorg/wikipedia/readinglist/ReadingListMode;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListFragment newInstance(long listId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.ReadingListMode readingListMode, @org.jetbrains.annotations.Nullable()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$HeaderCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onAbout", "", "onCustomize", "onDelete", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onNotification", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "onSaveToList", "onShare", "app.lib"})
    final class HeaderCallback implements org.wikipedia.readinglist.ReadingListItemView.Callback {
        
        public HeaderCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onRename(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onDelete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onShare(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onCustomize() {
        }
        
        @java.lang.Override()
        public void onAbout() {
        }
        
        @java.lang.Override()
        public void onNotification() {
        }
        
        @java.lang.Override()
        public void onSaveToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onChecked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSelectList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$MultiSelectCallback;", "Lorg/wikipedia/views/MultiSelectActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onActionItemClicked", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteSelected", "", "onDestroyActionMode", "app.lib"})
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListHeaderHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/readinglist/ReadingListFragment;Landroid/view/View;)V", "app.lib"})
    final class ReadingListHeaderHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ReadingListHeaderHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListItemCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onClick", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onDelete", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "onShare", "app.lib"})
    final class ReadingListItemCallback implements org.wikipedia.readinglist.ReadingListItemView.Callback {
        
        public ReadingListItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onRename(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onDelete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onShare(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onAbout() {
        }
        
        @java.lang.Override()
        public void onChecked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onCustomize() {
        }
        
        @java.lang.Override()
        public void onNotification() {
        }
        
        @java.lang.Override()
        public void onSaveToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSelectList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "(Lorg/wikipedia/readinglist/ReadingListFragment;Lorg/wikipedia/readinglist/ReadingListItemView;)V", "view", "getView", "()Lorg/wikipedia/readinglist/ReadingListItemView;", "bindItem", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "app.lib"})
    final class ReadingListItemHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public ReadingListItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.ReadingListItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.readinglist.ReadingListItemView getView() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "headerCount", "", "getHeaderCount", "()I", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class ReadingListPageItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public ReadingListPageItemAdapter() {
            super();
        }
        
        private final int getHeaderCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemCount() {
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
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app.lib"})
    final class ReadingListPageItemCallback implements org.wikipedia.views.PageItemView.Callback<org.wikipedia.readinglist.database.ReadingListPage> {
        
        public ReadingListPageItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage item) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage item) {
            return false;
        }
        
        @java.lang.Override()
        public void onActionClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "itemView", "(Lorg/wikipedia/readinglist/ReadingListFragment;Lorg/wikipedia/views/PageItemView;)V", "page", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "bindItem", "", "isSwipeable", "", "onSwipe", "app.lib"})
    final class ReadingListPageItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage>> implements org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
        private org.wikipedia.readinglist.database.ReadingListPage page;
        private org.wikipedia.page.PageTitle pageTitle;
        
        public ReadingListPageItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage> itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page) {
        }
        
        @java.lang.Override()
        public void onSwipe() {
        }
        
        @java.lang.Override()
        public boolean isSwipeable() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
    final class SearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        
        public SearchCallback() {
            super();
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
    }
}