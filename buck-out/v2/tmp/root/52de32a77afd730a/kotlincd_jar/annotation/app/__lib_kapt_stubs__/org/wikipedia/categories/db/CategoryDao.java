package org.wikipedia.categories.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u001e\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0097@\u00a2\u0006\u0002\u0010\u001c\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/categories/db/CategoryDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOlderThan", "", "year", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByPrimaryKey", "Lorg/wikipedia/categories/db/Category;", "month", "title", "", "lang", "(IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCategories", "", "getCategoriesByTimeRange", "startYear", "endYear", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "category", "(Lorg/wikipedia/categories/db/Category;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCountByPrimaryKeys", "upsertAll", "list", "app.lib"})
@androidx.room.Dao()
public abstract interface CategoryDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.wikipedia.categories.db.Category category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.categories.db.Category> categories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Category WHERE year = :year AND month = :month AND title = :title AND lang = :lang")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByPrimaryKey(int year, int month, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.categories.db.Category> $completion);
    
    @androidx.room.Query(value = "UPDATE Category SET count = count + 1 WHERE year = :year AND month = :month AND title = :title AND lang = :lang")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCountByPrimaryKeys(int year, int month, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT year, month, title, lang, SUM (count) AS count FROM Category WHERE year BETWEEN :startYear AND :endYear GROUP BY title, lang ORDER BY count DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategoriesByTimeRange(int startYear, int endYear, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.categories.db.Category>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Category")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.categories.db.Category>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Category")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Category WHERE rowid IN (SELECT rowid FROM Category WHERE year < :year)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOlderThan(int year, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.categories.db.Category> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object upsertAll(@org.jetbrains.annotations.NotNull()
        org.wikipedia.categories.db.CategoryDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.categories.db.Category> list, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}