package org.wikipedia.dataclient.okhttp;

import android.os.Build;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.tls.HandshakeCertificates;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.settings.Prefs;
import java.io.File;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OkHttpConnectionFactory;", "", "()V", "CACHE_CONTROL_FORCE_NETWORK", "Lokhttp3/CacheControl;", "getCACHE_CONTROL_FORCE_NETWORK", "()Lokhttp3/CacheControl;", "CACHE_CONTROL_MAX_STALE", "getCACHE_CONTROL_MAX_STALE", "CACHE_CONTROL_NONE", "getCACHE_CONTROL_NONE", "CACHE_DIR_NAME", "", "NET_CACHE", "Lokhttp3/Cache;", "NET_CACHE_SIZE", "", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "createClient", "app.lib"})
public final class OkHttpConnectionFactory {
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.CacheControl CACHE_CONTROL_FORCE_NETWORK = null;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.CacheControl CACHE_CONTROL_MAX_STALE = null;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.CacheControl CACHE_CONTROL_NONE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CACHE_DIR_NAME = "okhttp-cache";
    private static final long NET_CACHE_SIZE = 67108864L;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.Cache NET_CACHE = null;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory INSTANCE = null;
    
    private OkHttpConnectionFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.CacheControl getCACHE_CONTROL_FORCE_NETWORK() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.CacheControl getCACHE_CONTROL_MAX_STALE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.CacheControl getCACHE_CONTROL_NONE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    private final okhttp3.OkHttpClient createClient() {
        return null;
    }
}