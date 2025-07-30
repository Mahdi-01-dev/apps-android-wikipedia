package org.wikipedia.analytics.eventplatform;

import android.widget.Toast;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.BuildConfig;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.log.L;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u001f !B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u001c\u0010\u001c\u001a\u00020\u000f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventPlatformClient;", "", "()V", "ENABLED", "", "INITIAL_QUEUE", "", "Lorg/wikipedia/analytics/eventplatform/Event;", "STREAM_CONFIGS", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "doSubmit", "", "event", "flushCachedEvents", "getStreamConfig", "name", "refreshStreamConfigs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEnabled", "enabled", "setStreamConfig", "streamConfig", "setUpStreamConfigs", "submit", "updateStreamConfigs", "streamConfigs", "", "AssociationController", "OutputBuffer", "SamplingController", "app.lib"})
public final class EventPlatformClient {
    
    /**
     * Stream configs to be fetched on startup and stored for the duration of the app lifecycle.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> STREAM_CONFIGS = null;
    
    /**
     * List of events that will be queued before the first time that stream configs are fetched.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.analytics.eventplatform.Event> INITIAL_QUEUE = null;
    private static boolean ENABLED;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.EventPlatformClient INSTANCE = null;
    
    private EventPlatformClient() {
        super();
    }
    
    public final void setStreamConfig(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.StreamConfig streamConfig) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.analytics.eventplatform.StreamConfig getStreamConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    /**
     * Set whether the client is enabled. This can react to device online/offline state as well
     * as other considerations.
     */
    public final void setEnabled(boolean enabled) {
    }
    
    /**
     * Submit an event to be enqueued and sent to the Event Platform
     *
     * @param event event
     */
    public final void submit(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.Event event) {
    }
    
    private final void doSubmit(org.wikipedia.analytics.eventplatform.Event event) {
    }
    
    public final void flushCachedEvents() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshStreamConfigs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void updateStreamConfigs(java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> streamConfigs) {
    }
    
    public final void setUpStreamConfigs() {
    }
    
    /**
     * AssociationController: provides associative identifiers and manage their
     * persistence
     *
     * Identifiers correspond to various scopes e.g. 'pageview', 'session', and 'device'.
     *
     * TODO: Possibly get rid of the pageview type?  Does it make sense on apps?  It is not in the iOS library currently.
     * On apps, a "session" starts when the app is loaded, and ends when completely closed, or after 15 minutes of inactivity
     * Save a ts when going into bg, then when returning to foreground, & if it's been more than 15 mins, start a new session, else continue session from before
     * Possible to query/track time since last interaction? (For future)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventPlatformClient$AssociationController;", "", "()V", "PAGEVIEW_ID", "", "SESSION_ID", "pageViewId", "getPageViewId", "()Ljava/lang/String;", "sessionId", "getSessionId", "beginNewPageView", "", "beginNewSession", "generateRandomId", "app.lib"})
    public static final class AssociationController {
        @org.jetbrains.annotations.Nullable()
        private static java.lang.String PAGEVIEW_ID;
        @org.jetbrains.annotations.Nullable()
        private static java.lang.String SESSION_ID;
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.EventPlatformClient.AssociationController INSTANCE = null;
        
        private AssociationController() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPageViewId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        public final void beginNewSession() {
        }
        
        public final void beginNewPageView() {
        }
        
        /**
         * @return a string of 20 zero-padded hexadecimal digits representing a uniformly random
         * 80-bit integer
         */
        private final java.lang.String generateRandomId() {
            return null;
        }
    }
    
    /**
     * OutputBuffer: buffers events in a queue prior to transmission
     *
     * Transmissions are not sent at a uniform offset but are shaped into
     * 'bursts' using a combination of queue size and debounce time.
     *
     * These concentrate requests (and hence, theoretically, radio awake state)
     * so as not to contribute to battery drain.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\"\u0010\u0011\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u000fJ\u001e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventPlatformClient$OutputBuffer;", "", "()V", "MAX_QUEUE_SIZE", "", "getMAX_QUEUE_SIZE", "()I", "QUEUE", "", "Lorg/wikipedia/analytics/eventplatform/Event;", "TOKEN", "", "WAIT_MS", "", "schedule", "", "event", "send", "eventsByStream", "", "", "sendAllScheduled", "sendEventsForStream", "streamConfig", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "events", "app.lib"})
    public static final class OutputBuffer {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.List<org.wikipedia.analytics.eventplatform.Event> QUEUE = null;
        private static final long WAIT_MS = 30000L;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String TOKEN = "sendScheduled";
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.EventPlatformClient.OutputBuffer INSTANCE = null;
        
        private OutputBuffer() {
            super();
        }
        
        private final int getMAX_QUEUE_SIZE() {
            return 0;
        }
        
        public final void sendAllScheduled() {
        }
        
        /**
         * Schedule a request to be sent.
         *
         * @param event event data
         */
        public final void schedule(@org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.eventplatform.Event event) {
        }
        
        /**
         * If sending is enabled, attempt to send the provided events.
         * Also batch the events ordered by their streams, as the QUEUE
         * can contain events of different streams
         */
        private final void send(java.util.Map<java.lang.String, ? extends java.util.List<? extends org.wikipedia.analytics.eventplatform.Event>> eventsByStream) {
        }
        
        private final void sendEventsForStream(org.wikipedia.analytics.eventplatform.StreamConfig streamConfig, java.util.List<? extends org.wikipedia.analytics.eventplatform.Event> events) {
        }
    }
    
    /**
     * SamplingController: computes various sampling functions on the client
     *
     * Sampling is based on associative identifiers, each of which have a
     * well-defined scope, and sampling config, which each stream provides as
     * part of its configuration.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventPlatformClient$SamplingController;", "", "()V", "SAMPLING_CACHE", "", "", "", "getSamplingId", "unit", "getSamplingValue", "", "isInSample", "event", "Lorg/wikipedia/analytics/eventplatform/Event;", "app.lib"})
    public static final class SamplingController {
        @org.jetbrains.annotations.NotNull()
        private static java.util.Map<java.lang.String, java.lang.Boolean> SAMPLING_CACHE;
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.EventPlatformClient.SamplingController INSTANCE = null;
        
        private SamplingController() {
            super();
        }
        
        /**
         * @param event event
         * @return true if in sample or false otherwise
         */
        public final boolean isInSample(@org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.eventplatform.Event event) {
            return false;
        }
        
        /**
         * @param unit Unit type from sampling config
         * @return a floating point value between 0.0 and 1.0 (inclusive)
         */
        public final double getSamplingValue(@org.jetbrains.annotations.NotNull()
        java.lang.String unit) {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSamplingId(@org.jetbrains.annotations.NotNull()
        java.lang.String unit) {
            return null;
        }
    }
}