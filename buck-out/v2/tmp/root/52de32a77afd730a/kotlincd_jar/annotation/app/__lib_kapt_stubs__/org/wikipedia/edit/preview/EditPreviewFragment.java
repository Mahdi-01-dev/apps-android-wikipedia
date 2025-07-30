package org.wikipedia.edit.preview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.bridge.CommunicationBridge;
import org.wikipedia.bridge.CommunicationBridge.CommunicationBridgeListener;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.databinding.FragmentPreviewEditBinding;
import org.wikipedia.dataclient.RestService;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.okhttp.OkHttpWebViewClient;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.PageViewModel;
import org.wikipedia.page.references.PageReferences;
import org.wikipedia.page.references.ReferenceDialog;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002=>B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020-H\u0002J$\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020-H\u0016J\u0016\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0014\u0010(\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\n\u00a8\u0006?"}, d2 = {"Lorg/wikipedia/edit/preview/EditPreviewFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/bridge/CommunicationBridge$CommunicationBridgeListener;", "Lorg/wikipedia/page/references/ReferenceDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "isActive", "", "()Z", "isPreview", "linkHandler", "Lorg/wikipedia/page/LinkHandler;", "getLinkHandler", "()Lorg/wikipedia/page/LinkHandler;", "setLinkHandler", "(Lorg/wikipedia/page/LinkHandler;)V", "model", "Lorg/wikipedia/page/PageViewModel;", "getModel", "()Lorg/wikipedia/page/PageViewModel;", "references", "Lorg/wikipedia/page/references/PageReferences;", "referencesGroup", "", "Lorg/wikipedia/page/references/PageReferences$Reference;", "getReferencesGroup", "()Ljava/util/List;", "selectedReferenceIndex", "", "getSelectedReferenceIndex", "()I", "toolbarMargin", "getToolbarMargin", "webView", "getWebView", "callback", "Lorg/wikipedia/edit/preview/EditPreviewFragment$Callback;", "hide", "", "initWebView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "showPreview", "title", "Lorg/wikipedia/page/PageTitle;", "wikiText", "", "Callback", "EditLinkHandler", "app.lib"})
public final class EditPreviewFragment extends androidx.fragment.app.Fragment implements org.wikipedia.bridge.CommunicationBridge.CommunicationBridgeListener, org.wikipedia.page.references.ReferenceDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentPreviewEditBinding _binding;
    private org.wikipedia.bridge.CommunicationBridge bridge;
    private org.wikipedia.page.references.PageReferences references;
    public org.wikipedia.page.LinkHandler linkHandler;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageViewModel model = null;
    private final boolean isPreview = true;
    private final int toolbarMargin = 0;
    
    public EditPreviewFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.page.LinkHandler getLinkHandler() {
        return null;
    }
    
    public void setLinkHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.LinkHandler p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.page.PageViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object getWebView() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isPreview() {
        return false;
    }
    
    @java.lang.Override()
    public int getToolbarMargin() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<org.wikipedia.page.references.PageReferences.Reference> getReferencesGroup() {
        return null;
    }
    
    @java.lang.Override()
    public int getSelectedReferenceIndex() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Fetches preview html from the modified wikitext text, and shows (fades in) the Preview fragment,
     * which includes edit summary tags. When the fade-in completes, the state of the
     * actionbar button(s) is updated, and the preview is shown.
     * @param title The PageTitle associated with the text being modified.
     * @param wikiText The text of the section to be shown in the Preview.
     */
    public final void showPreview(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String wikiText) {
    }
    
    private final void initWebView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * Hides (fades out) the Preview fragment.
     * When fade-out completes, the state of the actionbar button(s) is updated.
     */
    public final void hide() {
    }
    
    private final org.wikipedia.edit.preview.EditPreviewFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/edit/preview/EditPreviewFragment$Callback;", "", "getParentPageTitle", "Lorg/wikipedia/page/PageTitle;", "isNewPage", "", "showProgressBar", "", "visible", "app.lib"})
    public static abstract interface Callback {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.wikipedia.page.PageTitle getParentPageTitle();
        
        public abstract void showProgressBar(boolean visible);
        
        public abstract boolean isNewPage();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\u0012\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/edit/preview/EditPreviewFragment$EditLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "context", "Landroid/content/Context;", "(Lorg/wikipedia/edit/preview/EditPreviewFragment;Landroid/content/Context;)V", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite$annotations", "()V", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onExternalLinkClicked", "uri", "Landroid/net/Uri;", "onInternalLinkClicked", "onMediaLinkClicked", "onPageLinkClicked", "anchor", "", "linkText", "showLeavingEditDialog", "runnable", "Ljava/lang/Runnable;", "app.lib"})
    public final class EditLinkHandler extends org.wikipedia.page.LinkHandler {
        
        public EditLinkHandler(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @java.lang.Override()
        public void onPageLinkClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String anchor, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText) {
        }
        
        @java.lang.Override()
        public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
        
        @java.lang.Override()
        public void onExternalLinkClicked(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
        }
        
        @java.lang.Override()
        public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
        
        @java.lang.Override()
        public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long revisionId) {
        }
        
        /**
         * Shows the user a dialogue asking them if they really meant to leave the edit
         * workflow, and warning them that their changes have not yet been saved.
         *
         * @param runnable The runnable that is run if the user chooses to leave.
         */
        private final void showLeavingEditDialog(java.lang.Runnable runnable) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.dataclient.WikiSite getWikiSite() {
            return null;
        }
        
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        @java.lang.Deprecated()
        public static void getWikiSite$annotations() {
        }
        
        @java.lang.Override()
        public void setWikiSite(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite) {
        }
    }
}