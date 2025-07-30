package org.wikipedia.recurring;

import org.wikipedia.settings.Prefs;
import org.wikipedia.util.log.L;
import java.util.Date;

/**
 * Represents a task that needs to be run periodically.
 *
 * Usually an expensive task, that is run Async. Do not do anything
 * that requires access to the UI thread on these tasks.
 *
 * Since it is an expensive task, there's a separate method that detects
 * if the task should be run or not, and then runs it if necessary. The
 * last run times are tracked automatically by the base class.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\bH\u00a4@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/recurring/RecurringTask;", "", "()V", "absoluteTime", "", "getAbsoluteTime", "()J", "lastRunDate", "Ljava/util/Date;", "getLastRunDate", "()Ljava/util/Date;", "name", "", "getName", "()Ljava/lang/String;", "millisSinceLastRun", "lastRun", "run", "", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runIfNecessary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRun", "", "app.lib"})
public abstract class RecurringTask {
    
    public RecurringTask() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object runIfNecessary(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    protected abstract boolean shouldRun(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object run(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getName();
    
    protected final long getAbsoluteTime() {
        return 0L;
    }
    
    private final java.util.Date getLastRunDate() {
        return null;
    }
    
    protected final long millisSinceLastRun(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun) {
        return 0L;
    }
}