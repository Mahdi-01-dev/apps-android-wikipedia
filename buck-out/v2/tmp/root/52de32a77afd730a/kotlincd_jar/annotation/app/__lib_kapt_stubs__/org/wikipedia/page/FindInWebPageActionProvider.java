package org.wikipedia.page;

import org.wikipedia.analytics.eventplatform.ArticleFindInPageInteractionEvent;
import org.wikipedia.analytics.metricsplatform.ArticleFindInPageInteraction;
import org.wikipedia.views.FindInPageActionProvider;
import org.wikipedia.views.FindInPageActionProvider.FindInPageListener;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/page/FindInWebPageActionProvider;", "Lorg/wikipedia/views/FindInPageActionProvider;", "Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;", "fragment", "Lorg/wikipedia/page/PageFragment;", "articleFindInPageInteractionEvent", "Lorg/wikipedia/analytics/eventplatform/ArticleFindInPageInteractionEvent;", "articleFindInPageInteractionEventMetricsPlatform", "Lorg/wikipedia/analytics/metricsplatform/ArticleFindInPageInteraction;", "(Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/analytics/eventplatform/ArticleFindInPageInteractionEvent;Lorg/wikipedia/analytics/metricsplatform/ArticleFindInPageInteraction;)V", "searchQuery", "", "findInPage", "", "text", "onCloseClicked", "onFindNextClicked", "onFindNextLongClicked", "onFindPrevClicked", "onFindPrevLongClicked", "onSearchTextChanged", "app.lib"})
public final class FindInWebPageActionProvider extends org.wikipedia.views.FindInPageActionProvider implements org.wikipedia.views.FindInPageActionProvider.FindInPageListener {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.eventplatform.ArticleFindInPageInteractionEvent articleFindInPageInteractionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.metricsplatform.ArticleFindInPageInteraction articleFindInPageInteractionEventMetricsPlatform = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchQuery;
    
    public FindInWebPageActionProvider(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.ArticleFindInPageInteractionEvent articleFindInPageInteractionEvent, @org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.metricsplatform.ArticleFindInPageInteraction articleFindInPageInteractionEventMetricsPlatform) {
        super(null);
    }
    
    private final void findInPage(java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onFindNextClicked() {
    }
    
    @java.lang.Override()
    public void onFindNextLongClicked() {
    }
    
    @java.lang.Override()
    public void onFindPrevClicked() {
    }
    
    @java.lang.Override()
    public void onFindPrevLongClicked() {
    }
    
    @java.lang.Override()
    public void onCloseClicked() {
    }
    
    @java.lang.Override()
    public void onSearchTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
}