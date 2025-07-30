package org.wikipedia.dataclient.okhttp;

import okhttp3.Response;
import org.wikipedia.dataclient.ServiceError;
import org.wikipedia.dataclient.restbase.RbServiceError;
import org.wikipedia.util.log.L;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/HttpStatusException;", "Ljava/io/IOException;", "rsp", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "code", "", "url", "", "message", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "serviceError", "Lorg/wikipedia/dataclient/ServiceError;", "getServiceError", "()Lorg/wikipedia/dataclient/ServiceError;", "setServiceError", "(Lorg/wikipedia/dataclient/ServiceError;)V", "getUrl", "app.lib"})
public final class HttpStatusException extends java.io.IOException {
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.ServiceError serviceError;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.ServiceError getServiceError() {
        return null;
    }
    
    public final void setServiceError(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.ServiceError p0) {
    }
    
    public void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getMessage() {
        return null;
    }
    
    public HttpStatusException(@org.jetbrains.annotations.NotNull()
    okhttp3.Response rsp) {
        super();
    }
    
    public HttpStatusException(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
}