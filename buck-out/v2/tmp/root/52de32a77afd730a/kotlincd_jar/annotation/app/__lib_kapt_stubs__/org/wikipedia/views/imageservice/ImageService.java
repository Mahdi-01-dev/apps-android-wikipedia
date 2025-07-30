package org.wikipedia.views.imageservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001JO\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017J6\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\u001cJM\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/views/imageservice/ImageService;", "", "()V", "_implementation", "Lorg/wikipedia/views/imageservice/ImageServiceLoader;", "implementation", "getImplementation", "()Lorg/wikipedia/views/imageservice/ImageServiceLoader;", "getBitmap", "Landroid/graphics/Bitmap;", "image", "getRequest", "context", "Landroid/content/Context;", "url", "", "detectFace", "", "force", "placeholderId", "", "listener", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)Ljava/lang/Object;", "loadImage", "", "whiteBackground", "onSuccess", "Lkotlin/Function1;", "imageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)V", "setImplementation", "impl", "app.lib"})
public final class ImageService {
    @org.jetbrains.annotations.Nullable()
    private static org.wikipedia.views.imageservice.ImageServiceLoader _implementation;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.imageservice.ImageService INSTANCE = null;
    
    private ImageService() {
        super();
    }
    
    private final org.wikipedia.views.imageservice.ImageServiceLoader getImplementation() {
        return null;
    }
    
    public final void setImplementation(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.imageservice.ImageServiceLoader impl) {
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener) {
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean whiteBackground, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRequest(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.Object image) {
        return null;
    }
}