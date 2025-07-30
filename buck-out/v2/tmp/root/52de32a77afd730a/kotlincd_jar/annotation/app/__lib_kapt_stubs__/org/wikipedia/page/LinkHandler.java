package org.wikipedia.page;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.bridge.CommunicationBridge.JSEventListener;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.LinkMovementMethodExt.UrlHandlerWithText;
import org.wikipedia.places.PlacesActivity;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\"\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/page/LinkHandler;", "Lorg/wikipedia/bridge/CommunicationBridge$JSEventListener;", "Lorg/wikipedia/page/LinkMovementMethodExt$UrlHandlerWithText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onExternalLinkClicked", "uri", "Landroid/net/Uri;", "onInternalLinkClicked", "onMediaLinkClicked", "onMessage", "messageType", "", "messagePayload", "Lkotlinx/serialization/json/JsonObject;", "onPageLinkClicked", "anchor", "linkText", "onUrlClick", "url", "titleString", "Companion", "app.lib"})
public abstract class LinkHandler implements org.wikipedia.bridge.CommunicationBridge.JSEventListener, org.wikipedia.page.LinkMovementMethodExt.UrlHandlerWithText {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> KNOWN_SCHEMES = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.LinkHandler.Companion Companion = null;
    
    public LinkHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getContext() {
        return null;
    }
    
    public void onPageLinkClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String anchor, @org.jetbrains.annotations.NotNull()
    java.lang.String linkText) {
    }
    
    public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, long revisionId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.dataclient.WikiSite getWikiSite();
    
    public abstract void setWikiSite(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite p0);
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String messageType, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonObject messagePayload) {
    }
    
    @java.lang.Override()
    public void onUrlClick(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String titleString, @org.jetbrains.annotations.NotNull()
    java.lang.String linkText) {
    }
    
    public void onExternalLinkClicked(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/LinkHandler$Companion;", "", "()V", "KNOWN_SCHEMES", "", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}