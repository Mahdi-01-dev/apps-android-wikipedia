package org.wikipedia.settings;

import android.content.Context;
import android.util.AttributeSet;
import org.wikipedia.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/settings/IntPreference;", "Lorg/wikipedia/settings/LongPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getPersistedString", "", "defaultRadixValue", "intToSummary", "value", "persistRadixString", "", "radixValue", "radixStringToInt", "sanitizeRadixString", "app.lib"})
public class IntPreference extends org.wikipedia.settings.LongPreference {
    
    @kotlin.jvm.JvmOverloads()
    public IntPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public IntPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public IntPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public IntPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null, null, 0, 0);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getPersistedString(@org.jetbrains.annotations.Nullable()
    java.lang.String defaultRadixValue) {
        return null;
    }
    
    @java.lang.Override()
    protected boolean persistRadixString(@org.jetbrains.annotations.Nullable()
    java.lang.String radixValue) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String sanitizeRadixString(@org.jetbrains.annotations.Nullable()
    java.lang.String radixValue) {
        return null;
    }
    
    private final int radixStringToInt(java.lang.String radixValue) {
        return 0;
    }
    
    private final java.lang.String intToSummary(int value) {
        return null;
    }
}