package org.wikipedia.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewLangCodeBinding;
import org.wikipedia.language.LanguageUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u000bR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/views/LangCodeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "primaryColor", "", "fillBackground", "", "", "setBackgroundTint", "colors", "Landroid/content/res/ColorStateList;", "tintColor", "setLangCode", "langCode", "", "setTextColor", "textColor", "app.lib"})
public final class LangCodeView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private final int primaryColor = 0;
    
    public LangCodeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final void setLangCode(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
    }
    
    public final void setTextColor(@androidx.annotation.ColorInt()
    int textColor) {
    }
    
    public final void setTextColor(@org.jetbrains.annotations.NotNull()
    android.content.res.ColorStateList colors) {
    }
    
    public final void fillBackground(boolean fillBackground) {
    }
    
    public final void setBackgroundTint(@androidx.annotation.ColorInt()
    int tintColor) {
    }
    
    public final void setBackgroundTint(@org.jetbrains.annotations.NotNull()
    android.content.res.ColorStateList colors) {
    }
}