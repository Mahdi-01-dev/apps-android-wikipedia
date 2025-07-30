package org.wikipedia.views;

import android.app.Activity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.DialogFeedbackOptionsBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J4\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/views/SurveyDialog;", "", "()V", "showFeedbackInputDialog", "", "activity", "Landroid/app/Activity;", "messageId", "", "source", "Lorg/wikipedia/Constants$InvokeSource;", "showFeedbackOptionsDialog", "titleId", "snackbarMessageId", "invokeSource", "showFeedbackSnackbarAndTooltip", "app.lib"})
public final class SurveyDialog {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.SurveyDialog INSTANCE = null;
    
    private SurveyDialog() {
        super();
    }
    
    public final void showFeedbackOptionsDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int titleId, int messageId, int snackbarMessageId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    private final void showFeedbackInputDialog(android.app.Activity activity, int messageId, org.wikipedia.Constants.InvokeSource source) {
    }
    
    private final void showFeedbackSnackbarAndTooltip(android.app.Activity activity, int messageId, org.wikipedia.Constants.InvokeSource source) {
    }
}