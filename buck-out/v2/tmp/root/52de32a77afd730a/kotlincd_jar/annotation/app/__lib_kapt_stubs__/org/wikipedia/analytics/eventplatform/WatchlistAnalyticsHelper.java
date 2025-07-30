package org.wikipedia.analytics.eventplatform;

import android.content.Context;
import org.wikipedia.WikipediaApp;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ*\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/WatchlistAnalyticsHelper;", "", "()V", "logAddedToWatchlist", "", "title", "Lorg/wikipedia/page/PageTitle;", "context", "Landroid/content/Context;", "logAddedToWatchlistSuccess", "logFilterSelection", "excludedWikiCodes", "", "", "includedTypeCodes", "logRemovedFromWatchlist", "logRemovedFromWatchlistSuccess", "logWatchlistItemCountOnLoad", "itemsCount", "", "app.lib"})
public final class WatchlistAnalyticsHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.WatchlistAnalyticsHelper INSTANCE = null;
    
    private WatchlistAnalyticsHelper() {
        super();
    }
    
    public final void logWatchlistItemCountOnLoad(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemsCount) {
    }
    
    public final void logAddedToWatchlist(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logRemovedFromWatchlist(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logAddedToWatchlistSuccess(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logRemovedFromWatchlistSuccess(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logFilterSelection(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> excludedWikiCodes, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> includedTypeCodes) {
    }
}