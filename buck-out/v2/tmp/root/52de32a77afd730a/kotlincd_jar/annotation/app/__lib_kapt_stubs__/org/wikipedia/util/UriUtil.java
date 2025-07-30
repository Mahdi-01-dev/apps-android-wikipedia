package org.wikipedia.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import androidx.annotation.StringRes;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.util.log.L;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010(\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/util/UriUtil;", "", "()V", "LOCAL_URL_CUSTOMIZE_FEED", "", "LOCAL_URL_LANGUAGES", "LOCAL_URL_LOGIN", "LOCAL_URL_SETTINGS", "WIKI_REGEX", "decodeURL", "url", "encodeURL", "getFilenameFromUploadUrl", "getLanguageVariantFromUri", "uri", "Landroid/net/Uri;", "getTitleFromUrl", "getUrlWithProvenance", "context", "Landroid/content/Context;", "title", "Lorg/wikipedia/page/PageTitle;", "provId", "", "getUserPageTitle", "username", "languageCode", "handleExternalLink", "", "isAppSupportedLink", "", "isDiffUrl", "isValidPageLink", "removeFragment", "link", "removeInternalLinkPrefix", "removeLinkPrefix", "resolveProtocolRelativeUrl", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "visitInExternalBrowser", "visitInExternalBrowserExplicit", "app.lib"})
public final class UriUtil {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_SETTINGS = "#settings";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_LOGIN = "#login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_CUSTOMIZE_FEED = "#customizefeed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_LANGUAGES = "#languages";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKI_REGEX = "/(wiki|[a-z]{2,3}|[a-z]{2,3}-.*)/";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.UriUtil INSTANCE = null;
    
    private UriUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String decodeURL(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encodeURL(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public final void visitInExternalBrowser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    private final void visitInExternalBrowserExplicit(android.content.Context context, android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String resolveProtocolRelativeUrl(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String resolveProtocolRelativeUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public final boolean isValidPageLink(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    public final boolean isAppSupportedLink(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    public final void handleExternalLink(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrlWithProvenance(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @androidx.annotation.StringRes()
    int provId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilenameFromUploadUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitleFromUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    /**
     * Get language variant code from a Uri path, e.g. "/wiki/Foo" or "/zh-tw/Foo".
     * It will return "zh-tw" or an empty string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguageVariantFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * For internal links only
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeInternalLinkPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    /**
     * For links that could be internal or external links
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeLinkPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    /**
     * Removes an optional fragment portion of a URL
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getUserPageTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    public final boolean isDiffUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
}