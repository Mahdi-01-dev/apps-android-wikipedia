package org.wikipedia.descriptions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.commons.ImagePreviewDialog;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.settings.Prefs;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.DeviceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/descriptions/DescriptionEditFragment;", "Lorg/wikipedia/descriptions/DescriptionEditFragment$Callback;", "()V", "viewModel", "Lorg/wikipedia/descriptions/DescriptionEditViewModel;", "getViewModel", "()Lorg/wikipedia/descriptions/DescriptionEditViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createFragment", "onBackPressed", "", "onBottomBarContainerClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDescriptionEditSuccess", "updateNavigationBarColor", "color", "", "updateStatusBarColor", "Action", "Companion", "app.lib"})
public final class DescriptionEditActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.descriptions.DescriptionEditFragment> implements org.wikipedia.descriptions.DescriptionEditFragment.Callback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HIGHLIGHT_TEXT = "highlightText";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE_SUMMARY = "sourceSummary";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TARGET_SUMMARY = "targetSummary";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditActivity.Companion Companion = null;
    
    public DescriptionEditActivity() {
        super();
    }
    
    private final org.wikipedia.descriptions.DescriptionEditViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.descriptions.DescriptionEditFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onDescriptionEditSuccess() {
    }
    
    @java.lang.Override()
    public void onBottomBarContainerClicked() {
    }
    
    public final void updateStatusBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    public final void updateNavigationBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "", "(Ljava/lang/String;I)V", "ADD_DESCRIPTION", "TRANSLATE_DESCRIPTION", "ADD_CAPTION", "TRANSLATE_CAPTION", "ADD_IMAGE_TAGS", "IMAGE_RECOMMENDATIONS", "VANDALISM_PATROL", "app.lib"})
    public static enum Action {
        /*public static final*/ ADD_DESCRIPTION /* = new ADD_DESCRIPTION() */,
        /*public static final*/ TRANSLATE_DESCRIPTION /* = new TRANSLATE_DESCRIPTION() */,
        /*public static final*/ ADD_CAPTION /* = new ADD_CAPTION() */,
        /*public static final*/ TRANSLATE_CAPTION /* = new TRANSLATE_CAPTION() */,
        /*public static final*/ ADD_IMAGE_TAGS /* = new ADD_IMAGE_TAGS() */,
        /*public static final*/ IMAGE_RECOMMENDATIONS /* = new IMAGE_RECOMMENDATIONS() */,
        /*public static final*/ VANDALISM_PATROL /* = new VANDALISM_PATROL() */;
        
        Action() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.descriptions.DescriptionEditActivity.Action> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JD\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditActivity$Companion;", "", "()V", "EXTRA_HIGHLIGHT_TEXT", "", "EXTRA_SOURCE_SUMMARY", "EXTRA_TARGET_SUMMARY", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "title", "Lorg/wikipedia/page/PageTitle;", "highlightText", "sourceSummary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "targetSummary", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
        java.lang.String highlightText, @org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary, @org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.PageSummaryForEdit targetSummary, @org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}