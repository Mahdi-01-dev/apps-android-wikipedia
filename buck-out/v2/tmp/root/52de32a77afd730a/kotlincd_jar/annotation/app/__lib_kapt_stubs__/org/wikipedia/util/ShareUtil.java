package org.wikipedia.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import kotlinx.coroutines.*;
import org.wikipedia.BuildConfig;
import org.wikipedia.R;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.log.L;
import java.io.File;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J \u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 J$\u0010!\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\'\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002J\"\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0004H\u0002J6\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001e\u00102\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J \u00102\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u0012J&\u00102\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u0002042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207J\u0010\u00109\u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0014\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006:"}, d2 = {"Lorg/wikipedia/util/ShareUtil;", "", "()V", "APP_PACKAGE_REGEX", "", "FILE_PREFIX", "FILE_PROVIDER_AUTHORITY", "error/NonExistentClass", "Lerror/NonExistentClass;", "buildImageShareChooserIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "subject", "text", "uri", "Landroid/net/Uri;", "canOpenUrlInApp", "", "url", "cleanFileName", "fileName", "createImageShareIntent", "displayOnCatchMessage", "", "caught", "", "displayShareErrorMessage", "getClearShareFolder", "Ljava/io/File;", "getFeaturedImageShareSubject", "age", "", "getIntentChooser", "intent", "chooserTitle", "", "getShareFolder", "getUriFromFile", "file", "isSelfComponentName", "componentName", "Landroid/content/ComponentName;", "processBitmapForSharing", "bmp", "Landroid/graphics/Bitmap;", "imageFileName", "shareImage", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "shareText", "title", "Lorg/wikipedia/page/PageTitle;", "withProvenance", "newId", "", "oldId", "showUnresolvableIntentMessage", "app.lib"})
public final class ShareUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_PACKAGE_REGEX = "org\\.wikipedia.*";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object FILE_PROVIDER_AUTHORITY = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FILE_PREFIX = "file://";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.ShareUtil INSTANCE = null;
    
    private ShareUtil() {
        super();
    }
    
    public final void shareText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void shareText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean withProvenance) {
    }
    
    public final void shareText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, long newId, long oldId) {
    }
    
    public final void shareImage(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bmp, @org.jetbrains.annotations.NotNull()
    java.lang.String imageFileName, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeaturedImageShareSubject(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int age) {
        return null;
    }
    
    private final android.content.Intent buildImageShareChooserIntent(android.content.Context context, java.lang.String subject, java.lang.String text, android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getUriFromFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return null;
    }
    
    private final java.io.File processBitmapForSharing(android.content.Context context, android.graphics.Bitmap bmp, java.lang.String imageFileName) {
        return null;
    }
    
    private final android.content.Intent createImageShareIntent(java.lang.String subject, java.lang.String text, android.net.Uri uri) {
        return null;
    }
    
    private final void displayOnCatchMessage(java.lang.Throwable caught, android.content.Context context) {
    }
    
    private final void displayShareErrorMessage(android.content.Context context) {
    }
    
    public final void showUnresolvableIntentMessage(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    private final java.io.File getClearShareFolder(android.content.Context context) {
        return null;
    }
    
    private final java.io.File getShareFolder(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String cleanFileName(java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getIntentChooser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence chooserTitle) {
        return null;
    }
    
    public final boolean canOpenUrlInApp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    private final boolean isSelfComponentName(android.content.ComponentName componentName) {
        return false;
    }
}