package org.wikipedia.commons;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.databinding.FragmentFilePageBinding;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.descriptions.DescriptionEditActivity.Action;
import org.wikipedia.gallery.MediaDownloadReceiver;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.suggestededits.SuggestedEditsImageTagEditActivity;
import org.wikipedia.suggestededits.SuggestedEditsSnackbars;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.views.imageservice.ImageService;
import java.io.File;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002DEB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\u0012\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u001dH\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u001dH\u0016J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010=\u001a\u00020\u001dH\u0016J\u0010\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020@H\u0002J\u001a\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010C\u001a\u00020\u001dH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00150\u00150\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006F"}, d2 = {"Lorg/wikipedia/commons/FilePageFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/commons/FilePageView$Callback;", "Landroidx/core/view/MenuProvider;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "addImageCaptionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "addImageTagsLauncher", "binding", "getBinding", "()Lerror/NonExistentClass;", "downloadReceiver", "Lorg/wikipedia/gallery/MediaDownloadReceiver;", "downloadReceiverCallback", "Lorg/wikipedia/commons/FilePageFragment$MediaDownloadReceiverCallback;", "requestPermissionLauncher", "", "viewModel", "Lorg/wikipedia/commons/FilePageViewModel;", "getViewModel", "()Lorg/wikipedia/commons/FilePageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "downloadImage", "", "handleImageSaveRequest", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "caught", "", "onImageCaptionClick", "summaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "onImageTagsClick", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "onLoading", "onMenuItemSelected", "", "menuItem", "Landroid/view/MenuItem;", "onPause", "onPrepareMenu", "onResume", "onSuccess", "filePage", "Lorg/wikipedia/commons/FilePage;", "onViewCreated", "view", "shareImage", "Companion", "MediaDownloadReceiverCallback", "app.lib"})
public final class FilePageFragment extends androidx.fragment.app.Fragment implements org.wikipedia.commons.FilePageView.Callback, androidx.core.view.MenuProvider {
    @org.jetbrains.annotations.Nullable()
    private FragmentFilePageBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.gallery.MediaDownloadReceiver downloadReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.commons.FilePageFragment.MediaDownloadReceiverCallback downloadReceiverCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> addImageCaptionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> addImageTagsLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.commons.FilePageFragment.Companion Companion = null;
    
    public FilePageFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.commons.FilePageViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onError(java.lang.Throwable caught) {
    }
    
    private final void onLoading() {
    }
    
    private final void onSuccess(org.wikipedia.commons.FilePage filePage) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onImageCaptionClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit) {
    }
    
    @java.lang.Override()
    public void onImageTagsClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage page) {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void handleImageSaveRequest() {
    }
    
    private final void shareImage() {
    }
    
    private final void downloadImage() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/commons/FilePageFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/commons/FilePageFragment;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "allowEdit", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.commons.FilePageFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, boolean allowEdit) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/commons/FilePageFragment$MediaDownloadReceiverCallback;", "Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "(Lorg/wikipedia/commons/FilePageFragment;)V", "onSuccess", "", "app.lib"})
    final class MediaDownloadReceiverCallback implements org.wikipedia.gallery.MediaDownloadReceiver.Callback {
        
        public MediaDownloadReceiverCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
    }
}