package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewLanguageScrollBinding;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\'B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J&\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\rJC\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001f\u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010 J-\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lorg/wikipedia/views/LanguageScrollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "allowSelect", "", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/LanguageScrollView$Callback;", "languageCodes", "", "", "selectedPosition", "", "getSelectedPosition", "()I", "createLanguageTab", "Landroid/view/View;", "languageCode", "setUpLanguageScrollTabData", "", "position", "updateTabLanguageCode", "customView", "textColor", "backgroundColorTint", "fillBackground", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "updateTabLanguageLabel", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;)V", "updateTabView", "selected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "Callback", "app.lib"})
public final class LanguageScrollView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.LanguageScrollView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> languageCodes;
    private boolean allowSelect = false;
    
    public LanguageScrollView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    private final void updateTabView(boolean selected, com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    public final void setUpLanguageScrollTabData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languageCodes, int position, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.LanguageScrollView.Callback callback) {
    }
    
    private final android.view.View createLanguageTab(java.lang.String languageCode) {
        return null;
    }
    
    private final void updateTabLanguageLabel(android.view.View customView, java.lang.String languageCode, @androidx.annotation.ColorInt()
    java.lang.Integer textColor) {
    }
    
    private final void updateTabLanguageCode(android.view.View customView, java.lang.String languageCode, @androidx.annotation.ColorInt()
    java.lang.Integer textColor, @androidx.annotation.ColorInt()
    java.lang.Integer backgroundColorTint, boolean fillBackground) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/LanguageScrollView$Callback;", "", "onLanguageButtonClicked", "", "onLanguageTabSelected", "selectedLanguageCode", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onLanguageTabSelected(@org.jetbrains.annotations.NotNull()
        java.lang.String selectedLanguageCode);
        
        public abstract void onLanguageButtonClicked();
    }
}