package org.wikipedia.bridge;

import android.content.Context;
import kotlinx.serialization.Serializable;
import org.wikipedia.BuildConfig;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.PageViewModel;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fJ\u000e\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\fJ&\u0010\'\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\fJ\u0016\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t\u00a8\u00060"}, d2 = {"Lorg/wikipedia/bridge/JavaScriptActionHandler;", "", "()V", "appendReadMode", "", "model", "Lorg/wikipedia/page/PageViewModel;", "expandCollapsedTables", "expand", "", "getElementAtPosition", "x", "", "y", "getOffsets", "getProtection", "getRevision", "getSections", "getTextSelection", "mobileWebChromeShim", "marginTop", "marginBottom", "mobileWebSetDarkMode", "pauseAllMedia", "prepareToScrollTo", "anchorLink", "highlight", "removeHighlights", "scrollToAnchor", "scrollToFooter", "context", "Landroid/content/Context;", "setFooter", "setMargins", "left", "top", "right", "bottom", "setTopMargin", "setUp", "title", "Lorg/wikipedia/page/PageTitle;", "isPreview", "toolbarMargin", "setUpEditButtons", "isEditable", "isProtected", "ImageHitInfo", "app.lib"})
public final class JavaScriptActionHandler {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.bridge.JavaScriptActionHandler INSTANCE = null;
    
    private JavaScriptActionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setTopMargin(int top) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setMargins(int left, int top, int right, int bottom) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextSelection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOffsets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProtection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRevision() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String expandCollapsedTables(boolean expand) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String scrollToFooter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String scrollToAnchor(@org.jetbrains.annotations.NotNull()
    java.lang.String anchorLink) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String prepareToScrollTo(@org.jetbrains.annotations.NotNull()
    java.lang.String anchorLink, boolean highlight) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeHighlights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setUp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean isPreview, int toolbarMargin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setUpEditButtons(boolean isEditable, boolean isProtected) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setFooter(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String appendReadMode(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String mobileWebChromeShim(int marginTop, int marginBottom) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String mobileWebSetDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getElementAtPosition(int x, int y) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String pauseAllMedia() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/bridge/JavaScriptActionHandler$ImageHitInfo;", "", "left", "", "top", "width", "height", "src", "", "(FFFFLjava/lang/String;)V", "getHeight", "()F", "getLeft", "getSrc", "()Ljava/lang/String;", "getTop", "getWidth", "app.lib"})
    public static final class ImageHitInfo {
        private final float left = 0.0F;
        private final float top = 0.0F;
        private final float width = 0.0F;
        private final float height = 0.0F;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String src = null;
        
        public ImageHitInfo(float left, float top, float width, float height, @org.jetbrains.annotations.NotNull()
        java.lang.String src) {
            super();
        }
        
        public final float getLeft() {
            return 0.0F;
        }
        
        public final float getTop() {
            return 0.0F;
        }
        
        public final float getWidth() {
            return 0.0F;
        }
        
        public final float getHeight() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSrc() {
            return null;
        }
        
        public ImageHitInfo() {
            super();
        }
    }
}