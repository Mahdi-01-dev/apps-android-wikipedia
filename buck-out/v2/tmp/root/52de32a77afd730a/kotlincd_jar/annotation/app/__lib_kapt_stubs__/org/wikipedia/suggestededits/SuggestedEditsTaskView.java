package org.wikipedia.suggestededits;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewSuggestedEditsTaskItemBinding;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.WikiCardView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTaskView;", "Lorg/wikipedia/views/WikiCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "setUpViews", "", "task", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsTaskView$Callback;", "updateTranslateActionUI", "Callback", "app.lib"})
public final class SuggestedEditsTaskView extends org.wikipedia.views.WikiCardView {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public SuggestedEditsTaskView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    private final void updateTranslateActionUI() {
    }
    
    public final void setUpViews(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.SuggestedEditsTask task, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.SuggestedEditsTaskView.Callback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTaskView$Callback;", "", "onViewClick", "", "task", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "secondary", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onViewClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsTask task, boolean secondary);
    }
}