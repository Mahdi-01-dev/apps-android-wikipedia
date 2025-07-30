package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\b\tB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwAuthManagerInfo;", "", "()V", "requests", "", "Lorg/wikipedia/dataclient/mwapi/MwAuthManagerInfo$Request;", "getRequests", "()Ljava/util/List;", "Field", "Request", "app.lib"})
public final class MwAuthManagerInfo {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwAuthManagerInfo.Request> requests = null;
    
    public MwAuthManagerInfo() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwAuthManagerInfo.Request> getRequests() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwAuthManagerInfo$Field;", "", "type", "", "label", "help", "optional", "", "sensitive", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "app.lib"})
    public static final class Field {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String type = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String label = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String help = null;
        private final boolean optional = false;
        private final boolean sensitive = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String value = null;
        
        public Field(@org.jetbrains.annotations.Nullable()
        java.lang.String type, @org.jetbrains.annotations.Nullable()
        java.lang.String label, @org.jetbrains.annotations.Nullable()
        java.lang.String help, boolean optional, boolean sensitive, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public Field() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwAuthManagerInfo$Request;", "", "id", "", "metadata", "", "required", "provider", "account", "fields", "Lorg/wikipedia/dataclient/mwapi/MwAuthManagerInfo$Field;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFields", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "app.lib"})
    public static final class Request {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.String> metadata = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String required = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String provider = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String account = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.MwAuthManagerInfo.Field> fields = null;
        
        public Request(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
        java.lang.String required, @org.jetbrains.annotations.Nullable()
        java.lang.String provider, @org.jetbrains.annotations.Nullable()
        java.lang.String account, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.MwAuthManagerInfo.Field> fields) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.MwAuthManagerInfo.Field> getFields() {
            return null;
        }
        
        public Request() {
            super();
        }
    }
}