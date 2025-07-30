package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.WikipediaApp;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.readinglist.recommended.RecommendedReadingListAbTest;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jm\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/RecommendedReadingListEvent;", "", "()V", "submit", "", "action", "", "activeInterface", "optionsShown", "countSelected", "", "countSaved", "currentSetting", "selected", "source", "wikiId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ActionData", "app.lib"})
public final class RecommendedReadingListEvent {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent INSTANCE = null;
    
    private RecommendedReadingListEvent() {
        super();
    }
    
    public final void submit(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String activeInterface, @org.jetbrains.annotations.Nullable()
    java.lang.String optionsShown, @org.jetbrains.annotations.Nullable()
    java.lang.Integer countSelected, @org.jetbrains.annotations.Nullable()
    java.lang.Integer countSaved, @org.jetbrains.annotations.Nullable()
    java.lang.String currentSetting, @org.jetbrains.annotations.Nullable()
    java.lang.String selected, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String wikiId) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/RecommendedReadingListEvent$ActionData;", "", "rrlGroup", "", "optionsShown", "countSelected", "", "countSaved", "currentSetting", "selected", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountSaved$annotations", "()V", "getCountSaved", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountSelected$annotations", "getCountSelected", "getCurrentSetting$annotations", "getCurrentSetting", "()Ljava/lang/String;", "getOptionsShown$annotations", "getOptionsShown", "getRrlGroup$annotations", "getRrlGroup", "getSelected", "getSource", "app.lib"})
    public static final class ActionData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rrlGroup = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String optionsShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer countSelected = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer countSaved = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currentSetting = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String selected = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String source = null;
        
        public ActionData(@org.jetbrains.annotations.Nullable()
        java.lang.String rrlGroup, @org.jetbrains.annotations.Nullable()
        java.lang.String optionsShown, @org.jetbrains.annotations.Nullable()
        java.lang.Integer countSelected, @org.jetbrains.annotations.Nullable()
        java.lang.Integer countSaved, @org.jetbrains.annotations.Nullable()
        java.lang.String currentSetting, @org.jetbrains.annotations.Nullable()
        java.lang.String selected, @org.jetbrains.annotations.Nullable()
        java.lang.String source) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRrlGroup() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "rrl_group")
        @java.lang.Deprecated()
        public static void getRrlGroup$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOptionsShown() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "options_shown")
        @java.lang.Deprecated()
        public static void getOptionsShown$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCountSelected() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "count_selected")
        @java.lang.Deprecated()
        public static void getCountSelected$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCountSaved() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "count_saved")
        @java.lang.Deprecated()
        public static void getCountSaved$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrentSetting() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "current_setting")
        @java.lang.Deprecated()
        public static void getCurrentSetting$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSelected() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSource() {
            return null;
        }
        
        public ActionData() {
            super();
        }
    }
}