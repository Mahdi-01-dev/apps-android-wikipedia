package org.wikipedia.readinglist.recommended;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.R;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a*\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007\u001aJ\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007\u001aZ\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0007\u00a8\u0006\u001b"}, d2 = {"DefaultPreviewSourceSelectionScreen", "", "SourceOptionCard", "isSelected", "", "modifier", "Landroidx/compose/ui/Modifier;", "iconRes", "", "textRes", "SourceSelectionContent", "onSourceClick", "Lkotlin/Function1;", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "onNextClick", "Lkotlin/Function0;", "selectedSource", "isSavedOptionEnabled", "isHistoryOptionEnabled", "fromSettings", "SourceSelectionScreen", "uiState", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSourceViewModel$SourceSelectionUiState;", "wikiErrorClickEvents", "Lorg/wikipedia/compose/components/error/WikiErrorClickEvents;", "onCloseClick", "app.lib"})
public final class RecommendedReadingListSourceScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void SourceSelectionScreen(@org.jetbrains.annotations.NotNull()
    org.wikipedia.util.Resource<org.wikipedia.readinglist.recommended.RecommendedReadingListSourceViewModel.SourceSelectionUiState> uiState, boolean fromSettings, @org.jetbrains.annotations.Nullable()
    org.wikipedia.compose.components.error.WikiErrorClickEvents wikiErrorClickEvents, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.readinglist.recommended.RecommendedReadingListSource, kotlin.Unit> onSourceClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SourceSelectionContent(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.readinglist.recommended.RecommendedReadingListSource, kotlin.Unit> onSourceClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSource selectedSource, boolean isSavedOptionEnabled, boolean isHistoryOptionEnabled, boolean fromSettings) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SourceOptionCard(boolean isSelected, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, int iconRes, int textRes) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void DefaultPreviewSourceSelectionScreen() {
    }
}