package org.wikipedia.history;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.MenuItemCompat;
import org.wikipedia.views.SearchActionProvider;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H$J\b\u0010\u0005\u001a\u00020\u0006H$J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H$\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/history/SearchActionModeCallback;", "Landroidx/appcompat/view/ActionMode$Callback;", "()V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onActionItemClicked", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onPrepareActionMode", "onQueryChange", "s", "Companion", "app.lib"})
public abstract class SearchActionModeCallback implements androidx.appcompat.view.ActionMode.Callback {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MODE_TAG = "searchActionMode";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.history.SearchActionModeCallback.Companion Companion = null;
    
    public SearchActionModeCallback() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getSearchHintString();
    
    protected abstract void onQueryChange(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.content.Context getParentContext();
    
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/history/SearchActionModeCallback$Companion;", "", "()V", "ACTION_MODE_TAG", "", "matches", "", "mode", "Landroidx/appcompat/view/ActionMode;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean matches(@org.jetbrains.annotations.Nullable()
        androidx.appcompat.view.ActionMode mode) {
            return false;
        }
    }
}