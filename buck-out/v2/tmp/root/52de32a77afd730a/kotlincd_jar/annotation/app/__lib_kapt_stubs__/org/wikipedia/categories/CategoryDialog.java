package org.wikipedia.categories;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.databinding.DialogCategoriesBinding;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.PageItemView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0004\u001f !\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/categories/CategoryDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "itemCallback", "Lorg/wikipedia/categories/CategoryDialog$ItemCallback;", "viewModel", "Lorg/wikipedia/categories/CategoryDialogViewModel;", "getViewModel", "()Lorg/wikipedia/categories/CategoryDialogViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "layOutCategories", "", "categoryList", "", "Lorg/wikipedia/page/PageTitle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "CategoryAdapter", "CategoryItemHolder", "Companion", "ItemCallback", "app.lib"})
public final class CategoryDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private DialogCategoriesBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.categories.CategoryDialog.ItemCallback itemCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.categories.CategoryDialog.Companion Companion = null;
    
    public CategoryDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.categories.CategoryDialogViewModel getViewModel() {
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
    public void onDestroy() {
    }
    
    private final void layOutCategories(java.util.List<org.wikipedia.page.PageTitle> categoryList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u0003H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u0003H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/categories/CategoryDialog$CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/categories/CategoryDialog$CategoryItemHolder;", "Lorg/wikipedia/categories/CategoryDialog;", "categoryList", "", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/categories/CategoryDialog;Ljava/util/List;)V", "getCategoryList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.categories.CategoryDialog.CategoryItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.page.PageTitle> categoryList = null;
        
        public CategoryAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> categoryList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.page.PageTitle> getCategoryList() {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.categories.CategoryDialog.CategoryItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.categories.CategoryDialog.CategoryItemHolder holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.categories.CategoryDialog.CategoryItemHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.categories.CategoryDialog.CategoryItemHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/categories/CategoryDialog$CategoryItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/categories/CategoryDialog;Lorg/wikipedia/views/PageItemView;)V", "getView", "()Lorg/wikipedia/views/PageItemView;", "bindItem", "", "title", "app.lib"})
    final class CategoryItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.views.PageItemView<org.wikipedia.page.PageTitle> view = null;
        
        public CategoryItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.page.PageTitle> view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.views.PageItemView<org.wikipedia.page.PageTitle> getView() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/categories/CategoryDialog$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/categories/CategoryDialog;", "title", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.categories.CategoryDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/categories/CategoryDialog$ItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/categories/CategoryDialog;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app.lib"})
    final class ItemCallback implements org.wikipedia.views.PageItemView.Callback<org.wikipedia.page.PageTitle> {
        
        public ItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle item) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle item) {
            return false;
        }
        
        @java.lang.Override()
        public void onActionClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
}