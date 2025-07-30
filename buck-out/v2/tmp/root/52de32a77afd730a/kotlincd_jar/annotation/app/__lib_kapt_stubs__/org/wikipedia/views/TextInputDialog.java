package org.wikipedia.views;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.databinding.DialogTextInputBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001c\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u001d\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001aR\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/views/TextInputDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/TextInputDialog$Callback;", "getCallback", "()Lorg/wikipedia/views/TextInputDialog$Callback;", "setCallback", "(Lorg/wikipedia/views/TextInputDialog$Callback;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "create", "setError", "", "text", "", "setHint", "id", "", "setPositiveButtonEnabled", "enabled", "", "setSecondaryHint", "setSecondaryText", "setText", "select", "showSecondaryText", "show", "Callback", "app.lib"})
public final class TextInputDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.TextInputDialog.Callback callback;
    
    public TextInputDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.TextInputDialog.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.TextInputDialog.Callback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog create() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, boolean select) {
    }
    
    public final void setSecondaryText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.TextInputDialog showSecondaryText(boolean show) {
        return null;
    }
    
    public final void setHint(@androidx.annotation.StringRes()
    int id) {
    }
    
    public final void setSecondaryHint(@androidx.annotation.StringRes()
    int id) {
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setPositiveButtonEnabled(boolean enabled) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/views/TextInputDialog$Callback;", "", "onCancel", "", "onShow", "dialog", "Lorg/wikipedia/views/TextInputDialog;", "onSuccess", "text", "", "secondaryText", "onTextChanged", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onShow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.TextInputDialog dialog);
        
        public abstract void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        org.wikipedia.views.TextInputDialog dialog);
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence secondaryText);
        
        public abstract void onCancel();
    }
}