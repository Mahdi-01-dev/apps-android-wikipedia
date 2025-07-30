package org.wikipedia.page;

import android.app.SearchManager;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.preference.PreferenceManager;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.activity.SingleWebViewActivity;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.DonorExperienceEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.databinding.ActivityPageBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.donate.CampaignCollection;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.descriptions.DescriptionEditRevertHelpView;
import org.wikipedia.descriptions.DescriptionEditSuccessActivity;
import org.wikipedia.edit.EditHandler;
import org.wikipedia.edit.EditSectionActivity;
import org.wikipedia.events.ArticleSavedOrDeletedEvent;
import org.wikipedia.events.ChangeTextSizeEvent;
import org.wikipedia.gallery.GalleryActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.language.LangLinksActivity;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.notifications.AnonymousNotificationHelper;
import org.wikipedia.notifications.NotificationActivity;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.page.tabs.TabActivity;
import org.wikipedia.readinglist.ReadingListActivity;
import org.wikipedia.readinglist.ReadingListMode;
import org.wikipedia.search.SearchActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.suggestededits.SuggestedEditsImageTagEditActivity;
import org.wikipedia.suggestededits.SuggestedEditsSnackbars;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.usercontrib.UserContribListActivity;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.ThrowableUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.FrameLayoutNavMenuTriggerer;
import org.wikipedia.views.ObservableWebView;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.watchlist.WatchlistExpiry;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0097\u0001\u0098\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020&J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0013H\u0002J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020&H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u000107H\u0002J$\u00108\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u00103\u001a\u000204H\u0002J\b\u0010<\u001a\u00020&H\u0002J\u0010\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020\u0011H\u0002J\u0010\u0010?\u001a\u00020&2\u0006\u0010>\u001a\u00020\u0011H\u0016J\u0010\u0010@\u001a\u00020&2\u0006\u0010>\u001a\u00020\u0011H\u0016J\u0006\u0010A\u001a\u00020&J\b\u0010B\u001a\u00020&H\u0016J\u0012\u0010C\u001a\u00020&2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020&H\u0014J\u0018\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0016J \u0010K\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010L\u001a\u00020\u0015H\u0016J\u0010\u0010M\u001a\u00020&2\u0006\u0010N\u001a\u00020-H\u0016J\u0010\u0010O\u001a\u00020&2\u0006\u0010/\u001a\u00020\u001dH\u0014J\u0010\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020&H\u0016J\b\u0010T\u001a\u00020&H\u0016J\b\u0010U\u001a\u00020&H\u0016J\u0010\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020&H\u0016J\u0010\u0010Z\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0016J\b\u0010[\u001a\u00020&H\u0016J\b\u0010\\\u001a\u00020&H\u0016J\u0018\u0010]\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u0010^\u001a\u00020&2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0016J>\u0010c\u001a\u00020&2\b\u0010d\u001a\u0004\u0018\u00010e2\u0006\u00106\u001a\u0002072\b\u0010f\u001a\u0004\u0018\u00010g2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010i\u001a\u00020j2\u0006\u0010a\u001a\u00020bH\u0016J,\u0010k\u001a\u00020&2\u0006\u0010l\u001a\u00020-2\b\u0010m\u001a\u0004\u0018\u00010e2\u0006\u00106\u001a\u0002072\b\u0010n\u001a\u0004\u0018\u00010eH\u0016J:\u0010o\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u0010p\u001a\u00020e2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u00152\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u0018\u0010x\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u0010y\u001a\u00020tH\u0016J\u0010\u0010z\u001a\u00020&2\u0006\u0010{\u001a\u00020\u0015H\u0016J\u0010\u0010|\u001a\u00020&2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010}\u001a\u00020&2\u0006\u0010~\u001a\u00020\u007fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020&2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0016J\u0013\u0010\u0082\u0001\u001a\u00020&2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0016J\t\u0010\u0085\u0001\u001a\u00020&H\u0014J\u0013\u0010\u0086\u0001\u001a\u00020\u00152\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020&2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J\t\u0010\u008c\u0001\u001a\u00020&H\u0014J\u0012\u0010\u008d\u0001\u001a\u00020&2\u0007\u0010\u008e\u0001\u001a\u00020EH\u0014J\t\u0010\u008f\u0001\u001a\u00020&H\u0014J\t\u0010\u0090\u0001\u001a\u00020&H\u0016J\t\u0010\u0091\u0001\u001a\u00020&H\u0002J\u0012\u0010\u0092\u0001\u001a\u00020&2\u0007\u0010\u0093\u0001\u001a\u00020eH\u0002J\u0012\u0010\u0094\u0001\u001a\u00020&2\u0007\u0010\u0095\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0096\u0001\u001a\u00020&2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0099\u0001"}, d2 = {"Lorg/wikipedia/page/PageActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/page/PageFragment$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "Lorg/wikipedia/views/FrameLayoutNavMenuTriggerer$Callback;", "()V", "app", "Lorg/wikipedia/WikipediaApp;", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "setBinding", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "currentActionModes", "", "Landroid/view/ActionMode;", "exclusiveTooltipRunnable", "Ljava/lang/Runnable;", "hasTransitionAnimation", "", "isCabOpen", "()Z", "isTooltipShowing", "pageFragment", "Lorg/wikipedia/page/PageFragment;", "requestBrowseTabLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestEditSectionLauncher", "requestGalleryEditLauncher", "requestHandleIntentLauncher", "requestSuggestedEditsLauncher", "toolbarHideHandler", "Lorg/wikipedia/page/ViewHideHandler;", "wasTransitionShown", "animateTabsButton", "", "clearActionBarTitle", "enqueueTooltip", "runnable", "getOverflowMenu", "Landroid/view/View;", "getToolbarMargin", "", "handleIntent", "intent", "hideLinkPreview", "loadFilePageFromBackStackIfNeeded", "loadMainPage", "position", "Lorg/wikipedia/page/PageActivity$TabPosition;", "loadNonArticlePageIfNeeded", "title", "Lorg/wikipedia/page/PageTitle;", "loadPage", "pageTitle", "entry", "Lorg/wikipedia/history/HistoryEntry;", "maybeShowThemeTooltip", "modifyMenu", "mode", "onActionModeFinished", "onActionModeStarted", "onAnonNotification", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onLinkPreviewLoadPage", "inNewTab", "onNavMenuSwipeRequest", "gravity", "onNewIntent", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPageCloseActionMode", "onPageDismissBottomSheet", "onPageHideSoftKeyboard", "onPageInitWebView", "v", "Lorg/wikipedia/views/ObservableWebView;", "onPageLoadComplete", "onPageLoadError", "onPageLoadErrorBackPressed", "onPageLoadMainPageInForegroundTab", "onPageLoadPage", "onPageRequestAddImageTags", "mwQueryPage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "onPageRequestEditDescription", "text", "", "sourceSummary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "targetSummary", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "onPageRequestEditSection", "sectionId", "sectionAnchor", "highlightText", "onPageRequestGallery", "fileName", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "revision", "", "isLeadImage", "options", "Landroidx/core/app/ActivityOptionsCompat;", "onPageRequestLangLinks", "historyEntryId", "onPageSetToolbarElevationEnabled", "enabled", "onPageShowLinkPreview", "onPageStartSupportActionMode", "callback", "Landroid/view/ActionMode$Callback;", "onPageUpdateProgressBar", "visible", "onPageWatchlistExpirySelect", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onPause", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onProvideAssistContent", "outContent", "Landroid/app/assist/AssistContent;", "onResume", "onSaveInstanceState", "outState", "onStart", "onUnreadNotification", "removeTransitionAnimState", "showDescriptionEditRevertDialog", "qNumber", "updateNotificationsButton", "animate", "updateProgressBar", "Companion", "TabPosition", "app.lib"})
public final class PageActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.page.PageFragment.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.LoadPageCallback, org.wikipedia.views.FrameLayoutNavMenuTriggerer.Callback {
    public ActivityPageBinding binding;
    private org.wikipedia.page.ViewHideHandler toolbarHideHandler;
    private org.wikipedia.page.PageFragment pageFragment;
    private org.wikipedia.WikipediaApp app;
    private boolean hasTransitionAnimation = false;
    private boolean wasTransitionShown = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<android.view.ActionMode> currentActionModes = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable exclusiveTooltipRunnable;
    private boolean isTooltipShowing = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEditSectionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestHandleIntentLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestGalleryEditLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestBrowseTabLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestSuggestedEditsLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LANGUAGE_CODE_BUNDLE_KEY = "language";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXCEPTION_MESSAGE_WEBVIEW = "webview";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_IN_NEW_TAB = "org.wikipedia.load_in_new_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_IN_CURRENT_TAB = "org.wikipedia.load_in_current_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_IN_CURRENT_TAB_SQUASH = "org.wikipedia.load_in_current_tab_squash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_FROM_EXISTING_TAB = "org.wikipedia.load_from_existing_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CREATE_NEW_TAB = "org.wikipedia.create_new_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_RESUME_READING = "org.wikipedia.resume_reading";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HISTORYENTRY = "org.wikipedia.history.historyentry";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageActivity.Companion Companion = null;
    
    public PageActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ActivityPageBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    ActivityPageBinding p0) {
    }
    
    private final boolean isCabOpen() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActionModeStarted(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void onActionModeFinished(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onNavMenuSwipeRequest(int gravity) {
    }
    
    @java.lang.Override()
    public void onPageLoadComplete() {
    }
    
    @java.lang.Override()
    public void onPageDismissBottomSheet() {
    }
    
    @java.lang.Override()
    public void onPageInitWebView(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView v) {
    }
    
    @java.lang.Override()
    public void onPageLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onPageShowLinkPreview(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onPageLoadMainPageInForegroundTab() {
    }
    
    @java.lang.Override()
    public void onPageUpdateProgressBar(boolean visible) {
    }
    
    @java.lang.Override()
    public void onPageStartSupportActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode.Callback callback) {
    }
    
    @java.lang.Override()
    public void onPageHideSoftKeyboard() {
    }
    
    @java.lang.Override()
    public void onPageWatchlistExpirySelect(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    @java.lang.Override()
    public void onPageLoadError(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onPageLoadErrorBackPressed() {
    }
    
    @java.lang.Override()
    public void onPageSetToolbarElevationEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void onPageCloseActionMode() {
    }
    
    @java.lang.Override()
    public void onPageRequestEditSection(int sectionId, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionAnchor, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
    java.lang.String highlightText) {
    }
    
    @java.lang.Override()
    public void onPageRequestLangLinks(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, long historyEntryId) {
    }
    
    @java.lang.Override()
    public void onPageRequestGallery(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, long revision, boolean isLeadImage, @org.jetbrains.annotations.Nullable()
    androidx.core.app.ActivityOptionsCompat options) {
    }
    
    @java.lang.Override()
    public void onPageRequestEditDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit targetSummary, @org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    @java.lang.Override()
    public void onPageRequestAddImageTags(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage mwQueryPage, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    /**
     * Load a new page, and put it on top of the backstack, optionally allowing state loss of the
     * fragment manager. Useful for when this function is called from an AsyncTask result.
     * @param pageTitle Title of the page to load.
     * @param entry HistoryEntry associated with this page.
     * @param position Whether to open this page in the current tab, a new background tab, or new
     * foreground tab.
     */
    private final void loadPage(org.wikipedia.page.PageTitle pageTitle, org.wikipedia.history.HistoryEntry entry, org.wikipedia.page.PageActivity.TabPosition position) {
    }
    
    private final void loadMainPage(org.wikipedia.page.PageActivity.TabPosition position) {
    }
    
    private final void loadFilePageFromBackStackIfNeeded() {
    }
    
    private final boolean loadNonArticlePageIfNeeded(org.wikipedia.page.PageTitle title) {
        return false;
    }
    
    private final void updateProgressBar(boolean visible) {
    }
    
    private final void hideLinkPreview() {
    }
    
    private final void removeTransitionAnimState() {
    }
    
    private final void modifyMenu(android.view.ActionMode mode) {
    }
    
    private final void showDescriptionEditRevertDialog(java.lang.String qNumber) {
    }
    
    private final void maybeShowThemeTooltip() {
    }
    
    private final void enqueueTooltip(java.lang.Runnable runnable) {
    }
    
    public final void animateTabsButton() {
    }
    
    private final void updateNotificationsButton(boolean animate) {
    }
    
    public final void clearActionBarTitle() {
    }
    
    public final int getToolbarMargin() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getOverflowMenu() {
        return null;
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    public final void onAnonNotification() {
    }
    
    @java.lang.Override()
    public void onProvideAssistContent(@org.jetbrains.annotations.NotNull()
    android.app.assist.AssistContent outContent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/page/PageActivity$Companion;", "", "()V", "ACTION_CREATE_NEW_TAB", "", "ACTION_LOAD_FROM_EXISTING_TAB", "ACTION_LOAD_IN_CURRENT_TAB", "ACTION_LOAD_IN_CURRENT_TAB_SQUASH", "ACTION_LOAD_IN_NEW_TAB", "ACTION_RESUME_READING", "EXCEPTION_MESSAGE_WEBVIEW", "EXTRA_HISTORYENTRY", "LANGUAGE_CODE_BUNDLE_KEY", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newIntentForCurrentTab", "entry", "Lorg/wikipedia/history/HistoryEntry;", "title", "Lorg/wikipedia/page/PageTitle;", "squashBackstack", "", "newIntentForExistingTab", "newIntentForNewTab", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntentForNewTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntentForNewTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntentForCurrentTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, boolean squashBackstack) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntentForExistingTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/page/PageActivity$TabPosition;", "", "(Ljava/lang/String;I)V", "CURRENT_TAB", "CURRENT_TAB_SQUASH", "NEW_TAB_BACKGROUND", "NEW_TAB_FOREGROUND", "EXISTING_TAB", "app.lib"})
    public static enum TabPosition {
        /*public static final*/ CURRENT_TAB /* = new CURRENT_TAB() */,
        /*public static final*/ CURRENT_TAB_SQUASH /* = new CURRENT_TAB_SQUASH() */,
        /*public static final*/ NEW_TAB_BACKGROUND /* = new NEW_TAB_BACKGROUND() */,
        /*public static final*/ NEW_TAB_FOREGROUND /* = new NEW_TAB_FOREGROUND() */,
        /*public static final*/ EXISTING_TAB /* = new EXISTING_TAB() */;
        
        TabPosition() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.page.PageActivity.TabPosition> getEntries() {
            return null;
        }
    }
}