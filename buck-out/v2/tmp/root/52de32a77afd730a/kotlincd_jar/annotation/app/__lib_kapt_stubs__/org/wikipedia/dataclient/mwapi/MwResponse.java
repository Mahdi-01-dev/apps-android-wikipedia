package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwResponse;", "", "()V", "errors", "", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "servedBy", "", "getServedBy$annotations", "app.lib"})
public abstract class MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError> errors = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String servedBy = null;
    
    public MwResponse() {
        super();
    }
    
    @kotlinx.serialization.SerialName(value = "servedby")
    @java.lang.Deprecated()
    private static void getServedBy$annotations() {
    }
}