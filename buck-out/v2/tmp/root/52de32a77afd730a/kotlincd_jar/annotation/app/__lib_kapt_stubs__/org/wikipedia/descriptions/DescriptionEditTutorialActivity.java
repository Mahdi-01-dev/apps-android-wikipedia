package org.wikipedia.descriptions;

import android.content.Context;
import android.content.Intent;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.onboarding.OnboardingFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditTutorialActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment;", "Lorg/wikipedia/onboarding/OnboardingFragment$Callback;", "()V", "createFragment", "onComplete", "", "onSkip", "Companion", "app.lib"})
public final class DescriptionEditTutorialActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.descriptions.DescriptionEditTutorialFragment> implements org.wikipedia.onboarding.OnboardingFragment.Callback {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOULD_SHOW_AI_ON_BOARDING = "showAIOnBoarding";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditTutorialActivity.Companion Companion = null;
    
    public DescriptionEditTutorialActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onSkip() {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected org.wikipedia.descriptions.DescriptionEditTutorialFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditTutorialActivity$Companion;", "", "()V", "SHOULD_SHOW_AI_ON_BOARDING", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "showAIOnBoarding", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean showAIOnBoarding) {
            return null;
        }
    }
}