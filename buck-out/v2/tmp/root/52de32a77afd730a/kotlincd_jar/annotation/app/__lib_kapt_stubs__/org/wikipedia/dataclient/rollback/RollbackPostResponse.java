package org.wikipedia.dataclient.rollback;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwPostResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/rollback/RollbackPostResponse;", "Lorg/wikipedia/dataclient/mwapi/MwPostResponse;", "()V", "rollback", "Lorg/wikipedia/dataclient/rollback/Rollback;", "getRollback", "()Lorg/wikipedia/dataclient/rollback/Rollback;", "app.lib"})
public final class RollbackPostResponse extends org.wikipedia.dataclient.mwapi.MwPostResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.rollback.Rollback rollback = null;
    
    public RollbackPostResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.rollback.Rollback getRollback() {
        return null;
    }
}