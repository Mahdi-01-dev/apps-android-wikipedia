package org.wikipedia.readinglist.recommended;

import kotlinx.serialization.Serializable;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.NewRecommendedReadingListEvent;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.RecommendedPage;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListHelper;", "", "()V", "MAX_RETRIES", "", "SUGGESTION_REQUEST_ITEMS", "generateRecommendedReadingList", "", "Lorg/wikipedia/readinglist/database/RecommendedPage;", "shouldExpireOldPages", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendedPage", "Lorg/wikipedia/page/PageTitle;", "sourceWithOffset", "Lorg/wikipedia/readinglist/recommended/SourceWithOffset;", "offset", "takeSize", "(Lorg/wikipedia/readinglist/recommended/SourceWithOffset;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readyToGenerateList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
public final class RecommendedReadingListHelper {
    private static final int SUGGESTION_REQUEST_ITEMS = 50;
    private static final int MAX_RETRIES = 10;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.recommended.RecommendedReadingListHelper INSTANCE = null;
    
    private RecommendedReadingListHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object readyToGenerateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object generateRecommendedReadingList(boolean shouldExpireOldPages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.RecommendedPage>> $completion) {
        return null;
    }
    
    private final java.lang.Object getRecommendedPage(org.wikipedia.readinglist.recommended.SourceWithOffset sourceWithOffset, int offset, int takeSize, kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.page.PageTitle>> $completion) {
        return null;
    }
}