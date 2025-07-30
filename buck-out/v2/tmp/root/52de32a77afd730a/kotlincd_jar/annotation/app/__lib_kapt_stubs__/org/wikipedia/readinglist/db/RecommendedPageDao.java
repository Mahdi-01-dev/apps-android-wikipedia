package org.wikipedia.readinglist.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.readinglist.database.RecommendedPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J\u001e\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/readinglist/db/RecommendedPageDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expireOldRecommendedPages", "findIfAny", "Lorg/wikipedia/readinglist/database/RecommendedPage;", "", "apiTitle", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpiredRecommendedPages", "", "limit", "list", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewRecommendedPages", "insert", "recommendedPages", "(Lorg/wikipedia/readinglist/database/RecommendedPage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAll", "app.lib"})
@androidx.room.Dao()
public abstract interface RecommendedPageDao {
    
    @androidx.room.Query(value = "SELECT * FROM RecommendedPage WHERE status = 0 ORDER BY timestamp DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNewRecommendedPages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.RecommendedPage>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM RecommendedPage WHERE status = 1 AND apiTitle NOT IN (:list) ORDER BY RANDOM() LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExpiredRecommendedPages(int limit, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.RecommendedPage>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.RecommendedPage recommendedPages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.RecommendedPage> recommendedPages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.RecommendedPage> recommendedPages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE RecommendedPage SET status = 1 WHERE status = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object expireOldRecommendedPages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM RecommendedPage WHERE apiTitle = :apiTitle AND wiki = :wiki")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findIfAny(@org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM RecommendedPage")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM RecommendedPage WHERE id = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.RecommendedPage findIfAny();
}