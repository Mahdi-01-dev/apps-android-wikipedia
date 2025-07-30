package org.wikipedia.usercontrib;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.paging.*;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.UserContribution;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.log.L;
import retrofit2.HttpException;
import java.io.IOException;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000501234B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020,R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u0011\u0010\'\u001a\u00020(8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u00a8\u00065"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "actionModeActive", "", "getActionModeActive", "()Z", "setActionModeActive", "(Z)V", "cachedContinueKey", "", "cachedContribs", "", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "currentQuery", "getCurrentQuery", "()Ljava/lang/String;", "setCurrentQuery", "(Ljava/lang/String;)V", "langCode", "getLangCode", "setLangCode", "userContribFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "getUserContribFlow", "()Lkotlinx/coroutines/flow/Flow;", "userContribStatsData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribStats;", "getUserContribStatsData", "()Landroidx/lifecycle/MutableLiveData;", "userName", "getUserName", "setUserName", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "clearCache", "", "excludedFiltersCount", "", "loadStats", "UserContribItem", "UserContribItemModel", "UserContribPagingSource", "UserContribSeparator", "UserContribStats", "app.lib"})
public final class UserContribListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.usercontrib.UserContribListViewModel.UserContribStats>> userContribStatsData = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String langCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentQuery = "";
    private boolean actionModeActive = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> cachedContribs = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cachedContinueKey;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel>> userContribFlow = null;
    
    public UserContribListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.usercontrib.UserContribListViewModel.UserContribStats>> getUserContribStatsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLangCode() {
        return null;
    }
    
    public final void setLangCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
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
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel>> getUserContribFlow() {
        return null;
    }
    
    public final int excludedFiltersCount() {
        return 0;
    }
    
    public final void loadStats() {
    }
    
    public final void clearCache() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItem;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "item", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "(Lorg/wikipedia/dataclient/mwapi/UserContribution;)V", "getItem", "()Lorg/wikipedia/dataclient/mwapi/UserContribution;", "app.lib"})
    public static final class UserContribItem extends org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.mwapi.UserContribution item = null;
        
        public UserContribItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.UserContribution item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.mwapi.UserContribution getItem() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "", "()V", "app.lib"})
    public static class UserContribItemModel {
        
        public UserContribItemModel() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribPagingSource;", "Landroidx/paging/PagingSource;", "", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "(Lorg/wikipedia/usercontrib/UserContribListViewModel;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public final class UserContribPagingSource extends androidx.paging.PagingSource<java.lang.String, org.wikipedia.dataclient.mwapi.UserContribution> {
        
        public UserContribPagingSource() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, org.wikipedia.dataclient.mwapi.UserContribution>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.String getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.String, org.wikipedia.dataclient.mwapi.UserContribution> state) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribSeparator;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "date", "", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "app.lib"})
    public static final class UserContribSeparator extends org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        
        public UserContribSeparator(@org.jetbrains.annotations.NotNull()
        java.lang.String date) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribStats;", "Lorg/wikipedia/usercontrib/UserContribListViewModel$UserContribItemModel;", "totalEdits", "", "registrationDate", "Ljava/util/Date;", "projectName", "", "(ILjava/util/Date;Ljava/lang/String;)V", "getProjectName", "()Ljava/lang/String;", "getRegistrationDate", "()Ljava/util/Date;", "getTotalEdits", "()I", "app.lib"})
    public static final class UserContribStats extends org.wikipedia.usercontrib.UserContribListViewModel.UserContribItemModel {
        private final int totalEdits = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Date registrationDate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String projectName = null;
        
        public UserContribStats(int totalEdits, @org.jetbrains.annotations.NotNull()
        java.util.Date registrationDate, @org.jetbrains.annotations.NotNull()
        java.lang.String projectName) {
            super();
        }
        
        public final int getTotalEdits() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getRegistrationDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getProjectName() {
            return null;
        }
    }
}