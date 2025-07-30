package org.wikipedia.login;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.WikiSite;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u0000  2\u00020\u0001:\u0001 BO\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/login/LoginResult;", "", "site", "Lorg/wikipedia/dataclient/WikiSite;", "status", "", "userName", "password", "message", "userId", "", "groups", "", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)V", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "getMessage", "()Ljava/lang/String;", "getPassword", "getSite", "()Lorg/wikipedia/dataclient/WikiSite;", "getStatus", "getUserId", "()I", "setUserId", "(I)V", "getUserName", "fail", "", "pass", "Companion", "app.lib"})
public class LoginResult {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite site = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    private int userId;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> groups;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_PASS = "PASS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_FAIL = "FAIL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_UI = "UI";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.login.LoginResult.Companion Companion = null;
    
    public LoginResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String message, int userId, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> p0) {
    }
    
    public final boolean pass() {
        return false;
    }
    
    public final boolean fail() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/login/LoginResult$Companion;", "", "()V", "STATUS_FAIL", "", "STATUS_PASS", "STATUS_UI", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}