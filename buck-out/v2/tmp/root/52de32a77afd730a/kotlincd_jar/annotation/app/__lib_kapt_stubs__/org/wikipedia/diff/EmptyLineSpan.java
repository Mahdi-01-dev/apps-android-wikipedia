package org.wikipedia.diff;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import androidx.annotation.ColorInt;
import org.wikipedia.util.DimenUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J`\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/diff/EmptyLineSpan;", "Landroid/text/style/LineBackgroundSpan;", "fillColor", "", "strokeColor", "(II)V", "getFillColor", "()I", "getStrokeColor", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "left", "right", "top", "baseline", "bottom", "text", "", "start", "end", "lineNumber", "app.lib"})
public final class EmptyLineSpan implements android.text.style.LineBackgroundSpan {
    private final int fillColor = 0;
    private final int strokeColor = 0;
    
    public EmptyLineSpan(@androidx.annotation.ColorInt()
    int fillColor, @androidx.annotation.ColorInt()
    int strokeColor) {
        super();
    }
    
    public final int getFillColor() {
        return 0;
    }
    
    public final int getStrokeColor() {
        return 0;
    }
    
    @java.lang.Override()
    public void drawBackground(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, int left, int right, int top, int baseline, int bottom, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int end, int lineNumber) {
    }
}