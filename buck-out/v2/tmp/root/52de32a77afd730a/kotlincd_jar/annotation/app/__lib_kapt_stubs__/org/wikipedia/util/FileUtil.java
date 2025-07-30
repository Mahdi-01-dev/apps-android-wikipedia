package org.wikipedia.util;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/util/FileUtil;", "", "()V", "JPEG_QUALITY", "", "compressBmpToJpg", "Ljava/io/ByteArrayOutputStream;", "bitmap", "Landroid/graphics/Bitmap;", "createFileInDownloadsFolder", "", "context", "Landroid/content/Context;", "filename", "", "mimeType", "data", "isAudio", "", "isImage", "isVideo", "readFile", "inputStream", "Ljava/io/InputStream;", "sanitizeFileName", "fileName", "writeToFile", "Ljava/io/File;", "bytes", "destinationFile", "app.lib"})
public final class FileUtil {
    private static final int JPEG_QUALITY = 85;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.FileUtil INSTANCE = null;
    
    private FileUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File writeToFile(@org.jetbrains.annotations.NotNull()
    java.io.ByteArrayOutputStream bytes, @org.jetbrains.annotations.NotNull()
    java.io.File destinationFile) {
        return null;
    }
    
    public final void createFileInDownloadsFolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.ByteArrayOutputStream compressBmpToJpg(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String readFile(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sanitizeFileName(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    public final boolean isVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
    
    public final boolean isAudio(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
    
    public final boolean isImage(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
}