package org.wikipedia.games.onthisday;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import org.wikipedia.R;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eJ$\u0010\u0014\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0012J \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/games/onthisday/ScoreView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scoreViews", "", "Lcom/google/android/material/imageview/ShapeableImageView;", "createImageView", "generateViews", "", "size", "", "updateInitialScores", "answerState", "", "", "currentQuestionIndex", "updateScore", "gotToNext", "updateScoreViewAppearance", "scoreView", "Landroid/widget/ImageView;", "isCorrect", "isAnswered", "app.lib"})
public final class ScoreView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.material.imageview.ShapeableImageView> scoreViews = null;
    
    public ScoreView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final void generateViews(int size) {
    }
    
    public final void updateScore(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Boolean> answerState, int currentQuestionIndex, boolean gotToNext) {
    }
    
    public final void updateInitialScores(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Boolean> answerState, int currentQuestionIndex) {
    }
    
    private final void updateScoreViewAppearance(android.widget.ImageView scoreView, boolean isCorrect, boolean isAnswered) {
    }
    
    private final com.google.android.material.imageview.ShapeableImageView createImageView() {
        return null;
    }
}