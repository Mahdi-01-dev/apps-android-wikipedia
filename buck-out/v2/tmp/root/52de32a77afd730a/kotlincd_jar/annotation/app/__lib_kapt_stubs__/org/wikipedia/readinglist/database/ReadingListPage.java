package org.wikipedia.readinglist.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.StringUtil;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0001hB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u00a1\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u001aJ\t\u0010P\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Q\u001a\u00020\u000fH\u00c6\u0003J\t\u0010R\u001a\u00020\u0014H\u00c6\u0003J\t\u0010S\u001a\u00020\u000fH\u00c6\u0003J\t\u0010T\u001a\u00020\u000fH\u00c6\u0003J\t\u0010U\u001a\u00020\nH\u00c6\u0003J\t\u0010V\u001a\u00020\u000fH\u00c6\u0003J\t\u0010W\u001a\u00020\u000fH\u00c6\u0003J\t\u0010X\u001a\u00020\bH\u00c6\u0003J\t\u0010Y\u001a\u00020\nH\u00c6\u0003J\t\u0010Z\u001a\u00020\nH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010]\u001a\u00020\u000fH\u00c6\u0003J\t\u0010^\u001a\u00020\u000fH\u00c6\u0003J\t\u0010_\u001a\u00020\u000fH\u00c6\u0003J\u00ad\u0001\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010a\u001a\u00020\u00142\b\u0010b\u001a\u0004\u0018\u00010cH\u00d6\u0003J\t\u0010d\u001a\u00020,H\u00d6\u0001J\t\u0010e\u001a\u00020\nH\u00d6\u0001J\u0006\u0010f\u001a\u00020gR\u001b\u0010\u001b\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\"R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010\"R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\"R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\"R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001a\u0010\u0018\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u0011\u0010C\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\bD\u0010<R\u001a\u0010E\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010O\u00a8\u0006i"}, d2 = {"Lorg/wikipedia/readinglist/database/ReadingListPage;", "Ljava/io/Serializable;", "title", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/page/PageTitle;)V", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "namespace", "Lorg/wikipedia/page/Namespace;", "displayTitle", "", "apiTitle", "description", "thumbUrl", "listId", "", "id", "mtime", "atime", "offline", "", "status", "sizeBytes", "lang", "revId", "remoteId", "(Lorg/wikipedia/dataclient/WikiSite;Lorg/wikipedia/page/Namespace;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJZJJLjava/lang/String;JJ)V", "accentInvariantTitle", "getAccentInvariantTitle", "()Ljava/lang/String;", "accentInvariantTitle$delegate", "Lkotlin/Lazy;", "getApiTitle", "setApiTitle", "(Ljava/lang/String;)V", "getAtime", "()J", "setAtime", "(J)V", "getDescription", "setDescription", "getDisplayTitle", "setDisplayTitle", "downloadProgress", "", "getDownloadProgress", "()I", "setDownloadProgress", "(I)V", "getId", "setId", "getLang", "setLang", "getListId", "setListId", "getMtime", "setMtime", "getNamespace", "()Lorg/wikipedia/page/Namespace;", "getOffline", "()Z", "setOffline", "(Z)V", "getRemoteId", "setRemoteId", "getRevId", "setRevId", "saving", "getSaving", "selected", "getSelected", "setSelected", "getSizeBytes", "setSizeBytes", "getStatus", "setStatus", "getThumbUrl", "setThumbUrl", "getWiki", "()Lorg/wikipedia/dataclient/WikiSite;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "touch", "", "Companion", "app.lib"})
@androidx.room.Entity()
public final class ReadingListPage implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.Namespace namespace = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiTitle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thumbUrl;
    private long listId;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    private long mtime;
    private long atime;
    private boolean offline;
    private long status;
    private long sizeBytes;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lang;
    private long revId;
    private long remoteId;
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.NotNull()
    private final transient kotlin.Lazy accentInvariantTitle$delegate = null;
    @kotlin.jvm.Transient()
    private transient int downloadProgress = 0;
    @kotlin.jvm.Transient()
    private transient boolean selected = false;
    public static final long STATUS_QUEUE_FOR_SAVE = 0L;
    public static final long STATUS_SAVED = 1L;
    public static final long STATUS_QUEUE_FOR_DELETE = 2L;
    public static final long STATUS_QUEUE_FOR_FORCED_SAVE = 3L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.database.ReadingListPage.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite component1() {
        return null;
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long component13() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final long component15() {
        return 0L;
    }
    
    public final long component16() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.database.ReadingListPage copy(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, long listId, long id, long mtime, long atime, boolean offline, long status, long sizeBytes, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, long revId, long remoteId) {
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
    
    public ReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, long listId, long id, long mtime, long atime, boolean offline, long status, long sizeBytes, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, long revId, long remoteId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWiki() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace getNamespace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final void setDisplayTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    public final void setApiTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbUrl() {
        return null;
    }
    
    public final void setThumbUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getListId() {
        return 0L;
    }
    
    public final void setListId(long p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
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
    
    public final boolean getOffline() {
        return false;
    }
    
    public final void setOffline(boolean p0) {
    }
    
    public final long getStatus() {
        return 0L;
    }
    
    public final void setStatus(long p0) {
    }
    
    public final long getSizeBytes() {
        return 0L;
    }
    
    public final void setSizeBytes(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getRevId() {
        return 0L;
    }
    
    public final void setRevId(long p0) {
    }
    
    public final long getRemoteId() {
        return 0L;
    }
    
    public final void setRemoteId(long p0) {
    }
    
    public ReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccentInvariantTitle() {
        return null;
    }
    
    public final int getDownloadProgress() {
        return 0;
    }
    
    public final void setDownloadProgress(int p0) {
    }
    
    public final boolean getSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public final boolean getSaving() {
        return false;
    }
    
    public final void touch() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/database/ReadingListPage$Companion;", "", "()V", "STATUS_QUEUE_FOR_DELETE", "", "STATUS_QUEUE_FOR_FORCED_SAVE", "STATUS_QUEUE_FOR_SAVE", "STATUS_SAVED", "toPageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "toPageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.page.PageSummary toPageSummary(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle toPageTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page) {
            return null;
        }
    }
}