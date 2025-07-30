package org.wikipedia.places;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import org.wikipedia.Constants;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/places/PlacesActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/places/PlacesFragment;", "()V", "createFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class PlacesActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.places.PlacesFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LOCATION = "location";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.places.PlacesActivity.Companion Companion = null;
    
    public PlacesActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.places.PlacesFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/places/PlacesActivity$Companion;", "", "()V", "EXTRA_LOCATION", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "location", "Landroid/location/Location;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
        android.location.Location location) {
            return null;
        }
    }
}