package org.wikipedia.page;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textview.MaterialTextView;
import org.wikipedia.R;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.ConfigurableTabLayout;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/PageActionTabLayout;", "Lorg/wikipedia/views/ConfigurableTabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callback", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "getCallback", "()Lorg/wikipedia/page/action/PageActionItem$Callback;", "setCallback", "(Lorg/wikipedia/page/action/PageActionItem$Callback;)V", "update", "", "app.lib"})
public final class PageActionTabLayout extends org.wikipedia.views.ConfigurableTabLayout {
    public org.wikipedia.page.action.PageActionItem.Callback callback;
    
    public PageActionTabLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.action.PageActionItem.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.action.PageActionItem.Callback p0) {
    }
    
    public final void update() {
    }
}