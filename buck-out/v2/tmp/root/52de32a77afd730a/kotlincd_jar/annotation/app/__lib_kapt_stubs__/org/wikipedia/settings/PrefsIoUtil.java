package org.wikipedia.settings;

import android.content.SharedPreferences;
import androidx.annotation.StringRes;
import androidx.preference.PreferenceManager;
import org.wikipedia.WikipediaApp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u0010\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u000bJ-\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0018J\u0018\u0010\u0017\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rJ\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\tJ\u0018\u0010\u001c\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\tJ\u0018\u0010\u001e\u001a\u00020\u001b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bJ\u0018\u0010\u001e\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u000bJ\u0018\u0010\u001f\u001a\u00020\u001b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0018J\u0018\u0010\u001f\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u0018J\u001a\u0010 \u001a\u00020\u001b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u001a\u0010 \u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rR\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/settings/PrefsIoUtil;", "", "()V", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPreferences", "()Landroid/content/SharedPreferences;", "contains", "", "id", "", "key", "", "edit", "Landroid/content/SharedPreferences$Editor;", "getBoolean", "defaultValue", "getInt", "getKey", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getLong", "", "getString", "remove", "", "setBoolean", "value", "setInt", "setLong", "setString", "app.lib"})
public final class PrefsIoUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.PrefsIoUtil INSTANCE = null;
    
    private PrefsIoUtil() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@androidx.annotation.StringRes()
    int id, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void setString(@androidx.annotation.StringRes()
    int id, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final long getLong(@androidx.annotation.StringRes()
    int id, long defaultValue) {
        return 0L;
    }
    
    public final void setLong(@androidx.annotation.StringRes()
    int id, long value) {
    }
    
    public final int getInt(@androidx.annotation.StringRes()
    int id, int defaultValue) {
        return 0;
    }
    
    public final void setInt(@androidx.annotation.StringRes()
    int id, int value) {
    }
    
    public final boolean getBoolean(@androidx.annotation.StringRes()
    int id, boolean defaultValue) {
        return false;
    }
    
    public final void setBoolean(@androidx.annotation.StringRes()
    int id, boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void setString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final long getLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    public final void setLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    public final void setInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    public final void setBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
    }
    
    public final void remove(@androidx.annotation.StringRes()
    int id) {
    }
    
    public final void remove(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public final boolean contains(@androidx.annotation.StringRes()
    int id) {
        return false;
    }
    
    public final boolean contains(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return false;
    }
    
    /**
     * @return Key String resource from preference_keys.xml.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey(@androidx.annotation.StringRes()
    int id, @org.jetbrains.annotations.NotNull()
    java.lang.Object... formatArgs) {
        return null;
    }
    
    private final android.content.SharedPreferences.Editor edit() {
        return null;
    }
    
    private final android.content.SharedPreferences getPreferences() {
        return null;
    }
}