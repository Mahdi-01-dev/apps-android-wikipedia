package org.wikipedia.edit.templates;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.paging.*;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.TemplateDataResponse;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "isFromDiff", "", "()Z", "searchQuery", "", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "searchTemplatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lorg/wikipedia/page/PageTitle;", "getSearchTemplatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "selectedPageTitle", "getSelectedPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setSelectedPageTitle", "(Lorg/wikipedia/page/PageTitle;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "loadTemplateData", "", "pageTitle", "SearchTemplatesFlowSource", "UiState", "app.lib"})
public final class TemplatesSearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    private final boolean isFromDiff = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchQuery;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle selectedPageTitle;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.page.PageTitle>> searchTemplatesFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.edit.templates.TemplatesSearchViewModel.UiState> uiState = null;
    
    public TemplatesSearchViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    public final boolean isFromDiff() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getSelectedPageTitle() {
        return null;
    }
    
    public final void setSelectedPageTitle(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.page.PageTitle>> getSearchTemplatesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.edit.templates.TemplatesSearchViewModel.UiState> getUiState() {
        return null;
    }
    
    public final void loadTemplateData(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\r\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096@\u00a2\u0006\u0002\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$SearchTemplatesFlowSource;", "Landroidx/paging/PagingSource;", "", "Lorg/wikipedia/page/PageTitle;", "searchQuery", "", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;)V", "getSearchQuery", "()Ljava/lang/String;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public static final class SearchTemplatesFlowSource extends androidx.paging.PagingSource<java.lang.Integer, org.wikipedia.page.PageTitle> {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String searchQuery = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.WikiSite wikiSite = null;
        
        public SearchTemplatesFlowSource(@org.jetbrains.annotations.Nullable()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.WikiSite getWikiSite() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, org.wikipedia.page.PageTitle>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.Integer, org.wikipedia.page.PageTitle> state) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$UiState;", "", "()V", "LoadError", "LoadTemplateData", "app.lib"})
    public static class UiState {
        
        public UiState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$UiState$LoadError;", "Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$UiState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class LoadError extends org.wikipedia.edit.templates.TemplatesSearchViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.edit.templates.TemplatesSearchViewModel.UiState.LoadError copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public LoadError(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$UiState$LoadTemplateData;", "Lorg/wikipedia/edit/templates/TemplatesSearchViewModel$UiState;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "templateData", "Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;", "(Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;)V", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "getTemplateData", "()Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app.lib"})
        public static final class LoadTemplateData extends org.wikipedia.edit.templates.TemplatesSearchViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final org.wikipedia.page.PageTitle pageTitle = null;
            @org.jetbrains.annotations.NotNull()
            private final org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.page.PageTitle component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.edit.templates.TemplatesSearchViewModel.UiState.LoadTemplateData copy(@org.jetbrains.annotations.NotNull()
            org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
            org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
            
            public LoadTemplateData(@org.jetbrains.annotations.NotNull()
            org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
            org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.page.PageTitle getPageTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData getTemplateData() {
                return null;
            }
        }
    }
}