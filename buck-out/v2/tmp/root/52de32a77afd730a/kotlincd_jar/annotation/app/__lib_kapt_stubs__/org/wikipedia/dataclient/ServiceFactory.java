package org.wikipedia.dataclient;

import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.DestinationEventService;
import org.wikipedia.analytics.eventplatform.EventService;
import org.wikipedia.analytics.eventplatform.StreamConfig;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.settings.Prefs;
import retrofit2.Retrofit;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bJ4\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0086\u0002\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/dataclient/ServiceFactory;", "", "()V", "ANALYTICS_REST_SERVICE_CACHE", "Landroidx/collection/LruCache;", "Lorg/wikipedia/analytics/eventplatform/DestinationEventService;", "Lorg/wikipedia/analytics/eventplatform/EventService;", "CORE_REST_SERVICE_CACHE", "Lorg/wikipedia/dataclient/WikiSite;", "Lorg/wikipedia/dataclient/CoreRestService;", "REST_SERVICE_CACHE", "Lorg/wikipedia/dataclient/RestService;", "SERVICE_CACHE", "Lorg/wikipedia/dataclient/Service;", "SERVICE_CACHE_SIZE", "", "createRetrofit", "Lretrofit2/Retrofit;", "wiki", "baseUrl", "", "get", "T", "service", "Ljava/lang/Class;", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getAnalyticsRest", "streamConfig", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "getBasePath", "getCoreRest", "getRest", "getRestBasePath", "LanguageVariantHeaderInterceptor", "app.lib"})
public final class ServiceFactory {
    private static final int SERVICE_CACHE_SIZE = 8;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.collection.LruCache<org.wikipedia.dataclient.WikiSite, org.wikipedia.dataclient.Service> SERVICE_CACHE = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.collection.LruCache<org.wikipedia.dataclient.WikiSite, org.wikipedia.dataclient.RestService> REST_SERVICE_CACHE = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.collection.LruCache<org.wikipedia.dataclient.WikiSite, org.wikipedia.dataclient.CoreRestService> CORE_REST_SERVICE_CACHE = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.collection.LruCache<org.wikipedia.analytics.eventplatform.DestinationEventService, org.wikipedia.analytics.eventplatform.EventService> ANALYTICS_REST_SERVICE_CACHE = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.ServiceFactory INSTANCE = null;
    
    private ServiceFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.Service get(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.RestService getRest(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.CoreRestService getCoreRest(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.eventplatform.EventService getAnalyticsRest(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.StreamConfig streamConfig) {
        return null;
    }
    
    public final <T extends java.lang.Object>T get(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> service) {
        return null;
    }
    
    private final java.lang.String getBasePath(org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestBasePath(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit(org.wikipedia.dataclient.WikiSite wiki, java.lang.String baseUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/ServiceFactory$LanguageVariantHeaderInterceptor;", "Lokhttp3/Interceptor;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app.lib"})
    static final class LanguageVariantHeaderInterceptor implements okhttp3.Interceptor {
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.WikiSite wiki = null;
        
        public LanguageVariantHeaderInterceptor(@org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.WikiSite wiki) {
            super();
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @org.jetbrains.annotations.NotNull()
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
        okhttp3.Interceptor.Chain chain) throws java.io.IOException {
            return null;
        }
    }
}