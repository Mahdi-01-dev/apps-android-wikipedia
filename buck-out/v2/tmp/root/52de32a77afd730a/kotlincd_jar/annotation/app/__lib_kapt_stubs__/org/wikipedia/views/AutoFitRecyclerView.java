package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.wikipedia.R;

/**
 * [RecyclerView] that invokes a callback when the number of columns should be updated.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0002%&B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0014J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callback", "Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "getCallback", "()Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "setCallback", "(Lorg/wikipedia/views/AutoFitRecyclerView$Callback;)V", "columns", "", "getColumns", "()I", "setColumns", "(I)V", "minColumnCount", "minColumnWidth", "recyclerLayoutManager", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "calculateColumns", "columnWidth", "availableWidth", "onLayout", "", "changed", "", "l", "t", "r", "b", "onMeasure", "widthSpec", "heightSpec", "Callback", "DefaultCallback", "app.lib"})
public class AutoFitRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.StaggeredGridLayoutManager recyclerLayoutManager;
    private int minColumnWidth = 0;
    private int minColumnCount = 1;
    private int columns = 0;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.views.AutoFitRecyclerView.Callback callback;
    
    public AutoFitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final int getColumns() {
        return 0;
    }
    
    public final void setColumns(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.AutoFitRecyclerView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.AutoFitRecyclerView.Callback p0) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthSpec, int heightSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    private final int calculateColumns(int columnWidth, int availableWidth) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "", "onColumns", "", "columns", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onColumns(int columns);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView$DefaultCallback;", "Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "()V", "onColumns", "", "columns", "", "app.lib"})
    static final class DefaultCallback implements org.wikipedia.views.AutoFitRecyclerView.Callback {
        
        public DefaultCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onColumns(int columns) {
        }
    }
}