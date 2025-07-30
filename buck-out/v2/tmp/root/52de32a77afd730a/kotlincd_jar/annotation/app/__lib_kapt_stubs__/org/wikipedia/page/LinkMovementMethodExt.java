package org.wikipedia.page;

import android.net.Uri;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/page/LinkMovementMethodExt;", "Landroid/text/method/LinkMovementMethod;", "handler", "Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandler;", "(Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandler;)V", "Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithText;", "(Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithText;)V", "Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithTextAndCoords;", "(Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithTextAndCoords;)V", "handlerWithText", "handlerWithTextAndCoords", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "Companion", "ErrorLinkHandler", "UrlHandler", "UrlHandlerWithText", "UrlHandlerWithTextAndCoords", "app.lib"})
public final class LinkMovementMethodExt extends android.text.method.LinkMovementMethod {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.LinkMovementMethodExt.UrlHandler handler;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.LinkMovementMethodExt.UrlHandlerWithText handlerWithText;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.LinkMovementMethodExt.UrlHandlerWithTextAndCoords handlerWithTextAndCoords;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.LinkMovementMethodExt.Companion Companion = null;
    
    public LinkMovementMethodExt(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.LinkMovementMethodExt.UrlHandler handler) {
        super();
    }
    
    public LinkMovementMethodExt(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.LinkMovementMethodExt.UrlHandlerWithText handler) {
        super();
    }
    
    public LinkMovementMethodExt(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.LinkMovementMethodExt.UrlHandlerWithTextAndCoords handler) {
        super();
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.widget.TextView widget, @org.jetbrains.annotations.NotNull()
    android.text.Spannable buffer, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/LinkMovementMethodExt$Companion;", "", "()V", "getExternalLinkMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.LinkMovementMethodExt getExternalLinkMovementMethod(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/page/LinkMovementMethodExt$ErrorLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;)V", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onInternalLinkClicked", "onMediaLinkClicked", "onPageLinkClicked", "anchor", "", "linkText", "app.lib"})
    public static final class ErrorLinkHandler extends org.wikipedia.page.LinkHandler {
        @org.jetbrains.annotations.NotNull()
        private org.wikipedia.dataclient.WikiSite wikiSite;
        
        public ErrorLinkHandler(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.dataclient.WikiSite getWikiSite() {
            return null;
        }
        
        @java.lang.Override()
        public void setWikiSite(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite p0) {
        }
        
        @java.lang.Override()
        public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
        
        @java.lang.Override()
        public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long revisionId) {
        }
        
        @java.lang.Override()
        public void onPageLinkClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String anchor, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText) {
        }
        
        @java.lang.Override()
        public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandler;", "", "onUrlClick", "", "url", "", "app.lib"})
    public static abstract interface UrlHandler {
        
        public abstract void onUrlClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithText;", "", "onUrlClick", "", "url", "", "titleString", "linkText", "app.lib"})
    public static abstract interface UrlHandlerWithText {
        
        public abstract void onUrlClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String titleString, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithTextAndCoords;", "", "onUrlClick", "", "url", "", "titleString", "linkText", "x", "", "y", "app.lib"})
    public static abstract interface UrlHandlerWithTextAndCoords {
        
        public abstract void onUrlClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String titleString, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText, int x, int y);
    }
}