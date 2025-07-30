package org.wikipedia.page.customize;

import androidx.lifecycle.ViewModel;
import org.wikipedia.R;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.settings.Prefs;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u0006J0\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u0005H\u0002J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u0005H\u0002J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u001aJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006RB\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/page/customize/CustomizeToolbarViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "Lkotlin/Pair;", "", "", "fullList", "getFullList", "()Ljava/util/List;", "menuOrder", "toolbarOrder", "addEmptyPlaceholder", "addItemsOrEmptyPlaceholder", "", "list", "toolbar", "", "collectCategoriesItems", "emptyPlaceholderPair", "isToolbar", "handleCategoryLimitation", "pair", "headerPair", "preProcessList", "", "removeEmptyPlaceholder", "resetToDefault", "saveChanges", "setupDefaultOrder", "default", "swapList", "oldPosition", "newPosition", "app.lib"})
public final class CustomizeToolbarViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> toolbarOrder;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> menuOrder;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Object>> fullList;
    
    public CustomizeToolbarViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Object>> getFullList() {
        return null;
    }
    
    private final void setupDefaultOrder(boolean p0_772401952) {
    }
    
    private final void preProcessList() {
    }
    
    private final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Object>> addItemsOrEmptyPlaceholder(java.util.List<java.lang.Integer> list, boolean toolbar) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.Object> headerPair(boolean isToolbar) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.Object> emptyPlaceholderPair(boolean isToolbar) {
        return null;
    }
    
    private final kotlin.Pair<java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>> collectCategoriesItems() {
        return null;
    }
    
    private final java.util.List<java.lang.Integer> handleCategoryLimitation(kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> pair) {
        return null;
    }
    
    public final void resetToDefault() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> saveChanges() {
        return null;
    }
    
    public final void swapList(int oldPosition, int newPosition) {
    }
    
    public final int addEmptyPlaceholder() {
        return 0;
    }
    
    public final int removeEmptyPlaceholder() {
        return 0;
    }
}