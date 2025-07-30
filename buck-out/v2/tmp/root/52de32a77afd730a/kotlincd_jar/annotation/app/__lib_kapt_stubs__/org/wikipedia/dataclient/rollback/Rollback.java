package org.wikipedia.dataclient.rollback;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bR\u001c\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/dataclient/rollback/Rollback;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "title", "", "pageId", "", "summary", "revision", "", "oldRevision", "lastRevision", "(Ljava/lang/String;ILjava/lang/String;JJJ)V", "getLastRevision$annotations", "()V", "getLastRevision", "()J", "getOldRevision$annotations", "getOldRevision", "getPageId$annotations", "getPageId", "()I", "getRevision$annotations", "getRevision", "getSummary", "()Ljava/lang/String;", "getTitle", "app.lib"})
public final class Rollback extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    private final int pageId = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String summary = null;
    private final long revision = 0L;
    private final long oldRevision = 0L;
    private final long lastRevision = 0L;
    
    public Rollback(@org.jetbrains.annotations.Nullable()
    java.lang.String title, int pageId, @org.jetbrains.annotations.Nullable()
    java.lang.String summary, long revision, long oldRevision, long lastRevision) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getPageId() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "pageid")
    @java.lang.Deprecated()
    public static void getPageId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final long getRevision() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "revid")
    @java.lang.Deprecated()
    public static void getRevision$annotations() {
    }
    
    public final long getOldRevision() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "old_revid")
    @java.lang.Deprecated()
    public static void getOldRevision$annotations() {
    }
    
    public final long getLastRevision() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "last_revid")
    @java.lang.Deprecated()
    public static void getLastRevision$annotations() {
    }
}