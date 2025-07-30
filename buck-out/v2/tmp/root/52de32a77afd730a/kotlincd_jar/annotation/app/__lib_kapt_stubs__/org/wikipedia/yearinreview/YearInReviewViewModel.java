package org.wikipedia.yearinreview;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.StateFlow;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/yearinreview/YearInReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiScreenListState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "", "Lorg/wikipedia/yearinreview/YearInReviewScreenData;", "currentYear", "", "endTime", "Ljava/time/Instant;", "endTimeInMillis", "", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "startTime", "startTimeInMillis", "uiScreenListState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiScreenListState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchPersonalizedData", "", "Companion", "app.lib"})
public final class YearInReviewViewModel extends androidx.lifecycle.ViewModel {
    private final int currentYear = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.time.Instant startTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.Instant endTime = null;
    private final long startTimeInMillis = 0L;
    private final long endTimeInMillis = 0L;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<java.util.List<org.wikipedia.yearinreview.YearInReviewScreenData>>> _uiScreenListState;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.util.List<org.wikipedia.yearinreview.YearInReviewScreenData>>> uiScreenListState = null;
    private static final int MINIMUM_READ_COUNT = 3;
    private static final int MINIMUM_EDIT_COUNT = 1;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.yearinreview.YearInReviewScreenData getStartedData = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.yearinreview.YearInReviewScreenData readCountData = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.yearinreview.YearInReviewScreenData editCountData = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.yearinreview.YearInReviewScreenData nonEnglishCollectiveReadCountData = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.yearinreview.YearInReviewScreenData nonEnglishCollectiveEditCountData = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.yearinreview.YearInReviewViewModel.Companion Companion = null;
    
    public YearInReviewViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.util.List<org.wikipedia.yearinreview.YearInReviewScreenData>>> getUiScreenListState() {
        return null;
    }
    
    public final void fetchPersonalizedData() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/yearinreview/YearInReviewViewModel$Companion;", "", "()V", "MINIMUM_EDIT_COUNT", "", "MINIMUM_READ_COUNT", "editCountData", "Lorg/wikipedia/yearinreview/YearInReviewScreenData;", "getEditCountData", "()Lorg/wikipedia/yearinreview/YearInReviewScreenData;", "getStartedData", "getGetStartedData", "nonEnglishCollectiveEditCountData", "getNonEnglishCollectiveEditCountData", "nonEnglishCollectiveReadCountData", "getNonEnglishCollectiveReadCountData", "readCountData", "getReadCountData", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.yearinreview.YearInReviewScreenData getGetStartedData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.yearinreview.YearInReviewScreenData getReadCountData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.yearinreview.YearInReviewScreenData getEditCountData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.yearinreview.YearInReviewScreenData getNonEnglishCollectiveReadCountData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.yearinreview.YearInReviewScreenData getNonEnglishCollectiveEditCountData() {
            return null;
        }
    }
}