package org.wikipedia.analytics;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.util.MathUtil;
import java.util.concurrent.TimeUnit;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u00020D2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020DR\u001e\u0010\u0003\u001a\u00020\u00048B@\u0002X\u0083\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002R$\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0016R$\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u0016R$\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\u0016R$\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0016R$\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\u0016R$\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\u0016R$\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\u0016R$\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\u0016R$\u00107\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\u0016R$\u0010;\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR$\u0010?\u001a\u00020\u00048F@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b@\u0010\u0002\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\u0016\u00a8\u0006J"}, d2 = {"Lorg/wikipedia/analytics/SessionData;", "", "()V", "averagedPageLatency", "", "getAveragedPageLatency$annotations", "getAveragedPageLatency", "()I", "lastTouchTime", "", "getLastTouchTime$annotations", "getLastTouchTime", "()J", "setLastTouchTime", "(J)V", "pageLatency", "Lorg/wikipedia/util/MathUtil$Averaged;", "getPageLatency$annotations", "pagesFromBack", "getPagesFromBack$annotations", "getPagesFromBack", "setPagesFromBack", "(I)V", "pagesFromExternal", "getPagesFromExternal$annotations", "getPagesFromExternal", "setPagesFromExternal", "pagesFromHistory", "getPagesFromHistory$annotations", "getPagesFromHistory", "setPagesFromHistory", "pagesFromInternal", "getPagesFromInternal$annotations", "getPagesFromInternal", "setPagesFromInternal", "pagesFromLangLink", "getPagesFromLangLink$annotations", "getPagesFromLangLink", "setPagesFromLangLink", "pagesFromRandom", "getPagesFromRandom$annotations", "getPagesFromRandom", "setPagesFromRandom", "pagesFromReadingList", "getPagesFromReadingList$annotations", "getPagesFromReadingList", "setPagesFromReadingList", "pagesFromSearch", "getPagesFromSearch$annotations", "getPagesFromSearch", "setPagesFromSearch", "pagesFromSuggestedEdits", "getPagesFromSuggestedEdits$annotations", "getPagesFromSuggestedEdits", "setPagesFromSuggestedEdits", "pagesWithNoDescription", "getPagesWithNoDescription$annotations", "getPagesWithNoDescription", "setPagesWithNoDescription", "startTime", "getStartTime$annotations", "getStartTime", "setStartTime", "totalPages", "getTotalPages$annotations", "getTotalPages", "setTotalPages", "addPageFromBack", "", "addPageLatency", "addPageViewed", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addPageWithNoDescription", "app.lib"})
@kotlin.Suppress(names = {"suspiciousVarProperty"})
public final class SessionData {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.MathUtil.Averaged<java.lang.Long> pageLatency = null;
    private int totalPages = 0;
    private long startTime = 0L;
    private long lastTouchTime = 0L;
    private int averagedPageLatency = 0;
    private int pagesFromSearch = 0;
    private int pagesFromRandom = 0;
    private int pagesFromLangLink = 0;
    private int pagesFromInternal = 0;
    private int pagesFromExternal = 0;
    private int pagesFromHistory = 0;
    private int pagesFromReadingList = 0;
    private int pagesFromBack = 0;
    private int pagesWithNoDescription = 0;
    private int pagesFromSuggestedEdits = 0;
    
    public SessionData() {
        super();
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    private static void getPageLatency$annotations() {
    }
    
    public final void setTotalPages(int p0) {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "total_pages")
    @java.lang.Deprecated()
    public static void getTotalPages$annotations() {
    }
    
    public final long getStartTime() {
        return 0L;
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getStartTime$annotations() {
    }
    
    public final void setStartTime(long p0) {
    }
    
    public final long getLastTouchTime() {
        return 0L;
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getLastTouchTime$annotations() {
    }
    
    public final void setLastTouchTime(long p0) {
    }
    
    private final int getAveragedPageLatency() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "page_load_latency_ms")
    @java.lang.Deprecated()
    private static void getAveragedPageLatency$annotations() {
    }
    
    public final int getPagesFromSearch() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_search")
    @java.lang.Deprecated()
    public static void getPagesFromSearch$annotations() {
    }
    
    public final void setPagesFromSearch(int p0) {
    }
    
    public final int getPagesFromRandom() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_random")
    @java.lang.Deprecated()
    public static void getPagesFromRandom$annotations() {
    }
    
    public final void setPagesFromRandom(int p0) {
    }
    
    public final int getPagesFromLangLink() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_lang_link")
    @java.lang.Deprecated()
    public static void getPagesFromLangLink$annotations() {
    }
    
    public final void setPagesFromLangLink(int p0) {
    }
    
    public final int getPagesFromInternal() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_internal")
    @java.lang.Deprecated()
    public static void getPagesFromInternal$annotations() {
    }
    
    public final void setPagesFromInternal(int p0) {
    }
    
    public final int getPagesFromExternal() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_external")
    @java.lang.Deprecated()
    public static void getPagesFromExternal$annotations() {
    }
    
    public final void setPagesFromExternal(int p0) {
    }
    
    public final int getPagesFromHistory() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_history")
    @java.lang.Deprecated()
    public static void getPagesFromHistory$annotations() {
    }
    
    public final void setPagesFromHistory(int p0) {
    }
    
    public final int getPagesFromReadingList() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_reading_list")
    @java.lang.Deprecated()
    public static void getPagesFromReadingList$annotations() {
    }
    
    public final void setPagesFromReadingList(int p0) {
    }
    
    public final int getPagesFromBack() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_back")
    @java.lang.Deprecated()
    public static void getPagesFromBack$annotations() {
    }
    
    public final void setPagesFromBack(int p0) {
    }
    
    public final int getPagesWithNoDescription() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "no_description")
    @java.lang.Deprecated()
    public static void getPagesWithNoDescription$annotations() {
    }
    
    public final void setPagesWithNoDescription(int p0) {
    }
    
    public final int getPagesFromSuggestedEdits() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "from_suggested_edits")
    @java.lang.Deprecated()
    public static void getPagesFromSuggestedEdits$annotations() {
    }
    
    public final void setPagesFromSuggestedEdits(int p0) {
    }
    
    public final void addPageViewed(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void addPageLatency(long pageLatency) {
    }
    
    public final void addPageFromBack() {
    }
    
    public final void addPageWithNoDescription() {
    }
}