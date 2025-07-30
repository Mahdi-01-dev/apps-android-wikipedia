package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.Required;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import java.time.Instant;
import java.util.*;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/Event;", "", "stream", "", "(Ljava/lang/String;)V", "dt", "getDt$annotations", "()V", "meta", "Lorg/wikipedia/analytics/eventplatform/Event$Meta;", "getStream$annotations", "getStream", "()Ljava/lang/String;", "Meta", "Lorg/wikipedia/analytics/eventplatform/EditAttemptStepEvent;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "Lorg/wikipedia/analytics/eventplatform/TestEvent;", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public abstract class Event {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stream = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.eventplatform.Event.Meta meta = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dt = null;
    
    private Event(java.lang.String stream) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStream() {
        return null;
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getStream$annotations() {
    }
    
    @kotlinx.serialization.Required()
    @java.lang.Deprecated()
    private static void getDt$annotations() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/Event$Meta;", "", "stream", "", "(Ljava/lang/String;)V", "getStream$annotations", "()V", "getStream", "()Ljava/lang/String;", "app.lib"})
    static final class Meta {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String stream = null;
        
        public Meta(@org.jetbrains.annotations.NotNull()
        java.lang.String stream) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStream() {
            return null;
        }
        
        @kotlinx.serialization.Required()
        @java.lang.Deprecated()
        public static void getStream$annotations() {
        }
    }
}