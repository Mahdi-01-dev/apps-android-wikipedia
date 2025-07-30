package org.wikipedia.language;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.SiteMatrix;
import org.wikipedia.page.PageTitle;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UiState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0082@\u00a2\u0006\u0002\u0010#J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\'\u001a\u00020\u001cH\u0002J\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001cJ\u0016\u0010*\u001a\u00020\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0,H\u0002J\u0016\u0010-\u001a\u00020\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0,H\u0002J\u0016\u0010.\u001a\u00020\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0,H\u0002J\u0012\u00100\u001a\u00020\u001f2\b\b\u0002\u00101\u001a\u00020\u001cH\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lorg/wikipedia/language/LangLinksViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/UiState;", "", "Lorg/wikipedia/language/LangLinksItem;", "app", "Lorg/wikipedia/WikipediaApp;", "appLanguageEntries", "Lorg/wikipedia/page/PageTitle;", "historyEntryId", "", "getHistoryEntryId", "()J", "originalLanguageEntries", "pageTitle", "siteInfoList", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix$SiteInfo;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "variantLangToUpdate", "", "", "createLangLinksItem", "fetchAllData", "", "fetchLangVariantLinks", "langCode", "title", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterAppLanguages", "entries", "getCanonicalName", "code", "onSearchQueryChange", "searchQuery", "processLanguageEntries", "langLinks", "", "sortLanguageEntriesByMru", "updateLanguageEntriesSupported", "languageEntries", "updateLanguageItems", "searchTerm", "Companion", "app.lib"})
public final class LangLinksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.WikipediaApp app = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.dataclient.mwapi.SiteMatrix.SiteInfo> siteInfoList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.page.PageTitle> originalLanguageEntries;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.page.PageTitle> appLanguageEntries;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> variantLangToUpdate;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.language.LangLinksItem>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.language.LangLinksItem>>> uiState = null;
    private final long historyEntryId = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.language.LangLinksViewModel.Companion Companion = null;
    
    public LangLinksViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.language.LangLinksItem>>> getUiState() {
        return null;
    }
    
    public final long getHistoryEntryId() {
        return 0L;
    }
    
    public final void fetchAllData() {
    }
    
    public final void onSearchQueryChange(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
    }
    
    private final java.lang.Object fetchLangVariantLinks(java.lang.String langCode, java.lang.String title, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void processLanguageEntries(java.util.List<org.wikipedia.page.PageTitle> langLinks) {
    }
    
    private final java.util.List<org.wikipedia.page.PageTitle> filterAppLanguages(java.util.List<org.wikipedia.page.PageTitle> entries) {
        return null;
    }
    
    private final java.lang.String getCanonicalName(java.lang.String code) {
        return null;
    }
    
    private final void updateLanguageItems(java.lang.String searchTerm) {
    }
    
    private final org.wikipedia.language.LangLinksItem createLangLinksItem(org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    private final void updateLanguageEntriesSupported(java.util.List<org.wikipedia.page.PageTitle> languageEntries) {
    }
    
    private final void sortLanguageEntriesByMru(java.util.List<org.wikipedia.page.PageTitle> entries) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/language/LangLinksViewModel$Companion;", "", "()V", "addVariantEntriesIfNeeded", "", "language", "Lorg/wikipedia/language/AppLanguageState;", "title", "Lorg/wikipedia/page/PageTitle;", "languageEntries", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void addVariantEntriesIfNeeded(@org.jetbrains.annotations.NotNull()
        org.wikipedia.language.AppLanguageState language, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> languageEntries) {
        }
    }
}