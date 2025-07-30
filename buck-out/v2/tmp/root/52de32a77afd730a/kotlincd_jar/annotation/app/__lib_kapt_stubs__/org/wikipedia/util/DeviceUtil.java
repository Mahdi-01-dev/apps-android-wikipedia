package org.wikipedia.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.MaterialToolbar;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u001e\"\u00020\u0018\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J \u0010(\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R+\u0010\b\u001a\u0014 \u000b*\t\u0018\u00010\t\u00a2\u0006\u0002\b\n0\t\u00a2\u0006\u0002\b\n*\u00020\f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/util/DeviceUtil;", "", "()V", "isAccessibilityEnabled", "", "()Z", "isNavigationBarShowing", "isOnWiFi", "insetsControllerCompat", "Landroidx/core/view/WindowInsetsControllerCompat;", "Lorg/jspecify/annotations/NonNull;", "kotlin.jvm.PlatformType", "Landroid/view/Window;", "getInsetsControllerCompat", "(Landroid/view/Window;)Landroidx/core/view/WindowInsetsControllerCompat;", "assertAppContext", "context", "Landroid/content/Context;", "terminateOnFail", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "isHardKeyboardAttached", "resources", "Landroid/content/res/Resources;", "setContextClickAsLongClick", "views", "", "([Landroid/view/View;)V", "setEdgeToEdge", "Landroidx/appcompat/app/AppCompatActivity;", "setLightSystemUiVisibility", "setNavigationBarColor", "window", "color", "", "showSoftKeyboard", "updateStatusBarTheme", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "reset", "app.lib"})
public final class DeviceUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.DeviceUtil INSTANCE = null;
    
    private DeviceUtil() {
        super();
    }
    
    private final androidx.core.view.WindowInsetsControllerCompat getInsetsControllerCompat(android.view.Window $this$insetsControllerCompat) {
        return null;
    }
    
    public final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final boolean isHardKeyboardAttached(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return false;
    }
    
    public final void setLightSystemUiVisibility(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void setNavigationBarColor(@org.jetbrains.annotations.NotNull()
    android.view.Window window, @androidx.annotation.ColorInt()
    int color) {
    }
    
    public final void updateStatusBarTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    com.google.android.material.appbar.MaterialToolbar toolbar, boolean reset) {
    }
    
    public final void setContextClickAsLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    /**
     * https://issuetracker.google.com/issues/160946170
     * There's a platform-specific issue where the app gets launched in "Restricted" mode during a
     * backup operation; And if the app crashes during that operation, it remains in Restricted
     * mode in subsequent launches, including subsequent user-requested launches. While in this
     * mode, the system doesn't actually launch our custom subclassed WikipediaApp object, but
     * instead uses a vanilla Application object, which will cause issues when other classes try
     * to access static data from the WikipediaApp object.
     *
     * This is a workaround that explicitly terminates the app process if it's running in Restricted
     * mode, to be used sparingly from places where this crash is most likely to occur.
     */
    public final boolean assertAppContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean terminateOnFail) {
        return false;
    }
    
    public final void setEdgeToEdge(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    public final boolean isOnWiFi() {
        return false;
    }
    
    public final boolean isNavigationBarShowing() {
        return false;
    }
    
    public final boolean isAccessibilityEnabled() {
        return false;
    }
}