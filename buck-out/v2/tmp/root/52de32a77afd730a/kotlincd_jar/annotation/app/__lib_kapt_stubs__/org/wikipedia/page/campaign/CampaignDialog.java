package org.wikipedia.page.campaign;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.DonorExperienceEvent;
import org.wikipedia.dataclient.donate.Campaign;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.CustomTabsUtil;
import org.wikipedia.util.FeedbackUtil;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/page/campaign/CampaignDialog;", "Landroidx/appcompat/app/AlertDialog$Builder;", "Lorg/wikipedia/page/campaign/CampaignDialogView$Callback;", "context", "Landroid/content/Context;", "campaign", "Lorg/wikipedia/dataclient/donate/Campaign;", "(Landroid/content/Context;Lorg/wikipedia/dataclient/donate/Campaign;)V", "getCampaign", "()Lorg/wikipedia/dataclient/donate/Campaign;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "dismissDialog", "", "skipCampaign", "", "onClose", "onNegativeAction", "onNeutralAction", "onPositiveAction", "url", "", "show", "app.lib"})
public final class CampaignDialog extends androidx.appcompat.app.AlertDialog.Builder implements org.wikipedia.page.campaign.CampaignDialogView.Callback {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.donate.Campaign campaign = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    
    public CampaignDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.donate.Campaign campaign) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.donate.Campaign getCampaign() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog show() {
        return null;
    }
    
    private final void dismissDialog(boolean skipCampaign) {
    }
    
    @java.lang.Override()
    public void onPositiveAction(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onNegativeAction() {
    }
    
    @java.lang.Override()
    public void onNeutralAction() {
    }
    
    @java.lang.Override()
    public void onClose() {
    }
}