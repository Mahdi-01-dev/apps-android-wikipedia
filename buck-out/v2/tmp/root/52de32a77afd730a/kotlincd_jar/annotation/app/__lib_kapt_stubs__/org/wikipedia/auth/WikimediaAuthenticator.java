package org.wikipedia.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import org.wikipedia.R;
import org.wikipedia.login.LoginActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002JA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0016\u00a2\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J,\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/auth/WikimediaAuthenticator;", "Landroid/accounts/AbstractAccountAuthenticator;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addAccount", "Landroid/os/Bundle;", "response", "Landroid/accounts/AccountAuthenticatorResponse;", "accountType", "", "authTokenType", "requiredFeatures", "", "options", "(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "confirmCredentials", "account", "Landroid/accounts/Account;", "editProperties", "getAuthToken", "getAuthTokenLabel", "hasFeatures", "features", "(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)Landroid/os/Bundle;", "supportedAccountType", "", "type", "unsupportedOperation", "updateCredentials", "app.lib"})
public final class WikimediaAuthenticator extends android.accounts.AbstractAccountAuthenticator {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public WikimediaAuthenticator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.Bundle editProperties(@org.jetbrains.annotations.NotNull()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.Bundle addAccount(@org.jetbrains.annotations.NotNull()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String authTokenType, @org.jetbrains.annotations.Nullable()
    java.lang.String[] requiredFeatures, @org.jetbrains.annotations.Nullable()
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.Bundle confirmCredentials(@org.jetbrains.annotations.NotNull()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    android.accounts.Account account, @org.jetbrains.annotations.Nullable()
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.Bundle getAuthToken(@org.jetbrains.annotations.NotNull()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    android.accounts.Account account, @org.jetbrains.annotations.NotNull()
    java.lang.String authTokenType, @org.jetbrains.annotations.Nullable()
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getAuthTokenLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String authTokenType) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.Bundle updateCredentials(@org.jetbrains.annotations.NotNull()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    android.accounts.Account account, @org.jetbrains.annotations.Nullable()
    java.lang.String authTokenType, @org.jetbrains.annotations.Nullable()
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.Bundle hasFeatures(@org.jetbrains.annotations.NotNull()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    android.accounts.Account account, @org.jetbrains.annotations.NotNull()
    java.lang.String[] features) {
        return null;
    }
    
    private final boolean supportedAccountType(java.lang.String type) {
        return false;
    }
    
    private final android.os.Bundle addAccount(android.accounts.AccountAuthenticatorResponse response) {
        return null;
    }
    
    private final android.os.Bundle unsupportedOperation() {
        return null;
    }
}