package org.wikipedia.diff;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.view.MenuProvider;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.EditAttemptStepEvent;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.FragmentArticleEditDetailsBinding;
import org.wikipedia.dataclient.mwapi.MwQueryPage.Revision;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.edithistory.EditHistoryListActivity;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.suggestededits.SuggestedEditsCardsFragment;
import org.wikipedia.talk.TalkReplyActivity;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.talk.UserTalkPopupHelper;
import org.wikipedia.talk.template.TalkTemplatesActivity;
import org.wikipedia.util.ClipboardUtil;
import org.wikipedia.util.CustomTabsUtil;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.SurveyDialog;
import org.wikipedia.watchlist.WatchlistExpiry;
import org.wikipedia.watchlist.WatchlistExpiryDialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002]^B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\"\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020 2\b\b\u0002\u0010=\u001a\u00020 H\u0002J\u0018\u0010>\u001a\u00020\u001e2\u0006\u00109\u001a\u00020?2\u0006\u0010@\u001a\u000204H\u0002J\u0010\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020\u001eH\u0002J\b\u0010E\u001a\u00020\u001eH\u0002J\u0012\u0010F\u001a\u00020\u001e2\b\b\u0002\u0010G\u001a\u000204H\u0002J\b\u0010H\u001a\u00020\u001eH\u0002J\b\u0010I\u001a\u00020\u001eH\u0002J\b\u0010J\u001a\u00020\u001eH\u0002J\b\u0010K\u001a\u00020\u001eH\u0002J\b\u0010L\u001a\u00020\u001eH\u0002J\b\u0010M\u001a\u00020\u001eH\u0002J\"\u0010N\u001a\u00020\u001e2\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u00020)H\u0002J\u0010\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020 H\u0002J\b\u0010U\u001a\u00020\u001eH\u0002J\b\u0010V\u001a\u00020\u001eH\u0002J\b\u0010W\u001a\u00020\u001eH\u0002J\u0010\u0010X\u001a\u00020\u001e2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u000204H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006_"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "Landroidx/core/view/MenuProvider;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionBarOffsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "binding", "getBinding", "()Lerror/NonExistentClass;", "openQualityAndIntentFiltersPage", "Landroid/view/View$OnClickListener;", "requestTalk", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "sequentialTooltipRunnable", "Ljava/lang/Runnable;", "viewModel", "Lorg/wikipedia/diff/ArticleEditDetailsViewModel;", "getViewModel", "()Lorg/wikipedia/diff/ArticleEditDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callback", "Lorg/wikipedia/diff/ArticleEditDetailsFragment$Callback;", "copyLink", "", "uri", "", "getSharableDiffUrl", "maybeShowOneTimeSequentialRecentEditsTooltips", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onExpiryChanged", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onMenuItemSelected", "", "item", "Landroid/view/MenuItem;", "onPrepareMenu", "onViewCreated", "view", "sendPatrollerExperienceEvent", "action", "activeInterface", "actionData", "setEnableDisableTint", "Landroid/widget/ImageView;", "isDisabled", "setErrorState", "t", "", "setLoadingState", "setUpListeners", "showFeedbackOptionsDialog", "skipPreference", "showRollbackDialog", "showRollbackSnackbar", "showThankDialog", "showThankSnackbar", "showUndoDialog", "showUndoSnackbar", "showUserPopupMenu", "revision", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "showThankButton", "anchorView", "showWatchlistSnackbar", "message", "updateActionButtons", "updateAfterDiffFetchSuccess", "updateAfterRevisionFetchSuccess", "updateDiffCharCountView", "diffSize", "", "updateWatchButton", "hasWatchlistExpiry", "Callback", "Companion", "app.lib"})
public final class ArticleEditDetailsFragment extends androidx.fragment.app.Fragment implements org.wikipedia.watchlist.WatchlistExpiryDialog.Callback, androidx.core.view.MenuProvider {
    @org.jetbrains.annotations.Nullable()
    private FragmentArticleEditDetailsBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener actionBarOffsetChangedListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestTalk = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable sequentialTooltipRunnable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener openQualityAndIntentFiltersPage = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.diff.ArticleEditDetailsFragment.Companion Companion = null;
    
    public ArticleEditDetailsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.diff.ArticleEditDetailsViewModel getViewModel() {
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setUpListeners() {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showUserPopupMenu(org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision, boolean showThankButton, android.view.View anchorView) {
    }
    
    private final void maybeShowOneTimeSequentialRecentEditsTooltips() {
    }
    
    private final void setErrorState(java.lang.Throwable t) {
    }
    
    private final void updateDiffCharCountView(int diffSize) {
    }
    
    private final void setLoadingState() {
    }
    
    private final void updateAfterRevisionFetchSuccess() {
    }
    
    private final void updateAfterDiffFetchSuccess() {
    }
    
    private final void setEnableDisableTint(android.widget.ImageView view, boolean isDisabled) {
    }
    
    private final void updateWatchButton(boolean hasWatchlistExpiry) {
    }
    
    private final void showWatchlistSnackbar(java.lang.String message) {
    }
    
    private final void showThankSnackbar() {
    }
    
    private final void showThankDialog() {
    }
    
    private final void showUndoDialog() {
    }
    
    private final void showUndoSnackbar() {
    }
    
    private final void showRollbackDialog() {
    }
    
    private final void showRollbackSnackbar() {
    }
    
    private final void showFeedbackOptionsDialog(boolean skipPreference) {
    }
    
    private final void updateActionButtons() {
    }
    
    private final java.lang.String getSharableDiffUrl() {
        return null;
    }
    
    @java.lang.Override()
    public void onExpiryChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    private final void copyLink(java.lang.String uri) {
    }
    
    private final void sendPatrollerExperienceEvent(java.lang.String action, java.lang.String activeInterface, java.lang.String actionData) {
    }
    
    private final org.wikipedia.diff.ArticleEditDetailsFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsFragment$Callback;", "", "onRollbackSuccess", "", "onUndoSuccess", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onUndoSuccess();
        
        public abstract void onRollbackSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/diff/ArticleEditDetailsFragment;", "title", "Lorg/wikipedia/page/PageTitle;", "pageId", "", "revisionFrom", "", "revisionTo", "source", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.diff.ArticleEditDetailsFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, int pageId, long revisionFrom, long revisionTo, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source) {
            return null;
        }
    }
}