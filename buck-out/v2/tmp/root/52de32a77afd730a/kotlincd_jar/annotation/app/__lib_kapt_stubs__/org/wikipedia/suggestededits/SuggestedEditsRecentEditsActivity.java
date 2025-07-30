package org.wikipedia.suggestededits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFragment;", "()V", "createFragment", "maybeShowOnboarding", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onUnreadNotification", "Companion", "app.lib"})
public final class SuggestedEditsRecentEditsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsRecentEditsActivity.Companion Companion = null;
    
    public SuggestedEditsRecentEditsActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.suggestededits.SuggestedEditsRecentEditsFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    private final void maybeShowOnboarding() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
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