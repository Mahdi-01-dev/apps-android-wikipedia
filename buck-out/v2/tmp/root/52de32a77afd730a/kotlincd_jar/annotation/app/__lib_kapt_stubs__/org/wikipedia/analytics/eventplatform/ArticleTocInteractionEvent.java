package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleTocInteractionEvent;", "", "pageId", "", "wikiDb", "", "numSections", "(ILjava/lang/String;I)V", "lastScrollStartMillis", "", "numOpens", "numSectionClicks", "totalOpenedSec", "logClick", "", "logEvent", "scrollStart", "scrollStop", "ArticleTocInteractionEventImpl", "app.lib"})
public final class ArticleTocInteractionEvent {
    private final int pageId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wikiDb = null;
    private final int numSections = 0;
    private int numOpens = 0;
    private int numSectionClicks = 0;
    private long lastScrollStartMillis = 0L;
    private int totalOpenedSec = 0;
    
    public ArticleTocInteractionEvent(int pageId, @org.jetbrains.annotations.NotNull()
    java.lang.String wikiDb, int numSections) {
        super();
    }
    
    public final void scrollStart() {
    }
    
    public final void scrollStop() {
    }
    
    public final void logClick() {
    }
    
    public final void logEvent() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_article_toc_interaction/1.0.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nR\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleTocInteractionEvent$ArticleTocInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "wikiDb", "", "pageId", "", "numberOfOpens", "numberOfSectionClicks", "totalOpenSec", "numSections", "(Ljava/lang/String;IIIII)V", "getNumSections$annotations", "()V", "getNumberOfOpens$annotations", "getNumberOfSectionClicks$annotations", "getPageId$annotations", "getTotalOpenSec$annotations", "getWikiDb$annotations", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class ArticleTocInteractionEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String wikiDb = null;
        private final int pageId = 0;
        private final int numberOfOpens = 0;
        private final int numberOfSectionClicks = 0;
        private final int totalOpenSec = 0;
        private final int numSections = 0;
        
        public ArticleTocInteractionEventImpl(@org.jetbrains.annotations.NotNull()
        java.lang.String wikiDb, int pageId, int numberOfOpens, int numberOfSectionClicks, int totalOpenSec, int numSections) {
        }
        
        @kotlinx.serialization.SerialName(value = "wiki_db")
        @java.lang.Deprecated()
        private static void getWikiDb$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "page_id")
        @java.lang.Deprecated()
        private static void getPageId$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "num_opens")
        @java.lang.Deprecated()
        private static void getNumberOfOpens$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "num_section_clicks")
        @java.lang.Deprecated()
        private static void getNumberOfSectionClicks$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "total_open_sec")
        @java.lang.Deprecated()
        private static void getTotalOpenSec$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "num_sections")
        @java.lang.Deprecated()
        private static void getNumSections$annotations() {
        }
    }
}