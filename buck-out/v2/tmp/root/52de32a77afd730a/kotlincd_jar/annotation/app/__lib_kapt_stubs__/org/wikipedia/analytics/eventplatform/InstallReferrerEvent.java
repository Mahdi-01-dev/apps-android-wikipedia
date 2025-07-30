package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "/analytics/mobile_apps/android_install_referrer_event/1.1.0")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/InstallReferrerEvent;", "Lorg/wikipedia/analytics/eventplatform/MobileAppsEventWithTemp;", "referrerUrl", "", "campaignId", "utfMedium", "utfCampaign", "utfSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId$annotations", "()V", "getReferrerUrl$annotations", "getUtfCampaign$annotations", "getUtfMedium$annotations", "getUtfSource$annotations", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class InstallReferrerEvent extends org.wikipedia.analytics.eventplatform.MobileAppsEventWithTemp {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String referrerUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String campaignId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String utfMedium = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String utfCampaign = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String utfSource = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STREAM_NAME = "android.install_referrer_event";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_REFERRER_URL = "referrer_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_UTM_MEDIUM = "utm_medium";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_UTM_CAMPAIGN = "utm_campaign";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_UTM_SOURCE = "utm_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_CHANNEL = "channel";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.InstallReferrerEvent.Companion Companion = null;
    
    public InstallReferrerEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String referrerUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String campaignId, @org.jetbrains.annotations.NotNull()
    java.lang.String utfMedium, @org.jetbrains.annotations.NotNull()
    java.lang.String utfCampaign, @org.jetbrains.annotations.NotNull()
    java.lang.String utfSource) {
    }
    
    @kotlinx.serialization.SerialName(value = "referrer_url")
    @java.lang.Deprecated()
    private static void getReferrerUrl$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "campaign_id")
    @java.lang.Deprecated()
    private static void getCampaignId$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "utm_medium")
    @java.lang.Deprecated()
    private static void getUtfMedium$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "utm_campaign")
    @java.lang.Deprecated()
    private static void getUtfCampaign$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "utm_source")
    @java.lang.Deprecated()
    private static void getUtfSource$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/InstallReferrerEvent$Companion;", "", "()V", "PARAM_CHANNEL", "", "PARAM_REFERRER_URL", "PARAM_UTM_CAMPAIGN", "PARAM_UTM_MEDIUM", "PARAM_UTM_SOURCE", "STREAM_NAME", "logInstall", "", "referrerUrl", "utfMedium", "utfCampaign", "utfSource", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void logInstall(@org.jetbrains.annotations.Nullable()
        java.lang.String referrerUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String utfMedium, @org.jetbrains.annotations.Nullable()
        java.lang.String utfCampaign, @org.jetbrains.annotations.Nullable()
        java.lang.String utfSource) {
        }
    }
}