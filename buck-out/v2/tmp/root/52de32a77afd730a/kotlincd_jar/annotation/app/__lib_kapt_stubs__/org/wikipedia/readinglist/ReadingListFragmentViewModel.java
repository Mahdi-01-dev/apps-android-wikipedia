package org.wikipedia.readinglist;

import androidx.lifecycle.ViewModel;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.recommended.RecommendedReadingListHelper;
import org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_recommendedListFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/readinglist/database/ReadingList;", "_updateListByIdFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_updateListFlow", "recommendedListFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getRecommendedListFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "updateListByIdFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getUpdateListByIdFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "updateListFlow", "getUpdateListFlow", "generateRecommendedReadingList", "", "updateList", "emptyTitle", "", "emptyDescription", "encoded", "", "updateListById", "readingListId", "", "app.lib"})
public final class ReadingListFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> _updateListByIdFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> updateListByIdFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> _updateListFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> updateListFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> _recommendedListFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> recommendedListFlow = null;
    
    public ReadingListFragmentViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> getUpdateListByIdFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> getUpdateListFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.readinglist.database.ReadingList>> getRecommendedListFlow() {
        return null;
    }
    
    public final void updateListById(long readingListId) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.lang.String emptyTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String emptyDescription, boolean encoded) {
    }
    
    public final void generateRecommendedReadingList() {
    }
}