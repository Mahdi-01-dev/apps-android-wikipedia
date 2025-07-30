package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.Required;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0006R\u0016\u0010\f\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0006\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/MobileAppsEvent;", "Lorg/wikipedia/analytics/eventplatform/Event;", "_streamName", "", "(Ljava/lang/String;)V", "get_streamName$annotations", "()V", "anon", "", "getAnon$annotations", "appInstallId", "getAppInstallId$annotations", "sessionId", "getSessionId$annotations", "Lorg/wikipedia/analytics/eventplatform/AppearanceSettingInteractionEvent$AppearanceSettingInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/ArticleFindInPageInteractionEvent$ArticleFindInPageInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/ArticleInteractionEvent$ArticleInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/ArticleLinkPreviewInteractionEvent$ArticleLinkPreviewInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/ArticleTocInteractionEvent$ArticleTocInteractionEventImpl;", "Lorg/wikipedia/analytics/eventplatform/CreateAccountEvent$CreateAccountEventImpl;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "Lorg/wikipedia/analytics/eventplatform/TestAppsEvent;", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public abstract class MobileAppsEvent extends org.wikipedia.analytics.eventplatform.Event {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String _streamName = null;
    private final boolean anon = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sessionId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appInstallId = null;
    
    private MobileAppsEvent(java.lang.String _streamName) {
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    private static void get_streamName$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "is_anon")
    @kotlinx.serialization.Required()
    @java.lang.Deprecated()
    private static void getAnon$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "app_session_id")
    @kotlinx.serialization.Required()
    @java.lang.Deprecated()
    private static void getSessionId$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "app_install_id")
    @kotlinx.serialization.Required()
    @java.lang.Deprecated()
    private static void getAppInstallId$annotations() {
    }
}