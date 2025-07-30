package org.wikipedia.language.addlanguages;

import androidx.lifecycle.ViewModel;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.mwapi.SiteMatrix;
import org.wikipedia.util.UiState;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010 \u001a\u00020\u000fH\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/language/addlanguages/AddLanguagesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_siteInfoList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix$SiteInfo;", "_uiState", "Lorg/wikipedia/util/UiState;", "Lorg/wikipedia/language/addlanguages/LanguageListItem;", "fetchJob", "Lkotlinx/coroutines/Job;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "nonSuggestedLanguageCodes", "", "suggestedLanguageCodes", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addFilteredLanguageListItems", "", "filter", "codes", "headerText", "results", "", "fetchAllData", "getCanonicalName", "code", "getFilteredLanguageList", "searchTerm", "updateSearchTerm", "term", "app.lib"})
public final class AddLanguagesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> suggestedLanguageCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> nonSuggestedLanguageCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<org.wikipedia.dataclient.mwapi.SiteMatrix.SiteInfo>> _siteInfoList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.language.addlanguages.LanguageListItem>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.language.addlanguages.LanguageListItem>>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job fetchJob;
    
    public AddLanguagesViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.language.addlanguages.LanguageListItem>>> getUiState() {
        return null;
    }
    
    public final void fetchAllData() {
    }
    
    public final void updateSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term) {
    }
    
    private final java.util.List<org.wikipedia.language.addlanguages.LanguageListItem> getFilteredLanguageList(java.lang.String searchTerm) {
        return null;
    }
    
    private final void addFilteredLanguageListItems(java.lang.String filter, java.util.List<java.lang.String> codes, java.lang.String headerText, java.util.List<org.wikipedia.language.addlanguages.LanguageListItem> results) {
    }
    
    private final java.lang.String getCanonicalName(java.lang.String code) {
        return null;
    }
}