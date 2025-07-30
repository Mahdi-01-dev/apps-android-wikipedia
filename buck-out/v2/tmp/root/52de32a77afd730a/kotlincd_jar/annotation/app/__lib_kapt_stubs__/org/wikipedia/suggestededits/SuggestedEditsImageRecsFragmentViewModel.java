package org.wikipedia.suggestededits;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import okhttp3.FormBody;
import okhttp3.Request;
import org.wikipedia.Constants;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.dataclient.RestService;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.edit.insertmedia.InsertMediaViewModel;
import org.wikipedia.page.PageTitle;
import org.wikipedia.staticdata.FileAliasData;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001:B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u00122\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\bJ8\u00103\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u00122\u0006\u00104\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0082@\u00a2\u0006\u0002\u00108J\u001e\u00109\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u00122\f\u00105\u001a\b\u0012\u0004\u0012\u00020706R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006;"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "", "attemptInsertInfobox", "", "getAttemptInsertInfobox", "()Z", "setAttemptInsertInfobox", "(Z)V", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "langCode", "", "getLangCode", "()Ljava/lang/String;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setPageTitle", "(Lorg/wikipedia/page/PageTitle;)V", "recommendation", "Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion;", "getRecommendation", "()Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion;", "setRecommendation", "(Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion;)V", "recommendedImageTitle", "getRecommendedImageTitle", "setRecommendedImageTitle", "summary", "Lorg/wikipedia/dataclient/page/PageSummary;", "getSummary", "()Lorg/wikipedia/dataclient/page/PageSummary;", "setSummary", "(Lorg/wikipedia/dataclient/page/PageSummary;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "acceptRecommendation", "token", "revId", "", "fetchRecommendation", "invalidateRecommendation", "accepted", "reasonCodes", "", "", "(Ljava/lang/String;ZJLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectRecommendation", "Depleted", "app.lib"})
public final class SuggestedEditsImageRecsFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    public org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion recommendation;
    public org.wikipedia.page.PageTitle pageTitle;
    public org.wikipedia.dataclient.page.PageSummary summary;
    public org.wikipedia.page.PageTitle recommendedImageTitle;
    private boolean attemptInsertInfobox = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String langCode = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Unit>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> uiState = null;
    
    public SuggestedEditsImageRecsFragmentViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion getRecommendation() {
        return null;
    }
    
    public final void setRecommendation(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final void setPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.page.PageSummary getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getRecommendedImageTitle() {
        return null;
    }
    
    public final void setRecommendedImageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    public final boolean getAttemptInsertInfobox() {
        return false;
    }
    
    public final void setAttemptInsertInfobox(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLangCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> getUiState() {
        return null;
    }
    
    public final void fetchRecommendation() {
    }
    
    public final void acceptRecommendation(@org.jetbrains.annotations.Nullable()
    java.lang.String token, long revId) {
    }
    
    public final void rejectRecommendation(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> reasonCodes) {
    }
    
    private final java.lang.Object invalidateRecommendation(java.lang.String token, boolean accepted, long revId, java.util.List<java.lang.Integer> reasonCodes, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsFragmentViewModel$Depleted;", "Lorg/wikipedia/util/Resource;", "", "()V", "app.lib"})
    public static final class Depleted extends org.wikipedia.util.Resource<kotlin.Unit> {
        
        public Depleted() {
            super();
        }
    }
}