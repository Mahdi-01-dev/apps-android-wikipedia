package org.wikipedia.suggestededits;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemSuggestedEditsRecentEditsBinding;
import org.wikipedia.dataclient.mwapi.MwQueryResult;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019R\u0013\u0010\u0007\u001a\u00020\b\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView$Callback;", "getCallback", "()Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView$Callback;", "setCallback", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView$Callback;)V", "clickListener", "Landroid/view/View$OnClickListener;", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "setButtonTextAndIconColor", "", "text", "", "iconResourceDrawable", "", "setItem", "currentQuery", "Callback", "app.lib"})
public final class SuggestedEditsRecentEditsItemView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.SuggestedEditsRecentEditsItemView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item;
    @org.jetbrains.annotations.NotNull()
    private android.view.View.OnClickListener clickListener;
    
    public SuggestedEditsRecentEditsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.SuggestedEditsRecentEditsItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.SuggestedEditsRecentEditsItemView.Callback p0) {
    }
    
    @kotlin.Suppress(names = {"KotlinConstantConditions"})
    public final void setItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item, @org.jetbrains.annotations.Nullable()
    java.lang.String currentQuery) {
    }
    
    private final void setButtonTextAndIconColor(java.lang.String text, @androidx.annotation.DrawableRes()
    int iconResourceDrawable) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsItemView$Callback;", "", "onItemClick", "", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "onUserClick", "view", "Landroid/view/View;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item);
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
}