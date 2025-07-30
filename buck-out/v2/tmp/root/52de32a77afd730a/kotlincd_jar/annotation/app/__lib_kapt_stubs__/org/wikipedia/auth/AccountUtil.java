package org.wikipedia.auth;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Build;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.login.LoginResult;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.UriUtil;
import java.time.LocalDate;
import java.util.Collections;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0004J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0006\u0010\u001e\u001a\u00020\u0004J\u0016\u0010\u001f\u001a\u00020\u00112\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bJ\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\"J\u0010\u0010\'\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u000e\u0010(\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010)\u001a\u00020\u0006J\u0018\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\t\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/auth/AccountUtil;", "", "()V", "CENTRALAUTH_USER_COOKIE_NAME", "", "TEMP_ACCOUNT_EXPIRY_DAYS", "", "assertUser", "getAssertUser", "()Ljava/lang/String;", "groups", "", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "isLoggedIn", "", "()Z", "isTemporaryAccount", "password", "getPassword", "userName", "getUserName", "account", "Landroid/accounts/Account;", "accountManager", "Landroid/accounts/AccountManager;", "accountType", "createAccount", "getUserNameFromCookie", "isMemberOf", "isUserNameTemporary", "maybeSetTempAccountDay", "", "maybeShowTempAccountWelcome", "activity", "Landroid/app/Activity;", "removeAccount", "setPassword", "supported", "tempAccountDaysLeft", "updateAccount", "response", "Landroid/accounts/AccountAuthenticatorResponse;", "result", "Lorg/wikipedia/login/LoginResult;", "app.lib"})
public final class AccountUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CENTRALAUTH_USER_COOKIE_NAME = "centralauth_User";
    private static final int TEMP_ACCOUNT_EXPIRY_DAYS = 90;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.auth.AccountUtil INSTANCE = null;
    
    private AccountUtil() {
        super();
    }
    
    public final void updateAccount(@org.jetbrains.annotations.Nullable()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    org.wikipedia.login.LoginResult result) {
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final boolean isTemporaryAccount() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAssertUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups) {
    }
    
    public final boolean isMemberOf(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups) {
        return false;
    }
    
    public final void removeAccount() {
    }
    
    public final boolean supported(@org.jetbrains.annotations.NotNull()
    android.accounts.Account account) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.accounts.Account account() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String accountType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserNameFromCookie() {
        return null;
    }
    
    public final void maybeSetTempAccountDay() {
    }
    
    public final void maybeShowTempAccountWelcome(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final int tempAccountDaysLeft() {
        return 0;
    }
    
    public final boolean isUserNameTemporary(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return false;
    }
    
    private final boolean createAccount(java.lang.String userName, java.lang.String password) {
        return false;
    }
    
    private final void setPassword(java.lang.String password) {
    }
    
    private final android.accounts.AccountManager accountManager() {
        return null;
    }
}