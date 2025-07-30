package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.ServiceError;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.ThrowableUtil;
import org.wikipedia.util.log.L;
import java.util.*;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0003R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "Lorg/wikipedia/dataclient/ServiceError;", "code", "", "html", "data", "Lorg/wikipedia/dataclient/mwapi/MwServiceError$Data;", "(Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/mwapi/MwServiceError$Data;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lorg/wikipedia/dataclient/mwapi/MwServiceError$Data;", "getHtml", "setHtml", "(Ljava/lang/String;)V", "key", "getKey", "message", "getMessage", "badLoginState", "", "badToken", "getMessageHtml", "messageName", "hasMessageName", "BlockInfo", "Data", "Message", "app.lib"})
public final class MwServiceError implements org.wikipedia.dataclient.ServiceError {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String html;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwServiceError.Data data = null;
    
    public MwServiceError(@org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.lang.String html, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwServiceError.Data data) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHtml() {
        return null;
    }
    
    public final void setHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwServiceError.Data getData() {
        return null;
    }
    
    public final boolean badToken() {
        return false;
    }
    
    public final boolean badLoginState() {
        return false;
    }
    
    public final boolean hasMessageName(@org.jetbrains.annotations.NotNull()
    java.lang.String messageName) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessageHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String messageName) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getKey() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMessage() {
        return null;
    }
    
    public MwServiceError() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0007R\u001c\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0013\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0016\u001a\u00020\t8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;", "", "()V", "blockExpiry", "", "getBlockExpiry$annotations", "getBlockExpiry", "()Ljava/lang/String;", "blockId", "", "getBlockId$annotations", "getBlockId", "()I", "blockReason", "getBlockReason$annotations", "getBlockReason", "blockTimeStamp", "getBlockTimeStamp$annotations", "getBlockTimeStamp", "blockedBy", "getBlockedBy$annotations", "getBlockedBy", "blockedById", "getBlockedById$annotations", "getBlockedById", "isBlocked", "", "()Z", "app.lib"})
    public static class BlockInfo {
        private final int blockedById = 0;
        private final int blockId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String blockedBy = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String blockReason = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String blockTimeStamp = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String blockExpiry = "";
        
        public BlockInfo() {
            super();
        }
        
        public final int getBlockedById() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "blockedbyid")
        @java.lang.Deprecated()
        public static void getBlockedById$annotations() {
        }
        
        public final int getBlockId() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "blockid")
        @java.lang.Deprecated()
        public static void getBlockId$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBlockedBy() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "blockedby")
        @java.lang.Deprecated()
        public static void getBlockedBy$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBlockReason() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "blockreason")
        @java.lang.Deprecated()
        public static void getBlockReason$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBlockTimeStamp() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "blockedtimestamp")
        @java.lang.Deprecated()
        public static void getBlockTimeStamp$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBlockExpiry() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "blockexpiry")
        @java.lang.Deprecated()
        public static void getBlockExpiry$annotations() {
        }
        
        public final boolean isBlocked() {
            return false;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwServiceError$Data;", "", "messages", "", "Lorg/wikipedia/dataclient/mwapi/MwServiceError$Message;", "blockinfo", "Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;", "(Ljava/util/List;Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;)V", "getBlockinfo", "()Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;", "getMessages", "()Ljava/util/List;", "app.lib"})
    public static final class Data {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError.Message> messages = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo blockinfo = null;
        
        public Data(@org.jetbrains.annotations.Nullable()
        java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError.Message> messages, @org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo blockinfo) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError.Message> getMessages() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo getBlockinfo() {
            return null;
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwServiceError$Message;", "", "name", "", "html", "(Ljava/lang/String;Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "getName", "app.lib"})
    public static final class Message {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String html = null;
        
        public Message(@org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String html) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHtml() {
            return null;
        }
    }
}