package org.wikipedia.page.tabs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J@\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\tH\u0016J \u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/page/tabs/SwipeableTabTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemBackgroundPaint", "Landroid/graphics/Paint;", "swipeBackgroundPaint", "swipeableEnabled", "", "getSwipeableEnabled", "()Z", "setSwipeableEnabled", "(Z)V", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isItemViewSwipeEnabled", "isLongPressDragEnabled", "onChildDraw", "", "canvas", "Landroid/graphics/Canvas;", "viewHolder", "dx", "", "dy", "actionState", "isCurrentlyActive", "onMove", "source", "target", "onSwiped", "i", "Callback", "app.lib"})
public final class SwipeableTabTouchHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint swipeBackgroundPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint itemBackgroundPaint = null;
    private boolean swipeableEnabled = false;
    
    public SwipeableTabTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean getSwipeableEnabled() {
        return false;
    }
    
    public final void setSwipeableEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean isLongPressDragEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isItemViewSwipeEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder source, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dx, float dy, int actionState, boolean isCurrentlyActive) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/tabs/SwipeableTabTouchHelperCallback$Callback;", "", "isSwipeable", "", "onSwipe", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSwipe();
        
        public abstract boolean isSwipeable();
    }
}