package org.wikipedia.suggestededits.provider;

import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.mwapi.MwQueryResult;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.dataclient.wikidata.Entities;
import org.wikipedia.descriptions.DescriptionEditUtil;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.SuggestedEditsRecentEditsViewModel;
import org.wikipedia.util.log.L;
import java.time.Instant;
import java.util.concurrent.Semaphore;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010$J \u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010)J4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0\u000e2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010,J \u0010-\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010$J4\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010/J\u0018\u00100\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u00103J\u001c\u00104\u001a\u0002052\u0006\u0010\"\u001a\u00020\t2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b07R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lorg/wikipedia/suggestededits/provider/EditingSuggestionsProvider;", "", "()V", "MAX_RETRY_LIMIT", "", "articlesWithImageRecommendationsCache", "Lkotlin/collections/ArrayDeque;", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "articlesWithImageRecommendationsCacheLang", "", "articlesWithImageRecommendationsLastMillis", "articlesWithMissingDescriptionCache", "articlesWithMissingDescriptionCacheLang", "articlesWithTranslatableDescriptionCache", "Lkotlin/Pair;", "Lorg/wikipedia/page/PageTitle;", "articlesWithTranslatableDescriptionCacheFromLang", "articlesWithTranslatableDescriptionCacheToLang", "imagesWithMissingCaptionsCache", "imagesWithMissingCaptionsCacheLang", "imagesWithMissingTagsCache", "imagesWithTranslatableCaptionCache", "imagesWithTranslatableCaptionCacheFromLang", "imagesWithTranslatableCaptionCacheToLang", "mutex", "Ljava/util/concurrent/Semaphore;", "revertCandidateCache", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$RecentChange;", "revertCandidateLang", "revertCandidateLastRevId", "revertCandidateLastTimeStamp", "Ljava/time/Instant;", "kotlin.jvm.PlatformType", "getNextArticleWithImageRecommendation", "lang", "retryLimit", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextArticleWithMissingDescription", "Lorg/wikipedia/dataclient/page/PageSummary;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceWiki", "targetLang", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextImageWithMissingCaption", "sourceLang", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextImageWithMissingTags", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextRevertCandidate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "populateRevertCandidateCache", "", "recentChanges", "", "ListEmptyException", "app.lib"})
public final class EditingSuggestionsProvider {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.Semaphore mutex = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<java.lang.String> articlesWithMissingDescriptionCache = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String articlesWithMissingDescriptionCacheLang = "";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<kotlin.Pair<org.wikipedia.page.PageTitle, org.wikipedia.page.PageTitle>> articlesWithTranslatableDescriptionCache = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String articlesWithTranslatableDescriptionCacheFromLang = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String articlesWithTranslatableDescriptionCacheToLang = "";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<java.lang.String> imagesWithMissingCaptionsCache = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String imagesWithMissingCaptionsCacheLang = "";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<kotlin.Pair<java.lang.String, java.lang.String>> imagesWithTranslatableCaptionCache = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String imagesWithTranslatableCaptionCacheFromLang = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String imagesWithTranslatableCaptionCacheToLang = "";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<org.wikipedia.dataclient.mwapi.MwQueryPage> imagesWithMissingTagsCache = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<org.wikipedia.dataclient.mwapi.MwQueryPage> articlesWithImageRecommendationsCache = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String articlesWithImageRecommendationsCacheLang = "";
    private static long articlesWithImageRecommendationsLastMillis = 0L;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String revertCandidateLang = "";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.collections.ArrayDeque<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> revertCandidateCache = null;
    private static long revertCandidateLastRevId = 0L;
    private static java.time.Instant revertCandidateLastTimeStamp;
    private static final long MAX_RETRY_LIMIT = 20L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.provider.EditingSuggestionsProvider INSTANCE = null;
    
    private EditingSuggestionsProvider() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextArticleWithMissingDescription(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, long retryLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.page.PageSummary> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextArticleWithMissingDescription(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite sourceWiki, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLang, long retryLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends org.wikipedia.dataclient.page.PageSummary, ? extends org.wikipedia.dataclient.page.PageSummary>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextImageWithMissingCaption(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, long retryLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextImageWithMissingCaption(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceLang, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLang, long retryLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextImageWithMissingTags(long retryLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryPage> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextArticleWithImageRecommendation(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, long retryLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryPage> $completion) {
        return null;
    }
    
    public final void populateRevertCandidateCache(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> recentChanges) {
    }
    
    @kotlin.Suppress(names = {"KotlinConstantConditions"})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNextRevertCandidate(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResult.RecentChange> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/suggestededits/provider/EditingSuggestionsProvider$ListEmptyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "app.lib"})
    public static final class ListEmptyException extends java.lang.RuntimeException {
        
        public ListEmptyException() {
            super();
        }
    }
}