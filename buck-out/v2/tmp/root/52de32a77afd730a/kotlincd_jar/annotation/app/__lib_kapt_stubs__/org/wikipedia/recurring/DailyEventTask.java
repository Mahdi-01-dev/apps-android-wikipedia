package org.wikipedia.recurring;

import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.DailyStatsEvent;
import org.wikipedia.analytics.eventplatform.EventPlatformClient;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0094@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/recurring/DailyEventTask;", "Lorg/wikipedia/recurring/RecurringTask;", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "name", "", "getName", "()Ljava/lang/String;", "run", "", "lastRun", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRun", "", "app.lib"})
public final class DailyEventTask extends org.wikipedia.recurring.RecurringTask {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.WikipediaApp app = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    public DailyEventTask(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
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