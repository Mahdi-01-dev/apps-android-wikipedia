package org.wikipedia.suggestededits;

import androidx.lifecycle.ViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryResult;
import org.wikipedia.dataclient.mwapi.UserInfo;
import org.wikipedia.settings.Prefs;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.DateUtil;
import retrofit2.HttpException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0005()*+,B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006-"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "actionModeActive", "", "getActionModeActive", "()Z", "setActionModeActive", "(Z)V", "cachedContinueKey", "", "cachedRecentEdits", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "cachedUserInfo", "Lorg/wikipedia/dataclient/mwapi/UserInfo;", "currentQuery", "getCurrentQuery", "()Ljava/lang/String;", "setCurrentQuery", "(Ljava/lang/String;)V", "langCode", "getLangCode", "setLangCode", "pageSize", "", "recentEditsFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItemModel;", "getRecentEditsFlow", "()Lkotlinx/coroutines/flow/Flow;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "clearCache", "", "populateEditingSuggestionsProvider", "topItem", "Companion", "RecentEditsItem", "RecentEditsItemModel", "RecentEditsPagingSource", "RecentEditsSeparator", "app.lib"})
public final class SuggestedEditsRecentEditsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String langCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentQuery = "";
    private boolean actionModeActive = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> cachedUserInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> cachedRecentEdits = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cachedContinueKey;
    private final int pageSize = 50;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel>> recentEditsFlow = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.Companion Companion = null;
    
    public SuggestedEditsRecentEditsViewModel() {
        super();
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
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel>> getRecentEditsFlow() {
        return null;
    }
    
    public final void clearCache() {
    }
    
    public final void populateEditingSuggestionsProvider(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange topItem) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012Jp\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\n\u0010 \u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$Companion;", "", "()V", "diffDays", "", "date", "Ljava/util/Date;", "filterOresScores", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "recentChanges", "isDamagingGroup", "", "filterUserExperience", "usersInfo", "Lorg/wikipedia/dataclient/mwapi/UserInfo;", "filterUserRegistration", "filtersCount", "", "getRecentEditsCall", "Lkotlin/Triple;", "", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "count", "startTimeStamp", "Ljava/time/Instant;", "direction", "continueStr", "userInfoCache", "", "(Lorg/wikipedia/dataclient/WikiSite;ILjava/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latestRevisions", "showCriteriaString", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRecentEditsCall(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, int count, @org.jetbrains.annotations.NotNull()
        java.time.Instant startTimeStamp, @org.jetbrains.annotations.NotNull()
        java.lang.String direction, @org.jetbrains.annotations.Nullable()
        java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> userInfoCache, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Triple<? extends java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange>, ? extends java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange>, java.lang.String>> $completion) {
            return null;
        }
        
        public final int filtersCount() {
            return 0;
        }
        
        private final java.lang.String latestRevisions() {
            return null;
        }
        
        private final java.lang.String showCriteriaString() {
            return null;
        }
        
        @kotlin.Suppress(names = {"KotlinConstantConditions"})
        private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> filterUserExperience(java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> recentChanges, java.util.List<org.wikipedia.dataclient.mwapi.UserInfo> usersInfo) {
            return null;
        }
        
        private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> filterUserRegistration(java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> recentChanges) {
            return null;
        }
        
        private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> filterOresScores(java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> recentChanges, boolean isDamagingGroup) {
            return null;
        }
        
        private final long diffDays(java.util.Date date) {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItem;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItemModel;", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "(Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;)V", "getItem", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "app.lib"})
    public static final class RecentEditsItem extends org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item = null;
        
        public RecentEditsItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange getItem() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItemModel;", "", "()V", "app.lib"})
    public static class RecentEditsItemModel {
        
        public RecentEditsItemModel() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsPagingSource;", "Landroidx/paging/PagingSource;", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public final class RecentEditsPagingSource extends androidx.paging.PagingSource<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> {
        
        public RecentEditsPagingSource() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.String getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> state) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsSeparator;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsViewModel$RecentEditsItemModel;", "date", "", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "app.lib"})
    public static final class RecentEditsSeparator extends org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel.RecentEditsItemModel {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        
        public RecentEditsSeparator(@org.jetbrains.annotations.NotNull()
        java.lang.String date) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
    }
}