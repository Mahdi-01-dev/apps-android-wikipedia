package org.wikipedia.games.onthisday;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.databinding.ActivityOnThisDayGameBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.main.MainActivity;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.UriUtil;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010!\u001a\u00020\u000eJ\u0006\u0010\"\u001a\u00020\u000eJ\b\u0010#\u001a\u00020\u000eH\u0002J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006("}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/activity/BaseActivity$Callback;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "viewModel", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "getViewModel", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "goToMainTab", "", "hideAppBarDateText", "isGameMenuFragmentVisible", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onFinish", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPermissionResult", "activity", "isGranted", "onPrepareOptionsMenu", "requestPermissionAndScheduleGameNotification", "showAppBarDateText", "showPauseDialog", "updateAppBarDateText", "text", "", "Companion", "app.lib"})
public final class OnThisDayGameActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.activity.BaseActivity.Callback {
    private ActivityOnThisDayGameBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGameActivity.Companion Companion = null;
    
    public OnThisDayGameActivity() {
        super();
    }
    
    private final org.wikipedia.games.onthisday.OnThisDayGameViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void hideAppBarDateText() {
    }
    
    public final void showAppBarDateText() {
    }
    
    public final void updateAppBarDateText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onPermissionResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.activity.BaseActivity activity, boolean isGranted) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final boolean isGameMenuFragmentVisible() {
        return false;
    }
    
    private final void onFinish() {
    }
    
    private final void goToMainTab() {
    }
    
    private final void showPauseDialog() {
    }
    
    public final void requestPermissionAndScheduleGameNotification() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite) {
            return null;
        }
    }
}