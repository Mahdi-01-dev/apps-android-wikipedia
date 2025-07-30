package org.wikipedia.suggestededits;

import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.wikidata.Entities;
import org.wikipedia.edit.EditTags;
import org.wikipedia.language.LanguageUtil;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.Resource;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR+\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_actionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/dataclient/wikidata/Entities$Entity;", "_uiState", "Lkotlin/Pair;", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "", "actionState", "Lkotlinx/coroutines/flow/StateFlow;", "getActionState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "findNextSuggestedEditsItem", "", "languageCode", "page", "publishImageTags", "acceptedLabels", "", "Lorg/wikipedia/suggestededits/ImageTag;", "app.lib"})
public final class SuggestedEditsImageTagsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Pair<org.wikipedia.dataclient.mwapi.MwQueryPage, java.lang.String>>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<org.wikipedia.dataclient.mwapi.MwQueryPage, java.lang.String>>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.wikidata.Entities.Entity>> _actionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.wikidata.Entities.Entity>> actionState = null;
    
    public SuggestedEditsImageTagsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<org.wikipedia.dataclient.mwapi.MwQueryPage, java.lang.String>>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.wikidata.Entities.Entity>> getActionState() {
        return null;
    }
    
    public final void findNextSuggestedEditsItem(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryPage page) {
    }
    
    public final void publishImageTags(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage page, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.suggestededits.ImageTag> acceptedLabels) {
    }
}