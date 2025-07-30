package org.wikipedia.page.edithistory;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.restbase.EditCount;
import org.wikipedia.dataclient.restbase.Metrics;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.log.L;
import retrofit2.HttpException;
import java.io.IOException;
import java.util.Calendar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 92\u00020\u0001:\u00069:;<=>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\u0006\u00103\u001a\u000202J\u000e\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020\u000fJ\b\u00106\u001a\u000202H\u0002J\u0006\u00107\u001a\u000202J\u000e\u00108\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010(\u001a\u00020)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\"\u0010,\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\"\u0010/\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010.\u00a8\u0006?"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "actionModeActive", "", "getActionModeActive", "()Z", "setActionModeActive", "(Z)V", "cachedContinueKey", "", "cachedRevisions", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "<set-?>", "comparing", "getComparing", "currentQuery", "getCurrentQuery", "()Ljava/lang/String;", "setCurrentQuery", "(Ljava/lang/String;)V", "editHistoryFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "getEditHistoryFlow", "()Lkotlinx/coroutines/flow/Flow;", "editHistoryStatsData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryStats;", "getEditHistoryStatsData", "()Landroidx/lifecycle/MutableLiveData;", "", "pageId", "getPageId", "()I", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "selectedRevisionFrom", "getSelectedRevisionFrom", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "selectedRevisionTo", "getSelectedRevisionTo", "cancelSelectRevision", "", "clearCache", "getSelectedState", "revision", "loadEditHistoryStatsAndEditCounts", "toggleCompareState", "toggleSelectRevision", "Companion", "EditHistoryItem", "EditHistoryItemModel", "EditHistoryPagingSource", "EditHistorySeparator", "EditHistoryStats", "app.lib"})
public final class EditHistoryListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryStats>> editHistoryStatsData = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    private int pageId = -1;
    private boolean comparing = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage.Revision selectedRevisionFrom;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage.Revision selectedRevisionTo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentQuery = "";
    private boolean actionModeActive = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Revision> cachedRevisions = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cachedContinueKey;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel>> editHistoryFlow = null;
    public static final int SELECT_INACTIVE = 0;
    public static final int SELECT_NONE = 1;
    public static final int SELECT_FROM = 2;
    public static final int SELECT_TO = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.edithistory.EditHistoryListViewModel.Companion Companion = null;
    
    public EditHistoryListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryStats>> getEditHistoryStatsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final int getPageId() {
        return 0;
    }
    
    public final boolean getComparing() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision getSelectedRevisionFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision getSelectedRevisionTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentQuery() {
        return null;
    }
    
    public final void setCurrentQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getActionModeActive() {
        return false;
    }
    
    public final void setActionModeActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel>> getEditHistoryFlow() {
        return null;
    }
    
    private final void loadEditHistoryStatsAndEditCounts() {
    }
    
    public final void toggleCompareState() {
    }
    
    private final void cancelSelectRevision() {
    }
    
    public final boolean toggleSelectRevision(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision) {
        return false;
    }
    
    public final int getSelectedState(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision) {
        return 0;
    }
    
    public final void clearCache() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$Companion;", "", "()V", "SELECT_FROM", "", "SELECT_INACTIVE", "SELECT_NONE", "SELECT_TO", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItem;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "(Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;)V", "getItem", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "app.lib"})
    public static final class EditHistoryItem extends org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision item = null;
        
        public EditHistoryItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage.Revision item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision getItem() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "", "()V", "app.lib"})
    public static class EditHistoryItemModel {
        
        public EditHistoryItemModel() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryPagingSource;", "Landroidx/paging/PagingSource;", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/page/edithistory/EditHistoryListViewModel;Lorg/wikipedia/page/PageTitle;)V", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public final class EditHistoryPagingSource extends androidx.paging.PagingSource<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryPage.Revision> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.page.PageTitle pageTitle = null;
        
        public EditHistoryPagingSource(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle getPageTitle() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryPage.Revision>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.String getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryPage.Revision> state) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistorySeparator;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "date", "", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "app.lib"})
    public static final class EditHistorySeparator extends org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        
        public EditHistorySeparator(@org.jetbrains.annotations.NotNull()
        java.lang.String date) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryStats;", "Lorg/wikipedia/page/edithistory/EditHistoryListViewModel$EditHistoryItemModel;", "revision", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "metrics", "", "Lorg/wikipedia/dataclient/restbase/Metrics$Results;", "allEdits", "Lorg/wikipedia/dataclient/restbase/EditCount;", "userEdits", "anonEdits", "botEdits", "(Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;Ljava/util/List;Lorg/wikipedia/dataclient/restbase/EditCount;Lorg/wikipedia/dataclient/restbase/EditCount;Lorg/wikipedia/dataclient/restbase/EditCount;Lorg/wikipedia/dataclient/restbase/EditCount;)V", "getAllEdits", "()Lorg/wikipedia/dataclient/restbase/EditCount;", "getAnonEdits", "getBotEdits", "getMetrics", "()Ljava/util/List;", "getRevision", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "getUserEdits", "app.lib"})
    public static final class EditHistoryStats extends org.wikipedia.page.edithistory.EditHistoryListViewModel.EditHistoryItemModel {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.restbase.Metrics.Results> metrics = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.restbase.EditCount allEdits = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.restbase.EditCount userEdits = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.restbase.EditCount anonEdits = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.restbase.EditCount botEdits = null;
        
        public EditHistoryStats(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revision, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.restbase.Metrics.Results> metrics, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.restbase.EditCount allEdits, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.restbase.EditCount userEdits, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.restbase.EditCount anonEdits, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.restbase.EditCount botEdits) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision getRevision() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.restbase.Metrics.Results> getMetrics() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.restbase.EditCount getAllEdits() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.restbase.EditCount getUserEdits() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.restbase.EditCount getAnonEdits() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.restbase.EditCount getBotEdits() {
            return null;
        }
    }
}