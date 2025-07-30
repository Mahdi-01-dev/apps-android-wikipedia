package org.wikipedia.games.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import org.wikipedia.games.PlayTypes;
import java.time.LocalDate;
import java.time.Month;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u0014J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/games/db/DailyGameHistoryDao;", "", "delete", "", "dailyGameHistory", "Lorg/wikipedia/games/db/DailyGameHistory;", "(Lorg/wikipedia/games/db/DailyGameHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findGameHistoryByDate", "gameName", "", "language", "", "year", "month", "day", "(ILjava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findLastGameHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAverageScore", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentStreak", "getGameHistory", "", "getTotalGamesPlayed", "insert", "insertAll", "dailyGameHistories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app.lib"})
@androidx.room.Dao()
public abstract interface DailyGameHistoryDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.db.DailyGameHistory dailyGameHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.games.db.DailyGameHistory> dailyGameHistories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM DailyGameHistory ORDER BY year DESC, month DESC, day DESC, id DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findLastGameHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.games.db.DailyGameHistory> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM DailyGameHistory WHERE gameName = :gameName AND language = :language AND year = :year AND month = :month AND day = :day")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findGameHistoryByDate(int gameName, @org.jetbrains.annotations.NotNull()
    java.lang.String language, int year, int month, int day, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.games.db.DailyGameHistory> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM DailyGameHistory WHERE gameName = :gameName AND language = :language")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalGamesPlayed(int gameName, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT AVG(score) FROM DailyGameHistory WHERE gameName = :gameName AND language = :language")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAverageScore(int gameName, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM DailyGameHistory WHERE gameName = :gameName AND language = :language ORDER BY year DESC, month DESC, day DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGameHistory(int gameName, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.games.db.DailyGameHistory>> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.db.DailyGameHistory dailyGameHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.db.DailyGameHistory dailyGameHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentStreak(int gameName, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getCurrentStreak(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.db.DailyGameHistoryDao $this, int gameName, @org.jetbrains.annotations.NotNull()
        java.lang.String language, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
            return null;
        }
    }
}