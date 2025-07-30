package org.wikipedia.recurring;

import org.wikipedia.readinglist.recommended.RecommendedReadingListAbTest;
import org.wikipedia.readinglist.recommended.RecommendedReadingListHelper;
import org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency;
import org.wikipedia.settings.Prefs;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0094@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/recurring/RecommendedReadingListTask;", "Lorg/wikipedia/recurring/RecurringTask;", "()V", "name", "", "getName", "()Ljava/lang/String;", "run", "", "lastRun", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRun", "", "app.lib"})
public final class RecommendedReadingListTask extends org.wikipedia.recurring.RecurringTask {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "generateRecommendedReadingListTask";
    
    public RecommendedReadingListTask() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    protected boolean shouldRun(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object run(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}