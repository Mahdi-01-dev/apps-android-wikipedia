package org.wikipedia.talk.template;

import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.talk.db.TalkTemplateDao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0013\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesRepository;", "", "talkTemplateDao", "Lorg/wikipedia/talk/db/TalkTemplateDao;", "(Lorg/wikipedia/talk/db/TalkTemplateDao;)V", "deleteTemplates", "", "talkTemplates", "", "Lorg/wikipedia/talk/db/TalkTemplate;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTemplates", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastOrderNumber", "", "insertTemplate", "talkTemplate", "(Lorg/wikipedia/talk/db/TalkTemplate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTemplate", "updateTemplates", "app.lib"})
public final class TalkTemplatesRepository {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.db.TalkTemplateDao talkTemplateDao = null;
    
    public TalkTemplatesRepository(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplateDao talkTemplateDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllTemplates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.talk.db.TalkTemplate>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTemplate(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplate talkTemplate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLastOrderNumber(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTemplate(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplate talkTemplate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTemplates(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.talk.db.TalkTemplate> talkTemplates, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTemplates(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.talk.db.TalkTemplate> talkTemplates, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}