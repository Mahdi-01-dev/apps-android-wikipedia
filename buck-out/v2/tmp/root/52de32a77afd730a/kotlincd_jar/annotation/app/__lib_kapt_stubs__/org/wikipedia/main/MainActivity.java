package org.wikipedia.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.ActivityMainBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.FeedFragment;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.onboarding.InitialOnboardingActivity;
import org.wikipedia.page.PageActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u001f\u001a\u00020\u000eH\u0014J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\tH\u0016R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/main/MainActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/main/MainFragment;", "Lorg/wikipedia/main/MainFragment$Callback;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "controlNavTabInFragment", "", "onboardingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "clearToolbarElevation", "", "createFragment", "getToolbar", "Landroidx/appcompat/widget/Toolbar;", "handleIntent", "intent", "inflateAndSetContentView", "isCurrentFragmentSelected", "f", "Landroidx/fragment/app/Fragment;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGoOffline", "onGoOnline", "onNewIntent", "onResume", "onSupportActionModeFinished", "mode", "Landroidx/appcompat/view/ActionMode;", "onSupportActionModeStarted", "onTabChanged", "tab", "Lorg/wikipedia/navtab/NavTab;", "onUnreadNotification", "setToolbarElevationDefault", "updateToolbarElevation", "elevate", "Companion", "app.lib"})
public final class MainActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.main.MainFragment> implements org.wikipedia.main.MainFragment.Callback {
    private ActivityMainBinding binding;
    private boolean controlNavTabInFragment = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> onboardingLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.main.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void inflateAndSetContentView() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected org.wikipedia.main.MainFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onTabChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.navtab.NavTab tab) {
    }
    
    @java.lang.Override()
    public void onSupportActionModeStarted(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void onSupportActionModeFinished(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void updateToolbarElevation(boolean elevate) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onGoOffline() {
    }
    
    @java.lang.Override()
    public void onGoOnline() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    public final boolean isCurrentFragmentSelected(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment f) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    private final void setToolbarElevationDefault() {
    }
    
    private final void clearToolbarElevation() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
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