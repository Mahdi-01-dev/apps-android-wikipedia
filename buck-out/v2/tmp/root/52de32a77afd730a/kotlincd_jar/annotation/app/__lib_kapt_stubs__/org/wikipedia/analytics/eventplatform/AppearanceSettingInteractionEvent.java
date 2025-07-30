package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.theme.Theme;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/AppearanceSettingInteractionEvent;", "", "source", "Lorg/wikipedia/Constants$InvokeSource;", "(Lorg/wikipedia/Constants$InvokeSource;)V", "logFontSizeChange", "", "currentFontSize", "", "newFontSize", "logFontThemeChange", "currentFontFamily", "", "newFontFamily", "logReadingFocusMode", "newValue", "", "logThemeChange", "currentTheme", "Lorg/wikipedia/theme/Theme;", "newTheme", "submitEvent", "action", "currentValue", "AppearanceSettingInteractionEventImpl", "app.lib"})
public final class AppearanceSettingInteractionEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource source = null;
    
    public AppearanceSettingInteractionEvent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        super();
    }
    
    public final void logFontSizeChange(float currentFontSize, float newFontSize) {
    }
    
    public final void logThemeChange(@org.jetbrains.annotations.NotNull()
    org.wikipedia.theme.Theme currentTheme, @org.jetbrains.annotations.NotNull()
    org.wikipedia.theme.Theme newTheme) {
    }
    
    public final void logFontThemeChange(@org.jetbrains.annotations.Nullable()
    java.lang.String currentFontFamily, @org.jetbrains.annotations.Nullable()
    java.lang.String newFontFamily) {
    }
    
    public final void logReadingFocusMode(boolean newValue) {
    }
    
    private final void submitEvent(java.lang.String action, java.lang.String currentValue, java.lang.String newValue) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_app_appearance_settings_interaction/1.0.0")
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\tR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/AppearanceSettingInteractionEvent$AppearanceSettingInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "action", "", "currentValue", "newValue", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentValue$annotations", "()V", "getNewValue$annotations", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class AppearanceSettingInteractionEventImpl extends org.wikipedia.analytics.eventplatform.MobileAppsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currentValue = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String newValue = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = null;
        
        public AppearanceSettingInteractionEventImpl(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String currentValue, @org.jetbrains.annotations.NotNull()
        java.lang.String newValue, @org.jetbrains.annotations.NotNull()
        java.lang.String source) {
        }
        
        @kotlinx.serialization.SerialName(value = "current_value")
        @java.lang.Deprecated()
        private static void getCurrentValue$annotations() {
        }
        
        @kotlinx.serialization.SerialName(value = "new_value")
        @java.lang.Deprecated()
        private static void getNewValue$annotations() {
        }
    }
}