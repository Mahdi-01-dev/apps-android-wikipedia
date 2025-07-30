package org.wikipedia.settings;

import android.app.Activity;
import androidx.annotation.StringRes;
import androidx.annotation.XmlRes;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0004J\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0010H\u0004R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/settings/BasePreferenceLoader;", "Lorg/wikipedia/settings/PreferenceLoader;", "fragment", "Landroidx/preference/PreferenceFragmentCompat;", "(Landroidx/preference/PreferenceFragmentCompat;)V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "getFragment", "()Landroidx/preference/PreferenceFragmentCompat;", "clearPreferences", "", "findPreference", "Landroidx/preference/Preference;", "key", "", "loadPreferences", "id", "app.lib"})
public abstract class BasePreferenceLoader implements org.wikipedia.settings.PreferenceLoader {
    @org.jetbrains.annotations.NotNull()
    private final androidx.preference.PreferenceFragmentCompat fragment = null;
    
    public BasePreferenceLoader(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.preference.PreferenceFragmentCompat getFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.preference.Preference findPreference(@androidx.annotation.StringRes()
    int key) {
        return null;
    }
    
    protected final void loadPreferences(@androidx.annotation.XmlRes()
    int id) {
    }
    
    protected final void clearPreferences() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.app.Activity getActivity() {
        return null;
    }
}