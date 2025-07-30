package org.wikipedia.util;

import android.content.Context;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.createaccount.CreateAccountException;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import org.wikipedia.login.LoginFailedException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002$%B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0002J(\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0002J\u001c\u0010!\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/util/ThrowableUtil;", "", "()V", "getAppError", "Lorg/wikipedia/util/ThrowableUtil$AppError;", "context", "Landroid/content/Context;", "e", "", "getBlockMessageHtml", "", "blockInfo", "Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;Lorg/wikipedia/dataclient/WikiSite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInnermostThrowable", "is404", "", "caught", "isEmptyException", "isNetworkError", "isNotLoggedIn", "t", "isOffline", "isTimeout", "parseBlockedDate", "dateStr", "parseBlockedError", "template", "info", "reason", "userName", "throwableContainsException", "exClass", "Ljava/lang/Class;", "AppError", "EmptyException", "app.lib"})
@kotlin.Suppress(names = {"SameParameterValue"})
public final class ThrowableUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.ThrowableUtil INSTANCE = null;
    
    private ThrowableUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Throwable getInnermostThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        return null;
    }
    
    private final boolean throwableContainsException(java.lang.Throwable e, java.lang.Class<?> exClass) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.ThrowableUtil.AppError getAppError(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        return null;
    }
    
    public final boolean isOffline(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
        return false;
    }
    
    public final boolean isTimeout(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
        return false;
    }
    
    public final boolean is404(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable caught) {
        return false;
    }
    
    public final boolean isEmptyException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable caught) {
        return false;
    }
    
    public final boolean isNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        return false;
    }
    
    public final boolean isNotLoggedIn(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBlockMessageHtml(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo blockInfo, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final java.lang.String parseBlockedError(java.lang.String template, org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo info, java.lang.String reason, java.lang.String userName) {
        return null;
    }
    
    private final java.lang.String parseBlockedDate(java.lang.String dateStr) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/util/ThrowableUtil$AppError;", "", "error", "", "detail", "(Ljava/lang/String;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "getError", "app.lib"})
    public static final class AppError {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String detail = null;
        
        public AppError(@org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        java.lang.String detail) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDetail() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/util/ThrowableUtil$EmptyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app.lib"})
    public static final class EmptyException extends java.lang.Exception {
        
        public EmptyException() {
            super();
        }
    }
}