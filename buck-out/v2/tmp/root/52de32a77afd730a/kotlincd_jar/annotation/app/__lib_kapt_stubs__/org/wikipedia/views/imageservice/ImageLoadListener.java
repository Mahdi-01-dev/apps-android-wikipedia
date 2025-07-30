package org.wikipedia.views.imageservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/views/imageservice/ImageLoadListener;", "", "onError", "", "error", "", "onSuccess", "image", "width", "", "height", "app.lib"})
public abstract interface ImageLoadListener {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int width, int height);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onSuccess(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.imageservice.ImageLoadListener $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object image, int width, int height) {
        }
        
        public static void onError(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.imageservice.ImageLoadListener $this, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
        }
    }
}