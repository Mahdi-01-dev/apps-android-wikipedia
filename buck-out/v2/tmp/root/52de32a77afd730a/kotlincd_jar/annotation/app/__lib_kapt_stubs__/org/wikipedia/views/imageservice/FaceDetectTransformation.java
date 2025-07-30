package org.wikipedia.views.imageservice;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.FaceDetector;
import coil3.Bitmap;
import coil3.size.Size;
import coil3.size.pxOrElse;
import coil3.transform.Transformation;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/views/imageservice/FaceDetectTransformation;", "", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "detectFace", "Landroid/graphics/PointF;", "testBitmap", "Landroid/graphics/Bitmap;", "isBitmapEligibleForImageProcessing", "", "bitmap", "new565ScaledBitmap", "src", "transform", "error/NonExistentClass", "input", "size", "(Lerror/NonExistentClass;Lerror/NonExistentClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app.lib"})
public final class FaceDetectTransformation extends Transformation {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cacheKey = "FaceDetectTransformation";
    private static final int BITMAP_COPY_WIDTH = 200;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.imageservice.FaceDetectTransformation.Companion Companion = null;
    
    public FaceDetectTransformation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCacheKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object transform(@org.jetbrains.annotations.NotNull()
    Bitmap input, @org.jetbrains.annotations.NotNull()
    Size size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<Bitmap> $completion) {
        return null;
    }
    
    private final android.graphics.PointF detectFace(android.graphics.Bitmap testBitmap) {
        return null;
    }
    
    private final android.graphics.Bitmap new565ScaledBitmap(android.graphics.Bitmap src) {
        return null;
    }
    
    private final boolean isBitmapEligibleForImageProcessing(android.graphics.Bitmap bitmap) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/views/imageservice/FaceDetectTransformation$Companion;", "", "()V", "BITMAP_COPY_WIDTH", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}