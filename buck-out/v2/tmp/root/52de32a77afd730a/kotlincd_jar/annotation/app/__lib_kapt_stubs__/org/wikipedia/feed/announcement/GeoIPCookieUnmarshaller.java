package org.wikipedia.feed.announcement;

import android.location.Location;
import androidx.annotation.VisibleForTesting;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import java.lang.IllegalArgumentException;
import java.lang.NumberFormatException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/announcement/GeoIPCookieUnmarshaller;", "", "()V", "COOKIE_NAME", "", "unmarshal", "Lorg/wikipedia/feed/announcement/GeoIPCookie;", "cookie", "Component", "app.lib"})
public final class GeoIPCookieUnmarshaller {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COOKIE_NAME = "GeoIP";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.announcement.GeoIPCookieUnmarshaller INSTANCE = null;
    
    private GeoIPCookieUnmarshaller() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.announcement.GeoIPCookie unmarshal() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.announcement.GeoIPCookie unmarshal(@org.jetbrains.annotations.Nullable()
    java.lang.String cookie) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/announcement/GeoIPCookieUnmarshaller$Component;", "", "(Ljava/lang/String;I)V", "COUNTRY", "REGION", "CITY", "LATITUDE", "LONGITUDE", "VERSION", "app.lib"})
    static enum Component {
        /*public static final*/ COUNTRY /* = new COUNTRY() */,
        /*public static final*/ REGION /* = new REGION() */,
        /*public static final*/ CITY /* = new CITY() */,
        /*public static final*/ LATITUDE /* = new LATITUDE() */,
        /*public static final*/ LONGITUDE /* = new LONGITUDE() */,
        /*public static final*/ VERSION /* = new VERSION() */;
        
        Component() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.feed.announcement.GeoIPCookieUnmarshaller.Component> getEntries() {
            return null;
        }
    }
}