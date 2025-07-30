package org.wikipedia.page;

import android.widget.Toast;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.ArticleLinkPreviewInteractionEvent;
import org.wikipedia.analytics.metricsplatform.ArticleLinkPreviewInteraction;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.bridge.CommunicationBridge;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.categories.db.Category;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.mwapi.MwQueryResponse;
import org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.notifications.AnonymousNotificationHelper;
import org.wikipedia.page.leadimages.LeadImagesHandler;
import org.wikipedia.page.tabs.Tab;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ObservableWebView;
import retrofit2.Response;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0012J\b\u0010$\u001a\u00020\u0012H\u0002J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\rJ\u0012\u0010\'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0006\u0010*\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/page/PageFragmentLoadState;", "", "model", "Lorg/wikipedia/page/PageViewModel;", "fragment", "Lorg/wikipedia/page/PageFragment;", "webView", "Lorg/wikipedia/views/ObservableWebView;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "leadImagesHandler", "Lorg/wikipedia/page/leadimages/LeadImagesHandler;", "currentTab", "Lorg/wikipedia/page/tabs/Tab;", "(Lorg/wikipedia/page/PageViewModel;Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/views/ObservableWebView;Lorg/wikipedia/bridge/CommunicationBridge;Lorg/wikipedia/page/leadimages/LeadImagesHandler;Lorg/wikipedia/page/tabs/Tab;)V", "backStackEmpty", "", "checkAnonNotifications", "", "title", "Lorg/wikipedia/page/PageTitle;", "commonSectionFetchOnCatch", "caught", "", "createPageModel", "response", "Lretrofit2/Response;", "Lorg/wikipedia/dataclient/page/PageSummary;", "isWatched", "hasWatchlistExpiry", "goBack", "goForward", "load", "pushBackStack", "loadFromBackStack", "onConfigurationChanged", "pageLoad", "setTab", "tab", "showPageOfflineMessage", "dateHeader", "Ljava/time/Instant;", "updateCurrentBackStackItem", "app.lib"})
public final class PageFragmentLoadState {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageViewModel model;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageFragment fragment;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.views.ObservableWebView webView;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.bridge.CommunicationBridge bridge;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.leadimages.LeadImagesHandler leadImagesHandler;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.tabs.Tab currentTab;
    
    public PageFragmentLoadState(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel model, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView webView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge bridge, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.leadimages.LeadImagesHandler leadImagesHandler, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.tabs.Tab currentTab) {
        super();
    }
    
    public final void load(boolean pushBackStack) {
    }
    
    public final void loadFromBackStack() {
    }
    
    public final void updateCurrentBackStackItem() {
    }
    
    public final boolean setTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.tabs.Tab tab) {
        return false;
    }
    
    public final boolean goBack() {
        return false;
    }
    
    public final boolean goForward() {
        return false;
    }
    
    public final boolean backStackEmpty() {
        return false;
    }
    
    public final void onConfigurationChanged() {
    }
    
    private final void commonSectionFetchOnCatch(java.lang.Throwable caught) {
    }
    
    private final void pageLoad() {
    }
    
    private final void checkAnonNotifications(org.wikipedia.page.PageTitle title) {
    }
    
    private final void showPageOfflineMessage(java.time.Instant dateHeader) {
    }
    
    private final void createPageModel(retrofit2.Response<org.wikipedia.dataclient.page.PageSummary> response, boolean isWatched, boolean hasWatchlistExpiry) {
    }
}