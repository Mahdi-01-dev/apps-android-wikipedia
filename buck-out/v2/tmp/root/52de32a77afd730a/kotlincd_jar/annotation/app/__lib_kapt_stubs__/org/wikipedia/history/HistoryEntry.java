package org.wikipedia.history;

import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import kotlinx.parcelize.IgnoredOnParcel;
import kotlinx.parcelize.Parcelize;
import kotlinx.parcelize.TypeParceler;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.json.DateSerializer;
import org.wikipedia.page.PageTitle;
import org.wikipedia.parcel.DateParceler;
import java.util.Date;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b)\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB_\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0012R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b$\u0010%R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b\'\u0010\u001eR&\u0010(\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b0\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b5\u00106\u00a8\u00068"}, d2 = {"Lorg/wikipedia/history/HistoryEntry;", "Landroid/os/Parcelable;", "title", "Lorg/wikipedia/page/PageTitle;", "source", "", "timestamp", "Ljava/util/Date;", "(Lorg/wikipedia/page/PageTitle;ILjava/util/Date;)V", "authority", "", "lang", "apiTitle", "displayTitle", "id", "", "namespace", "prevId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Date;IJ)V", "getApiTitle", "()Ljava/lang/String;", "setApiTitle", "(Ljava/lang/String;)V", "getAuthority", "setAuthority", "getDisplayTitle", "setDisplayTitle", "getId", "()J", "setId", "(J)V", "getLang", "setLang", "getNamespace", "setNamespace", "pageTitle", "getPageTitle$annotations", "()V", "getPrevId", "setPrevId", "referrer", "getReferrer$annotations", "getReferrer", "setReferrer", "getSource", "()I", "setSource", "(I)V", "getTimestamp$annotations", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "Companion", "app.lib"})
@kotlinx.parcelize.Parcelize()
@kotlinx.parcelize.TypeParceler()
@androidx.room.Entity(indices = {@androidx.room.Index(value = {"lang", "namespace", "apiTitle"})})
public final class HistoryEntry implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String authority;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lang;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayTitle;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String namespace;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date timestamp;
    private int source;
    private long prevId;
    @androidx.room.Ignore()
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle pageTitle;
    @androidx.room.Ignore()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String referrer;
    public static final int SOURCE_SEARCH = 1;
    public static final int SOURCE_INTERNAL_LINK = 2;
    public static final int SOURCE_EXTERNAL_LINK = 3;
    public static final int SOURCE_HISTORY = 4;
    public static final int SOURCE_LANGUAGE_LINK = 6;
    public static final int SOURCE_RANDOM = 7;
    public static final int SOURCE_MAIN_PAGE = 8;
    public static final int SOURCE_PLACES = 9;
    public static final int SOURCE_DISAMBIG = 10;
    public static final int SOURCE_READING_LIST = 11;
    public static final int SOURCE_FEED_BECAUSE_YOU_READ = 13;
    public static final int SOURCE_FEED_MOST_READ = 14;
    public static final int SOURCE_FEED_FEATURED = 15;
    public static final int SOURCE_NEWS = 16;
    public static final int SOURCE_FEED_MAIN_PAGE = 17;
    public static final int SOURCE_FEED_RANDOM = 18;
    public static final int SOURCE_GALLERY = 19;
    public static final int SOURCE_APP_SHORTCUT_RANDOM = 20;
    public static final int SOURCE_APP_SHORTCUT_CONTINUE_READING = 21;
    public static final int SOURCE_FEED_MOST_READ_ACTIVITY = 22;
    public static final int SOURCE_ON_THIS_DAY_CARD = 23;
    public static final int SOURCE_ON_THIS_DAY_ACTIVITY = 24;
    public static final int SOURCE_NOTIFICATION = 25;
    public static final int SOURCE_NOTIFICATION_SYSTEM = 26;
    public static final int SOURCE_EDIT_DESCRIPTION = 28;
    public static final int SOURCE_WIDGET = 29;
    public static final int SOURCE_SUGGESTED_EDITS = 30;
    public static final int SOURCE_TALK_TOPIC = 31;
    public static final int SOURCE_WATCHLIST = 32;
    public static final int SOURCE_EDIT_DIFF_DETAILS = 33;
    public static final int SOURCE_ERROR = 34;
    public static final int SOURCE_EDIT_HISTORY = 35;
    public static final int SOURCE_CATEGORY = 36;
    public static final int SOURCE_ARCHIVED_TALK = 37;
    public static final int SOURCE_USER_CONTRIB = 38;
    public static final int SOURCE_FILE_PAGE = 39;
    public static final int SOURCE_SINGLE_WEBVIEW = 40;
    public static final int SOURCE_SUGGESTED_EDITS_RECENT_EDITS = 41;
    public static final int SOURCE_FEED_PLACES = 42;
    public static final int SOURCE_ON_THIS_DAY_GAME = 43;
    public static final int SOURCE_RECOMMENDED_READING_LIST = 44;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.history.HistoryEntry.Companion Companion = null;
    
    public HistoryEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.util.Date timestamp, int source, long prevId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthority() {
        return null;
    }
    
    public final void setAuthority(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    public final void setApiTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final void setDisplayTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamespace() {
        return null;
    }
    
    public final void setNamespace(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTimestamp() {
        return null;
    }
    
    @kotlinx.serialization.Serializable(with = org.wikipedia.json.DateSerializer.class)
    @java.lang.Deprecated()
    public static void getTimestamp$annotations() {
    }
    
    public final void setTimestamp(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getSource() {
        return 0;
    }
    
    public final void setSource(int p0) {
    }
    
    public final long getPrevId() {
        return 0L;
    }
    
    public final void setPrevId(long p0) {
    }
    
    public HistoryEntry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, int source, @org.jetbrains.annotations.NotNull()
    java.util.Date timestamp) {
        super();
    }
    
    @kotlinx.serialization.Transient()
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    private static void getPageTitle$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReferrer() {
        return null;
    }
    
    @kotlinx.serialization.Transient()
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getReferrer$annotations() {
    }
    
    public final void setReferrer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public HistoryEntry() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lorg/wikipedia/history/HistoryEntry$Companion;", "", "()V", "SOURCE_APP_SHORTCUT_CONTINUE_READING", "", "SOURCE_APP_SHORTCUT_RANDOM", "SOURCE_ARCHIVED_TALK", "SOURCE_CATEGORY", "SOURCE_DISAMBIG", "SOURCE_EDIT_DESCRIPTION", "SOURCE_EDIT_DIFF_DETAILS", "SOURCE_EDIT_HISTORY", "SOURCE_ERROR", "SOURCE_EXTERNAL_LINK", "SOURCE_FEED_BECAUSE_YOU_READ", "SOURCE_FEED_FEATURED", "SOURCE_FEED_MAIN_PAGE", "SOURCE_FEED_MOST_READ", "SOURCE_FEED_MOST_READ_ACTIVITY", "SOURCE_FEED_PLACES", "SOURCE_FEED_RANDOM", "SOURCE_FILE_PAGE", "SOURCE_GALLERY", "SOURCE_HISTORY", "SOURCE_INTERNAL_LINK", "SOURCE_LANGUAGE_LINK", "SOURCE_MAIN_PAGE", "SOURCE_NEWS", "SOURCE_NOTIFICATION", "SOURCE_NOTIFICATION_SYSTEM", "SOURCE_ON_THIS_DAY_ACTIVITY", "SOURCE_ON_THIS_DAY_CARD", "SOURCE_ON_THIS_DAY_GAME", "SOURCE_PLACES", "SOURCE_RANDOM", "SOURCE_READING_LIST", "SOURCE_RECOMMENDED_READING_LIST", "SOURCE_SEARCH", "SOURCE_SINGLE_WEBVIEW", "SOURCE_SUGGESTED_EDITS", "SOURCE_SUGGESTED_EDITS_RECENT_EDITS", "SOURCE_TALK_TOPIC", "SOURCE_USER_CONTRIB", "SOURCE_WATCHLIST", "SOURCE_WIDGET", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}