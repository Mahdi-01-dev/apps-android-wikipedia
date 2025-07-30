package org.wikipedia.notifications;

import android.content.Context;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationChannelGroupCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import org.wikipedia.R;
import org.wikipedia.model.EnumCode;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"}, d2 = {"GROUP_OTHER", "", "GROUP_WIKIPEDIA_NOTIFICATIONS", "app.lib"})
public final class NotificationCategoryKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String GROUP_WIKIPEDIA_NOTIFICATIONS = "WIKIPEDIA_NOTIFICATIONS";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String GROUP_OTHER = "WIKIPEDIA_NOTIFICATIONS_OTHER";
}