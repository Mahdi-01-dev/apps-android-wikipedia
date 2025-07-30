package org.wikipedia.random;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/random/RandomItemViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/dataclient/page/PageSummary;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "summary", "getSummary", "()Lorg/wikipedia/dataclient/page/PageSummary;", "setSummary", "(Lorg/wikipedia/dataclient/page/PageSummary;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "getRandomPage", "", "app.lib"})
public final class RandomItemViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.PageSummary summary;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.page.PageSummary>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.page.PageSummary>> uiState = null;
    
    public RandomItemViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.page.PageSummary>> getUiState() {
        return null;
    }
    
    public final void getRandomPage() {
    }
}