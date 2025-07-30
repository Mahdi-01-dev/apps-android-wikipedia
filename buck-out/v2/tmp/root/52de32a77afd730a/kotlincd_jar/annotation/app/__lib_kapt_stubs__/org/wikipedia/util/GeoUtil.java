package org.wikipedia.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import org.wikipedia.R;
import org.wikipedia.feed.announcement.GeoIPCookieUnmarshaller;
import org.wikipedia.settings.Prefs;
import java.text.DecimalFormat;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/util/GeoUtil;", "", "()V", "geoIPCountry", "", "getGeoIPCountry", "()Ljava/lang/String;", "getDistanceWithUnit", "startLocation", "Landroid/location/Location;", "endLocation", "locale", "Ljava/util/Locale;", "isSamePlace", "", "startLat", "", "endLat", "startLon", "endLon", "sendGeoIntent", "", "activity", "Landroid/app/Activity;", "location", "placeName", "app.lib"})
public final class GeoUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.GeoUtil INSTANCE = null;
    
    private GeoUtil() {
        super();
    }
    
    @kotlin.Suppress(names = {"UnsafeImplicitIntentLaunch"})
    public final void sendGeoIntent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.location.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.String placeName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGeoIPCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistanceWithUnit(@org.jetbrains.annotations.NotNull()
    android.location.Location startLocation, @org.jetbrains.annotations.NotNull()
    android.location.Location endLocation, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    public final boolean isSamePlace(double startLat, double endLat, double startLon, double endLon) {
        return false;
    }
}