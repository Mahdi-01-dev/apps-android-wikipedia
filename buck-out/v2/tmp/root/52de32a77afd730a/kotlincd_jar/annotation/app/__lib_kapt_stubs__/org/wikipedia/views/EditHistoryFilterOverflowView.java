package org.wikipedia.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewEditHistoryFilterOverflowBinding;
import org.wikipedia.dataclient.restbase.EditCount;
import org.wikipedia.page.edithistory.EditHistoryListViewModel;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u0014\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/views/EditHistoryFilterOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/EditHistoryFilterOverflowView$Callback;", "popupWindowHost", "Landroid/widget/PopupWindow;", "onSelected", "", "setButtonsListener", "show", "anchorView", "Landroid/view/View;", "editCounts", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryStats;", "updateSelectedItem", "Callback", "app.lib"})
public final class EditHistoryFilterOverflowView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.EditHistoryFilterOverflowView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow popupWindowHost;
    
    public EditHistoryFilterOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryStats editCounts, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.EditHistoryFilterOverflowView.Callback callback) {
    }
    
    private final void updateSelectedItem() {
    }
    
    private final void setButtonsListener() {
    }
    
    private final void onSelected() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/EditHistoryFilterOverflowView$Callback;", "", "onItemClicked", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onItemClicked();
    }
}