package org.wikipedia.analytics.metricsplatform;

import org.wikipedia.util.ActiveTimer;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/TimedMetricsEvent;", "Lorg/wikipedia/analytics/metricsplatform/MetricsEvent;", "()V", "timer", "Lorg/wikipedia/util/ActiveTimer;", "getTimer", "()Lorg/wikipedia/util/ActiveTimer;", "app.lib"})
public class TimedMetricsEvent extends org.wikipedia.analytics.metricsplatform.MetricsEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.ActiveTimer timer = null;
    
    public TimedMetricsEvent() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikipedia.util.ActiveTimer getTimer() {
        return null;
    }
}