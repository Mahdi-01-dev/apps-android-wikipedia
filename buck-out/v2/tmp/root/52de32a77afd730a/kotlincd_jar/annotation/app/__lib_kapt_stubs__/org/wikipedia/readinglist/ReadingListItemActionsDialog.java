package org.wikipedia.readinglist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0003\u0013\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemActionsDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "actionsView", "Lorg/wikipedia/readinglist/ReadingListItemActionsView;", "readingListPage", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "callback", "Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Callback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Callback", "Companion", "ItemActionsCallback", "app.lib"})
public final class ReadingListItemActionsDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    private org.wikipedia.readinglist.ReadingListItemActionsView actionsView;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.database.ReadingListPage readingListPage;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_READING_LIST_NAME = "readingListName";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_READING_LIST_SIZE = "readingListSize";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_READING_LIST_PAGE = "readingListPage";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_READING_LIST_HAS_ACTION_MODE = "hasActionMode";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListItemActionsDialog.Companion Companion = null;
    
    public ReadingListItemActionsDialog() {
        super();
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
    
    private final org.wikipedia.readinglist.ReadingListItemActionsDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Callback;", "", "onAddItemToOther", "", "pageId", "", "onDeleteItem", "onMoveItemToOther", "onSelectItem", "onShareItem", "onToggleItemOffline", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onToggleItemOffline(long pageId);
        
        public abstract void onShareItem(long pageId);
        
        public abstract void onAddItemToOther(long pageId);
        
        public abstract void onMoveItemToOther(long pageId);
        
        public abstract void onSelectItem(long pageId);
        
        public abstract void onDeleteItem(long pageId);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Companion;", "", "()V", "ARG_READING_LIST_HAS_ACTION_MODE", "", "ARG_READING_LIST_NAME", "ARG_READING_LIST_PAGE", "ARG_READING_LIST_SIZE", "newInstance", "Lorg/wikipedia/readinglist/ReadingListItemActionsDialog;", "lists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "pageID", "", "hasActionMode", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListItemActionsDialog newInstance(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, long pageID, boolean hasActionMode) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$ItemActionsCallback;", "Lorg/wikipedia/readinglist/ReadingListItemActionsView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListItemActionsDialog;)V", "onAddToOther", "", "onDelete", "onMoveToOther", "onSelect", "onShare", "onToggleOffline", "app.lib"})
    final class ItemActionsCallback implements org.wikipedia.readinglist.ReadingListItemActionsView.Callback {
        
        public ItemActionsCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onToggleOffline() {
        }
        
        @java.lang.Override()
        public void onShare() {
        }
        
        @java.lang.Override()
        public void onAddToOther() {
        }
        
        @java.lang.Override()
        public void onMoveToOther() {
        }
        
        @java.lang.Override()
        public void onSelect() {
        }
        
        @java.lang.Override()
        public void onDelete() {
        }
    }
}