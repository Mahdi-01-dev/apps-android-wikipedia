package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.WikipediaApp;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.util.ActiveTimer;
import org.wikipedia.util.UriUtil;

@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_image_recommendation_event/1.1.0")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ImageRecommendationsEvent;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "action", "", "active_interface", "action_data", "primary_language", "wiki_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class ImageRecommendationsEvent extends org.wikipedia.analytics.eventplatform.MobileAppsEventWithTemp {
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
    private static final java.lang.String STREAM_NAME = "android.image_recommendation_event";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> reasons = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.util.ActiveTimer timer = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent.Companion Companion = null;
    
    public ImageRecommendationsEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String active_interface, @org.jetbrains.annotations.NotNull()
    java.lang.String action_data, @org.jetbrains.annotations.NotNull()
    java.lang.String primary_language, @org.jetbrains.annotations.NotNull()
    java.lang.String wiki_id) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Ju\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0017J*\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0004J\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010 \u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0004J(\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ImageRecommendationsEvent$Companion;", "", "()V", "STREAM_NAME", "", "reasons", "", "getReasons", "()Ljava/util/List;", "timer", "Lorg/wikipedia/util/ActiveTimer;", "getActionDataString", "filename", "recommendationSource", "recommendationSourceProjects", "rejectionReasons", "acceptanceState", "revisionId", "", "captionAdd", "", "altTextAdd", "addTimeSpent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Ljava/lang/String;", "logAction", "", "action", "activeInterface", "actionData", "wikiId", "logEditSuccess", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "logImpression", "submitImageRecommendationEvent", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getReasons() {
            return null;
        }
        
        public final void logImpression(@org.jetbrains.annotations.NotNull()
        java.lang.String activeInterface, @org.jetbrains.annotations.NotNull()
        java.lang.String actionData, @org.jetbrains.annotations.NotNull()
        java.lang.String wikiId) {
        }
        
        public final void logAction(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String activeInterface, @org.jetbrains.annotations.NotNull()
        java.lang.String actionData, @org.jetbrains.annotations.NotNull()
        java.lang.String wikiId) {
        }
        
        public final void logEditSuccess(@org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
        java.lang.String wikiId, long revisionId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActionDataString(@org.jetbrains.annotations.Nullable()
        java.lang.String filename, @org.jetbrains.annotations.Nullable()
        java.lang.String recommendationSource, @org.jetbrains.annotations.Nullable()
        java.lang.String recommendationSourceProjects, @org.jetbrains.annotations.Nullable()
        java.lang.String rejectionReasons, @org.jetbrains.annotations.Nullable()
        java.lang.String acceptanceState, @org.jetbrains.annotations.Nullable()
        java.lang.Long revisionId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean captionAdd, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean altTextAdd, boolean addTimeSpent) {
            return null;
        }
        
        private final void submitImageRecommendationEvent(java.lang.String action, java.lang.String activeInterface, java.lang.String actionData, java.lang.String wikiId) {
        }
    }
}