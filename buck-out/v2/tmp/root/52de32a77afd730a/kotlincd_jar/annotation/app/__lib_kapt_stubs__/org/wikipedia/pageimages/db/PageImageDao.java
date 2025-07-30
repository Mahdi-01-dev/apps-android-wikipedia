package org.wikipedia.pageimages.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import org.wikipedia.history.HistoryEntry;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0010J>\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0097@\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0097@\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/pageimages/db/PageImageDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findItemsBy", "", "Lorg/wikipedia/pageimages/db/PageImage;", "lang", "", "namespace", "apiTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPageImages", "insertPageImage", "pageImage", "(Lorg/wikipedia/pageimages/db/PageImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertForMetadata", "entry", "Lorg/wikipedia/history/HistoryEntry;", "imageName", "description", "geoLat", "", "geoLon", "(Lorg/wikipedia/history/HistoryEntry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertForTimeSpent", "timeSpent", "", "(Lorg/wikipedia/history/HistoryEntry;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
@androidx.room.Dao()
public abstract interface PageImageDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertPageImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.pageimages.db.PageImage pageImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM PageImage")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllPageImages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.pageimages.db.PageImage>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM PageImage WHERE lang = :lang AND namespace = :namespace AND apiTitle = :apiTitle")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findItemsBy(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.pageimages.db.PageImage>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM PageImage")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsertForTimeSpent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, int timeSpent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsertForMetadata(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.Nullable()
    java.lang.String imageName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Double geoLat, @org.jetbrains.annotations.Nullable()
    java.lang.Double geoLon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object upsertForTimeSpent(@org.jetbrains.annotations.NotNull()
        org.wikipedia.pageimages.db.PageImageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, int timeSpent, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object upsertForMetadata(@org.jetbrains.annotations.NotNull()
        org.wikipedia.pageimages.db.PageImageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.Nullable()
        java.lang.String imageName, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.Double geoLat, @org.jetbrains.annotations.Nullable()
        java.lang.Double geoLon, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}