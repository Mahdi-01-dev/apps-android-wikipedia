package org.wikipedia.dataclient.wikidata;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.dataclient.mwapi.MwResponse;
import org.wikipedia.json.JsonUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002R6\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Entities;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "<set-?>", "", "", "Lorg/wikipedia/dataclient/wikidata/Entities$Entity;", "entities", "getEntities", "()Ljava/util/Map;", "first", "getFirst", "()Lorg/wikipedia/dataclient/wikidata/Entities$Entity;", "Entity", "Label", "SiteLink", "app.lib"})
public final class Entities extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, org.wikipedia.dataclient.wikidata.Entities.Entity> entities;
    
    public Entities() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.dataclient.wikidata.Entities.Entity> getEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.wikidata.Entities.Entity getFirst() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015J\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0015J\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Entities$Entity;", "", "()V", "descriptions", "Lkotlinx/serialization/json/JsonElement;", "id", "", "getId", "()Ljava/lang/String;", "labels", "lastRevId", "", "getLastRevId$annotations", "getLastRevId", "()J", "missing", "getMissing", "()Lkotlinx/serialization/json/JsonElement;", "sitelinks", "statements", "getDescriptions", "", "Lorg/wikipedia/dataclient/wikidata/Entities$Label;", "getLabels", "getSiteLinks", "Lorg/wikipedia/dataclient/wikidata/Entities$SiteLink;", "getStatements", "", "Lorg/wikipedia/dataclient/wikidata/Claims$Claim;", "app.lib"})
    public static final class Entity {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = "";
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement labels = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement descriptions = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement sitelinks = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement statements = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement missing = null;
        private final long lastRevId = 0L;
        
        public Entity() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.serialization.json.JsonElement getMissing() {
            return null;
        }
        
        public final long getLastRevId() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "lastrevid")
        @java.lang.Deprecated()
        public static void getLastRevId$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.util.List<org.wikipedia.dataclient.wikidata.Claims.Claim>> getStatements() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.dataclient.wikidata.Entities.Label> getLabels() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.dataclient.wikidata.Entities.Label> getDescriptions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.dataclient.wikidata.Entities.SiteLink> getSiteLinks() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Entities$Label;", "", "()V", "language", "", "getLanguage", "()Ljava/lang/String;", "value", "getValue", "app.lib"})
    public static final class Label {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String language = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = "";
        
        public Label() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Entities$SiteLink;", "", "()V", "site", "", "getSite", "()Ljava/lang/String;", "title", "getTitle", "app.lib"})
    public static final class SiteLink {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String site = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = "";
        
        public SiteLink() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSite() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
    }
}