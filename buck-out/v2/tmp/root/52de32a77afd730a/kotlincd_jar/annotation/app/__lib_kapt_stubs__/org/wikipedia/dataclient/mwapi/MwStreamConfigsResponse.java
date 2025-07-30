package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;
import org.wikipedia.analytics.eventplatform.StreamConfig;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwStreamConfigsResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "streamConfigs", "", "", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "getStreamConfigs", "()Ljava/util/Map;", "streams", "app.lib"})
public final class MwStreamConfigsResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> streams = null;
    
    public MwStreamConfigsResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> getStreamConfigs() {
        return null;
    }
}