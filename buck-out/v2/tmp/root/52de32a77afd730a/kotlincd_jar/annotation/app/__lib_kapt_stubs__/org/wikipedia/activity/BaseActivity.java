package org.wikipedia.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.skydoves.balloon.Balloon;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.BreadcrumbsContextHelper;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.EventPlatformClient;
import org.wikipedia.analytics.metricsplatform.MetricsPlatform;
import org.wikipedia.appshortcuts.AppShortcuts;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.connectivity.ConnectionStateMonitor;
import org.wikipedia.donate.DonateDialog;
import org.wikipedia.events.LoggedOutInBackgroundEvent;
import org.wikipedia.events.ReadingListsEnableDialogEvent;
import org.wikipedia.events.ReadingListsNoLongerSyncedEvent;
import org.wikipedia.events.SplitLargeListsEvent;
import org.wikipedia.events.ThemeFontChangeEvent;
import org.wikipedia.events.UnreadNotificationsEvent;
import org.wikipedia.games.onthisday.OnThisDayGameResultFragment;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.main.MainActivity;
import org.wikipedia.notifications.NotificationPresenter;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.readinglist.ReadingListSyncBehaviorDialogs;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.readinglist.sync.ReadingListSyncEvent;
import org.wikipedia.recurring.RecurringTasksExecutor;
import org.wikipedia.richtext.CustomHtmlParser;
import org.wikipedia.settings.Prefs;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.ImageZoomHelper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0012J\u001e\u0010\u001e\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010J\b\u0010!\u001a\u00020\u0017H\u0002J\"\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\'\u001a\u00020\u0017H\u0016J\u0012\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u0017H\u0014J\b\u0010,\u001a\u00020\u0017H\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0017H\u0014J\b\u00102\u001a\u00020\u0017H\u0014J\b\u00103\u001a\u00020\u0017H\u0014J\b\u00104\u001a\u00020\u0017H\u0016J\b\u00105\u001a\u00020\u0017H\u0002J\u000e\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020\u0017J\u0012\u00109\u001a\u00020\u00172\b\b\u0001\u0010:\u001a\u00020$H\u0004J\u0012\u0010;\u001a\u00020\u00172\b\b\u0001\u0010:\u001a\u00020$H\u0004J\b\u0010<\u001a\u00020\u0017H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006>"}, d2 = {"Lorg/wikipedia/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/wikipedia/connectivity/ConnectionStateMonitor$Callback;", "()V", "callback", "Lorg/wikipedia/activity/BaseActivity$Callback;", "getCallback", "()Lorg/wikipedia/activity/BaseActivity$Callback;", "setCallback", "(Lorg/wikipedia/activity/BaseActivity$Callback;)V", "currentTooltip", "Lcom/skydoves/balloon/Balloon;", "imageZoomHelper", "Lorg/wikipedia/views/ImageZoomHelper;", "notificationPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "requestDonateActivity", "Landroid/content/Intent;", "requestPermissionLauncher", "getRequestPermissionLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "dismissCurrentTooltip", "", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "launchDonateActivity", "intent", "launchDonateDialog", "campaignId", "donateUrl", "maybeShowLoggedOutInBackgroundDialog", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGoOffline", "onGoOnline", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onStart", "onUnreadNotification", "removeSplashBackground", "setCurrentTooltip", "tooltip", "setImageZoomHelper", "setNavigationBarColor", "color", "setStatusBarColor", "setTheme", "Callback", "app.lib"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements org.wikipedia.connectivity.ConnectionStateMonitor.Callback {
    @org.jetbrains.annotations.Nullable()
    private com.skydoves.balloon.Balloon currentTooltip;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.ImageZoomHelper imageZoomHelper;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.activity.BaseActivity.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestDonateActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> notificationPermissionLauncher = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.activity.BaseActivity.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.activity.BaseActivity.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<java.lang.String> getRequestPermissionLauncher() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    protected final void setStatusBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    protected final void setNavigationBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    protected void setTheme() {
    }
    
    @java.lang.Override()
    public void onGoOffline() {
    }
    
    @java.lang.Override()
    public void onGoOnline() {
    }
    
    public final void launchDonateDialog(@org.jetbrains.annotations.Nullable()
    java.lang.String campaignId, @org.jetbrains.annotations.Nullable()
    java.lang.String donateUrl) {
    }
    
    public final void launchDonateActivity(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void removeSplashBackground() {
    }
    
    private final void maybeShowLoggedOutInBackgroundDialog() {
    }
    
    private final void dismissCurrentTooltip() {
    }
    
    public final void setCurrentTooltip(@org.jetbrains.annotations.NotNull()
    com.skydoves.balloon.Balloon tooltip) {
    }
    
    public final void setImageZoomHelper() {
    }
    
    public void onUnreadNotification() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/activity/BaseActivity$Callback;", "", "onPermissionResult", "", "activity", "Lorg/wikipedia/activity/BaseActivity;", "isGranted", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onPermissionResult(@org.jetbrains.annotations.NotNull()
        org.wikipedia.activity.BaseActivity activity, boolean isGranted);
    }
}