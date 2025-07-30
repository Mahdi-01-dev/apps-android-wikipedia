package org.wikipedia.suggestededits;

import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.mwapi.UserContribution;
import org.wikipedia.settings.Prefs;
import org.wikipedia.usercontrib.UserContribStats;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ThrowableUtil;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010?\u001a\u00020\u0006J\u0016\u0010@\u001a\u00020\u001e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001a\u0010,\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010/\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000509\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\n\"\u0004\b>\u0010\f\u00a8\u0006E"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "", "allowToPatrolEdits", "", "getAllowToPatrolEdits", "()Z", "setAllowToPatrolEdits", "(Z)V", "blockMessageCommons", "", "getBlockMessageCommons", "()Ljava/lang/String;", "setBlockMessageCommons", "(Ljava/lang/String;)V", "blockMessageWikidata", "getBlockMessageWikidata", "setBlockMessageWikidata", "blockMessageWikipedia", "getBlockMessageWikipedia", "setBlockMessageWikipedia", "clientJob", "Lkotlinx/coroutines/Job;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "homeContributions", "", "getHomeContributions", "()I", "setHomeContributions", "(I)V", "latestEditDate", "Ljava/util/Date;", "getLatestEditDate", "()Ljava/util/Date;", "setLatestEditDate", "(Ljava/util/Date;)V", "latestEditStreak", "getLatestEditStreak", "setLatestEditStreak", "revertSeverity", "getRevertSeverity", "setRevertSeverity", "totalContributions", "getTotalContributions", "setTotalContributions", "totalPageviews", "", "getTotalPageviews", "()J", "setTotalPageviews", "(J)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "wikiSupportsImageRecommendations", "getWikiSupportsImageRecommendations", "setWikiSupportsImageRecommendations", "fetchData", "getEditStreak", "contributions", "", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "RequireLogin", "app.lib"})
public final class SuggestedEditsTasksFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Unit>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> uiState = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String blockMessageWikipedia;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String blockMessageWikidata;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String blockMessageCommons;
    private long totalPageviews = 0L;
    private int totalContributions = 0;
    private int homeContributions = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date latestEditDate;
    private int latestEditStreak = 0;
    private int revertSeverity = 0;
    private boolean wikiSupportsImageRecommendations = false;
    private boolean allowToPatrolEdits = false;
    
    public SuggestedEditsTasksFragmentViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockMessageWikipedia() {
        return null;
    }
    
    public final void setBlockMessageWikipedia(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockMessageWikidata() {
        return null;
    }
    
    public final void setBlockMessageWikidata(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockMessageCommons() {
        return null;
    }
    
    public final void setBlockMessageCommons(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getTotalPageviews() {
        return 0L;
    }
    
    public final void setTotalPageviews(long p0) {
    }
    
    public final int getTotalContributions() {
        return 0;
    }
    
    public final void setTotalContributions(int p0) {
    }
    
    public final int getHomeContributions() {
        return 0;
    }
    
    public final void setHomeContributions(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLatestEditDate() {
        return null;
    }
    
    public final void setLatestEditDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getLatestEditStreak() {
        return 0;
    }
    
    public final void setLatestEditStreak(int p0) {
    }
    
    public final int getRevertSeverity() {
        return 0;
    }
    
    public final void setRevertSeverity(int p0) {
    }
    
    public final boolean getWikiSupportsImageRecommendations() {
        return false;
    }
    
    public final void setWikiSupportsImageRecommendations(boolean p0) {
    }
    
    public final boolean getAllowToPatrolEdits() {
        return false;
    }
    
    public final void setAllowToPatrolEdits(boolean p0) {
    }
    
    public final void fetchData() {
    }
    
    private final int getEditStreak(java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> contributions) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragmentViewModel$RequireLogin;", "Lorg/wikipedia/util/Resource;", "", "()V", "app.lib"})
    public static final class RequireLogin extends org.wikipedia.util.Resource<kotlin.Unit> {
        
        public RequireLogin() {
            super();
        }
    }
}