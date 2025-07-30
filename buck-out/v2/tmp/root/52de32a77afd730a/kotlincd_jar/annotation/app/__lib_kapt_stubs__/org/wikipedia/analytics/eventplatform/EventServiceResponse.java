package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

/**
 * POJO representing a response body from the Event Platform's intake API (EventGate).
 *
 * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
 * body. In the case of partial or total failure, failing events will be returned in the "invalid"
 * or "error" arrays in the response body.
 *
 * N.B. The response body will always be empty when sending events hastily. This class is provided
 * in anticipation of adding retry behavior for failed events in the future.
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventServiceResponse;", "", "()V", "errorEvents", "", "Lorg/wikipedia/analytics/eventplatform/Event;", "getErrorEvents$annotations", "getErrorEvents", "()Ljava/util/List;", "invalidEvents", "getInvalidEvents$annotations", "getInvalidEvents", "app.lib"})
public final class EventServiceResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.analytics.eventplatform.Event> invalidEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.analytics.eventplatform.Event> errorEvents = null;
    
    public EventServiceResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.analytics.eventplatform.Event> getInvalidEvents() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "invalid")
    @java.lang.Deprecated()
    public static void getInvalidEvents$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.analytics.eventplatform.Event> getErrorEvents() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "error")
    @java.lang.Deprecated()
    public static void getErrorEvents$annotations() {
    }
}