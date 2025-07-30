package org.wikipedia.readinglist.recommended;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.StateFlow;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_resetUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "", "_uiState", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsState;", "resetUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getResetUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "generateRecommendedReadingList", "", "toggleDiscoverReadingList", "enabled", "toggleNotification", "updateArticleNumbers", "number", "", "updateFrequency", "frequency", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "updateRecommendedReadingListSource", "source", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "app.lib"})
public final class RecommendedReadingListSettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> _resetUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> resetUiState = null;
    
    public RecommendedReadingListSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Boolean>> getResetUiState() {
        return null;
    }
    
    public final void toggleDiscoverReadingList(boolean enabled) {
    }
    
    public final void updateArticleNumbers(int number) {
    }
    
    public final void updateFrequency(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency frequency) {
    }
    
    public final void toggleNotification(boolean enabled) {
    }
    
    public final void updateRecommendedReadingListSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSource source) {
    }
    
    public final void generateRecommendedReadingList() {
    }
}