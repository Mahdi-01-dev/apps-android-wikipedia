package org.wikipedia.analytics.metricsplatform;

import android.os.Build;
import org.wikimedia.metrics_platform.MetricsClient;
import org.wikimedia.metrics_platform.context.AgentData;
import org.wikimedia.metrics_platform.context.ClientData;
import org.wikimedia.metrics_platform.context.MediawikiData;
import org.wikipedia.BuildConfig;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ReleaseUtil;
import java.time.Duration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/MetricsPlatform;", "", "()V", "agentData", "Lorg/wikimedia/metrics_platform/context/AgentData;", "getAgentData", "()Lorg/wikimedia/metrics_platform/context/AgentData;", "client", "Lorg/wikimedia/metrics_platform/MetricsClient;", "getClient", "()Lorg/wikimedia/metrics_platform/MetricsClient;", "clientData", "Lorg/wikimedia/metrics_platform/context/ClientData;", "domain", "", "getDomain", "()Ljava/lang/String;", "mediawikiData", "Lorg/wikimedia/metrics_platform/context/MediawikiData;", "getMediawikiData", "()Lorg/wikimedia/metrics_platform/context/MediawikiData;", "app.lib"})
public final class MetricsPlatform {
    @org.jetbrains.annotations.NotNull()
    private static final org.wikimedia.metrics_platform.context.AgentData agentData = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikimedia.metrics_platform.context.MediawikiData mediawikiData = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String domain = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikimedia.metrics_platform.context.ClientData clientData = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikimedia.metrics_platform.MetricsClient client = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.metricsplatform.MetricsPlatform INSTANCE = null;
    
    private MetricsPlatform() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikimedia.metrics_platform.context.AgentData getAgentData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikimedia.metrics_platform.context.MediawikiData getMediawikiData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikimedia.metrics_platform.MetricsClient getClient() {
        return null;
    }
}