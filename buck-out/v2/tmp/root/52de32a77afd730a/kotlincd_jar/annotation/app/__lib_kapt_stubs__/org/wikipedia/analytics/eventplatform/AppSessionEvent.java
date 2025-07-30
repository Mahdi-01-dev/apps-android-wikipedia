package org.wikipedia.analytics.eventplatform;

import android.text.format.DateUtils;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.SessionData;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/AppSessionEvent;", "", "()V", "pageLoadStartTime", "", "sessionData", "Lorg/wikipedia/analytics/SessionData;", "backPressed", "", "hasTimedOut", "", "logSessionData", "noDescription", "pageFetchEnd", "pageFetchStart", "pageViewed", "entry", "Lorg/wikipedia/history/HistoryEntry;", "persistSession", "touchSession", "AppSessionEventImpl", "Companion", "app.lib"})
public final class AppSessionEvent {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.analytics.SessionData sessionData;
    private long pageLoadStartTime = 0L;
    
    /**
     * Definition of a "session timeout", as agreed upon by the Apps and Analytics teams.
     * (currently 30 minutes)
     */
    public static final int DEFAULT_SESSION_TIMEOUT = 30;
    public static final int MIN_SESSION_TIMEOUT = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.AppSessionEvent.Companion Companion = null;
    
    public AppSessionEvent() {
        super();
    }
    
    /**
     * Save the state of the current session. To be called when the main Activity is stopped,
     * so that we don't have to save its state every time a single parameter is modified.
     */
    public final void persistSession() {
    }
    
    /**
     * Update the timestamp for the current session. If the last-updated time is older than the
     * defined timeout period, then consider the current session as over, and send the event!
     */
    public final void touchSession() {
    }
    
    public final void pageViewed(@org.jetbrains.annotations.Nullable()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void backPressed() {
    }
    
    public final void noDescription() {
    }
    
    public final void pageFetchStart() {
    }
    
    public final void pageFetchEnd() {
    }
    
    private final boolean hasTimedOut() {
        return false;
    }
    
    private final void logSessionData() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/app_session/1.1.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/AppSessionEvent$AppSessionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "length", "", "sessionData", "Lorg/wikipedia/analytics/SessionData;", "languages", "", "", "(ILorg/wikipedia/analytics/SessionData;Ljava/util/List;)V", "getLength$annotations", "()V", "getSessionData$annotations", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class AppSessionEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEventWithTemp {
        private final int length = 0;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.analytics.SessionData sessionData = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> languages = null;
        
        public AppSessionEventImpl(int length, @org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.SessionData sessionData, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> languages) {
        }
        
        @kotlinx.serialization.SerialName(value = "length_ms")
        @java.lang.Deprecated()
        private static void getLength$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "session_data")
        @java.lang.Deprecated()
        private static void getSessionData$annotations() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/AppSessionEvent$Companion;", "", "()V", "DEFAULT_SESSION_TIMEOUT", "", "MIN_SESSION_TIMEOUT", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}