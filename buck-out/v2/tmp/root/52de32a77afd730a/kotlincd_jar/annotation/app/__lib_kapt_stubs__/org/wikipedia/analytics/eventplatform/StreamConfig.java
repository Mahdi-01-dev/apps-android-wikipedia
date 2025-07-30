package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import java.lang.IllegalArgumentException;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u0018R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010$R\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\f\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030&\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010)\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "", "streamName", "", "samplingConfig", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "destinationEventService", "Lorg/wikipedia/analytics/eventplatform/DestinationEventService;", "(Ljava/lang/String;Lorg/wikipedia/analytics/eventplatform/SamplingConfig;Lorg/wikipedia/analytics/eventplatform/DestinationEventService;)V", "canaryEventsEnabled", "", "getCanaryEventsEnabled$annotations", "()V", "getCanaryEventsEnabled", "()Z", "setCanaryEventsEnabled", "(Z)V", "getDestinationEventService", "()Lorg/wikipedia/analytics/eventplatform/DestinationEventService;", "setDestinationEventService", "(Lorg/wikipedia/analytics/eventplatform/DestinationEventService;)V", "destinationEventServiceKey", "getDestinationEventServiceKey$annotations", "getDestinationEventServiceKey", "()Ljava/lang/String;", "getSamplingConfig$annotations", "getSamplingConfig", "()Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "setSamplingConfig", "(Lorg/wikipedia/analytics/eventplatform/SamplingConfig;)V", "schemaTitle", "getSchemaTitle$annotations", "getSchemaTitle", "getStreamName$annotations", "getStreamName", "setStreamName", "(Ljava/lang/String;)V", "topicPrefixes", "", "getTopicPrefixes$annotations", "getTopicPrefixes", "()Ljava/util/List;", "topics", "getTopics", "app.lib"})
public final class StreamConfig {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String streamName = "";
    private boolean canaryEventsEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String destinationEventServiceKey = "eventgate-analytics-external";
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.analytics.eventplatform.DestinationEventService destinationEventService = org.wikipedia.analytics.eventplatform.DestinationEventService.ANALYTICS;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String schemaTitle = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topicPrefixes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topics = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.eventplatform.SamplingConfig samplingConfig;
    
    public StreamConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String streamName, @org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.SamplingConfig samplingConfig, @org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.DestinationEventService destinationEventService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreamName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "stream")
    @java.lang.Deprecated()
    public static void getStreamName$annotations() {
    }
    
    public final void setStreamName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCanaryEventsEnabled() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "canary_events_enabled")
    @java.lang.Deprecated()
    public static void getCanaryEventsEnabled$annotations() {
    }
    
    public final void setCanaryEventsEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDestinationEventServiceKey() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "destination_event_service")
    @java.lang.Deprecated()
    public static void getDestinationEventServiceKey$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.eventplatform.DestinationEventService getDestinationEventService() {
        return null;
    }
    
    public final void setDestinationEventService(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.DestinationEventService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSchemaTitle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "schema_title")
    @java.lang.Deprecated()
    public static void getSchemaTitle$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTopicPrefixes() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "topic_prefixes")
    @java.lang.Deprecated()
    public static void getTopicPrefixes$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.analytics.eventplatform.SamplingConfig getSamplingConfig() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sample")
    @java.lang.Deprecated()
    public static void getSamplingConfig$annotations() {
    }
    
    public final void setSamplingConfig(@org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.SamplingConfig p0) {
    }
}