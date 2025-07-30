package org.wikipedia.feed.suggestededits;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\'\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u0010)J\u000e\u0010+\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020.J,\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u0001002\u0006\u0010\'\u001a\u00020(2\u0006\u00101\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u00102J*\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a002\u0006\u0010\'\u001a\u00020(2\u0006\u00101\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u00102R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u00064"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardItemViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "", "age", "", "getAge", "()I", "cardActionType", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getCardActionType", "()Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "setCardActionType", "(Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;)V", "imageTagPage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getImageTagPage", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "setImageTagPage", "(Lorg/wikipedia/dataclient/mwapi/MwQueryPage;)V", "sourceSummaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "getSourceSummaryForEdit", "()Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "setSourceSummaryForEdit", "(Lorg/wikipedia/suggestededits/PageSummaryForEdit;)V", "targetSummaryForEdit", "getTargetSummaryForEdit", "setTargetSummaryForEdit", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addCaption", "langFromCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addDescription", "addImageTags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCardData", "", "translateCaption", "Lkotlin/Pair;", "targetLanguage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "translateDescription", "app.lib"})
public final class SuggestedEditsCardItemViewModel extends androidx.lifecycle.ViewModel {
    private final int age = 0;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.descriptions.DescriptionEditActivity.Action cardActionType;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.PageSummaryForEdit sourceSummaryForEdit;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.PageSummaryForEdit targetSummaryForEdit;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage imageTagPage;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> uiState = null;
    
    public SuggestedEditsCardItemViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.descriptions.DescriptionEditActivity.Action getCardActionType() {
        return null;
    }
    
    public final void setCardActionType(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getSourceSummaryForEdit() {
        return null;
    }
    
    public final void setSourceSummaryForEdit(@org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getTargetSummaryForEdit() {
        return null;
    }
    
    public final void setTargetSummaryForEdit(@org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage getImageTagPage() {
        return null;
    }
    
    public final void setImageTagPage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryPage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> getUiState() {
        return null;
    }
    
    public final void fetchCardData() {
    }
    
    private final java.lang.Object addDescription(java.lang.String langFromCode, kotlin.coroutines.Continuation<? super org.wikipedia.suggestededits.PageSummaryForEdit> $completion) {
        return null;
    }
    
    private final java.lang.Object translateDescription(java.lang.String langFromCode, java.lang.String targetLanguage, kotlin.coroutines.Continuation<? super kotlin.Pair<org.wikipedia.suggestededits.PageSummaryForEdit, org.wikipedia.suggestededits.PageSummaryForEdit>> $completion) {
        return null;
    }
    
    private final java.lang.Object addCaption(java.lang.String langFromCode, kotlin.coroutines.Continuation<? super org.wikipedia.suggestededits.PageSummaryForEdit> $completion) {
        return null;
    }
    
    private final java.lang.Object translateCaption(java.lang.String langFromCode, java.lang.String targetLanguage, kotlin.coroutines.Continuation<? super kotlin.Pair<org.wikipedia.suggestededits.PageSummaryForEdit, org.wikipedia.suggestededits.PageSummaryForEdit>> $completion) {
        return null;
    }
    
    private final java.lang.Object addImageTags(kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryPage> $completion) {
        return null;
    }
}