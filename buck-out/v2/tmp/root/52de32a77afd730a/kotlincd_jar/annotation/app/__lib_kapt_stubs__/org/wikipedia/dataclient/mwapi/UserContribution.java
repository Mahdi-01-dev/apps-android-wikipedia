package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;
import org.wikipedia.util.DateUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0010\u00a8\u00060"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/UserContribution;", "", "()V", "comment", "", "getComment", "()Ljava/lang/String;", "minor", "", "getMinor", "()Z", "new", "getNew", "ns", "", "getNs", "()I", "pageid", "getPageid", "parentid", "", "getParentid", "()J", "parsedDateTime", "Ljava/time/LocalDateTime;", "getParsedDateTime", "()Ljava/time/LocalDateTime;", "parsedDateTime$delegate", "Lkotlin/Lazy;", "revid", "getRevid", "size", "getSize", "sizediff", "getSizediff", "tags", "", "getTags", "()Ljava/util/List;", "timestamp", "title", "getTitle", "top", "getTop", "user", "getUser", "userid", "getUserid", "app.lib"})
public final class UserContribution {
    private final int userid = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String user = "";
    private final int pageid = 0;
    private final long revid = 0L;
    private final long parentid = 0L;
    private final int ns = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timestamp = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String comment = "";
    private final boolean minor = false;
    private final boolean top = false;
    private final int size = 0;
    private final int sizediff = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy parsedDateTime$delegate = null;
    
    public UserContribution() {
        super();
    }
    
    public final int getUserid() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser() {
        return null;
    }
    
    public final int getPageid() {
        return 0;
    }
    
    public final long getRevid() {
        return 0L;
    }
    
    public final long getParentid() {
        return 0L;
    }
    
    public final int getNs() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final boolean getNew() {
        return false;
    }
    
    public final boolean getMinor() {
        return false;
    }
    
    public final boolean getTop() {
        return false;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int getSizediff() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getParsedDateTime() {
        return null;
    }
}