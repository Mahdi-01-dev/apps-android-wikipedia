package org.wikipedia.page.tabs;

import kotlinx.serialization.Serializable;
import org.wikipedia.page.PageBackStackItem;
import org.wikipedia.page.PageTitle;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/page/tabs/Tab;", "", "()V", "backStack", "", "Lorg/wikipedia/page/PageBackStackItem;", "getBackStack", "()Ljava/util/List;", "backStackPosition", "", "getBackStackPosition", "()I", "setBackStackPosition", "(I)V", "backStackPositionTitle", "Lorg/wikipedia/page/PageTitle;", "getBackStackPositionTitle", "()Lorg/wikipedia/page/PageTitle;", "canGoBack", "", "canGoForward", "clearBackstack", "", "moveBack", "moveForward", "pushBackStackItem", "item", "setBackStackPositionTitle", "title", "squashBackstack", "app.lib"})
public final class Tab {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.page.PageBackStackItem> backStack = null;
    private int backStackPosition = -1;
    
    public Tab() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.PageBackStackItem> getBackStack() {
        return null;
    }
    
    public final void setBackStackPosition(int p0) {
    }
    
    public final int getBackStackPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getBackStackPositionTitle() {
        return null;
    }
    
    public final void setBackStackPositionTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final boolean canGoBack() {
        return false;
    }
    
    public final boolean canGoForward() {
        return false;
    }
    
    public final void moveForward() {
    }
    
    public final void moveBack() {
    }
    
    public final void pushBackStackItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageBackStackItem item) {
    }
    
    public final void clearBackstack() {
    }
    
    public final void squashBackstack() {
    }
}