package org.wikipedia.login;

import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.activity.result.contract.ActivityResultContracts;
import com.google.android.material.textfield.TextInputLayout;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.captcha.CaptchaHandler;
import org.wikipedia.captcha.CaptchaResult;
import org.wikipedia.createaccount.CreateAccountActivity;
import org.wikipedia.databinding.ActivityLoginBinding;
import org.wikipedia.notifications.PollNotificationWorker;
import org.wikipedia.page.PageTitle;
import org.wikipedia.push.WikipediaFirebaseMessagingService.Companion.updateSubscription;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.NonEmptyValidator;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u000234B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001cH\u0002J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020%H\u0014J\b\u0010)\u001a\u00020\u001cH\u0014J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lorg/wikipedia/login/LoginActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "captchaHandler", "Lorg/wikipedia/captcha/CaptchaHandler;", "captchaResult", "Lorg/wikipedia/captcha/CaptchaResult;", "createAccountLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "firstStepToken", "", "loginCallback", "Lorg/wikipedia/login/LoginActivity$LoginCallback;", "loginClient", "Lorg/wikipedia/login/LoginClient;", "loginSource", "resetPasswordLauncher", "shouldLogLogin", "", "uiPromptResult", "Lorg/wikipedia/login/LoginResult;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "clearErrors", "", "doLogin", "getText", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "logLoginStart", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginSuccess", "onSaveInstanceState", "outState", "onStop", "resetAuthState", "setAllViewsClickListener", "showError", "caught", "", "showProgressBar", "enable", "startCreateAccountActivity", "validateThenLogin", "Companion", "LoginCallback", "app.lib"})
public final class LoginActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityLoginBinding binding;
    private org.wikipedia.captcha.CaptchaHandler captchaHandler;
    private java.lang.String loginSource;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.dataclient.WikiSite wiki;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.login.LoginResult uiPromptResult;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.captcha.CaptchaResult captchaResult;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstStepToken;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.login.LoginClient loginClient = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.login.LoginActivity.LoginCallback loginCallback = null;
    private boolean shouldLogLogin = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> createAccountLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> resetPasswordLauncher = null;
    public static final int RESULT_LOGIN_SUCCESS = 1;
    public static final int RESULT_LOGIN_FAIL = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_REQUEST_SOURCE = "login_request_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_ACCOUNT_FIRST = "create_account_first";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_NAV = "navigation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_EDIT = "edit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SYSTEM = "system";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_ONBOARDING = "onboarding";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SETTINGS = "settings";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SUBSCRIBE = "subscribe";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_READING_MANUAL_SYNC = "reading_lists_manual_sync";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_LOGOUT_BACKGROUND = "logout_background";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SUGGESTED_EDITS = "suggestededits";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_TALK = "talk";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.login.LoginActivity.Companion Companion = null;
    
    public LoginActivity() {
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
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void setAllViewsClickListener() {
    }
    
    private final java.lang.String getText(com.google.android.material.textfield.TextInputLayout input) {
        return null;
    }
    
    private final void resetAuthState() {
    }
    
    private final void clearErrors() {
    }
    
    private final void validateThenLogin() {
    }
    
    private final void logLoginStart() {
    }
    
    private final void startCreateAccountActivity() {
    }
    
    private final void onLoginSuccess() {
    }
    
    private final void doLogin() {
    }
    
    private final void showProgressBar(boolean enable) {
    }
    
    private final void showError(java.lang.Throwable caught) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/login/LoginActivity$Companion;", "", "()V", "CREATE_ACCOUNT_FIRST", "", "LOGIN_REQUEST_SOURCE", "RESULT_LOGIN_FAIL", "", "RESULT_LOGIN_SUCCESS", "SOURCE_EDIT", "SOURCE_LOGOUT_BACKGROUND", "SOURCE_NAV", "SOURCE_ONBOARDING", "SOURCE_READING_MANUAL_SYNC", "SOURCE_SETTINGS", "SOURCE_SUBSCRIBE", "SOURCE_SUGGESTED_EDITS", "SOURCE_SYSTEM", "SOURCE_TALK", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "createAccountFirst", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String source, boolean createAccountFirst) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J,\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/login/LoginActivity$LoginCallback;", "Lorg/wikipedia/login/LoginClient$LoginCallback;", "(Lorg/wikipedia/login/LoginActivity;)V", "error", "", "caught", "", "passwordResetPrompt", "token", "", "success", "result", "Lorg/wikipedia/login/LoginResult;", "uiPrompt", "captchaId", "app.lib"})
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