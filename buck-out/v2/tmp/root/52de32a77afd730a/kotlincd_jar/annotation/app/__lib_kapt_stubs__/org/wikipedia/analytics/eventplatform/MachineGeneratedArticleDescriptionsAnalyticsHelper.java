package org.wikipedia.analytics.eventplatform;

import android.content.Context;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ,\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010 \u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper;", "", "()V", "apiFailed", "", "articleDescriptionEditingEnd", "", "context", "Landroid/content/Context;", "articleDescriptionEditingStart", "composeGroupString", "", "composeLogString", "title", "Lorg/wikipedia/page/PageTitle;", "log", "logString", "logApiFailed", "throwable", "", "logAttempt", "logOnboardingShown", "logReportDialogDismissed", "logSuccess", "revId", "", "logSuggestionChosen", "logSuggestionReported", "suggestion", "reportReasonsList", "", "logSuggestionsDismissed", "logSuggestionsReceived", "isBlp", "Companion", "app.lib"})
public final class MachineGeneratedArticleDescriptionsAnalyticsHelper {
    private boolean apiFailed = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper.Companion Companion = null;
    
    public MachineGeneratedArticleDescriptionsAnalyticsHelper() {
        super();
    }
    
    public final void articleDescriptionEditingStart(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void articleDescriptionEditingEnd(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logAttempt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void logSuccess(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, long revId) {
    }
    
    public final void logSuggestionsReceived(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isBlp, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void logSuggestionChosen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void logSuggestionsDismissed(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void logSuggestionReported(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String suggestion, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> reportReasonsList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void logReportDialogDismissed(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logOnboardingShown(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logApiFailed(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    private final void log(android.content.Context context, java.lang.String logString) {
    }
    
    private final java.lang.String composeLogString(org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    private final java.lang.String composeGroupString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/MachineGeneratedArticleDescriptionsAnalyticsHelper$Companion;", "", "()V", "encode", "", "str", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String encode(java.lang.String str) {
            return null;
        }
    }
}