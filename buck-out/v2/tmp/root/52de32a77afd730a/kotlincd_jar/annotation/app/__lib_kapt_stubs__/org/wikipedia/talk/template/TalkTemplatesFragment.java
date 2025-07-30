package org.wikipedia.talk.template;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.tabs.TabLayout;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.FragmentTalkTemplatesBinding;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.staticdata.TalkAliasData;
import org.wikipedia.talk.TalkReplyActivity;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.MultiSelectActionModeCallback;
import org.wikipedia.views.SwipeableItemTouchHelperCallback;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 I2\u00020\u0001:\u0005IJKLMB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020$H\u0002J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020$H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u00020$H\u0002J\u001a\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\u0007H\u0002J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020$H\u0002J\b\u0010A\u001a\u00020$H\u0002J\b\u0010B\u001a\u00020$H\u0002J\u0010\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020\u000fH\u0002J\b\u0010E\u001a\u00020$H\u0002J\u0006\u0010F\u001a\u00020$J\b\u0010G\u001a\u00020$H\u0002J\b\u0010H\u001a\u00020$H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006N"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/talk/template/TalkTemplatesFragment$RecyclerAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "deletedItems", "", "Lorg/wikipedia/talk/db/TalkTemplate;", "itemSwipeTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "multiSelectCallback", "Lorg/wikipedia/talk/template/TalkTemplatesFragment$MultiSelectCallback;", "requestEditTemplate", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestNewTemplate", "selectedItems", "touchCallback", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback;", "viewModel", "Lorg/wikipedia/talk/template/TalkTemplatesViewModel;", "getViewModel", "()Lorg/wikipedia/talk/template/TalkTemplatesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "beginRemoveItemsMode", "", "deleteSelectedTalkTemplates", "onActionError", "t", "", "onAdded", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleted", "size", "", "onDestroyView", "onError", "onLoading", "onSuccess", "onViewCreated", "view", "selectAllTalkTemplates", "mode", "setMultiSelectEnabled", "enabled", "", "setRecyclerView", "setToolbarTitle", "setUpTouchListeners", "toggleSelectedItem", "talkTemplate", "unselectAllTalkTemplates", "updateAndNotifyAdapter", "updateEmptyState", "updateToolbarEditButton", "Companion", "MultiSelectCallback", "RearrangeableItemTouchHelperCallback", "RecyclerAdapter", "TalkTemplatesItemViewHolder", "app.lib"})
public final class TalkTemplatesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentTalkTemplatesBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private androidx.recyclerview.widget.ItemTouchHelper itemSwipeTouchHelper;
    private org.wikipedia.views.SwipeableItemTouchHelperCallback touchCallback;
    private org.wikipedia.talk.template.TalkTemplatesFragment.RecyclerAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.talk.db.TalkTemplate> selectedItems = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.talk.db.TalkTemplate> deletedItems = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.template.TalkTemplatesFragment.MultiSelectCallback multiSelectCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestNewTemplate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEditTemplate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.template.TalkTemplatesFragment.Companion Companion = null;
    
    public TalkTemplatesFragment() {
        super();
    }
    
    private final org.wikipedia.talk.template.TalkTemplatesViewModel getViewModel() {
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
    
    private final void updateToolbarEditButton() {
    }
    
    private final void setToolbarTitle() {
    }
    
    private final void setUpTouchListeners() {
    }
    
    private final void updateEmptyState() {
    }
    
    public final void updateAndNotifyAdapter() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void onLoading() {
    }
    
    private final void onSuccess() {
    }
    
    private final void onDeleted(int size) {
    }
    
    private final void onAdded() {
    }
    
    private final void onActionError(java.lang.Throwable t) {
    }
    
    private final void onError(java.lang.Throwable t) {
    }
    
    private final void setMultiSelectEnabled(boolean enabled) {
    }
    
    private final void beginRemoveItemsMode() {
    }
    
    private final void toggleSelectedItem(org.wikipedia.talk.db.TalkTemplate talkTemplate) {
    }
    
    private final void unselectAllTalkTemplates() {
    }
    
    private final void selectAllTalkTemplates(androidx.appcompat.view.ActionMode mode) {
    }
    
    private final void deleteSelectedTalkTemplates() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/talk/template/TalkTemplatesFragment;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "templateManagement", "", "fromRevisionId", "", "toRevisionId", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.talk.template.TalkTemplatesFragment newInstance(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, boolean templateManagement, long fromRevisionId, long toRevisionId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesFragment$MultiSelectCallback;", "Lorg/wikipedia/views/MultiSelectActionModeCallback;", "(Lorg/wikipedia/talk/template/TalkTemplatesFragment;)V", "onActionItemClicked", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteSelected", "", "onDestroyActionMode", "onPrepareActionMode", "app.lib"})
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesFragment$RearrangeableItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "adapter", "Lorg/wikipedia/talk/template/TalkTemplatesFragment$RecyclerAdapter;", "Lorg/wikipedia/talk/template/TalkTemplatesFragment;", "(Lorg/wikipedia/talk/template/TalkTemplatesFragment;Lorg/wikipedia/talk/template/TalkTemplatesFragment$RecyclerAdapter;)V", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getMovementFlags", "", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onMove", "source", "target", "onSwiped", "direction", "app.lib"})
    final class RearrangeableItemTouchHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.talk.template.TalkTemplatesFragment.RecyclerAdapter adapter = null;
        
        public RearrangeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.template.TalkTemplatesFragment.RecyclerAdapter adapter) {
            super();
        }
        
        @java.lang.Override()
        public boolean isLongPressDragEnabled() {
            return false;
        }
        
        @java.lang.Override()
        public boolean isItemViewSwipeEnabled() {
            return false;
        }
        
        @java.lang.Override()
        public void onSwiped(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
        }
        
        @java.lang.Override()
        public int getMovementFlags(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return 0;
        }
        
        @java.lang.Override()
        public boolean onMove(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder source, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
            return false;
        }
        
        @java.lang.Override()
        @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
        public void clearView(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0016\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010J\u0014\u0010!\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u0003H\u0016J\u0014\u0010\"\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesFragment$RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/talk/template/TalkTemplatesFragment$TalkTemplatesItemViewHolder;", "Lorg/wikipedia/talk/template/TalkTemplatesFragment;", "Lorg/wikipedia/talk/template/TalkTemplatesItemView$Callback;", "(Lorg/wikipedia/talk/template/TalkTemplatesFragment;)V", "checkboxEnabled", "", "templatesList", "", "Lorg/wikipedia/talk/db/TalkTemplate;", "getTemplatesList", "()Ljava/util/List;", "setTemplatesList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCheckboxEnabled", "enabled", "onCheckedChanged", "onClick", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onLongPress", "onMoveItem", "oldPosition", "newPosition", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.talk.template.TalkTemplatesFragment.TalkTemplatesItemViewHolder> implements org.wikipedia.talk.template.TalkTemplatesItemView.Callback {
        private boolean checkboxEnabled = false;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<org.wikipedia.talk.db.TalkTemplate> templatesList;
        
        public RecyclerAdapter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.talk.db.TalkTemplate> getTemplatesList() {
            return null;
        }
        
        public final void setTemplatesList(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.talk.db.TalkTemplate> p0) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.template.TalkTemplatesFragment.TalkTemplatesItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.template.TalkTemplatesFragment.TalkTemplatesItemViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.template.TalkTemplatesFragment.TalkTemplatesItemViewHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.template.TalkTemplatesFragment.TalkTemplatesItemViewHolder holder) {
        }
        
        @java.lang.Override()
        public void onClick(int position) {
        }
        
        @java.lang.Override()
        public void onCheckedChanged(int position) {
        }
        
        @java.lang.Override()
        public void onLongPress(int position) {
        }
        
        public final void onMoveItem(int oldPosition, int newPosition) {
        }
        
        public final void onCheckboxEnabled(boolean enabled) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesFragment$TalkTemplatesItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "templatesItemView", "Lorg/wikipedia/talk/template/TalkTemplatesItemView;", "(Lorg/wikipedia/talk/template/TalkTemplatesFragment;Lorg/wikipedia/talk/template/TalkTemplatesItemView;)V", "entry", "Lorg/wikipedia/talk/db/TalkTemplate;", "getTemplatesItemView", "()Lorg/wikipedia/talk/template/TalkTemplatesItemView;", "bindItem", "", "item", "position", "", "isSwipeable", "", "onSwipe", "app.lib"})
    public final class TalkTemplatesItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.talk.template.TalkTemplatesItemView templatesItemView = null;
        private org.wikipedia.talk.db.TalkTemplate entry;
        
        public TalkTemplatesItemViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.template.TalkTemplatesItemView templatesItemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.talk.template.TalkTemplatesItemView getTemplatesItemView() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.db.TalkTemplate item, int position) {
        }
        
        @java.lang.Override()
        public void onSwipe() {
        }
        
        @java.lang.Override()
        public boolean isSwipeable() {
            return false;
        }
    }
}