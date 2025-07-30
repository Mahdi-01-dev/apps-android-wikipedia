package org.wikipedia.readinglist;

import android.content.Context;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/RemoveFromReadingListsDialog;", "", "listsContainingPage", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "(Ljava/util/List;)V", "deleteOrShowDialog", "", "context", "Landroid/content/Context;", "callback", "Lorg/wikipedia/readinglist/RemoveFromReadingListsDialog$Callback;", "showDialog", "Callback", "app.lib"})
public final class RemoveFromReadingListsDialog {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.readinglist.database.ReadingList> listsContainingPage = null;
    
    public RemoveFromReadingListsDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> listsContainingPage) {
        super();
    }
    
    public final void deleteOrShowDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.RemoveFromReadingListsDialog.Callback callback) {
    }
    
    private final void showDialog(android.content.Context context, org.wikipedia.readinglist.RemoveFromReadingListsDialog.Callback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/RemoveFromReadingListsDialog$Callback;", "", "onDeleted", "", "lists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onDeleted(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page);
    }
}