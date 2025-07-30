package org.wikipedia.places;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.maplibre.android.MapLibre;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.camera.CameraUpdateFactory;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.location.LocationComponentActivationOptions;
import org.maplibre.android.location.modes.CameraMode;
import org.maplibre.android.location.modes.RenderMode;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapLibreMap.CancelableCallback;
import org.maplibre.android.maps.Style;
import org.maplibre.android.module.http.HttpRequestImpl;
import org.maplibre.android.plugins.annotation.ClusterOptions;
import org.maplibre.android.plugins.annotation.Symbol;
import org.maplibre.android.plugins.annotation.SymbolManager;
import org.maplibre.android.plugins.annotation.SymbolOptions;
import org.maplibre.android.style.expressions.Expression;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.databinding.FragmentPlacesBinding;
import org.wikipedia.databinding.ItemPlacesListBinding;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.dataclient.page.NearbyPage;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.page.tabs.TabActivity;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.search.SearchActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.GeoUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.TabUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.views.imageservice.ImageService;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 {2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003{|}B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00109\u001a\u00020:H\u0002J\u001c\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010#H\u0002J\n\u0010?\u001a\u0004\u0018\u00010\u0016H\u0002J\n\u0010@\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010A\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0002J\u001e\u0010B\u001a\u00020:2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010D\u001a\u00020\u0019H\u0002J\b\u0010E\u001a\u00020FH\u0002J\u0012\u0010G\u001a\u00020:2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J$\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010O2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010P\u001a\u00020:H\u0016J\b\u0010Q\u001a\u00020:H\u0016J \u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020FH\u0016J\b\u0010X\u001a\u00020:H\u0016J\u0010\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020:H\u0016J\b\u0010]\u001a\u00020:H\u0016J\u0010\u0010^\u001a\u00020:2\u0006\u0010_\u001a\u00020IH\u0016J\b\u0010`\u001a\u00020:H\u0016J\b\u0010a\u001a\u00020:H\u0016J\u0010\u0010b\u001a\u00020:2\u0006\u0010c\u001a\u00020[H\u0002J\u001a\u0010d\u001a\u00020:2\u0006\u0010e\u001a\u00020K2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010f\u001a\u00020:2\u0006\u0010g\u001a\u00020\u000bH\u0002J\b\u0010h\u001a\u00020:H\u0002J\u0012\u0010i\u001a\u00020:2\b\u0010j\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010k\u001a\u00020:2\u0006\u0010 \u001a\u00020!2\u0006\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020:H\u0002J\u0018\u0010o\u001a\u00020:2\u0006\u0010p\u001a\u00020T2\u0006\u0010q\u001a\u00020\u0016H\u0002J\b\u0010r\u001a\u00020:H\u0003J\u0016\u0010s\u001a\u00020:2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u000b0uH\u0002J\b\u0010v\u001a\u00020:H\u0002J\u0012\u0010w\u001a\u00020:2\b\b\u0002\u0010x\u001a\u00020\u001dH\u0002J\u0010\u0010y\u001a\u00020:2\u0006\u0010z\u001a\u00020FH\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00106\u00a8\u0006~"}, d2 = {"Lorg/wikipedia/places/PlacesFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$LoadPageCallback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$DismissCallback;", "Lorg/maplibre/android/maps/MapLibreMap$OnMapClickListener;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "annotationCache", "Lkotlin/collections/ArrayDeque;", "Lorg/wikipedia/dataclient/page/NearbyPage;", "binding", "getBinding", "()Lerror/NonExistentClass;", "filterLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "lastCheckedId", "", "lastLocation", "Landroid/location/Location;", "lastLocationQueried", "lastZoom", "", "lastZoomQueried", "locationPermissionRequest", "", "", "magnifiedMarker", "Lorg/maplibre/android/plugins/annotation/Symbol;", "mapboxMap", "Lorg/maplibre/android/maps/MapLibreMap;", "markerBitmapBase", "Landroid/graphics/Bitmap;", "markerBorderPaint", "Landroid/graphics/Paint;", "markerPaintSrc", "markerPaintSrcIn", "markerRect", "Landroid/graphics/Rect;", "navBarInsets", "Landroidx/core/graphics/Insets;", "placesSearchLauncher", "searchRadius", "getSearchRadius", "()I", "statusBarInsets", "symbolManager", "Lorg/maplibre/android/plugins/annotation/SymbolManager;", "viewModel", "Lorg/wikipedia/places/PlacesFragmentViewModel;", "getViewModel", "()Lorg/wikipedia/places/PlacesFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "clearAnnotationCache", "", "drawMarker", "canvas", "Landroid/graphics/Canvas;", "thumbnailBitmap", "getDefaultLocation", "getLastKnownUserLocation", "getMarkerBitmap", "goToLocation", "preferredLocation", "zoom", "haveLocationPermissions", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onLinkPreviewDismiss", "onLinkPreviewLoadPage", "title", "Lorg/wikipedia/page/PageTitle;", "entry", "Lorg/wikipedia/history/HistoryEntry;", "inNewTab", "onLowMemory", "onMapClick", "point", "Lorg/maplibre/android/geometry/LatLng;", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onUpdateCameraPosition", "latLng", "onViewCreated", "view", "queueImageForAnnotation", "page", "resetMagnifiedSymbol", "setMagnifiedSymbol", "symbol", "setUpSymbolManagerWithClustering", "style", "Lorg/maplibre/android/maps/Style;", "setupMarkerPaints", "showLinkPreview", "pageTitle", "location", "startLocationTracking", "updateMapMarkers", "pages", "", "updateSearchCardViews", "updateSearchText", "searchText", "updateToggleViews", "isMapVisible", "Companion", "RecyclerViewAdapter", "RecyclerViewItemHolder", "app.lib"})
public final class PlacesFragment extends androidx.fragment.app.Fragment implements org.wikipedia.page.linkpreview.LinkPreviewDialog.LoadPageCallback, org.wikipedia.page.linkpreview.LinkPreviewDialog.DismissCallback, org.maplibre.android.maps.MapLibreMap.OnMapClickListener {
    @org.jetbrains.annotations.Nullable()
    private FragmentPlacesBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.core.graphics.Insets statusBarInsets;
    @org.jetbrains.annotations.Nullable()
    private androidx.core.graphics.Insets navBarInsets;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private org.maplibre.android.maps.MapLibreMap mapboxMap;
    @org.jetbrains.annotations.Nullable()
    private org.maplibre.android.plugins.annotation.SymbolManager symbolManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.collections.ArrayDeque<org.wikipedia.dataclient.page.NearbyPage> annotationCache = null;
    private int lastCheckedId;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastLocation;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastLocationQueried;
    private double lastZoom = 15.0;
    private double lastZoomQueried = 0.0;
    private android.graphics.Bitmap markerBitmapBase;
    private android.graphics.Paint markerPaintSrc;
    private android.graphics.Paint markerPaintSrcIn;
    private android.graphics.Paint markerBorderPaint;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect markerRect = null;
    @org.jetbrains.annotations.Nullable()
    private org.maplibre.android.plugins.annotation.Symbol magnifiedMarker;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> locationPermissionRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> placesSearchLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> filterLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MARKER_DRAWABLE = "markerDrawable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POINT_COUNT = "point_count";
    public static final int MAX_ANNOTATIONS = 250;
    public static final int THUMB_SIZE = 160;
    public static final int ITEMS_PER_REQUEST = 75;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLUSTER_TEXT_LAYER_ID = "mapbox-android-cluster-text";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLUSTER_CIRCLE_LAYER_ID = "mapbox-android-cluster-circle0";
    public static final int ZOOM_IN_ANIMATION_DURATION = 1000;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] CLUSTER_FONT_STACK = {"Open Sans Semibold"};
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] MARKER_FONT_STACK = {"Open Sans Regular"};
    private static final int MARKER_SIZE = 0;
    private static final float MARKER_BORDER_SIZE = 0.0F;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.places.PlacesFragment.Companion Companion = null;
    
    public PlacesFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.places.PlacesFragmentViewModel getViewModel() {
        return null;
    }
    
    private final int getSearchRadius() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void updateSearchText(java.lang.String searchText) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final android.location.Location getDefaultLocation() {
        return null;
    }
    
    private final void updateToggleViews(boolean isMapVisible) {
    }
    
    private final void showLinkPreview(org.wikipedia.page.PageTitle pageTitle, android.location.Location location) {
    }
    
    private final void resetMagnifiedSymbol() {
    }
    
    private final void setMagnifiedSymbol(org.maplibre.android.plugins.annotation.Symbol symbol) {
    }
    
    private final void setupMarkerPaints() {
    }
    
    private final void updateSearchCardViews() {
    }
    
    private final void setUpSymbolManagerWithClustering(org.maplibre.android.maps.MapLibreMap mapboxMap, org.maplibre.android.maps.Style style) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void clearAnnotationCache() {
    }
    
    private final void onUpdateCameraPosition(org.maplibre.android.geometry.LatLng latLng) {
    }
    
    private final void updateMapMarkers(java.util.List<org.wikipedia.dataclient.page.NearbyPage> pages) {
    }
    
    private final boolean haveLocationPermissions() {
        return false;
    }
    
    private final android.location.Location getLastKnownUserLocation() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationTracking() {
    }
    
    private final void goToLocation(android.location.Location preferredLocation, double zoom) {
    }
    
    private final void queueImageForAnnotation(org.wikipedia.dataclient.page.NearbyPage page) {
    }
    
    private final android.graphics.Bitmap getMarkerBitmap(android.graphics.Bitmap thumbnailBitmap) {
        return null;
    }
    
    private final void drawMarker(android.graphics.Canvas canvas, android.graphics.Bitmap thumbnailBitmap) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewDismiss() {
    }
    
    @java.lang.Override()
    public boolean onMapClick(@org.jetbrains.annotations.NotNull()
    org.maplibre.android.geometry.LatLng point) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0013\u0010\bR\u0011\u0010\u0014\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/places/PlacesFragment$Companion;", "", "()V", "CLUSTER_CIRCLE_LAYER_ID", "", "CLUSTER_FONT_STACK", "", "getCLUSTER_FONT_STACK", "()[Ljava/lang/String;", "[Ljava/lang/String;", "CLUSTER_TEXT_LAYER_ID", "ITEMS_PER_REQUEST", "", "MARKER_BORDER_SIZE", "", "getMARKER_BORDER_SIZE", "()F", "MARKER_DRAWABLE", "MARKER_FONT_STACK", "getMARKER_FONT_STACK", "MARKER_SIZE", "getMARKER_SIZE", "()I", "MAX_ANNOTATIONS", "POINT_COUNT", "THUMB_SIZE", "ZOOM_IN_ANIMATION_DURATION", "latitudeDiffToMeters", "latitudeDiff", "", "newInstance", "Lorg/wikipedia/places/PlacesFragment;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "location", "Landroid/location/Location;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getCLUSTER_FONT_STACK() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getMARKER_FONT_STACK() {
            return null;
        }
        
        public final int getMARKER_SIZE() {
            return 0;
        }
        
        public final float getMARKER_BORDER_SIZE() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.places.PlacesFragment newInstance(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
        android.location.Location location) {
            return null;
        }
        
        /**
         * Rough conversion of latitude degrees to meters, bounded by the limits accepted by the API.
         */
        public final int latitudeDiffToMeters(double latitudeDiff) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/places/PlacesFragment$RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/places/PlacesFragment$RecyclerViewItemHolder;", "Lorg/wikipedia/places/PlacesFragment;", "nearbyPages", "", "Lorg/wikipedia/dataclient/page/NearbyPage;", "(Lorg/wikipedia/places/PlacesFragment;Ljava/util/List;)V", "getNearbyPages", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.places.PlacesFragment.RecyclerViewItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.page.NearbyPage> nearbyPages = null;
        
        public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.page.NearbyPage> nearbyPages) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.page.NearbyPage> getNearbyPages() {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.places.PlacesFragment.RecyclerViewItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.places.PlacesFragment.RecyclerViewItemHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/places/PlacesFragment$RecyclerViewItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/places/PlacesFragment;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "page", "Lorg/wikipedia/dataclient/page/NearbyPage;", "bindItem", "", "locationForDistance", "Landroid/location/Location;", "onClick", "v", "Landroid/view/View;", "onLongClick", "", "app.lib"})
    final class RecyclerViewItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
        @org.jetbrains.annotations.NotNull()
        private final ItemPlacesListBinding binding = null;
        private org.wikipedia.dataclient.page.NearbyPage page;
        
        public RecyclerViewItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemPlacesListBinding getBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.NearbyPage page, @org.jetbrains.annotations.Nullable()
        android.location.Location locationForDistance) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            return false;
        }
    }
}