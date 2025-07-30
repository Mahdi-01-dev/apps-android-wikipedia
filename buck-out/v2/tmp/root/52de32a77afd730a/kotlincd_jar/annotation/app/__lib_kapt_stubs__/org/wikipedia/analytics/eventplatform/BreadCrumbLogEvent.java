package org.wikipedia.analytics.eventplatform;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.settings.SettingsActivity;
import org.wikipedia.util.log.L;

@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_breadcrumbs_event/1.1.0")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/BreadCrumbLogEvent;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "screen_name", "", "action", "(Ljava/lang/String;Ljava/lang/String;)V", "app_primary_language_code", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused", "CanBeParameter"})
public final class BreadCrumbLogEvent extends org.wikipedia.analytics.eventplatform.MobileAppsEventWithTemp {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String screen_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String app_primary_language_code = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STREAM_NAME = "android.breadcrumbs_event";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent.Companion Companion = null;
    
    public BreadCrumbLogEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String screen_name, @org.jetbrains.annotations.NotNull()
    java.lang.String action) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/BreadCrumbLogEvent$Companion;", "", "()V", "STREAM_NAME", "", "logBackPress", "", "context", "Landroid/content/Context;", "logClick", "item", "Landroid/view/MenuItem;", "view", "Landroid/view/View;", "composableName", "logImpression", "name", "logInputField", "logLongClick", "logScreenShown", "fragment", "Landroidx/fragment/app/Fragment;", "logSettingsSelection", "title", "newValue", "logTooltipShown", "anchor", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void logClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void logClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
        }
        
        public final void logClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String composableName) {
        }
        
        public final void logLongClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void logScreenShown(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment fragment) {
        }
        
        public final void logImpression(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        public final void logBackPress(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void logTooltipShown(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View anchor) {
        }
        
        public final void logSettingsSelection(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.Object newValue) {
        }
        
        public final void logInputField(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
}