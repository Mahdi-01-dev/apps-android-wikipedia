package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.wikipedia.R;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/views/WikiSwipeRefreshLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollableChild", "Landroid/view/View;", "getScrollableChild", "()Landroid/view/View;", "setScrollableChild", "(Landroid/view/View;)V", "canChildScrollUp", "", "app.lib"})
public class WikiSwipeRefreshLayout extends androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    @org.jetbrains.annotations.Nullable()
    private android.view.View scrollableChild;
    
    public WikiSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getScrollableChild() {
        return null;
    }
    
    public final void setScrollableChild(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public boolean canChildScrollUp() {
        return false;
    }
}