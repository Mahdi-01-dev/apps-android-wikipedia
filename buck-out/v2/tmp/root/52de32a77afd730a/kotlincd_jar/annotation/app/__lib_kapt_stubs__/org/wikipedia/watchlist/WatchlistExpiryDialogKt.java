package org.wikipedia.watchlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.compose.ComposeColors;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.page.PageTitle;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0003\u00a8\u0006\u000b"}, d2 = {"WatchlistExpiryDialogView", "", "modifier", "Landroidx/compose/ui/Modifier;", "expiryList", "", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "selectedWatchListTime", "onExpiryItemSelected", "Lkotlin/Function1;", "WatchlistExpiryDialogViewPreview", "app.lib"})
public final class WatchlistExpiryDialogKt {
    
    @androidx.compose.runtime.Composable()
    public static final void WatchlistExpiryDialogView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.watchlist.WatchlistExpiry> expiryList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry selectedWatchListTime, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.watchlist.WatchlistExpiry, kotlin.Unit> onExpiryItemSelected) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    private static final void WatchlistExpiryDialogViewPreview() {
    }
}