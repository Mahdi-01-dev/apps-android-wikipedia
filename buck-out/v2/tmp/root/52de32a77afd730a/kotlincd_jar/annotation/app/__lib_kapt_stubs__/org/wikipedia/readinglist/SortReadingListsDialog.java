package org.wikipedia.readinglist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.databinding.DialogSortReadingListsBinding;
import org.wikipedia.databinding.ViewReadingListsSortOptionsItemBinding;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001d\u001e\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/readinglist/SortReadingListsDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "adapter", "Lorg/wikipedia/readinglist/SortReadingListsDialog$ReadingListSortAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "chosenSortOption", "", "sortOptions", "", "", "callback", "Lorg/wikipedia/readinglist/SortReadingListsDialog$Callback;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "Callback", "Companion", "ReadingListSortAdapter", "SortItemHolder", "app.lib"})
public final class SortReadingListsDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private DialogSortReadingListsBinding _binding;
    private org.wikipedia.readinglist.SortReadingListsDialog.ReadingListSortAdapter adapter;
    private java.util.List<java.lang.String> sortOptions;
    private int chosenSortOption = 0;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SORT_OPTION = "sortOption";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.SortReadingListsDialog.Companion Companion = null;
    
    public SortReadingListsDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final org.wikipedia.readinglist.SortReadingListsDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/readinglist/SortReadingListsDialog$Callback;", "", "onSortOptionClick", "", "position", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSortOptionClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/SortReadingListsDialog$Companion;", "", "()V", "SORT_OPTION", "", "newInstance", "Lorg/wikipedia/readinglist/SortReadingListsDialog;", "sortOption", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.SortReadingListsDialog newInstance(int sortOption) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/SortReadingListsDialog$ReadingListSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/readinglist/SortReadingListsDialog$SortItemHolder;", "Lorg/wikipedia/readinglist/SortReadingListsDialog;", "(Lorg/wikipedia/readinglist/SortReadingListsDialog;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app.lib"})
    final class ReadingListSortAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.readinglist.SortReadingListsDialog.SortItemHolder> {
        
        public ReadingListSortAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.readinglist.SortReadingListsDialog.SortItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.SortReadingListsDialog.SortItemHolder holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/readinglist/SortReadingListsDialog$SortItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/readinglist/SortReadingListsDialog;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "sortOption", "", "app.lib"})
    final class SortItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ViewReadingListsSortOptionsItemBinding binding = null;
        
        public SortItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ViewReadingListsSortOptionsItemBinding getBinding() {
            return null;
        }
        
        public final void bindItem(int sortOption) {
        }
    }
}