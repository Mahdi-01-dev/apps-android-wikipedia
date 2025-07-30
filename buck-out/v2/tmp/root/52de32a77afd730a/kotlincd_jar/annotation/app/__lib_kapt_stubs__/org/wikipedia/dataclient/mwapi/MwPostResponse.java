package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;
import org.wikipedia.auth.AccountUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwPostResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "options", "", "getOptions", "()Ljava/lang/String;", "pageInfo", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getPageInfo", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "success", "", "getSuccess", "()I", "app.lib"})
public class MwPostResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryPage pageInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String options = null;
    private final int success = 0;
    
    public MwPostResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage getPageInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOptions() {
        return null;
    }
    
    public final int getSuccess() {
        return 0;
    }
}