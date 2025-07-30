package org.wikipedia.edit;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewWikitextKeyboardBinding;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \'2\u00020\u0001:\u0002&\'B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u001eR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lorg/wikipedia/edit/WikiTextKeyboardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/edit/WikiTextKeyboardView$Callback;", "getCallback", "()Lorg/wikipedia/edit/WikiTextKeyboardView$Callback;", "setCallback", "(Lorg/wikipedia/edit/WikiTextKeyboardView$Callback;)V", "editText", "Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "getEditText", "()Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "setEditText", "(Lorg/wikipedia/edit/SyntaxHighlightableEditText;)V", "value", "", "userMentionVisible", "getUserMentionVisible", "()Z", "setUserMentionVisible", "(Z)V", "insertLink", "", "title", "Lorg/wikipedia/page/PageTitle;", "baseLangCode", "", "onAfterFormattingShown", "onAfterHeadingsShown", "onAfterOverlaysHidden", "Callback", "Companion", "app.lib"})
public final class WikiTextKeyboardView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.edit.WikiTextKeyboardView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.edit.SyntaxHighlightableEditText editText;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.WikiTextKeyboardView.Companion Companion = null;
    
    public WikiTextKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.edit.WikiTextKeyboardView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.edit.WikiTextKeyboardView.Callback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.edit.SyntaxHighlightableEditText getEditText() {
        return null;
    }
    
    public final void setEditText(@org.jetbrains.annotations.Nullable()
    org.wikipedia.edit.SyntaxHighlightableEditText p0) {
    }
    
    public final boolean getUserMentionVisible() {
        return false;
    }
    
    public final void setUserMentionVisible(boolean value) {
    }
    
    public final void insertLink(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String baseLangCode) {
    }
    
    public final void onAfterFormattingShown() {
    }
    
    public final void onAfterHeadingsShown() {
    }
    
    public final void onAfterOverlaysHidden() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/WikiTextKeyboardView$Callback;", "", "onPreviewLink", "", "title", "", "onRequestFormatting", "onRequestHeading", "onRequestInsertLink", "onRequestInsertMedia", "onRequestInsertTemplate", "onSyntaxOverlayCollapse", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onPreviewLink(@org.jetbrains.annotations.NotNull()
        java.lang.String title);
        
        public abstract void onRequestInsertMedia();
        
        public abstract void onRequestInsertLink();
        
        public abstract void onRequestInsertTemplate();
        
        public abstract void onRequestHeading();
        
        public abstract void onRequestFormatting();
        
        public abstract void onSyntaxOverlayCollapse();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/WikiTextKeyboardView$Companion;", "", "()V", "toggleSyntaxAroundCurrentSelection", "", "editText", "Landroid/widget/EditText;", "ic", "Landroid/view/inputmethod/InputConnection;", "prefix", "", "suffix", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void toggleSyntaxAroundCurrentSelection(@org.jetbrains.annotations.Nullable()
        android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
        android.view.inputmethod.InputConnection ic, @org.jetbrains.annotations.NotNull()
        java.lang.String prefix, @org.jetbrains.annotations.NotNull()
        java.lang.String suffix) {
        }
    }
}