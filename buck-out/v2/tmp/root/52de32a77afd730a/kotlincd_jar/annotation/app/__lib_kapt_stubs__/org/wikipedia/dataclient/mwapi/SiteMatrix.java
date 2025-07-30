package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.json.JsonUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/SiteMatrix;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "sitematrix", "Lkotlinx/serialization/json/JsonObject;", "getSitematrix", "()Lkotlinx/serialization/json/JsonObject;", "Companion", "SiteInfo", "app.lib"})
public final class SiteMatrix extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonObject sitematrix = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.mwapi.SiteMatrix.Companion Companion = null;
    
    public SiteMatrix() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.serialization.json.JsonObject getSitematrix() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/SiteMatrix$Companion;", "", "()V", "getSites", "", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix$SiteInfo;", "siteMatrix", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.mwapi.SiteMatrix.SiteInfo> getSites(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.SiteMatrix siteMatrix) {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/SiteMatrix$SiteInfo;", "", "()V", "code", "", "getCode", "()Ljava/lang/String;", "localname", "getLocalname", "name", "getName", "app.lib"})
    public static final class SiteInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String localname = "";
        
        public SiteInfo() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLocalname() {
            return null;
        }
    }
}