package org.wikipedia.theme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import org.wikipedia.Constants;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/theme/ThemeFittingRoomActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/theme/ThemeFittingRoomFragment;", "Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "()V", "themeChooserDialog", "Lorg/wikipedia/theme/ThemeChooserDialog;", "createFragment", "onCancelThemeChooser", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEditingPrefsChanged", "onToggleDimImages", "onToggleReadingFocusMode", "Companion", "app.lib"})
public final class ThemeFittingRoomActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.theme.ThemeFittingRoomFragment> implements org.wikipedia.theme.ThemeChooserDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.theme.ThemeChooserDialog themeChooserDialog;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.theme.ThemeFittingRoomActivity.Companion Companion = null;
    
    public ThemeFittingRoomActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected org.wikipedia.theme.ThemeFittingRoomFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onToggleDimImages() {
    }
    
    @java.lang.Override()
    public void onToggleReadingFocusMode() {
    }
    
    @java.lang.Override()
    public void onCancelThemeChooser() {
    }
    
    @java.lang.Override()
    public void onEditingPrefsChanged() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/theme/ThemeFittingRoomActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
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