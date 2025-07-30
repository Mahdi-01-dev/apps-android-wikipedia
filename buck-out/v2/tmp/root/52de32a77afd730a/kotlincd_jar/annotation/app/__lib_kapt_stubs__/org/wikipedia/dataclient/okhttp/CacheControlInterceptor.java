package org.wikipedia.dataclient.okhttp;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * This interceptor applies to RESPONSES after they are received from the network, but before
 * they are written to cache. The goal is to manipulate the headers so that the responses would
 * be readable from cache conditionally based on the app state, instead of based on what the
 * server dictates.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/CacheControlInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app.lib"})
public final class CacheControlInterceptor implements okhttp3.Interceptor {
    
    public CacheControlInterceptor() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}