package org.wikipedia.dataclient;

import android.net.Uri;
import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.json.UriSerializer;
import org.wikipedia.language.AppLanguageLookUpTable;
import org.wikipedia.util.UriUtil;

/**
 * The base URL and Wikipedia language code for a MediaWiki site. Examples:
 *
 *
 * <lh>Name: scheme / authority / language code</lh>
 * * English Wikipedia: HTTPS / en.wikipedia.org / en
 * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
 * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
 * * Test Wikipedia: HTTPS / test.wikipedia.org / test
 * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
 * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
 * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
 * * Development: HTTP / 192.168.1.11:8080 / (none)
 *
 *
 * **As shown above, the language code or mapping is part of the authority:**
 *
 * <lh>Validity: authority / language code</lh>
 * * Correct: "test.wikipedia.org" / "test"
 * * Correct: "wikipedia.org", ""
 * * Correct: "no.wikipedia.org", "nb"
 * * Incorrect: "wikipedia.org", "test"
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\b\u001a\u00020\u0006J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u0017\u001a\u00020\u0006J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0006\u0010!\u001a\u00020\u0006J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0007R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/dataclient/WikiSite;", "Landroid/os/Parcelable;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "url", "", "(Ljava/lang/String;)V", "authority", "languageCode", "(Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/net/Uri;Ljava/lang/String;)V", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "getUri$annotations", "()V", "getUri", "()Landroid/net/Uri;", "setUri", "component1", "component2", "copy", "dbName", "equals", "", "other", "", "hashCode", "", "path", "segment", "scheme", "subdomain", "toString", "Companion", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class WikiSite implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private android.net.Uri uri;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String languageCode;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_SCHEME = "https";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_DOMAIN = "wikipedia.org";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String DEFAULT_BASE_URL;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.WikiSite.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite copy(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "domain")
    @kotlinx.serialization.Serializable(with = org.wikipedia.json.UriSerializer.class)
    @java.lang.Deprecated()
    public static void getUri$annotations() {
    }
    
    public final void setUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguageCode() {
        return null;
    }
    
    public final void setLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        super();
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String scheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String authority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String subdomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String path(@org.jetbrains.annotations.NotNull()
    java.lang.String segment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String url(@org.jetbrains.annotations.NotNull()
    java.lang.String segment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dbName() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/dataclient/WikiSite$Companion;", "", "()V", "BASE_DOMAIN", "", "DEFAULT_BASE_URL", "DEFAULT_SCHEME", "authorityToLanguageCode", "authority", "ensureScheme", "Landroid/net/Uri;", "uri", "forLanguageCode", "Lorg/wikipedia/dataclient/WikiSite;", "languageCode", "languageCodeToSubdomain", "normalizeLanguageCode", "setDefaultBaseUrl", "", "url", "supportedAuthority", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean supportedAuthority(@org.jetbrains.annotations.NotNull()
        java.lang.String authority) {
            return false;
        }
        
        public final void setDefaultBaseUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.WikiSite forLanguageCode(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String normalizeLanguageCode(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
            return null;
        }
        
        private final java.lang.String languageCodeToSubdomain(java.lang.String languageCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String authorityToLanguageCode(@org.jetbrains.annotations.NotNull()
        java.lang.String authority) {
            return null;
        }
        
        private final android.net.Uri ensureScheme(android.net.Uri uri) {
            return null;
        }
    }
}