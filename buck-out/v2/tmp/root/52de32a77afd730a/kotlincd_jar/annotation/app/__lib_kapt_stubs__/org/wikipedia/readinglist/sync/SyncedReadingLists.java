package org.wikipedia.readinglist.sync;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import java.text.Normalizer;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB5\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/readinglist/sync/SyncedReadingLists;", "", "lists", "", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingList;", "entries", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "continueStr", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getContinueStr$annotations", "()V", "getContinueStr", "()Ljava/lang/String;", "getEntries", "()Ljava/util/List;", "getLists", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "RemoteIdResponse", "RemoteIdResponseBatch", "RemoteReadingList", "RemoteReadingListEntry", "RemoteReadingListEntryBatch", "app.lib"})
public final class SyncedReadingLists {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> lists = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> entries = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String continueStr = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.sync.SyncedReadingLists copy(@org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> lists, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> entries, @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public SyncedReadingLists(@org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> lists, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> entries, @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> getLists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> getEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContinueStr() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "next")
    @java.lang.Deprecated()
    public static void getContinueStr$annotations() {
    }
    
    public SyncedReadingLists() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponse;", "", "()V", "id", "", "getId", "()J", "app.lib"})
    public static final class RemoteIdResponse {
        private final long id = 0L;
        
        public RemoteIdResponse() {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponseBatch;", "", "()V", "batch", "", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponse;", "getBatch", "()[Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponse;", "[Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponse;", "app.lib"})
    public static final class RemoteIdResponseBatch {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse[] batch = {};
        
        public RemoteIdResponseBatch() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse[] getBatch() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c2\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0006\u0010\u0006\u001a\u00020\u0007J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u0004\u0010\u000fR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingList;", "", "id", "", "isDefault", "", "name", "", "description", "isDeleted", "(JZLjava/lang/String;Ljava/lang/String;Z)V", "getId", "()J", "isDefault$annotations", "()V", "()Z", "isDeleted$annotations", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app.lib"})
    public static final class RemoteReadingList {
        private final long id = 0L;
        private final boolean isDefault = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        private final boolean isDeleted = false;
        
        public final long component1() {
            return 0L;
        }
        
        public final boolean component2() {
            return false;
        }
        
        private final java.lang.String component3() {
            return null;
        }
        
        private final java.lang.String component4() {
            return null;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList copy(long id, boolean isDefault, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String description, boolean isDeleted) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public RemoteReadingList(long id, boolean isDefault, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String description, boolean isDeleted) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final boolean isDefault() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "default")
        @java.lang.Deprecated()
        public static void isDefault$annotations() {
        }
        
        public final boolean isDeleted() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "deleted")
        @java.lang.Deprecated()
        public static void isDeleted$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String description() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c2\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c2\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "", "id", "", "listId", "project", "", "title", "isDeleted", "", "(JJLjava/lang/String;Ljava/lang/String;Z)V", "getId", "()J", "isDeleted$annotations", "()V", "()Z", "getListId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app.lib"})
    public static final class RemoteReadingListEntry {
        private final long id = 0L;
        private final long listId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String project = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        private final boolean isDeleted = false;
        
        public final long component1() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        private final java.lang.String component3() {
            return null;
        }
        
        private final java.lang.String component4() {
            return null;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry copy(long id, long listId, @org.jetbrains.annotations.NotNull()
        java.lang.String project, @org.jetbrains.annotations.NotNull()
        java.lang.String title, boolean isDeleted) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public RemoteReadingListEntry(long id, long listId, @org.jetbrains.annotations.NotNull()
        java.lang.String project, @org.jetbrains.annotations.NotNull()
        java.lang.String title, boolean isDeleted) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final long getListId() {
            return 0L;
        }
        
        public final boolean isDeleted() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "deleted")
        @java.lang.Deprecated()
        public static void isDeleted$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String project() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String title() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntryBatch;", "", "batch", "", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "(Ljava/util/List;)V", "getBatch", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app.lib"})
    public static final class RemoteReadingListEntryBatch {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> batch = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntryBatch copy(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> batch) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public RemoteReadingListEntryBatch(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> batch) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> getBatch() {
            return null;
        }
    }
}