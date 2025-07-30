package org.wikipedia.page.customize;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.databinding.FragmentCustomizeToolbarBinding;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\b !\"#$%&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006("}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "adapter", "Lorg/wikipedia/page/customize/CustomizeToolbarFragment$RecyclerItemAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lorg/wikipedia/page/customize/CustomizeToolbarViewModel;", "getViewModel", "()Lorg/wikipedia/page/customize/CustomizeToolbarViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "setupRecyclerView", "Companion", "DescriptionViewHolder", "EmptyPlaceholderViewHolder", "HeaderViewHolder", "ItemHolder", "RearrangeableItemTouchHelperCallback", "RecyclerItemAdapter", "SetToDefaultViewHolder", "app.lib"})
public final class CustomizeToolbarFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentCustomizeToolbarBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private org.wikipedia.page.customize.CustomizeToolbarFragment.RecyclerItemAdapter adapter;
    public static final int VIEW_TYPE_DESCRIPTION = 0;
    public static final int VIEW_TYPE_HEADER = 1;
    public static final int VIEW_TYPE_ITEM = 2;
    public static final int VIEW_TYPE_SET_TO_DEFAULT = 3;
    public static final int VIEW_TYPE_EMPTY_PLACEHOLDER = 4;
    public static final int TOOLBAR_ITEMS_LIMIT = 5;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.customize.CustomizeToolbarFragment.Companion Companion = null;
    
    public CustomizeToolbarFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.page.customize.CustomizeToolbarViewModel getViewModel() {
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
    
    private final void setupRecyclerView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$Companion;", "", "()V", "TOOLBAR_ITEMS_LIMIT", "", "VIEW_TYPE_DESCRIPTION", "VIEW_TYPE_EMPTY_PLACEHOLDER", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "VIEW_TYPE_SET_TO_DEFAULT", "newInstance", "Lorg/wikipedia/page/customize/CustomizeToolbarFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.customize.CustomizeToolbarFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$DescriptionViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;Landroid/view/View;)V", "app.lib"})
    final class DescriptionViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public DescriptionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$EmptyPlaceholderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;Landroid/view/View;)V", "app.lib"})
    final class EmptyPlaceholderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public EmptyPlaceholderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$HeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;Landroid/view/View;)V", "bindItem", "", "stringRes", "", "app.lib"})
    final class HeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@androidx.annotation.StringRes()
        int stringRes) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$ItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/page/customize/CustomizeToolbarItemView;", "itemView", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;Lorg/wikipedia/page/customize/CustomizeToolbarItemView;)V", "bindItem", "", "pageActionItem", "Lorg/wikipedia/page/action/PageActionItem;", "position", "", "app.lib"})
    final class ItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.page.customize.CustomizeToolbarItemView> {
        
        public ItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.customize.CustomizeToolbarItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.action.PageActionItem pageActionItem, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$RearrangeableItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "adapter", "Lorg/wikipedia/page/customize/CustomizeToolbarFragment$RecyclerItemAdapter;", "Lorg/wikipedia/page/customize/CustomizeToolbarFragment;", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;Lorg/wikipedia/page/customize/CustomizeToolbarFragment$RecyclerItemAdapter;)V", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getMovementFlags", "", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "isMovable", "target", "onMove", "source", "onSwiped", "direction", "app.lib"})
    final class RearrangeableItemTouchHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.page.customize.CustomizeToolbarFragment.RecyclerItemAdapter adapter = null;
        
        public RearrangeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.customize.CustomizeToolbarFragment.RecyclerItemAdapter adapter) {
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
        public void clearView(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }
        
        private final boolean isMovable(androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0017\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$RecyclerItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemMoved", "rearrangedItems", "", "onMoveItem", "oldPosition", "newPosition", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class RecyclerItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> {
        
        public RecyclerItemAdapter() {
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
        
        public final void onMoveItem(int oldPosition, int newPosition) {
        }
        
        public final void onItemMoved(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> rearrangedItems) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarFragment$SetToDefaultViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/page/customize/CustomizeToolbarFragment;Landroid/view/View;)V", "app.lib"})
    final class SetToDefaultViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public SetToDefaultViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}