package org.wikipedia.dataclient.liftwing;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion;", "", "()V", "Request", "Response", "app.lib"})
public final class DescriptionSuggestion {
    
    public DescriptionSuggestion() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion$Request;", "", "lang", "", "title", "count", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCount$annotations", "()V", "getCount", "()I", "getLang", "()Ljava/lang/String;", "getTitle", "app.lib"})
    public static final class Request {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lang = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        private final int count = 0;
        
        public Request(@org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String title, int count) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLang() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int getCount() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "num_beams")
        @java.lang.Deprecated()
        public static void getCount$annotations() {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion$Response;", "", "()V", "blp", "", "getBlp", "()Z", "prediction", "", "", "getPrediction", "()Ljava/util/List;", "app.lib"})
    public static final class Response {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> prediction = null;
        private final boolean blp = false;
        
        public Response() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getPrediction() {
            return null;
        }
        
        public final boolean getBlp() {
            return false;
        }
    }
}