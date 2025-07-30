package org.wikipedia.analytics.eventplatform;

import org.wikipedia.BuildConfig;

/**
 * Possible event destination endpoints which can be specified in stream configurations.
 * https://wikitech.wikimedia.org/wiki/Event_Platform/EventGate#EventGate_clusters
 *
 * N.B. Currently our streamconfigs API request is filtering for streams with their destination
 * event service configured as eventgate-analytics-external. However, that will likely change in
 * the future, so flexible destination event service support is added optimistically now.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/DestinationEventService;", "", "id", "", "baseUri", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBaseUri", "()Ljava/lang/String;", "getId", "ANALYTICS", "LOGGING", "app.lib"})
public enum DestinationEventService {
    /*public static final*/ ANALYTICS /* = new ANALYTICS(null, null) */,
    /*public static final*/ LOGGING /* = new LOGGING(null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseUri = null;
    
    DestinationEventService(java.lang.String id, java.lang.String baseUri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.analytics.eventplatform.DestinationEventService> getEntries() {
        return null;
    }
}