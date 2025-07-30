package org.wikipedia.edit.summaries;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.edit.db.EditSummary;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/edit/summaries/EditSummaryHandler;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "container", "Landroid/view/View;", "summaryEdit", "Landroid/widget/AutoCompleteTextView;", "title", "Lorg/wikipedia/page/PageTitle;", "(Lkotlinx/coroutines/CoroutineScope;Landroid/view/View;Landroid/widget/AutoCompleteTextView;Lorg/wikipedia/page/PageTitle;)V", "handleBackPressed", "", "persistSummary", "", "show", "updateAutoCompleteList", "editSummaries", "", "Lorg/wikipedia/edit/db/EditSummary;", "app.lib"})
public final class EditSummaryHandler {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View container = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.AutoCompleteTextView summaryEdit = null;
    
    public EditSummaryHandler(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    android.view.View container, @org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView summaryEdit, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        super();
    }
    
    private final void updateAutoCompleteList(java.util.List<org.wikipedia.edit.db.EditSummary> editSummaries) {
    }
    
    public final void show() {
    }
    
    public final void persistSummary() {
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
}