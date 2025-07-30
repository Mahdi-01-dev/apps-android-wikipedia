package org.wikipedia.usercontrib;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.DialogUserInformationBinding;
import org.wikipedia.suggestededits.SuggestedEditsRecentEditsActivity;
import org.wikipedia.suggestededits.SuggestionsActivity;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/usercontrib/UserInformationDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "viewModel", "Lorg/wikipedia/usercontrib/UserInformationDialogViewModel;", "getViewModel", "()Lorg/wikipedia/usercontrib/UserInformationDialogViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onError", "t", "", "onLoading", "onSuccess", "editCount", "", "registrationDate", "Ljava/util/Date;", "sendPatrollerExperienceEvent", "setupDialog", "Companion", "app.lib"})
public final class UserInformationDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private DialogUserInformationBinding _binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERNAME_ARG = "username";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.usercontrib.UserInformationDialog.Companion Companion = null;
    
    public UserInformationDialog() {
        super();
    }
    
    private final org.wikipedia.usercontrib.UserInformationDialogViewModel getViewModel() {
        return null;
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setupDialog() {
    }
    
    private final void onLoading() {
    }
    
    private final void onSuccess(java.lang.String editCount, java.util.Date registrationDate) {
    }
    
    private final void sendPatrollerExperienceEvent() {
    }
    
    private final void onError(java.lang.Throwable t) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/usercontrib/UserInformationDialog$Companion;", "", "()V", "USERNAME_ARG", "", "newInstance", "Lorg/wikipedia/usercontrib/UserInformationDialog;", "username", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.usercontrib.UserInformationDialog newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String username) {
            return null;
        }
    }
}