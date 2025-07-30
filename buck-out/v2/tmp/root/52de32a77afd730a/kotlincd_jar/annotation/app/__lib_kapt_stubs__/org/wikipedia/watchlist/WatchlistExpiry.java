package org.wikipedia.watchlist;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import org.wikipedia.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiry;", "", "expiry", "", "stringId", "", "icon", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;)V", "getExpiry", "()Ljava/lang/String;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStringId", "()I", "NEVER", "ONE_WEEK", "ONE_MONTH", "THREE_MONTH", "SIX_MONTH", "app.lib"})
public enum WatchlistExpiry {
    /*public static final*/ NEVER /* = new NEVER(null, 0, null) */,
    /*public static final*/ ONE_WEEK /* = new ONE_WEEK(null, 0, null) */,
    /*public static final*/ ONE_MONTH /* = new ONE_MONTH(null, 0, null) */,
    /*public static final*/ THREE_MONTH /* = new THREE_MONTH(null, 0, null) */,
    /*public static final*/ SIX_MONTH /* = new SIX_MONTH(null, 0, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String expiry = null;
    private final int stringId = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer icon = null;
    
    WatchlistExpiry(java.lang.String expiry, @androidx.annotation.StringRes()
    int stringId, @androidx.annotation.DrawableRes()
    java.lang.Integer icon) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiry() {
        return null;
    }
    
    public final int getStringId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.watchlist.WatchlistExpiry> getEntries() {
        return null;
    }
}