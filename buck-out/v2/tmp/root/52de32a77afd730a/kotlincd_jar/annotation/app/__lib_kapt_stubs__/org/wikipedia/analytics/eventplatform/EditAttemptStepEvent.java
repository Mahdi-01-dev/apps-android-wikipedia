package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;

@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "/analytics/legacy/editattemptstep/2.0.3")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EditAttemptStepEvent;", "Lorg/wikipedia/analytics/eventplatform/Event;", "event", "Lorg/wikipedia/analytics/eventplatform/EditAttemptStepInteractionEvent;", "(Lorg/wikipedia/analytics/eventplatform/EditAttemptStepInteractionEvent;)V", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class EditAttemptStepEvent extends org.wikipedia.analytics.eventplatform.Event {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.analytics.eventplatform.EditAttemptStepInteractionEvent event = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERFACE_WIKITEXT = "wikitext";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERFACE_OTHER = "other";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STREAM_NAME = "eventlogging_EditAttemptStep";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INTEGRATION_ID = "app-android";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.EditAttemptStepEvent.Companion Companion = null;
    
    public EditAttemptStepEvent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.EditAttemptStepInteractionEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EditAttemptStepEvent$Companion;", "", "()V", "INTEGRATION_ID", "", "INTERFACE_OTHER", "INTERFACE_WIKITEXT", "STREAM_NAME", "getUserIdForWikiSite", "", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "logInit", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "editorInterface", "logSaveAttempt", "logSaveFailure", "logSaveIntent", "logSaveSuccess", "submitEditAttemptEvent", "action", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void logInit(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String editorInterface) {
        }
        
        public final void logSaveIntent(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String editorInterface) {
        }
        
        public final void logSaveAttempt(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String editorInterface) {
        }
        
        public final void logSaveSuccess(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String editorInterface) {
        }
        
        public final void logSaveFailure(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String editorInterface) {
        }
        
        private final void submitEditAttemptEvent(java.lang.String action, java.lang.String editorInterface, org.wikipedia.page.PageTitle pageTitle) {
        }
        
        private final int getUserIdForWikiSite(org.wikipedia.dataclient.WikiSite wikiSite) {
            return 0;
        }
    }
}