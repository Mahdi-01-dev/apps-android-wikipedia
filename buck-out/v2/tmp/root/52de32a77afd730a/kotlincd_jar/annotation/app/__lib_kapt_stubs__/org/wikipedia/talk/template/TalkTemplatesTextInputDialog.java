package org.wikipedia.talk.template;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.databinding.DialogTalkTemplatesTextInputBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\bR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesTextInputDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "activity", "Landroid/app/Activity;", "positiveButtonText", "", "negativeButtonText", "isExisting", "", "(Landroid/app/Activity;IIZ)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/talk/template/TalkTemplatesTextInputDialog$Callback;", "getCallback", "()Lorg/wikipedia/talk/template/TalkTemplatesTextInputDialog$Callback;", "setCallback", "(Lorg/wikipedia/talk/template/TalkTemplatesTextInputDialog$Callback;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "isSaveAsNewChecked", "()Lerror/NonExistentClass;", "isSaveExistingChecked", "create", "getView", "Landroid/view/ViewGroup;", "setError", "", "text", "", "setPositiveButtonEnabled", "enabled", "Callback", "app.lib"})
public final class TalkTemplatesTextInputDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.talk.template.TalkTemplatesTextInputDialog.Callback callback;
    
    public TalkTemplatesTextInputDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int positiveButtonText, int negativeButtonText, boolean isExisting) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.talk.template.TalkTemplatesTextInputDialog.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.talk.template.TalkTemplatesTextInputDialog.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object isSaveAsNewChecked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object isSaveExistingChecked() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog create() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setPositiveButtonEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getView() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesTextInputDialog$Callback;", "", "getSubjectText", "", "onCancel", "", "onDismiss", "onSuccess", "subjectText", "onTextChanged", "text", "dialog", "Lorg/wikipedia/talk/template/TalkTemplatesTextInputDialog;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String subjectText);
        
        public abstract void onCancel();
        
        public abstract void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.template.TalkTemplatesTextInputDialog dialog);
        
        public abstract void onDismiss();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getSubjectText();
    }
}