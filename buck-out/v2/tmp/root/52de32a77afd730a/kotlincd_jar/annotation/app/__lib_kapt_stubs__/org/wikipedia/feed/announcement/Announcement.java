package org.wikipedia.feed.announcement;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.util.DateUtil;
import java.util.*;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002FGB\u00f3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010?\u001a\u00020\u0003J\u0006\u0010@\u001a\u00020\u0003J\b\u0010\n\u001a\u0004\u0018\u00010AJ\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020EJ\u0006\u0010\u0012\u001a\u00020EJ\b\u0010\t\u001a\u0004\u0018\u00010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b%\u0010&R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010&\u001a\u0004\b(\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b.\u0010&\u001a\u0004\b/\u0010)R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010&\u001a\u0004\b1\u0010)R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010!\u0012\u0004\b2\u0010&\u001a\u0004\b3\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b4\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b5\u0010&R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010&\u001a\u0004\b7\u0010)R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R \u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010!\u0012\u0004\b:\u0010&\u001a\u0004\b;\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b<\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010)\u00a8\u0006H"}, d2 = {"Lorg/wikipedia/feed/announcement/Announcement;", "", "id", "", "text", "type", "platforms", "", "countries", "startTime", "endTime", "imageUrl", "negativeText", "footerCaption", "imageHeight", "loggedIn", "", "readingListSyncEnabled", "minVersion", "Lkotlinx/serialization/json/JsonElement;", "maxVersion", "imageAspectRatio", "", "border", "beta", "placement", "action", "Lorg/wikipedia/feed/announcement/Announcement$Action;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lorg/wikipedia/feed/announcement/Announcement$Action;)V", "getAction", "()Lorg/wikipedia/feed/announcement/Announcement$Action;", "getBeta", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBorder", "getCountries", "()Ljava/util/List;", "getEndTime$annotations", "()V", "getFooterCaption$annotations", "getFooterCaption", "()Ljava/lang/String;", "getId", "getImageAspectRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getImageHeight$annotations", "getImageHeight", "getImageUrl$annotations", "getImageUrl", "getLoggedIn$annotations", "getLoggedIn", "getMaxVersion$annotations", "getMinVersion$annotations", "getNegativeText$annotations", "getNegativeText", "getPlacement", "getPlatforms", "getReadingListSyncEnabled$annotations", "getReadingListSyncEnabled", "getStartTime$annotations", "getText", "getType", "actionTitle", "actionUrl", "Ljava/util/Date;", "hasAction", "hasFooterCaption", "hasImageUrl", "", "Action", "Companion", "app.lib"})
public final class Announcement {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> platforms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> countries = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String negativeText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String footerCaption = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imageHeight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean loggedIn = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean readingListSyncEnabled = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement minVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement maxVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double imageAspectRatio = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean border = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean beta = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String placement = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.feed.announcement.Announcement.Action action = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SURVEY = "survey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FUNDRAISING = "fundraising";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLACEMENT_FEED = "feed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLACEMENT_ARTICLE = "article";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.announcement.Announcement.Companion Companion = null;
    
    public Announcement(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> platforms, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countries, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String negativeText, @org.jetbrains.annotations.Nullable()
    java.lang.String footerCaption, @org.jetbrains.annotations.Nullable()
    java.lang.String imageHeight, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean loggedIn, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean readingListSyncEnabled, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement minVersion, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement maxVersion, @org.jetbrains.annotations.Nullable()
    java.lang.Double imageAspectRatio, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean border, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean beta, @org.jetbrains.annotations.NotNull()
    java.lang.String placement, @org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.announcement.Announcement.Action action) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPlatforms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCountries() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "image_url")
    @java.lang.Deprecated()
    public static void getImageUrl$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNegativeText() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "negative_text")
    @java.lang.Deprecated()
    public static void getNegativeText$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFooterCaption() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "caption_HTML")
    @java.lang.Deprecated()
    public static void getFooterCaption$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageHeight() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "image_height")
    @java.lang.Deprecated()
    public static void getImageHeight$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLoggedIn() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "logged_in")
    @java.lang.Deprecated()
    public static void getLoggedIn$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReadingListSyncEnabled() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "reading_list_sync_enabled")
    @java.lang.Deprecated()
    public static void getReadingListSyncEnabled$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "min_version")
    @java.lang.Deprecated()
    private static void getMinVersion$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "max_version")
    @java.lang.Deprecated()
    private static void getMaxVersion$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getImageAspectRatio() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBorder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBeta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlacement() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.announcement.Announcement.Action getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date startTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date endTime() {
        return null;
    }
    
    public final boolean hasAction() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String actionTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String actionUrl() {
        return null;
    }
    
    public final boolean hasFooterCaption() {
        return false;
    }
    
    public final boolean hasImageUrl() {
        return false;
    }
    
    public final int minVersion() {
        return 0;
    }
    
    public final int maxVersion() {
        return 0;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/announcement/Announcement$Action;", "", "title", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "app.lib"})
    public static final class Action {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        public Action(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/feed/announcement/Announcement$Companion;", "", "()V", "FUNDRAISING", "", "PLACEMENT_ARTICLE", "PLACEMENT_FEED", "SURVEY", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}