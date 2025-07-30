package org.wikipedia.commons;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/commons/ImagePreviewViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/commons/FilePage;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getAction", "()Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "setAction", "(Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;)V", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "pageSummaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "getPageSummaryForEdit", "()Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "setPageSummaryForEdit", "(Lorg/wikipedia/suggestededits/PageSummaryForEdit;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadImageInfo", "", "app.lib"})
public final class ImagePreviewViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.suggestededits.PageSummaryForEdit pageSummaryForEdit;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.descriptions.DescriptionEditActivity.Action action;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.commons.FilePage>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.commons.FilePage>> uiState = null;
    
    public ImagePreviewViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getPageSummaryForEdit() {
        return null;
    }
    
    public final void setPageSummaryForEdit(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.descriptions.DescriptionEditActivity.Action getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditActivity.Action p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.commons.FilePage>> getUiState() {
        return null;
    }
    
    private final void loadImageInfo() {
    }
}