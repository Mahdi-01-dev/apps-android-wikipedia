package org.wikipedia.dataclient.donate;

import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import okhttp3.Request;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.donate.DonationResult;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.GeoUtil;
import java.time.LocalDateTime;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/donate/CampaignCollection;", "", "()V", "CAMPAIGNS_URL", "", "CAMPAIGNS_URL_DEBUG", "CAMPAIGN_VERSION", "", "addDonationResult", "", "fromWeb", "", "amount", "", "currency", "recurring", "getActiveCampaigns", "", "Lorg/wikipedia/dataclient/donate/Campaign;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFormattedCampaignId", "campaignId", "CampaignProto", "app.lib"})
public final class CampaignCollection {
    private static final int CAMPAIGN_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CAMPAIGNS_URL = "https://donate.wikimedia.org/wiki/MediaWiki:AppsCampaignConfig.json?action=raw";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CAMPAIGNS_URL_DEBUG = "https://test.wikipedia.org/wiki/MediaWiki:AppsCampaignConfig.json?action=raw";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.donate.CampaignCollection INSTANCE = null;
    
    private CampaignCollection() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getActiveCampaigns(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.dataclient.donate.Campaign>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedCampaignId(@org.jetbrains.annotations.NotNull()
    java.lang.String campaignId) {
        return null;
    }
    
    public final void addDonationResult(boolean fromWeb, float amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, boolean recurring) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/donate/CampaignCollection$CampaignProto;", "", "version", "", "(I)V", "getVersion", "()I", "app.lib"})
    public static final class CampaignProto {
        private final int version = 0;
        
        public CampaignProto(int version) {
            super();
        }
        
        public final int getVersion() {
            return 0;
        }
        
        public CampaignProto() {
            super();
        }
    }
}