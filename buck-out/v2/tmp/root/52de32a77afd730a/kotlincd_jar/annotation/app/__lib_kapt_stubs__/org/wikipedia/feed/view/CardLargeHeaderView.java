package org.wikipedia.feed.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.palette.graphics.Palette;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewCardHeaderLargeBinding;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.TransitionUtil;
import org.wikipedia.views.imageservice.ImageLoadListener;
import org.wikipedia.views.imageservice.ImageService;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0014J\u0010\u0010!\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0014R\u0013\u0010\u000b\u001a\u00020\f\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/feed/view/CardLargeHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "sharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "", "getSharedElements", "()[Landroid/util/Pair;", "resetBackgroundColor", "", "setGradientDrawableBackground", "leftColor", "rightColor", "setImage", "uri", "Landroid/net/Uri;", "setLanguageCode", "langCode", "setSubtitle", "subtitle", "", "setTitle", "title", "CardImageLoadListener", "app.lib"})
public final class CardLargeHeaderView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public CardLargeHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CardLargeHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CardLargeHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.Pair<android.view.View, java.lang.String>[] getSharedElements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardLargeHeaderView setLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardLargeHeaderView setImage(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardLargeHeaderView setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardLargeHeaderView setSubtitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence subtitle) {
        return null;
    }
    
    private final void resetBackgroundColor() {
    }
    
    private final void setGradientDrawableBackground(@androidx.annotation.ColorInt()
    int leftColor, @androidx.annotation.ColorInt()
    int rightColor) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/feed/view/CardLargeHeaderView$CardImageLoadListener;", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "(Lorg/wikipedia/feed/view/CardLargeHeaderView;)V", "onError", "", "error", "", "onSuccess", "image", "", "width", "", "height", "app.lib"})
    final class CardImageLoadListener implements org.wikipedia.views.imageservice.ImageLoadListener {
        
        public CardImageLoadListener() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.Object image, int width, int height) {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
        }
    }
}