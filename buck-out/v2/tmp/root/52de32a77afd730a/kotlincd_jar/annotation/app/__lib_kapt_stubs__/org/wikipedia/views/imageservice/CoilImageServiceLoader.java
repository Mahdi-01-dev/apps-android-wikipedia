package org.wikipedia.views.imageservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import coil3.Image;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import coil3.imageLoader;
import coil3.network.okhttp.OkHttpNetworkFetcherFactory;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import coil3.request.allowRgb565;
import coil3.request.error;
import coil3.request.placeholder;
import coil3.request.target;
import coil3.request.transformations;
import coil3.toBitmap;
import org.wikipedia.R;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016JG\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016JE\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0018J6\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JI\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/views/imageservice/CoilImageServiceLoader;", "Lorg/wikipedia/views/imageservice/ImageServiceLoader;", "()V", "factory", "error/NonExistentClass", "Lerror/NonExistentClass;", "getBitmap", "Landroid/graphics/Bitmap;", "image", "", "getRequest", "context", "Landroid/content/Context;", "url", "", "detectFace", "", "force", "placeholderId", "", "listener", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)Ljava/lang/Object;", "getRequestBuilder", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)Lerror/NonExistentClass;", "loadImage", "", "imageUrl", "whiteBackground", "onSuccess", "Lkotlin/Function1;", "imageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)V", "shouldDetectFace", "app.lib"})
public final class CoilImageServiceLoader implements org.wikipedia.views.imageservice.ImageServiceLoader {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object factory;
    
    public CoilImageServiceLoader() {
        super();
    }
    
    @java.lang.Override()
    public void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener) {
    }
    
    @java.lang.Override()
    public void loadImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, boolean whiteBackground, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onSuccess) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object getRequest(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ImageRequest.Builder getRequestBuilder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean detectFace, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean force, @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Bitmap getBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.Object image) {
        return null;
    }
    
    private final boolean shouldDetectFace(java.lang.String url) {
        return false;
    }
}