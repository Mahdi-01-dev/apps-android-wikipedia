package org.wikipedia.page.campaign;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.text.method.LinkMovementMethodCompat;
import org.wikipedia.analytics.eventplatform.DonorExperienceEvent;
import org.wikipedia.databinding.DialogCampaignBinding;
import org.wikipedia.dataclient.donate.Campaign;
import org.wikipedia.dataclient.donate.CampaignCollection;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/page/campaign/CampaignDialogView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/page/campaign/CampaignDialogView$Callback;", "getCallback", "()Lorg/wikipedia/page/campaign/CampaignDialogView$Callback;", "setCallback", "(Lorg/wikipedia/page/campaign/CampaignDialogView$Callback;)V", "showNeutralButton", "", "getShowNeutralButton", "()Z", "setShowNeutralButton", "(Z)V", "setupViews", "", "campaignId", "", "campaignAssets", "Lorg/wikipedia/dataclient/donate/Campaign$Assets;", "Callback", "app.lib"})
public final class CampaignDialogView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private boolean showNeutralButton = true;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.campaign.CampaignDialogView.Callback callback;
    
    public CampaignDialogView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final boolean getShowNeutralButton() {
        return false;
    }
    
    public final void setShowNeutralButton(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.campaign.CampaignDialogView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.campaign.CampaignDialogView.Callback p0) {
    }
    
    public final void setupViews(@org.jetbrains.annotations.NotNull()
    java.lang.String campaignId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.donate.Campaign.Assets campaignAssets) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/campaign/CampaignDialogView$Callback;", "", "onClose", "", "onNegativeAction", "onNeutralAction", "onPositiveAction", "url", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onPositiveAction(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void onNegativeAction();
        
        public abstract void onNeutralAction();
        
        public abstract void onClose();
    }
}