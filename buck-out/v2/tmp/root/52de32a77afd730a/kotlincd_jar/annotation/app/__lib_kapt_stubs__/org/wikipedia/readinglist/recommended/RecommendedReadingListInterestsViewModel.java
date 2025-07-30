package org.wikipedia.readinglist.recommended;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.StateFlow;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.Resource;
import org.wikipedia.util.SingleLiveData;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\"\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListInterestsViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListInterestsViewModel$UiState;", "fromSettings", "", "getFromSettings", "()Z", "randomizeEvent", "Lorg/wikipedia/util/SingleLiveData;", "getRandomizeEvent", "()Lorg/wikipedia/util/SingleLiveData;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addTitle", "", "title", "Lorg/wikipedia/page/PageTitle;", "commitSelection", "loadItems", "randomizeSelection", "restoreState", "items", "", "selectedItems", "", "toggleSelection", "item", "UiState", "app.lib"})
public final class RecommendedReadingListInterestsViewModel extends androidx.lifecycle.ViewModel {
    private final boolean fromSettings = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState> randomizeEvent = null;
    
    public RecommendedReadingListInterestsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final boolean getFromSettings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState> getRandomizeEvent() {
        return null;
    }
    
    public final void loadItems() {
    }
    
    public final void toggleSelection(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle item) {
    }
    
    public final void randomizeSelection() {
    }
    
    public final void restoreState(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> items, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.wikipedia.page.PageTitle> selectedItems) {
    }
    
    public final void commitSelection() {
    }
    
    public final void addTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u00c6\u0003J]\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListInterestsViewModel$UiState;", "", "fromSettings", "", "items", "", "Lorg/wikipedia/page/PageTitle;", "selectedItems", "", "fromRandomize", "prevItems", "prevSelectedItems", "(ZLjava/util/List;Ljava/util/Set;ZLjava/util/List;Ljava/util/Set;)V", "getFromRandomize", "()Z", "getFromSettings", "getItems", "()Ljava/util/List;", "getPrevItems", "getPrevSelectedItems", "()Ljava/util/Set;", "getSelectedItems", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "app.lib"})
    public static final class UiState {
        private final boolean fromSettings = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.page.PageTitle> items = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<org.wikipedia.page.PageTitle> selectedItems = null;
        private final boolean fromRandomize = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.page.PageTitle> prevItems = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<org.wikipedia.page.PageTitle> prevSelectedItems = null;
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.page.PageTitle> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.page.PageTitle> component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.page.PageTitle> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.page.PageTitle> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState copy(boolean fromSettings, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> items, @org.jetbrains.annotations.NotNull()
        java.util.Set<org.wikipedia.page.PageTitle> selectedItems, boolean fromRandomize, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> prevItems, @org.jetbrains.annotations.NotNull()
        java.util.Set<org.wikipedia.page.PageTitle> prevSelectedItems) {
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
        
        public UiState(boolean fromSettings, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> items, @org.jetbrains.annotations.NotNull()
        java.util.Set<org.wikipedia.page.PageTitle> selectedItems, boolean fromRandomize, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> prevItems, @org.jetbrains.annotations.NotNull()
        java.util.Set<org.wikipedia.page.PageTitle> prevSelectedItems) {
            super();
        }
        
        public final boolean getFromSettings() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.page.PageTitle> getItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.page.PageTitle> getSelectedItems() {
            return null;
        }
        
        public final boolean getFromRandomize() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.page.PageTitle> getPrevItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.page.PageTitle> getPrevSelectedItems() {
            return null;
        }
        
        public UiState() {
            super();
        }
    }
}