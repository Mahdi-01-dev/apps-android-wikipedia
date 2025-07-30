package org.wikipedia.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import org.wikipedia.R;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/views/CabSearchView;", "Landroidx/appcompat/widget/SearchView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "searchCloseBtn", "Landroid/widget/ImageView;", "searchSrcTextView", "Landroidx/appcompat/widget/SearchView$SearchAutoComplete;", "selectAllQueryTexts", "", "setCloseButtonVisibility", "searchString", "", "setSearchHintTextColor", "color", "", "Companion", "PlainTextInputFilter", "app.lib"})
public final class CabSearchView extends androidx.appcompat.widget.SearchView {
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ImageView searchCloseBtn = null;
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.SearchView.SearchAutoComplete searchSrcTextView = null;
    private static final int SEARCH_TEXT_SIZE = 16;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.CabSearchView.Companion Companion = null;
    
    public CabSearchView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final void selectAllQueryTexts() {
    }
    
    public final void setSearchHintTextColor(int color) {
    }
    
    public final void setCloseButtonVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.String searchString) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/views/CabSearchView$Companion;", "", "()V", "SEARCH_TEXT_SIZE", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/views/CabSearchView$PlainTextInputFilter;", "Landroid/text/InputFilter;", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "app.lib"})
    static final class PlainTextInputFilter implements android.text.InputFilter {
        
        public PlainTextInputFilter() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.CharSequence filter(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence source, int start, int end, @org.jetbrains.annotations.NotNull()
        android.text.Spanned dest, int dstart, int dend) {
            return null;
        }
    }
}