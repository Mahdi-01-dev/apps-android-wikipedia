package org.wikipedia;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatDelegate;
import org.wikipedia.analytics.eventplatform.AppSessionEvent;
import org.wikipedia.analytics.eventplatform.EventPlatformClient;
import org.wikipedia.appshortcuts.AppShortcuts;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.connectivity.ConnectionStateMonitor;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.ChangeTextSizeEvent;
import org.wikipedia.events.LoggedOutEvent;
import org.wikipedia.events.ThemeFontChangeEvent;
import org.wikipedia.installreferrer.InstallReferrerListener;
import org.wikipedia.language.AcceptLanguageUtil;
import org.wikipedia.language.AppLanguageState;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.notifications.NotificationPollBroadcastReceiver;
import org.wikipedia.page.tabs.Tab;
import org.wikipedia.push.WikipediaFirebaseMessagingService;
import org.wikipedia.settings.Prefs;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.imageservice.CoilImageServiceLoader;
import org.wikipedia.views.imageservice.ImageService;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u0002022\u0006\u0010H\u001a\u000202J\b\u0010I\u001a\u00020FH\u0002J\u0010\u0010J\u001a\u00020\u00062\b\u0010K\u001a\u0004\u0018\u00010!J\u0010\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020#J\b\u0010O\u001a\u00020FH\u0002J\u000e\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020FJ\b\u0010T\u001a\u00020FH\u0016J\u001a\u0010U\u001a\u00020F2\b\u0010V\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0006\u0010W\u001a\u00020FJ\u0006\u0010X\u001a\u00020FJ\u000e\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020\u0006J\u000e\u0010[\u001a\u00020#2\u0006\u0010H\u001a\u000202J\u000e\u0010\\\u001a\u00020\u001a2\u0006\u0010]\u001a\u000202R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010%R\u001b\u0010\'\u001a\u00020(8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b.\u0010/R\u0011\u00101\u001a\u0002028F\u00a2\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020706\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001b\u0010:\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b;\u0010\bR\u0011\u0010=\u001a\u0002028F\u00a2\u0006\u0006\u001a\u0004\b>\u00104R\u001b\u0010?\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\b@\u0010%R\u0011\u0010B\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\bC\u0010D\u00a8\u0006_"}, d2 = {"Lorg/wikipedia/WikipediaApp;", "Landroid/app/Application;", "()V", "activityLifecycleHandler", "Lorg/wikipedia/ActivityLifecycleHandler;", "appInstallID", "", "getAppInstallID", "()Ljava/lang/String;", "appOrSystemLanguageCode", "getAppOrSystemLanguageCode", "appSessionEvent", "Lorg/wikipedia/analytics/eventplatform/AppSessionEvent;", "getAppSessionEvent", "()Lorg/wikipedia/analytics/eventplatform/AppSessionEvent;", "appSessionEvent$delegate", "Lkotlin/Lazy;", "connectionStateMonitor", "Lorg/wikipedia/connectivity/ConnectionStateMonitor;", "getConnectionStateMonitor", "()Lorg/wikipedia/connectivity/ConnectionStateMonitor;", "currentResumedActivity", "Landroid/app/Activity;", "getCurrentResumedActivity", "()Landroid/app/Activity;", "value", "Lorg/wikipedia/theme/Theme;", "currentTheme", "getCurrentTheme", "()Lorg/wikipedia/theme/Theme;", "setCurrentTheme", "(Lorg/wikipedia/theme/Theme;)V", "defaultWikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "haveMainActivity", "", "getHaveMainActivity", "()Z", "isOnline", "languageState", "Lorg/wikipedia/language/AppLanguageState;", "getLanguageState", "()Lorg/wikipedia/language/AppLanguageState;", "languageState$delegate", "mainThreadHandler", "Landroid/os/Handler;", "getMainThreadHandler", "()Landroid/os/Handler;", "mainThreadHandler$delegate", "tabCount", "", "getTabCount", "()I", "tabList", "", "Lorg/wikipedia/page/tabs/Tab;", "getTabList", "()Ljava/util/List;", "userAgent", "getUserAgent", "userAgent$delegate", "versionCode", "getVersionCode", "voiceRecognitionAvailable", "getVoiceRecognitionAvailable", "voiceRecognitionAvailable$delegate", "wikiSite", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "commitTabState", "", "constrainFontSizeMultiplier", "mult", "enableWebViewDebugging", "getAcceptLanguage", "wiki", "getFontSize", "", "editing", "initTabs", "logCrashManually", "throwable", "", "logOut", "onCreate", "putCrashReportProperty", "key", "resetAfterLogOut", "resetWikiSite", "setFontFamily", "fontFamily", "setFontSizeMultiplier", "unmarshalTheme", "themeId", "Companion", "app.lib"})
public final class WikipediaApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainThreadHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy languageState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appSessionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy userAgent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.ActivityLifecycleHandler activityLifecycleHandler = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.WikiSite defaultWikiSite;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.connectivity.ConnectionStateMonitor connectionStateMonitor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.page.tabs.Tab> tabList = null;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.theme.Theme currentTheme;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy voiceRecognitionAvailable$delegate = null;
    private static org.wikipedia.WikipediaApp instance;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.WikipediaApp.Companion Companion = null;
    
    public WikipediaApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMainThreadHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.language.AppLanguageState getLanguageState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.eventplatform.AppSessionEvent getAppSessionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserAgent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.connectivity.ConnectionStateMonitor getConnectionStateMonitor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.tabs.Tab> getTabList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.theme.Theme getCurrentTheme() {
        return null;
    }
    
    public final void setCurrentTheme(@org.jetbrains.annotations.NotNull()
    org.wikipedia.theme.Theme value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppOrSystemLanguageCode() {
        return null;
    }
    
    public final int getVersionCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppInstallID() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    @org.jetbrains.annotations.NotNull()
    public final synchronized org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    public final int getTabCount() {
        return 0;
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    public final boolean getHaveMainActivity() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getCurrentResumedActivity() {
        return null;
    }
    
    public final boolean getVoiceRecognitionAvailable() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * @return the value that should go in the Accept-Language header.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAcceptLanguage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    public final int constrainFontSizeMultiplier(int mult) {
        return 0;
    }
    
    public final boolean setFontSizeMultiplier(int mult) {
        return false;
    }
    
    public final void setFontFamily(@org.jetbrains.annotations.NotNull()
    java.lang.String fontFamily) {
    }
    
    public final void putCrashReportProperty(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void logCrashManually(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    public final void commitTabState() {
    }
    
    /**
     * Gets the current size of the app's font. This is given as a device-specific size (not "sp"),
     * and can be passed directly to setTextSize() functions.
     * @return Actual current size of the font.
     */
    public final float getFontSize(boolean editing) {
        return 0.0F;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void resetWikiSite() {
    }
    
    public final void logOut() {
    }
    
    public final void resetAfterLogOut() {
    }
    
    private final void enableWebViewDebugging() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.theme.Theme unmarshalTheme(int themeId) {
        return null;
    }
    
    private final void initTabs() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/WikipediaApp$Companion;", "", "()V", "<set-?>", "Lorg/wikipedia/WikipediaApp;", "instance", "getInstance", "()Lorg/wikipedia/WikipediaApp;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.WikipediaApp getInstance() {
            return null;
        }
    }
}