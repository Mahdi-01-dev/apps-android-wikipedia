package org.wikipedia.commons;

import org.wikipedia.dataclient.mwapi.MwQueryPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/commons/FilePage;", "", "thumbnailWidth", "", "thumbnailHeight", "imageFromCommons", "", "showEditButton", "showFilename", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "imageTags", "", "", "", "(IIZZZLorg/wikipedia/dataclient/mwapi/MwQueryPage;Ljava/util/Map;)V", "getImageFromCommons", "()Z", "getImageTags", "()Ljava/util/Map;", "getPage", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getShowEditButton", "getShowFilename", "getThumbnailHeight", "()I", "getThumbnailWidth", "app.lib"})
public final class FilePage {
    private final int thumbnailWidth = 0;
    private final int thumbnailHeight = 0;
    private final boolean imageFromCommons = false;
    private final boolean showEditButton = false;
    private final boolean showFilename = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.mwapi.MwQueryPage page = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> imageTags = null;
    
    public FilePage(int thumbnailWidth, int thumbnailHeight, boolean imageFromCommons, boolean showEditButton, boolean showFilename, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage page, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> imageTags) {
        super();
    }
    
    public final int getThumbnailWidth() {
        return 0;
    }
    
    public final int getThumbnailHeight() {
        return 0;
    }
    
    public final boolean getImageFromCommons() {
        return false;
    }
    
    public final boolean getShowEditButton() {
        return false;
    }
    
    public final boolean getShowFilename() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getImageTags() {
        return null;
    }
    
    public FilePage() {
        super();
    }
}