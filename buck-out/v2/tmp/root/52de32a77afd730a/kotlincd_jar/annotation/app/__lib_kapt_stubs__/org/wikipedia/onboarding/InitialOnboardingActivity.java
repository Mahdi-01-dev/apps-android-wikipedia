package org.wikipedia.onboarding;

import android.content.Context;
import android.content.Intent;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/onboarding/InitialOnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingFragment$Callback;", "()V", "createFragment", "onBackPressed", "", "onComplete", "onSkip", "Companion", "app.lib"})
public final class InitialOnboardingActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.onboarding.InitialOnboardingFragment> implements org.wikipedia.onboarding.OnboardingFragment.Callback {
    public static final int RESULT_LANGUAGE_CHANGED = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.onboarding.InitialOnboardingActivity.Companion Companion = null;
    
    public InitialOnboardingActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onSkip() {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected org.wikipedia.onboarding.InitialOnboardingFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingActivity$Companion;", "", "()V", "RESULT_LANGUAGE_CHANGED", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
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