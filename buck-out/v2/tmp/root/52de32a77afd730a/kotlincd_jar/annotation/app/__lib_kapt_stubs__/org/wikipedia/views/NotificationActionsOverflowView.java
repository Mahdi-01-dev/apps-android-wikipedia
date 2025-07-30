package org.wikipedia.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.core.widget.TextViewCompat;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewNotificationActionsOverflowBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.notifications.NotificationLinkHandler;
import org.wikipedia.notifications.NotificationListItemContainer;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.page.PageTitle;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J6\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0003\u0010\u0019\u001a\u00020\u001a2\b\b\u0003\u0010\u001b\u001a\u00020\u001a2\b\b\u0003\u0010\u001c\u001a\u00020\u001aH\u0002J\u001e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/views/NotificationActionsOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionClickListener", "Landroid/view/View$OnClickListener;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/NotificationActionsOverflowView$Callback;", "container", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "linkHandler", "Lorg/wikipedia/notifications/NotificationLinkHandler;", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismiss", "", "setUpViewForLink", "textView", "Landroid/widget/TextView;", "link", "Lorg/wikipedia/notifications/db/Notification$Link;", "customIcon", "", "customIconColor", "customTextColor", "show", "anchorView", "Landroid/view/View;", "Callback", "app.lib"})
public final class NotificationActionsOverflowView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    private org.wikipedia.notifications.NotificationListItemContainer container;
    private org.wikipedia.notifications.NotificationLinkHandler linkHandler;
    private org.wikipedia.views.NotificationActionsOverflowView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow popupWindowHost;
    @org.jetbrains.annotations.NotNull()
    private android.view.View.OnClickListener actionClickListener;
    
    public NotificationActionsOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationListItemContainer container, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.NotificationActionsOverflowView.Callback callback) {
    }
    
    public final void dismiss() {
    }
    
    private final void setUpViewForLink(android.widget.TextView textView, org.wikipedia.notifications.db.Notification.Link link, @androidx.annotation.DrawableRes()
    int customIcon, @androidx.annotation.ColorInt()
    int customIconColor, @androidx.annotation.ColorInt()
    int customTextColor) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/NotificationActionsOverflowView$Callback;", "", "markAsReadClick", "", "container", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "markRead", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void markAsReadClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationListItemContainer container, boolean markRead);
    }
}