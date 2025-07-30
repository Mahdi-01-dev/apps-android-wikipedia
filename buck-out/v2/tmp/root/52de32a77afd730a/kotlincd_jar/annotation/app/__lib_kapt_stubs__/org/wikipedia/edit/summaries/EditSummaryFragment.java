package org.wikipedia.edit.summaries;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.chip.Chip;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.FragmentPreviewSummaryBinding;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.edit.EditSectionActivity;
import org.wikipedia.edit.EditSectionViewModel;
import org.wikipedia.edit.insertmedia.InsertMediaActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ViewAnimations;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u0006\u0010-\u001a\u00020\fJ\u0006\u0010.\u001a\u00020*J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020*H\u0002J$\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020*H\u0016J\b\u0010;\u001a\u00020*H\u0016J\u0006\u0010<\u001a\u00020*J\u0006\u0010=\u001a\u00020*R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\b\u00a8\u0006>"}, d2 = {"Lorg/wikipedia/edit/summaries/EditSummaryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "editSummaryHandler", "Lorg/wikipedia/edit/summaries/EditSummaryHandler;", "isActive", "", "()Z", "isMinorEdit", "summary", "getSummary", "summaryText", "getSummaryText", "title", "Lorg/wikipedia/page/PageTitle;", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "setTitle", "(Lorg/wikipedia/page/PageTitle;)V", "viewModel", "Lorg/wikipedia/edit/EditSectionViewModel;", "getViewModel", "()Lorg/wikipedia/edit/EditSectionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "voiceSearchLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "watchThisPage", "getWatchThisPage", "addChip", "Lcom/google/android/material/chip/Chip;", "editSummary", "", "addEditSummaries", "", "getActionDataStringForData", "getWatchedStatus", "handleBackPressed", "hide", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "launchVoiceInput", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "saveSummary", "show", "app.lib"})
public final class EditSummaryFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentPreviewSummaryBinding _binding;
    private org.wikipedia.edit.summaries.EditSummaryHandler editSummaryHandler;
    public org.wikipedia.page.PageTitle title;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> voiceSearchLauncher = null;
    
    public EditSummaryFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSummaryText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object isMinorEdit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getWatchThisPage() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    private final org.wikipedia.edit.EditSectionViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final java.lang.String getActionDataStringForData() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void launchVoiceInput() {
    }
    
    private final void getWatchedStatus() {
    }
    
    private final void addEditSummaries() {
    }
    
    private final com.google.android.material.chip.Chip addChip(java.lang.String editSummary) {
        return null;
    }
    
    private final org.wikipedia.Constants.InvokeSource invokeSource() {
        return null;
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
    
    public final void saveSummary() {
    }
}