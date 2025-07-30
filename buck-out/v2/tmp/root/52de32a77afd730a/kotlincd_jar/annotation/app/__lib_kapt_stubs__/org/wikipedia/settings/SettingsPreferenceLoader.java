package org.wikipedia.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.BuildConfig;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.feed.configure.ConfigureActivity;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.readinglist.recommended.RecommendedReadingListAbTest;
import org.wikipedia.readinglist.recommended.RecommendedReadingListOnboardingActivity;
import org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsActivity;
import org.wikipedia.readinglist.recommended.RecommendedReadingListSource;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.theme.ThemeFittingRoomActivity;
import org.wikipedia.util.FeedbackUtil;

/**
 * UI code for app settings used by PreferenceFragment.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/settings/SettingsPreferenceLoader;", "Lorg/wikipedia/settings/BasePreferenceLoader;", "fragment", "Landroidx/preference/PreferenceFragmentCompat;", "(Landroidx/preference/PreferenceFragmentCompat;)V", "deviceInformation", "", "loadPreferences", "", "setupDeleteLocalDonationHistoryPreference", "updateLanguagePrefSummary", "updateRecommendedReadingListSummary", "updateSyncReadingListsPrefSummary", "DeleteRemoteListsYesListener", "SyncReadingListsListener", "app.lib"})
public final class SettingsPreferenceLoader extends org.wikipedia.settings.BasePreferenceLoader {
    
    public SettingsPreferenceLoader(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat fragment) {
        super(null);
    }
    
    @java.lang.Override()
    public void loadPreferences() {
    }
    
    private final java.lang.String deviceInformation() {
        return null;
    }
    
    private final void setupDeleteLocalDonationHistoryPreference() {
    }
    
    public final void updateLanguagePrefSummary() {
    }
    
    public final void updateRecommendedReadingListSummary() {
    }
    
    public final void updateSyncReadingListsPrefSummary() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/SettingsPreferenceLoader$DeleteRemoteListsYesListener;", "Landroid/content/DialogInterface$OnClickListener;", "preference", "Landroidx/preference/Preference;", "(Lorg/wikipedia/settings/SettingsPreferenceLoader;Landroidx/preference/Preference;)V", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "app.lib"})
    final class DeleteRemoteListsYesListener implements android.content.DialogInterface.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final androidx.preference.Preference preference = null;
        
        public DeleteRemoteListsYesListener(@org.jetbrains.annotations.NotNull()
        androidx.preference.Preference preference) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.content.DialogInterface dialog, int which) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/settings/SettingsPreferenceLoader$SyncReadingListsListener;", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "(Lorg/wikipedia/settings/SettingsPreferenceLoader;)V", "onPreferenceChange", "", "preference", "Landroidx/preference/Preference;", "newValue", "", "app.lib"})
    final class SyncReadingListsListener implements androidx.preference.Preference.OnPreferenceChangeListener {
        
        public SyncReadingListsListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onPreferenceChange(@org.jetbrains.annotations.NotNull()
        androidx.preference.Preference preference, @org.jetbrains.annotations.NotNull()
        java.lang.Object newValue) {
            return false;
        }
    }
}