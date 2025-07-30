package org.wikipedia.analytics;

import android.graphics.Point;
import android.view.*;
import android.widget.TextView;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/BreadcrumbsContextHelper;", "", "()V", "startTouchMillis", "", "startTouchX", "", "startTouchY", "touchSlopPx", "", "dispatchTouchEvent", "", "window", "Landroid/view/Window;", "event", "Landroid/view/MotionEvent;", "app.lib"})
public final class BreadcrumbsContextHelper {
    private static float startTouchX = 0.0F;
    private static float startTouchY = 0.0F;
    private static long startTouchMillis = 0L;
    private static int touchSlopPx = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.BreadcrumbsContextHelper INSTANCE = null;
    
    private BreadcrumbsContextHelper() {
        super();
    }
    
    public final void dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.Window window, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
    }
}