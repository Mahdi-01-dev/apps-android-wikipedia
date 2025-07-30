package org.wikipedia.login;

import org.wikipedia.dataclient.WikiSite;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/login/LoginOAuthResult;", "Lorg/wikipedia/login/LoginResult;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "status", "", "userName", "password", "message", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app.lib"})
public final class LoginOAuthResult extends org.wikipedia.login.LoginResult {
    
    public LoginOAuthResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super(null, null, null, null, null, 0, null);
    }
}