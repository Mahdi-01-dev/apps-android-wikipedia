package org.wikipedia.views;

import android.app.Activity;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper;
import org.wikipedia.databinding.DialogArticleDescriptionsBinding;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/views/SuggestedArticleDescriptionsDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "activity", "Landroid/app/Activity;", "firstSuggestion", "", "secondSuggestion", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "analyticsHelper", "Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;", "callback", "Lorg/wikipedia/views/SuggestedArticleDescriptionsDialog$Callback;", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;Lorg/wikipedia/views/SuggestedArticleDescriptionsDialog$Callback;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "suggestionChosen", "", "show", "Callback", "Companion", "app.lib"})
public final class SuggestedArticleDescriptionsDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper analyticsHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    private boolean suggestionChosen = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> availableLanguages = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.SuggestedArticleDescriptionsDialog.Companion Companion = null;
    
    public SuggestedArticleDescriptionsDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String firstSuggestion, @org.jetbrains.annotations.Nullable()
    java.lang.String secondSuggestion, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.SuggestedArticleDescriptionsDialog.Callback callback) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog show() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/SuggestedArticleDescriptionsDialog$Callback;", "", "onSuggestionClicked", "", "suggestion", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSuggestionClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String suggestion);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/SuggestedArticleDescriptionsDialog$Companion;", "", "()V", "availableLanguages", "", "", "getAvailableLanguages", "()Ljava/util/List;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAvailableLanguages() {
            return null;
        }
    }
}