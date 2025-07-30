package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewWikiErrorBinding;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u001c\u0010+\u001a\u00020,2\b\u0010\'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*J\u000e\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010/\u001a\u00020,2\u0006\u0010.\u001a\u00020\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u0011\u0010#\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0014\u00a8\u00061"}, d2 = {"Lorg/wikipedia/views/WikiErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backClickListener", "Landroid/view/View$OnClickListener;", "getBackClickListener", "()Landroid/view/View$OnClickListener;", "setBackClickListener", "(Landroid/view/View$OnClickListener;)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "setBinding", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "contentTopOffset", "getContentTopOffset", "loginClickListener", "getLoginClickListener", "setLoginClickListener", "nextClickListener", "getNextClickListener", "setNextClickListener", "retryClickListener", "getRetryClickListener", "setRetryClickListener", "tabLayoutOffset", "getTabLayoutOffset", "getErrorType", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "caught", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "setError", "", "setErrorTextColor", "color", "setIconColorFilter", "ErrorType", "app.lib"})
public final class WikiErrorView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener retryClickListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener backClickListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener nextClickListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener loginClickListener;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getRetryClickListener() {
        return null;
    }
    
    public final void setRetryClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getBackClickListener() {
        return null;
    }
    
    public final void setBackClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getNextClickListener() {
        return null;
    }
    
    public final void setNextClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getLoginClickListener() {
        return null;
    }
    
    public final void setLoginClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getContentTopOffset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTabLayoutOffset() {
        return null;
    }
    
    public WikiErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public WikiErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public WikiErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    public final void setIconColorFilter(int color) {
    }
    
    public final void setErrorTextColor(int color) {
    }
    
    private final org.wikipedia.views.WikiErrorView.ErrorType getErrorType(java.lang.Throwable caught, org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType;", "", "icon", "", "text", "buttonText", "footerText", "(Ljava/lang/String;IIIII)V", "getButtonText", "()I", "getFooterText", "hasFooterText", "", "getHasFooterText", "()Z", "getIcon", "getText", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "USER_PAGE_MISSING", "PAGE_MISSING", "TIMEOUT", "OFFLINE", "EMPTY", "LOGGED_OUT", "GENERIC", "app.lib"})
    public static enum ErrorType {
        /*public static final*/ USER_PAGE_MISSING /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$USER_PAGE_MISSING;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) USER_PAGE_MISSING(0, 0, 0, 0){
    
    USER_PAGE_MISSING() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ PAGE_MISSING /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$PAGE_MISSING;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) PAGE_MISSING(0, 0, 0, 0){
    
    PAGE_MISSING() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ TIMEOUT /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$TIMEOUT;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) TIMEOUT(0, 0, 0, 0){
    
    TIMEOUT() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ OFFLINE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$OFFLINE;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) OFFLINE(0, 0, 0, 0){
    
    OFFLINE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ EMPTY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$EMPTY;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) EMPTY(0, 0, 0, 0){
    
    EMPTY() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ LOGGED_OUT /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$LOGGED_OUT;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) LOGGED_OUT(0, 0, 0, 0){
    
    LOGGED_OUT() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ GENERIC /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$GENERIC;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app.lib"}) GENERIC(0, 0, 0, 0){
    
    GENERIC() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */;
        private final int icon = 0;
        private final int text = 0;
        private final int buttonText = 0;
        private final int footerText = 0;
        
        ErrorType(@androidx.annotation.DrawableRes()
        int icon, @androidx.annotation.StringRes()
        int text, @androidx.annotation.StringRes()
        int buttonText, @androidx.annotation.StringRes()
        int footerText) {
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final int getText() {
            return 0;
        }
        
        public final int getButtonText() {
            return 0;
        }
        
        public final int getFooterText() {
            return 0;
        }
        
        public final boolean getHasFooterText() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public abstract android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.WikiErrorView errorView);
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.views.WikiErrorView.ErrorType> getEntries() {
            return null;
        }
    }
}