package org.wikipedia.settings.dev;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.games.onthisday.OnThisDayGameNotificationManager;
import org.wikipedia.games.onthisday.OnThisDayGameNotificationState;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.notifications.NotificationPollBroadcastReceiver;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.recommended.RecommendedReadingListNotificationManager;
import org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency;
import org.wikipedia.settings.BasePreferenceLoader;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.dev.playground.CategoryDeveloperPlayGround;
import org.wikipedia.setupLeakCanary;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.FeedbackUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0012\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\u0016\u0010\u0019\u001a\u00020\r*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/settings/dev/DeveloperSettingsPreferenceLoader;", "Lorg/wikipedia/settings/BasePreferenceLoader;", "fragment", "Landroidx/preference/PreferenceFragmentCompat;", "(Landroidx/preference/PreferenceFragmentCompat;)V", "setMediaWikiBaseUriChangeListener", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "setMediaWikiMultiLangSupportChangeListener", "createTestReadingList", "", "listName", "", "numOfLists", "", "numOfArticles", "deleteTestReadingList", "filterPreferenceGroupItems", "", "preference", "Landroidx/preference/Preference;", "query", "filterPreferences", "loadPreferences", "resetMediaWikiSettings", "setUpMediaWikiSettings", "toIntOrDefault", "", "defaultValue", "Companion", "TestException", "app.lib"})
public final class DeveloperSettingsPreferenceLoader extends org.wikipedia.settings.BasePreferenceLoader {
    @org.jetbrains.annotations.NotNull()
    private final androidx.preference.Preference.OnPreferenceChangeListener setMediaWikiBaseUriChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.preference.Preference.OnPreferenceChangeListener setMediaWikiMultiLangSupportChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TEXT_OF_TEST_READING_LIST = "Test reading list";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TEXT_OF_READING_LIST = "Reading list";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.dev.DeveloperSettingsPreferenceLoader.Companion Companion = null;
    
    public DeveloperSettingsPreferenceLoader(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat fragment) {
        super(null);
    }
    
    public final void filterPreferences(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    private final boolean filterPreferenceGroupItems(androidx.preference.Preference preference, java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public void loadPreferences() {
    }
    
    private final void setUpMediaWikiSettings() {
    }
    
    private final void resetMediaWikiSettings() {
    }
    
    private final void createTestReadingList(java.lang.String listName, int numOfLists, int numOfArticles) {
    }
    
    private final void deleteTestReadingList(java.lang.String listName, int numOfLists) {
    }
    
    private final int toIntOrDefault(java.lang.Object $this$toIntOrDefault, int defaultValue) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/settings/dev/DeveloperSettingsPreferenceLoader$Companion;", "", "()V", "TEXT_OF_READING_LIST", "", "TEXT_OF_TEST_READING_LIST", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/settings/dev/DeveloperSettingsPreferenceLoader$TestException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "app.lib"})
    static final class TestException extends java.lang.RuntimeException {
        
        public TestException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
    }
}