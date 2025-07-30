package org.wikipedia.readinglist;

import android.content.Intent;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000b0\u000bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsShareHelper;", "", "()V", "API_MAX_SIZE", "", "PROVENANCE_PARAM", "", "readingListToUrlParam", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "pageIdMap", "", "shareReadingList", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "ExportedReadingList", "ExportedReadingListPage", "app.lib"})
public final class ReadingListsShareHelper {
    public static final int API_MAX_SIZE = 50;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROVENANCE_PARAM = "rlsa1";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListsShareHelper INSTANCE = null;
    
    private ReadingListsShareHelper() {
        super();
    }
    
    public final void shareReadingList(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList readingList) {
    }
    
    private final java.lang.String readingListToUrlParam(org.wikipedia.readinglist.database.ReadingList readingList, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Integer>> pageIdMap) {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\tR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsShareHelper$ExportedReadingList;", "", "list", "", "", "", "Lkotlinx/serialization/json/JsonElement;", "name", "description", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getList", "()Ljava/util/Map;", "getName", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class ExportedReadingList {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.util.Collection<kotlinx.serialization.json.JsonElement>> list = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        
        public ExportedReadingList(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.util.Collection<? extends kotlinx.serialization.json.JsonElement>> list, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.util.Collection<kotlinx.serialization.json.JsonElement>> getList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public ExportedReadingList() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsShareHelper$ExportedReadingListPage;", "", "lang", "", "title", "ns", "", "description", "thumbUrl", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getLang", "getNs", "()I", "getThumbUrl", "getTitle", "app.lib"})
    public static final class ExportedReadingListPage {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lang = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        private final int ns = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String thumbUrl = null;
        
        public ExportedReadingListPage(@org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String title, int ns, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String thumbUrl) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLang() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int getNs() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getThumbUrl() {
            return null;
        }
    }
}