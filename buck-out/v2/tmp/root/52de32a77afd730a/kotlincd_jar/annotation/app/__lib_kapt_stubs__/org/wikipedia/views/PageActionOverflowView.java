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
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textview.MaterialTextView;
import org.wikipedia.R;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.ItemCustomizeToolbarMenuBinding;
import org.wikipedia.databinding.ViewPageActionOverflowBinding;
import org.wikipedia.page.PageViewModel;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.page.customize.CustomizeToolbarActivity;
import org.wikipedia.page.tabs.Tab;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/views/PageActionOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "getCallback", "()Lorg/wikipedia/page/action/PageActionItem$Callback;", "setCallback", "(Lorg/wikipedia/page/action/PageActionItem$Callback;)V", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismissPopupWindowHost", "", "show", "anchorView", "Landroid/view/View;", "currentTab", "Lorg/wikipedia/page/tabs/Tab;", "model", "Lorg/wikipedia/page/PageViewModel;", "app.lib"})
public final class PageActionOverflowView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow popupWindowHost;
    public org.wikipedia.page.action.PageActionItem.Callback callback;
    
    public PageActionOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.action.PageActionItem.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.action.PageActionItem.Callback p0) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.action.PageActionItem.Callback callback, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.tabs.Tab currentTab, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel model) {
    }
    
    private final void dismissPopupWindowHost() {
    }
}