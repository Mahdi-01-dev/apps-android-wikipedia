package org.wikipedia.yearinreview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavHostController;
import coil3.compose.SubcomposeAsyncImage;
import coil3.compose.SubcomposeAsyncImageContent;
import coil3.request.ImageRequest;
import coil3.request.allowHardware;
import org.wikipedia.R;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007\u001a\u001e\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\u0014\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0015\u001a\u00020\u0001H\u0007\u001ax\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\u00182#\u0010\u0002\u001a\u001f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0019\u00a2\u0006\u0002\b\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0007\u001aL\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007\u001a \u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0003\u00a8\u0006."}, d2 = {"CreateScreenShotBitmap", "", "screenContent", "Lorg/wikipedia/yearinreview/YearInReviewScreenData;", "context", "Landroid/content/Context;", "onBitmapReady", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "LoadingIndicator", "MainBottomBar", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "totalPages", "", "onNavigationRightClick", "Lkotlin/Function0;", "onDonateClick", "OnboardingBottomBar", "onGetStartedClick", "PreviewContent", "PreviewScreenShot", "YearInReviewScreen", "customBottomBar", "Landroidx/compose/runtime/Composable;", "Lkotlin/Function3;", "Landroidx/compose/foundation/layout/PaddingValues;", "navController", "Landroidx/navigation/NavHostController;", "contentData", "", "canShowSurvey", "YearInReviewScreenContent", "innerPadding", "screenData", "screenCaptureMode", "", "isOnboardingScreen", "isImageResourceLoaded", "paginationSizeGradient", "totalIndicators", "iteration", "processString", "", "resource", "", "app.lib"})
public final class YearInReviewScaffoldKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void YearInReviewScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.pager.PagerState, kotlin.Unit> customBottomBar, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super org.wikipedia.yearinreview.YearInReviewScreenData, ? super androidx.compose.foundation.pager.PagerState, kotlin.Unit> screenContent, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.yearinreview.YearInReviewScreenData> contentData, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> canShowSurvey) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MainBottomBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.pager.PagerState pagerState, int totalPages, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigationRightClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDonateClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void OnboardingBottomBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onGetStartedClick, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void YearInReviewScreenContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues innerPadding, @org.jetbrains.annotations.NotNull()
    org.wikipedia.yearinreview.YearInReviewScreenData screenData, @org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean screenCaptureMode, boolean isOnboardingScreen, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isImageResourceLoaded) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CreateScreenShotBitmap(@org.jetbrains.annotations.NotNull()
    org.wikipedia.yearinreview.YearInReviewScreenData screenContent, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onBitmapReady) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LoadingIndicator() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String processString(java.lang.Object resource) {
        return null;
    }
    
    private static final int paginationSizeGradient(int totalIndicators, int iteration, androidx.compose.foundation.pager.PagerState pagerState) {
        return 0;
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void PreviewContent() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void PreviewScreenShot() {
    }
}