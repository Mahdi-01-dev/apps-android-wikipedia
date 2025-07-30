package org.wikipedia.util;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.util.TypedValue;
import androidx.annotation.*;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\bJ\u0012\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0007J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/util/ResourceUtil;", "", "()V", "bitmapFromVectorDrawable", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "id", "", "tintColor", "(Landroid/content/Context;ILjava/lang/Integer;)Landroid/graphics/Bitmap;", "colorToCssString", "", "color", "darkenColor", "getThemedAttribute", "Landroid/util/TypedValue;", "getThemedAttributeId", "getThemedColor", "getThemedColorStateList", "Landroid/content/res/ColorStateList;", "lightenColor", "uri", "Landroid/net/Uri;", "app.lib"})
public final class ResourceUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.ResourceUtil INSTANCE = null;
    
    private ResourceUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap bitmapFromVectorDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.DrawableRes()
    int id, @androidx.annotation.ColorRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer tintColor) {
        return null;
    }
    
    private final android.util.TypedValue getThemedAttribute(android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return null;
    }
    
    @androidx.annotation.AnyRes()
    public final int getThemedAttributeId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return 0;
    }
    
    @androidx.annotation.ColorInt()
    public final int getThemedColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.ColorStateList getThemedColorStateList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {android.content.res.Resources.NotFoundException.class})
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri uri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AnyRes()
    int id) throws android.content.res.Resources.NotFoundException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String colorToCssString(@androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    @androidx.annotation.ColorInt()
    public final int lightenColor(@androidx.annotation.ColorInt()
    int color) {
        return 0;
    }
    
    @androidx.annotation.ColorInt()
    public final int darkenColor(@androidx.annotation.ColorInt()
    int color) {
        return 0;
    }
}