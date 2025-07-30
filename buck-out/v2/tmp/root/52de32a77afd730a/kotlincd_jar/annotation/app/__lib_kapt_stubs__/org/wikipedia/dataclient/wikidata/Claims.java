package org.wikipedia.dataclient.wikidata;

import android.location.Location;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.*;
import org.wikipedia.dataclient.mwapi.MwResponse;
import org.wikipedia.json.JsonUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "claims", "", "", "", "Lorg/wikipedia/dataclient/wikidata/Claims$Claim;", "getClaims", "()Ljava/util/Map;", "Claim", "DataValue", "EntityIdValue", "GlobeCoordinateValue", "MainSnak", "MonolingualTextValue", "TimeValue", "app.lib"})
public final class Claims extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.util.List<org.wikipedia.dataclient.wikidata.Claims.Claim>> claims = null;
    
    public Claims() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<org.wikipedia.dataclient.wikidata.Claims.Claim>> getClaims() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$Claim;", "", "()V", "id", "", "mainSnak", "Lorg/wikipedia/dataclient/wikidata/Claims$MainSnak;", "getMainSnak$annotations", "getMainSnak", "()Lorg/wikipedia/dataclient/wikidata/Claims$MainSnak;", "rank", "type", "app.lib"})
    public static final class Claim {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String type = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rank = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.wikidata.Claims.MainSnak mainSnak = null;
        
        public Claim() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.wikidata.Claims.MainSnak getMainSnak() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "mainsnak")
        @java.lang.Deprecated()
        public static void getMainSnak$annotations() {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$DataValue;", "", "()V", "type", "", "value", "Lkotlinx/serialization/json/JsonElement;", "app.lib"})
    public static final class DataValue {
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement value = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String type = null;
        
        public DataValue() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String value() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$EntityIdValue;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "app.lib"})
    public static final class EntityIdValue {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = "";
        
        public EntityIdValue() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$GlobeCoordinateValue;", "", "()V", "altitude", "", "latitude", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "longitude", "precision", "app.lib"})
    public static final class GlobeCoordinateValue {
        private final double latitude = 0.0;
        private final double longitude = 0.0;
        private final double altitude = 0.0;
        private final double precision = 0.0;
        
        public GlobeCoordinateValue() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.location.Location getLocation() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$MainSnak;", "", "()V", "dataType", "", "getDataType$annotations", "dataValue", "Lorg/wikipedia/dataclient/wikidata/Claims$DataValue;", "getDataValue$annotations", "getDataValue", "()Lorg/wikipedia/dataclient/wikidata/Claims$DataValue;", "hash", "property", "snakType", "getSnakType$annotations", "app.lib"})
    public static final class MainSnak {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String snakType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String dataType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String property = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String hash = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.wikidata.Claims.DataValue dataValue = null;
        
        public MainSnak() {
            super();
        }
        
        @kotlinx.serialization.SerialName(value = "snaktype")
        @java.lang.Deprecated()
        private static void getSnakType$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "datatype")
        @java.lang.Deprecated()
        private static void getDataType$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.wikidata.Claims.DataValue getDataValue() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "datavalue")
        @java.lang.Deprecated()
        public static void getDataValue$annotations() {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$MonolingualTextValue;", "", "()V", "language", "", "text", "getText", "()Ljava/lang/String;", "app.lib"})
    public static final class MonolingualTextValue {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String language = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = "";
        
        public MonolingualTextValue() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Claims$TimeValue;", "", "()V", "after", "", "before", "precision", "time", "", "getTime", "()Ljava/lang/String;", "timezone", "app.lib"})
    public static final class TimeValue {
        private final int timezone = 0;
        private final int before = 0;
        private final int after = 0;
        private final int precision = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String time = "";
        
        public TimeValue() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTime() {
            return null;
        }
    }
}