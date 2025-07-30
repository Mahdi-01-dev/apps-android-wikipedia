package org.wikipedia.page.leadimages;

import android.net.Uri;
import androidx.core.app.ActivityOptionsCompat;
import org.wikipedia.Constants;
import org.wikipedia.Constants.ImageEditType;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.commons.ImageTagsProvider;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.gallery.GalleryActivity;
import org.wikipedia.page.PageFragment;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ObservableWebView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 B2\u00020\u0001:\u0001BB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0006\u00107\u001a\u000208J\b\u00109\u001a\u000208H\u0002J\u0006\u0010:\u001a\u000208J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u000208H\u0002J\u0006\u0010=\u001a\u000208J\u0010\u0010>\u001a\u0002082\b\u0010?\u001a\u0004\u0018\u00010\u0010J\u0006\u0010@\u001a\u000208J\b\u0010A\u001a\u000208H\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010$R\u000e\u0010&\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0012R\u0014\u0010,\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010/8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u00101R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00102\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b6\u0010)\u00a8\u0006C"}, d2 = {"Lorg/wikipedia/page/leadimages/LeadImagesHandler;", "", "parentFragment", "Lorg/wikipedia/page/PageFragment;", "webView", "Lorg/wikipedia/views/ObservableWebView;", "pageHeaderView", "Lorg/wikipedia/page/leadimages/PageHeaderView;", "callback", "Lorg/wikipedia/page/PageFragment$Callback;", "(Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/views/ObservableWebView;Lorg/wikipedia/page/leadimages/PageHeaderView;Lorg/wikipedia/page/PageFragment$Callback;)V", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "callToActionEditLang", "", "getCallToActionEditLang", "()Ljava/lang/String;", "callToActionIsTranslation", "", "callToActionSourceSummary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "callToActionTargetSummary", "captionSourcePageTitle", "Lorg/wikipedia/page/PageTitle;", "captionTargetPageTitle", "displayHeightDp", "", "handlerJob", "Lkotlinx/coroutines/Job;", "imageEditType", "Lorg/wikipedia/Constants$ImageEditType;", "imagePage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "isLeadImageEnabled", "()Z", "isMainPage", "lastImageTitleForCallToAction", "leadImageHeight", "getLeadImageHeight", "()I", "leadImageUrl", "getLeadImageUrl", "leadImageWidth", "getLeadImageWidth", "page", "Lorg/wikipedia/page/Page;", "getPage", "()Lorg/wikipedia/page/Page;", "title", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "topMargin", "getTopMargin", "dispose", "", "finalizeCallToAction", "hide", "initArticleHeaderView", "initDisplayDimensions", "loadLeadImage", "openImageInGallery", "language", "refreshCallToActionVisibility", "updateCallToAction", "Companion", "app.lib"})
public final class LeadImagesHandler {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment parentFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.leadimages.PageHeaderView pageHeaderView = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.page.PageFragment.Callback callback = null;
    private int displayHeightDp = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.PageSummaryForEdit callToActionSourceSummary;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.PageSummaryForEdit callToActionTargetSummary;
    private boolean callToActionIsTranslation = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastImageTitleForCallToAction = "";
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.Constants.ImageEditType imageEditType;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle captionSourcePageTitle;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle captionTargetPageTitle;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage imagePage;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job handlerJob;
    private static final int MIN_SCREEN_HEIGHT_DP = 480;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.leadimages.LeadImagesHandler.Companion Companion = null;
    
    public LeadImagesHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment parentFragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView webView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.leadimages.PageHeaderView pageHeaderView, @org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageFragment.Callback callback) {
        super();
    }
    
    private final boolean isMainPage() {
        return false;
    }
    
    private final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    private final org.wikipedia.page.Page getPage() {
        return null;
    }
    
    private final androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    private final boolean isLeadImageEnabled() {
        return false;
    }
    
    private final int getLeadImageWidth() {
        return 0;
    }
    
    private final int getLeadImageHeight() {
        return 0;
    }
    
    private final java.lang.String getLeadImageUrl() {
        return null;
    }
    
    public final int getTopMargin() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCallToActionEditLang() {
        return null;
    }
    
    private final void initDisplayDimensions() {
    }
    
    private final void updateCallToAction() {
    }
    
    private final void finalizeCallToAction() {
    }
    
    private final void initArticleHeaderView() {
    }
    
    public final void hide() {
    }
    
    public final void refreshCallToActionVisibility() {
    }
    
    public final void loadLeadImage() {
    }
    
    public final void openImageInGallery(@org.jetbrains.annotations.Nullable()
    java.lang.String language) {
    }
    
    public final void dispose() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/leadimages/LeadImagesHandler$Companion;", "", "()V", "MIN_SCREEN_HEIGHT_DP", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}