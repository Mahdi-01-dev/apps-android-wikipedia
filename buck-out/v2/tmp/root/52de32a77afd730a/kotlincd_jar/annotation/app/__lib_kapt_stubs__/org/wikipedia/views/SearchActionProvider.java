package org.wikipedia.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ActionProvider;
import org.wikipedia.R;
import org.wikipedia.databinding.GroupSearchBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/views/SearchActionProvider;", "Landroidx/core/view/ActionProvider;", "context", "Landroid/content/Context;", "searchHintString", "", "callback", "Lorg/wikipedia/views/SearchActionProvider$Callback;", "(Landroid/content/Context;Ljava/lang/String;Lorg/wikipedia/views/SearchActionProvider$Callback;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "onCreateActionView", "Landroid/view/View;", "overridesItemVisibility", "", "selectAllQueryTexts", "", "setQueryText", "text", "Callback", "app.lib"})
public final class SearchActionProvider extends androidx.core.view.ActionProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String searchHintString = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.SearchActionProvider.Callback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public SearchActionProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String searchHintString, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.SearchActionProvider.Callback callback) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateActionView() {
        return null;
    }
    
    @java.lang.Override()
    public boolean overridesItemVisibility() {
        return false;
    }
    
    public final void selectAllQueryTexts() {
    }
    
    public final void setQueryText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/SearchActionProvider$Callback;", "", "onQueryTextChange", "", "s", "", "onQueryTextFocusChange", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onQueryTextChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s);
        
        public abstract void onQueryTextFocusChange();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onQueryTextFocusChange(@org.jetbrains.annotations.NotNull()
            org.wikipedia.views.SearchActionProvider.Callback $this) {
            }
        }
    }
}