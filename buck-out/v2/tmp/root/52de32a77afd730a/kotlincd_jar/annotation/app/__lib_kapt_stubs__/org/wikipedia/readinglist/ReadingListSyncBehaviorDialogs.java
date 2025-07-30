package org.wikipedia.readinglist;

import android.app.Activity;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.databinding.DialogWithCheckboxBinding;
import org.wikipedia.events.ReadingListsEnableSyncStatusEvent;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListSyncBehaviorDialogs;", "", "()V", "PROMPT_LOGIN_TO_SYNC_DIALOG_SHOWING", "", "detectedRemoteTornDownDialog", "", "activity", "Landroid/app/Activity;", "promptEnableSyncDialog", "promptLogInToSyncDialog", "app.lib"})
public final class ReadingListSyncBehaviorDialogs {
    private static boolean PROMPT_LOGIN_TO_SYNC_DIALOG_SHOWING = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListSyncBehaviorDialogs INSTANCE = null;
    
    private ReadingListSyncBehaviorDialogs() {
        super();
    }
    
    public final void detectedRemoteTornDownDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void promptEnableSyncDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void promptLogInToSyncDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}