package org.wikipedia.readinglist;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import coil3.compose.AsyncImage;
import org.wikipedia.R;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.views.imageservice.ImageService;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aV\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0003\u00a8\u0006\u0010"}, d2 = {"RecommendedReadingListDiscoverCardView", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "subtitleIcon", "", "subtitle", "description", "images", "", "isNewListGenerated", "", "isUserLoggedIn", "RecommendedReadingListDiscoverCardViewPreview", "app.lib"})
public final class RecommendedReadingListDiscoverCardViewKt {
    
    @androidx.compose.runtime.Composable()
    public static final void RecommendedReadingListDiscoverCardView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @androidx.annotation.DrawableRes()
    int subtitleIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, boolean isNewListGenerated, boolean isUserLoggedIn) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void RecommendedReadingListDiscoverCardViewPreview() {
    }
}