package org.wikipedia.dataclient.page;

import android.graphics.Bitmap;
import android.location.Location;
import org.maplibre.android.plugins.annotation.Symbol;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lorg/wikipedia/dataclient/page/NearbyPage;", "", "pageId", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "latitude", "", "longitude", "annotation", "Lorg/maplibre/android/plugins/annotation/Symbol;", "bitmap", "Landroid/graphics/Bitmap;", "(ILorg/wikipedia/page/PageTitle;DDLorg/maplibre/android/plugins/annotation/Symbol;Landroid/graphics/Bitmap;)V", "getAnnotation", "()Lorg/maplibre/android/plugins/annotation/Symbol;", "setAnnotation", "(Lorg/maplibre/android/plugins/annotation/Symbol;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "getLatitude", "()D", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "getLongitude", "getPageId", "()I", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "app.lib"})
public final class NearbyPage {
    private final int pageId = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    private final double latitude = 0.0;
    private final double longitude = 0.0;
    @org.jetbrains.annotations.Nullable()
    private org.maplibre.android.plugins.annotation.Symbol annotation;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap bitmap;
    
    public NearbyPage(int pageId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, double latitude, double longitude, @org.jetbrains.annotations.Nullable()
    org.maplibre.android.plugins.annotation.Symbol annotation, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
        super();
    }
    
    public final int getPageId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.maplibre.android.plugins.annotation.Symbol getAnnotation() {
        return null;
    }
    
    public final void setAnnotation(@org.jetbrains.annotations.Nullable()
    org.maplibre.android.plugins.annotation.Symbol p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    public final void setBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location getLocation() {
        return null;
    }
}