package org.wikipedia.gallery;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.json.JsonUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001:\u0002BCB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010?\u001a\u0004\u0018\u00010\u00112\u0006\u0010@\u001a\u00020\u0015J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u00020\u00058\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u000fR\"\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b)\u0010\u0002R\u0014\u0010*\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010/R\u001c\u00100\u001a\u00020\u00158\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u0017R\u001c\u00103\u001a\u00020\u00058\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u000fR\u001c\u00106\u001a\u00020\u00158\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\u0017R\u0014\u00109\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u000fR\u0014\u0010;\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000fR\u0014\u0010=\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0017\u00a8\u0006D"}, d2 = {"Lorg/wikipedia/gallery/ImageInfo;", "", "()V", "captions", "", "", "getCaptions", "()Ljava/util/Map;", "setCaptions", "(Ljava/util/Map;)V", "codecs", "", "commonsUrl", "getCommonsUrl$annotations", "getCommonsUrl", "()Ljava/lang/String;", "derivatives", "Lorg/wikipedia/gallery/ImageInfo$Derivative;", "descriptionShortUrl", "getDescriptionShortUrl$annotations", "height", "", "getHeight", "()I", "metadata", "Lorg/wikipedia/gallery/ExtMetadata;", "getMetadata$annotations", "getMetadata", "()Lorg/wikipedia/gallery/ExtMetadata;", "mime", "getMime", "name", "originalUrl", "getOriginalUrl$annotations", "getOriginalUrl", "plainMetadata", "Lorg/wikipedia/gallery/ImageInfo$MetadataItem;", "getPlainMetadata$annotations", "getPlainMetadata", "()Ljava/util/List;", "shortName", "getShortName$annotations", "size", "getSize", "source", "getSource", "setSource", "(Ljava/lang/String;)V", "thumbHeight", "getThumbHeight$annotations", "getThumbHeight", "thumbUrl", "getThumbUrl$annotations", "getThumbUrl", "thumbWidth", "getThumbWidth$annotations", "getThumbWidth", "timestamp", "getTimestamp", "user", "getUser", "width", "getWidth", "getBestDerivativeForSize", "widthDp", "getMetadataTranslations", "Derivative", "MetadataItem", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class ImageInfo {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String source = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.String> captions;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String shortName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String descriptionShortUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.gallery.ImageInfo.Derivative> derivatives = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> codecs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String commonsUrl = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String thumbUrl = "";
    private final int thumbWidth = 0;
    private final int thumbHeight = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalUrl = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mime = "*/*";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.gallery.ImageInfo.MetadataItem> plainMetadata = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.gallery.ExtMetadata metadata = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String user = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timestamp = "";
    private final int size = 0;
    private final int width = 0;
    private final int height = 0;
    
    public ImageInfo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    public final void setSource(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getCaptions() {
        return null;
    }
    
    public final void setCaptions(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @kotlinx.serialization.SerialName(value = "short_name")
    @java.lang.Deprecated()
    private static void getShortName$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "descriptionshorturl")
    @java.lang.Deprecated()
    private static void getDescriptionShortUrl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommonsUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "descriptionurl")
    @java.lang.Deprecated()
    public static void getCommonsUrl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "thumburl")
    @java.lang.Deprecated()
    public static void getThumbUrl$annotations() {
    }
    
    public final int getThumbWidth() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "thumbwidth")
    @java.lang.Deprecated()
    public static void getThumbWidth$annotations() {
    }
    
    public final int getThumbHeight() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "thumbheight")
    @java.lang.Deprecated()
    public static void getThumbHeight$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "url")
    @java.lang.Deprecated()
    public static void getOriginalUrl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.gallery.ImageInfo.MetadataItem> getPlainMetadata() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "metadata")
    @java.lang.Deprecated()
    public static void getPlainMetadata$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.ExtMetadata getMetadata() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "extmetadata")
    @java.lang.Deprecated()
    public static void getMetadata$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.ImageInfo.Derivative getBestDerivativeForSize(int widthDp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMetadataTranslations() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/gallery/ImageInfo$Derivative;", "", "()V", "bandwidth", "", "height", "", "shorttitle", "", "src", "getSrc", "()Ljava/lang/String;", "title", "type", "getType", "width", "getWidth", "()I", "app.lib"})
    public static final class Derivative {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String src = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = "";
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String shorttitle = null;
        private final int width = 0;
        private final int height = 0;
        private final long bandwidth = 0L;
        
        public Derivative() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSrc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public final int getWidth() {
            return 0;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/gallery/ImageInfo$MetadataItem;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "value", "Lkotlinx/serialization/json/JsonElement;", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "app.lib"})
    public static final class MetadataItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement value = null;
        
        public MetadataItem() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.serialization.json.JsonElement getValue() {
            return null;
        }
    }
}