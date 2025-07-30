package org.wikipedia.dataclient.growthtasks;

import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion;", "", "titleNamespace", "", "titleText", "", "datasetId", "images", "", "Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$ImageItem;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDatasetId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getTitleNamespace", "()I", "getTitleText", "AddImageFeedbackBody", "ImageItem", "ImageMetadata", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class GrowthImageSuggestion {
    private final int titleNamespace = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String titleText = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String datasetId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.ImageItem> images = null;
    
    public GrowthImageSuggestion(int titleNamespace, @org.jetbrains.annotations.NotNull()
    java.lang.String titleText, @org.jetbrains.annotations.NotNull()
    java.lang.String datasetId, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.ImageItem> images) {
        super();
    }
    
    public final int getTitleNamespace() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitleText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatasetId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.ImageItem> getImages() {
        return null;
    }
    
    public GrowthImageSuggestion() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$AddImageFeedbackBody;", "", "token", "", "editRevId", "", "filename", "accepted", "", "reasons", "", "caption", "sectionTitle", "sectionNumber", "", "(Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAccepted$annotations", "()V", "getAccepted", "()Z", "getCaption$annotations", "getCaption", "()Ljava/lang/String;", "getEditRevId", "()J", "getFilename", "getReasons$annotations", "getReasons", "()Ljava/util/List;", "getSectionNumber$annotations", "getSectionNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSectionTitle$annotations", "getSectionTitle", "getToken", "app.lib"})
    @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
    public static final class AddImageFeedbackBody {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String token = null;
        private final long editRevId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filename = null;
        private final boolean accepted = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> reasons = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String caption = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sectionTitle = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer sectionNumber = null;
        
        public AddImageFeedbackBody(@org.jetbrains.annotations.NotNull()
        java.lang.String token, long editRevId, @org.jetbrains.annotations.NotNull()
        java.lang.String filename, boolean accepted, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> reasons, @org.jetbrains.annotations.Nullable()
        java.lang.String caption, @org.jetbrains.annotations.Nullable()
        java.lang.String sectionTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Integer sectionNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToken() {
            return null;
        }
        
        public final long getEditRevId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilename() {
            return null;
        }
        
        public final boolean getAccepted() {
            return false;
        }
        
        @kotlinx.serialization.EncodeDefault(mode = kotlinx.serialization.EncodeDefault.Mode.ALWAYS)
        @java.lang.Deprecated()
        public static void getAccepted$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getReasons() {
            return null;
        }
        
        @kotlinx.serialization.EncodeDefault(mode = kotlinx.serialization.EncodeDefault.Mode.ALWAYS)
        @java.lang.Deprecated()
        public static void getReasons$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCaption() {
            return null;
        }
        
        @kotlinx.serialization.EncodeDefault(mode = kotlinx.serialization.EncodeDefault.Mode.ALWAYS)
        @java.lang.Deprecated()
        public static void getCaption$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSectionTitle() {
            return null;
        }
        
        @kotlinx.serialization.EncodeDefault(mode = kotlinx.serialization.EncodeDefault.Mode.ALWAYS)
        @java.lang.Deprecated()
        public static void getSectionTitle$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSectionNumber() {
            return null;
        }
        
        @kotlinx.serialization.EncodeDefault(mode = kotlinx.serialization.EncodeDefault.Mode.ALWAYS)
        @java.lang.Deprecated()
        public static void getSectionNumber$annotations() {
        }
        
        public AddImageFeedbackBody() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$ImageItem;", "", "image", "", "displayFilename", "source", "projects", "", "metadata", "Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$ImageMetadata;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$ImageMetadata;)V", "getDisplayFilename", "()Ljava/lang/String;", "getImage", "getMetadata", "()Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$ImageMetadata;", "getProjects", "()Ljava/util/List;", "getSource", "app.lib"})
    public static final class ImageItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayFilename = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> projects = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.ImageMetadata metadata = null;
        
        public ImageItem(@org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String displayFilename, @org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> projects, @org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.ImageMetadata metadata) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayFilename() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getProjects() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.ImageMetadata getMetadata() {
            return null;
        }
        
        public ImageItem() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$ImageMetadata;", "", "descriptionUrl", "", "thumbUrl", "fullUrl", "originalWidth", "", "originalHeight", "mediaType", "description", "author", "license", "date", "caption", "categories", "", "reason", "contentLanguageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getCaption", "getCategories", "()Ljava/util/List;", "getContentLanguageName", "getDate", "getDescription", "getDescriptionUrl", "getFullUrl", "getLicense", "getMediaType", "getOriginalHeight", "()I", "getOriginalWidth", "getReason", "getThumbUrl", "app.lib"})
    public static final class ImageMetadata {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String descriptionUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String thumbUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fullUrl = null;
        private final int originalWidth = 0;
        private final int originalHeight = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mediaType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String license = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String caption = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> categories = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String contentLanguageName = null;
        
        public ImageMetadata(@org.jetbrains.annotations.NotNull()
        java.lang.String descriptionUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String thumbUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String fullUrl, int originalWidth, int originalHeight, @org.jetbrains.annotations.NotNull()
        java.lang.String mediaType, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String license, @org.jetbrains.annotations.NotNull()
        java.lang.String date, @org.jetbrains.annotations.NotNull()
        java.lang.String caption, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.NotNull()
        java.lang.String contentLanguageName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescriptionUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumbUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFullUrl() {
            return null;
        }
        
        public final int getOriginalWidth() {
            return 0;
        }
        
        public final int getOriginalHeight() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMediaType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLicense() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCaption() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCategories() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContentLanguageName() {
            return null;
        }
        
        public ImageMetadata() {
            super();
        }
    }
}