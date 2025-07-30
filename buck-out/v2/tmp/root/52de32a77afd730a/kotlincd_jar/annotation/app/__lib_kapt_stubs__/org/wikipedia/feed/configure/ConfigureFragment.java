package org.wikipedia.feed.configure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.FragmentFeedConfigureBinding;
import org.wikipedia.feed.FeedContentType;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.SettingsActivity;
import org.wikipedia.util.Resource;
import org.wikipedia.util.log.L;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.DrawableItemDecoration;
import java.util.Collections;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u0004789:B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u0017H\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0017H\u0016J\u001a\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u00103\u001a\u00020\u0017H\u0002J\b\u00104\u001a\u00020\u0017H\u0002J\b\u00105\u001a\u00020\u0017H\u0002J\b\u00106\u001a\u00020\u0017H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006;"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "orderedContentTypes", "", "Lorg/wikipedia/feed/FeedContentType;", "viewModel", "Lorg/wikipedia/feed/configure/ConfigureViewModel;", "getViewModel", "()Lorg/wikipedia/feed/configure/ConfigureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCheckedChanged", "", "contentType", "checked", "", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onError", "throwable", "", "onLanguagesChanged", "onLoading", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onViewCreated", "view", "prepareContentTypeList", "setupRecyclerView", "touch", "updateItemOrder", "Companion", "ConfigureItemAdapter", "ConfigureItemHolder", "RearrangeableItemTouchHelperCallback", "app.lib"})
public final class ConfigureFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider, org.wikipedia.feed.configure.ConfigureItemView.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentFeedConfigureBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.FeedContentType> orderedContentTypes = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.configure.ConfigureFragment.Companion Companion = null;
    
    public ConfigureFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.feed.configure.ConfigureViewModel getViewModel() {
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
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void prepareContentTypeList() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void onLoading() {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.FeedContentType contentType, boolean checked) {
    }
    
    @java.lang.Override()
    public void onLanguagesChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.FeedContentType contentType) {
    }
    
    private final void updateItemOrder() {
    }
    
    private final void touch() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/feed/configure/ConfigureFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.configure.ConfigureFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0014\u0010\u0012\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u0003H\u0016J\u0014\u0010\u0013\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u0003H\u0016\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureFragment$ConfigureItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/feed/configure/ConfigureFragment$ConfigureItemHolder;", "Lorg/wikipedia/feed/configure/ConfigureFragment;", "(Lorg/wikipedia/feed/configure/ConfigureFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "onMoveItem", "oldPosition", "newPosition", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class ConfigureItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemHolder> {
        
        public ConfigureItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemHolder holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemHolder holder) {
        }
        
        public final void onMoveItem(int oldPosition, int newPosition) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureFragment$ConfigureItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/feed/configure/ConfigureItemView;", "itemView", "(Lorg/wikipedia/feed/configure/ConfigureFragment;Lorg/wikipedia/feed/configure/ConfigureItemView;)V", "bindItem", "", "contentType", "Lorg/wikipedia/feed/FeedContentType;", "app.lib"})
    final class ConfigureItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.configure.ConfigureItemView> {
        
        public ConfigureItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.configure.ConfigureItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.FeedContentType contentType) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureFragment$RearrangeableItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "adapter", "Lorg/wikipedia/feed/configure/ConfigureFragment$ConfigureItemAdapter;", "Lorg/wikipedia/feed/configure/ConfigureFragment;", "(Lorg/wikipedia/feed/configure/ConfigureFragment;Lorg/wikipedia/feed/configure/ConfigureFragment$ConfigureItemAdapter;)V", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onMove", "source", "target", "onSwiped", "", "direction", "app.lib"})
    final class RearrangeableItemTouchHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemAdapter adapter = null;
        
        public RearrangeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.configure.ConfigureFragment.ConfigureItemAdapter adapter) {
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
    }
}