package org.wikipedia.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.DonorExperienceEvent;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.databinding.ActivitySingleWebViewBinding;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.okhttp.OkHttpWebViewClient;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.PageViewModel;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0014J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/activity/SingleWebViewActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "blankLinkHandler", "Lorg/wikipedia/page/LinkHandler;", "blankModel", "Lorg/wikipedia/page/PageViewModel;", "getBlankModel", "()Lorg/wikipedia/page/PageViewModel;", "currentUrl", "", "isWebForm", "", "pageTitleToLoadOnBackPress", "Lorg/wikipedia/page/PageTitle;", "showBackButton", "targetUrl", "wasFormSubmitted", "goBack", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "setCookies", "url", "Companion", "SingleWebViewLinkHandler", "app.lib"})
public final class SingleWebViewActivity extends org.wikipedia.activity.BaseActivity {
    private ActivitySingleWebViewBinding binding;
    private org.wikipedia.page.LinkHandler blankLinkHandler;
    private java.lang.String targetUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentUrl;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle pageTitleToLoadOnBackPress;
    private boolean showBackButton = false;
    private boolean isWebForm = false;
    private boolean wasFormSubmitted = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageViewModel blankModel = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_URL = "url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SHOW_BACK_BUTTON = "goBack";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAGE_CONTENT_INFO = "pageContentInfo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_CONTENT_SOURCE_DONOR_EXPERIENCE = "donorExperience";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_IS_WEB_FORM = "isWebForm";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.activity.SingleWebViewActivity.Companion Companion = null;
    
    public SingleWebViewActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageViewModel getBlankModel() {
        return null;
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
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
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void goBack() {
    }
    
    private final void setCookies(java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/activity/SingleWebViewActivity$Companion;", "", "()V", "EXTRA_IS_WEB_FORM", "", "EXTRA_PAGE_CONTENT_INFO", "EXTRA_SHOW_BACK_BUTTON", "EXTRA_URL", "PAGE_CONTENT_SOURCE_DONOR_EXPERIENCE", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "showBackButton", "", "pageTitleToLoadOnBackPress", "Lorg/wikipedia/page/PageTitle;", "pageContentInfo", "isWebForm", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, boolean showBackButton, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitleToLoadOnBackPress, @org.jetbrains.annotations.Nullable()
        java.lang.String pageContentInfo, boolean isWebForm) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/activity/SingleWebViewActivity$SingleWebViewLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "context", "Landroid/content/Context;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/activity/SingleWebViewActivity;Landroid/content/Context;Lorg/wikipedia/dataclient/WikiSite;)V", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onInternalLinkClicked", "onMediaLinkClicked", "onPageLinkClicked", "anchor", "", "linkText", "app.lib"})
    public final class SingleWebViewLinkHandler extends org.wikipedia.page.LinkHandler {
        @org.jetbrains.annotations.NotNull()
        private org.wikipedia.dataclient.WikiSite wikiSite;
        
        public SingleWebViewLinkHandler(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite) {
            super(null);
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
        
        @java.lang.Override()
        public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
        
        @java.lang.Override()
        public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long revisionId) {
        }
    }
}