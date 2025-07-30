package org.wikipedia.login;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/login/LoginResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "clientLogin", "Lorg/wikipedia/login/LoginResponse$ClientLogin;", "getClientLogin$annotations", "toLoginResult", "Lorg/wikipedia/login/LoginResult;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "password", "", "ClientLogin", "Request", "app.lib"})
public final class LoginResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.login.LoginResponse.ClientLogin clientLogin = null;
    
    public LoginResponse() {
        super();
    }
    
    @kotlinx.serialization.SerialName(value = "clientlogin")
    @java.lang.Deprecated()
    private static void getClientLogin$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.login.LoginResult toLoginResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/login/LoginResponse$ClientLogin;", "", "()V", "message", "", "requests", "", "Lorg/wikipedia/login/LoginResponse$Request;", "status", "userName", "getUserName$annotations", "toLoginResult", "Lorg/wikipedia/login/LoginResult;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "password", "app.lib"})
    static final class ClientLogin {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String status = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<org.wikipedia.login.LoginResponse.Request> requests = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String userName = null;
        
        public ClientLogin() {
            super();
        }
        
        @kotlinx.serialization.SerialName(value = "username")
        @java.lang.Deprecated()
        private static void getUserName$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.login.LoginResult toLoginResult(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/login/LoginResponse$Request;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "app.lib"})
    static final class Request {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        
        public Request() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
    }
}