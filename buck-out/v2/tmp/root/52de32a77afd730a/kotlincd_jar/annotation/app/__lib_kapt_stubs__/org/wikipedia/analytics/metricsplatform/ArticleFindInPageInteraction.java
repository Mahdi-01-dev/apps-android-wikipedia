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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/analytics/metricsplatform/ArticleFindInPageInteraction;", "Lorg/wikipedia/analytics/metricsplatform/TimedMetricsEvent;", "fragment", "Lorg/wikipedia/page/PageFragment;", "(Lorg/wikipedia/page/PageFragment;)V", "findText", "", "getFindText", "()Ljava/lang/String;", "setFindText", "(Ljava/lang/String;)V", "numFindNext", "", "numFindPrev", "pageHeight", "getPageHeight", "()I", "setPageHeight", "(I)V", "addFindNext", "", "addFindPrev", "logDone", "app.lib"})
public final class ArticleFindInPageInteraction extends org.wikipedia.analytics.metricsplatform.TimedMetricsEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    private int numFindNext = 0;
    private int numFindPrev = 0;
    private int pageHeight = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String findText = "";
    
    public ArticleFindInPageInteraction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment) {
        super();
    }
    
    public final int getPageHeight() {
        return 0;
    }
    
    public final void setPageHeight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFindText() {
        return null;
    }
    
    public final void setFindText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void addFindNext() {
    }
    
    public final void addFindPrev() {
    }
    
    public final void logDone() {
    }
}