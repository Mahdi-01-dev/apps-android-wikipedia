package org.wikipedia.talk.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/talk/db/TalkPageSeenDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTalkPageSeen", "sha", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lorg/wikipedia/talk/db/TalkPageSeen;", "getTalkPageSeen", "insertTalkPageSeen", "talkPageSeen", "(Lorg/wikipedia/talk/db/TalkPageSeen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
@androidx.room.Dao()
public abstract interface TalkPageSeenDao {
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTalkPageSeen(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkPageSeen talkPageSeen, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM TalkPageSeen WHERE sha = :sha LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.talk.db.TalkPageSeen getTalkPageSeen(@org.jetbrains.annotations.NotNull()
    java.lang.String sha);
    
    @androidx.room.Query(value = "SELECT * FROM TalkPageSeen")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<org.wikipedia.talk.db.TalkPageSeen>> getAll();
    
    @androidx.room.Query(value = "DELETE FROM TalkPageSeen WHERE sha = :sha")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTalkPageSeen(@org.jetbrains.annotations.NotNull()
    java.lang.String sha, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM TalkPageSeen")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}