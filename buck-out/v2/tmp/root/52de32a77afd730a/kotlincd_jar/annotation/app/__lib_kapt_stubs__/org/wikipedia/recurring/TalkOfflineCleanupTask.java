package org.wikipedia.recurring;

import android.content.Context;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0094@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/recurring/TalkOfflineCleanupTask;", "Lorg/wikipedia/recurring/RecurringTask;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "name", "", "getName", "()Ljava/lang/String;", "run", "", "lastRun", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRun", "", "Companion", "app.lib"})
public final class TalkOfflineCleanupTask extends org.wikipedia.recurring.RecurringTask {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CLEANUP_URL_SEARCH_KEY = "action=discussiontoolspageinfo";
    private static final long CLEANUP_MAX_AGE_DAYS = 7L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.recurring.TalkOfflineCleanupTask.Companion Companion = null;
    
    public TalkOfflineCleanupTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/recurring/TalkOfflineCleanupTask$Companion;", "", "()V", "CLEANUP_MAX_AGE_DAYS", "", "CLEANUP_URL_SEARCH_KEY", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}