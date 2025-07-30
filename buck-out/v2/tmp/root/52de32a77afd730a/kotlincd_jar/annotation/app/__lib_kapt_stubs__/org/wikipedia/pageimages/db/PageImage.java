package org.wikipedia.pageimages.db;

import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.Index;
import kotlinx.parcelize.Parcelize;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nBO\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0010J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J]\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u000fH\u00d6\u0001J\t\u00102\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00063"}, d2 = {"Lorg/wikipedia/pageimages/db/PageImage;", "Landroid/os/Parcelable;", "title", "Lorg/wikipedia/page/PageTitle;", "imageName", "", "description", "geoLat", "", "geoLon", "(Lorg/wikipedia/page/PageTitle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "lang", "namespace", "apiTitle", "timeSpentSec", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDD)V", "getApiTitle", "()Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getGeoLat", "()D", "setGeoLat", "(D)V", "getGeoLon", "setGeoLon", "getImageName", "setImageName", "getLang", "getNamespace", "getTimeSpentSec", "()I", "setTimeSpentSec", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app.lib"})
@kotlinx.parcelize.Parcelize()
@androidx.room.Entity(primaryKeys = {"lang", "namespace", "apiTitle"}, indices = {@androidx.room.Index(value = {"lang", "namespace", "apiTitle"})})
public final class PageImage implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lang = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String namespace = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiTitle = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private int timeSpentSec;
    private double geoLat;
    private double geoLon;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.pageimages.db.PageImage copy(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String imageName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, int timeSpentSec, double geoLat, double geoLon) {
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
    
    public PageImage(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String imageName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, int timeSpentSec, double geoLat, double geoLon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamespace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageName() {
        return null;
    }
    
    public final void setImageName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getTimeSpentSec() {
        return 0;
    }
    
    public final void setTimeSpentSec(int p0) {
    }
    
    public final double getGeoLat() {
        return 0.0;
    }
    
    public final void setGeoLat(double p0) {
    }
    
    public final double getGeoLon() {
        return 0.0;
    }
    
    public final void setGeoLon(double p0) {
    }
    
    public PageImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
    java.lang.String imageName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Double geoLat, @org.jetbrains.annotations.Nullable()
    java.lang.Double geoLon) {
        super();
    }
}