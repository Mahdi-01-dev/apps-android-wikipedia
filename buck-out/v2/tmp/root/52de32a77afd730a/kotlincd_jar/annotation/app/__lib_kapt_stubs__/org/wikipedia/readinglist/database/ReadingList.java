package org.wikipedia.readinglist.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.R;
import org.wikipedia.util.L10nUtil;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\rJ\u000e\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020?R\u001b\u0010\u000e\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\u001a\u00100\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u0011\u00105\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0014R$\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\u0010\"\u0004\b:\u0010\u0019\u00a8\u0006A"}, d2 = {"Lorg/wikipedia/readinglist/database/ReadingList;", "Ljava/io/Serializable;", "listTitle", "", "description", "mtime", "", "atime", "id", "sizeBytes", "dirty", "", "remoteId", "(Ljava/lang/String;Ljava/lang/String;JJJJZJ)V", "accentInvariantTitle", "getAccentInvariantTitle", "()Ljava/lang/String;", "accentInvariantTitle$delegate", "Lkotlin/Lazy;", "getAtime", "()J", "setAtime", "(J)V", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getDirty", "()Z", "setDirty", "(Z)V", "getId", "setId", "isDefault", "getListTitle", "setListTitle", "getMtime", "setMtime", "numPagesOffline", "", "getNumPagesOffline", "()I", "pages", "", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "getPages", "()Ljava/util/List;", "getRemoteId", "setRemoteId", "selected", "getSelected", "setSelected", "getSizeBytes", "setSizeBytes", "sizeBytesFromPages", "getSizeBytesFromPages", "value", "title", "getTitle", "setTitle", "compareTo", "other", "", "touch", "", "Companion", "app.lib"})
@androidx.room.Entity()
public final class ReadingList implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String listTitle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private long mtime;
    private long atime;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    private long sizeBytes;
    private boolean dirty;
    private long remoteId;
    @androidx.room.Ignore()
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages = null;
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.NotNull()
    private final transient kotlin.Lazy accentInvariantTitle$delegate = null;
    @kotlin.jvm.Transient()
    private transient boolean selected = false;
    public static final int SORT_BY_NAME_ASC = 0;
    public static final int SORT_BY_NAME_DESC = 1;
    public static final int SORT_BY_RECENT_ASC = 2;
    public static final int SORT_BY_RECENT_DESC = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.database.ReadingList.Companion Companion = null;
    
    public ReadingList(@org.jetbrains.annotations.NotNull()
    java.lang.String listTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String description, long mtime, long atime, long id, long sizeBytes, boolean dirty, long remoteId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getListTitle() {
        return null;
    }
    
    public final void setListTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getMtime() {
        return 0L;
    }
    
    public final void setMtime(long p0) {
    }
    
    public final long getAtime() {
        return 0L;
    }
    
    public final void setAtime(long p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getSizeBytes() {
        return 0L;
    }
    
    public final void setSizeBytes(long p0) {
    }
    
    public final boolean getDirty() {
        return false;
    }
    
    public final void setDirty(boolean p0) {
    }
    
    public final long getRemoteId() {
        return 0L;
    }
    
    public final void setRemoteId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccentInvariantTitle() {
        return null;
    }
    
    public final boolean getSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean isDefault() {
        return false;
    }
    
    public final int getNumPagesOffline() {
        return 0;
    }
    
    public final long getSizeBytesFromPages() {
        return 0L;
    }
    
    public final void touch() {
    }
    
    public final boolean compareTo(@org.jetbrains.annotations.NotNull()
    java.lang.Object other) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u001c\u0010\u000f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/readinglist/database/ReadingList$Companion;", "", "()V", "SORT_BY_NAME_ASC", "", "SORT_BY_NAME_DESC", "SORT_BY_RECENT_ASC", "SORT_BY_RECENT_DESC", "sort", "", "lists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "sortMode", "list", "sortGenericList", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void sort(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, int sortMode) {
        }
        
        public final void sort(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, int sortMode) {
        }
        
        public final void sortGenericList(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Object> lists, int sortMode) {
        }
    }
}