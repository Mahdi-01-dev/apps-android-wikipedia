package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/CreateAccountEvent;", "", "requestSource", "", "(Ljava/lang/String;)V", "logError", "", "code", "logStart", "logSuccess", "submitEvent", "action", "errorText", "CreateAccountEventImpl", "app.lib"})
public final class CreateAccountEvent {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String requestSource = null;
    
    public CreateAccountEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String requestSource) {
        super();
    }
    
    public final void logStart() {
    }
    
    public final void logError(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public final void logSuccess() {
    }
    
    private final void submitEvent(java.lang.String action, java.lang.String errorText) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_create_account_interaction/1.0.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/CreateAccountEvent$CreateAccountEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "action", "", "source", "errorText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorText$annotations", "()V", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class CreateAccountEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorText = null;
        
        public CreateAccountEventImpl(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String errorText) {
        }
        
        @kotlinx.serialization.SerialName(value = "error_text")
        @java.lang.Deprecated()
        private static void getErrorText$annotations() {
        }
    }
}