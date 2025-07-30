package org.wikipedia.page.linkpreview;

import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.ArticleLinkPreviewInteractionEvent;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.analytics.metricsplatform.ArticleLinkPreviewInteraction;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.databinding.DialogLinkPreviewBinding;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.edit.EditHandler;
import org.wikipedia.edit.EditSectionActivity;
import org.wikipedia.gallery.GalleryActivity;
import org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryViewListener;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.places.PlacesActivity;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.ClipboardUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.GeoUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.watchlist.WatchlistViewModel;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0005WXYZ[B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u001cH\u0002J \u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020\u001cH\u0002J\b\u00103\u001a\u00020+H\u0016J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020+H\u0016J\b\u0010=\u001a\u00020+H\u0016J\u0010\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020+H\u0016J\u0010\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020+2\u0006\u0010H\u001a\u00020IH\u0002J\u0018\u0010J\u001a\u00020+2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0002J\u0010\u0010N\u001a\u00020+2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020+H\u0002J\u0012\u0010R\u001a\u00020+2\b\u0010S\u001a\u0004\u0018\u00010FH\u0002J\u0010\u0010T\u001a\u00020+2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010U\u001a\u00020+2\u0006\u0010V\u001a\u000205H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'\u00a8\u0006\\"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$Callback;", "Landroid/content/DialogInterface$OnDismissListener;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "articleLinkPreviewInteractionEvent", "Lorg/wikipedia/analytics/eventplatform/ArticleLinkPreviewInteractionEvent;", "binding", "getBinding", "()Lerror/NonExistentClass;", "dismissCallback", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$DismissCallback;", "getDismissCallback", "()Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$DismissCallback;", "galleryViewListener", "Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryViewListener;", "linkPreviewInteraction", "Lorg/wikipedia/analytics/metricsplatform/ArticleLinkPreviewInteraction;", "loadPageCallback", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "getLoadPageCallback", "()Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "menuListener", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "navigateSuccess", "", "overlayView", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView;", "requestGalleryLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestStubArticleEditLauncher", "viewModel", "Lorg/wikipedia/page/linkpreview/LinkPreviewViewModel;", "getViewModel", "()Lorg/wikipedia/page/linkpreview/LinkPreviewViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "doAddToList", "", "goToLinkedPage", "inNewTab", "loadPage", "title", "Lorg/wikipedia/page/PageTitle;", "entry", "Lorg/wikipedia/history/HistoryEntry;", "onAddToList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDismiss", "dialogInterface", "Landroid/content/DialogInterface;", "onResume", "renderContentState", "summary", "Lorg/wikipedia/dataclient/page/PageSummary;", "renderErrorState", "throwable", "", "renderGalleryState", "it", "Lorg/wikipedia/page/linkpreview/LinkPreviewViewState$Gallery;", "sendPlacesEvent", "action", "", "activeInterface", "setPreviewContents", "contents", "Lorg/wikipedia/page/linkpreview/LinkPreviewContents;", "setupOverflowMenu", "showError", "caught", "showPreview", "showReadingListPopupMenu", "anchorView", "Companion", "DismissCallback", "LoadPageCallback", "OverlayViewCallback", "OverlayViewPlacesCallback", "app.lib"})
public final class LinkPreviewDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment implements org.wikipedia.page.linkpreview.LinkPreviewErrorView.Callback, android.content.DialogInterface.OnDismissListener {
    @org.jetbrains.annotations.Nullable()
    private DialogLinkPreviewBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.eventplatform.ArticleLinkPreviewInteractionEvent articleLinkPreviewInteractionEvent;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.metricsplatform.ArticleLinkPreviewInteraction linkPreviewInteraction;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.linkpreview.LinkPreviewOverlayView overlayView;
    private boolean navigateSuccess = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener menuListener = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryViewListener galleryViewListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestGalleryLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestStubArticleEditLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ENTRY = "entry";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_LOCATION = "location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_LAST_KNOWN_LOCATION = "lastKnownLocation";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.linkpreview.LinkPreviewDialog.Companion Companion = null;
    
    public LinkPreviewDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.page.linkpreview.LinkPreviewDialog.LoadPageCallback getLoadPageCallback() {
        return null;
    }
    
    private final org.wikipedia.page.linkpreview.LinkPreviewDialog.DismissCallback getDismissCallback() {
        return null;
    }
    
    private final org.wikipedia.page.linkpreview.LinkPreviewViewModel getViewModel() {
        return null;
    }
    
    private final void sendPlacesEvent(java.lang.String action, java.lang.String activeInterface) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupOverflowMenu() {
    }
    
    private final void renderGalleryState(org.wikipedia.page.linkpreview.LinkPreviewViewState.Gallery it) {
    }
    
    private final void renderContentState(org.wikipedia.dataclient.page.PageSummary summary) {
    }
    
    private final void renderErrorState(java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialogInterface) {
    }
    
    @java.lang.Override()
    public void onAddToList() {
    }
    
    @java.lang.Override()
    public void onDismiss() {
    }
    
    private final void doAddToList() {
    }
    
    private final void showReadingListPopupMenu(android.view.View anchorView) {
    }
    
    private final void showPreview(org.wikipedia.page.linkpreview.LinkPreviewContents contents) {
    }
    
    private final void showError(java.lang.Throwable caught) {
    }
    
    private final void setPreviewContents(org.wikipedia.page.linkpreview.LinkPreviewContents contents) {
    }
    
    private final void goToLinkedPage(boolean inNewTab) {
    }
    
    private final void loadPage(org.wikipedia.page.PageTitle title, org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$Companion;", "", "()V", "ARG_ENTRY", "", "ARG_LAST_KNOWN_LOCATION", "ARG_LOCATION", "newInstance", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog;", "entry", "Lorg/wikipedia/history/HistoryEntry;", "location", "Landroid/location/Location;", "lastKnownLocation", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.linkpreview.LinkPreviewDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.Nullable()
        android.location.Location location, @org.jetbrains.annotations.Nullable()
        android.location.Location lastKnownLocation) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$DismissCallback;", "", "onLinkPreviewDismiss", "", "app.lib"})
    public static abstract interface DismissCallback {
        
        public abstract void onLinkPreviewDismiss();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "", "onLinkPreviewLoadPage", "", "title", "Lorg/wikipedia/page/PageTitle;", "entry", "Lorg/wikipedia/history/HistoryEntry;", "inNewTab", "", "app.lib"})
    public static abstract interface LoadPageCallback {
        
        public abstract void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean inNewTab);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$OverlayViewCallback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "(Lorg/wikipedia/page/linkpreview/LinkPreviewDialog;)V", "onPrimaryClick", "", "onSecondaryClick", "onTertiaryClick", "app.lib"})
    final class OverlayViewCallback implements org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback {
        
        public OverlayViewCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPrimaryClick() {
        }
        
        @java.lang.Override()
        public void onSecondaryClick() {
        }
        
        @java.lang.Override()
        public void onTertiaryClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$OverlayViewPlacesCallback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "(Lorg/wikipedia/page/linkpreview/LinkPreviewDialog;)V", "onPrimaryClick", "", "onSecondaryClick", "onTertiaryClick", "app.lib"})
    final class OverlayViewPlacesCallback implements org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback {
        
        public OverlayViewPlacesCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPrimaryClick() {
        }
        
        @java.lang.Override()
        public void onSecondaryClick() {
        }
        
        @java.lang.Override()
        public void onTertiaryClick() {
        }
    }
}