package org.wikipedia.suggestededits;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R*\u0010\u0003\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\n\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lkotlin/Pair;", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "findNextSuggestedEditsItem", "", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "fromLangCode", "", "toLangCode", "app.lib"})
public final class SuggestedEditsCardsItemViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Pair<org.wikipedia.suggestededits.PageSummaryForEdit, org.wikipedia.suggestededits.PageSummaryForEdit>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<org.wikipedia.suggestededits.PageSummaryForEdit, org.wikipedia.suggestededits.PageSummaryForEdit>>> uiState = null;
    
    public SuggestedEditsCardsItemViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<org.wikipedia.suggestededits.PageSummaryForEdit, org.wikipedia.suggestededits.PageSummaryForEdit>>> getUiState() {
        return null;
    }
    
    public final void findNextSuggestedEditsItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
    java.lang.String fromLangCode, @org.jetbrains.annotations.NotNull()
    java.lang.String toLangCode) {
    }
}