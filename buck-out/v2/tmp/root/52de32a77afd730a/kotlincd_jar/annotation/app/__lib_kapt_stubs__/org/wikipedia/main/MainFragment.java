package org.wikipedia.main;

import android.Manifest;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.BackPressedHandler;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.databinding.FragmentMainBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.ImportReadingListsEvent;
import org.wikipedia.events.LoggedOutInBackgroundEvent;
import org.wikipedia.events.NewRecommendedReadingListEvent;
import org.wikipedia.feed.FeedFragment;
import org.wikipedia.feed.image.FeaturedImage;
import org.wikipedia.feed.image.FeaturedImageCard;
import org.wikipedia.feed.news.NewsActivity;
import org.wikipedia.feed.news.NewsCard;
import org.wikipedia.feed.news.NewsItemView;
import org.wikipedia.gallery.GalleryActivity;
import org.wikipedia.gallery.MediaDownloadReceiver;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.HistoryFragment;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.navtab.MenuNavTabDialog;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.navtab.NavTabFragmentPagerAdapter;
import org.wikipedia.notifications.NotificationActivity;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.tabs.TabActivity;
import org.wikipedia.places.PlacesActivity;
import org.wikipedia.random.RandomActivity;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.ReadingListsFragment;
import org.wikipedia.readinglist.recommended.RecommendedReadingListAbTest;
import org.wikipedia.search.SearchActivity;
import org.wikipedia.search.SearchFragment;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.SettingsActivity;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.suggestededits.SuggestedEditsTasksFragment;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.usercontrib.UserContribListActivity;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.TabUtil;
import org.wikipedia.views.NotificationButtonView;
import org.wikipedia.views.TabCountsView;
import org.wikipedia.views.imageservice.ImageService;
import org.wikipedia.watchlist.WatchlistActivity;
import org.wikipedia.yearinreview.YearInReviewEntryDialog;
import java.io.File;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\b\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001B\u0005\u00a2\u0006\u0002\u0010\u0007J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001cH\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0016H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u000201H\u0002J\u000e\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020(H\u0016J\b\u00109\u001a\u00020(H\u0002J\b\u0010:\u001a\u00020(H\u0002J\"\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u0002072\u0006\u0010=\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u000104H\u0016J\b\u0010?\u001a\u00020\"H\u0016J\u0018\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J$\u0010E\u001a\u00020F2\u0006\u0010C\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020(H\u0016J\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020OH\u0016J\u0018\u0010P\u001a\u00020(2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\"H\u0016J\u0010\u0010T\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001cH\u0016J\u0018\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020W2\u0006\u0010Q\u001a\u00020RH\u0016J\u0018\u0010X\u001a\u00020(2\u0006\u0010N\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020(H\u0016J\u0010\u0010]\u001a\u00020(2\u0006\u0010Z\u001a\u00020FH\u0016J\u0018\u0010^\u001a\u00020(2\u0006\u0010Q\u001a\u00020R2\u0006\u0010_\u001a\u00020\"H\u0016J/\u0010`\u001a\u00020(2\u0006\u0010Q\u001a\u00020R2\u0018\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u001f0c0bH\u0016\u00a2\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020(2\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010f\u001a\u00020(H\u0016J\u0006\u0010g\u001a\u00020(J\u0006\u0010h\u001a\u00020(J\u0010\u0010i\u001a\u00020(2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010j\u001a\u00020(H\u0016J\u0010\u0010k\u001a\u00020\"2\u0006\u0010l\u001a\u00020mH\u0016J\b\u0010n\u001a\u00020(H\u0016J\u0010\u0010o\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010p\u001a\u00020(H\u0016J\"\u0010q\u001a\u00020(2\u0006\u0010r\u001a\u00020s2\b\u0010t\u001a\u0004\u0018\u00010\u001f2\b\u0010u\u001a\u0004\u0018\u00010FJ\b\u0010v\u001a\u00020(H\u0002J\u0006\u0010w\u001a\u00020(J\u000e\u0010x\u001a\u00020(2\u0006\u0010y\u001a\u00020\"J\b\u0010z\u001a\u00020(H\u0016J\b\u0010{\u001a\u00020(H\u0016J\b\u0010|\u001a\u00020(H\u0002J\u000e\u0010}\u001a\u00020(2\u0006\u0010~\u001a\u00020\"J\u0011\u0010\u007f\u001a\u00020(2\u0007\u0010\u0080\u0001\u001a\u00020\"H\u0016J\t\u0010\u0081\u0001\u001a\u00020(H\u0016J\t\u0010\u0082\u0001\u001a\u00020(H\u0016J\t\u0010\u0083\u0001\u001a\u00020(H\u0016R\u0010\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0088\u0001"}, d2 = {"Lorg/wikipedia/main/MainFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "Landroidx/core/view/MenuProvider;", "Lorg/wikipedia/feed/FeedFragment$Callback;", "Lorg/wikipedia/history/HistoryFragment$Callback;", "Lorg/wikipedia/navtab/MenuNavTabDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "currentFragment", "getCurrentFragment", "()Landroidx/fragment/app/Fragment;", "downloadReceiver", "Lorg/wikipedia/gallery/MediaDownloadReceiver;", "downloadReceiverCallback", "Lorg/wikipedia/main/MainFragment$MediaDownloadReceiverCallback;", "exclusiveTooltipRunnable", "Ljava/lang/Runnable;", "notificationButtonView", "Lorg/wikipedia/views/NotificationButtonView;", "pageChangeCallback", "Lorg/wikipedia/main/MainFragment$PageChangeCallback;", "pendingDownloadImage", "Lorg/wikipedia/feed/image/FeaturedImage;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "showTabCountsAnimation", "", "tabCountsView", "Lorg/wikipedia/views/TabCountsView;", "callback", "Lorg/wikipedia/main/MainFragment$Callback;", "contribsClick", "", "donateClick", "campaignId", "download", "image", "enqueueTooltip", "runnable", "goToTab", "tab", "Lorg/wikipedia/navtab/NavTab;", "handleIntent", "intent", "Landroid/content/Intent;", "lastPageViewedWithin", "days", "", "loginClick", "maybeShowEditsTooltip", "maybeShowImportReadingListsNewInstallDialog", "onActivityResult", "requestCode", "resultCode", "data", "onBackPressed", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFeaturedImageSelected", "card", "Lorg/wikipedia/feed/image/FeaturedImageCard;", "onFeedAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "onFeedDownloadImage", "onFeedMovePageToList", "sourceReadingListId", "", "onFeedNewsItemSelected", "Lorg/wikipedia/feed/news/NewsCard;", "view", "Lorg/wikipedia/feed/news/NewsItemView;", "onFeedSeCardFooterClicked", "onFeedSearchRequested", "onFeedSelectPage", "openInNewBackgroundTab", "onFeedSelectPageWithAnimation", "sharedElements", "", "Landroid/util/Pair;", "(Lorg/wikipedia/history/HistoryEntry;[Landroid/util/Pair;)V", "onFeedShareImage", "onFeedVoiceSearchRequested", "onGoOffline", "onGoOnline", "onLoadPage", "onLoginRequested", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "onPause", "onPrepareMenu", "onResume", "openSearchActivity", "source", "Lorg/wikipedia/Constants$InvokeSource;", "query", "transitionView", "refreshContents", "requestUpdateToolbarElevation", "setBottomNavVisible", "visible", "settingsClick", "talkClick", "updateFeedHiddenCards", "updateNotificationDot", "animate", "updateToolbarElevation", "elevate", "usernameClick", "watchlistClick", "yearInReviewClick", "Callback", "Companion", "MediaDownloadReceiverCallback", "PageChangeCallback", "app.lib"})
public final class MainFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler, androidx.core.view.MenuProvider, org.wikipedia.feed.FeedFragment.Callback, org.wikipedia.history.HistoryFragment.Callback, org.wikipedia.navtab.MenuNavTabDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentMainBinding _binding;
    private org.wikipedia.views.NotificationButtonView notificationButtonView;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.TabCountsView tabCountsView;
    private boolean showTabCountsAnimation = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.gallery.MediaDownloadReceiver downloadReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.main.MainFragment.MediaDownloadReceiverCallback downloadReceiverCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.main.MainFragment.PageChangeCallback pageChangeCallback = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable exclusiveTooltipRunnable;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.image.FeaturedImage pendingDownloadImage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    private static final int SHOW_EDITS_SNACKBAR_COUNT = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.main.MainFragment.Companion Companion = null;
    
    public MainFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getCurrentFragment() {
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
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    public final void handleIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onFeedSearchRequested(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onFeedVoiceSearchRequested() {
    }
    
    @java.lang.Override()
    public void onFeedSelectPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean openInNewBackgroundTab) {
    }
    
    @java.lang.Override()
    public void onFeedSelectPageWithAnimation(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    android.util.Pair<android.view.View, java.lang.String>[] sharedElements) {
    }
    
    @java.lang.Override()
    public void onFeedAddPageToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
    }
    
    @java.lang.Override()
    public void onFeedMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onFeedNewsItemSelected(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.news.NewsCard card, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.news.NewsItemView view) {
    }
    
    @java.lang.Override()
    public void onFeedSeCardFooterClicked() {
    }
    
    @java.lang.Override()
    public void onFeedShareImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImageCard card) {
    }
    
    @java.lang.Override()
    public void onFeedDownloadImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    @java.lang.Override()
    public void onFeaturedImageSelected(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImageCard card) {
    }
    
    @java.lang.Override()
    public void onLoginRequested() {
    }
    
    @java.lang.Override()
    public void updateToolbarElevation(boolean elevate) {
    }
    
    public final void requestUpdateToolbarElevation() {
    }
    
    @java.lang.Override()
    public void onLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void usernameClick() {
    }
    
    @java.lang.Override()
    public void loginClick() {
    }
    
    @java.lang.Override()
    public void talkClick() {
    }
    
    @java.lang.Override()
    public void settingsClick() {
    }
    
    @java.lang.Override()
    public void watchlistClick() {
    }
    
    @java.lang.Override()
    public void contribsClick() {
    }
    
    @java.lang.Override()
    public void donateClick(@org.jetbrains.annotations.Nullable()
    java.lang.String campaignId) {
    }
    
    @java.lang.Override()
    public void yearInReviewClick() {
    }
    
    public final void setBottomNavVisible(boolean visible) {
    }
    
    public final void onGoOffline() {
    }
    
    public final void onGoOnline() {
    }
    
    public final void updateNotificationDot(boolean animate) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final boolean lastPageViewedWithin(int days) {
        return false;
    }
    
    private final void download(org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    public final void openSearchActivity(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    android.view.View transitionView) {
    }
    
    private final void goToTab(org.wikipedia.navtab.NavTab tab) {
    }
    
    private final void refreshContents() {
    }
    
    private final void updateFeedHiddenCards() {
    }
    
    private final void maybeShowImportReadingListsNewInstallDialog() {
    }
    
    private final void maybeShowEditsTooltip() {
    }
    
    private final void enqueueTooltip(java.lang.Runnable runnable) {
    }
    
    private final org.wikipedia.main.MainFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/main/MainFragment$Callback;", "", "onTabChanged", "", "tab", "Lorg/wikipedia/navtab/NavTab;", "updateToolbarElevation", "elevate", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onTabChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.navtab.NavTab tab);
        
        public abstract void updateToolbarElevation(boolean elevate);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainFragment$Companion;", "", "()V", "SHOW_EDITS_SNACKBAR_COUNT", "", "newInstance", "Lorg/wikipedia/main/MainFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.main.MainFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/main/MainFragment$MediaDownloadReceiverCallback;", "Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "(Lorg/wikipedia/main/MainFragment;)V", "onSuccess", "", "app.lib"})
    final class MediaDownloadReceiverCallback implements org.wikipedia.gallery.MediaDownloadReceiver.Callback {
        
        public MediaDownloadReceiverCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainFragment$PageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/main/MainFragment;)V", "onPageSelected", "", "position", "", "app.lib"})
    final class PageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        
        public PageChangeCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
}