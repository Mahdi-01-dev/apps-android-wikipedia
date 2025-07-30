package org.wikipedia.analytics.metricsplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikimedia.metrics_platform.context.PageData;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageFragment;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0004R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/ArticleLinkPreviewInteraction;", "Lorg/wikipedia/analytics/metricsplatform/TimedMetricsEvent;", "source", "", "(I)V", "fragment", "Lorg/wikipedia/page/PageFragment;", "(Lorg/wikipedia/page/PageFragment;I)V", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "pageId", "(Lorg/wikipedia/page/PageTitle;II)V", "summary", "Lorg/wikipedia/dataclient/page/PageSummary;", "(Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/dataclient/page/PageSummary;I)V", "pageData", "Lorg/wikimedia/metrics_platform/context/PageData;", "getSource", "()I", "setSource", "logCancel", "", "logLinkClick", "logNavigate", "submitEvent", "action", "", "contextData", "Lorg/wikipedia/analytics/metricsplatform/ArticleLinkPreviewInteraction$ContextData;", "ContextData", "app.lib"})
public class ArticleLinkPreviewInteraction extends org.wikipedia.analytics.metricsplatform.TimedMetricsEvent {
    @org.jetbrains.annotations.Nullable()
    private final org.wikimedia.metrics_platform.context.PageData pageData = null;
    private int source;
    
    public final int getSource() {
        return 0;
    }
    
    public final void setSource(int p0) {
    }
    
    public ArticleLinkPreviewInteraction(int source) {
        super();
    }
    
    public ArticleLinkPreviewInteraction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, int source) {
        super();
    }
    
    public ArticleLinkPreviewInteraction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, int pageId, int source) {
        super();
    }
    
    public ArticleLinkPreviewInteraction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary summary, int source) {
        super();
    }
    
    public final void logLinkClick() {
    }
    
    public void logNavigate() {
    }
    
    public final void logCancel() {
    }
    
    protected final void submitEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.metricsplatform.ArticleLinkPreviewInteraction.ContextData contextData) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/ArticleLinkPreviewInteraction$ContextData;", "", "timeSpentMillis", "", "(Ljava/lang/Long;)V", "getTimeSpentMillis$annotations", "()V", "getTimeSpentMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "app.lib"})
    public static final class ContextData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long timeSpentMillis = null;
        
        public ContextData(@org.jetbrains.annotations.Nullable()
        java.lang.Long timeSpentMillis) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getTimeSpentMillis() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "time_spent_ms")
        @java.lang.Deprecated()
        public static void getTimeSpentMillis$annotations() {
        }
        
        public ContextData() {
            super();
        }
    }
}