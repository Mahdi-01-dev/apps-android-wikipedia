package org.wikipedia.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import org.wikipedia.R;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0014J(\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010\'\u001a\u00020\fH\u0014J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/views/CircularProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "circleBounds", "Landroid/graphics/RectF;", "maxProgressValue", "", "color", "", "progressBackgroundColor", "getProgressBackgroundColor", "()I", "setProgressBackgroundColor", "(I)V", "progressBackgroundPaint", "Landroid/graphics/Paint;", "progressColor", "getProgressColor", "setProgressColor", "progressPaint", "sweepAngle", "calculateBounds", "", "w", "h", "drawProgress", "canvas", "Landroid/graphics/Canvas;", "drawProgressBackground", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "oldw", "oldh", "setCurrentProgress", "currentProgress", "Companion", "app.lib"})
public final class CircularProgressBar extends android.view.View {
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Paint progressPaint;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Paint progressBackgroundPaint;
    private int sweepAngle = 0;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.RectF circleBounds;
    private double maxProgressValue = 100.0;
    private static final int PROGRESS_START_ANGLE = 270;
    private static final int PROGRESS_BACKGROUND_MIN_ANGLE = 0;
    private static final int PROGRESS_BACKGROUND_MAX_ANGLE = 360;
    private static final float DEFAULT_STROKE_WIDTH_DP = 0.0F;
    public static final int MIN_PROGRESS = 5;
    public static final int MAX_PROGRESS = 100;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.CircularProgressBar.Companion Companion = null;
    
    public CircularProgressBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    private final void calculateBounds(int w, int h) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawProgressBackground(android.graphics.Canvas canvas) {
    }
    
    private final void drawProgress(android.graphics.Canvas canvas) {
    }
    
    public final void setCurrentProgress(double currentProgress) {
    }
    
    @androidx.annotation.ColorInt()
    public final int getProgressColor() {
        return 0;
    }
    
    public final void setProgressColor(int color) {
    }
    
    @androidx.annotation.ColorInt()
    public final int getProgressBackgroundColor() {
        return 0;
    }
    
    public final void setProgressBackgroundColor(int color) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/views/CircularProgressBar$Companion;", "", "()V", "DEFAULT_STROKE_WIDTH_DP", "", "MAX_PROGRESS", "", "MIN_PROGRESS", "PROGRESS_BACKGROUND_MAX_ANGLE", "PROGRESS_BACKGROUND_MIN_ANGLE", "PROGRESS_START_ANGLE", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}