package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "batchcomplete", "", "getBatchcomplete", "()Z", "continuation", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;", "getContinuation$annotations", "getContinuation", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;", "query", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult;", "getQuery", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResult;", "setQuery", "(Lorg/wikipedia/dataclient/mwapi/MwQueryResult;)V", "Continuation", "app.lib"})
public class MwQueryResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    private final boolean batchcomplete = true;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation continuation = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryResult query;
    
    public MwQueryResponse() {
        super();
    }
    
    public final boolean getBatchcomplete() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation getContinuation() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "continue")
    @java.lang.Deprecated()
    public static void getContinuation$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryResult getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryResult p0) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\u000eR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;", "", "()V", "continuation", "", "getContinuation$annotations", "getContinuation", "()Ljava/lang/String;", "gcmContinuation", "getGcmContinuation$annotations", "getGcmContinuation", "gpsoffset", "", "getGpsoffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "gsroffset", "getGsroffset", "rcContinuation", "getRcContinuation$annotations", "getRcContinuation", "rvContinuation", "getRvContinuation$annotations", "getRvContinuation", "sroffset", "getSroffset", "ucContinuation", "getUcContinuation$annotations", "getUcContinuation", "app.lib"})
    public static final class Continuation {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer sroffset = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer gsroffset = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer gpsoffset = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String continuation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String ucContinuation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rcContinuation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rvContinuation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String gcmContinuation = null;
        
        public Continuation() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSroffset() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getGsroffset() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getGpsoffset() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContinuation() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "continue")
        @java.lang.Deprecated()
        public static void getContinuation$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUcContinuation() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "uccontinue")
        @java.lang.Deprecated()
        public static void getUcContinuation$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRcContinuation() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "rccontinue")
        @java.lang.Deprecated()
        public static void getRcContinuation$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRvContinuation() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "rvcontinue")
        @java.lang.Deprecated()
        public static void getRvContinuation$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGcmContinuation() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "gcmcontinue")
        @java.lang.Deprecated()
        public static void getGcmContinuation$annotations() {
        }
    }
}