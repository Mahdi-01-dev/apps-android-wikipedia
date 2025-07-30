package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.WikipediaApp;
import org.wikipedia.json.JsonUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/WikiGamesEvent;", "", "()V", "submit", "", "action", "", "activeInterface", "slideName", "feedbackSelect", "feedbackText", "isArchive", "", "wikiId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "ActionData", "app.lib"})
public final class WikiGamesEvent {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.WikiGamesEvent INSTANCE = null;
    
    private WikiGamesEvent() {
        super();
    }
    
    public final void submit(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String activeInterface, @org.jetbrains.annotations.Nullable()
    java.lang.String slideName, @org.jetbrains.annotations.Nullable()
    java.lang.String feedbackSelect, @org.jetbrains.annotations.Nullable()
    java.lang.String feedbackText, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isArchive, @org.jetbrains.annotations.NotNull()
    java.lang.String wikiId) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/WikiGamesEvent$ActionData;", "", "slide", "", "archive", "", "feedbackSelect", "feedbackText", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getArchive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeedbackSelect$annotations", "()V", "getFeedbackSelect", "()Ljava/lang/String;", "getFeedbackText$annotations", "getFeedbackText", "getSlide", "app.lib"})
    public static final class ActionData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String slide = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean archive = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String feedbackSelect = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String feedbackText = null;
        
        public ActionData(@org.jetbrains.annotations.Nullable()
        java.lang.String slide, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean archive, @org.jetbrains.annotations.Nullable()
        java.lang.String feedbackSelect, @org.jetbrains.annotations.Nullable()
        java.lang.String feedbackText) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSlide() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getArchive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeedbackSelect() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "feedback_select")
        @java.lang.Deprecated()
        public static void getFeedbackSelect$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeedbackText() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "feedback_text")
        @java.lang.Deprecated()
        public static void getFeedbackText$annotations() {
        }
        
        public ActionData() {
            super();
        }
    }
}