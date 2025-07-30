package org.wikipedia.views;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.ActionMode;
import org.wikipedia.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH$J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/views/MultiSelectActionModeCallback;", "Landroidx/appcompat/view/ActionMode$Callback;", "()V", "onActionItemClicked", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteSelected", "", "onDestroyActionMode", "onPrepareActionMode", "Companion", "app.lib"})
public abstract class MultiSelectActionModeCallback implements androidx.appcompat.view.ActionMode.Callback {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_MODE_TAG = "multiSelectActionMode";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.MultiSelectActionModeCallback.Companion Companion = null;
    
    public MultiSelectActionModeCallback() {
        super();
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    protected abstract void onDeleteSelected();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/views/MultiSelectActionModeCallback$Companion;", "", "()V", "ACTION_MODE_TAG", "", "isTagType", "", "mode", "Landroidx/appcompat/view/ActionMode;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isTagType(@org.jetbrains.annotations.Nullable()
        androidx.appcompat.view.ActionMode mode) {
            return false;
        }
    }
}