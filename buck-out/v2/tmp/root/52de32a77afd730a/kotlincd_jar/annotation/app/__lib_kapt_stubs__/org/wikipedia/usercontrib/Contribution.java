package org.wikipedia.usercontrib;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import kotlinx.parcelize.TypeParceler;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.parcel.DateParceler;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\b\u0007\u0018\u0000 72\u00020\u0001:\u00017Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\'R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010.R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010.R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106\u00a8\u00068"}, d2 = {"Lorg/wikipedia/usercontrib/Contribution;", "Landroid/os/Parcelable;", "qNumber", "", "revId", "", "ns", "", "apiTitle", "displayTitle", "description", "editType", "imageUrl", "date", "Ljava/util/Date;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "pageViews", "sizeDiff", "top", "", "tagCount", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lorg/wikipedia/dataclient/WikiSite;JIZI)V", "getApiTitle", "()Ljava/lang/String;", "setApiTitle", "(Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getDescription", "setDescription", "getDisplayTitle", "setDisplayTitle", "getEditType", "()I", "getImageUrl", "setImageUrl", "getNs", "getPageViews", "()J", "setPageViews", "(J)V", "getQNumber", "getRevId", "getSizeDiff", "setSizeDiff", "(I)V", "getTagCount", "setTagCount", "getTop", "()Z", "setTop", "(Z)V", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "Companion", "app.lib"})
@kotlinx.parcelize.Parcelize()
@kotlinx.parcelize.TypeParceler()
public final class Contribution implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String qNumber = null;
    private final long revId = 0L;
    private final int ns = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    private final int editType = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageUrl;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date date = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    private long pageViews;
    private int sizeDiff;
    private boolean top;
    private int tagCount;
    public static final int EDIT_TYPE_GENERIC = 0;
    public static final int EDIT_TYPE_ARTICLE_DESCRIPTION = 1;
    public static final int EDIT_TYPE_IMAGE_CAPTION = 2;
    public static final int EDIT_TYPE_IMAGE_TAG = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.usercontrib.Contribution.Companion Companion = null;
    
    public Contribution(@org.jetbrains.annotations.NotNull()
    java.lang.String qNumber, long revId, int ns, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int editType, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, long pageViews, int sizeDiff, boolean top, int tagCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQNumber() {
        return null;
    }
    
    public final long getRevId() {
        return 0L;
    }
    
    public final int getNs() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    public final void setApiTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final void setDisplayTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getEditType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    public final long getPageViews() {
        return 0L;
    }
    
    public final void setPageViews(long p0) {
    }
    
    public final int getSizeDiff() {
        return 0;
    }
    
    public final void setSizeDiff(int p0) {
    }
    
    public final boolean getTop() {
        return false;
    }
    
    public final void setTop(boolean p0) {
    }
    
    public final int getTagCount() {
        return 0;
    }
    
    public final void setTagCount(int p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/usercontrib/Contribution$Companion;", "", "()V", "EDIT_TYPE_ARTICLE_DESCRIPTION", "", "EDIT_TYPE_GENERIC", "EDIT_TYPE_IMAGE_CAPTION", "EDIT_TYPE_IMAGE_TAG", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}