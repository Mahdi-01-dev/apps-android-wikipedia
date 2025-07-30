package org.wikipedia.readinglist.recommended;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.events.NewRecommendedReadingListEvent;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/activity/BaseActivity$Callback;", "()V", "currentRecommendedReadingListSource", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "recommendedReadingListInterestsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "recommendedReadingListSourceLauncher", "viewModel", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsViewModel;", "getViewModel", "()Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionResult", "activity", "isGranted", "", "requestPermissionAndScheduleRecommendedReadingNotification", "showSnackBar", "recommendedReadingListSource", "onAction", "Lkotlin/Function0;", "Companion", "app.lib"})
public final class RecommendedReadingListSettingsActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.activity.BaseActivity.Callback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private org.wikipedia.readinglist.recommended.RecommendedReadingListSource currentRecommendedReadingListSource;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> recommendedReadingListSourceLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> recommendedReadingListInterestsLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsActivity.Companion Companion = null;
    
    public RecommendedReadingListSettingsActivity() {
        super();
    }
    
    private final org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPermissionResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.activity.BaseActivity activity, boolean isGranted) {
    }
    
    private final void requestPermissionAndScheduleRecommendedReadingNotification() {
    }
    
    private final void showSnackBar(org.wikipedia.readinglist.recommended.RecommendedReadingListSource recommendedReadingListSource, kotlin.jvm.functions.Function0<kotlin.Unit> onAction) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}