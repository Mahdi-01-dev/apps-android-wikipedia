package org.wikipedia.page;

import android.view.Gravity;
import android.view.View;
import org.wikipedia.R;
import org.wikipedia.views.ObservableWebView;
import org.wikipedia.views.ObservableWebView.OnDownMotionEventListener;
import org.wikipedia.views.ObservableWebView.OnUpOrCancelMotionEventListener;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J \u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/page/ViewHideHandler;", "Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "Lorg/wikipedia/views/ObservableWebView$OnUpOrCancelMotionEventListener;", "Lorg/wikipedia/views/ObservableWebView$OnDownMotionEventListener;", "Lorg/wikipedia/views/ObservableWebView$OnClickListener;", "hideableView", "Landroid/view/View;", "anchoredView", "gravity", "", "updateElevation", "", "shouldAlwaysShow", "Lkotlin/Function0;", "(Landroid/view/View;Landroid/view/View;IZLkotlin/jvm/functions/Function0;)V", "value", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "webView", "Lorg/wikipedia/views/ObservableWebView;", "ensureDisplayed", "", "ensureHidden", "onClick", "x", "", "y", "onDownMotionEvent", "onScrollChanged", "oldScrollY", "scrollY", "isHumanScroll", "onUpOrCancelMotionEvent", "setScrollView", "app.lib"})
public final class ViewHideHandler implements org.wikipedia.views.ObservableWebView.OnScrollChangeListener, org.wikipedia.views.ObservableWebView.OnUpOrCancelMotionEventListener, org.wikipedia.views.ObservableWebView.OnDownMotionEventListener, org.wikipedia.views.ObservableWebView.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View hideableView = null;
    @org.jetbrains.annotations.Nullable()
    private final android.view.View anchoredView = null;
    private final int gravity = 0;
    private final boolean updateElevation = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> shouldAlwaysShow = null;
    private org.wikipedia.views.ObservableWebView webView;
    private boolean enabled = true;
    
    public ViewHideHandler(@org.jetbrains.annotations.NotNull()
    android.view.View hideableView, @org.jetbrains.annotations.Nullable()
    android.view.View anchoredView, int gravity, boolean updateElevation, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> shouldAlwaysShow) {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean value) {
    }
    
    public final void setScrollView(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView webView) {
    }
    
    @java.lang.Override()
    public void onScrollChanged(int oldScrollY, int scrollY, boolean isHumanScroll) {
    }
    
    @java.lang.Override()
    public void onUpOrCancelMotionEvent() {
    }
    
    @java.lang.Override()
    public void onDownMotionEvent() {
    }
    
    @java.lang.Override()
    public boolean onClick(float x, float y) {
        return false;
    }
    
    public final void ensureDisplayed() {
    }
    
    private final void ensureHidden() {
    }
}