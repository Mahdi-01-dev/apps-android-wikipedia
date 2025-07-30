package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ListView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/views/SwipeableListView;", "Landroid/widget/ListView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listener", "Lorg/wikipedia/views/SwipeableListView$OnSwipeOutListener;", "getListener", "()Lorg/wikipedia/views/SwipeableListView$OnSwipeOutListener;", "setListener", "(Lorg/wikipedia/views/SwipeableListView$OnSwipeOutListener;)V", "rtl", "", "getRtl", "()Z", "setRtl", "(Z)V", "swipeDetected", "event1", "Landroid/view/MotionEvent;", "event2", "Companion", "OnSwipeOutListener", "ViewGestureListener", "app.lib"})
public final class SwipeableListView extends android.widget.ListView {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.SwipeableListView.OnSwipeOutListener listener;
    private boolean rtl = false;
    public static final int SWIPE_MIN_DISTANCE = 200;
    public static final int SWIPE_MAX_DISTANCE = 300;
    public static final int SWIPE_MIN_X_VELOCITY = 100;
    public static final int SWIPE_MAX_Y_VELOCITY = 2000;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.SwipeableListView.Companion Companion = null;
    
    public SwipeableListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.SwipeableListView.OnSwipeOutListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.SwipeableListView.OnSwipeOutListener p0) {
    }
    
    public final boolean getRtl() {
        return false;
    }
    
    public final void setRtl(boolean p0) {
    }
    
    private final boolean swipeDetected(android.view.MotionEvent event1, android.view.MotionEvent event2) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/SwipeableListView$Companion;", "", "()V", "SWIPE_MAX_DISTANCE", "", "SWIPE_MAX_Y_VELOCITY", "SWIPE_MIN_DISTANCE", "SWIPE_MIN_X_VELOCITY", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/SwipeableListView$OnSwipeOutListener;", "", "onSwipeOut", "", "app.lib"})
    public static abstract interface OnSwipeOutListener {
        
        public abstract void onSwipeOut();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/views/SwipeableListView$ViewGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lorg/wikipedia/views/SwipeableListView;)V", "onFling", "", "event1", "Landroid/view/MotionEvent;", "event2", "velocityX", "", "velocityY", "app.lib"})
    final class ViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        public ViewGestureListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onFling(@org.jetbrains.annotations.Nullable()
        android.view.MotionEvent event1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event2, float velocityX, float velocityY) {
            return false;
        }
    }
}