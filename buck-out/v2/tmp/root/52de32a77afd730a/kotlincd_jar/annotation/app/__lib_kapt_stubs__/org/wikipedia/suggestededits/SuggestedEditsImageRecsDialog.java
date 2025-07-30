package org.wikipedia.suggestededits;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.databinding.FragmentSuggestedEditsImageRecsDialogBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "checkBoxChangedHandler", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "checkboxes", "", "Landroid/widget/CheckBox;", "[Landroid/widget/CheckBox;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "responseCode", "", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsDialog$Callback;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onResume", "updateSubmitState", "Callback", "Companion", "app.lib"})
public final class SuggestedEditsImageRecsDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsImageRecsDialogBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    private int responseCode = -1;
    private android.widget.CheckBox[] checkboxes;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.CompoundButton.OnCheckedChangeListener checkBoxChangedHandler = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_RESPONSE = "response";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageRecsDialog.Companion Companion = null;
    
    public SuggestedEditsImageRecsDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void updateSubmitState() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.SuggestedEditsImageRecsDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsDialog$Callback;", "", "onDialogSubmit", "", "response", "", "selectedItems", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onDialogSubmit(int response, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> selectedItems);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsDialog$Companion;", "", "()V", "ARG_RESPONSE", "", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsDialog;", "response", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsImageRecsDialog newInstance(int response) {
            return null;
        }
    }
}