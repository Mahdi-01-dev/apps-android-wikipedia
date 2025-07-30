package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0010\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleInteractionEvent;", "Lorg/wikipedia/analytics/eventplatform/TimedEvent;", "wikiDb", "", "pageId", "", "(Ljava/lang/String;I)V", "logBackClick", "", "logCategoriesClick", "logContentsClick", "logEditArticleClick", "logEditHistoryArticleClick", "logEditHistoryClick", "logExploreClick", "logFindInArticleClick", "logForwardClick", "logLanguageClick", "logLoaded", "logMoreClick", "logNewTabClick", "logNotificationClick", "logSaveClick", "logSearchWikipediaClick", "logShareClick", "logTabsClick", "logTalkPageArticleClick", "logTalkPageClick", "logThemeClick", "logTocSwipe", "logUnWatchClick", "logWatchClick", "submitEvent", "action", "ArticleInteractionEventImpl", "app.lib"})
public final class ArticleInteractionEvent extends org.wikipedia.analytics.eventplatform.TimedEvent {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wikiDb = null;
    private final int pageId = 0;
    
    public ArticleInteractionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String wikiDb, int pageId) {
        super();
    }
    
    public final void logLoaded() {
    }
    
    public final void logSaveClick() {
    }
    
    public final void logLanguageClick() {
    }
    
    public final void logFindInArticleClick() {
    }
    
    public final void logThemeClick() {
    }
    
    public final void logContentsClick() {
    }
    
    public final void logMoreClick() {
    }
    
    public final void logShareClick() {
    }
    
    public final void logTalkPageClick() {
    }
    
    public final void logEditHistoryClick() {
    }
    
    public final void logNewTabClick() {
    }
    
    public final void logExploreClick() {
    }
    
    public final void logForwardClick() {
    }
    
    public final void logNotificationClick() {
    }
    
    public final void logTabsClick() {
    }
    
    public final void logSearchWikipediaClick() {
    }
    
    public final void logBackClick() {
    }
    
    public final void logEditHistoryArticleClick() {
    }
    
    public final void logTalkPageArticleClick() {
    }
    
    public final void logTocSwipe() {
    }
    
    public final void logCategoriesClick() {
    }
    
    public final void logWatchClick() {
    }
    
    public final void logUnWatchClick() {
    }
    
    public final void logEditArticleClick() {
    }
    
    private final void submitEvent(java.lang.String action) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_article_toolbar_interaction/1.0.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleInteractionEvent$ArticleInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "timeSpentMs", "", "wikiDb", "", "pageId", "action", "(ILjava/lang/String;ILjava/lang/String;)V", "getPageId$annotations", "()V", "getTimeSpentMs$annotations", "getWikiDb$annotations", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class ArticleInteractionEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
        private final int timeSpentMs = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String wikiDb = null;
        private final int pageId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = null;
        
        public ArticleInteractionEventImpl(int timeSpentMs, @org.jetbrains.annotations.NotNull()
        java.lang.String wikiDb, int pageId, @org.jetbrains.annotations.NotNull()
        java.lang.String action) {
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
}