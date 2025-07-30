package org.wikipedia.search;

import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.databinding.FragmentSearchBinding;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.places.PlacesActivity;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.search.db.RecentSearch;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.settings.languages.WikipediaLanguagesFragment;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.LanguageScrollView;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\t\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001bB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020\u0013H\u0016J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020\u001eH\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J*\u00105\u001a\u00020-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020-H\u0016J\u0012\u0010=\u001a\u00020-2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J$\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0002J\b\u0010H\u001a\u00020-H\u0016J\u0010\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020\u0013H\u0016J\b\u0010K\u001a\u00020-H\u0016J\u0018\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0017H\u0016J\b\u0010P\u001a\u00020-H\u0002J\u0018\u0010Q\u001a\u00020-2\u0006\u0010R\u001a\u00020S2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020\u0017H\u0016J\b\u0010V\u001a\u00020-H\u0016J\b\u0010W\u001a\u00020-H\u0002J\u0010\u0010X\u001a\u00020-2\u0006\u0010Y\u001a\u00020ZH\u0016J\u000e\u0010[\u001a\u00020-2\u0006\u00109\u001a\u00020\nJ\u0010\u0010\\\u001a\u00020-2\u0006\u0010]\u001a\u00020\nH\u0002J\u001a\u0010^\u001a\u00020-2\b\u0010_\u001a\u0004\u0018\u00010\u00132\u0006\u0010`\u001a\u00020\u0017H\u0002J\u0010\u0010a\u001a\u00020-2\u0006\u0010Y\u001a\u00020\u0013H\u0016R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lorg/wikipedia/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/search/SearchResultsFragment$Callback;", "Lorg/wikipedia/search/RecentSearchesFragment$Callback;", "Lorg/wikipedia/views/LanguageScrollView$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "activePanel", "", "getActivePanel", "()I", "app", "Lorg/wikipedia/WikipediaApp;", "binding", "getBinding", "()Lerror/NonExistentClass;", "initialLanguageList", "", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isSearchActive", "", "langBtnClicked", "query", "recentSearchesFragment", "Lorg/wikipedia/search/RecentSearchesFragment;", "requestAddLanguageLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "returnLink", "searchCloseListener", "Landroidx/appcompat/widget/SearchView$OnCloseListener;", "<set-?>", "searchLanguageCode", "getSearchLanguageCode", "()Ljava/lang/String;", "searchQueryListener", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "searchResultsFragment", "Lorg/wikipedia/search/SearchResultsFragment;", "tempLangCodeHolder", "addRecentSearch", "", "title", "closeSearch", "getLangCode", "handleIntent", "intent", "initLangButton", "initSearchView", "navigateToTitle", "item", "Lorg/wikipedia/page/PageTitle;", "inNewTab", "position", "location", "Landroid/location/Location;", "onAddLanguageClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onLangButtonClick", "onLanguageButtonClicked", "onLanguageTabSelected", "selectedLanguageCode", "onPause", "onSearchAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "onSearchContainerClick", "onSearchMovePageToList", "sourceReadingListId", "", "onSearchProgressBar", "enabled", "onStart", "openSearch", "setSearchText", "text", "", "setUpLanguageScroll", "showPanel", "panel", "startSearch", "term", "force", "switchToSearch", "Companion", "app.lib"})
public final class SearchFragment extends androidx.fragment.app.Fragment implements org.wikipedia.search.SearchResultsFragment.Callback, org.wikipedia.search.RecentSearchesFragment.Callback, org.wikipedia.views.LanguageScrollView.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentSearchBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.WikipediaApp app;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tempLangCodeHolder;
    private boolean langBtnClicked = false;
    private boolean isSearchActive = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String query;
    private boolean returnLink = false;
    private org.wikipedia.search.RecentSearchesFragment recentSearchesFragment;
    private org.wikipedia.search.SearchResultsFragment searchResultsFragment;
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private java.lang.String initialLanguageList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchLanguageCode;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.SearchView.OnCloseListener searchCloseListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.SearchView.OnQueryTextListener searchQueryListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestAddLanguageLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_QUERY = "lastQuery";
    private static final int PANEL_RECENT_SEARCHES = 0;
    private static final int PANEL_SEARCH_RESULTS = 1;
    private static final long INTENT_DELAY_MILLIS = 500L;
    public static final int RESULT_LANG_CHANGED = 98;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.search.SearchFragment.Companion Companion = null;
    
    public SearchFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchLanguageCode() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    public final void setUpLanguageScroll(int position) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void switchToSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onAddLanguageClicked() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLangCode() {
        return null;
    }
    
    @java.lang.Override()
    public void setSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void navigateToTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle item, boolean inNewTab, int position, @org.jetbrains.annotations.Nullable()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onSearchAddPageToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
    }
    
    @java.lang.Override()
    public void onSearchMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onSearchProgressBar(boolean enabled) {
    }
    
    private final void onSearchContainerClick() {
    }
    
    private final void onLangButtonClick() {
    }
    
    private final void startSearch(java.lang.String term, boolean force) {
    }
    
    private final void openSearch() {
    }
    
    private final void closeSearch() {
    }
    
    private final void showPanel(int panel) {
    }
    
    private final int getActivePanel() {
        return 0;
    }
    
    private final void initSearchView() {
    }
    
    private final void initLangButton() {
    }
    
    private final void addRecentSearch(java.lang.String title) {
    }
    
    @java.lang.Override()
    public void onLanguageTabSelected(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedLanguageCode) {
    }
    
    @java.lang.Override()
    public void onLanguageButtonClicked() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/search/SearchFragment$Companion;", "", "()V", "ARG_QUERY", "", "INTENT_DELAY_MILLIS", "", "PANEL_RECENT_SEARCHES", "", "PANEL_SEARCH_RESULTS", "RESULT_LANG_CHANGED", "newInstance", "Lorg/wikipedia/search/SearchFragment;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "query", "returnLink", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.search.SearchFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
        java.lang.String query, boolean returnLink) {
            return null;
        }
    }
}