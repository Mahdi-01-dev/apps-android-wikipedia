package org.wikipedia.dataclient.page;

import android.location.Location;
import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.json.LocationSerializer;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.Page;
import org.wikipedia.page.PageProperties;
import org.wikipedia.page.PageTitle;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 `2\u00020\u0001:\u0005`abcdB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tB\u00d3\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u00a2\u0006\u0002\u0010 J\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020XH\u0002J\u000e\u0010Z\u001a\u00020X2\u0006\u0010[\u001a\u00020\\J\u0012\u0010]\u001a\u0004\u0018\u00010^2\b\u0010Y\u001a\u0004\u0018\u00010XJ\b\u0010_\u001a\u00020\u0003H\u0016R\u0011\u0010!\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010,R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010%\u001a\u0004\b.\u0010#R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b/\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010,R&\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b2\u0010%\u001a\u0004\b3\u0010#\"\u0004\b4\u0010,R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010#\"\u0004\b6\u0010,R\u0013\u00107\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b8\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020<8F\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b?\u0010%R\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b@\u0010%\u001a\u0004\bA\u0010BR\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0013\u0010I\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010#R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010#R$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010%\u001a\u0004\bR\u0010SR\u0011\u0010\u001b\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bU\u0010%\u001a\u0004\bV\u0010#\u00a8\u0006e"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary;", "Landroid/os/Parcelable;", "displayTitle", "", "prefixTitle", "description", "extract", "thumbnail", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "namespace", "Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "titles", "Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "originalImage", "wikiBaseItem", "extractHtml", "descriptionSource", "coordinates", "Landroid/location/Location;", "type", "pageId", "", "revision", "", "timestamp", "views", "rank", "viewHistory", "", "Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "(Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;Lorg/wikipedia/dataclient/page/PageSummary$Titles;Ljava/lang/String;Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;Ljava/lang/String;IJLjava/lang/String;JJLjava/util/List;)V", "apiTitle", "getApiTitle", "()Ljava/lang/String;", "getCoordinates$annotations", "()V", "getCoordinates", "()Landroid/location/Location;", "setCoordinates", "(Landroid/location/Location;)V", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getDescriptionSource$annotations", "getDescriptionSource", "getDisplayTitle", "getExtract", "setExtract", "getExtractHtml$annotations", "getExtractHtml", "setExtractHtml", "getLang", "setLang", "leadImageName", "getLeadImageName", "getNamespace", "()Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "ns", "Lorg/wikipedia/page/Namespace;", "getNs", "()Lorg/wikipedia/page/Namespace;", "getOriginalImage$annotations", "getPageId$annotations", "getPageId", "()I", "getRevision", "()J", "getThumbnail", "()Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "setThumbnail", "(Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;)V", "thumbnailUrl", "getThumbnailUrl", "getTimestamp", "getTitles", "()Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "setTitles", "(Lorg/wikipedia/dataclient/page/PageSummary$Titles;)V", "getType", "getViewHistory$annotations", "getViewHistory", "()Ljava/util/List;", "getViews", "getWikiBaseItem$annotations", "getWikiBaseItem", "adjustPageTitle", "Lorg/wikipedia/page/PageTitle;", "title", "getPageTitle", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "toPage", "Lorg/wikipedia/page/Page;", "toString", "Companion", "NamespaceContainer", "Thumbnail", "Titles", "ViewHistory", "app.lib"})
@kotlinx.parcelize.Parcelize()
public class PageSummary implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer namespace = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.PageSummary.Titles titles;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lang;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.PageSummary.Thumbnail thumbnail;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String extract;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.page.PageSummary.Thumbnail originalImage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String wikiBaseItem = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String extractHtml;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String descriptionSource = null;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location coordinates;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int pageId = 0;
    private final long revision = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timestamp = null;
    private final long views = 0L;
    private final long rank = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> viewHistory = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_STANDARD = "standard";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_DISAMBIGUATION = "disambiguation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_MAIN_PAGE = "mainpage";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.page.PageSummary.Companion Companion = null;
    
    public PageSummary(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.NamespaceContainer namespace, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Titles titles, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Thumbnail thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String extract, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Thumbnail originalImage, @org.jetbrains.annotations.Nullable()
    java.lang.String wikiBaseItem, @org.jetbrains.annotations.Nullable()
    java.lang.String extractHtml, @org.jetbrains.annotations.NotNull()
    java.lang.String descriptionSource, @org.jetbrains.annotations.Nullable()
    android.location.Location coordinates, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int pageId, long revision, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp, long views, long rank, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> viewHistory) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer getNamespace() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.Titles getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Titles p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.Thumbnail getThumbnail() {
        return null;
    }
    
    public final void setThumbnail(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Thumbnail p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtract() {
        return null;
    }
    
    public final void setExtract(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlinx.serialization.SerialName(value = "originalimage")
    @java.lang.Deprecated()
    private static void getOriginalImage$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWikiBaseItem() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "wikibase_item")
    @java.lang.Deprecated()
    public static void getWikiBaseItem$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtractHtml() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "extract_html")
    @java.lang.Deprecated()
    public static void getExtractHtml$annotations() {
    }
    
    public final void setExtractHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescriptionSource() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "description_source")
    @java.lang.Deprecated()
    public static void getDescriptionSource$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getCoordinates() {
        return null;
    }
    
    @kotlinx.serialization.Serializable(with = org.wikipedia.json.LocationSerializer.class)
    @java.lang.Deprecated()
    public static void getCoordinates$annotations() {
    }
    
    public final void setCoordinates(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int getPageId() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "pageid")
    @java.lang.Deprecated()
    public static void getPageId$annotations() {
    }
    
    public final long getRevision() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    public final long getViews() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> getViewHistory() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "view_history")
    @java.lang.Deprecated()
    public static void getViewHistory$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeadImageName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace getNs() {
        return null;
    }
    
    public PageSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String prefixTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String extract, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.Page toPage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    private final org.wikipedia.page.PageTitle adjustPageTitle(org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public PageSummary() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Companion;", "", "()V", "TYPE_DISAMBIGUATION", "", "TYPE_MAIN_PAGE", "TYPE_STANDARD", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "Landroid/os/Parcelable;", "id", "", "text", "", "(ILjava/lang/String;)V", "getId", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app.lib"})
    @kotlinx.parcelize.Parcelize()
    public static final class NamespaceContainer implements android.os.Parcelable {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
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
        
        public NamespaceContainer(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public NamespaceContainer() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "Landroid/os/Parcelable;", "source", "", "width", "", "height", "(Ljava/lang/String;II)V", "getHeight", "()I", "getSource", "()Ljava/lang/String;", "getWidth", "app.lib"})
    @kotlinx.parcelize.Parcelize()
    public static final class Thumbnail implements android.os.Parcelable {
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
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "Landroid/os/Parcelable;", "canonical", "", "display", "(Ljava/lang/String;Ljava/lang/String;)V", "getCanonical", "()Ljava/lang/String;", "getDisplay", "app.lib"})
    @kotlinx.parcelize.Parcelize()
    public static final class Titles implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String canonical = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String display = null;
        
        public Titles(@org.jetbrains.annotations.Nullable()
        java.lang.String canonical, @org.jetbrains.annotations.Nullable()
        java.lang.String display) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCanonical() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDisplay() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "Landroid/os/Parcelable;", "date", "", "views", "", "(Ljava/lang/String;F)V", "getDate", "()Ljava/lang/String;", "getViews", "()F", "app.lib"})
    @kotlinx.parcelize.Parcelize()
    public static final class ViewHistory implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        private final float views = 0.0F;
        
        public ViewHistory(@org.jetbrains.annotations.NotNull()
        java.lang.String date, float views) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final float getViews() {
            return 0.0F;
        }
    }
}