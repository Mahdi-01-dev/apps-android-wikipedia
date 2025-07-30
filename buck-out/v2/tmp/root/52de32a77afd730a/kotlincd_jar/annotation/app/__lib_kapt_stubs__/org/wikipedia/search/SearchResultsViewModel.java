package org.wikipedia.search;

import androidx.lifecycle.ViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.FlowPreview;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryResponse;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/search/SearchResultsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "batchSize", "", "countsPerLanguageCode", "", "Lkotlin/Pair;", "", "getCountsPerLanguageCode", "()Ljava/util/List;", "setCountsPerLanguageCode", "(Ljava/util/List;)V", "delayMillis", "", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "setInvokeSource", "(Lorg/wikipedia/Constants$InvokeSource;)V", "languageCode", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "(Ljava/lang/String;)V", "searchResultsFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lorg/wikipedia/search/SearchResult;", "getSearchResultsFlow$annotations", "getSearchResultsFlow", "()Lkotlinx/coroutines/flow/Flow;", "searchTerm", "getSearchTerm", "setSearchTerm", "SearchResultsPagingSource", "app.lib"})
public final class SearchResultsViewModel extends androidx.lifecycle.ViewModel {
    private final int batchSize = 20;
    private final long delayMillis = 200L;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> countsPerLanguageCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchTerm;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String languageCode;
    public org.wikipedia.Constants.InvokeSource invokeSource;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.search.SearchResult>> searchResultsFlow = null;
    
    public SearchResultsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> getCountsPerLanguageCode() {
        return null;
    }
    
    public final void setCountsPerLanguageCode(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchTerm() {
        return null;
    }
    
    public final void setSearchTerm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguageCode() {
        return null;
    }
    
    public final void setLanguageCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    public final void setInvokeSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.search.SearchResult>> getSearchResultsFlow() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
    @java.lang.Deprecated()
    public static void getSearchResultsFlow$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J(\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001bR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/search/SearchResultsViewModel$SearchResultsPagingSource;", "Landroidx/paging/PagingSource;", "", "Lorg/wikipedia/search/SearchResult;", "searchTerm", "", "languageCode", "countsPerLanguageCode", "", "Lkotlin/Pair;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/wikipedia/Constants$InvokeSource;)V", "prefixSearch", "", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "getSearchResultsFromTabs", "Lorg/wikipedia/search/SearchResults;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public static final class SearchResultsPagingSource extends androidx.paging.PagingSource<java.lang.Integer, org.wikipedia.search.SearchResult> {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String searchTerm = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String languageCode = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> countsPerLanguageCode;
        @org.jetbrains.annotations.NotNull()
        private org.wikipedia.Constants.InvokeSource invokeSource;
        private boolean prefixSearch = true;
        
        public SearchResultsPagingSource(@org.jetbrains.annotations.Nullable()
        java.lang.String searchTerm, @org.jetbrains.annotations.Nullable()
        java.lang.String languageCode, @org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> countsPerLanguageCode, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, org.wikipedia.search.SearchResult>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.Integer, org.wikipedia.search.SearchResult> state) {
            return null;
        }
        
        private final org.wikipedia.search.SearchResults getSearchResultsFromTabs(org.wikipedia.dataclient.WikiSite wikiSite, java.lang.String searchTerm) {
            return null;
        }
    }
}