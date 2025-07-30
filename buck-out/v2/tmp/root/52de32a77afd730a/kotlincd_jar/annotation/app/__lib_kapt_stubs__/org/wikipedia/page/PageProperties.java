package org.wikipedia.page;

import android.location.Location;
import android.os.Parcelable;
import kotlinx.parcelize.IgnoredOnParcel;
import kotlinx.parcelize.Parcelize;
import kotlinx.parcelize.TypeParceler;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.dataclient.page.Protection;
import org.wikipedia.parcel.DateParceler;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.UriUtil;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u00a3\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u001bJ\t\u0010<\u001a\u00020\u0006H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010B\u001a\u00020\u0011H\u00c6\u0003J\t\u0010C\u001a\u00020\bH\u00c6\u0003J\t\u0010D\u001a\u00020\nH\u00c6\u0003J\t\u0010E\u001a\u00020\fH\u00c6\u0003J\t\u0010F\u001a\u00020\u000eH\u00c6\u0003J\t\u0010G\u001a\u00020\u000eH\u00c2\u0003J\t\u0010H\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u00a9\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010L\u001a\u00020\u00112\b\u0010M\u001a\u0004\u0018\u00010NH\u00d6\u0003J\t\u0010O\u001a\u00020\u0006H\u00d6\u0001J\t\u0010P\u001a\u00020\u000eH\u00d6\u0001R\u001a\u0010\u001a\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010)R.\u00102\u001a\u0004\u0018\u0001012\b\u00100\u001a\u0004\u0018\u000101@FX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010!\u00a8\u0006Q"}, d2 = {"Lorg/wikipedia/page/PageProperties;", "Landroid/os/Parcelable;", "pageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "(Lorg/wikipedia/dataclient/page/PageSummary;)V", "pageId", "", "namespace", "Lorg/wikipedia/page/Namespace;", "revisionId", "", "lastModified", "Ljava/util/Date;", "displayTitle", "", "editProtectionStatus", "isMainPage", "", "leadImageUrl", "leadImageName", "leadImageWidth", "leadImageHeight", "geo", "Landroid/location/Location;", "wikiBaseItem", "descriptionSource", "canEdit", "(ILorg/wikipedia/page/Namespace;JLjava/util/Date;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILandroid/location/Location;Ljava/lang/String;Ljava/lang/String;Z)V", "getCanEdit", "()Z", "setCanEdit", "(Z)V", "getDescriptionSource", "()Ljava/lang/String;", "getDisplayTitle", "getGeo", "()Landroid/location/Location;", "isLoggedInUserAllowedToEdit", "getLastModified", "()Ljava/util/Date;", "getLeadImageHeight", "()I", "getLeadImageName", "getLeadImageUrl", "getLeadImageWidth", "getNamespace", "()Lorg/wikipedia/page/Namespace;", "getPageId", "value", "Lorg/wikipedia/dataclient/page/Protection;", "protection", "getProtection$annotations", "()V", "getProtection", "()Lorg/wikipedia/dataclient/page/Protection;", "setProtection", "(Lorg/wikipedia/dataclient/page/Protection;)V", "getRevisionId", "()J", "getWikiBaseItem", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app.lib"})
@kotlinx.parcelize.Parcelize()
@kotlinx.parcelize.TypeParceler()
public final class PageProperties implements android.os.Parcelable {
    private final int pageId = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.Namespace namespace = null;
    private final long revisionId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date lastModified = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayTitle = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String editProtectionStatus;
    private final boolean isMainPage = false;
    
    /**
     * Nullable URL with no scheme. For example, foo.bar.com/ instead of http://foo.bar.com/.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String leadImageUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String leadImageName = null;
    private final int leadImageWidth = 0;
    private final int leadImageHeight = 0;
    @org.jetbrains.annotations.Nullable()
    private final android.location.Location geo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String wikiBaseItem = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String descriptionSource = null;
    private boolean canEdit;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.Protection protection;
    
    public final int component1() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    private final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageProperties copy(int pageId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace namespace, long revisionId, @org.jetbrains.annotations.NotNull()
    java.util.Date lastModified, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String editProtectionStatus, boolean isMainPage, @org.jetbrains.annotations.Nullable()
    java.lang.String leadImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String leadImageName, int leadImageWidth, int leadImageHeight, @org.jetbrains.annotations.Nullable()
    android.location.Location geo, @org.jetbrains.annotations.Nullable()
    java.lang.String wikiBaseItem, @org.jetbrains.annotations.Nullable()
    java.lang.String descriptionSource, boolean canEdit) {
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
    
    public PageProperties(int pageId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace namespace, long revisionId, @org.jetbrains.annotations.NotNull()
    java.util.Date lastModified, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String editProtectionStatus, boolean isMainPage, @org.jetbrains.annotations.Nullable()
    java.lang.String leadImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String leadImageName, int leadImageWidth, int leadImageHeight, @org.jetbrains.annotations.Nullable()
    android.location.Location geo, @org.jetbrains.annotations.Nullable()
    java.lang.String wikiBaseItem, @org.jetbrains.annotations.Nullable()
    java.lang.String descriptionSource, boolean canEdit) {
        super();
    }
    
    public final int getPageId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace getNamespace() {
        return null;
    }
    
    public final long getRevisionId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLastModified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final boolean isMainPage() {
        return false;
    }
    
    /**
     * Nullable URL with no scheme. For example, foo.bar.com/ instead of http://foo.bar.com/.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeadImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeadImageName() {
        return null;
    }
    
    public final int getLeadImageWidth() {
        return 0;
    }
    
    public final int getLeadImageHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getGeo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWikiBaseItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescriptionSource() {
        return null;
    }
    
    public final boolean getCanEdit() {
        return false;
    }
    
    public final void setCanEdit(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.Protection getProtection() {
        return null;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getProtection$annotations() {
    }
    
    public final void setProtection(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.Protection value) {
    }
    
    /**
     * Side note: Should later be moved out of this class but I like the similarities with
     * PageProperties(JSONObject).
     */
    public PageProperties(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary pageSummary) {
        super();
    }
    
    private final boolean isLoggedInUserAllowedToEdit() {
        return false;
    }
}