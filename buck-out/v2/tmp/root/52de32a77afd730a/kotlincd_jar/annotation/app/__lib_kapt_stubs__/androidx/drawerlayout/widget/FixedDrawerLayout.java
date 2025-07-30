package androidx.drawerlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b\u00a8\u0006\u000e"}, d2 = {"Landroidx/drawerlayout/widget/FixedDrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isContentView", "", "child", "Landroid/view/View;", "setSlidingEnabled", "", "enable", "app.lib"})
public final class FixedDrawerLayout extends androidx.drawerlayout.widget.DrawerLayout {
    
    public FixedDrawerLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final void setSlidingEnabled(boolean enable) {
    }
    
    @java.lang.Override()
    protected boolean isContentView(@org.jetbrains.annotations.Nullable()
    android.view.View child) {
        return false;
    }
}