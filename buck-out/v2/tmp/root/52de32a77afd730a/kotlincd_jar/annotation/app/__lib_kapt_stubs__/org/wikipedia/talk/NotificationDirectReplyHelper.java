package org.wikipedia.talk;

import android.Manifest;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J6\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ6\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/talk/NotificationDirectReplyHelper;", "", "()V", "DIRECT_REPLY_EDIT_COMMENT", "", "cancelNotification", "", "context", "Landroid/content/Context;", "notificationId", "", "fallBackToTalkPage", "title", "Lorg/wikipedia/page/PageTitle;", "handleReply", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "replyText", "replyTo", "waitForUpdatedRevision", "newRevision", "", "(Landroid/content/Context;Lorg/wikipedia/dataclient/WikiSite;Lorg/wikipedia/page/PageTitle;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
public final class NotificationDirectReplyHelper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DIRECT_REPLY_EDIT_COMMENT = "#directreply-1.0";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.NotificationDirectReplyHelper INSTANCE = null;
    
    private NotificationDirectReplyHelper() {
        super();
    }
    
    public final void handleReply(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String replyText, @org.jetbrains.annotations.NotNull()
    java.lang.String replyTo, int notificationId) {
    }
    
    private final java.lang.Object waitForUpdatedRevision(android.content.Context context, org.wikipedia.dataclient.WikiSite wiki, org.wikipedia.page.PageTitle title, long newRevision, int notificationId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void fallBackToTalkPage(android.content.Context context, org.wikipedia.page.PageTitle title) {
    }
    
    private final void cancelNotification(android.content.Context context, int notificationId) {
    }
}