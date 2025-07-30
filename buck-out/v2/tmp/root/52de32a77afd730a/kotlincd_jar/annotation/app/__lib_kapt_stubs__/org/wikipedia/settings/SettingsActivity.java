package org.wikipedia.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.json.JsonUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0002H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/settings/SettingsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/settings/SettingsFragment;", "()V", "app", "Lorg/wikipedia/WikipediaApp;", "initialFeedCardsEnabled", "", "", "initialFeedCardsOrder", "", "initialLanguageList", "", "createFragment", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class SettingsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.settings.SettingsFragment> {
    private java.lang.String initialLanguageList;
    private java.util.List<java.lang.Boolean> initialFeedCardsEnabled;
    private java.util.List<java.lang.Integer> initialFeedCardsOrder;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.WikipediaApp app = null;
    public static final int ACTIVITY_RESULT_LANGUAGE_CHANGED = 1;
    public static final int ACTIVITY_RESULT_FEED_CONFIGURATION_CHANGED = 2;
    public static final int ACTIVITY_RESULT_LOG_OUT = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.SettingsActivity.Companion Companion = null;
    
    public SettingsActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.settings.SettingsFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/SettingsActivity$Companion;", "", "()V", "ACTIVITY_RESULT_FEED_CONFIGURATION_CHANGED", "", "ACTIVITY_RESULT_LANGUAGE_CHANGED", "ACTIVITY_RESULT_LOG_OUT", "newIntent", "Landroid/content/Intent;", "ctx", "Landroid/content/Context;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context ctx) {
            return null;
        }
    }
}