package org.wikipedia.notifications.db;

import androidx.room.Entity;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.Namespace;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.UriUtil;
import java.util.*;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\t?@ABCDEFGBs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020\u0003J\b\u0010>\u001a\u00020\u0005H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\'R\u0011\u0010(\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u0011\u00107\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001a\u00a8\u0006H"}, d2 = {"Lorg/wikipedia/notifications/db/Notification;", "", "id", "", "wiki", "", "read", "category", "type", "revid", "title", "Lorg/wikipedia/notifications/db/Notification$Title;", "agent", "Lorg/wikipedia/notifications/db/Notification$Agent;", "timestamp", "Lorg/wikipedia/notifications/db/Notification$Timestamp;", "contents", "Lorg/wikipedia/notifications/db/Notification$Contents;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLorg/wikipedia/notifications/db/Notification$Title;Lorg/wikipedia/notifications/db/Notification$Agent;Lorg/wikipedia/notifications/db/Notification$Timestamp;Lorg/wikipedia/notifications/db/Notification$Contents;)V", "getAgent", "()Lorg/wikipedia/notifications/db/Notification$Agent;", "setAgent", "(Lorg/wikipedia/notifications/db/Notification$Agent;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getContents$annotations", "()V", "getContents", "()Lorg/wikipedia/notifications/db/Notification$Contents;", "setContents", "(Lorg/wikipedia/notifications/db/Notification$Contents;)V", "getId", "()J", "setId", "(J)V", "isFromWikidata", "", "()Z", "isUnread", "getRead", "setRead", "getRevid", "setRevid", "getTimestamp", "()Lorg/wikipedia/notifications/db/Notification$Timestamp;", "setTimestamp", "(Lorg/wikipedia/notifications/db/Notification$Timestamp;)V", "getTitle", "()Lorg/wikipedia/notifications/db/Notification$Title;", "setTitle", "(Lorg/wikipedia/notifications/db/Notification$Title;)V", "getType", "setType", "utcIso8601", "getUtcIso8601", "getWiki", "setWiki", "date", "Ljava/util/Date;", "key", "toString", "Agent", "Contents", "Link", "Links", "SeenTime", "Source", "Timestamp", "Title", "UnreadNotificationWikiItem", "app.lib"})
@androidx.room.Entity(primaryKeys = {"id", "wiki"})
public final class Notification {
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String wiki;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String read;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String category;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private long revid;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.notifications.db.Notification.Title title;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.notifications.db.Notification.Agent agent;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.notifications.db.Notification.Timestamp timestamp;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.notifications.db.Notification.Contents contents;
    
    public Notification(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String read, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String type, long revid, @org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Title title, @org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Agent agent, @org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Timestamp timestamp, @org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Contents contents) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWiki() {
        return null;
    }
    
    public final void setWiki(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRead() {
        return null;
    }
    
    public final void setRead(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getRevid() {
        return 0L;
    }
    
    public final void setRevid(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Title getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Title p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Agent getAgent() {
        return null;
    }
    
    public final void setAgent(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Agent p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Timestamp getTimestamp() {
        return null;
    }
    
    public final void setTimestamp(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Timestamp p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.db.Notification.Contents getContents() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "*")
    @java.lang.Deprecated()
    public static void getContents$annotations() {
    }
    
    public final void setContents(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.db.Notification.Contents p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUtcIso8601() {
        return null;
    }
    
    public final boolean isFromWikidata() {
        return false;
    }
    
    public final boolean isUnread() {
        return false;
    }
    
    public final long key() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date date() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public Notification() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Agent;", "", "()V", "id", "", "name", "", "getName", "()Ljava/lang/String;", "app.lib"})
    public static final class Agent {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        
        public Agent() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00048FX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Contents;", "", "()V", "body", "", "getBody", "()Ljava/lang/String;", "compactHeader", "getCompactHeader", "header", "getHeader", "icon", "iconUrl", "getIconUrl", "links", "Lorg/wikipedia/notifications/db/Notification$Links;", "getLinks", "()Lorg/wikipedia/notifications/db/Notification$Links;", "app.lib"})
    public static final class Contents {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String icon = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String header = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String compactHeader = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String body = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String iconUrl = "";
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.notifications.db.Notification.Links links = null;
        
        public Contents() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHeader() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCompactHeader() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIconUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.notifications.db.Notification.Links getLinks() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Link;", "", "()V", "description", "", "icon", "Lkotlinx/serialization/json/JsonElement;", "label", "getLabel", "()Ljava/lang/String;", "tooltip", "getTooltip", "<set-?>", "url", "getUrl", "app.lib"})
    public static final class Link {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = "";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String url = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tooltip = "";
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement icon = null;
        
        public Link() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTooltip() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String icon() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Links;", "", "()V", "primary", "Lkotlinx/serialization/json/JsonElement;", "primaryLink", "Lorg/wikipedia/notifications/db/Notification$Link;", "secondary", "", "getSecondary", "()Ljava/util/List;", "getPrimary", "app.lib"})
    public static final class Links {
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.notifications.db.Notification.Link primaryLink;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement primary = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<org.wikipedia.notifications.db.Notification.Link> secondary = null;
        
        public Links() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<org.wikipedia.notifications.db.Notification.Link> getSecondary() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.notifications.db.Notification.Link getPrimary() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$SeenTime;", "", "()V", "alert", "", "getAlert", "()Ljava/lang/String;", "message", "getMessage", "app.lib"})
    public static final class SeenTime {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String alert = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = "";
        
        public SeenTime() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAlert() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048FX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Source;", "", "()V", "base", "", "getBase", "()Ljava/lang/String;", "title", "getTitle", "url", "getUrl", "app.lib"})
    public static final class Source {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String base = "";
        
        public Source() {
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBase() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Timestamp;", "", "()V", "utciso8601", "", "getUtciso8601", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "app.lib"})
    public static final class Timestamp {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String utciso8601 = null;
        
        public Timestamp() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUtciso8601() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date date() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000e8\u0002X\u0083D\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$Title;", "", "()V", "full", "", "getFull", "()Ljava/lang/String;", "setFull", "(Ljava/lang/String;)V", "isMainNamespace", "", "()Z", "namespace", "namespaceKey", "", "getNamespaceKey$annotations", "text", "getText", "app.lib"})
    public static final class Title {
        private final int namespaceKey = 0;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String full = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = "";
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String namespace = null;
        
        public Title() {
            super();
        }
        
        @kotlinx.serialization.SerialName(value = "namespace-key")
        @java.lang.Deprecated()
        private static void getNamespaceKey$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFull() {
            return null;
        }
        
        public final void setFull(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public final boolean isMainNamespace() {
            return false;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/notifications/db/Notification$UnreadNotificationWikiItem;", "", "()V", "source", "Lorg/wikipedia/notifications/db/Notification$Source;", "getSource", "()Lorg/wikipedia/notifications/db/Notification$Source;", "totalCount", "", "getTotalCount", "()I", "app.lib"})
    public static final class UnreadNotificationWikiItem {
        private final int totalCount = 0;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.notifications.db.Notification.Source source = null;
        
        public UnreadNotificationWikiItem() {
            super();
        }
        
        public final int getTotalCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.notifications.db.Notification.Source getSource() {
            return null;
        }
    }
}