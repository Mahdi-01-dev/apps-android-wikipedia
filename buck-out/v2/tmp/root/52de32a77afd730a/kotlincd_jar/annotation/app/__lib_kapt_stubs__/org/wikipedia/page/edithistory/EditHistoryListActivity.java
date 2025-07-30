package org.wikipedia.page.edithistory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.MenuItemCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.adapter.PagingDataAdapterPatched;
import org.wikipedia.databinding.ActivityEditHistoryBinding;
import org.wikipedia.databinding.ViewEditHistoryEmptyMessagesBinding;
import org.wikipedia.databinding.ViewEditHistorySearchBarBinding;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.talk.UserTalkPopupHelper;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.EditHistoryFilterOverflowView;
import org.wikipedia.views.EditHistoryStatsView;
import org.wikipedia.views.SearchAndFilterActionProvider;
import org.wikipedia.views.WikiErrorView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 *2\u00020\u0001:\u000e*+,-./01234567B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u001cH\u0002J\u0006\u0010&\u001a\u00020\u001cJ\b\u0010\'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00068"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "editHistoryEmptyMessagesAdapter", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EmptyMessagesAdapter;", "editHistoryListAdapter", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EditHistoryListAdapter;", "editHistorySearchBarAdapter", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchBarAdapter;", "editHistoryStatsAdapter", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$StatsItemAdapter;", "loadFooter", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$LoadingItemAdapter;", "loadHeader", "searchActionModeCallback", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchCallback;", "viewModel", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel;", "getViewModel", "()Lorg/wikipedia/page/edithistory/EditHistoryListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "enableCompareButton", "", "button", "Landroid/widget/TextView;", "enable", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupAdapters", "showFilterOverflowMenu", "startSearchActionMode", "updateCompareState", "updateCompareStateItems", "Companion", "EditHistoryDiffCallback", "EditHistoryListAdapter", "EditHistoryListItemHolder", "EmptyMessagesAdapter", "EmptyMessagesViewHolder", "LoadingItemAdapter", "LoadingViewHolder", "SearchBarAdapter", "SearchBarViewHolder", "SearchCallback", "SeparatorViewHolder", "StatsItemAdapter", "StatsViewHolder", "app.lib"})
public final class EditHistoryListActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityEditHistoryBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.EditHistoryListAdapter editHistoryListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.StatsItemAdapter editHistoryStatsAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarAdapter editHistorySearchBarAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.EmptyMessagesAdapter editHistoryEmptyMessagesAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.LoadingItemAdapter loadHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.LoadingItemAdapter loadFooter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.edithistory.EditHistoryListActivity.SearchCallback searchActionModeCallback = null;
    private static final int VIEW_TYPE_SEPARATOR = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.edithistory.EditHistoryListActivity.Companion Companion = null;
    
    public EditHistoryListActivity() {
        super();
    }
    
    private final org.wikipedia.page.edithistory.EditHistoryListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateCompareState() {
    }
    
    private final void updateCompareStateItems() {
    }
    
    private final void enableCompareButton(android.widget.TextView button, boolean enable) {
    }
    
    private final void setupAdapters() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void startSearchActionMode() {
    }
    
    public final void showFilterOverflowMenu() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_SEPARATOR", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EditHistoryDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    final class EditHistoryDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel> {
        
        public EditHistoryDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EditHistoryListAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class EditHistoryListAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public EditHistoryListAdapter() {
            super(null, null, null);
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EditHistoryListItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/wikipedia/page/edithistory/EditHistoryItemView$Listener;", "view", "Lorg/wikipedia/page/edithistory/EditHistoryItemView;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Lorg/wikipedia/page/edithistory/EditHistoryItemView;)V", "revision", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "bindItem", "", "onClick", "onLongClick", "onToggleSelect", "onUserNameClick", "v", "Landroid/view/View;", "toggleSelectState", "updateSelectState", "app.lib"})
    final class EditHistoryListItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements org.wikipedia.page.edithistory.EditHistoryItemView.Listener {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.page.edithistory.EditHistoryItemView view = null;
        private org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision;
        
        public EditHistoryListItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryItemView view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision) {
        }
        
        @java.lang.Override()
        public void onClick() {
        }
        
        @java.lang.Override()
        public void onLongClick() {
        }
        
        @java.lang.Override()
        public void onUserNameClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public void onToggleSelect() {
        }
        
        private final void toggleSelectState() {
        }
        
        private final void updateSelectState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EmptyMessagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EmptyMessagesViewHolder;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class EmptyMessagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.page.edithistory.EditHistoryListActivity.EmptyMessagesViewHolder> {
        
        public EmptyMessagesAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListActivity.EmptyMessagesViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.page.edithistory.EditHistoryListActivity.EmptyMessagesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$EmptyMessagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "app.lib"})
    final class EmptyMessagesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ViewEditHistoryEmptyMessagesBinding binding = null;
        
        public EmptyMessagesViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ViewEditHistoryEmptyMessagesBinding getBinding() {
            return null;
        }
        
        public final void bindItem() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$LoadingItemAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$LoadingViewHolder;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity;", "retry", "Lkotlin/Function0;", "", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app.lib"})
    final class LoadingItemAdapter extends androidx.paging.LoadStateAdapter<org.wikipedia.page.edithistory.EditHistoryListActivity.LoadingViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
        
        public LoadingItemAdapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListActivity.LoadingViewHolder holder, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.page.edithistory.EditHistoryListActivity.LoadingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Landroid/view/View;)V", "bindItem", "", "loadState", "Landroidx/paging/LoadState;", "retry", "Lkotlin/Function0;", "app.lib"})
    final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0005\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchBarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchBarViewHolder;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;)V", "viewHolder", "getViewHolder", "()Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchBarViewHolder;", "setViewHolder", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchBarViewHolder;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class SearchBarAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarViewHolder> {
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarViewHolder viewHolder;
        
        public SearchBarAdapter() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarViewHolder getViewHolder() {
            return null;
        }
        
        public final void setViewHolder(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarViewHolder p0) {
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.page.edithistory.EditHistoryListActivity.SearchBarViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchBarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "updateFilterCount", "app.lib"})
    final class SearchBarViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ViewEditHistorySearchBarBinding binding = null;
        
        public SearchBarViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ViewEditHistorySearchBarBinding getBinding() {
            return null;
        }
        
        public final void bindItem() {
        }
        
        private final void updateFilterCount() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0014J\u0006\u0010\u001b\u001a\u00020\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;)V", "searchAndFilterActionProvider", "Lorg/wikipedia/views/SearchAndFilterActionProvider;", "getSearchAndFilterActionProvider", "()Lorg/wikipedia/views/SearchAndFilterActionProvider;", "setSearchAndFilterActionProvider", "(Lorg/wikipedia/views/SearchAndFilterActionProvider;)V", "searchBarFilterIcon", "error/NonExistentClass", "getSearchBarFilterIcon", "()Lerror/NonExistentClass;", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "updateFilterIconAndText", "app.lib"})
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getSearchBarFilterIcon() {
            return null;
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
        
        public final void updateFilterIconAndText() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$SeparatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Landroid/view/View;)V", "bindItem", "", "listItem", "", "app.lib"})
    final class SeparatorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public SeparatorViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String listItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$StatsItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity$StatsViewHolder;", "Lorg/wikipedia/page/edithistory/EditHistoryListActivity;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class StatsItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.page.edithistory.EditHistoryListActivity.StatsViewHolder> {
        
        public StatsItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.edithistory.EditHistoryListActivity.StatsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.page.edithistory.EditHistoryListActivity.StatsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListActivity$StatsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lorg/wikipedia/views/EditHistoryStatsView;", "(Lorg/wikipedia/page/edithistory/EditHistoryListActivity;Lorg/wikipedia/views/EditHistoryStatsView;)V", "bindItem", "", "app.lib"})
    final class StatsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.views.EditHistoryStatsView view = null;
        
        public StatsViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.EditHistoryStatsView view) {
            super(null);
        }
        
        public final void bindItem() {
        }
    }
}