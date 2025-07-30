package org.wikipedia.dataclient;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.wikipedia.login.LoginClient;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u00a2\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\r\u001a\u00020\tJ\"\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0002J\u001e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0016R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/dataclient/SharedPreferenceCookieManager;", "Lokhttp3/CookieJar;", "cookieJar", "", "", "", "Lokhttp3/Cookie;", "(Ljava/util/Map;)V", "buildCookieList", "", "outList", "inList", "prefix", "clearAllCookies", "getCookieByName", "name", "domainSpec", "matchExactName", "", "getCookieValueByName", "loadForRequest", "", "url", "Lokhttp3/HttpUrl;", "persistCookies", "saveFromResponse", "cookies", "Companion", "app.lib"})
public final class SharedPreferenceCookieManager implements okhttp3.CookieJar {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.util.List<okhttp3.Cookie>> cookieJar = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CENTRALAUTH_PREFIX = "centralauth_";
    @org.jetbrains.annotations.Nullable()
    private static org.wikipedia.dataclient.SharedPreferenceCookieManager INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.SharedPreferenceCookieManager.Companion Companion = null;
    
    public SharedPreferenceCookieManager(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.util.List<okhttp3.Cookie>> cookieJar) {
        super();
    }
    
    private final void persistCookies() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void clearAllCookies() {
    }
    
    @kotlin.jvm.Synchronized()
    @org.jetbrains.annotations.Nullable()
    public final synchronized java.lang.String getCookieValueByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    @org.jetbrains.annotations.Nullable()
    public final synchronized java.lang.String getCookieByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String domainSpec, boolean matchExactName) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Synchronized()
    public synchronized void saveFromResponse(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url, @org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies) {
    }
    
    @java.lang.Override()
    @kotlin.jvm.Synchronized()
    @org.jetbrains.annotations.NotNull()
    public synchronized java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    @org.jetbrains.annotations.NotNull()
    public final synchronized java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    private final void buildCookieList(java.util.List<okhttp3.Cookie> outList, java.util.List<okhttp3.Cookie> inList, java.lang.String prefix) {
    }
    
    public SharedPreferenceCookieManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/SharedPreferenceCookieManager$Companion;", "", "()V", "CENTRALAUTH_PREFIX", "", "INSTANCE", "Lorg/wikipedia/dataclient/SharedPreferenceCookieManager;", "instance", "getInstance", "()Lorg/wikipedia/dataclient/SharedPreferenceCookieManager;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.SharedPreferenceCookieManager getInstance() {
            return null;
        }
    }
}