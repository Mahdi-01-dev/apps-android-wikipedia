package org.wikipedia.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u0002J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\b\u0001\u0010\u0011\u001a\u00020\u0012\"\u00020\bH\u0002J4\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\f\b\u0001\u0010\u0011\u001a\u00020\u0012\"\u00020\b\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/views/AppTextViewWithImages;", "", "()V", "getFormattedDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "drawableId", "", "size", "", "color", "getImageSpans", "", "Landroid/text/Spanned;", "textView", "Landroid/widget/TextView;", "drawableIds", "", "makeImageSpan", "Landroid/text/Spannable;", "lineSpacingMultiplier", "setTextWithDrawables", "", "text", "", "BaselineAlignedYTranslationImageSpan", "app.lib"})
public final class AppTextViewWithImages {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.AppTextViewWithImages INSTANCE = null;
    
    private AppTextViewWithImages() {
        super();
    }
    
    /**
     * A method to set a Spanned character sequence containing drawable resources.
     *
     * @param text A CharSequence formatted for use in android.text.TextUtils.expandTemplate(),
     * e.g.: "^1 is my favorite mobile operating system."  Placeholders are expected in
     * the format "^1", "^2", and so on.
     * @param drawableIds Numeric drawable IDs for the drawables which are to replace the
     * placeholders, in the order in which they should appear.
     */
    public final void setTextWithDrawables(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.NotNull()
    int... drawableIds) {
    }
    
    private final java.util.List<android.text.Spanned> getImageSpans(android.widget.TextView textView, @androidx.annotation.DrawableRes()
    int... drawableIds) {
        return null;
    }
    
    /**
     * Create an ImageSpan containing a drawable to be inserted in a TextView. This also sets the
     * image size and color.
     *
     * @param drawableId    A drawable resource Id.
     * @param size          The desired size (i.e. width and height) of the image icon in pixels.
     * @param color         The color to apply to the image.
     * @return A single-length ImageSpan that can be swapped into a CharSequence to replace a
     * placeholder.
     */
    private final android.text.Spannable makeImageSpan(android.content.Context context, float lineSpacingMultiplier, @androidx.annotation.DrawableRes()
    int drawableId, float size, @androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    private final android.graphics.drawable.Drawable getFormattedDrawable(android.content.Context context, @androidx.annotation.DrawableRes()
    int drawableId, float size, @androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    /**
     * An ImageSpan subclass that manually adjusts the vertical position of the drawable it contains
     * to correct for the failure of ImageSpan.ALIGN_BASELINE to take into account any adjustments
     * to the parent view's line height (via lineSpacingMultiplier or lineSpacingExtra).
     *
     * The general approach is adapted (and simplified) from http://stackoverflow.com/a/28361364.
     *
     * Not written as generically as it could be since I don't think there's any need for this kind
     * of tweak elsewhere at present, but could probably be made more generic (i.e., made not to
     * assume ALIGN_BASELINE and to also account for any lineSpacingExtra) and broken out into a
     * standalone class if need be.
     *
     * A possibly related issue is https://code.google.com/p/android/issues/detail?id=21397,
     * but note that the problem this works around affects an ImageSpan on any line, not just the
     * last line as reported there.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JP\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/views/AppTextViewWithImages$BaselineAlignedYTranslationImageSpan;", "Landroid/text/style/ImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "lineSpacingMultiplier", "", "(Landroid/graphics/drawable/Drawable;F)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "app.lib"})
    static final class BaselineAlignedYTranslationImageSpan extends android.text.style.ImageSpan {
        private final float lineSpacingMultiplier = 0.0F;
        
        public BaselineAlignedYTranslationImageSpan(@org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Drawable drawable, float lineSpacingMultiplier) {
            super(null);
        }
        
        @java.lang.Override()
        public void draw(@org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, @org.jetbrains.annotations.NotNull()
        android.graphics.Paint paint) {
        }
    }
}