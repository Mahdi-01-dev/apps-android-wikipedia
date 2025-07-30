package org.wikipedia.descriptions;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.EditAttemptStepEvent;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.captcha.CaptchaHandler;
import org.wikipedia.captcha.CaptchaResult;
import org.wikipedia.databinding.FragmentDescriptionEditBinding;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;
import org.wikipedia.dataclient.wikidata.EntityPostResponse;
import org.wikipedia.edit.Edit;
import org.wikipedia.edit.EditTags;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.notifications.AnonymousNotificationHelper;
import org.wikipedia.settings.Prefs;
import org.wikipedia.suggestededits.SuggestionsActivity;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.log.L;
import org.wikipedia.views.SuggestedArticleDescriptionsDialog;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u0001:\u0003678B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\n\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010)\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020(H\u0016J\u001a\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020+2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u00105\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "analyticsHelper", "Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;", "binding", "getBinding", "()Lerror/NonExistentClass;", "captchaHandler", "Lorg/wikipedia/captcha/CaptchaHandler;", "editSuccessLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loginLauncher", "successRunnable", "Ljava/lang/Runnable;", "viewModel", "Lorg/wikipedia/descriptions/DescriptionEditViewModel;", "getViewModel", "()Lorg/wikipedia/descriptions/DescriptionEditViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "voiceSearchLauncher", "callback", "Lorg/wikipedia/descriptions/DescriptionEditFragment$Callback;", "editFailed", "", "caught", "", "logError", "", "getEditComment", "", "getEditTags", "loadPageSummaryIfNeeded", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onSaveInstanceState", "outState", "onViewCreated", "view", "setUpEditView", "Callback", "Companion", "EditViewCallback", "app.lib"})
public final class DescriptionEditFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private FragmentDescriptionEditBinding _binding;
    private org.wikipedia.captcha.CaptchaHandler captchaHandler;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper analyticsHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> loginLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> editSuccessLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> voiceSearchLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable successRunnable = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_REVIEWING = "inReviewing";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_DESCRIPTION = "description";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MACHINE_SUGGESTION = "#machine-suggestion";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MACHINE_SUGGESTION_MODIFIED = "#machine-suggestion-modified";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditFragment.Companion Companion = null;
    
    public DescriptionEditFragment() {
        super();
    }
    
    private final org.wikipedia.descriptions.DescriptionEditViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void loadPageSummaryIfNeeded(android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpEditView(android.os.Bundle savedInstanceState) {
    }
    
    private final org.wikipedia.descriptions.DescriptionEditFragment.Callback callback() {
        return null;
    }
    
    private final java.lang.String getEditComment() {
        return null;
    }
    
    private final java.lang.String getEditTags() {
        return null;
    }
    
    private final void editFailed(java.lang.Throwable caught, boolean logError) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditFragment$Callback;", "", "onBottomBarContainerClicked", "", "onDescriptionEditSuccess", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onDescriptionEditSuccess();
        
        public abstract void onBottomBarContainerClicked();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditFragment$Companion;", "", "()V", "ARG_DESCRIPTION", "", "ARG_REVIEWING", "MACHINE_SUGGESTION", "MACHINE_SUGGESTION_MODIFIED", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditFragment$EditViewCallback;", "Lorg/wikipedia/descriptions/DescriptionEditView$Callback;", "(Lorg/wikipedia/descriptions/DescriptionEditFragment;)V", "getAnalyticsHelper", "Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;", "onBottomBarClick", "", "onCancelClick", "onSaveClick", "onVoiceInputClick", "app.lib"})
    final class EditViewCallback implements org.wikipedia.descriptions.DescriptionEditView.Callback {
        
        public EditViewCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSaveClick() {
        }
        
        @java.lang.Override()
        public void onCancelClick() {
        }
        
        @java.lang.Override()
        public void onBottomBarClick() {
        }
        
        @java.lang.Override()
        public void onVoiceInputClick() {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper getAnalyticsHelper() {
            return null;
        }
    }
}