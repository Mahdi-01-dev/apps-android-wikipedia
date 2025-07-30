package org.wikipedia.analytics.metricsplatform;

import org.wikimedia.metrics_platform.context.ClientData;
import org.wikimedia.metrics_platform.context.InteractionData;
import org.wikimedia.metrics_platform.context.PageData;
import org.wikimedia.metrics_platform.context.PerformerData;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.EventPlatformClient;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageFragment;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002Ji\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0004J(\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0004J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002JJ\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0004J.\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\b\u0010\'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0004\u00a8\u0006)"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/MetricsEvent;", "", "()V", "getClientData", "Lorg/wikimedia/metrics_platform/context/ClientData;", "pageData", "Lorg/wikimedia/metrics_platform/context/PageData;", "getInteractionData", "Lorg/wikimedia/metrics_platform/context/InteractionData;", "action", "", "actionSubtype", "actionSource", "actionContext", "elementId", "elementFriendlyName", "funnelEntryToken", "funnelEventSequencePosition", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/wikimedia/metrics_platform/context/InteractionData;", "getPageData", "fragment", "Lorg/wikipedia/page/PageFragment;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "pageId", "revisionId", "", "pageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "getPerformerData", "Lorg/wikimedia/metrics_platform/context/PerformerData;", "submitEvent", "", "streamName", "schemaId", "eventName", "customData", "", "interactionData", "Companion", "app.lib"})
public class MetricsEvent {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EVENT_NAME_BASE = "android.metrics_platform.";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.metricsplatform.MetricsEvent.Companion Companion = null;
    
    public MetricsEvent() {
        super();
    }
    
    /**
     * Submit an event to the Metrics Platform using a base interaction schema
     *
     * @param streamName the name of the stream
     * @param eventName the name of the event
     * @param interactionData a data object that conforms to core interactions
     * @param pageData dynamic page data that should be added to the ClientData object
     */
    protected final void submitEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String streamName, @org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.Nullable()
    org.wikimedia.metrics_platform.context.InteractionData interactionData, @org.jetbrains.annotations.Nullable()
    org.wikimedia.metrics_platform.context.PageData pageData) {
    }
    
    /**
     * Submit an event to the Metrics Platform using a custom schema
     *
     * @param streamName the name of the stream
     * @param schemaId the custom schema ID
     * @param eventName the name of the event
     * @param customData the custom data key-value pairs that are top-level properties
     * @param interactionData a data object that conforms to core interactions
     * @param pageData dynamic page data that should be added to the ClientData object
     */
    protected final void submitEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String streamName, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> customData, @org.jetbrains.annotations.Nullable()
    org.wikimedia.metrics_platform.context.InteractionData interactionData, @org.jetbrains.annotations.Nullable()
    org.wikimedia.metrics_platform.context.PageData pageData) {
    }
    
    private final org.wikimedia.metrics_platform.context.ClientData getClientData(org.wikimedia.metrics_platform.context.PageData pageData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.wikimedia.metrics_platform.context.PageData getPageData(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageFragment fragment) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.wikimedia.metrics_platform.context.PageData getPageData(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle pageTitle, int pageId, long revisionId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.wikimedia.metrics_platform.context.PageData getPageData(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary pageSummary) {
        return null;
    }
    
    private final org.wikimedia.metrics_platform.context.PerformerData getPerformerData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikimedia.metrics_platform.context.InteractionData getInteractionData(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    java.lang.String actionSubtype, @org.jetbrains.annotations.Nullable()
    java.lang.String actionSource, @org.jetbrains.annotations.Nullable()
    java.lang.String actionContext, @org.jetbrains.annotations.Nullable()
    java.lang.String elementId, @org.jetbrains.annotations.Nullable()
    java.lang.String elementFriendlyName, @org.jetbrains.annotations.Nullable()
    java.lang.String funnelEntryToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer funnelEventSequencePosition) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/MetricsEvent$Companion;", "", "()V", "EVENT_NAME_BASE", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}