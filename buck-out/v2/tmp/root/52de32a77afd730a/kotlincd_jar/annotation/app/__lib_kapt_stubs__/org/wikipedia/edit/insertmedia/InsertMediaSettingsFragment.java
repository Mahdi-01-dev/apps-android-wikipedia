package org.wikipedia.edit.insertmedia;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.commons.ImagePreviewDialog;
import org.wikipedia.databinding.FragmentInsertMediaSettingsBinding;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.CustomTabsUtil;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.AppTextViewWithImages;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u0012J\u0010\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u001eH\u0002J$\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020\u001eR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaSettingsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "activity", "Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;", "alternativeText", "getAlternativeText", "()Lerror/NonExistentClass;", "binding", "getBinding", "captionText", "getCaptionText", "currentVoiceInputParentLayout", "Landroid/view/View;", "isActive", "", "()Z", "viewModel", "Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "getViewModel", "()Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "voiceSearchLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "handleBackPressed", "hide", "", "reset", "launchVoiceInput", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "sendInsertMediaEvent", "action", "", "show", "app.lib"})
public final class InsertMediaSettingsFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.edit.insertmedia.InsertMediaActivity activity;
    @org.jetbrains.annotations.Nullable()
    private FragmentInsertMediaSettingsBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.View currentVoiceInputParentLayout;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> voiceSearchLauncher = null;
    
    public InsertMediaSettingsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.edit.insertmedia.InsertMediaViewModel getViewModel() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAlternativeText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCaptionText() {
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
    
    private final void sendInsertMediaEvent(java.lang.String action) {
    }
    
    private final void launchVoiceInput() {
    }
    
    public final void show() {
    }
    
    public final void hide(boolean reset) {
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}