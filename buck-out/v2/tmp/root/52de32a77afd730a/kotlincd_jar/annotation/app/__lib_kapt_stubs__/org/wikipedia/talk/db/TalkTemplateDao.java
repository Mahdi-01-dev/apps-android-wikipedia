package org.wikipedia.talk.db;

import androidx.room.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/talk/db/TalkTemplateDao;", "", "deleteTemplates", "", "ids", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTemplates", "Lorg/wikipedia/talk/db/TalkTemplate;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastOrderNumber", "getTemplateById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTemplate", "talkTemplate", "(Lorg/wikipedia/talk/db/TalkTemplate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTemplate", "updateTemplates", "list", "app.lib"})
@androidx.room.Dao()
public abstract interface TalkTemplateDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTemplate(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplate talkTemplate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTemplate(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplate talkTemplate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTemplates(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.talk.db.TalkTemplate> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM TalkTemplate ORDER BY `order`")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllTemplates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.talk.db.TalkTemplate>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM TalkTemplate WHERE `id` IN (:id)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTemplateById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.talk.db.TalkTemplate> $completion);
    
    @androidx.room.Query(value = "SELECT `order` FROM TalkTemplate WHERE `order` ORDER BY `order` DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLastOrderNumber(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM TalkTemplate WHERE `id` IN (:ids)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTemplates(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}