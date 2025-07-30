package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.Serializable;

/**
 * Represents the sampling config component of a stream configuration.
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "", "rate", "", "unit", "", "(DLjava/lang/String;)V", "getRate", "()D", "getUnit", "()Ljava/lang/String;", "Companion", "app.lib"})
public final class SamplingConfig {
    private final double rate = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String unit = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNIT_PAGEVIEW = "pageview";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNIT_SESSION = "session";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNIT_DEVICE = "device";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.SamplingConfig.Companion Companion = null;
    
    public SamplingConfig(double rate, @org.jetbrains.annotations.NotNull()
    java.lang.String unit) {
        super();
    }
    
    public final double getRate() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnit() {
        return null;
    }
    
    public SamplingConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Companion;", "", "()V", "UNIT_DEVICE", "", "UNIT_PAGEVIEW", "UNIT_SESSION", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}