package org.wikipedia.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.wikipedia.WikipediaApp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/views/ViewAnimations;", "", "()V", "MEDIUM_ANIMATION_DURATION", "", "SHORT_ANIMATION_DURATION", "crossFade", "", "curView", "Landroid/view/View;", "newView", "runOnComplete", "Ljava/lang/Runnable;", "ensureTranslationY", "view", "translation", "", "fadeIn", "fadeOut", "CancelStateAnimatorListenerAdapter", "app.lib"})
public final class ViewAnimations {
    private static final long SHORT_ANIMATION_DURATION = 0L;
    private static final long MEDIUM_ANIMATION_DURATION = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.ViewAnimations INSTANCE = null;
    
    private ViewAnimations() {
        super();
    }
    
    public final void crossFade(@org.jetbrains.annotations.NotNull()
    android.view.View curView, @org.jetbrains.annotations.NotNull()
    android.view.View newView, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable runOnComplete) {
    }
    
    public final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable runOnComplete) {
    }
    
    public final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable runOnComplete) {
    }
    
    public final void ensureTranslationY(@org.jetbrains.annotations.NotNull()
    android.view.View view, int translation) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/views/ViewAnimations$CancelStateAnimatorListenerAdapter;", "Landroid/animation/AnimatorListenerAdapter;", "()V", "canceled", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "app.lib"})
    static class CancelStateAnimatorListenerAdapter extends android.animation.AnimatorListenerAdapter {
        private boolean canceled = false;
        
        public CancelStateAnimatorListenerAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onAnimationCancel(@org.jetbrains.annotations.NotNull()
        android.animation.Animator animation) {
        }
        
        protected final boolean canceled() {
            return false;
        }
    }
}