package org.wikipedia.descriptions;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.liftwing.DescriptionSuggestion;
import org.wikipedia.dataclient.liftwing.LiftWingModelService;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.dataclient.wikidata.EntityPostResponse;
import org.wikipedia.edit.Edit;
import org.wikipedia.language.AppLanguageLookUpTable;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 P2\u00020\u0001:\u0001PB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00109\u001a\u00020:J6\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u00102\b\u0010>\u001a\u0004\u0018\u00010\u00102\b\u0010?\u001a\u0004\u0018\u00010\u00102\b\u0010@\u001a\u0004\u0018\u00010\u0010JF\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u00102\b\u0010>\u001a\u0004\u0018\u00010\u00102\b\u0010?\u001a\u0004\u0018\u00010\u00102\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0082@\u00a2\u0006\u0002\u0010DJ2\u0010E\u001a\u00020F2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u00102\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0082@\u00a2\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020:J\u0006\u0010I\u001a\u00020\u0012J\u0018\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0010H\u0002J\u000e\u0010M\u001a\u00020:2\u0006\u0010N\u001a\u00020OR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010)\u001a\u00020*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R5\u0010/\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f0\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u00101\u001a\u0004\u0018\u000102\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u00105\u001a\u0004\u0018\u000102\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070&\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(\u00a8\u0006Q"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_loadPageSummaryState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "_postDescriptionState", "", "_requestSuggestionState", "Lkotlin/Triple;", "Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion$Response;", "", "", "", "_waitForRevisionState", "", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getAction", "()Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "clientJob", "Lkotlinx/coroutines/Job;", "editingAllowed", "getEditingAllowed", "()Z", "setEditingAllowed", "(Z)V", "highlightText", "getHighlightText", "()Ljava/lang/String;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "loadPageSummaryState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadPageSummaryState", "()Lkotlinx/coroutines/flow/StateFlow;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "postDescriptionState", "getPostDescriptionState", "requestSuggestionState", "getRequestSuggestionState", "sourceSummary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "getSourceSummary", "()Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "targetSummary", "getTargetSummary", "waitForRevisionState", "getWaitForRevisionState", "loadPageSummary", "", "postDescription", "currentDescription", "editComment", "editTags", "captchaId", "captchaWord", "postDescriptionToArticle", "Lorg/wikipedia/edit/Edit;", "csrfToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postDescriptionToWikidata", "Lorg/wikipedia/dataclient/wikidata/EntityPostResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSuggestion", "shouldWriteToLocalWiki", "updateDescriptionInArticle", "articleText", "newDescription", "waitForRevisionUpdate", "newRevision", "", "Companion", "app.lib"})
public final class DescriptionEditViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String highlightText = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.descriptions.DescriptionEditActivity.Action action = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.suggestededits.PageSummaryForEdit targetSummary = null;
    private boolean editingAllowed = true;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwServiceError>> _loadPageSummaryState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwServiceError>> loadPageSummaryState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Triple<org.wikipedia.dataclient.liftwing.DescriptionSuggestion.Response, java.lang.Integer, java.util.List<java.lang.String>>>> _requestSuggestionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Triple<org.wikipedia.dataclient.liftwing.DescriptionSuggestion.Response, java.lang.Integer, java.util.List<java.lang.String>>>> requestSuggestionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<java.lang.Object>> _postDescriptionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Object>> postDescriptionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> _waitForRevisionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> waitForRevisionState = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] DESCRIPTION_TEMPLATES = {"Short description", "SHORTDESC"};
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMPLATE_PARSE_REGEX = "(\\{\\{[Ss]hort description\\|(?:1=)?)([^}|]+)([^}]*\\}\\})";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditViewModel.Companion Companion = null;
    
    public DescriptionEditViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHighlightText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.descriptions.DescriptionEditActivity.Action getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getSourceSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getTargetSummary() {
        return null;
    }
    
    public final boolean getEditingAllowed() {
        return false;
    }
    
    public final void setEditingAllowed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwServiceError>> getLoadPageSummaryState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Triple<org.wikipedia.dataclient.liftwing.DescriptionSuggestion.Response, java.lang.Integer, java.util.List<java.lang.String>>>> getRequestSuggestionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Object>> getPostDescriptionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> getWaitForRevisionState() {
        return null;
    }
    
    public final void loadPageSummary() {
    }
    
    public final void requestSuggestion() {
    }
    
    public final void postDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String currentDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String editComment, @org.jetbrains.annotations.Nullable()
    java.lang.String editTags, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord) {
    }
    
    public final void waitForRevisionUpdate(long newRevision) {
    }
    
    private final java.lang.Object postDescriptionToArticle(java.lang.String csrfToken, java.lang.String currentDescription, java.lang.String editComment, java.lang.String editTags, java.lang.String captchaId, java.lang.String captchaWord, kotlin.coroutines.Continuation<? super org.wikipedia.edit.Edit> $completion) {
        return null;
    }
    
    private final java.lang.Object postDescriptionToWikidata(java.lang.String csrfToken, java.lang.String currentDescription, java.lang.String editComment, java.lang.String editTags, kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.EntityPostResponse> $completion) {
        return null;
    }
    
    public final boolean shouldWriteToLocalWiki() {
        return false;
    }
    
    private final java.lang.String updateDescriptionInArticle(java.lang.String articleText, java.lang.String newDescription) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditViewModel$Companion;", "", "()V", "DESCRIPTION_TEMPLATES", "", "", "getDESCRIPTION_TEMPLATES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "TEMPLATE_PARSE_REGEX", "getTEMPLATE_PARSE_REGEX$annotations", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getDESCRIPTION_TEMPLATES() {
            return null;
        }
        
        @kotlin.Suppress(names = {"RegExpRedundantEscape"})
        @java.lang.Deprecated()
        public static void getTEMPLATE_PARSE_REGEX$annotations() {
        }
    }
}