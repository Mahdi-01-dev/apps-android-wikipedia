package org.wikipedia.login;

import android.widget.Toast;
import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.log.L;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u0007J\u0087\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018JV\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\t2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0002\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/login/LoginClient;", "", "()V", "getLoginToken", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "userName", "password", "retypedPassword", "token", "twoFactorCode", "emailAuthCode", "captchaId", "captchaWord", "isContinuation", "", "cb", "Lorg/wikipedia/login/LoginClient$LoginCallback;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/wikipedia/login/LoginClient$LoginCallback;)V", "loginBlocking", "Lorg/wikipedia/login/LoginResult;", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showToast", "stringId", "", "Companion", "LoginCallback", "app.lib"})
public final class LoginClient {
    private static boolean enqueueForceEmailAuth = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.login.LoginClient.Companion Companion = null;
    
    public LoginClient() {
        super();
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String retypedPassword, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.String twoFactorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAuthCode, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isContinuation, @org.jetbrains.annotations.NotNull()
    org.wikipedia.login.LoginClient.LoginCallback cb) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginBlocking(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String twoFactorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAuthCode, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.login.LoginResult> $completion) {
        return null;
    }
    
    private final java.lang.Object getLoginToken(org.wikipedia.dataclient.WikiSite wiki, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final void showToast(@androidx.annotation.StringRes()
    int stringId) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/login/LoginClient$Companion;", "", "()V", "enqueueForceEmailAuth", "", "getEnqueueForceEmailAuth", "()Z", "setEnqueueForceEmailAuth", "(Z)V", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getEnqueueForceEmailAuth() {
            return false;
        }
        
        public final void setEnqueueForceEmailAuth(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J0\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginCallback;", "", "error", "", "caught", "", "passwordResetPrompt", "token", "", "success", "result", "Lorg/wikipedia/login/LoginResult;", "uiPrompt", "captchaId", "app.lib"})
    public static abstract interface LoginCallback {
        
        public abstract void success(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginResult result);
        
        public abstract void uiPrompt(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginResult result, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
        java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
        java.lang.String token);
        
        public abstract void passwordResetPrompt(@org.jetbrains.annotations.Nullable()
        java.lang.String token);
        
        public abstract void error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
}