package org.wikipedia.createaccount;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputLayout;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.CreateAccountEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.captcha.CaptchaHandler;
import org.wikipedia.captcha.CaptchaResult;
import org.wikipedia.databinding.ActivityCreateAccountBinding;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.NonEmptyValidator;
import java.util.regex.Pattern;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0015H\u0016J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\b\u0010\'\u001a\u00020\u0015H\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "captchaHandler", "Lorg/wikipedia/captcha/CaptchaHandler;", "createAccountEvent", "Lorg/wikipedia/analytics/eventplatform/CreateAccountEvent;", "userNameTextWatcher", "Landroid/text/TextWatcher;", "viewModel", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel;", "getViewModel", "()Lorg/wikipedia/createaccount/CreateAccountActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "clearErrors", "", "createAccount", "doCreateAccount", "token", "", "finishWithUserResult", "userName", "getText", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "handleAccountCreationError", "message", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "setClickListeners", "showError", "caught", "", "showProgressBar", "enable", "", "validateThenCreateAccount", "Companion", "ValidateResult", "app.lib"})
public final class CreateAccountActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityCreateAccountBinding binding;
    private org.wikipedia.captcha.CaptchaHandler captchaHandler;
    private org.wikipedia.analytics.eventplatform.CreateAccountEvent createAccountEvent;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.dataclient.WikiSite wiki;
    @org.jetbrains.annotations.Nullable()
    private android.text.TextWatcher userNameTextWatcher;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private static final int PASSWORD_MIN_LENGTH = 8;
    public static final int RESULT_ACCOUNT_CREATED = 1;
    public static final int RESULT_ACCOUNT_NOT_CREATED = 2;
    public static final int RESULT_ACCOUNT_LOGIN = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_REQUEST_SOURCE = "login_request_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_ACCOUNT_RESULT_USERNAME = "username";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_ACCOUNT_RESULT_PASSWORD = "password";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.regex.Pattern USERNAME_PATTERN = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.createaccount.CreateAccountActivity.Companion Companion = null;
    
    public CreateAccountActivity() {
        super();
    }
    
    private final org.wikipedia.createaccount.CreateAccountActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setClickListeners() {
    }
    
    private final void handleAccountCreationError(java.lang.String message) {
    }
    
    private final void doCreateAccount(java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void clearErrors() {
    }
    
    private final void validateThenCreateAccount() {
    }
    
    private final void createAccount() {
    }
    
    private final java.lang.String getText(com.google.android.material.textfield.TextInputLayout input) {
        return null;
    }
    
    private final void finishWithUserResult(java.lang.String userName) {
    }
    
    private final void showProgressBar(boolean enable) {
    }
    
    private final void showError(java.lang.Throwable caught) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity$Companion;", "", "()V", "CREATE_ACCOUNT_RESULT_PASSWORD", "", "CREATE_ACCOUNT_RESULT_USERNAME", "LOGIN_REQUEST_SOURCE", "PASSWORD_MIN_LENGTH", "", "RESULT_ACCOUNT_CREATED", "RESULT_ACCOUNT_LOGIN", "RESULT_ACCOUNT_NOT_CREATED", "USERNAME_PATTERN", "Ljava/util/regex/Pattern;", "getUSERNAME_PATTERN", "()Ljava/util/regex/Pattern;", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "validateInput", "Lorg/wikipedia/createaccount/CreateAccountActivity$ValidateResult;", "username", "", "password", "passwordRepeat", "email", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.regex.Pattern getUSERNAME_PATTERN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.createaccount.CreateAccountActivity.ValidateResult validateInput(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence username, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence password, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence passwordRepeat, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence email) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String source) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity$ValidateResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "INVALID_USERNAME", "PASSWORD_TOO_SHORT", "PASSWORD_IS_USERNAME", "PASSWORD_MISMATCH", "NO_EMAIL", "INVALID_EMAIL", "app.lib"})
    public static enum ValidateResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ INVALID_USERNAME /* = new INVALID_USERNAME() */,
        /*public static final*/ PASSWORD_TOO_SHORT /* = new PASSWORD_TOO_SHORT() */,
        /*public static final*/ PASSWORD_IS_USERNAME /* = new PASSWORD_IS_USERNAME() */,
        /*public static final*/ PASSWORD_MISMATCH /* = new PASSWORD_MISMATCH() */,
        /*public static final*/ NO_EMAIL /* = new NO_EMAIL() */,
        /*public static final*/ INVALID_EMAIL /* = new INVALID_EMAIL() */;
        
        ValidateResult() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.createaccount.CreateAccountActivity.ValidateResult> getEntries() {
            return null;
        }
    }
}