package org.wikipedia.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.events.WebViewInvalidateEvent;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 I2\u00020\u0001:\u0007IJKLMNOB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0018J\u000e\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u001aJ\u000e\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\u001cJ\u000e\u00106\u001a\u0002002\u0006\u00107\u001a\u00020 J\u000e\u00108\u001a\u0002002\u0006\u00109\u001a\u00020\"J\u0006\u0010:\u001a\u000200J\u0018\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u0010H\u0002J\u0010\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020@H\u0014J(\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\tH\u0014J\u0010\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020HH\u0017R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0013R\u001e\u0010-\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0013\u00a8\u0006P"}, d2 = {"Lorg/wikipedia/views/ObservableWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentContentHeight", "drawEventsWhileSwiping", "lastScrollTime", "", "<set-?>", "", "lastTouchX", "getLastTouchX", "()F", "lastTouchY", "getLastTouchY", "onClickListeners", "", "Lorg/wikipedia/views/ObservableWebView$OnClickListener;", "onContentHeightChangedListeners", "Lorg/wikipedia/views/ObservableWebView$OnContentHeightChangedListener;", "onDownMotionEventListeners", "Lorg/wikipedia/views/ObservableWebView$OnDownMotionEventListener;", "onFastScrollListener", "Lorg/wikipedia/views/ObservableWebView$OnFastScrollListener;", "onScrollChangeListeners", "Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "onUpOrCancelMotionEventListeners", "Lorg/wikipedia/views/ObservableWebView$OnUpOrCancelMotionEventListener;", "scrollEventsEnabled", "", "getScrollEventsEnabled", "()Z", "setScrollEventsEnabled", "(Z)V", "totalAmountScrolled", "touchSlop", "touchStartX", "getTouchStartX", "touchStartY", "getTouchStartY", "addOnClickListener", "", "onClickListener", "addOnContentHeightChangedListener", "onContentHeightChangedListener", "addOnDownMotionEventListener", "onDownMotionEventListener", "addOnScrollChangeListener", "onScrollChangeListener", "addOnUpOrCancelMotionEventListener", "onUpOrCancelMotionEventListener", "clearAllListeners", "handleMouseRightClick", "x", "y", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onScrollChanged", "left", "top", "oldLeft", "oldTop", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "Companion", "OnClickListener", "OnContentHeightChangedListener", "OnDownMotionEventListener", "OnFastScrollListener", "OnScrollChangeListener", "OnUpOrCancelMotionEventListener", "app.lib"})
public final class ObservableWebView extends android.webkit.WebView {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.views.ObservableWebView.OnClickListener> onClickListeners;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.views.ObservableWebView.OnScrollChangeListener> onScrollChangeListeners;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.views.ObservableWebView.OnDownMotionEventListener> onDownMotionEventListeners;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.views.ObservableWebView.OnUpOrCancelMotionEventListener> onUpOrCancelMotionEventListeners;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.views.ObservableWebView.OnContentHeightChangedListener> onContentHeightChangedListeners;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.ObservableWebView.OnFastScrollListener onFastScrollListener;
    private int currentContentHeight = 0;
    private long lastScrollTime = 0L;
    private int totalAmountScrolled = 0;
    private int drawEventsWhileSwiping = 0;
    private int touchSlop;
    private boolean scrollEventsEnabled = true;
    private float touchStartX = 0.0F;
    private float touchStartY = 0.0F;
    private float lastTouchX = 0.0F;
    private float lastTouchY = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.events.WebViewInvalidateEvent INVALIDATE_EVENT = null;
    private static final int FAST_SCROLL_THRESHOLD = 0;
    private static final int MAX_HUMAN_SCROLL = 0;
    private static final int MAX_MILLIS_BETWEEN_SCROLLS = 500;
    private static final int SWIPE_DRAW_TOLERANCE = 4;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.ObservableWebView.Companion Companion = null;
    
    public final boolean getScrollEventsEnabled() {
        return false;
    }
    
    public final void setScrollEventsEnabled(boolean p0) {
    }
    
    public final float getTouchStartX() {
        return 0.0F;
    }
    
    public final float getTouchStartY() {
        return 0.0F;
    }
    
    public final float getLastTouchX() {
        return 0.0F;
    }
    
    public final float getLastTouchY() {
        return 0.0F;
    }
    
    public ObservableWebView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ObservableWebView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ObservableWebView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void addOnClickListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView.OnClickListener onClickListener) {
    }
    
    public final void addOnScrollChangeListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView.OnScrollChangeListener onScrollChangeListener) {
    }
    
    public final void addOnDownMotionEventListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView.OnDownMotionEventListener onDownMotionEventListener) {
    }
    
    public final void addOnUpOrCancelMotionEventListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView.OnUpOrCancelMotionEventListener onUpOrCancelMotionEventListener) {
    }
    
    public final void addOnContentHeightChangedListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView.OnContentHeightChangedListener onContentHeightChangedListener) {
    }
    
    public final void clearAllListeners() {
    }
    
    @java.lang.Override()
    protected void onScrollChanged(int left, int top, int oldLeft, int oldTop) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final void handleMouseRightClick(float x, float y) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$Companion;", "", "()V", "FAST_SCROLL_THRESHOLD", "", "INVALIDATE_EVENT", "Lorg/wikipedia/events/WebViewInvalidateEvent;", "MAX_HUMAN_SCROLL", "MAX_MILLIS_BETWEEN_SCROLLS", "SWIPE_DRAW_TOLERANCE", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$OnClickListener;", "", "onClick", "", "x", "", "y", "app.lib"})
    public static abstract interface OnClickListener {
        
        public abstract boolean onClick(float x, float y);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$OnContentHeightChangedListener;", "", "onContentHeightChanged", "", "contentHeight", "", "app.lib"})
    public static abstract interface OnContentHeightChangedListener {
        
        public abstract void onContentHeightChanged(int contentHeight);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$OnDownMotionEventListener;", "", "onDownMotionEvent", "", "app.lib"})
    public static abstract interface OnDownMotionEventListener {
        
        public abstract void onDownMotionEvent();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$OnFastScrollListener;", "", "onFastScroll", "", "app.lib"})
    public static abstract interface OnFastScrollListener {
        
        public abstract void onFastScroll();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "", "onScrollChanged", "", "oldScrollY", "", "scrollY", "isHumanScroll", "", "app.lib"})
    public static abstract interface OnScrollChangeListener {
        
        public abstract void onScrollChanged(int oldScrollY, int scrollY, boolean isHumanScroll);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/ObservableWebView$OnUpOrCancelMotionEventListener;", "", "onUpOrCancelMotionEvent", "", "app.lib"})
    public static abstract interface OnUpOrCancelMotionEventListener {
        
        public abstract void onUpOrCancelMotionEvent();
    }
}