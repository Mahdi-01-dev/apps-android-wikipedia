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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "expiryList", "", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "viewModel", "Lorg/wikipedia/watchlist/WatchlistExpiryDialogViewModel;", "getViewModel", "()Lorg/wikipedia/watchlist/WatchlistExpiryDialogViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callback", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "Callback", "Companion", "app.lib"})
public final class WatchlistExpiryDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.watchlist.WatchlistExpiry> expiryList = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_PAGE_TITLE = "pageTitle";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.watchlist.WatchlistExpiryDialog.Companion Companion = null;
    
    public WatchlistExpiryDialog() {
        super();
    }
    
    private final org.wikipedia.watchlist.WatchlistExpiryDialogViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final org.wikipedia.watchlist.WatchlistExpiryDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "", "onExpiryChanged", "", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onExpiryChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Companion;", "", "()V", "ARG_PAGE_TITLE", "", "newInstance", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.watchlist.WatchlistExpiryDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle) {
            return null;
        }
    }
}