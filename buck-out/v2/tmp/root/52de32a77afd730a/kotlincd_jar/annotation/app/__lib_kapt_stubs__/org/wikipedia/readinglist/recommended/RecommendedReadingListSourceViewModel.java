package org.wikipedia.readinglist.recommended;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.StateFlow;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSourceViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiSourceState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSourceViewModel$SourceSelectionUiState;", "availableSources", "", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "getAvailableSources", "()Ljava/util/List;", "fromSettings", "", "getFromSettings", "()Z", "uiSourceState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiSourceState", "()Lkotlinx/coroutines/flow/StateFlow;", "saveSourceSelection", "Lkotlin/Pair;", "setupSourceSelection", "", "updateSourceSelection", "newSource", "SourceSelectionUiState", "app.lib"})
public final class RecommendedReadingListSourceViewModel extends androidx.lifecycle.ViewModel {
    private final boolean fromSettings = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.readinglist.recommended.RecommendedReadingListSource> availableSources = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListSourceViewModel.SourceSelectionUiState>> _uiSourceState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListSourceViewModel.SourceSelectionUiState>> uiSourceState = null;
    
    public RecommendedReadingListSourceViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final boolean getFromSettings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.recommended.RecommendedReadingListSource> getAvailableSources() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListSourceViewModel.SourceSelectionUiState>> getUiSourceState() {
        return null;
    }
    
    public final void setupSourceSelection() {
    }
    
    public final void updateSourceSelection(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSource newSource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Boolean, org.wikipedia.readinglist.recommended.RecommendedReadingListSource> saveSourceSelection() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSourceViewModel$SourceSelectionUiState;", "", "isSavedOptionEnabled", "", "isHistoryOptionEnabled", "selectedSource", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "(ZZLorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;)V", "()Z", "getSelectedSource", "()Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app.lib"})
    public static final class SourceSelectionUiState {
        private final boolean isSavedOptionEnabled = false;
        private final boolean isHistoryOptionEnabled = false;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.readinglist.recommended.RecommendedReadingListSource selectedSource = null;
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.recommended.RecommendedReadingListSource component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.recommended.RecommendedReadingListSourceViewModel.SourceSelectionUiState copy(boolean isSavedOptionEnabled, boolean isHistoryOptionEnabled, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.recommended.RecommendedReadingListSource selectedSource) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public SourceSelectionUiState(boolean isSavedOptionEnabled, boolean isHistoryOptionEnabled, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.recommended.RecommendedReadingListSource selectedSource) {
            super();
        }
        
        public final boolean isSavedOptionEnabled() {
            return false;
        }
        
        public final boolean isHistoryOptionEnabled() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.recommended.RecommendedReadingListSource getSelectedSource() {
            return null;
        }
        
        public SourceSelectionUiState() {
            super();
        }
    }
}