package org.wikipedia.games.onthisday;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.notifications.NotificationPollBroadcastReceiver;
import org.wikipedia.notifications.NotificationPresenter;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.FeedbackUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameNotificationState;", "", "(Ljava/lang/String;I)V", "getIcon", "", "NO_INTERACTED", "ENABLED", "DISABLED", "app.lib"})
public enum OnThisDayGameNotificationState {
    /*public static final*/ NO_INTERACTED /* = new NO_INTERACTED() */,
    /*public static final*/ ENABLED /* = new ENABLED() */,
    /*public static final*/ DISABLED /* = new DISABLED() */;
    
    OnThisDayGameNotificationState() {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.games.onthisday.OnThisDayGameNotificationState> getEntries() {
        return null;
    }
}