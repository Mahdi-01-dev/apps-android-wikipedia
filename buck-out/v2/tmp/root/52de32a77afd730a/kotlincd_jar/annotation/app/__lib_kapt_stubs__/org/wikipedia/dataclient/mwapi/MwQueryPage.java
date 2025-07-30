package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion;
import org.wikipedia.dataclient.page.Protection;
import org.wikipedia.gallery.ImageInfo;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.Namespace;
import org.wikipedia.util.DateUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\bpqrstuvwB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u0005J\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010k\u001a\u00020\u0005J\u0006\u0010l\u001a\u000203J\b\u0010*\u001a\u0004\u0018\u00010+J\u0006\u0010m\u001a\u00020nJ\b\u0010o\u001a\u0004\u0018\u00010\u0005R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u000eR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000eR\u0019\u0010\'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000bR\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00068\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b,\u0010\u0002R\u0010\u0010-\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u0002038F\u00a2\u0006\u0006\u001a\u0004\b2\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000bR\u0014\u00108\u001a\u000209X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u001c\u0010>\u001a\u00020/8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u00101R\u001e\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010ER*\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001090\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bG\u0010\u0002\u001a\u0004\bH\u0010IR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u000bR\u0019\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u000bR\u001c\u0010O\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u000e\"\u0004\bQ\u0010\u0010R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u000bR\u0013\u0010U\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\u000eR\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010Y\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u000e\"\u0004\b[\u0010\u0010R\u001f\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010IR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00068\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b_\u0010\u0002R\u0014\u0010`\u001a\u000203X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00104R\u0018\u0010b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\bc\u0010\u0002\u00a8\u0006x"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "", "()V", "actions", "", "", "", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "categories", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$CategoryResponse;", "getCategories", "()Ljava/util/List;", "convertedFrom", "getConvertedFrom", "()Ljava/lang/String;", "setConvertedFrom", "(Ljava/lang/String;)V", "convertedTo", "getConvertedTo", "setConvertedTo", "coordinates", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Coordinates;", "getCoordinates", "description", "getDescription", "descriptionSource", "getDescriptionSource$annotations", "getDescriptionSource", "difficulty", "getDifficulty", "editintro", "Lkotlinx/serialization/json/JsonElement;", "entityTerms", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$EntityTerms;", "getEntityTerms$annotations", "getEntityTerms", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage$EntityTerms;", "extract", "getExtract", "growthimagesuggestiondata", "Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion;", "getGrowthimagesuggestiondata", "imageInfo", "Lorg/wikipedia/gallery/ImageInfo;", "getImageInfo$annotations", "imagerepository", "index", "", "getIndex", "()I", "isImageShared", "", "()Z", "langlinks", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$LangLink;", "getLanglinks", "lastrevid", "", "getLastrevid", "()J", "ns", "getNs", "pageId", "getPageId$annotations", "getPageId", "pageProps", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$PageProps;", "getPageProps$annotations", "getPageProps", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage$PageProps;", "pageViewsMap", "getPageViewsMap$annotations", "getPageViewsMap", "()Ljava/util/Map;", "protection", "Lorg/wikipedia/dataclient/page/Protection;", "getProtection", "qualityGateIds", "getQualityGateIds", "redirectFrom", "getRedirectFrom", "setRedirectFrom", "revisions", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "getRevisions", "tasktype", "getTasktype", "thumbnail", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Thumbnail;", "title", "getTitle", "setTitle", "varianttitles", "getVarianttitles", "videoInfo", "getVideoInfo$annotations", "watched", "getWatched", "watchlistExpiry", "getWatchlistExpiry$annotations", "appendTitleFragment", "", "fragment", "displayTitle", "langCode", "getEditNotices", "getErrorForAction", "actionName", "hasWatchlistExpiry", "namespace", "Lorg/wikipedia/page/Namespace;", "thumbUrl", "CategoryResponse", "Coordinates", "EntityTerms", "LangLink", "PageProps", "Revision", "RevisionSlot", "Thumbnail", "app.lib"})
public final class MwQueryPage {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String descriptionSource = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.gallery.ImageInfo> imageInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.gallery.ImageInfo> videoInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String watchlistExpiry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Long> pageViewsMap = null;
    private final int pageId = 0;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryPage.PageProps pageProps = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryPage.EntityTerms entityTerms = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.CategoryResponse> categories = null;
    private final int ns = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> coordinates = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwQueryPage.Thumbnail thumbnail = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> varianttitles = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError>> actions = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement editintro = null;
    private final int index = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.LangLink> langlinks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Revision> revisions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.page.Protection> protection = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String extract = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imagerepository = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String redirectFrom;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String convertedFrom;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String convertedTo;
    private final boolean watched = false;
    private final long lastrevid = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tasktype = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String difficulty = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> qualityGateIds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion> growthimagesuggestiondata = null;
    
    public MwQueryPage() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescriptionSource() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "descriptionsource")
    @java.lang.Deprecated()
    public static void getDescriptionSource$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "imageinfo")
    @java.lang.Deprecated()
    private static void getImageInfo$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "videoinfo")
    @java.lang.Deprecated()
    private static void getVideoInfo$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "watchlistexpiry")
    @java.lang.Deprecated()
    private static void getWatchlistExpiry$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Long> getPageViewsMap() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "pageviews")
    @java.lang.Deprecated()
    public static void getPageViewsMap$annotations() {
    }
    
    public final int getPageId() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "pageid")
    @java.lang.Deprecated()
    public static void getPageId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage.PageProps getPageProps() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "pageprops")
    @java.lang.Deprecated()
    public static void getPageProps$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage.EntityTerms getEntityTerms() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "entityterms")
    @java.lang.Deprecated()
    public static void getEntityTerms$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.CategoryResponse> getCategories() {
        return null;
    }
    
    public final int getNs() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getVarianttitles() {
        return null;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.LangLink> getLanglinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Revision> getRevisions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.page.Protection> getProtection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtract() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedirectFrom() {
        return null;
    }
    
    public final void setRedirectFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConvertedFrom() {
        return null;
    }
    
    public final void setConvertedFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConvertedTo() {
        return null;
    }
    
    public final void setConvertedTo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getWatched() {
        return false;
    }
    
    public final long getLastrevid() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTasktype() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDifficulty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getQualityGateIds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion> getGrowthimagesuggestiondata() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace namespace() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String thumbUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.gallery.ImageInfo imageInfo() {
        return null;
    }
    
    public final void appendTitleFragment(@org.jetbrains.annotations.Nullable()
    java.lang.String fragment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String displayTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return null;
    }
    
    public final boolean isImageShared() {
        return false;
    }
    
    public final boolean hasWatchlistExpiry() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwServiceError> getErrorForAction(@org.jetbrains.annotations.NotNull()
    java.lang.String actionName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getEditNotices() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$CategoryResponse;", "", "ns", "", "title", "", "(ILjava/lang/String;)V", "getNs", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app.lib"})
    public static final class CategoryResponse {
        private final int ns = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.mwapi.MwQueryPage.CategoryResponse copy(int ns, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public CategoryResponse(int ns, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        public final int getNs() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Coordinates;", "", "lat", "", "lon", "(DD)V", "getLat", "()D", "getLon", "app.lib"})
    public static final class Coordinates {
        private final double lat = 0.0;
        private final double lon = 0.0;
        
        public Coordinates(double lat, double lon) {
            super();
        }
        
        public final double getLat() {
            return 0.0;
        }
        
        public final double getLon() {
            return 0.0;
        }
        
        public Coordinates() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$EntityTerms;", "", "()V", "alias", "", "", "getAlias", "()Ljava/util/List;", "description", "getDescription", "label", "getLabel", "app.lib"})
    public static final class EntityTerms {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> alias = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> label = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> description = null;
        
        public EntityTerms() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAlias() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDescription() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$LangLink;", "", "lang", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getTitle", "app.lib"})
    public static final class LangLink {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lang = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        
        public LangLink(@org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLang() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public LangLink() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$PageProps;", "", "()V", "disambiguation", "", "displayTitle", "getDisplayTitle$annotations", "getDisplayTitle", "()Ljava/lang/String;", "wikiBaseItem", "getWikiBaseItem$annotations", "getWikiBaseItem", "app.lib"})
    public static final class PageProps {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String wikiBaseItem = "";
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String disambiguation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String displayTitle = null;
        
        public PageProps() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWikiBaseItem() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "wikibase_item")
        @java.lang.Deprecated()
        public static void getWikiBaseItem$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDisplayTitle() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "displaytitle")
        @java.lang.Deprecated()
        public static void getDisplayTitle$annotations() {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\u00108\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0013\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u00020$8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\'R\u0014\u0010(\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0006R\u001c\u0010*\u001a\u00020$8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\'R\u0014\u0010-\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u001c\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201\u0018\u000100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00102\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006\u00a8\u00069"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "", "()V", "comment", "", "getComment", "()Ljava/lang/String;", "contentMain", "getContentMain", "diffSize", "", "getDiffSize", "()I", "setDiffSize", "(I)V", "isAnon", "", "isAnon$annotations", "()Z", "isTemp", "isTemp$annotations", "localDateTime", "Ljava/time/LocalDateTime;", "getLocalDateTime", "()Ljava/time/LocalDateTime;", "localDateTime$delegate", "Lkotlin/Lazy;", "minor", "getMinor", "ores", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresResult;", "getOres", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResult$OresResult;", "oresscores", "Lkotlinx/serialization/json/JsonElement;", "parentRevId", "", "getParentRevId$annotations", "getParentRevId", "()J", "parsedcomment", "getParsedcomment", "revId", "getRevId$annotations", "getRevId", "size", "getSize", "slots", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$RevisionSlot;", "timeStamp", "getTimeStamp$annotations", "getTimeStamp", "user", "getUser", "getContentFromSlot", "slot", "app.lib"})
    public static final class Revision {
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.MwQueryPage.RevisionSlot> slots = null;
        private final boolean minor = false;
        private final long revId = 0L;
        private final long parentRevId = 0L;
        private final boolean isAnon = false;
        private final boolean isTemp = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String timeStamp = "";
        private final int size = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String user = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String comment = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String parsedcomment = "";
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement oresscores = null;
        private int diffSize = 0;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy localDateTime$delegate = null;
        
        public Revision() {
            super();
        }
        
        public final boolean getMinor() {
            return false;
        }
        
        public final long getRevId() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "revid")
        @java.lang.Deprecated()
        public static void getRevId$annotations() {
        }
        
        public final long getParentRevId() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "parentid")
        @java.lang.Deprecated()
        public static void getParentRevId$annotations() {
        }
        
        public final boolean isAnon() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "anon")
        @java.lang.Deprecated()
        public static void isAnon$annotations() {
        }
        
        public final boolean isTemp() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "temp")
        @java.lang.Deprecated()
        public static void isTemp$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTimeStamp() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "timestamp")
        @java.lang.Deprecated()
        public static void getTimeStamp$annotations() {
        }
        
        public final int getSize() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getParsedcomment() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.mwapi.MwQueryResult.OresResult getOres() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContentMain() {
            return null;
        }
        
        public final int getDiffSize() {
            return 0;
        }
        
        public final void setDiffSize(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime getLocalDateTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContentFromSlot(@org.jetbrains.annotations.NotNull()
        java.lang.String slot) {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$RevisionSlot;", "", "content", "", "contentformat", "contentmodel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "app.lib"})
    public static final class RevisionSlot {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String content = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String contentformat = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String contentmodel = null;
        
        public RevisionSlot(@org.jetbrains.annotations.NotNull()
        java.lang.String content, @org.jetbrains.annotations.Nullable()
        java.lang.String contentformat, @org.jetbrains.annotations.Nullable()
        java.lang.String contentmodel) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContent() {
            return null;
        }
        
        public RevisionSlot() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Thumbnail;", "", "source", "", "width", "", "height", "(Ljava/lang/String;II)V", "getSource", "()Ljava/lang/String;", "app.lib"})
    public static final class Thumbnail {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String source = null;
        private final int width = 0;
        private final int height = 0;
        
        public Thumbnail(@org.jetbrains.annotations.Nullable()
        java.lang.String source, int width, int height) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSource() {
            return null;
        }
        
        public Thumbnail() {
            super();
        }
    }
}