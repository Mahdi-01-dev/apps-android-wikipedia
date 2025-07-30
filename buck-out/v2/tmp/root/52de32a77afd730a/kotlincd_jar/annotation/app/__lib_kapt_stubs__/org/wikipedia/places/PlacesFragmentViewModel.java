package org.wikipedia.places;

import android.location.Location;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.NearbyPage;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/places/PlacesFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "highlightedPageTitle", "Lorg/wikipedia/page/PageTitle;", "getHighlightedPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setHighlightedPageTitle", "(Lorg/wikipedia/page/PageTitle;)V", "lastKnownLocation", "Landroid/location/Location;", "getLastKnownLocation", "()Landroid/location/Location;", "setLastKnownLocation", "(Landroid/location/Location;)V", "location", "getLocation", "setLocation", "nearbyPagesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "", "Lorg/wikipedia/dataclient/page/NearbyPage;", "getNearbyPagesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "fetchNearbyPages", "", "latitude", "", "longitude", "radius", "", "maxResults", "app.lib"})
public final class PlacesFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private android.location.Location location;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle highlightedPageTitle;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastKnownLocation;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.page.NearbyPage>>> nearbyPagesLiveData = null;
    
    public PlacesFragmentViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getHighlightedPageTitle() {
        return null;
    }
    
    public final void setHighlightedPageTitle(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLastKnownLocation() {
        return null;
    }
    
    public final void setLastKnownLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.page.NearbyPage>>> getNearbyPagesLiveData() {
        return null;
    }
    
    public final void fetchNearbyPages(double latitude, double longitude, int radius, int maxResults) {
    }
}