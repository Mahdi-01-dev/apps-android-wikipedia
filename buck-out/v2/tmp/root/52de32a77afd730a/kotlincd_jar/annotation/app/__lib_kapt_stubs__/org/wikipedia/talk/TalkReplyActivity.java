package org.wikipedia.talk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.EditAttemptStepEvent;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.ActivityTalkReplyBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.edit.SyntaxHighlightViewAdapter;
import org.wikipedia.edit.insertmedia.InsertMediaActivity;
import org.wikipedia.edit.insertmedia.InsertMediaViewModel;
import org.wikipedia.edit.preview.EditPreviewFragment;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.notifications.AnonymousNotificationHelper;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.TalkAliasData;
import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.talk.template.TalkTemplatesTextInputDialog;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.UserMentionInputView;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002LMB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020\u0015H\u0016J\u0012\u0010\'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u0015H\u0002J\u0012\u0010*\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020(H\u0016J\u0012\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020(H\u0016J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0002J\b\u00103\u001a\u00020(H\u0016J\b\u00104\u001a\u00020(H\u0014J\u0010\u00105\u001a\u00020(2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020(H\u0016J\b\u0010<\u001a\u00020(H\u0016J\"\u0010=\u001a\u00020(2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\b\b\u0002\u0010@\u001a\u00020$H\u0002J\u0010\u0010A\u001a\u00020(2\u0006\u0010B\u001a\u00020\u0015H\u0002J\u0010\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020\"H\u0002J\b\u0010E\u001a\u00020(H\u0002J\u0010\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020\u0015H\u0016J\u0018\u0010H\u001a\u00020(2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$H\u0002J\b\u0010K\u001a\u00020(H\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006N"}, d2 = {"Lorg/wikipedia/talk/TalkReplyActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/views/UserMentionInputView$Listener;", "Lorg/wikipedia/edit/preview/EditPreviewFragment$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$DismissCallback;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "licenseTextMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "linkHandler", "Lorg/wikipedia/talk/TalkReplyActivity$TalkLinkHandler;", "linkMovementMethod", "messagePreviewFragment", "Lorg/wikipedia/edit/preview/EditPreviewFragment;", "requestInsertMedia", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestLogin", "savedSuccess", "", "shouldWatchText", "subjectOrBodyModified", "textWatcher", "Landroid/text/TextWatcher;", "userMentionScrolled", "viewModel", "Lorg/wikipedia/talk/TalkReplyViewModel;", "getViewModel", "()Lorg/wikipedia/talk/TalkReplyViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getParentPageTitle", "Lorg/wikipedia/page/PageTitle;", "getWikitextBody", "", "getWikitextForPreview", "isNewPage", "launchLogin", "", "createAccountFirst", "maybeShowTempAccountDialog", "force", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGoNext", "onInitialLoad", "onLinkPreviewDismiss", "onResume", "onSaveError", "t", "", "onSaveSuccess", "newRevision", "", "onUserMentionComplete", "onUserMentionListUpdate", "sendPatrollerExperienceEvent", "action", "activeInterface", "actionData", "setSaveButtonEnabled", "enabled", "setToolbarTitle", "pageTitle", "showEditPreview", "showProgressBar", "visible", "showSaveDialog", "subject", "body", "updateEditLicenseText", "Companion", "TalkLinkHandler", "app.lib"})
public final class TalkReplyActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.views.UserMentionInputView.Listener, org.wikipedia.edit.preview.EditPreviewFragment.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.DismissCallback {
    private ActivityTalkReplyBinding binding;
    private org.wikipedia.talk.TalkReplyActivity.TalkLinkHandler linkHandler;
    private android.text.TextWatcher textWatcher;
    private org.wikipedia.edit.preview.EditPreviewFragment messagePreviewFragment;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean userMentionScrolled = false;
    private boolean shouldWatchText = true;
    private boolean subjectOrBodyModified = false;
    private boolean savedSuccess = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt linkMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt licenseTextMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestInsertMedia = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PARENT_SUBJECT = "parentSubject";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TOPIC = "topic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TOPIC_ID = "topicId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBJECT = "subject";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_BODY = "body";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FROM_DIFF = "fromDiff";
    public static final int RESULT_EDIT_SUCCESS = 1;
    public static final int RESULT_BACK_FROM_TOPIC = 2;
    public static final int RESULT_SAVE_TEMPLATE = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_NEW_REVISION_ID = "newRevisionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TO_REVISION_ID = "toRevisionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_REVISION_ID = "fromRevisionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SELECTED_TEMPLATE = "selectedTemplate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TEMPLATE_MANAGEMENT = "templateManagement";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EXAMPLE_TEMPLATE = "exampleTemplate";
    @org.jetbrains.annotations.NotNull()
    private static final android.util.LruCache<java.lang.String, java.lang.CharSequence> draftReplies = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.TalkReplyActivity.Companion Companion = null;
    
    public TalkReplyActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.talk.TalkReplyViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void onInitialLoad() {
    }
    
    private final void setToolbarTitle(org.wikipedia.page.PageTitle pageTitle) {
    }
    
    private final void setSaveButtonEnabled(boolean enabled) {
    }
    
    private final void showSaveDialog(java.lang.String subject, java.lang.String body) {
    }
    
    private final void onGoNext() {
    }
    
    private final void showEditPreview() {
    }
    
    private final java.lang.String getWikitextForPreview() {
        return null;
    }
    
    private final java.lang.String getWikitextBody() {
        return null;
    }
    
    private final void onSaveSuccess(long newRevision) {
    }
    
    private final void onSaveError(java.lang.Throwable t) {
    }
    
    private final void updateEditLicenseText() {
    }
    
    private final boolean maybeShowTempAccountDialog(boolean force) {
        return false;
    }
    
    private final void launchLogin(boolean createAccountFirst) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onUserMentionListUpdate() {
    }
    
    @java.lang.Override()
    public void onUserMentionComplete() {
    }
    
    private final void sendPatrollerExperienceEvent(java.lang.String action, java.lang.String activeInterface, java.lang.String actionData) {
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
    public void onLinkPreviewDismiss() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0088\u0001\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010&\u001a\u00020\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/talk/TalkReplyActivity$Companion;", "", "()V", "EXTRA_BODY", "", "EXTRA_EXAMPLE_TEMPLATE", "EXTRA_FROM_DIFF", "EXTRA_PARENT_SUBJECT", "EXTRA_SELECTED_TEMPLATE", "EXTRA_SUBJECT", "EXTRA_TEMPLATE_MANAGEMENT", "EXTRA_TOPIC", "EXTRA_TOPIC_ID", "FROM_REVISION_ID", "RESULT_BACK_FROM_TOPIC", "", "RESULT_EDIT_SUCCESS", "RESULT_NEW_REVISION_ID", "RESULT_SAVE_TEMPLATE", "TO_REVISION_ID", "draftReplies", "Landroid/util/LruCache;", "", "getDraftReplies", "()Landroid/util/LruCache;", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "parentSubject", "topic", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "undoSubject", "undoBody", "fromDiff", "", "selectedTemplate", "Lorg/wikipedia/talk/db/TalkTemplate;", "toRevisionId", "", "fromRevisionId", "templateManagementMode", "isExampleTemplate", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.LruCache<java.lang.String, java.lang.CharSequence> getDraftReplies() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
        java.lang.String parentSubject, @org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.discussiontools.ThreadItem topic, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence undoSubject, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence undoBody, boolean fromDiff, @org.jetbrains.annotations.Nullable()
        org.wikipedia.talk.db.TalkTemplate selectedTemplate, long toRevisionId, long fromRevisionId, boolean templateManagementMode, boolean isExampleTemplate) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J0\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/talk/TalkReplyActivity$TalkLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "context", "Landroid/content/Context;", "(Lorg/wikipedia/talk/TalkReplyActivity;Landroid/content/Context;)V", "lastX", "", "lastY", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onInternalLinkClicked", "onMediaLinkClicked", "onPageLinkClicked", "anchor", "", "linkText", "onUrlClick", "url", "x", "y", "app.lib"})
    public final class TalkLinkHandler extends org.wikipedia.page.LinkHandler {
        private int lastX = 0;
        private int lastY = 0;
        public org.wikipedia.dataclient.WikiSite wikiSite;
        
        public TalkLinkHandler(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        public final void onUrlClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText, int x, int y) {
        }
        
        @java.lang.Override()
        public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
        
        @java.lang.Override()
        public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long revisionId) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.dataclient.WikiSite getWikiSite() {
            return null;
        }
        
        @java.lang.Override()
        public void setWikiSite(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite p0) {
        }
        
        @java.lang.Override()
        public void onPageLinkClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String anchor, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText) {
        }
        
        @java.lang.Override()
        public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
    }
}