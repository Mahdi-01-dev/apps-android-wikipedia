package org.wikipedia.dataclient.okhttp;

import okhttp3.Interceptor;
import okhttp3.Response;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/TestStubInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Callback", "Companion", "app.lib"})
public final class TestStubInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.Nullable()
    private static org.wikipedia.dataclient.okhttp.TestStubInterceptor.Callback CALLBACK;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.okhttp.TestStubInterceptor.Companion Companion = null;
    
    public TestStubInterceptor() {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/TestStubInterceptor$Callback;", "", "getResponse", "Lokhttp3/Response;", "request", "Lokhttp3/Interceptor$Chain;", "app.lib"})
    public static abstract interface Callback {
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @org.jetbrains.annotations.NotNull()
        public abstract okhttp3.Response getResponse(@org.jetbrains.annotations.NotNull()
        okhttp3.Interceptor.Chain request) throws java.io.IOException;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/TestStubInterceptor$Companion;", "", "()V", "CALLBACK", "Lorg/wikipedia/dataclient/okhttp/TestStubInterceptor$Callback;", "getCALLBACK", "()Lorg/wikipedia/dataclient/okhttp/TestStubInterceptor$Callback;", "setCALLBACK", "(Lorg/wikipedia/dataclient/okhttp/TestStubInterceptor$Callback;)V", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.okhttp.TestStubInterceptor.Callback getCALLBACK() {
            return null;
        }
        
        public final void setCALLBACK(@org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.okhttp.TestStubInterceptor.Callback p0) {
        }
    }
}