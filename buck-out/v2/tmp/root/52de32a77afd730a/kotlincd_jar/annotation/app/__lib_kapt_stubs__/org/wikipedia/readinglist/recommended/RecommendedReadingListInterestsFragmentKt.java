package org.wikipedia.readinglist.recommended;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.BrushPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.fragment.app.Fragment;
import coil3.compose.AsyncImage;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.ReadingListActivity;
import org.wikipedia.readinglist.ReadingListMode;
import org.wikipedia.search.SearchActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.views.imageservice.ImageService;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a|\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a\u008f\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\r2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u00a8\u0006!"}, d2 = {"PreviewReadingListInterestsScreen", "", "ReadingListInterestCard", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lorg/wikipedia/page/PageTitle;", "isSelected", "", "onItemClick", "Lkotlin/Function1;", "ReadingListInterestSearchCard", "onSearchClick", "Lkotlin/Function0;", "RecommendedReadingListInterestsContent", "fromSettings", "listState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "items", "", "selectedItems", "", "onNextClick", "onRandomizeClick", "RecommendedReadingListInterestsScreen", "uiState", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListInterestsViewModel$UiState;", "wikiErrorClickEvents", "Lorg/wikipedia/compose/components/error/WikiErrorClickEvents;", "onCloseClick", "Lkotlin/ParameterName;", "name", "app.lib"})
public final class RecommendedReadingListInterestsFragmentKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void RecommendedReadingListInterestsScreen(@org.jetbrains.annotations.NotNull()
    org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListInterestsViewModel.UiState> uiState, boolean fromSettings, @org.jetbrains.annotations.Nullable()
    org.wikipedia.compose.components.error.WikiErrorClickEvents wikiErrorClickEvents, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.page.PageTitle, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, kotlin.Unit> onRandomizeClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RecommendedReadingListInterestsContent(boolean fromSettings, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState listState, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> items, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.wikipedia.page.PageTitle> selectedItems, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.page.PageTitle, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRandomizeClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ReadingListInterestCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle item, boolean isSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.page.PageTitle, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ReadingListInterestSearchCard(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewReadingListInterestsScreen() {
    }
}