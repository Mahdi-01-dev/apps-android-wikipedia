package org.wikipedia.history.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import org.wikipedia.history.HistoryEntry;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\bJ0\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0011J0\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\bJ\"\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010 \u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010!J\u001c\u0010\"\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0097@\u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010&\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/history/db/HistoryEntryDao;", "", "delete", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "(Lorg/wikipedia/history/HistoryEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBy", "authority", "", "lang", "namespace", "apiTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findEntryBy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findEntryBySearchTerm", "term", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDisplayTitles", "", "getHistoryCount", "", "startDate", "endDate", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryEntriesByRandom", "limit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "entries", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertEntry", "upsert", "app.lib"})
@androidx.room.Dao()
public abstract interface HistoryEntryDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertEntry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM HistoryEntry WHERE UPPER(displayTitle) LIKE UPPER(:term) ESCAPE \'\\\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findEntryBySearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.history.HistoryEntry> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM HistoryEntry WHERE authority = :authority AND lang = :lang AND apiTitle = :apiTitle LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findEntryBy(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.history.HistoryEntry> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM HistoryEntry ORDER BY RANDOM() DESC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHistoryEntriesByRandom(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.history.HistoryEntry>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM HistoryEntry WHERE authority = :authority AND lang = :lang AND apiTitle = :apiTitle AND timestamp = :timestamp LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findEntryBy(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.history.HistoryEntry> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM HistoryEntry WHERE timestamp BETWEEN :startDate AND :endDate ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHistoryCount(@org.jetbrains.annotations.Nullable()
    java.lang.Long startDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT DISTINCT displayTitle FROM HistoryEntry LIMIT 3")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDisplayTitles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM HistoryEntry")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHistoryCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM HistoryEntry")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM HistoryEntry WHERE authority = :authority AND lang = :lang AND namespace = :namespace AND apiTitle = :apiTitle")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBy(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.history.HistoryEntry> entries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object insert(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.history.HistoryEntry> entries, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object delete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object upsert(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
            return null;
        }
    }
}