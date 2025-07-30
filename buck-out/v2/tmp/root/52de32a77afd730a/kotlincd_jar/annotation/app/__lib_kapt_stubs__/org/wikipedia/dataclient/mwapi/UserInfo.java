package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo;
import org.wikipedia.util.DateUtil;
import java.util.*;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001403R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0002R\u0011\u0010\u001e\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b+\u0010\u0002R\u0018\u0010,\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b-\u0010\u0002R\u0011\u0010.\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010!R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102\u00a8\u00065"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/UserInfo;", "Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;", "()V", "anon", "", "getAnon", "()Z", "canCreate", "getCanCreate$annotations", "getCanCreate", "canCreateError", "", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "getCanCreateError$annotations", "editCount", "", "getEditCount$annotations", "getEditCount", "()I", "error", "", "getError", "()Ljava/lang/String;", "groups", "hasBlockError", "getHasBlockError", "id", "getId", "latestContrib", "getLatestContrib$annotations", "latestContribDate", "Ljava/util/Date;", "getLatestContribDate", "()Ljava/util/Date;", "messages", "getMessages", "name", "getName", "options", "Lorg/wikipedia/dataclient/mwapi/UserInfo$Options;", "getOptions", "()Lorg/wikipedia/dataclient/mwapi/UserInfo$Options;", "regDate", "getRegDate$annotations", "registration", "getRegistration$annotations", "registrationDate", "getRegistrationDate", "rights", "getRights", "()Ljava/util/List;", "", "Options", "app.lib"})
public final class UserInfo extends org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo {
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> groups = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String latestContrib = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String regDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String registration = null;
    private final int editCount = -1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "";
    private final boolean anon = false;
    private final boolean messages = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> rights = null;
    private final boolean canCreate = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError> canCreateError = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.UserInfo.Options options = null;
    
    public UserInfo() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "latestcontrib")
    @java.lang.Deprecated()
    private static void getLatestContrib$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "registrationdate")
    @java.lang.Deprecated()
    private static void getRegDate$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "registration")
    @java.lang.Deprecated()
    private static void getRegistration$annotations() {
    }
    
    public final int getEditCount() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "editcount")
    @java.lang.Deprecated()
    public static void getEditCount$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getAnon() {
        return false;
    }
    
    public final boolean getMessages() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRights() {
        return null;
    }
    
    public final boolean getCanCreate() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "cancreate")
    @java.lang.Deprecated()
    public static void getCanCreate$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "cancreateerror")
    @java.lang.Deprecated()
    private static void getCanCreateError$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.UserInfo.Options getOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean getHasBlockError() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> groups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLatestContribDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getRegistrationDate() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/UserInfo$Options;", "", "()V", "fundraisingOptIn", "Lkotlinx/serialization/json/JsonElement;", "getFundraisingOptIn$annotations", "getFundraisingOptIn", "()Lkotlinx/serialization/json/JsonElement;", "watchDefault", "", "getWatchDefault$annotations", "getWatchDefault", "()I", "app.lib"})
    public static final class Options {
        private final int watchDefault = 0;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement fundraisingOptIn = null;
        
        public Options() {
            super();
        }
        
        public final int getWatchDefault() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "watchdefault")
        @java.lang.Deprecated()
        public static void getWatchDefault$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.serialization.json.JsonElement getFundraisingOptIn() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "centralnotice-display-campaign-type-fundraising")
        @java.lang.Deprecated()
        public static void getFundraisingOptIn$annotations() {
        }
    }
}