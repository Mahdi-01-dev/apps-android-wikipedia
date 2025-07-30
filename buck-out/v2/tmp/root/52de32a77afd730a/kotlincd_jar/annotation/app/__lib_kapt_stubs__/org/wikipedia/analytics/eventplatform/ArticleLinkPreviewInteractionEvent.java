package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleLinkPreviewInteractionEvent;", "Lorg/wikipedia/analytics/eventplatform/TimedEvent;", "wikiDb", "", "pageId", "", "source", "(Ljava/lang/String;II)V", "logCancel", "", "logLinkClick", "logNavigate", "submitEvent", "action", "ArticleLinkPreviewInteractionEventImpl", "Companion", "app.lib"})
public final class ArticleLinkPreviewInteractionEvent extends org.wikipedia.analytics.eventplatform.TimedEvent {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wikiDb = null;
    private final int pageId = 0;
    private final int source = 0;
    private static final int PROD_LINK_PREVIEW_VERSION = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.ArticleLinkPreviewInteractionEvent.Companion Companion = null;
    
    public ArticleLinkPreviewInteractionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String wikiDb, int pageId, int source) {
        super();
    }
    
    public final void logLinkClick() {
    }
    
    public final void logNavigate() {
    }
    
    public final void logCancel() {
    }
    
    private final void submitEvent(java.lang.String action) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_article_link_preview_interaction/1.0.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\fR\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleLinkPreviewInteractionEvent$ArticleLinkPreviewInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "action", "", "source", "", "timeSpentMs", "wikiDb", "pageId", "version", "(Ljava/lang/String;IILjava/lang/String;II)V", "getPageId$annotations", "()V", "getTimeSpentMs$annotations", "getWikiDb$annotations", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class ArticleLinkPreviewInteractionEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = null;
        private final int source = 0;
        private final int timeSpentMs = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String wikiDb = null;
        private final int pageId = 0;
        private final int version = 0;
        
        public ArticleLinkPreviewInteractionEventImpl(@org.jetbrains.annotations.NotNull()
        java.lang.String action, int source, int timeSpentMs, @org.jetbrains.annotations.NotNull()
        java.lang.String wikiDb, int pageId, int version) {
        }
        
        @kotlinx.serialization.SerialName(value = "time_spent_ms")
        @java.lang.Deprecated()
        private static void getTimeSpentMs$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "wiki_db")
        @java.lang.Deprecated()
        private static void getWikiDb$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "page_id")
        @java.lang.Deprecated()
        private static void getPageId$annotations() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleLinkPreviewInteractionEvent$Companion;", "", "()V", "PROD_LINK_PREVIEW_VERSION", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}