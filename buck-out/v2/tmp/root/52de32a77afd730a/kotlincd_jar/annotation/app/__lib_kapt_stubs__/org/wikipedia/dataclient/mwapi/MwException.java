package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "error", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "(Lorg/wikipedia/dataclient/mwapi/MwServiceError;)V", "getError", "()Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "message", "", "getMessage", "()Ljava/lang/String;", "title", "getTitle", "app.lib"})
public final class MwException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.mwapi.MwServiceError error = null;
    
    public MwException(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwServiceError error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.mwapi.MwServiceError getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMessage() {
        return null;
    }
}