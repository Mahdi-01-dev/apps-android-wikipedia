package org.wikipedia.settings.languages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemWikipediaLanguageBinding;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020\u0016H\u0002R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "getCallback", "()Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "setCallback", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;)V", "position", "setCheckBoxChecked", "", "checked", "", "setCheckBoxEnabled", "enabled", "setContents", "langCode", "", "languageLocalizedName", "setDragHandleEnabled", "setDragHandleTouchListener", "listener", "Landroid/view/View$OnTouchListener;", "updateBackgroundColor", "Callback", "app.lib"})
public final class WikipediaLanguagesItemView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    private int position = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback callback;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback p0) {
    }
    
    public WikipediaLanguagesItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public WikipediaLanguagesItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public WikipediaLanguagesItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void updateBackgroundColor() {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode, @org.jetbrains.annotations.Nullable()
    java.lang.String languageLocalizedName, int position) {
    }
    
    public final void setCheckBoxEnabled(boolean enabled) {
    }
    
    public final void setCheckBoxChecked(boolean checked) {
    }
    
    public final void setDragHandleEnabled(boolean enabled) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void setDragHandleTouchListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "", "onCheckedChanged", "", "position", "", "onLongPress", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onCheckedChanged(int position);
        
        public abstract void onLongPress(int position);
    }
}