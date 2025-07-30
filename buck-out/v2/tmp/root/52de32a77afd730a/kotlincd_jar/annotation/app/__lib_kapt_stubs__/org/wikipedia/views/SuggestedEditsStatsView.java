package org.wikipedia.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.core.widget.ImageViewCompat;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewSuggestedEditsStatsBinding;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000bR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/views/SuggestedEditsStatsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "tooltipText", "", "getTooltipText", "()Ljava/lang/String;", "setTooltipText", "(Ljava/lang/String;)V", "getDescriptionView", "Landroid/view/View;", "setDescription", "", "descriptionText", "setGoodnessState", "severity", "", "setImageDrawable", "imageDrawable", "setTitle", "titleText", "app.lib"})
public final class SuggestedEditsStatsView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tooltipText = "";
    
    public SuggestedEditsStatsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTooltipText() {
        return null;
    }
    
    public final void setTooltipText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String titleText) {
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String descriptionText) {
    }
    
    public final void setImageDrawable(@androidx.annotation.DrawableRes()
    int imageDrawable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getDescriptionView() {
        return null;
    }
    
    public final void setGoodnessState(int severity) {
    }
}