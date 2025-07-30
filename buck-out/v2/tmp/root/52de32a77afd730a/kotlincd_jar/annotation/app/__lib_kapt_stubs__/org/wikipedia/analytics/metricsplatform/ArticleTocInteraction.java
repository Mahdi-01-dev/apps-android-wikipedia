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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/ArticleTocInteraction;", "Lorg/wikipedia/analytics/metricsplatform/MetricsEvent;", "fragment", "Lorg/wikipedia/page/PageFragment;", "numSections", "", "(Lorg/wikipedia/page/PageFragment;I)V", "lastScrollStartMillis", "", "numOpens", "numSectionClicks", "totalOpenedSec", "logClick", "", "logEvent", "scrollStart", "scrollStop", "app.lib"})
public final class ArticleTocInteraction extends org.wikipedia.analytics.metricsplatform.MetricsEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    private final int numSections = 0;
    private int numOpens = 0;
    private int numSectionClicks = 0;
    private long lastScrollStartMillis = 0L;
    private int totalOpenedSec = 0;
    
    public ArticleTocInteraction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, int numSections) {
        super();
    }
    
    public final void scrollStart() {
    }
    
    public final void scrollStop() {
    }
    
    public final void logClick() {
    }
    
    public final void logEvent() {
    }
}