package org.wikipedia.gallery;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.ContextCompat;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.feed.image.FeaturedImage;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.FileUtil;
import java.io.File;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J2\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/gallery/MediaDownloadReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "callback", "Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "download", "", "context", "Landroid/content/Context;", "featuredImage", "Lorg/wikipedia/feed/image/FeaturedImage;", "imageTitle", "Lorg/wikipedia/page/PageTitle;", "mediaInfo", "Lorg/wikipedia/gallery/ImageInfo;", "notifyContentResolver", "path", "", "mimeType", "onReceive", "intent", "Landroid/content/Intent;", "performDownloadRequest", "uri", "Landroid/net/Uri;", "targetDirectoryType", "targetFileName", "register", "unregister", "Callback", "Companion", "app.lib"})
public final class MediaDownloadReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.gallery.MediaDownloadReceiver.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FILE_NAMESPACE = "File:";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.gallery.MediaDownloadReceiver.Companion Companion = null;
    
    public MediaDownloadReceiver() {
        super();
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.MediaDownloadReceiver.Callback callback) {
    }
    
    public final void unregister(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void download(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImage featuredImage) {
    }
    
    public final void download(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle imageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.ImageInfo mediaInfo) {
    }
    
    private final void performDownloadRequest(android.content.Context context, android.net.Uri uri, java.lang.String targetDirectoryType, java.lang.String targetFileName, java.lang.String mimeType) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void notifyContentResolver(android.content.Context context, java.lang.String path, java.lang.String mimeType) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "", "onSuccess", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/gallery/MediaDownloadReceiver$Companion;", "", "()V", "FILE_NAMESPACE", "", "trimFileNamespace", "filename", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String trimFileNamespace(java.lang.String filename) {
            return null;
        }
    }
}