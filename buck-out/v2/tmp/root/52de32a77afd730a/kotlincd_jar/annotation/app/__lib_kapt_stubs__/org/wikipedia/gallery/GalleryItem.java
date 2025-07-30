package org.wikipedia.gallery;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.Service;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0002LMB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\rR$\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u00020/8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u00102R\u0019\u00103\u001a\n\u0012\u0004\u0012\u00020)\u0018\u000104\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R&\u00107\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R\u0011\u0010A\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\bB\u0010\rR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010!\u00a8\u0006N"}, d2 = {"Lorg/wikipedia/gallery/GalleryItem;", "", "()V", "artist", "Lorg/wikipedia/gallery/ArtistInfo;", "getArtist", "()Lorg/wikipedia/gallery/ArtistInfo;", "setArtist", "(Lorg/wikipedia/gallery/ArtistInfo;)V", "audioType", "", "getAudioType$annotations", "getAudioType", "()Ljava/lang/String;", "caption", "Lorg/wikipedia/gallery/TextInfo;", "getCaption", "()Lorg/wikipedia/gallery/TextInfo;", "description", "getDescription", "setDescription", "(Lorg/wikipedia/gallery/TextInfo;)V", "duration", "", "getDuration", "()D", "entityId", "getEntityId$annotations", "getEntityId", "filePage", "getFilePage$annotations", "getFilePage", "setFilePage", "(Ljava/lang/String;)V", "license", "Lorg/wikipedia/gallery/ImageLicense;", "getLicense", "()Lorg/wikipedia/gallery/ImageLicense;", "setLicense", "(Lorg/wikipedia/gallery/ImageLicense;)V", "original", "Lorg/wikipedia/gallery/ImageInfo;", "getOriginal", "()Lorg/wikipedia/gallery/ImageInfo;", "setOriginal", "(Lorg/wikipedia/gallery/ImageInfo;)V", "sectionId", "", "getSectionId$annotations", "getSectionId", "()I", "sources", "", "getSources", "()Ljava/util/List;", "structuredData", "Lorg/wikipedia/gallery/GalleryItem$StructuredData;", "getStructuredData$annotations", "getStructuredData", "()Lorg/wikipedia/gallery/GalleryItem$StructuredData;", "setStructuredData", "(Lorg/wikipedia/gallery/GalleryItem$StructuredData;)V", "thumbnail", "getThumbnail", "setThumbnail", "thumbnailUrl", "getThumbnailUrl", "titles", "Lorg/wikipedia/gallery/GalleryItem$Titles;", "getTitles", "()Lorg/wikipedia/gallery/GalleryItem$Titles;", "setTitles", "(Lorg/wikipedia/gallery/GalleryItem$Titles;)V", "type", "getType", "setType", "StructuredData", "Titles", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public class GalleryItem {
    private final int sectionId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String entityId = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String audioType = "";
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.gallery.GalleryItem.StructuredData structuredData;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filePage = "https://commons.wikimedia.org/";
    private final double duration = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type = "";
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.gallery.ImageInfo thumbnail;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.gallery.ImageInfo original;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.gallery.TextInfo description;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.gallery.TextInfo caption = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.gallery.ImageInfo> sources = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.gallery.GalleryItem.Titles titles;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.gallery.ArtistInfo artist;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.gallery.ImageLicense license;
    
    public GalleryItem() {
        super();
    }
    
    public final int getSectionId() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "section_id")
    @java.lang.Deprecated()
    public static void getSectionId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntityId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "wb_entity_id")
    @java.lang.Deprecated()
    public static void getEntityId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAudioType() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "audio_type")
    @java.lang.Deprecated()
    public static void getAudioType$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.GalleryItem.StructuredData getStructuredData() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "structured")
    @java.lang.Deprecated()
    public static void getStructuredData$annotations() {
    }
    
    public final void setStructuredData(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.GalleryItem.StructuredData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilePage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "file_page")
    @java.lang.Deprecated()
    public static void getFilePage$annotations() {
    }
    
    public final void setFilePage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getDuration() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.gallery.ImageInfo getThumbnail() {
        return null;
    }
    
    public final void setThumbnail(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.ImageInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.gallery.ImageInfo getOriginal() {
        return null;
    }
    
    public final void setOriginal(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.ImageInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.gallery.TextInfo getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.TextInfo p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.TextInfo getCaption() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.gallery.ImageInfo> getSources() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.GalleryItem.Titles getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.GalleryItem.Titles p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.ArtistInfo getArtist() {
        return null;
    }
    
    public final void setArtist(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ArtistInfo p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.ImageLicense getLicense() {
        return null;
    }
    
    public final void setLicense(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ImageLicense p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\u0012(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u00a2\u0006\u0002\u0010\u0006R:\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/gallery/GalleryItem$StructuredData;", "", "captions", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "getCaptions", "()Ljava/util/HashMap;", "setCaptions", "app.lib"})
    public static final class StructuredData {
        @org.jetbrains.annotations.Nullable()
        private java.util.HashMap<java.lang.String, java.lang.String> captions;
        
        public StructuredData(@org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.String> captions) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.HashMap<java.lang.String, java.lang.String> getCaptions() {
            return null;
        }
        
        public final void setCaptions(@org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.String> p0) {
        }
        
        public StructuredData() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/gallery/GalleryItem$Titles;", "", "display", "", "canonical", "normalized", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCanonical", "()Ljava/lang/String;", "getDisplay", "getNormalized", "app.lib"})
    public static final class Titles {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String display = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String canonical = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String normalized = null;
        
        public Titles(@org.jetbrains.annotations.NotNull()
        java.lang.String display, @org.jetbrains.annotations.NotNull()
        java.lang.String canonical, @org.jetbrains.annotations.NotNull()
        java.lang.String normalized) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCanonical() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNormalized() {
            return null;
        }
        
        public Titles() {
            super();
        }
    }
}