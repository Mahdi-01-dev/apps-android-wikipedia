package org.wikipedia.settings;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import org.wikipedia.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/settings/EditTextAutoSummarizePreference;", "Landroidx/preference/EditTextPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "autoSummarize", "", "onAttached", "", "persistString", "value", "", "updateAutoSummary", "Companion", "app.lib"})
public class EditTextAutoSummarizePreference extends androidx.preference.EditTextPreference {
    private final boolean autoSummarize = false;
    private static final boolean DEFAULT_AUTO_SUMMARIZE = true;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.EditTextAutoSummarizePreference.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads()
    public EditTextAutoSummarizePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EditTextAutoSummarizePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EditTextAutoSummarizePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null, null, 0, 0);
    }
    
    @java.lang.Override()
    public void onAttached() {
    }
    
    @java.lang.Override()
    protected boolean persistString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return false;
    }
    
    protected void updateAutoSummary(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/settings/EditTextAutoSummarizePreference$Companion;", "", "()V", "DEFAULT_AUTO_SUMMARIZE", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}