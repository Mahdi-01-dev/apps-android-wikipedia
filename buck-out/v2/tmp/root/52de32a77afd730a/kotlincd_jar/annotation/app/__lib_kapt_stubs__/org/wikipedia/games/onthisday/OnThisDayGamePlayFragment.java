package org.wikipedia.games.onthisday;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.databinding.FragmentOnThisDayGamePlayBinding;
import org.wikipedia.feed.onthisday.OnThisDay;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.views.WikiCardView;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cJ\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0011H\u0002J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u0019H\u0016J\b\u0010.\u001a\u00020\u0019H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001a\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020\u0019H\u0002J\u0010\u00106\u001a\u00020\u00192\u0006\u00101\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u000207H\u0002J\u000e\u00109\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010:\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\u0019H\u0002J\b\u0010?\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006A"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGamePlayFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "cardAnimatorSetIn", "Landroid/animation/AnimatorSet;", "cardAnimatorSetOut", "mainActivity", "Lorg/wikipedia/games/onthisday/OnThisDayGameActivity;", "mediaPlayer", "Landroid/media/MediaPlayer;", "selectedCardView", "Lorg/wikipedia/views/WikiCardView;", "viewModel", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "getViewModel", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "animateQuestionsIn", "", "animateQuestionsOut", "onFinished", "Lkotlin/Function0;", "enqueueGoNext", "gameState", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "enqueueSubmit", "cardView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCurrentQuestion", "onCurrentQuestionCorrect", "onCurrentQuestionIncorrect", "onDestroy", "onGameEnded", "onGameStarted", "onViewCreated", "view", "playSound", "soundName", "", "resetCardBorders", "setCorrectIcon", "Landroid/widget/ImageView;", "setIncorrectIcon", "updateGameState", "updateInitialScores", "updateOnError", "t", "", "updateOnLoading", "updateQuestionEndLayout", "Companion", "app.lib"})
public final class OnThisDayGamePlayFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentOnThisDayGamePlayBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.animation.AnimatorSet cardAnimatorSetIn = null;
    @org.jetbrains.annotations.NotNull()
    private final android.animation.AnimatorSet cardAnimatorSetOut = null;
    private android.media.MediaPlayer mediaPlayer;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.WikiCardView selectedCardView;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.games.onthisday.OnThisDayGameActivity mainActivity;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGamePlayFragment.Companion Companion = null;
    
    public OnThisDayGamePlayFragment() {
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
    
    private final void updateOnLoading() {
    }
    
    private final void onGameStarted(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    private final void onCurrentQuestion(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    private final void onCurrentQuestionCorrect(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    private final void onCurrentQuestionIncorrect(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    private final void updateQuestionEndLayout() {
    }
    
    private final void setCorrectIcon(android.widget.ImageView view) {
    }
    
    private final void setIncorrectIcon(android.widget.ImageView view) {
    }
    
    private final void enqueueGoNext(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    public final void animateQuestionsIn() {
    }
    
    public final void animateQuestionsOut(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
    }
    
    private final void onGameEnded() {
    }
    
    private final void updateOnError(java.lang.Throwable t) {
    }
    
    public final void updateGameState(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    private final void enqueueSubmit(org.wikipedia.views.WikiCardView cardView) {
    }
    
    private final void resetCardBorders() {
    }
    
    public final void updateInitialScores(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    public final void playSound(@org.jetbrains.annotations.NotNull()
    java.lang.String soundName) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGamePlayFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/games/onthisday/OnThisDayGamePlayFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGamePlayFragment newInstance() {
            return null;
        }
    }
}