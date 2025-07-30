package org.wikipedia.dataclient.watch;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/watch/Watch;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "title", "", "ns", "", "pageid", "expiry", "watched", "", "unwatched", "missing", "(Ljava/lang/String;IILjava/lang/String;ZZZ)V", "getExpiry", "()Ljava/lang/String;", "getMissing", "()Z", "getNs", "()I", "getPageid", "getTitle", "getUnwatched", "getWatched", "app.lib"})
public final class Watch extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    private final int ns = 0;
    private final int pageid = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String expiry = null;
    private final boolean watched = false;
    private final boolean unwatched = false;
    private final boolean missing = false;
    
    public Watch(@org.jetbrains.annotations.Nullable()
    java.lang.String title, int ns, int pageid, @org.jetbrains.annotations.Nullable()
    java.lang.String expiry, boolean watched, boolean unwatched, boolean missing) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getNs() {
        return 0;
    }
    
    public final int getPageid() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpiry() {
        return null;
    }
    
    public final boolean getWatched() {
        return false;
    }
    
    public final boolean getUnwatched() {
        return false;
    }
    
    public final boolean getMissing() {
        return false;
    }
}