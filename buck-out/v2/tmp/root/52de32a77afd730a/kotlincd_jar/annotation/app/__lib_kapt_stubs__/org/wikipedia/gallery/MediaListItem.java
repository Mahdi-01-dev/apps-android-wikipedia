package org.wikipedia.gallery;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.Service;
import org.wikipedia.util.UriUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001 BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/gallery/MediaListItem;", "Landroid/os/Parcelable;", "title", "", "type", "caption", "Lorg/wikipedia/gallery/TextInfo;", "showInGallery", "", "sectionId", "", "srcSets", "", "Lorg/wikipedia/gallery/MediaListItem$ImageSrcSet;", "(Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/gallery/TextInfo;ZILjava/util/List;)V", "getCaption", "()Lorg/wikipedia/gallery/TextInfo;", "isInCommons", "()Z", "isVideo", "getSectionId$annotations", "()V", "getShowInGallery", "getSrcSets$annotations", "getSrcSets", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getType", "getImageUrl", "deviceScale", "", "ImageSrcSet", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class MediaListItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.gallery.TextInfo caption = null;
    private final boolean showInGallery = false;
    private final int sectionId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.gallery.MediaListItem.ImageSrcSet> srcSets = null;
    
    public MediaListItem(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.TextInfo caption, boolean showInGallery, int sectionId, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.gallery.MediaListItem.ImageSrcSet> srcSets) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.TextInfo getCaption() {
        return null;
    }
    
    public final boolean getShowInGallery() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "section_id")
    @java.lang.Deprecated()
    private static void getSectionId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.gallery.MediaListItem.ImageSrcSet> getSrcSets() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "srcset")
    @java.lang.Deprecated()
    public static void getSrcSets$annotations() {
    }
    
    public final boolean isInCommons() {
        return false;
    }
    
    public final boolean isVideo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageUrl(float deviceScale) {
        return null;
    }
    
    public MediaListItem() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/gallery/MediaListItem$ImageSrcSet;", "Landroid/os/Parcelable;", "_scale", "", "src", "(Ljava/lang/String;Ljava/lang/String;)V", "get_scale$annotations", "()V", "scale", "", "getScale", "()F", "getSrc", "()Ljava/lang/String;", "app.lib"})
    @kotlinx.parcelize.Parcelize()
    public static final class ImageSrcSet implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String _scale = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String src = null;
        
        public ImageSrcSet(@org.jetbrains.annotations.Nullable()
        java.lang.String _scale, @org.jetbrains.annotations.NotNull()
        java.lang.String src) {
            super();
        }
        
        @kotlinx.serialization.SerialName(value = "scale")
        @java.lang.Deprecated()
        private static void get_scale$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSrc() {
            return null;
        }
        
        public final float getScale() {
            return 0.0F;
        }
        
        public ImageSrcSet() {
            super();
        }
    }
}