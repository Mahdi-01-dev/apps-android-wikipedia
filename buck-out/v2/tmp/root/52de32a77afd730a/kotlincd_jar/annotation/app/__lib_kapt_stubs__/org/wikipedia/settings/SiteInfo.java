package org.wikipedia.settings;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/settings/SiteInfo;", "", "lang", "", "readingListsConfig", "Lorg/wikipedia/settings/SiteInfo$ReadingListsConfig;", "(Ljava/lang/String;Lorg/wikipedia/settings/SiteInfo$ReadingListsConfig;)V", "getLang", "()Ljava/lang/String;", "getReadingListsConfig$annotations", "()V", "getReadingListsConfig", "()Lorg/wikipedia/settings/SiteInfo$ReadingListsConfig;", "AutoCreateTempUser", "ReadingListsConfig", "app.lib"})
public final class SiteInfo {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lang = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.settings.SiteInfo.ReadingListsConfig readingListsConfig = null;
    
    public SiteInfo(@org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    org.wikipedia.settings.SiteInfo.ReadingListsConfig readingListsConfig) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLang() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.settings.SiteInfo.ReadingListsConfig getReadingListsConfig() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "readinglists-config")
    @java.lang.Deprecated()
    public static void getReadingListsConfig$annotations() {
    }
    
    public SiteInfo() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/settings/SiteInfo$AutoCreateTempUser;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "app.lib"})
    public static final class AutoCreateTempUser {
        private final boolean enabled = false;
        
        public AutoCreateTempUser(boolean enabled) {
            super();
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public AutoCreateTempUser() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/SiteInfo$ReadingListsConfig;", "", "maxListsPerUser", "", "maxEntriesPerList", "deletedRetentionDays", "(III)V", "getDeletedRetentionDays", "()I", "getMaxEntriesPerList", "getMaxListsPerUser", "app.lib"})
    public static final class ReadingListsConfig {
        private final int maxListsPerUser = 0;
        private final int maxEntriesPerList = 0;
        private final int deletedRetentionDays = 0;
        
        public ReadingListsConfig(int maxListsPerUser, int maxEntriesPerList, int deletedRetentionDays) {
            super();
        }
        
        public final int getMaxListsPerUser() {
            return 0;
        }
        
        public final int getMaxEntriesPerList() {
            return 0;
        }
        
        public final int getDeletedRetentionDays() {
            return 0;
        }
        
        public ReadingListsConfig() {
            super();
        }
    }
}