package org.wikipedia.views.imageservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&JO\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&\u00a2\u0006\u0002\u0010\u0011J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0017H&JO\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&\u00a2\u0006\u0002\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/views/imageservice/ImageServiceLoader;", "", "getBitmap", "Landroid/graphics/Bitmap;", "image", "getRequest", "context", "Landroid/content/Context;", "url", "", "detectFace", "", "force", "placeholderId", "", "listener", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)Ljava/lang/Object;", "loadImage", "", "imageUrl", "whiteBackground", "onSuccess", "Lkotlin/Function1;", "imageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)V", "app.lib"})
public abstract interface ImageServiceLoader {
    
    public abstract void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener);
    
    public abstract void loadImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, boolean whiteBackground, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onSuccess);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Object getRequest(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.graphics.Bitmap getBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.Object image);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}