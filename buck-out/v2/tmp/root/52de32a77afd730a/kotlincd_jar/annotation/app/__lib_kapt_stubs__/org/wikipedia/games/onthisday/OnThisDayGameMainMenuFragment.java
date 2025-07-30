package org.wikipedia.games.onthisday;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.databinding.FragmentOnThisDayGameMainMenuBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import java.time.LocalDate;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010#\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameMainMenuFragment;", "Lorg/wikipedia/games/onthisday/OnThisDayGameBaseFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "viewModel", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "getViewModel", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleCurrentQuestion", "", "state", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "handleGameEnded", "handleGameStarted", "observeGameState", "onArchiveDateSelected", "date", "Ljava/time/LocalDate;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showGameMenu", "showGameResults", "startGame", "updateOnError", "t", "", "updateOnLoading", "Companion", "app.lib"})
public final class OnThisDayGameMainMenuFragment extends org.wikipedia.games.onthisday.OnThisDayGameBaseFragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentOnThisDayGameMainMenuBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private static final int SHOW_ON_EXPLORE_FEED_COUNT = 2;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGameMainMenuFragment.Companion Companion = null;
    
    public OnThisDayGameMainMenuFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.games.onthisday.OnThisDayGameViewModel getViewModel() {
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
    
    private final void observeGameState() {
    }
    
    private final void updateOnLoading() {
    }
    
    private final void showGameMenu() {
    }
    
    private final void updateOnError(java.lang.Throwable t) {
    }
    
    private final void handleGameStarted() {
    }
    
    private final void handleCurrentQuestion(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState state) {
    }
    
    private final void handleGameEnded(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState state) {
    }
    
    private final void startGame() {
    }
    
    private final void showGameResults() {
    }
    
    @java.lang.Override()
    public void onArchiveDateSelected(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameMainMenuFragment$Companion;", "", "()V", "SHOW_ON_EXPLORE_FEED_COUNT", "", "maybeShowOnThisDayGameDialog", "", "activity", "Landroid/app/Activity;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "articleWikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "newInstance", "Lorg/wikipedia/games/onthisday/OnThisDayGameMainMenuFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameMainMenuFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
        
        public final void maybeShowOnThisDayGameDialog(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite articleWikiSite) {
        }
    }
}