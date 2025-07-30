package org.wikipedia.edit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.EditAttemptStepEvent;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.captcha.CaptchaHandler;
import org.wikipedia.captcha.CaptchaResult;
import org.wikipedia.databinding.ActivityEditSectionBinding;
import org.wikipedia.databinding.DialogWithCheckboxBinding;
import org.wikipedia.databinding.ItemEditActionbarButtonBinding;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;
import org.wikipedia.edit.insertmedia.InsertMediaActivity;
import org.wikipedia.edit.insertmedia.InsertMediaViewModel;
import org.wikipedia.edit.preview.EditPreviewFragment;
import org.wikipedia.edit.richtext.SyntaxHighlighter;
import org.wikipedia.edit.summaries.EditSummaryFragment;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.notifications.AnonymousNotificationHelper;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.settings.Prefs;
import org.wikipedia.theme.ThemeChooserDialog;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.EditNoticesDialog;
import org.wikipedia.views.ViewUtil;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001nB\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0006\u0010*\u001a\u00020&J\b\u0010+\u001a\u00020&H\u0002J\u0016\u0010,\u001a\u00020&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0.H\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u0019H\u0016J\u0012\u0010<\u001a\u00020&2\b\b\u0002\u0010=\u001a\u00020\u0019H\u0002J\b\u0010>\u001a\u00020&H\u0002J\b\u0010?\u001a\u00020&H\u0002J\u0012\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0002J\u0010\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020\bH\u0016J\b\u0010D\u001a\u00020&H\u0016J\b\u0010E\u001a\u00020&H\u0016J\u0012\u0010F\u001a\u00020&2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020&H\u0016J\u0010\u0010M\u001a\u00020&2\u0006\u00109\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020&2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020&H\u0016J\b\u0010S\u001a\u00020&H\u0016J \u0010T\u001a\u00020&2\u0006\u0010U\u001a\u0002072\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0019H\u0016J\u0010\u0010Y\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020(H\u0016J\b\u0010[\u001a\u00020&H\u0016J\u0010\u0010\\\u001a\u00020&2\u0006\u0010]\u001a\u00020HH\u0014J\b\u0010^\u001a\u00020&H\u0016J\b\u0010_\u001a\u00020&H\u0016J\b\u0010`\u001a\u00020&H\u0016J\b\u0010a\u001a\u00020&H\u0002J\u0012\u0010b\u001a\u00020&2\b\u0010c\u001a\u0004\u0018\u000103H\u0002J\b\u0010d\u001a\u00020&H\u0002J\u0010\u0010e\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u00010NJ\b\u0010f\u001a\u00020&H\u0002J\u0010\u0010g\u001a\u00020&2\u0006\u0010h\u001a\u00020\u0019H\u0016J\u0010\u0010i\u001a\u00020&2\u0006\u0010j\u001a\u00020NH\u0002J\b\u0010k\u001a\u00020&H\u0002J\b\u0010l\u001a\u00020&H\u0002J\b\u0010m\u001a\u00020&H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\u00a8\u0006o"}, d2 = {"Lorg/wikipedia/edit/EditSectionActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "Lorg/wikipedia/edit/preview/EditPreviewFragment$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$DismissCallback;", "()V", "actionMode", "Landroid/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "captchaHandler", "Lorg/wikipedia/captcha/CaptchaHandler;", "editPreviewFragment", "Lorg/wikipedia/edit/preview/EditPreviewFragment;", "editSummaryFragment", "Lorg/wikipedia/edit/summaries/EditSummaryFragment;", "movementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "requestInsertMedia", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestLogin", "sectionTextFirstLoad", "", "sectionTextModified", "syntaxHighlighter", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "textWatcher", "Landroid/text/TextWatcher;", "viewModel", "Lorg/wikipedia/edit/EditSectionViewModel;", "getViewModel", "()Lorg/wikipedia/edit/EditSectionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "applyActionBarButtonStyle", "", "menuItem", "Landroid/view/MenuItem;", "emphasize", "clickNextButton", "displaySectionText", "doExitActionWithConfirmationDialog", "action", "Lkotlin/Function0;", "doSave", "fetchSectionText", "finishActionMode", "getEditTag", "", "getInvokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getParentPageTitle", "Lorg/wikipedia/page/PageTitle;", "handleEditingException", "caught", "Lorg/wikipedia/dataclient/mwapi/MwException;", "isNewPage", "launchLogin", "createAccountFirst", "maybeShowEditNoticesTooltip", "maybeShowEditSourceDialog", "maybeShowTempAccountDialog", "fromToolbar", "onActionModeStarted", "mode", "onBackPressed", "onCancelThemeChooser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onEditFailure", "", "onEditSuccess", "result", "Lorg/wikipedia/edit/EditResult;", "onEditingPrefsChanged", "onLinkPreviewDismiss", "onLinkPreviewLoadPage", "title", "entry", "Lorg/wikipedia/history/HistoryEntry;", "inNewTab", "onOptionsItemSelected", "item", "onPause", "onSaveInstanceState", "outState", "onStart", "onToggleDimImages", "onToggleReadingFocusMode", "resetToStart", "scrollToHighlight", "highlightText", "showEditNotices", "showError", "showFindInEditor", "showProgressBar", "visible", "showRetryDialog", "t", "startInsertImageFlow", "updateEditLicenseText", "updateTextSize", "Companion", "app.lib"})
public final class EditSectionActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.theme.ThemeChooserDialog.Callback, org.wikipedia.edit.preview.EditPreviewFragment.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.LoadPageCallback, org.wikipedia.page.linkpreview.LinkPreviewDialog.DismissCallback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private ActivityEditSectionBinding binding;
    private android.text.TextWatcher textWatcher;
    private org.wikipedia.captcha.CaptchaHandler captchaHandler;
    private org.wikipedia.edit.preview.EditPreviewFragment editPreviewFragment;
    private org.wikipedia.edit.summaries.EditSummaryFragment editSummaryFragment;
    private org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter;
    private boolean sectionTextModified = false;
    private boolean sectionTextFirstLoad = true;
    @org.jetbrains.annotations.Nullable()
    private android.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestInsertMedia = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt movementMethod = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_KEY_SECTION_TEXT_MODIFIED = "sectionTextModified";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_KEY_TEMPORARY_WIKITEXT_STORED = "hasTemporaryWikitextStored";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_KEY_EDITING_ALLOWED = "editingAllowed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SECTION_ID = "sectionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SECTION_ANCHOR = "sectionAnchor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HIGHLIGHT_TEXT = "sectionHighlightText";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REV_ID = "revId";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.EditSectionActivity.Companion Companion = null;
    
    public EditSectionActivity() {
        super();
    }
    
    private final org.wikipedia.edit.EditSectionViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    private final void updateEditLicenseText() {
    }
    
    private final void doSave() {
    }
    
    private final java.lang.String getEditTag() {
        return null;
    }
    
    private final void onEditSuccess(org.wikipedia.edit.EditResult result) {
    }
    
    private final void onEditFailure(java.lang.Throwable caught) {
    }
    
    private final void showRetryDialog(java.lang.Throwable t) {
    }
    
    /**
     * Processes API error codes encountered during editing, and handles them as appropriate.
     * @param caught The MwException to handle.
     */
    private final void handleEditingException(org.wikipedia.dataclient.mwapi.MwException caught) {
    }
    
    /**
     * Executes a click of the actionbar button, and performs the appropriate action
     * based on the current state of the button.
     */
    public final void clickNextButton() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onActionModeStarted(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    private final void applyActionBarButtonStyle(android.view.MenuItem menuItem, boolean emphasize) {
    }
    
    public final void showError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
    }
    
    private final void showFindInEditor() {
    }
    
    private final void finishActionMode() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void updateTextSize() {
    }
    
    private final void resetToStart() {
    }
    
    private final void fetchSectionText() {
    }
    
    private final void maybeShowEditNoticesTooltip() {
    }
    
    private final void showEditNotices() {
    }
    
    private final void maybeShowEditSourceDialog() {
    }
    
    private final void displaySectionText() {
    }
    
    private final void scrollToHighlight(java.lang.String highlightText) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.page.PageTitle getParentPageTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void showProgressBar(boolean visible) {
    }
    
    @java.lang.Override()
    public boolean isNewPage() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void doExitActionWithConfirmationDialog(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    private final boolean maybeShowTempAccountDialog(boolean fromToolbar) {
        return false;
    }
    
    private final void launchLogin(boolean createAccountFirst) {
    }
    
    private final void startInsertImageFlow() {
    }
    
    @java.lang.Override()
    public void onToggleDimImages() {
    }
    
    @java.lang.Override()
    public void onToggleReadingFocusMode() {
    }
    
    @java.lang.Override()
    public void onCancelThemeChooser() {
    }
    
    @java.lang.Override()
    public void onEditingPrefsChanged() {
    }
    
    @java.lang.Override()
    public void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewDismiss() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\\\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/edit/EditSectionActivity$Companion;", "", "()V", "EXTRA_HIGHLIGHT_TEXT", "", "EXTRA_KEY_EDITING_ALLOWED", "EXTRA_KEY_SECTION_TEXT_MODIFIED", "EXTRA_KEY_TEMPORARY_WIKITEXT_STORED", "EXTRA_REV_ID", "EXTRA_SECTION_ANCHOR", "EXTRA_SECTION_ID", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sectionId", "", "sectionAnchor", "title", "Lorg/wikipedia/page/PageTitle;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "highlightText", "addImageTitle", "addImageSource", "addImageSourceProjects", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int sectionId, @org.jetbrains.annotations.Nullable()
        java.lang.String sectionAnchor, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.Nullable()
        java.lang.String highlightText, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle addImageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String addImageSource, @org.jetbrains.annotations.NotNull()
        java.lang.String addImageSourceProjects) {
            return null;
        }
    }
}