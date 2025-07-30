package org.wikipedia.descriptions;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper;
import org.wikipedia.databinding.GroupCaptchaBinding;
import org.wikipedia.databinding.ViewDescriptionEditBinding;
import org.wikipedia.language.LanguageUtil;
import org.wikipedia.mlkit.MlKitLanguageDetector;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.SuggestedArticleDescriptionsDialog;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 e2\u00020\u0001:\u0002deB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001aH\u0002J\b\u00105\u001a\u000201H\u0002J\u000b\u00106\u001a\u00020\n\u00a2\u0006\u0002\u00107J\u0006\u00108\u001a\u00020\u0001J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001aH\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0013H\u0002J\u0010\u0010?\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0013H\u0002J\u0012\u0010@\u001a\u0002012\b\u0010\u0012\u001a\u0004\u0018\u00010=H\u0002J\u000e\u0010A\u001a\u0002012\u0006\u00103\u001a\u00020\u001aJ\b\u0010B\u001a\u000201H\u0014J\u0016\u0010C\u001a\u0002012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130EH\u0016J\b\u0010F\u001a\u000201H\u0002J\u000e\u0010G\u001a\u0002012\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010H\u001a\u0002012\u0006\u00103\u001a\u00020\u001aH\u0002J\u000e\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\u001aJ\u0010\u0010K\u001a\u0002012\b\u0010\u0012\u001a\u0004\u0018\u00010=J\u0010\u0010L\u001a\u0002012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010M\u001a\u000201H\u0002J\u000e\u0010N\u001a\u0002012\u0006\u0010\f\u001a\u00020OJ\u000e\u0010P\u001a\u0002012\u0006\u0010\'\u001a\u00020(J\u0010\u0010Q\u001a\u0002012\u0006\u0010;\u001a\u00020\u001aH\u0002J\u000e\u0010R\u001a\u0002012\u0006\u0010S\u001a\u00020\u001aJ\u0018\u0010T\u001a\u0002012\u0006\u0010U\u001a\u00020&2\b\u0010V\u001a\u0004\u0018\u00010&J\b\u0010W\u001a\u000201H\u0002J\u0012\u0010X\u001a\u0002012\b\u0010\u0012\u001a\u0004\u0018\u00010=H\u0002J\u000e\u0010Y\u001a\u0002012\u0006\u0010Z\u001a\u00020\u001aJ\u0018\u0010[\u001a\u0002012\u0006\u0010\\\u001a\u00020\u00132\b\u0010]\u001a\u0004\u0018\u00010\u0013J\u0006\u0010^\u001a\u000201J\u0006\u0010_\u001a\u00020\u001aJ\u0006\u0010`\u001a\u000201J\b\u0010a\u001a\u000201H\u0002J\u0006\u0010b\u001a\u000201J\b\u0010c\u001a\u000201H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010$\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010-\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001e\u00a8\u0006f"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/descriptions/DescriptionEditView$Callback;", "getCallback", "()Lorg/wikipedia/descriptions/DescriptionEditView$Callback;", "setCallback", "(Lorg/wikipedia/descriptions/DescriptionEditView$Callback;)V", "text", "", "description", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "isLanguageWrong", "", "isSuggestionButtonEnabled", "()Z", "setSuggestionButtonEnabled", "(Z)V", "isTextValid", "isTranslationEdit", "languageDetectRunnable", "Ljava/lang/Runnable;", "mlKitLanguageDetector", "originalDescription", "pageSummaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "textValidateRunnable", "wasSuggestionChosen", "getWasSuggestionChosen", "setWasSuggestionChosen", "wasSuggestionModified", "getWasSuggestionModified", "setWasSuggestionModified", "clearError", "", "enableSaveButton", "enabled", "saveInProgress", "enqueueValidateText", "getCaptchaContainer", "()Lerror/NonExistentClass;", "getDescriptionEditTextView", "getHeaderTextRes", "", "inReview", "getHintText", "", "lang", "getLabelText", "layoutErrorState", "loadReviewContent", "onDetachedFromWindow", "onLanguageDetectionSuccess", "languageCodes", "", "performReadArticleClick", "setAction", "setDarkReviewScreen", "setEditAllowed", "allowed", "setError", "setHighlightText", "setHintText", "setLoginCallback", "Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Callback;", "setPageTitle", "setReviewHeaderText", "setSaveState", "saving", "setSummaries", "sourceSummary", "targetSummary", "setVoiceInput", "setWarning", "showProgressBar", "show", "showSuggestedDescriptionsButton", "firstSuggestion", "secondSuggestion", "showSuggestedDescriptionsLoadingProgress", "showingReviewContent", "updateInfoText", "updateSaveButtonEnabled", "updateSuggestedDescriptionsButtonVisibility", "validateText", "Callback", "Companion", "app.lib"})
public final class DescriptionEditView extends android.widget.LinearLayout implements MlKitLanguageDetector.Callback {
    private org.wikipedia.page.PageTitle pageTitle;
    private org.wikipedia.suggestededits.PageSummaryForEdit pageSummaryForEdit;
    private org.wikipedia.descriptions.DescriptionEditActivity.Action action;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object mlKitLanguageDetector = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable languageDetectRunnable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable textValidateRunnable = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String originalDescription;
    private boolean isTranslationEdit = false;
    private boolean isLanguageWrong = false;
    private boolean isTextValid = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.descriptions.DescriptionEditView.Callback callback;
    private boolean isSuggestionButtonEnabled = false;
    private boolean wasSuggestionChosen = false;
    private boolean wasSuggestionModified = false;
    private static final long TEXT_VALIDATE_DELAY_MILLIS = 1000L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditView.Companion Companion = null;
    
    public DescriptionEditView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.descriptions.DescriptionEditView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditView.Callback p0) {
    }
    
    public final boolean isSuggestionButtonEnabled() {
        return false;
    }
    
    public final void setSuggestionButtonEnabled(boolean p0) {
    }
    
    public final boolean getWasSuggestionChosen() {
        return false;
    }
    
    public final void setWasSuggestionChosen(boolean p0) {
    }
    
    public final boolean getWasSuggestionModified() {
        return false;
    }
    
    public final void setWasSuggestionModified(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public final void setLoginCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditLicenseView.Callback callback) {
    }
    
    public final void setPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    private final void setVoiceInput() {
    }
    
    private final void setHintText() {
    }
    
    private final int getHeaderTextRes(boolean inReview) {
        return 0;
    }
    
    private final java.lang.CharSequence getLabelText(java.lang.String lang) {
        return null;
    }
    
    private final java.lang.CharSequence getHintText(java.lang.String lang) {
        return null;
    }
    
    private final void setReviewHeaderText(boolean inReview) {
    }
    
    private final void setDarkReviewScreen(boolean enabled) {
    }
    
    public final void setSummaries(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit targetSummary) {
    }
    
    public final void setEditAllowed(boolean allowed) {
    }
    
    public final void setSaveState(boolean saving) {
    }
    
    public final void loadReviewContent(boolean enabled) {
    }
    
    public final boolean showingReviewContent() {
        return false;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    private final void setWarning(java.lang.CharSequence text) {
    }
    
    private final void clearError() {
    }
    
    private final void layoutErrorState(java.lang.CharSequence text) {
    }
    
    private final void enqueueValidateText() {
    }
    
    private final void validateText() {
    }
    
    public final void setHighlightText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    private final void updateSaveButtonEnabled() {
    }
    
    private final void enableSaveButton(boolean enabled, boolean saveInProgress) {
    }
    
    public final void showProgressBar(boolean show) {
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    private final void performReadArticleClick() {
    }
    
    public void onLanguageDetectionSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languageCodes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getDescriptionEditTextView() {
        return null;
    }
    
    public final void updateInfoText() {
    }
    
    public final void showSuggestedDescriptionsLoadingProgress() {
    }
    
    public final void updateSuggestedDescriptionsButtonVisibility() {
    }
    
    public final void showSuggestedDescriptionsButton(@org.jetbrains.annotations.NotNull()
    java.lang.String firstSuggestion, @org.jetbrains.annotations.Nullable()
    java.lang.String secondSuggestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final GroupCaptchaBinding getCaptchaContainer() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditView$Callback;", "", "getAnalyticsHelper", "Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;", "onBottomBarClick", "", "onCancelClick", "onSaveClick", "onVoiceInputClick", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSaveClick();
        
        public abstract void onCancelClick();
        
        public abstract void onBottomBarClick();
        
        public abstract void onVoiceInputClick();
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper getAnalyticsHelper();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditView$Companion;", "", "()V", "TEXT_VALIDATE_DELAY_MILLIS", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}