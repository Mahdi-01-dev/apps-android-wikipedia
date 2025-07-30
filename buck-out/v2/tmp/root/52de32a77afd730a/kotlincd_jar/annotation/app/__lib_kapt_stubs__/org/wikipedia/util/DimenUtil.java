package org.wikipedia.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DimenRes;
import androidx.core.util.TypedValueCompat;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bJ\u0010\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010%\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010&\u001a\u00020\'2\b\b\u0001\u0010\u001e\u001a\u00020\bH\u0002J\u000e\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010-\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0002J\u000e\u00100\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00062"}, d2 = {"Lorg/wikipedia/util/DimenUtil;", "", "()V", "densityScalar", "", "getDensityScalar", "()F", "displayHeightPx", "", "getDisplayHeightPx", "()I", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayWidthPx", "getDisplayWidthPx", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "articleHeaderViewScreenHeightRatio", "calculateLeadImageWidth", "dpToPx", "dp", "getContentTopOffset", "context", "Landroid/content/Context;", "getContentTopOffsetPx", "getDimension", "id", "getFloat", "getFontSizeFromSp", "fontSp", "getNavigationBarHeight", "getNavigationBarId", "getToolbarHeight", "getToolbarHeightPx", "getValue", "Landroid/util/TypedValue;", "htmlPxToInt", "str", "", "isLandscape", "", "leadImageHeightForDevice", "pxToDp", "px", "roundedDpToPx", "roundedPxToDp", "app.lib"})
public final class DimenUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.DimenUtil INSTANCE = null;
    
    private DimenUtil() {
        super();
    }
    
    public final float dpToPx(float dp) {
        return 0.0F;
    }
    
    public final int roundedDpToPx(float dp) {
        return 0;
    }
    
    private final float pxToDp(float px) {
        return 0.0F;
    }
    
    public final int roundedPxToDp(float px) {
        return 0;
    }
    
    public final float getDensityScalar() {
        return 0.0F;
    }
    
    public final float getFloat(@androidx.annotation.DimenRes()
    int id) {
        return 0.0F;
    }
    
    public final float getDimension(@androidx.annotation.DimenRes()
    int id) {
        return 0.0F;
    }
    
    public final float getFontSizeFromSp(float fontSp) {
        return 0.0F;
    }
    
    public final int calculateLeadImageWidth() {
        return 0;
    }
    
    public final int getDisplayWidthPx() {
        return 0;
    }
    
    public final int getDisplayHeightPx() {
        return 0;
    }
    
    public final int getContentTopOffsetPx(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    private final float getContentTopOffset(android.content.Context context) {
        return 0.0F;
    }
    
    private final android.util.TypedValue getValue(@androidx.annotation.DimenRes()
    int id) {
        return null;
    }
    
    private final android.util.DisplayMetrics getDisplayMetrics() {
        return null;
    }
    
    private final android.content.res.Resources getResources() {
        return null;
    }
    
    public final int htmlPxToInt(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
        return 0;
    }
    
    public final float getNavigationBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0.0F;
    }
    
    private final float getToolbarHeight(android.content.Context context) {
        return 0.0F;
    }
    
    public final int getToolbarHeightPx(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @androidx.annotation.DimenRes()
    private final int getNavigationBarId(android.content.Context context) {
        return 0;
    }
    
    public final boolean isLandscape(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final int leadImageHeightForDevice(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    private final float articleHeaderViewScreenHeightRatio() {
        return 0.0F;
    }
}