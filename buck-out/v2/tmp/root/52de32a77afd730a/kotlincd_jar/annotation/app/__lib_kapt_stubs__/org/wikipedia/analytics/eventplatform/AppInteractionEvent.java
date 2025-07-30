package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;

@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/app_interaction/1.1.0")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\fR\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/AppInteractionEvent;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "action", "", "active_interface", "action_data", "primary_language", "wiki_id", "streamName", "platform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatform$annotations", "()V", "getStreamName$annotations", "app.lib"})
@kotlin.Suppress(names = {"unused"})
@kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
public final class AppInteractionEvent extends org.wikipedia.analytics.eventplatform.MobileAppsEventWithTemp {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String active_interface = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action_data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String primary_language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wiki_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String streamName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String platform = null;
    
    public AppInteractionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String active_interface, @org.jetbrains.annotations.NotNull()
    java.lang.String action_data, @org.jetbrains.annotations.NotNull()
    java.lang.String primary_language, @org.jetbrains.annotations.NotNull()
    java.lang.String wiki_id, @org.jetbrains.annotations.NotNull()
    java.lang.String streamName, @org.jetbrains.annotations.NotNull()
    java.lang.String platform) {
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    private static void getStreamName$annotations() {
    }
    
    @kotlinx.serialization.EncodeDefault(mode = kotlinx.serialization.EncodeDefault.Mode.ALWAYS)
    @java.lang.Deprecated()
    private static void getPlatform$annotations() {
    }
}