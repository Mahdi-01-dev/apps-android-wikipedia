package org.wikipedia.readinglist;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.compose.ui.Modifier;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.databinding.FragmentReadingListsBinding;
import org.wikipedia.events.ArticleSavedOrDeletedEvent;
import org.wikipedia.events.NewRecommendedReadingListEvent;
import org.wikipedia.feed.FeedFragment;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.main.MainActivity;
import org.wikipedia.main.MainFragment;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageAvailableOfflineHandler;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.database.RecommendedPage;
import org.wikipedia.readinglist.recommended.RecommendedReadingListAbTest;
import org.wikipedia.readinglist.recommended.RecommendedReadingListHelper;
import org.wikipedia.readinglist.recommended.RecommendedReadingListOnboardingActivity;
import org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.readinglist.sync.ReadingListSyncEvent;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.RemoteConfig;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.CircularProgressBar;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.MultiSelectActionModeCallback;
import org.wikipedia.views.PageItemView;
import org.wikipedia.views.ReadingListsOverflowView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\tklmnopqrsB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u001bH\u0002J\b\u00102\u001a\u00020/H\u0002J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020/H\u0002J\b\u00108\u001a\u00020/H\u0002J\u0012\u00109\u001a\u00020/2\b\u0010:\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010;\u001a\u00020/H\u0002J\u0016\u0010<\u001a\u00020/2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0>H\u0002J\u0010\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u000206H\u0016J\u0012\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J$\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010J\u001a\u00020/2\u0006\u0010@\u001a\u000206H\u0016J\b\u0010K\u001a\u00020/H\u0016J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020/2\u0006\u0010@\u001a\u000206H\u0016J\b\u0010P\u001a\u00020/H\u0016J\b\u0010Q\u001a\u00020/H\u0016J\u0010\u0010R\u001a\u00020/2\u0006\u0010@\u001a\u000206H\u0016J\u0010\u0010S\u001a\u00020/2\u0006\u0010@\u001a\u000206H\u0016J\u0010\u0010T\u001a\u00020/2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020/2\u0006\u0010@\u001a\u000206H\u0016J\b\u0010X\u001a\u00020/H\u0002J\u0010\u0010Y\u001a\u00020/2\u0006\u0010Z\u001a\u00020\u001bH\u0002J\b\u0010[\u001a\u00020/H\u0002J\b\u0010\\\u001a\u00020/H\u0002J\u0016\u0010]\u001a\u00020/2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u0012H\u0002J\u0006\u0010`\u001a\u00020/J\b\u0010a\u001a\u00020/H\u0002J\u0010\u0010b\u001a\u00020/2\u0006\u0010c\u001a\u00020VH\u0002J\u0006\u0010d\u001a\u00020/J\u0012\u0010e\u001a\u00020/2\b\u0010f\u001a\u0004\u0018\u00010%H\u0002J\b\u0010g\u001a\u00020/H\u0002J\u0012\u0010h\u001a\u00020/2\b\u0010:\u001a\u0004\u0018\u00010\u0010H\u0002J\u0006\u0010i\u001a\u00020/J\u001a\u0010i\u001a\u00020/2\b\u0010:\u001a\u0004\u0018\u00010\u00102\u0006\u0010j\u001a\u00020\u001bH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00060\u001fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00060!R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00060\'R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010)\u001a\r\u0012\t\u0012\u00070%\u00a2\u0006\u0002\b*0\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/readinglist/SortReadingListsDialog$Callback;", "Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "currentSearchQuery", "", "displayedLists", "", "", "filePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getFilePickerLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "importMode", "", "multiSelectModeCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$MultiSelectCallback;", "overflowCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$OverflowCallback;", "readingListItemCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListItemCallback;", "readingListPageItemCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListPageItemCallback;", "recentPreviewSavedReadingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "searchActionModeCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListsSearchCallback;", "selectMode", "selectedLists", "Lkotlin/internal/NoInfer;", "getSelectedLists", "()Ljava/util/List;", "shouldShowImportedSnackbar", "beginMultiSelect", "", "enableLayoutTransition", "enable", "finishActionMode", "getPageById", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "id", "", "maybeDeleteListFromIntent", "maybeShowListLimitMessage", "maybeShowOnboarding", "searchQuery", "maybeShowPreviewSavedReadingListsSnackbar", "maybeTurnOffImportMode", "lists", "", "onAddItemToOther", "pageId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDeleteItem", "onDestroyView", "onListsImportResult", "uri", "Landroid/net/Uri;", "onMoveItemToOther", "onPause", "onResume", "onSelectItem", "onShareItem", "onSortOptionClick", "position", "", "onToggleItemOffline", "selectAllLists", "setEmptyContainerVisibility", "visible", "setUpEmptyContainer", "setUpScrollListener", "setupRecommendedReadingListDiscoverCardView", "recommendedArticles", "Lorg/wikipedia/readinglist/database/RecommendedPage;", "showReadingListsOverflowMenu", "showReadingListsSyncDialog", "sortListsBy", "option", "startSearchActionMode", "toggleSelectList", "readingList", "unselectAllLists", "updateEmptyState", "updateLists", "forcedRefresh", "Companion", "MultiSelectCallback", "OverflowCallback", "ReadingListAdapter", "ReadingListItemCallback", "ReadingListItemHolder", "ReadingListPageItemCallback", "ReadingListPageItemHolder", "ReadingListsSearchCallback", "app.lib"})
public final class ReadingListsFragment extends androidx.fragment.app.Fragment implements org.wikipedia.readinglist.SortReadingListsDialog.Callback, org.wikipedia.readinglist.ReadingListItemActionsDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentReadingListsBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Object> displayedLists;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListItemCallback readingListItemCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListPageItemCallback readingListPageItemCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListsSearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListsFragment.MultiSelectCallback multiSelectModeCallback = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.ReadingListsFragment.OverflowCallback overflowCallback = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    private boolean selectMode = false;
    private boolean importMode = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.database.ReadingList recentPreviewSavedReadingList;
    private boolean shouldShowImportedSnackbar = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> filePickerLauncher = null;
    private static final int VIEW_TYPE_ITEM = 0;
    private static final int VIEW_TYPE_PAGE_ITEM = 1;
    private static final int SAVE_COUNT_LIMIT = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListsFragment.Companion Companion = null;
    
    public ReadingListsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getFilePickerLauncher() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpScrollListener() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
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
    
    private final void sortListsBy(int option) {
    }
    
    private final void enableLayoutTransition(boolean enable) {
    }
    
    public final void updateLists() {
    }
    
    public final void startSearchActionMode() {
    }
    
    public final void showReadingListsOverflowMenu() {
    }
    
    private final void updateLists(java.lang.String searchQuery, boolean forcedRefresh) {
    }
    
    private final void maybeTurnOffImportMode(java.util.List<org.wikipedia.readinglist.database.ReadingList> lists) {
    }
    
    private final void maybeShowListLimitMessage() {
    }
    
    private final void updateEmptyState(java.lang.String searchQuery) {
    }
    
    private final void setEmptyContainerVisibility(boolean visible) {
    }
    
    private final void setUpEmptyContainer() {
    }
    
    @java.lang.Override()
    public void onSortOptionClick(int position) {
    }
    
    private final void toggleSelectList(org.wikipedia.readinglist.database.ReadingList readingList) {
    }
    
    private final void beginMultiSelect() {
    }
    
    private final void finishActionMode() {
    }
    
    private final void maybeDeleteListFromIntent() {
    }
    
    private final java.util.List<org.wikipedia.readinglist.database.ReadingList> getSelectedLists() {
        return null;
    }
    
    private final void unselectAllLists() {
    }
    
    private final void selectAllLists() {
    }
    
    private final void showReadingListsSyncDialog() {
    }
    
    private final void maybeShowPreviewSavedReadingListsSnackbar() {
    }
    
    private final void maybeShowOnboarding(java.lang.String searchQuery) {
    }
    
    private final void onListsImportResult(android.net.Uri uri) {
    }
    
    private final void setupRecommendedReadingListDiscoverCardView(java.util.List<org.wikipedia.readinglist.database.RecommendedPage> recommendedArticles) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$Companion;", "", "()V", "SAVE_COUNT_LIMIT", "", "VIEW_TYPE_ITEM", "VIEW_TYPE_PAGE_ITEM", "newInstance", "Lorg/wikipedia/readinglist/ReadingListsFragment;", "refreshSync", "", "fragment", "Landroidx/fragment/app/Fragment;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListsFragment newInstance() {
            return null;
        }
        
        public final void refreshSync(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$MultiSelectCallback;", "Lorg/wikipedia/views/MultiSelectActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "allSelected", "", "getAllSelected", "()Z", "noneSelected", "getNoneSelected", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteSelected", "", "onDestroyActionMode", "onPrepareActionMode", "app.lib"})
    final class MultiSelectCallback extends org.wikipedia.views.MultiSelectActionModeCallback {
        
        public MultiSelectCallback() {
            super();
        }
        
        private final boolean getAllSelected() {
            return false;
        }
        
        private final boolean getNoneSelected() {
            return false;
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$OverflowCallback;", "Lorg/wikipedia/views/ReadingListsOverflowView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "createNewListClick", "", "importNewList", "refreshClick", "selectListClick", "sortByClick", "app.lib"})
    final class OverflowCallback implements org.wikipedia.views.ReadingListsOverflowView.Callback {
        
        public OverflowCallback() {
            super();
        }
        
        @java.lang.Override()
        public void sortByClick() {
        }
        
        @java.lang.Override()
        public void createNewListClick() {
        }
        
        @java.lang.Override()
        public void importNewList() {
        }
        
        @java.lang.Override()
        public void selectListClick() {
        }
        
        @java.lang.Override()
        public void refreshClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class ReadingListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> {
        
        public ReadingListAdapter() {
            super();
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
        public org.wikipedia.views.DefaultViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListItemCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "onChecked", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onClick", "onDelete", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "onSelectList", "onShare", "app.lib"})
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
        public void onSelectList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onChecked(@org.jetbrains.annotations.NotNull()
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
        public void onCustomize() {
        }
        
        @java.lang.Override()
        public void onNotification() {
        }
        
        @java.lang.Override()
        public void onSaveToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;Lorg/wikipedia/readinglist/ReadingListItemView;)V", "view", "getView", "()Lorg/wikipedia/readinglist/ReadingListItemView;", "bindItem", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListPageItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListPageItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "itemView", "(Lorg/wikipedia/readinglist/ReadingListsFragment;Lorg/wikipedia/views/PageItemView;)V", "bindItem", "", "page", "app.lib"})
    final class ReadingListPageItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage>> {
        
        public ReadingListPageItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage> itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListsSearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
    final class ReadingListsSearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        
        public ReadingListsSearchCallback() {
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