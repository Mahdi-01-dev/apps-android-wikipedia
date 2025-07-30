package org.wikipedia.history;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.BackPressedHandler;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.databinding.FragmentHistoryBinding;
import org.wikipedia.main.MainActivity;
import org.wikipedia.main.MainFragment;
import org.wikipedia.page.PageAvailableOfflineHandler;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.PageItemView;
import org.wikipedia.views.SwipeableItemTouchHelperCallback;
import org.wikipedia.views.WikiCardView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 D2\u00020\u00012\u00020\u0002:\tCDEFGHIJKB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u001c2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0014H\u0002J\b\u00105\u001a\u00020\u001cH\u0002J\b\u00106\u001a\u00020\u001cH\u0016J\b\u00107\u001a\u00020\u001cH\u0016J\u001a\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0006\u0010:\u001a\u00020\u001cJ\b\u0010;\u001a\u00020\u001cH\u0002J\u0016\u0010<\u001a\u00020\u001c2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001401H\u0002J\u0012\u0010>\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\u0012\u0010@\u001a\u00020\u001c2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006L"}, d2 = {"Lorg/wikipedia/history/HistoryFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/history/HistoryFragment$HistoryEntryItemAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "itemCallback", "Lorg/wikipedia/history/HistoryFragment$ItemCallback;", "searchActionModeCallback", "Lorg/wikipedia/history/HistoryFragment$HistorySearchCallback;", "selectedEntries", "", "Lorg/wikipedia/history/HistoryEntry;", "viewModel", "Lorg/wikipedia/history/HistoryViewModel;", "getViewModel", "()Lorg/wikipedia/history/HistoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "beginMultiSelect", "", "callback", "Lorg/wikipedia/history/HistoryFragment$Callback;", "deleteSelectedPages", "finishActionMode", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "throwable", "", "onLoadItemsFinished", "items", "", "", "onPageClick", "entry", "onPagesDeleted", "onPause", "onResume", "onViewCreated", "view", "refresh", "setUpScrollListener", "showDeleteItemsUndoSnackbar", "entries", "toggleSelectPage", "unselectAllPages", "updateEmptyState", "searchQuery", "", "Callback", "Companion", "HeaderViewHolder", "HistoryEntryItemAdapter", "HistoryEntryItemHolder", "HistorySearchCallback", "ItemCallback", "SearchBar", "SearchCardViewHolder", "app.lib"})
public final class HistoryFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler {
    @org.jetbrains.annotations.Nullable()
    private FragmentHistoryBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.history.HistoryFragment.HistoryEntryItemAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.history.HistoryFragment.ItemCallback itemCallback = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.history.HistoryFragment.HistorySearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.wikipedia.history.HistoryEntry> selectedEntries = null;
    private static final int VIEW_TYPE_SEARCH_CARD = 0;
    private static final int VIEW_TYPE_HEADER = 1;
    private static final int VIEW_TYPE_ITEM = 2;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.history.HistoryFragment.Companion Companion = null;
    
    public HistoryFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.history.HistoryViewModel getViewModel() {
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
    
    private final void setUpScrollListener() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    private final void updateEmptyState(java.lang.String searchQuery) {
    }
    
    private final void onPageClick(org.wikipedia.history.HistoryEntry entry) {
    }
    
    private final void finishActionMode() {
    }
    
    private final void beginMultiSelect() {
    }
    
    private final void toggleSelectPage(org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void refresh() {
    }
    
    private final void unselectAllPages() {
    }
    
    private final void deleteSelectedPages() {
    }
    
    private final void onPagesDeleted() {
    }
    
    private final void showDeleteItemsUndoSnackbar(java.util.List<org.wikipedia.history.HistoryEntry> entries) {
    }
    
    private final void onLoadItemsFinished(java.util.List<? extends java.lang.Object> items) {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    private final org.wikipedia.history.HistoryFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$Callback;", "", "onLoadPage", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onLoadPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$Companion;", "", "()V", "VIEW_TYPE_HEADER", "", "VIEW_TYPE_ITEM", "VIEW_TYPE_SEARCH_CARD", "newInstance", "Lorg/wikipedia/history/HistoryFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.history.HistoryFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$HeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "headerText", "Landroid/widget/TextView;", "getHeaderText", "()Landroid/widget/TextView;", "setHeaderText", "(Landroid/widget/TextView;)V", "bindItem", "", "date", "", "app.lib"})
    static final class HeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView headerText;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getHeaderText() {
            return null;
        }
        
        public final void setHeaderText(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String date) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\u001c\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u001c\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0014\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$HistoryEntryItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "(Lorg/wikipedia/history/HistoryFragment;)V", "historyEntries", "", "", "isEmpty", "", "()Z", "clearList", "", "getItemCount", "", "getItemViewType", "position", "getPosition", "entry", "Lorg/wikipedia/history/HistoryEntry;", "hideHeader", "onBindViewHolder", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "setList", "list", "app.lib"})
    final class HistoryEntryItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.Object> historyEntries;
        
        public HistoryEntryItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        public final void setList(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Object> list) {
        }
        
        public final void clearList() {
        }
        
        public final int getPosition(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
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
        
        public final void hideHeader() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$HistoryEntryItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/history/HistoryEntry;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "itemView", "(Lorg/wikipedia/history/HistoryFragment;Lorg/wikipedia/views/PageItemView;)V", "entry", "bindItem", "", "isSwipeable", "", "onSwipe", "app.lib"})
    final class HistoryEntryItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.views.PageItemView<org.wikipedia.history.HistoryEntry>> implements org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
        private org.wikipedia.history.HistoryEntry entry;
        
        public HistoryEntryItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.history.HistoryEntry> itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @java.lang.Override()
        public void onSwipe() {
        }
        
        @java.lang.Override()
        public boolean isSwipeable() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$HistorySearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/history/HistoryFragment;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
    final class HistorySearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        
        public HistorySearchCallback() {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$ItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/history/HistoryEntry;", "(Lorg/wikipedia/history/HistoryFragment;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app.lib"})
    final class ItemCallback implements org.wikipedia.views.PageItemView.Callback<org.wikipedia.history.HistoryEntry> {
        
        public ItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.history.HistoryEntry item) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.history.HistoryEntry item) {
            return false;
        }
        
        @java.lang.Override()
        public void onActionClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.history.HistoryEntry item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$SearchBar;", "", "()V", "app.lib"})
    static final class SearchBar {
        
        public SearchBar() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/history/HistoryFragment$SearchCardViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/history/HistoryFragment;Landroid/view/View;)V", "clearHistoryButton", "Landroid/widget/ImageView;", "historyFilterButton", "adjustSearchCardView", "", "searchCardView", "Lorg/wikipedia/views/WikiCardView;", "bindItem", "app.lib"})
    final class SearchCardViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView historyFilterButton = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView clearHistoryButton = null;
        
        public SearchCardViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem() {
        }
        
        private final void adjustSearchCardView(org.wikipedia.views.WikiCardView searchCardView) {
        }
    }
}