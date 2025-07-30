package org.wikipedia.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/gallery/GalleryThumbnailScrollView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listener", "Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryViewListener;", "getListener", "()Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryViewListener;", "setListener", "(Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryViewListener;)V", "pressAnimation", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "releaseAnimation", "setGalleryList", "", "list", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "GalleryItemHolder", "GalleryViewAdapter", "GalleryViewListener", "app.lib"})
public final class GalleryThumbnailScrollView extends androidx.recyclerview.widget.RecyclerView {
    private final android.view.animation.Animation pressAnimation = null;
    private final android.view.animation.Animation releaseAnimation = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryViewListener listener;
    
    public GalleryThumbnailScrollView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryViewListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryViewListener p0) {
    }
    
    public final void setGalleryList(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage> list) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnTouchListener;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/gallery/GalleryThumbnailScrollView;Landroid/view/View;)V", "galleryItem", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "imageView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "bindItem", "", "item", "onClick", "v", "onTouch", "", "event", "Landroid/view/MotionEvent;", "app.lib"})
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    final class GalleryItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
        private org.wikipedia.dataclient.mwapi.MwQueryPage galleryItem;
        private final android.widget.ImageView imageView = null;
        
        public GalleryItemHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage item) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onTouch(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryItemHolder;", "Lorg/wikipedia/gallery/GalleryThumbnailScrollView;", "list", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "(Lorg/wikipedia/gallery/GalleryThumbnailScrollView;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app.lib"})
    final class GalleryViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage> list = null;
        
        public GalleryViewAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage> list) {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.gallery.GalleryThumbnailScrollView.GalleryItemHolder holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/gallery/GalleryThumbnailScrollView$GalleryViewListener;", "", "onGalleryItemClicked", "", "view", "Landroid/widget/ImageView;", "thumbUrl", "", "imageName", "app.lib"})
    public static abstract interface GalleryViewListener {
        
        public abstract void onGalleryItemClicked(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String thumbUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String imageName);
    }
}