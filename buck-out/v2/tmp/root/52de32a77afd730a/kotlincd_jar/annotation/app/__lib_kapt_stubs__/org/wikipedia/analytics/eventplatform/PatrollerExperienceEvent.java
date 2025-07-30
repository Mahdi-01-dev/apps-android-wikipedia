package org.wikipedia.analytics.eventplatform;

import org.wikipedia.WikipediaApp;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/PatrollerExperienceEvent;", "", "()V", "Companion", "app.lib"})
public final class PatrollerExperienceEvent {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent.Companion Companion = null;
    
    public PatrollerExperienceEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0083\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0010J;\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004J\"\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0002\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/PatrollerExperienceEvent$Companion;", "", "()V", "getActionDataString", "", "revisionId", "", "feedbackOption", "feedbackText", "messageType", "summaryText", "filterSelected", "filterWiki", "filtersList", "appLanguageCodeAdded", "appLanguageCodes", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getPublishMessageActionString", "isModified", "", "isSaved", "isExample", "exampleMessage", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;", "logAction", "", "action", "activeInterface", "actionData", "logImpression", "submitPatrollerActivityEvent", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void logImpression(@org.jetbrains.annotations.NotNull()
        java.lang.String activeInterface) {
        }
        
        public final void logAction(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String activeInterface, @org.jetbrains.annotations.NotNull()
        java.lang.String actionData) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActionDataString(@org.jetbrains.annotations.Nullable()
        java.lang.Long revisionId, @org.jetbrains.annotations.Nullable()
        java.lang.String feedbackOption, @org.jetbrains.annotations.Nullable()
        java.lang.String feedbackText, @org.jetbrains.annotations.Nullable()
        java.lang.String messageType, @org.jetbrains.annotations.Nullable()
        java.lang.String summaryText, @org.jetbrains.annotations.Nullable()
        java.lang.String filterSelected, @org.jetbrains.annotations.Nullable()
        java.lang.String filterWiki, @org.jetbrains.annotations.Nullable()
        java.lang.String filtersList, @org.jetbrains.annotations.Nullable()
        java.lang.String appLanguageCodeAdded, @org.jetbrains.annotations.Nullable()
        java.lang.String appLanguageCodes) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPublishMessageActionString(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isModified, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSaved, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isExample, @org.jetbrains.annotations.Nullable()
        java.lang.String exampleMessage) {
            return null;
        }
        
        private final void submitPatrollerActivityEvent(java.lang.String action, java.lang.String activeInterface, java.lang.String actionData) {
        }
    }
}