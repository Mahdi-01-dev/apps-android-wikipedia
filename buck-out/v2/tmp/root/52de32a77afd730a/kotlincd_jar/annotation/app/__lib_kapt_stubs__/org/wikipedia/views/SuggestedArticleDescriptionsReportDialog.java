package org.wikipedia.views;

import android.app.Activity;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper;
import org.wikipedia.databinding.DialogDescriptionSuggestionReportBinding;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.FeedbackUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/views/SuggestedArticleDescriptionsReportDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "activity", "Landroid/app/Activity;", "suggestion", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "analyticsHelper", "Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;", "callback", "Lorg/wikipedia/views/SuggestedArticleDescriptionsReportDialog$Callback;", "(Landroid/app/Activity;Ljava/lang/String;Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;Lorg/wikipedia/views/SuggestedArticleDescriptionsReportDialog$Callback;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "reported", "", "getReportReasons", "", "show", "Callback", "app.lib"})
public final class SuggestedArticleDescriptionsReportDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper analyticsHelper = null;
    private boolean reported = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    
    public SuggestedArticleDescriptionsReportDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String suggestion, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.SuggestedArticleDescriptionsReportDialog.Callback callback) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog show() {
        return null;
    }
    
    private final java.util.List<java.lang.String> getReportReasons() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/SuggestedArticleDescriptionsReportDialog$Callback;", "", "onReportClick", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onReportClick();
    }
}