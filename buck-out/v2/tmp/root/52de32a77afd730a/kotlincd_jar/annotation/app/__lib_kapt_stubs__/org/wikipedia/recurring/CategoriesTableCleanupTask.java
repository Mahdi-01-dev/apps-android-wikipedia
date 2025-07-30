package org.wikipedia.recurring;

import org.wikipedia.database.AppDatabase;
import org.wikipedia.util.log.L;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0094@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/recurring/CategoriesTableCleanupTask;", "Lorg/wikipedia/recurring/RecurringTask;", "()V", "name", "", "getName", "()Ljava/lang/String;", "run", "", "lastRun", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRun", "", "Companion", "app.lib"})
public final class CategoriesTableCleanupTask extends org.wikipedia.recurring.RecurringTask {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "categoriesTableCleanupTask";
    private static final int CLEANUP_TIME_IN_YEARS = 2;
    private static final long DAYS_BETWEEN_RUNS = 182L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.recurring.CategoriesTableCleanupTask.Companion Companion = null;
    
    public CategoriesTableCleanupTask() {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/recurring/CategoriesTableCleanupTask$Companion;", "", "()V", "CLEANUP_TIME_IN_YEARS", "", "DAYS_BETWEEN_RUNS", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}