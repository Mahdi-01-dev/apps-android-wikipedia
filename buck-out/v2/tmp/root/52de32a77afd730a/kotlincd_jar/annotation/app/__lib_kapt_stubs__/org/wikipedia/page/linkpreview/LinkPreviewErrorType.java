package org.wikipedia.page.linkpreview;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.ThrowableUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType;", "", "icon", "", "text", "buttonText", "(Ljava/lang/String;IIII)V", "getButtonText", "()I", "getIcon", "getText", "buttonAction", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "errorView", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;", "OFFLINE", "PAGE_MISSING", "USER_PAGE_MISSING", "GENERIC", "Companion", "app.lib"})
public enum LinkPreviewErrorType {
    /*public static final*/ OFFLINE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType$OFFLINE;", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType;", "buttonAction", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "errorView", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;", "app.lib"}) OFFLINE(0, 0, 0){
    
    OFFLINE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback buttonAction(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.linkpreview.LinkPreviewErrorView errorView) {
        return null;
    }
} */,
    /*public static final*/ PAGE_MISSING /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType$PAGE_MISSING;", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType;", "buttonAction", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "errorView", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;", "app.lib"}) PAGE_MISSING(0, 0, 0){
    
    PAGE_MISSING() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback buttonAction(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.linkpreview.LinkPreviewErrorView errorView) {
        return null;
    }
} */,
    /*public static final*/ USER_PAGE_MISSING /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType$USER_PAGE_MISSING;", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType;", "buttonAction", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "errorView", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;", "app.lib"}) USER_PAGE_MISSING(0, 0, 0){
    
    USER_PAGE_MISSING() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback buttonAction(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.linkpreview.LinkPreviewErrorView errorView) {
        return null;
    }
} */,
    /*public static final*/ GENERIC /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType$GENERIC;", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType;", "buttonAction", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "errorView", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;", "app.lib"}) GENERIC(0, 0, 0){
    
    GENERIC() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback buttonAction(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.linkpreview.LinkPreviewErrorView errorView) {
        return null;
    }
} */;
    private final int icon = 0;
    private final int text = 0;
    private final int buttonText = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.linkpreview.LinkPreviewErrorType.Companion Companion = null;
    
    LinkPreviewErrorType(@androidx.annotation.DrawableRes()
    int icon, @androidx.annotation.StringRes()
    int text, @androidx.annotation.StringRes()
    int buttonText) {
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
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback buttonAction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.linkpreview.LinkPreviewErrorView errorView);
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.page.linkpreview.LinkPreviewErrorType> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\u0002\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType$Companion;", "", "()V", "get", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorType;", "caught", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.linkpreview.LinkPreviewErrorType get(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle) {
            return null;
        }
    }
}