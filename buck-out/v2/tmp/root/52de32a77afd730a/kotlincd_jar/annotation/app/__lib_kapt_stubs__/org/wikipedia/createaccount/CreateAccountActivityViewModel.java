package org.wikipedia.createaccount;

import androidx.lifecycle.ViewModel;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003%&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J@\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_createAccountInfoState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState;", "_doCreateAccountState", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$CreateAccountState;", "_verifyUserNameState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState;", "createAccountInfoState", "Lkotlinx/coroutines/flow/StateFlow;", "getCreateAccountInfoState", "()Lkotlinx/coroutines/flow/StateFlow;", "doCreateAccountState", "getDoCreateAccountState", "verifyUserNameJob", "Lkotlinx/coroutines/Job;", "verifyUserNameState", "Lkotlinx/coroutines/flow/SharedFlow;", "getVerifyUserNameState", "()Lkotlinx/coroutines/flow/SharedFlow;", "createAccountInfo", "", "doCreateAccount", "token", "", "captchaId", "captchaWord", "userName", "password", "repeat", "email", "verifyUserName", "text", "", "AccountInfoState", "CreateAccountState", "UserNameState", "app.lib"})
public final class CreateAccountActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState> _createAccountInfoState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState> createAccountInfoState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState> _doCreateAccountState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState> doCreateAccountState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState> _verifyUserNameState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState> verifyUserNameState = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job verifyUserNameJob;
    
    public CreateAccountActivityViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState> getCreateAccountInfoState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState> getDoCreateAccountState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState> getVerifyUserNameState() {
        return null;
    }
    
    public final void createAccountInfo() {
    }
    
    public final void doCreateAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String captchaId, @org.jetbrains.annotations.NotNull()
    java.lang.String captchaWord, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String repeat, @org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    public final void verifyUserName(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState;", "", "()V", "DoCreateAccount", "Error", "HandleCaptcha", "InvalidToken", "app.lib"})
    public static class AccountInfoState {
        
        public AccountInfoState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState$DoCreateAccount;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState;", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app.lib"})
        public static final class DoCreateAccount extends org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String token = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState.DoCreateAccount copy(@org.jetbrains.annotations.NotNull()
            java.lang.String token) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public DoCreateAccount(@org.jetbrains.annotations.NotNull()
            java.lang.String token) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getToken() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState$Error;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class Error extends org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState$HandleCaptcha;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState;", "token", "", "captchaId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCaptchaId", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app.lib"})
        public static final class HandleCaptcha extends org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String token = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String captchaId = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState.HandleCaptcha copy(@org.jetbrains.annotations.Nullable()
            java.lang.String token, @org.jetbrains.annotations.NotNull()
            java.lang.String captchaId) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public HandleCaptcha(@org.jetbrains.annotations.Nullable()
            java.lang.String token, @org.jetbrains.annotations.NotNull()
            java.lang.String captchaId) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getToken() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCaptchaId() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState$InvalidToken;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$AccountInfoState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class InvalidToken extends org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.createaccount.CreateAccountActivityViewModel.AccountInfoState.InvalidToken INSTANCE = null;
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            private InvalidToken() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$CreateAccountState;", "", "()V", "Error", "Pass", "app.lib"})
    public static class CreateAccountState {
        
        public CreateAccountState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$CreateAccountState$Error;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$CreateAccountState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class Error extends org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$CreateAccountState$Pass;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$CreateAccountState;", "userName", "", "(Ljava/lang/String;)V", "getUserName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app.lib"})
        public static final class Pass extends org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String userName = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.CreateAccountState.Pass copy(@org.jetbrains.annotations.NotNull()
            java.lang.String userName) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public Pass(@org.jetbrains.annotations.NotNull()
            java.lang.String userName) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUserName() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState;", "", "()V", "Blocked", "CannotCreate", "Initial", "Success", "app.lib"})
    public static class UserNameState {
        
        public UserNameState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState$Blocked;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app.lib"})
        public static final class Blocked extends org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState.Blocked copy(@org.jetbrains.annotations.NotNull()
            java.lang.String error) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public Blocked(@org.jetbrains.annotations.NotNull()
            java.lang.String error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getError() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState$CannotCreate;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState;", "userName", "", "(Ljava/lang/String;)V", "getUserName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app.lib"})
        public static final class CannotCreate extends org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String userName = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState.CannotCreate copy(@org.jetbrains.annotations.NotNull()
            java.lang.String userName) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public CannotCreate(@org.jetbrains.annotations.NotNull()
            java.lang.String userName) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUserName() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState$Initial;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class Initial extends org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState.Initial INSTANCE = null;
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            private Initial() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState$Success;", "Lorg/wikipedia/createaccount/CreateAccountActivityViewModel$UserNameState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class Success extends org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.createaccount.CreateAccountActivityViewModel.UserNameState.Success INSTANCE = null;
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            private Success() {
                super();
            }
        }
    }
}