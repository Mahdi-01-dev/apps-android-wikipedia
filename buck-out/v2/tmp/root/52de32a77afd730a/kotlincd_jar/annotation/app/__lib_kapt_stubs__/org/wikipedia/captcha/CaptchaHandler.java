package org.wikipedia.captcha;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import org.wikipedia.R;
import org.wikipedia.databinding.GroupCaptchaBinding;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.ViewAnimations;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u0004\u0018\u00010\nJ\b\u0010 \u001a\u0004\u0018\u00010\nJ\u0006\u0010!\u001a\u00020\u001eJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\rH\u0002J\u0018\u0010\"\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010$\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u001eJ\u0012\u0010&\u001a\u00020\u001e2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\nJ\u0006\u0010(\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lorg/wikipedia/captcha/CaptchaHandler;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "captchaView", "Landroid/view/View;", "primaryView", "prevTitle", "", "submitButtonText", "isModal", "", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/dataclient/WikiSite;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Z)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "captchaResult", "Lorg/wikipedia/captcha/CaptchaResult;", "clientJob", "Lkotlinx/coroutines/Job;", "isActive", "()Z", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "cancelCaptcha", "", "captchaId", "captchaWord", "dispose", "handleCaptcha", "isReload", "hideCaptcha", "requestNewCaptcha", "setErrorText", "text", "setFocus", "app.lib"})
public final class CaptchaHandler {
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View primaryView = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prevTitle = null;
    private final boolean isModal = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.captcha.CaptchaResult captchaResult;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token;
    
    public CaptchaHandler(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    android.view.View captchaView, @org.jetbrains.annotations.NotNull()
    android.view.View primaryView, @org.jetbrains.annotations.NotNull()
    java.lang.String prevTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String submitButtonText, boolean isModal) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String captchaId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String captchaWord() {
        return null;
    }
    
    public final void dispose() {
    }
    
    public final void handleCaptcha(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    org.wikipedia.captcha.CaptchaResult captchaResult) {
    }
    
    public final void requestNewCaptcha() {
    }
    
    private final void handleCaptcha(boolean isReload) {
    }
    
    public final void hideCaptcha() {
    }
    
    public final void cancelCaptcha() {
    }
    
    public final void setErrorText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setFocus() {
    }
}