package org.wikipedia.dataclient.watch;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwPostResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\nR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8F\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/dataclient/watch/WatchPostResponse;", "Lorg/wikipedia/dataclient/mwapi/MwPostResponse;", "()V", "batchcomplete", "", "getBatchcomplete", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "watch", "", "Lorg/wikipedia/dataclient/watch/Watch;", "getWatch", "()Ljava/util/List;", "getFirst", "app.lib"})
public final class WatchPostResponse extends org.wikipedia.dataclient.mwapi.MwPostResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean batchcomplete = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.watch.Watch> watch = null;
    
    public WatchPostResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBatchcomplete() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.watch.Watch> getWatch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.watch.Watch getFirst() {
        return null;
    }
}