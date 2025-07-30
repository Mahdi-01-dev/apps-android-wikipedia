package org.wikipedia.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.*;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.databinding.ViewReadingListsOverflowBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DateUtil;
import java.text.ParseException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/views/ReadingListsOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/ReadingListsOverflowView$Callback;", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismissPopupWindowHost", "", "show", "anchorView", "Landroid/view/View;", "Callback", "app.lib"})
public final class ReadingListsOverflowView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.ReadingListsOverflowView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow popupWindowHost;
    
    public ReadingListsOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final void dismissPopupWindowHost() {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ReadingListsOverflowView.Callback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/ReadingListsOverflowView$Callback;", "", "createNewListClick", "", "importNewList", "refreshClick", "selectListClick", "sortByClick", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void sortByClick();
        
        public abstract void createNewListClick();
        
        public abstract void importNewList();
        
        public abstract void selectListClick();
        
        public abstract void refreshClick();
    }
}