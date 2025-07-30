package org.wikipedia.login;

import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.material.textfield.TextInputLayout;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.createaccount.CreateAccountActivity.ValidateResult;
import org.wikipedia.databinding.ActivityResetPasswordBinding;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.NonEmptyValidator;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/login/ResetPasswordActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "firstStepToken", "", "loginCallback", "Lorg/wikipedia/login/ResetPasswordActivity$LoginCallback;", "loginClient", "Lorg/wikipedia/login/LoginClient;", "uiPromptResult", "Lorg/wikipedia/login/LoginResult;", "userName", "clearErrors", "", "doLogin", "getText", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "resetAuthState", "showError", "caught", "", "showProgressBar", "enable", "", "validateThenLogin", "Companion", "LoginCallback", "app.lib"})
public final class ResetPasswordActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityResetPasswordBinding binding;
    private java.lang.String firstStepToken;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.login.LoginResult uiPromptResult;
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.login.LoginClient loginClient;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.login.ResetPasswordActivity.LoginCallback loginCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_USER_NAME = "userName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_TOKEN = "token";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.login.ResetPasswordActivity.Companion Companion = null;
    
    public ResetPasswordActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void clearErrors() {
    }
    
    private final void resetAuthState() {
    }
    
    private final void validateThenLogin() {
    }
    
    private final java.lang.String getText(com.google.android.material.textfield.TextInputLayout input) {
        return null;
    }
    
    private final void doLogin() {
    }
    
    private final void showProgressBar(boolean enable) {
    }
    
    private final void showError(java.lang.Throwable caught) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/login/ResetPasswordActivity$Companion;", "", "()V", "LOGIN_TOKEN", "", "LOGIN_USER_NAME", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "userName", "token", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String userName, @org.jetbrains.annotations.Nullable()
        java.lang.String token) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J,\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/login/ResetPasswordActivity$LoginCallback;", "Lorg/wikipedia/login/LoginClient$LoginCallback;", "(Lorg/wikipedia/login/ResetPasswordActivity;)V", "error", "", "caught", "", "passwordResetPrompt", "token", "", "success", "result", "Lorg/wikipedia/login/LoginResult;", "uiPrompt", "captchaId", "app.lib"})
    final class LoginCallback implements org.wikipedia.login.LoginClient.LoginCallback {
        
        public LoginCallback() {
            super();
        }
        
        @java.lang.Override()
        public void success(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginResult result) {
        }
        
        @java.lang.Override()
        public void uiPrompt(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginResult result, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
        java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
        java.lang.String token) {
        }
        
        @java.lang.Override()
        public void passwordResetPrompt(@org.jetbrains.annotations.Nullable()
        java.lang.String token) {
        }
        
        @java.lang.Override()
        public void error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught) {
        }
    }
}