package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.Required;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0006\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "_streamName", "", "(Ljava/lang/String;)V", "get_streamName$annotations", "()V", "temp", "", "getTemp$annotations", "Lorg/wikipedia/analytics/eventplatform/AppInteractionEvent;", "Lorg/wikipedia/analytics/eventplatform/AppSessionEvent$AppSessionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/BreadCrumbLogEvent;", "Lorg/wikipedia/analytics/eventplatform/DailyStatsEvent;", "Lorg/wikipedia/analytics/eventplatform/ImageRecommendationsEvent;", "Lorg/wikipedia/analytics/eventplatform/InstallReferrerEvent;", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public abstract class MobileAppsEventWithTemp extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String _streamName = null;
    private final boolean temp = false;
    
    private MobileAppsEventWithTemp(java.lang.String _streamName) {
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    private static void get_streamName$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "is_temp")
    @kotlinx.serialization.Required()
    @java.lang.Deprecated()
    private static void getTemp$annotations() {
    }
}