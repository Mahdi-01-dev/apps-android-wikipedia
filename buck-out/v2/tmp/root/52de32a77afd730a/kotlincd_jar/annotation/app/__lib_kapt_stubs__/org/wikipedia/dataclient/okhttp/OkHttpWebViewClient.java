package org.wikipedia.dataclient.okhttp;

import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.RestService;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.PageViewModel;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import java.io.IOException;
import java.nio.charset.Charset;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\r\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OkHttpWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "linkHandler", "Lorg/wikipedia/page/LinkHandler;", "getLinkHandler", "()Lorg/wikipedia/page/LinkHandler;", "model", "Lorg/wikipedia/page/PageViewModel;", "getModel", "()Lorg/wikipedia/page/PageViewModel;", "addHeaders", "Lokhttp3/Request$Builder;", "request", "Landroid/webkit/WebResourceRequest;", "builder", "addResponseHeaders", "Lokhttp3/Headers;", "headers", "Lokhttp3/Response;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "shouldOverrideKeyEvent", "", "event", "Landroid/view/KeyEvent;", "shouldOverrideUrlLoading", "url", "", "Companion", "app.lib"})
public abstract class OkHttpWebViewClient extends android.webkit.WebViewClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String HEADER_CONTENT_TYPE = "content-type";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> SUPPORTED_SCHEMES = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.okhttp.OkHttpWebViewClient.Companion Companion = null;
    
    public OkHttpWebViewClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.page.PageViewModel getModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.page.LinkHandler getLinkHandler();
    
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    android.webkit.WebResourceRequest request) {
        return null;
    }
    
    @java.lang.Override()
    public boolean shouldOverrideKeyEvent(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final okhttp3.Response request(android.webkit.WebResourceRequest request) throws java.io.IOException {
        return null;
    }
    
    private final okhttp3.Request.Builder addHeaders(android.webkit.WebResourceRequest request, okhttp3.Request.Builder builder) {
        return null;
    }
    
    private final okhttp3.Headers addResponseHeaders(okhttp3.Headers headers) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OkHttpWebViewClient$Companion;", "", "()V", "HEADER_CONTENT_TYPE", "", "SUPPORTED_SCHEMES", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}