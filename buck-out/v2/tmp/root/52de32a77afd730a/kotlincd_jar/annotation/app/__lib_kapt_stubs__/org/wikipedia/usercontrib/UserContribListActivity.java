package org.wikipedia.usercontrib;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.view.ActionMode;
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
import org.wikipedia.databinding.ActivityUserContribBinding;
import org.wikipedia.databinding.ViewEditHistoryEmptyMessagesBinding;
import org.wikipedia.databinding.ViewEditHistorySearchBarBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.UserContribution;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.talk.UserTalkPopupHelper;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.SearchAndFilterActionProvider;
import org.wikipedia.views.WikiErrorView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 (2\u00020\u0001:\u000f()*+,-./0123456B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020#H\u0002J\b\u0010\'\u001a\u00020#H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00067"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "launchFilterActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "linkHandler", "Lorg/wikipedia/usercontrib/UserContribListActivity$UserContribLinkHandler;", "linkMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "loadFooter", "Lorg/wikipedia/usercontrib/UserContribListActivity$LoadingItemAdapter;", "loadHeader", "searchActionModeCallback", "Lorg/wikipedia/usercontrib/UserContribListActivity$SearchCallback;", "userContribEmptyMessagesAdapter", "Lorg/wikipedia/usercontrib/UserContribListActivity$EmptyMessagesAdapter;", "userContribListAdapter", "Lorg/wikipedia/usercontrib/UserContribListActivity$UserContribListAdapter;", "userContribSearchBarAdapter", "Lorg/wikipedia/usercontrib/UserContribListActivity$SearchBarAdapter;", "userContribStatsAdapter", "Lorg/wikipedia/usercontrib/UserContribListActivity$StatsItemAdapter;", "viewModel", "Lorg/wikipedia/usercontrib/UserContribListViewModel;", "getViewModel", "()Lorg/wikipedia/usercontrib/UserContribListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupAdapters", "startSearchActionMode", "Companion", "EmptyMessagesAdapter", "EmptyMessagesViewHolder", "LoadingItemAdapter", "LoadingViewHolder", "SearchBarAdapter", "SearchBarViewHolder", "SearchCallback", "SeparatorViewHolder", "StatsItemAdapter", "StatsViewHolder", "UserContribDiffCallback", "UserContribLinkHandler", "UserContribListAdapter", "UserContribListItemHolder", "app.lib"})
public final class UserContribListActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityUserContribBinding binding;
    private org.wikipedia.usercontrib.UserContribListActivity.UserContribLinkHandler linkHandler;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.UserContribListAdapter userContribListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.StatsItemAdapter userContribStatsAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.SearchBarAdapter userContribSearchBarAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.EmptyMessagesAdapter userContribEmptyMessagesAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.LoadingItemAdapter loadHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.LoadingItemAdapter loadFooter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.usercontrib.UserContribListActivity.SearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt linkMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launchFilterActivity = null;
    private static final int VIEW_TYPE_SEPARATOR = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_USER_NAME = "userName";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.usercontrib.UserContribListActivity.Companion Companion = null;
    
    public UserContribListActivity() {
        super();
    }
    
    private final org.wikipedia.usercontrib.UserContribListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupAdapters() {
    }
    
    private final void startSearchActionMode() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$Companion;", "", "()V", "INTENT_EXTRA_USER_NAME", "", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_SEPARATOR", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "userName", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String userName) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$EmptyMessagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/usercontrib/UserContribListActivity$EmptyMessagesViewHolder;", "Lorg/wikipedia/usercontrib/UserContribListActivity;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class EmptyMessagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.usercontrib.UserContribListActivity.EmptyMessagesViewHolder> {
        
        public EmptyMessagesAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListActivity.EmptyMessagesViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.usercontrib.UserContribListActivity.EmptyMessagesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$EmptyMessagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$LoadingItemAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lorg/wikipedia/usercontrib/UserContribListActivity$LoadingViewHolder;", "Lorg/wikipedia/usercontrib/UserContribListActivity;", "retry", "Lkotlin/Function0;", "", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app.lib"})
    final class LoadingItemAdapter extends androidx.paging.LoadStateAdapter<org.wikipedia.usercontrib.UserContribListActivity.LoadingViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
        
        public LoadingItemAdapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListActivity.LoadingViewHolder holder, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.usercontrib.UserContribListActivity.LoadingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Landroid/view/View;)V", "bindItem", "", "loadState", "Landroidx/paging/LoadState;", "retry", "Lkotlin/Function0;", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0005\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$SearchBarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/usercontrib/UserContribListActivity$SearchBarViewHolder;", "Lorg/wikipedia/usercontrib/UserContribListActivity;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;)V", "viewHolder", "getViewHolder", "()Lorg/wikipedia/usercontrib/UserContribListActivity$SearchBarViewHolder;", "setViewHolder", "(Lorg/wikipedia/usercontrib/UserContribListActivity$SearchBarViewHolder;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class SearchBarAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.usercontrib.UserContribListActivity.SearchBarViewHolder> {
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.usercontrib.UserContribListActivity.SearchBarViewHolder viewHolder;
        
        public SearchBarAdapter() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.usercontrib.UserContribListActivity.SearchBarViewHolder getViewHolder() {
            return null;
        }
        
        public final void setViewHolder(@org.jetbrains.annotations.Nullable()
        org.wikipedia.usercontrib.UserContribListActivity.SearchBarViewHolder p0) {
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListActivity.SearchBarViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.usercontrib.UserContribListActivity.SearchBarViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$SearchBarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "updateFilterCount", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;)V", "searchAndFilterActionProvider", "Lorg/wikipedia/views/SearchAndFilterActionProvider;", "getSearchAndFilterActionProvider", "()Lorg/wikipedia/views/SearchAndFilterActionProvider;", "setSearchAndFilterActionProvider", "(Lorg/wikipedia/views/SearchAndFilterActionProvider;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$SeparatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Landroid/view/View;)V", "bindItem", "", "listItem", "", "app.lib"})
    final class SeparatorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public SeparatorViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String listItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$StatsItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/usercontrib/UserContribListActivity$StatsViewHolder;", "Lorg/wikipedia/usercontrib/UserContribListActivity;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class StatsItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.usercontrib.UserContribListActivity.StatsViewHolder> {
        
        public StatsItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListActivity.StatsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.usercontrib.UserContribListActivity.StatsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$StatsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lorg/wikipedia/usercontrib/UserContribStatsView;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Lorg/wikipedia/usercontrib/UserContribStatsView;)V", "bindItem", "", "app.lib"})
    final class StatsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.usercontrib.UserContribStatsView view = null;
        
        public StatsViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribStatsView view) {
            super(null);
        }
        
        public final void bindItem() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$UserContribDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    final class UserContribDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel> {
        
        public UserContribDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$UserContribLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "context", "Landroid/content/Context;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Landroid/content/Context;)V", "lastX", "", "lastY", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onInternalLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "onUrlClick", "url", "", "linkText", "x", "y", "app.lib"})
    public final class UserContribLinkHandler extends org.wikipedia.page.LinkHandler {
        private int lastX = 0;
        private int lastY = 0;
        public org.wikipedia.dataclient.WikiSite wikiSite;
        
        public UserContribLinkHandler(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        public final void onUrlClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText, int x, int y) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.dataclient.WikiSite getWikiSite() {
            return null;
        }
        
        @java.lang.Override()
        public void setWikiSite(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite p0) {
        }
        
        @java.lang.Override()
        public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$UserContribListAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class UserContribListAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public UserContribListAdapter() {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListActivity$UserContribListItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/wikipedia/usercontrib/UserContribItemView$Listener;", "view", "Lorg/wikipedia/usercontrib/UserContribItemView;", "(Lorg/wikipedia/usercontrib/UserContribListActivity;Lorg/wikipedia/usercontrib/UserContribItemView;)V", "contrib", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "bindItem", "", "onClick", "app.lib"})
    final class UserContribListItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements org.wikipedia.usercontrib.UserContribItemView.Listener {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.usercontrib.UserContribItemView view = null;
        private org.wikipedia.dataclient.mwapi.UserContribution contrib;
        
        public UserContribListItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribItemView view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.UserContribution contrib) {
        }
        
        @java.lang.Override()
        public void onClick() {
        }
    }
}