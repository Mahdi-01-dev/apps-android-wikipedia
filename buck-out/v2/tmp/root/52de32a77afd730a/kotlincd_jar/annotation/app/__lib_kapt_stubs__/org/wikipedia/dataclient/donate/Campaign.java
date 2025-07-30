package org.wikipedia.dataclient.donate;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.util.DateUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\'()Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/dataclient/donate/Campaign;", "", "version", "", "id", "", "startTime", "endTime", "platforms", "", "Lorg/wikipedia/dataclient/donate/Campaign$PlatformParams;", "countries", "", "assets", "Lorg/wikipedia/dataclient/donate/Campaign$Assets;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V", "getAssets", "()Ljava/util/Map;", "getCountries", "()Ljava/util/List;", "endDateTime", "Ljava/time/LocalDateTime;", "getEndDateTime", "()Ljava/time/LocalDateTime;", "getEndTime$annotations", "()V", "getId", "()Ljava/lang/String;", "getPlatforms", "startDateTime", "getStartDateTime", "getStartTime$annotations", "getVersion", "()I", "getAssetsForLang", "lang", "hasPlatform", "", "platform", "Action", "Assets", "PlatformParams", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class Campaign {
    private final int version = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, org.wikipedia.dataclient.donate.Campaign.PlatformParams> platforms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> countries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, org.wikipedia.dataclient.donate.Campaign.Assets> assets = null;
    
    public Campaign(int version, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, org.wikipedia.dataclient.donate.Campaign.PlatformParams> platforms, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countries, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, org.wikipedia.dataclient.donate.Campaign.Assets> assets) {
        super();
    }
    
    public final int getVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "start_time")
    @java.lang.Deprecated()
    private static void getStartTime$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "end_time")
    @java.lang.Deprecated()
    private static void getEndTime$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.dataclient.donate.Campaign.PlatformParams> getPlatforms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.dataclient.donate.Campaign.Assets> getAssets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getStartDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getEndDateTime() {
        return null;
    }
    
    public final boolean hasPlatform(@org.jetbrains.annotations.NotNull()
    java.lang.String platform) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.donate.Campaign.Assets getAssetsForLang(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/donate/Campaign$Action;", "", "title", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "app.lib"})
    public static final class Action {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        
        public Action(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public Action() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bR\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/donate/Campaign$Assets;", "", "text", "", "footer", "actions", "", "Lorg/wikipedia/dataclient/donate/Campaign$Action;", "(Ljava/lang/String;Ljava/lang/String;[Lorg/wikipedia/dataclient/donate/Campaign$Action;)V", "getActions", "()[Lorg/wikipedia/dataclient/donate/Campaign$Action;", "[Lorg/wikipedia/dataclient/donate/Campaign$Action;", "getFooter", "()Ljava/lang/String;", "getText", "app.lib"})
    public static final class Assets {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String text = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String footer = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.donate.Campaign.Action[] actions = null;
        
        public Assets(@org.jetbrains.annotations.Nullable()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        java.lang.String footer, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.donate.Campaign.Action[] actions) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFooter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.donate.Campaign.Action[] getActions() {
            return null;
        }
        
        public Assets() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/dataclient/donate/Campaign$PlatformParams;", "", "()V", "app.lib"})
    public static final class PlatformParams {
        
        public PlatformParams() {
            super();
        }
    }
}