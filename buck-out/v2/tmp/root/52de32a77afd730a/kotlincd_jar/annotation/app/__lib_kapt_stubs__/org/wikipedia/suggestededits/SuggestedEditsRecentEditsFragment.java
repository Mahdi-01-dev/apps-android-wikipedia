package org.wikipedia.suggestededits;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.MenuProvider;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.adapter.PagingDataAdapterPatched;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.FragmentSuggestedEditsRecentEditsBinding;
import org.wikipedia.databinding.ViewEditHistoryEmptyMessagesBinding;
import org.wikipedia.databinding.ViewEditHistorySearchBarBinding;
import org.wikipedia.dataclient.mwapi.MwQueryResult;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.notifications.NotificationActivity;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.talk.UserTalkPopupHelper;
import org.wikipedia.talk.template.TalkTemplatesActivity;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.NotificationButtonView;
import org.wikipedia.views.SearchAndFilterActionProvider;
import org.wikipedia.views.WikiErrorView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 A2\u00020\u00012\u00020\u0002:\fABCDEFGHIJKLB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010\'\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020$H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u00106\u001a\u00020$H\u0016J\u001a\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0018\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002J\u000e\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u000202R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006M"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "getBinding", "()Lerror/NonExistentClass;", "launchFilterActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loadFooter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$LoadingItemAdapter;", "loadHeader", "notificationButtonView", "Lorg/wikipedia/views/NotificationButtonView;", "recentEditsEmptyMessagesAdapter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$EmptyMessagesAdapter;", "recentEditsListAdapter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$RecentEditsListAdapter;", "recentEditsSearchBarAdapter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SearchBarAdapter;", "searchActionModeCallback", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SearchCallback;", "viewModel", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel;", "getViewModel", "()Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onMenuItemSelected", "", "menuItem", "Landroid/view/MenuItem;", "onPrepareMenu", "onResume", "onViewCreated", "view", "sendPatrollerExperienceEvent", "action", "", "activeInterface", "setupAdapters", "startSearchActionMode", "updateNotificationDot", "animate", "Companion", "EmptyMessagesAdapter", "EmptyMessagesViewHolder", "LoadingItemAdapter", "LoadingViewHolder", "RecentEditsDiffCallback", "RecentEditsItemHolder", "RecentEditsListAdapter", "SearchBarAdapter", "SearchBarViewHolder", "SearchCallback", "SeparatorViewHolder", "app.lib"})
public final class SuggestedEditsRecentEditsFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsRecentEditsBinding _binding;
    private org.wikipedia.views.NotificationButtonView notificationButtonView;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.RecentEditsListAdapter recentEditsListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.SearchBarAdapter recentEditsSearchBarAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.EmptyMessagesAdapter recentEditsEmptyMessagesAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.LoadingItemAdapter loadHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.LoadingItemAdapter loadFooter = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.SearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launchFilterActivity = null;
    private static final int VIEW_TYPE_SEPARATOR = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.Companion Companion = null;
    
    public SuggestedEditsRecentEditsFragment() {
        super();
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel getViewModel() {
        return null;
    }
    
    private final java.lang.Object getBinding() {
        return null;
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    public final void updateNotificationDot(boolean animate) {
    }
    
    private final void setupAdapters() {
    }
    
    private final void startSearchActionMode() {
    }
    
    private final void sendPatrollerExperienceEvent(java.lang.String action, java.lang.String activeInterface) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_SEPARATOR", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$EmptyMessagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$EmptyMessagesViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class EmptyMessagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.EmptyMessagesViewHolder> {
        
        public EmptyMessagesAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.EmptyMessagesViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.EmptyMessagesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$EmptyMessagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$LoadingItemAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$LoadingViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;", "retry", "Lkotlin/Function0;", "", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app.lib"})
    final class LoadingItemAdapter extends androidx.paging.LoadStateAdapter<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.LoadingViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
        
        public LoadingItemAdapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.LoadingViewHolder holder, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.LoadingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;Landroid/view/View;)V", "bindItem", "", "loadState", "Landroidx/paging/LoadState;", "retry", "Lkotlin/Function0;", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$RecentEditsDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItemModel;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    @kotlin.Suppress(names = {"KotlinConstantConditions"})
    final class RecentEditsDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel> {
        
        public RecentEditsDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$RecentEditsItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView$Callback;", "view", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView;)V", "recentChange", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "bindItem", "", "onItemClick", "item", "onUserClick", "Landroid/view/View;", "app.lib"})
    final class RecentEditsItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements org.wikipedia.suggestededits.SuggestedEditsRecentEditsItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsItemView view = null;
        private org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange recentChange;
        
        public RecentEditsItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsItemView view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange recentChange) {
        }
        
        @java.lang.Override()
        public void onItemClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item) {
        }
        
        @java.lang.Override()
        public void onUserClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$RecentEditsListAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItemModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class RecentEditsListAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public RecentEditsListAdapter() {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SearchBarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SearchBarViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class SearchBarAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.SearchBarViewHolder> {
        
        public SearchBarAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.SearchBarViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment.SearchBarViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SearchBarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "updateFilterCount", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0014J\u0006\u0010\u0017\u001a\u00020\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;)V", "searchAndFilterActionProvider", "Lorg/wikipedia/views/SearchAndFilterActionProvider;", "getSearchAndFilterActionProvider", "()Lorg/wikipedia/views/SearchAndFilterActionProvider;", "setSearchAndFilterActionProvider", "(Lorg/wikipedia/views/SearchAndFilterActionProvider;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "refreshProvider", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment$SeparatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;Landroid/view/View;)V", "bindItem", "", "listItem", "", "app.lib"})
    final class SeparatorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public SeparatorViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String listItem) {
        }
    }
}