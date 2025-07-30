package org.wikipedia.readinglist;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/readinglist/MoveToReadingListDialog;", "Lorg/wikipedia/readinglist/AddToReadingListDialog;", "()V", "sourceReadingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "commitChanges", "", "readingList", "titles", "", "Lorg/wikipedia/page/PageTitle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class MoveToReadingListDialog extends org.wikipedia.readinglist.AddToReadingListDialog {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.database.ReadingList sourceReadingList;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOURCE_READING_LIST_ID = "sourceReadingListId";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.MoveToReadingListDialog.Companion Companion = null;
    
    public MoveToReadingListDialog() {
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
    public void commitChanges(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> titles) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/readinglist/MoveToReadingListDialog$Companion;", "", "()V", "SOURCE_READING_LIST_ID", "", "newInstance", "Lorg/wikipedia/readinglist/MoveToReadingListDialog;", "sourceReadingListId", "", "titles", "", "Lorg/wikipedia/page/PageTitle;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "showDefaultList", "", "listener", "Landroid/content/DialogInterface$OnDismissListener;", "title", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.MoveToReadingListDialog newInstance(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.MoveToReadingListDialog newInstance(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, boolean showDefaultList, @org.jetbrains.annotations.Nullable()
        android.content.DialogInterface.OnDismissListener listener) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.MoveToReadingListDialog newInstance(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> titles, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, boolean showDefaultList, @org.jetbrains.annotations.Nullable()
        android.content.DialogInterface.OnDismissListener listener) {
            return null;
        }
    }
}