package org.wikipedia.gallery;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.FragmentGalleryItemBinding;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.views.imageservice.ImageLoadListener;
import org.wikipedia.views.imageservice.ImageService;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0003OPQB\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020,H\u0002J\u0018\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J$\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020,H\u0016J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020,H\u0016J\u0010\u0010H\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0016J\u0010\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u00020CH\u0002J\u001a\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u0002062\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010M\u001a\u00020,H\u0002J\b\u0010N\u001a\u00020,H\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b&\u0010\'\u00a8\u0006R"}, d2 = {"Lorg/wikipedia/gallery/GalleryItemFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "activityViewModel", "Lorg/wikipedia/gallery/GalleryViewModel;", "getActivityViewModel", "()Lorg/wikipedia/gallery/GalleryViewModel;", "activityViewModel$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lerror/NonExistentClass;", "imageTitle", "Lorg/wikipedia/page/PageTitle;", "getImageTitle", "()Lorg/wikipedia/page/PageTitle;", "mediaController", "Landroid/widget/MediaController;", "mediaInfo", "Lorg/wikipedia/gallery/ImageInfo;", "getMediaInfo", "()Lorg/wikipedia/gallery/ImageInfo;", "mediaPage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getMediaPage", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "videoThumbnailClickListener", "Landroid/view/View$OnClickListener;", "viewModel", "Lorg/wikipedia/gallery/GalleryItemViewModel;", "getViewModel", "()Lorg/wikipedia/gallery/GalleryItemViewModel;", "viewModel$delegate", "callback", "Lorg/wikipedia/gallery/GalleryItemFragment$Callback;", "handleImageSaveRequest", "", "loadImage", "url", "loadVideo", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "throwable", "", "onLoading", "visible", "", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onPrepareMenu", "onSuccess", "isVideo", "onViewCreated", "view", "saveImage", "shareImage", "Callback", "Companion", "GalleryItemImageLoadListener", "app.lib"})
public final class GalleryItemFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider {
    @org.jetbrains.annotations.Nullable()
    private FragmentGalleryItemBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy activityViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.MediaController mediaController;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener videoThumbnailClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_GALLERY_ITEM = "galleryItem";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.gallery.GalleryItemFragment.Companion Companion = null;
    
    public GalleryItemFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.gallery.GalleryItemViewModel getViewModel() {
        return null;
    }
    
    private final org.wikipedia.gallery.GalleryViewModel getActivityViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getImageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage getMediaPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.ImageInfo getMediaInfo() {
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
    
    @java.lang.Override()
    public void onPause() {
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
    android.view.MenuItem item) {
        return false;
    }
    
    private final void handleImageSaveRequest() {
    }
    
    private final void onLoading(boolean visible) {
    }
    
    private final void onSuccess(boolean isVideo) {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    private final void loadVideo() {
    }
    
    private final void loadImage(java.lang.String url) {
    }
    
    private final void shareImage() {
    }
    
    private final void saveImage() {
    }
    
    private final org.wikipedia.gallery.GalleryItemFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/gallery/GalleryItemFragment$Callback;", "", "onDownload", "", "item", "Lorg/wikipedia/gallery/GalleryItemFragment;", "onError", "throwable", "", "onShare", "bitmap", "Landroid/graphics/Bitmap;", "subject", "", "title", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onDownload(@org.jetbrains.annotations.NotNull()
        org.wikipedia.gallery.GalleryItemFragment item);
        
        public abstract void onShare(@org.jetbrains.annotations.NotNull()
        org.wikipedia.gallery.GalleryItemFragment item, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
        java.lang.String subject, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/gallery/GalleryItemFragment$Companion;", "", "()V", "ARG_GALLERY_ITEM", "", "newInstance", "Lorg/wikipedia/gallery/GalleryItemFragment;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "item", "Lorg/wikipedia/gallery/MediaListItem;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.gallery.GalleryItemFragment newInstance(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        org.wikipedia.gallery.MediaListItem item) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/gallery/GalleryItemFragment$GalleryItemImageLoadListener;", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "view", "Landroid/view/View;", "(Lorg/wikipedia/gallery/GalleryItemFragment;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "onError", "", "error", "", "onSuccess", "image", "", "width", "", "height", "app.lib"})
    final class GalleryItemImageLoadListener implements org.wikipedia.views.imageservice.ImageLoadListener {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public GalleryItemImageLoadListener(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.Object image, int width, int height) {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
        }
    }
}