package org.wikipedia.gallery;

import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.Constants.ImageEditType;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.ActivityGalleryBinding;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.wikidata.Entities;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.suggestededits.SuggestedEditsImageTagEditActivity;
import org.wikipedia.suggestededits.SuggestedEditsSnackbars;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.GradientUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.PositionAwareFragmentStateAdapter;
import org.wikipedia.views.ViewAnimations;
import org.wikipedia.views.ViewUtil;
import java.io.File;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004mnopB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0017H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\tH\u0002J\b\u00106\u001a\u00020)H\u0016J\u0010\u00107\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020?H\u0002J\u001a\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020\t2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\b\u0010D\u001a\u00020)H\u0016J\u0010\u0010E\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020)2\u0006\u0010>\u001a\u00020?H\u0016J\u0016\u0010J\u001a\u00020)2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002J\b\u0010N\u001a\u00020)H\u0002J\b\u0010O\u001a\u00020\tH\u0002J \u0010P\u001a\u00020)2\u0006\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020\tH\u0016J\b\u0010T\u001a\u00020)H\u0002J\u0006\u0010U\u001a\u00020)J\b\u0010V\u001a\u00020)H\u0016J\u0010\u0010W\u001a\u00020)2\u0006\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020)H\u0016J\u0010\u0010[\u001a\u00020)2\u0006\u0010\\\u001a\u00020<H\u0014J*\u0010]\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000b2\b\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020!2\u0006\u0010Q\u001a\u000201H\u0016J\b\u0010a\u001a\u00020)H\u0002J\u0010\u0010b\u001a\u00020)2\u0006\u0010c\u001a\u00020\tH\u0002J\u0010\u0010d\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\b\u0010e\u001a\u00020)H\u0014J\u0010\u0010f\u001a\u00020)2\u0006\u0010Q\u001a\u000201H\u0002J\b\u0010g\u001a\u00020)H\u0002J\u0010\u0010h\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0010\u0010i\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0010\u0010j\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0006\u0010k\u001a\u00020)J\u0018\u0010l\u001a\u00020)2\u0006\u0010A\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0017H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%\u00a8\u0006q"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "Lorg/wikipedia/gallery/GalleryItemFragment$Callback;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "controlsShowing", "", "currentItem", "Lorg/wikipedia/gallery/GalleryItemFragment;", "getCurrentItem", "()Lorg/wikipedia/gallery/GalleryItemFragment;", "downloadReceiver", "Lorg/wikipedia/gallery/MediaDownloadReceiver;", "downloadReceiverCallback", "Lorg/wikipedia/gallery/GalleryActivity$MediaDownloadReceiverCallback;", "galleryAdapter", "Lorg/wikipedia/gallery/GalleryActivity$GalleryItemAdapter;", "imageEditType", "Lorg/wikipedia/Constants$ImageEditType;", "initialImageIndex", "", "linkMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "pageChangeListener", "Lorg/wikipedia/gallery/GalleryActivity$GalleryPageChangeListener;", "requestAddCaptionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestAddImageTagsLauncher", "targetLanguageCode", "", "viewModel", "Lorg/wikipedia/gallery/GalleryViewModel;", "getViewModel", "()Lorg/wikipedia/gallery/GalleryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "decideImageEditType", "", "item", "tagsCount", "displayApplicableDescription", "fetchGalleryDescription", "callingFragment", "finishWithPageResult", "resultTitle", "Lorg/wikipedia/page/PageTitle;", "historyEntry", "Lorg/wikipedia/history/HistoryEntry;", "hideTransitionReceiver", "delay", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDescriptionError", "throwable", "", "onDescriptionSuccess", "isProtected", "entity", "Lorg/wikipedia/dataclient/wikidata/Entities$Entity;", "onDestroy", "onDownload", "onEditClick", "v", "Landroid/view/View;", "onError", "onGallerySuccess", "mediaListItems", "", "Lorg/wikipedia/gallery/MediaListItem;", "onLicenseClick", "onLicenseLongClick", "onLinkPreviewLoadPage", "title", "entry", "inNewTab", "onLoading", "onMediaLoaded", "onPause", "onProvideAssistContent", "outContent", "Landroid/app/assist/AssistContent;", "onResume", "onSaveInstanceState", "outState", "onShare", "bitmap", "Landroid/graphics/Bitmap;", "subject", "onTranslateClick", "setControlsShowing", "showing", "setLicenseInfo", "setTheme", "showLinkPreview", "showTransitionReceiver", "startCaptionEdit", "startCaptionTranslation", "startTagsEdit", "toggleControls", "updateGalleryDescription", "Companion", "GalleryItemAdapter", "GalleryPageChangeListener", "MediaDownloadReceiverCallback", "app.lib"})
public final class GalleryActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.page.linkpreview.LinkPreviewDialog.LoadPageCallback, org.wikipedia.gallery.GalleryItemFragment.Callback {
    private ActivityGalleryBinding binding;
    private org.wikipedia.gallery.GalleryActivity.GalleryItemAdapter galleryAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.gallery.GalleryActivity.GalleryPageChangeListener pageChangeListener;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.Constants.ImageEditType imageEditType;
    private boolean controlsShowing = true;
    private int initialImageIndex = -1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String targetLanguageCode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.gallery.MediaDownloadReceiver downloadReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.gallery.GalleryActivity.MediaDownloadReceiverCallback downloadReceiverCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestAddCaptionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestAddImageTagsLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt linkMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_CONTROLS_SHOWING = "controlsShowing";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_PAGER_INDEX = "pagerIndex";
    @org.jetbrains.annotations.Nullable()
    private static org.wikipedia.bridge.JavaScriptActionHandler.ImageHitInfo TRANSITION_INFO;
    public static final int ACTIVITY_RESULT_PAGE_SELECTED = 1;
    public static final int ACTIVITY_RESULT_IMAGE_CAPTION_ADDED = 2;
    public static final int ACTIVITY_RESULT_IMAGE_TAGS_ADDED = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FILENAME = "filename";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REVISION = "revision";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.gallery.GalleryActivity.Companion Companion = null;
    
    public GalleryActivity() {
        super();
    }
    
    private final org.wikipedia.gallery.GalleryViewModel getViewModel() {
        return null;
    }
    
    private final org.wikipedia.gallery.GalleryItemFragment getCurrentItem() {
        return null;
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDownload(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    @java.lang.Override()
    public void onShare(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.GalleryItemFragment item, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    protected void setTheme() {
    }
    
    private final void onEditClick(android.view.View v) {
    }
    
    private final void startCaptionEdit(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void onTranslateClick() {
    }
    
    private final void startTagsEdit(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void startCaptionTranslation(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void onLicenseClick() {
    }
    
    private final boolean onLicenseLongClick() {
        return false;
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void onMediaLoaded() {
    }
    
    private final void showTransitionReceiver() {
    }
    
    private final void hideTransitionReceiver(boolean delay) {
    }
    
    private final void setControlsShowing(boolean showing) {
    }
    
    public final void toggleControls() {
    }
    
    private final void showLinkPreview(org.wikipedia.page.PageTitle title) {
    }
    
    private final void finishWithPageResult(org.wikipedia.page.PageTitle resultTitle, org.wikipedia.history.HistoryEntry historyEntry) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    private final void onLoading() {
    }
    
    private final void onGallerySuccess(java.util.List<org.wikipedia.gallery.MediaListItem> mediaListItems) {
    }
    
    private final void onDescriptionSuccess(boolean isProtected, org.wikipedia.dataclient.wikidata.Entities.Entity entity) {
    }
    
    private final void onDescriptionError(java.lang.Throwable throwable) {
    }
    
    public final void fetchGalleryDescription(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.GalleryItemFragment callingFragment) {
    }
    
    private final void updateGalleryDescription(boolean isProtected, int tagsCount) {
    }
    
    private final void decideImageEditType(org.wikipedia.gallery.GalleryItemFragment item, int tagsCount) {
    }
    
    private final void displayApplicableDescription(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void setLicenseInfo(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    @java.lang.Override()
    public void onProvideAssistContent(@org.jetbrains.annotations.NotNull()
    android.app.assist.AssistContent outContent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J9\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$Companion;", "", "()V", "ACTIVITY_RESULT_IMAGE_CAPTION_ADDED", "", "ACTIVITY_RESULT_IMAGE_TAGS_ADDED", "ACTIVITY_RESULT_PAGE_SELECTED", "EXTRA_FILENAME", "", "EXTRA_REVISION", "KEY_CONTROLS_SHOWING", "KEY_PAGER_INDEX", "TRANSITION_INFO", "Lorg/wikipedia/bridge/JavaScriptActionHandler$ImageHitInfo;", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "filename", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "revision", "", "(Landroid/content/Context;Lorg/wikipedia/page/PageTitle;Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/Long;)Landroid/content/Intent;", "setTransitionInfo", "", "hitInfo", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String filename, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
        java.lang.Long revision) {
            return null;
        }
        
        public final void setTransitionInfo(@org.jetbrains.annotations.NotNull()
        org.wikipedia.bridge.JavaScriptActionHandler.ImageHitInfo hitInfo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$GalleryItemAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Lorg/wikipedia/gallery/GalleryActivity;Landroidx/appcompat/app/AppCompatActivity;)V", "list", "", "Lorg/wikipedia/gallery/MediaListItem;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "setList", "", "", "app.lib"})
    final class GalleryItemAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.gallery.MediaListItem> list = null;
        
        public GalleryItemAdapter(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity activity) {
            super(null);
        }
        
        public final void setList(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.gallery.MediaListItem> list) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$GalleryPageChangeListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/gallery/GalleryActivity;)V", "currentPosition", "", "onPageScrollStateChanged", "", "state", "onPageSelected", "position", "app.lib"})
    final class GalleryPageChangeListener extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private int currentPosition = -1;
        
        public GalleryPageChangeListener() {
            super();
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
        
        @java.lang.Override()
        public void onPageScrollStateChanged(int state) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$MediaDownloadReceiverCallback;", "Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "(Lorg/wikipedia/gallery/GalleryActivity;)V", "onSuccess", "", "app.lib"})
    final class MediaDownloadReceiverCallback implements org.wikipedia.gallery.MediaDownloadReceiver.Callback {
        
        public MediaDownloadReceiverCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
    }
}