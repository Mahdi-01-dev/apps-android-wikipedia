package org.wikipedia.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ActionProvider;
import androidx.core.widget.ImageViewCompat;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewSearchAndFilterBinding;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0016\u001a\u00020\u0014R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\n\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/views/SearchAndFilterActionProvider;", "Landroidx/core/view/ActionProvider;", "context", "Landroid/content/Context;", "searchHintString", "", "callback", "Lorg/wikipedia/views/SearchAndFilterActionProvider$Callback;", "(Landroid/content/Context;Ljava/lang/String;Lorg/wikipedia/views/SearchAndFilterActionProvider$Callback;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "filterIcon", "getFilterIcon", "()Lerror/NonExistentClass;", "onCreateActionView", "Landroid/view/View;", "overridesItemVisibility", "", "setQueryText", "", "text", "updateFilterIconAndText", "Callback", "app.lib"})
public final class SearchAndFilterActionProvider extends androidx.core.view.ActionProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String searchHintString = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.SearchAndFilterActionProvider.Callback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object filterIcon = null;
    
    public SearchAndFilterActionProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String searchHintString, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.SearchAndFilterActionProvider.Callback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFilterIcon() {
        return null;
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
    
    public final void updateFilterIconAndText() {
    }
    
    public final void setQueryText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/views/SearchAndFilterActionProvider$Callback;", "", "getExcludedFilterCount", "", "getFilterIconContentDescription", "onFilterIconClick", "", "onQueryTextChange", "s", "", "onQueryTextFocusChange", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onQueryTextChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s);
        
        public abstract void onQueryTextFocusChange();
        
        public abstract void onFilterIconClick();
        
        public abstract int getExcludedFilterCount();
        
        public abstract int getFilterIconContentDescription();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onQueryTextFocusChange(@org.jetbrains.annotations.NotNull()
            org.wikipedia.views.SearchAndFilterActionProvider.Callback $this) {
            }
        }
    }
}