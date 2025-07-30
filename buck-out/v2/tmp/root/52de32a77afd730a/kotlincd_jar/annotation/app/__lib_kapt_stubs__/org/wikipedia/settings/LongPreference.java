package org.wikipedia.settings;

import android.content.Context;
import android.util.AttributeSet;
import org.wikipedia.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0004J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/settings/LongPreference;", "Lorg/wikipedia/settings/EditTextAutoSummarizePreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "radix", "summaryFormat", "", "getSummaryFormat", "()Ljava/lang/String;", "setSummaryFormat", "(Ljava/lang/String;)V", "getPersistedString", "defaultRadixValue", "longToSummary", "value", "", "persistRadixString", "", "radixValue", "persistString", "radixStringToLong", "sanitizeRadixString", "updateAutoSummary", "", "Companion", "app.lib"})
public class LongPreference extends org.wikipedia.settings.EditTextAutoSummarizePreference {
    private int radix = 10;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String summaryFormat = "%d";
    private static final int DEFAULT_RADIX = 10;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DEFAULT_SUMMARY_FORMAT = "%d";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.LongPreference.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads()
    public LongPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public LongPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public LongPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public LongPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummaryFormat() {
        return null;
    }
    
    public final void setSummaryFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getPersistedString(@org.jetbrains.annotations.Nullable()
    java.lang.String defaultRadixValue) {
        return null;
    }
    
    @java.lang.Override()
    protected boolean persistString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return false;
    }
    
    @java.lang.Override()
    protected void updateAutoSummary(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    protected boolean persistRadixString(@org.jetbrains.annotations.Nullable()
    java.lang.String radixValue) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.String sanitizeRadixString(@org.jetbrains.annotations.Nullable()
    java.lang.String radixValue) {
        return null;
    }
    
    protected final long radixStringToLong(@org.jetbrains.annotations.Nullable()
    java.lang.String radixValue) {
        return 0L;
    }
    
    private final java.lang.String longToSummary(long value) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/settings/LongPreference$Companion;", "", "()V", "DEFAULT_RADIX", "", "DEFAULT_SUMMARY_FORMAT", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}