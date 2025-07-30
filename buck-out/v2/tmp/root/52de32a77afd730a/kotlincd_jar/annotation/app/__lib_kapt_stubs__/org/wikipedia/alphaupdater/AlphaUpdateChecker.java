package org.wikipedia.alphaupdater;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.core.content.ContextCompat;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Request;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.recurring.RecurringTask;
import org.wikipedia.settings.PrefsIoUtil;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0094@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/alphaupdater/AlphaUpdateChecker;", "Lorg/wikipedia/recurring/RecurringTask;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "name", "", "getName", "()Ljava/lang/String;", "run", "", "lastRun", "Ljava/util/Date;", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRun", "", "showNotification", "Companion", "app.lib"})
public final class AlphaUpdateChecker extends org.wikipedia.recurring.RecurringTask {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "alpha-update-checker";
    private static final long RUN_INTERVAL_MILLI = 0L;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREFERENCE_KEY_ALPHA_COMMIT = "alpha_last_checked_commit";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ALPHA_BUILD_APK_URL = "https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ALPHA_BUILD_DATA_URL = "https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/rev-hash.txt";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.alphaupdater.AlphaUpdateChecker.Companion Companion = null;
    
    public AlphaUpdateChecker(@org.jetbrains.annotations.NotNull()
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
    
    private final void showNotification() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/alphaupdater/AlphaUpdateChecker$Companion;", "", "()V", "ALPHA_BUILD_APK_URL", "", "ALPHA_BUILD_DATA_URL", "PREFERENCE_KEY_ALPHA_COMMIT", "RUN_INTERVAL_MILLI", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}