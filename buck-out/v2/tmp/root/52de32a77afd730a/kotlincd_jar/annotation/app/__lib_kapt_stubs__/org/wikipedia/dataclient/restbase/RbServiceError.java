package org.wikipedia.dataclient.restbase;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.ServiceError;
import org.wikipedia.json.JsonUtil;

/**
 * Model class that can represent either a RESTBase error or a MediaWiki REST API error.
 * Since both types of errors have non-overlapping fields, we can use a single class to
 * represent either of them, and then phase out the RESTBase-specific fields when RESTBase
 * is fully decommissioned.
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/restbase/RbServiceError;", "Lorg/wikipedia/dataclient/ServiceError;", "()V", "detail", "", "errorKey", "key", "getKey", "()Ljava/lang/String;", "message", "getMessage", "messageTranslations", "", "title", "Companion", "app.lib"})
public final class RbServiceError implements org.wikipedia.dataclient.ServiceError {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String detail = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorKey = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> messageTranslations = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.restbase.RbServiceError.Companion Companion = null;
    
    public RbServiceError() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getKey() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/restbase/RbServiceError$Companion;", "", "()V", "create", "Lorg/wikipedia/dataclient/restbase/RbServiceError;", "rspBody", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.restbase.RbServiceError create(@org.jetbrains.annotations.NotNull()
        java.lang.String rspBody) {
            return null;
        }
    }
}