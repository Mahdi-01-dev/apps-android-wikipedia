package org.wikipedia.history.db;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.RewriteQueriesToDropUnusedColumns;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.search.SearchResult;
import org.wikipedia.search.SearchResults;
import org.wikipedia.util.StringUtil;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0006J<\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\nH\u0002\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/history/db/HistoryEntryWithImageDao;", "", "filterHistoryItems", "", "searchQuery", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterHistoryItemsWithoutTime", "Lorg/wikipedia/history/HistoryEntry;", "findEntriesBy", "Lorg/wikipedia/history/db/HistoryEntryWithImage;", "excludeSource1", "", "excludeSource2", "excludeSource3", "minTimeSpent", "limit", "(IIIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findEntriesBySearchTerm", "term", "findEntryForReadMore", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findHistoryItem", "Lorg/wikipedia/search/SearchResults;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDateString", "date", "Ljava/util/Date;", "normalizedQuery", "toHistoryEntry", "entryWithImage", "app.lib"})
@androidx.room.Dao()
public abstract interface HistoryEntryWithImageDao {
    
    @androidx.room.Query(value = "SELECT HistoryEntry.*, PageImage.imageName, PageImage.description, PageImage.geoLat, PageImage.geoLon, PageImage.timeSpentSec FROM HistoryEntry LEFT OUTER JOIN PageImage ON (HistoryEntry.namespace = PageImage.namespace AND HistoryEntry.apiTitle = PageImage.apiTitle AND HistoryEntry.lang = PageImage.lang) INNER JOIN(SELECT lang, apiTitle, MAX(timestamp) as max_timestamp FROM HistoryEntry GROUP BY lang, apiTitle) LatestEntries ON HistoryEntry.apiTitle = LatestEntries.apiTitle AND HistoryEntry.timestamp = LatestEntries.max_timestamp WHERE UPPER(HistoryEntry.displayTitle) LIKE UPPER(:term) ESCAPE \'\\\' ORDER BY timestamp DESC")
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findEntriesBySearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.db.HistoryEntryWithImage>> $completion);
    
    @androidx.room.Query(value = "SELECT HistoryEntry.*, PageImage.imageName, PageImage.description, PageImage.geoLat, PageImage.geoLon, PageImage.timeSpentSec FROM HistoryEntry LEFT OUTER JOIN PageImage ON (HistoryEntry.namespace = PageImage.namespace AND HistoryEntry.apiTitle = PageImage.apiTitle AND HistoryEntry.lang = PageImage.lang) WHERE source != :excludeSource1 AND source != :excludeSource2 AND source != :excludeSource3 AND timeSpentSec >= :minTimeSpent ORDER BY timestamp DESC LIMIT :limit")
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findEntriesBy(int excludeSource1, int excludeSource2, int excludeSource3, int minTimeSpent, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.db.HistoryEntryWithImage>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findHistoryItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.search.SearchResults> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object filterHistoryItemsWithoutTime(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.HistoryEntry>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object filterHistoryItems(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.lang.Object>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findEntryForReadMore(int limit, int minTimeSpent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.HistoryEntry>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object findHistoryItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super org.wikipedia.search.SearchResults> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object filterHistoryItemsWithoutTime(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.HistoryEntry>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object filterHistoryItems(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<? extends java.lang.Object>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object findEntryForReadMore(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, int limit, int minTimeSpent, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.HistoryEntry>> $completion) {
            return null;
        }
        
        private static java.lang.String normalizedQuery(org.wikipedia.history.db.HistoryEntryWithImageDao $this, java.lang.String searchQuery) {
            return null;
        }
        
        private static org.wikipedia.history.HistoryEntry toHistoryEntry(org.wikipedia.history.db.HistoryEntryWithImageDao $this, org.wikipedia.history.db.HistoryEntryWithImage entryWithImage) {
            return null;
        }
        
        private static java.lang.String getDateString(org.wikipedia.history.db.HistoryEntryWithImageDao $this, java.util.Date date) {
            return null;
        }
    }
}