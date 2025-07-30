package org.wikipedia.readinglist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.databinding.ItemReadingListPreviewSaveSelectItemBinding;
import org.wikipedia.databinding.ViewReadingListPreviewSaveDialogBinding;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.ViewUtil;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView$Callback;", "currentReadingLists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "readingList", "readingListMode", "Lorg/wikipedia/readinglist/ReadingListMode;", "getReadingListMode", "()Lorg/wikipedia/readinglist/ReadingListMode;", "setReadingListMode", "(Lorg/wikipedia/readinglist/ReadingListMode;)V", "savedReadingListPages", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "setContentType", "", "validateTitleAndList", "Callback", "ReadingListItemAdapter", "ReadingListItemHolder", "app.lib"})
public final class ReadingListPreviewSaveDialogView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private org.wikipedia.readinglist.database.ReadingList readingList;
    private java.util.List<org.wikipedia.readinglist.database.ReadingListPage> savedReadingListPages;
    private org.wikipedia.readinglist.ReadingListPreviewSaveDialogView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.readinglist.database.ReadingList> currentReadingLists;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.readinglist.ReadingListMode readingListMode = org.wikipedia.readinglist.ReadingListMode.PREVIEW;
    
    public ReadingListPreviewSaveDialogView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.ReadingListMode getReadingListMode() {
        return null;
    }
    
    public final void setReadingListMode(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListMode p0) {
    }
    
    public final void setContentType(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> savedReadingListPages, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListPreviewSaveDialogView.Callback callback) {
    }
    
    private final void validateTitleAndList() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView$Callback;", "", "onError", "", "onSuccess", "listTitle", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onError();
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String listTitle);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView$ReadingListItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView$ReadingListItemHolder;", "Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView;", "(Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class ReadingListItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.readinglist.ReadingListPreviewSaveDialogView.ReadingListItemHolder> {
        
        public ReadingListItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.readinglist.ReadingListPreviewSaveDialogView.ReadingListItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.ReadingListPreviewSaveDialogView.ReadingListItemHolder holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView$ReadingListItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "itemBinding", "error/NonExistentClass", "(Lorg/wikipedia/readinglist/ReadingListPreviewSaveDialogView;Lerror/NonExistentClass;)V", "getItemBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "readingListPage", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "bindItem", "", "onClick", "v", "updateState", "app.lib"})
    final class ReadingListItemHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final ItemReadingListPreviewSaveSelectItemBinding itemBinding = null;
        private org.wikipedia.readinglist.database.ReadingListPage readingListPage;
        
        public ReadingListItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemReadingListPreviewSaveSelectItemBinding getItemBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage readingListPage) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        private final void updateState() {
        }
    }
}