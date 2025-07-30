package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.notifications.db.Notification.SeenTime;
import org.wikipedia.notifications.db.Notification.UnreadNotificationWikiItem;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.SiteInfo;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.StringUtil;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\f]^_`abcdefghB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010O\u001a\u0004\u0018\u00010\'J\b\u0010P\u001a\u0004\u0018\u00010\'J\b\u0010Q\u001a\u0004\u0018\u00010\'J\b\u0010R\u001a\u0004\u0018\u000100J\u0010\u0010S\u001a\u0004\u0018\u00010\u00052\u0006\u0010T\u001a\u00020\'J\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u0004J\b\u0010W\u001a\u0004\u0018\u00010\'J\b\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020YH\u0002J\b\u0010[\u001a\u0004\u0018\u00010\'J\b\u0010\\\u001a\u0004\u0018\u00010\'R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u001f\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(\u0018\u00010&\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\bR$\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\bR\u0016\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u0002\u001a\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020@\u0018\u00010&8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\u0002\u001a\u0004\bB\u0010*R\"\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\bR\u001e\u0010G\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u001eR\u0019\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\bR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\b\u00a8\u0006i"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult;", "", "()V", "allUsers", "", "Lorg/wikipedia/dataclient/mwapi/UserInfo;", "getAllUsers$annotations", "getAllUsers", "()Ljava/util/List;", "allmessages", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Message;", "getAllmessages", "amInfo", "Lorg/wikipedia/dataclient/mwapi/MwAuthManagerInfo;", "getAmInfo$annotations", "autoCreateTempUser", "Lorg/wikipedia/settings/SiteInfo$AutoCreateTempUser;", "getAutoCreateTempUser$annotations", "getAutoCreateTempUser", "()Lorg/wikipedia/settings/SiteInfo$AutoCreateTempUser;", "converted", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$ConvertedTitle;", "echomarkread", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$MarkReadResponse;", "echomarkseen", "getEchomarkseen", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResult$MarkReadResponse;", "globalUserInfo", "getGlobalUserInfo$annotations", "getGlobalUserInfo", "()Lorg/wikipedia/dataclient/mwapi/UserInfo;", "isEditProtected", "", "()Z", "magicwords", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$MagicWord;", "getMagicwords", "namespaces", "", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Namespace;", "getNamespaces", "()Ljava/util/Map;", "notifications", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$NotificationList;", "getNotifications", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResult$NotificationList;", "pages", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getPages", "recentChanges", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "getRecentChanges$annotations", "getRecentChanges", "redirects", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Redirect;", "siteInfo", "Lorg/wikipedia/settings/SiteInfo;", "getSiteInfo$annotations", "getSiteInfo", "()Lorg/wikipedia/settings/SiteInfo;", "tokens", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Tokens;", "unreadNotificationWikis", "Lorg/wikipedia/notifications/db/Notification$UnreadNotificationWikiItem;", "getUnreadNotificationWikis$annotations", "getUnreadNotificationWikis", "userContributions", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "getUserContributions$annotations", "getUserContributions", "userInfo", "getUserInfo$annotations", "getUserInfo", "users", "getUsers", "watchlist", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "getWatchlist", "captchaId", "createAccountToken", "csrfToken", "firstPage", "getUserResponse", "userName", "langLinks", "Lorg/wikipedia/page/PageTitle;", "loginToken", "resolveConvertedTitles", "", "resolveRedirectedTitles", "rollbackToken", "watchToken", "ConvertedTitle", "MagicWord", "MarkReadResponse", "Message", "Namespace", "NotificationList", "OresItem", "OresResult", "RecentChange", "Redirect", "Tokens", "WatchlistItem", "app.lib"})
public final class MwQueryResult {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.UserInfo userInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, org.wikipedia.notifications.db.Notification.UnreadNotificationWikiItem> unreadNotificationWikis = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwAuthManagerInfo amInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.settings.SiteInfo siteInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.settings.SiteInfo.AutoCreateTempUser autoCreateTempUser = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> recentChanges = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> userContributions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> allUsers = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.UserInfo globalUserInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.Redirect> redirects = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.ConvertedTitle> converted = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryResult.Tokens tokens = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryResult.MarkReadResponse echomarkread = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> users = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage> pages = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryResult.MarkReadResponse echomarkseen = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryResult.NotificationList notifications = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem> watchlist = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryResult.Namespace> namespaces = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.Message> allmessages = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.MagicWord> magicwords = null;
    
    public MwQueryResult() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.UserInfo getUserInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "userinfo")
    @java.lang.Deprecated()
    public static void getUserInfo$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, org.wikipedia.notifications.db.Notification.UnreadNotificationWikiItem> getUnreadNotificationWikis() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "unreadnotificationpages")
    @java.lang.Deprecated()
    public static void getUnreadNotificationWikis$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "authmanagerinfo")
    @java.lang.Deprecated()
    private static void getAmInfo$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.settings.SiteInfo getSiteInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "general")
    @java.lang.Deprecated()
    public static void getSiteInfo$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.settings.SiteInfo.AutoCreateTempUser getAutoCreateTempUser() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "autocreatetempuser")
    @java.lang.Deprecated()
    public static void getAutoCreateTempUser$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> getRecentChanges() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "recentchanges")
    @java.lang.Deprecated()
    public static void getRecentChanges$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> getUserContributions() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "usercontribs")
    @java.lang.Deprecated()
    public static void getUserContributions$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> getAllUsers() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "allusers")
    @java.lang.Deprecated()
    public static void getAllUsers$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.UserInfo getGlobalUserInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "globaluserinfo")
    @java.lang.Deprecated()
    public static void getGlobalUserInfo$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage> getPages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryResult.MarkReadResponse getEchomarkseen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryResult.NotificationList getNotifications() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem> getWatchlist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryResult.Namespace> getNamespaces() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.Message> getAllmessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.MagicWord> getMagicwords() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage firstPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String csrfToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String watchToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String rollbackToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String createAccountToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String loginToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String captchaId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.UserInfo getUserResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.PageTitle> langLinks() {
        return null;
    }
    
    public final boolean isEditProtected() {
        return false;
    }
    
    private final void resolveRedirectedTitles() {
    }
    
    private final void resolveConvertedTitles() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$ConvertedTitle;", "", "from", "", "to", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "app.lib"})
    public static final class ConvertedTitle {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String from = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String to = null;
        
        public ConvertedTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String from, @org.jetbrains.annotations.Nullable()
        java.lang.String to) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTo() {
            return null;
        }
        
        public ConvertedTitle() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$MagicWord;", "", "()V", "aliases", "", "", "getAliases", "()Ljava/util/List;", "name", "getName", "()Ljava/lang/String;", "app.lib"})
    public static final class MagicWord {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> aliases = null;
        
        public MagicWord() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAliases() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$MarkReadResponse;", "", "timestamp", "", "result", "(Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getTimestamp", "app.lib"})
    public static final class MarkReadResponse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String timestamp = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String result = null;
        
        public MarkReadResponse(@org.jetbrains.annotations.Nullable()
        java.lang.String timestamp, @org.jetbrains.annotations.Nullable()
        java.lang.String result) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTimestamp() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getResult() {
            return null;
        }
        
        public MarkReadResponse() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Message;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "name", "getName", "app.lib"})
    public static final class Message {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String content = "";
        
        public Message() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContent() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Namespace;", "", "()V", "id", "", "getId", "()I", "name", "", "getName", "()Ljava/lang/String;", "app.lib"})
    public static final class Namespace {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        
        public Namespace() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$NotificationList;", "", "list", "", "Lorg/wikipedia/notifications/db/Notification;", "seenTime", "Lorg/wikipedia/notifications/db/Notification$SeenTime;", "count", "", "rawcount", "continueStr", "", "(Ljava/util/List;Lorg/wikipedia/notifications/db/Notification$SeenTime;IILjava/lang/String;)V", "getContinueStr$annotations", "()V", "getContinueStr", "()Ljava/lang/String;", "getCount", "()I", "getList", "()Ljava/util/List;", "getSeenTime", "()Lorg/wikipedia/notifications/db/Notification$SeenTime;", "app.lib"})
    public static final class NotificationList {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<org.wikipedia.notifications.db.Notification> list = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.notifications.db.Notification.SeenTime seenTime = null;
        private final int count = 0;
        private final int rawcount = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String continueStr = null;
        
        public NotificationList(@org.jetbrains.annotations.Nullable()
        java.util.List<org.wikipedia.notifications.db.Notification> list, @org.jetbrains.annotations.Nullable()
        org.wikipedia.notifications.db.Notification.SeenTime seenTime, int count, int rawcount, @org.jetbrains.annotations.Nullable()
        java.lang.String continueStr) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<org.wikipedia.notifications.db.Notification> getList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.notifications.db.Notification.SeenTime getSeenTime() {
            return null;
        }
        
        public final int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContinueStr() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "continue")
        @java.lang.Deprecated()
        public static void getContinueStr$annotations() {
        }
        
        public NotificationList() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresItem;", "", "()V", "falseProb", "", "getFalseProb$annotations", "getFalseProb", "()F", "trueProb", "getTrueProb$annotations", "getTrueProb", "app.lib"})
    public static final class OresItem {
        private final float trueProb = 0.0F;
        private final float falseProb = 0.0F;
        
        public OresItem() {
            super();
        }
        
        public final float getTrueProb() {
            return 0.0F;
        }
        
        @kotlinx.serialization.SerialName(value = "true")
        @java.lang.Deprecated()
        public static void getTrueProb$annotations() {
        }
        
        public final float getFalseProb() {
            return 0.0F;
        }
        
        @kotlinx.serialization.SerialName(value = "false")
        @java.lang.Deprecated()
        public static void getFalseProb$annotations() {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresResult;", "", "()V", "damaging", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresItem;", "damagingProb", "", "getDamagingProb", "()F", "goodfaith", "goodfaithProb", "getGoodfaithProb", "app.lib"})
    public static final class OresResult {
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.mwapi.MwQueryResult.OresItem damaging = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.mwapi.MwQueryResult.OresItem goodfaith = null;
        
        public OresResult() {
            super();
        }
        
        public final float getDamagingProb() {
            return 0.0F;
        }
        
        public final float getGoodfaithProb() {
            return 0.0F;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010@\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002X\u0083D\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0018X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u001c\u0010&\u001a\u00020\u00118\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0002\u001a\u0004\b(\u0010\u0013R\u001b\u0010)\u001a\u00020*8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\rR\u001c\u00105\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\rR\u0016\u00108\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000109X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0013R\u000e\u0010=\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0013\u00a8\u0006A"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "", "()V", "anon", "", "getAnon", "()Z", "bot", "getBot", "curRev", "", "getCurRev$annotations", "getCurRev", "()J", "isNew", "isNew$annotations", "joinedTags", "", "getJoinedTags", "()Ljava/lang/String;", "joinedTags$delegate", "Lkotlin/Lazy;", "minor", "newlen", "", "getNewlen", "()I", "ns", "oldlen", "getOldlen", "ores", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresResult;", "getOres", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresResult;", "oresscores", "Lkotlinx/serialization/json/JsonElement;", "pageid", "getPageid", "parsedComment", "getParsedComment$annotations", "getParsedComment", "parsedDateTime", "Ljava/time/LocalDateTime;", "getParsedDateTime", "()Ljava/time/LocalDateTime;", "parsedDateTime$delegate", "parsedInstant", "Ljava/time/Instant;", "getParsedInstant", "()Ljava/time/Instant;", "parsedInstant$delegate", "rcid", "getRcid", "revFrom", "getRevFrom$annotations", "getRevFrom", "tags", "", "timestamp", "title", "getTitle", "type", "user", "getUser", "toString", "app.lib"})
    public static final class RecentChange {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = "";
        private final int ns = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = "";
        private final int pageid = 0;
        private final long curRev = 0L;
        private final long revFrom = 0L;
        private final long rcid = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String user = "";
        private final boolean anon = false;
        private final boolean bot = false;
        private final boolean isNew = false;
        private final boolean minor = false;
        private final int oldlen = 0;
        private final int newlen = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String timestamp = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String parsedComment = "";
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> tags = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement oresscores = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy parsedInstant$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy parsedDateTime$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy joinedTags$delegate = null;
        
        public RecentChange() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int getPageid() {
            return 0;
        }
        
        public final long getCurRev() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "revid")
        @java.lang.Deprecated()
        public static void getCurRev$annotations() {
        }
        
        public final long getRevFrom() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "old_revid")
        @java.lang.Deprecated()
        public static void getRevFrom$annotations() {
        }
        
        public final long getRcid() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUser() {
            return null;
        }
        
        public final boolean getAnon() {
            return false;
        }
        
        public final boolean getBot() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "new")
        @java.lang.Deprecated()
        private static void isNew$annotations() {
        }
        
        public final int getOldlen() {
            return 0;
        }
        
        public final int getNewlen() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getParsedComment() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "parsedcomment")
        @java.lang.Deprecated()
        public static void getParsedComment$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.Instant getParsedInstant() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime getParsedDateTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getJoinedTags() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.mwapi.MwQueryResult.OresResult getOres() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Redirect;", "", "toFragment", "", "index", "", "from", "to", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "getToFragment$annotations", "()V", "getToFragment", "app.lib"})
    static final class Redirect {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String toFragment = null;
        private final int index = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String from = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String to = null;
        
        public Redirect(@org.jetbrains.annotations.Nullable()
        java.lang.String toFragment, int index, @org.jetbrains.annotations.Nullable()
        java.lang.String from, @org.jetbrains.annotations.Nullable()
        java.lang.String to) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToFragment() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "tofragment")
        @java.lang.Deprecated()
        public static void getToFragment$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTo() {
            return null;
        }
        
        public Redirect() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$Tokens;", "", "csrf", "", "createAccount", "login", "watch", "rollback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateAccount$annotations", "()V", "getCreateAccount", "()Ljava/lang/String;", "getCsrf$annotations", "getCsrf", "getLogin$annotations", "getLogin", "getRollback$annotations", "getRollback", "getWatch$annotations", "getWatch", "app.lib"})
    static final class Tokens {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String csrf = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String createAccount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String login = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String watch = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rollback = null;
        
        public Tokens(@org.jetbrains.annotations.Nullable()
        java.lang.String csrf, @org.jetbrains.annotations.Nullable()
        java.lang.String createAccount, @org.jetbrains.annotations.Nullable()
        java.lang.String login, @org.jetbrains.annotations.Nullable()
        java.lang.String watch, @org.jetbrains.annotations.Nullable()
        java.lang.String rollback) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCsrf() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "csrftoken")
        @java.lang.Deprecated()
        public static void getCsrf$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreateAccount() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "createaccounttoken")
        @java.lang.Deprecated()
        public static void getCreateAccount$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLogin() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "logintoken")
        @java.lang.Deprecated()
        public static void getLogin$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWatch() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "watchtoken")
        @java.lang.Deprecated()
        public static void getWatch$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRollback() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "rollbacktoken")
        @java.lang.Deprecated()
        public static void getRollback$annotations() {
        }
        
        public Tokens() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\t\u0010\fR\u001c\u0010\r\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0019X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001f8\u0002X\u0083D\u00a2\u0006\b\n\u0000\u0012\u0004\b \u0010\u0002R\u0014\u0010!\u001a\u00020\u0019X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001c\u0010#\u001a\u00020\u00198\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u001bR\u001c\u0010&\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0002\u001a\u0004\b(\u0010\u0015R\u0014\u0010)\u001a\u00020\u001fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0015R\u0014\u0010/\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0015R\u0014\u00101\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0015R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u00069"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "", "()V", "comment", "", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "isAnon", "", "isAnon$annotations", "()Z", "isBot", "isBot$annotations", "isMinor", "isMinor$annotations", "isNew", "isNew$annotations", "logdisplay", "getLogdisplay", "()Ljava/lang/String;", "logtype", "getLogtype", "newlen", "", "getNewlen", "()I", "ns", "getNs", "oldRevid", "", "getOldRevid$annotations", "oldlen", "getOldlen", "pageId", "getPageId$annotations", "getPageId", "parsedComment", "getParsedComment$annotations", "getParsedComment", "revid", "getRevid", "()J", "timestamp", "title", "getTitle", "type", "getType", "user", "getUser", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "getWiki", "()Lorg/wikipedia/dataclient/WikiSite;", "setWiki", "(Lorg/wikipedia/dataclient/WikiSite;)V", "app.lib"})
    public static final class WatchlistItem {
        private final boolean isNew = false;
        private final boolean isAnon = false;
        private final boolean isMinor = false;
        private final boolean isBot = false;
        private final long oldRevid = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String timestamp = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String comment = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = "";
        private final int pageId = 0;
        private final long revid = 0L;
        private final int ns = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String user = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String logtype = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String logdisplay = "";
        private final int oldlen = 0;
        private final int newlen = 0;
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.dataclient.WikiSite wiki;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String parsedComment = "";
        
        public WatchlistItem() {
            super();
        }
        
        public final boolean isNew() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "new")
        @java.lang.Deprecated()
        public static void isNew$annotations() {
        }
        
        public final boolean isAnon() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "anon")
        @java.lang.Deprecated()
        public static void isAnon$annotations() {
        }
        
        public final boolean isMinor() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "minor")
        @java.lang.Deprecated()
        public static void isMinor$annotations() {
        }
        
        public final boolean isBot() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "bot")
        @java.lang.Deprecated()
        public static void isBot$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "old_revid")
        @java.lang.Deprecated()
        private static void getOldRevid$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public final int getPageId() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "pageid")
        @java.lang.Deprecated()
        public static void getPageId$annotations() {
        }
        
        public final long getRevid() {
            return 0L;
        }
        
        public final int getNs() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLogtype() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLogdisplay() {
            return null;
        }
        
        public final int getOldlen() {
            return 0;
        }
        
        public final int getNewlen() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.WikiSite getWiki() {
            return null;
        }
        
        public final void setWiki(@org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.WikiSite p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getParsedComment() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "parsedcomment")
        @java.lang.Deprecated()
        public static void getParsedComment$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getDate() {
            return null;
        }
    }
}