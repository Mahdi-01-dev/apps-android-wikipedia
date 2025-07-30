package org.wikipedia.readinglist;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.databinding.DialogAddToReadingListBinding;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 >2\u00020\u0001:\u0005>?@ABB\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00152\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010\u001fH\u0002J\u001e\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001fH\u0016J\b\u0010,\u001a\u00020)H\u0016J\u0012\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00106\u001a\u00020)H\u0016J\b\u00107\u001a\u00020)H\u0016J\b\u00108\u001a\u00020)H\u0002J\u0016\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020)H\u0003R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lorg/wikipedia/readinglist/AddToReadingListDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "adapter", "Lorg/wikipedia/readinglist/AddToReadingListDialog$ReadingListAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "createClickListener", "Lorg/wikipedia/readinglist/AddToReadingListDialog$CreateButtonClickListener;", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "displayedLists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "setInvokeSource", "(Lorg/wikipedia/Constants$InvokeSource;)V", "listItemCallback", "Lorg/wikipedia/readinglist/AddToReadingListDialog$ReadingListItemCallback;", "readingLists", "", "getReadingLists", "()Ljava/util/List;", "setReadingLists", "(Ljava/util/List;)V", "showDefaultList", "", "titles", "Lorg/wikipedia/page/PageTitle;", "addAndDismiss", "", "readingList", "commitChanges", "dismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "showCreateListDialog", "showViewListSnackBar", "list", "message", "", "updateLists", "Companion", "CreateButtonClickListener", "ReadingListAdapter", "ReadingListItemCallback", "ReadingListItemHolder", "app.lib"})
public class AddToReadingListDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private DialogAddToReadingListBinding _binding;
    private java.util.List<org.wikipedia.page.PageTitle> titles;
    private org.wikipedia.readinglist.AddToReadingListDialog.ReadingListAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.AddToReadingListDialog.CreateButtonClickListener createClickListener = null;
    private boolean showDefaultList = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.readinglist.database.ReadingList> displayedLists = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.AddToReadingListDialog.ReadingListItemCallback listItemCallback = null;
    public org.wikipedia.Constants.InvokeSource invokeSource;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists;
    @org.jetbrains.annotations.Nullable()
    private android.content.DialogInterface.OnDismissListener dismissListener;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_TITLE_LIST = "pageTitleList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_DEFAULT_LIST = "showDefaultList";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.AddToReadingListDialog.Companion Companion = null;
    
    public AddToReadingListDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    public final void setInvokeSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.database.ReadingList> getReadingLists() {
        return null;
    }
    
    public final void setReadingLists(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.DialogInterface.OnDismissListener getDismissListener() {
        return null;
    }
    
    public final void setDismissListener(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener p0) {
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void updateLists() {
    }
    
    private final void showCreateListDialog() {
    }
    
    private final void addAndDismiss(org.wikipedia.readinglist.database.ReadingList readingList, java.util.List<org.wikipedia.page.PageTitle> titles) {
    }
    
    public void commitChanges(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> titles) {
    }
    
    public final void showViewListSnackBar(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/readinglist/AddToReadingListDialog$Companion;", "", "()V", "PAGE_TITLE_LIST", "", "SHOW_DEFAULT_LIST", "newInstance", "Lorg/wikipedia/readinglist/AddToReadingListDialog;", "titles", "", "Lorg/wikipedia/page/PageTitle;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "listener", "Landroid/content/DialogInterface$OnDismissListener;", "title", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.AddToReadingListDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
        android.content.DialogInterface.OnDismissListener listener) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.AddToReadingListDialog newInstance(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> titles, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
        android.content.DialogInterface.OnDismissListener listener) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/AddToReadingListDialog$CreateButtonClickListener;", "Landroid/view/View$OnClickListener;", "(Lorg/wikipedia/readinglist/AddToReadingListDialog;)V", "onClick", "", "v", "Landroid/view/View;", "app.lib"})
    final class CreateButtonClickListener implements android.view.View.OnClickListener {
        
        public CreateButtonClickListener() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/AddToReadingListDialog$ReadingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/readinglist/AddToReadingListDialog$ReadingListItemHolder;", "(Lorg/wikipedia/readinglist/AddToReadingListDialog;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class ReadingListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.readinglist.AddToReadingListDialog.ReadingListItemHolder> {
        
        public ReadingListAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.readinglist.AddToReadingListDialog.ReadingListItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.AddToReadingListDialog.ReadingListItemHolder holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.AddToReadingListDialog.ReadingListItemHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.AddToReadingListDialog.ReadingListItemHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/AddToReadingListDialog$ReadingListItemCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/AddToReadingListDialog;)V", "onClick", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "app.lib"})
    final class ReadingListItemCallback implements org.wikipedia.readinglist.ReadingListItemView.Callback {
        
        public ReadingListItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onAbout() {
        }
        
        @java.lang.Override()
        public void onChecked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onCustomize() {
        }
        
        @java.lang.Override()
        public void onDelete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onNotification() {
        }
        
        @java.lang.Override()
        public void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onRename(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSaveToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSelectList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onShare(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0005\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/readinglist/AddToReadingListDialog$ReadingListItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "(Lorg/wikipedia/readinglist/ReadingListItemView;)V", "view", "getView", "()Lorg/wikipedia/readinglist/ReadingListItemView;", "bindItem", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "app.lib"})
    static final class ReadingListItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ReadingListItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.ReadingListItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListItemView getView() {
            return null;
        }
    }
}