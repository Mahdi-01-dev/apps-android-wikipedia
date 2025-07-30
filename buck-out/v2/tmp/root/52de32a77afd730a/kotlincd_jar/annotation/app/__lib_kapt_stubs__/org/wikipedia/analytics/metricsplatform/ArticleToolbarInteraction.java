package org.wikipedia.analytics.metricsplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikimedia.metrics_platform.context.PageData;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageFragment;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/ArticleToolbarInteraction;", "Lorg/wikipedia/analytics/metricsplatform/TimedMetricsEvent;", "fragment", "Lorg/wikipedia/page/PageFragment;", "(Lorg/wikipedia/page/PageFragment;)V", "logBackClick", "", "logCategoriesClick", "logContentsClick", "logEditArticleClick", "logEditHistoryArticleClick", "logEditHistoryClick", "logExploreClick", "logFindInArticleClick", "logForwardClick", "logLanguageClick", "logLoaded", "logMoreClick", "logNewTabClick", "logNotificationClick", "logSaveClick", "logSearchWikipediaClick", "logShareClick", "logTabsClick", "logTalkPageArticleClick", "logTalkPageClick", "logThemeClick", "logTocSwipe", "logUnWatchClick", "logWatchClick", "pause", "reset", "resume", "submitEvent", "action", "", "app.lib"})
public final class ArticleToolbarInteraction extends org.wikipedia.analytics.metricsplatform.TimedMetricsEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    
    public ArticleToolbarInteraction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment) {
        super();
    }
    
    public final void logLoaded() {
    }
    
    public final void logSaveClick() {
    }
    
    public final void logLanguageClick() {
    }
    
    public final void logFindInArticleClick() {
    }
    
    public final void logThemeClick() {
    }
    
    public final void logContentsClick() {
    }
    
    public final void logMoreClick() {
    }
    
    public final void logShareClick() {
    }
    
    public final void logTalkPageClick() {
    }
    
    public final void logEditHistoryClick() {
    }
    
    public final void logNewTabClick() {
    }
    
    public final void logExploreClick() {
    }
    
    public final void logForwardClick() {
    }
    
    public final void logNotificationClick() {
    }
    
    public final void logTabsClick() {
    }
    
    public final void logSearchWikipediaClick() {
    }
    
    public final void logBackClick() {
    }
    
    public final void logEditHistoryArticleClick() {
    }
    
    public final void logTalkPageArticleClick() {
    }
    
    public final void logTocSwipe() {
    }
    
    public final void logCategoriesClick() {
    }
    
    public final void logWatchClick() {
    }
    
    public final void logUnWatchClick() {
    }
    
    public final void logEditArticleClick() {
    }
    
    public final void pause() {
    }
    
    public final void resume() {
    }
    
    public final void reset() {
    }
    
    private final void submitEvent(java.lang.String action) {
    }
}