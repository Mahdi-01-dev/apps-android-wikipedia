package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleFindInPageInteractionEvent;", "Lorg/wikipedia/analytics/eventplatform/TimedEvent;", "pageId", "", "(I)V", "findText", "", "getFindText", "()Ljava/lang/String;", "setFindText", "(Ljava/lang/String;)V", "numFindNext", "numFindPrev", "pageHeight", "getPageHeight", "()I", "setPageHeight", "addFindNext", "", "addFindPrev", "logDone", "ArticleFindInPageInteractionEventImpl", "app.lib"})
public final class ArticleFindInPageInteractionEvent extends org.wikipedia.analytics.eventplatform.TimedEvent {
    private final int pageId = 0;
    private int numFindNext = 0;
    private int numFindPrev = 0;
    private int pageHeight = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String findText = "";
    
    public ArticleFindInPageInteractionEvent(int pageId) {
        super();
    }
    
    public final int getPageHeight() {
        return 0;
    }
    
    public final void setPageHeight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFindText() {
        return null;
    }
    
    public final void setFindText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void addFindNext() {
    }
    
    public final void addFindPrev() {
    }
    
    public final void logDone() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_find_in_page_interaction/1.0.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ArticleFindInPageInteractionEvent$ArticleFindInPageInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "pageId", "", "findText", "", "findNextClicksCount", "findPrevClicksCount", "pageHeight", "timeSpentMs", "(ILjava/lang/String;IIII)V", "getFindNextClicksCount$annotations", "()V", "getFindPrevClicksCount$annotations", "getFindText$annotations", "getPageHeight$annotations", "getPageId$annotations", "getTimeSpentMs$annotations", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class ArticleFindInPageInteractionEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
        private final int pageId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String findText = null;
        private final int findNextClicksCount = 0;
        private final int findPrevClicksCount = 0;
        private final int pageHeight = 0;
        private final int timeSpentMs = 0;
        
        public ArticleFindInPageInteractionEventImpl(int pageId, @org.jetbrains.annotations.NotNull()
        java.lang.String findText, int findNextClicksCount, int findPrevClicksCount, int pageHeight, int timeSpentMs) {
        }
        
        @kotlinx.serialization.SerialName(value = "page_id")
        @java.lang.Deprecated()
        private static void getPageId$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "find_text")
        @java.lang.Deprecated()
        private static void getFindText$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "find_next_clicks_count")
        @java.lang.Deprecated()
        private static void getFindNextClicksCount$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "find_prev_clicks_count")
        @java.lang.Deprecated()
        private static void getFindPrevClicksCount$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "page_height")
        @java.lang.Deprecated()
        private static void getPageHeight$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "time_spent_ms")
        @java.lang.Deprecated()
        private static void getTimeSpentMs$annotations() {
        }
    }
}