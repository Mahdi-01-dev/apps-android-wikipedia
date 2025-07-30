package org.wikipedia.diff;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.DialogUndoEditBinding;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016R\u0010\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/diff/UndoEditDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "context", "Landroid/content/Context;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "callback", "Lorg/wikipedia/diff/UndoEditDialog$Callback;", "(Landroid/content/Context;Lorg/wikipedia/Constants$InvokeSource;Lorg/wikipedia/diff/UndoEditDialog$Callback;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "setPositiveButtonEnabled", "", "enabled", "", "show", "Callback", "app.lib"})
public final class UndoEditDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    
    public UndoEditDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.NotNull()
    org.wikipedia.diff.UndoEditDialog.Callback callback) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog show() {
        return null;
    }
    
    private final void setPositiveButtonEnabled(boolean enabled) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/diff/UndoEditDialog$Callback;", "", "onSuccess", "", "text", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text);
    }
}