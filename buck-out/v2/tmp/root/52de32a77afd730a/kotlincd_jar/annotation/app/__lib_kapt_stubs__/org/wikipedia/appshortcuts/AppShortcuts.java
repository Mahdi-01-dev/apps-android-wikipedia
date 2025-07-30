package org.wikipedia.appshortcuts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.main.MainActivity;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/appshortcuts/AppShortcuts;", "", "()V", "Companion", "app.lib"})
public final class AppShortcuts {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_APP_SHORTCUT = "ACTION_APP_SHORTCUT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_SHORTCUT_ID = "APP_SHORTCUT_ID";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_SHORTCUT_ID_CONTINUE_READING = "shortcutContinueReading";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_SHORTCUT_ID_RANDOM = "shortcutRandom";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_SHORTCUT_ID_SEARCH = "shortcutSearch";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_SHORTCUT_ID_PLACES = "shortcutPlaces";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.appshortcuts.AppShortcuts.Companion Companion = null;
    
    public AppShortcuts() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/appshortcuts/AppShortcuts$Companion;", "", "()V", "ACTION_APP_SHORTCUT", "", "APP_SHORTCUT_ID", "APP_SHORTCUT_ID_CONTINUE_READING", "APP_SHORTCUT_ID_PLACES", "APP_SHORTCUT_ID_RANDOM", "APP_SHORTCUT_ID_SEARCH", "continueReadingShortcut", "Landroidx/core/content/pm/ShortcutInfoCompat;", "app", "Landroid/content/Context;", "placesShortcut", "randomShortcut", "searchShortcut", "setShortcuts", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setShortcuts(@org.jetbrains.annotations.NotNull()
        android.content.Context app) {
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat searchShortcut(android.content.Context app) {
            return null;
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat randomShortcut(android.content.Context app) {
            return null;
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat continueReadingShortcut(android.content.Context app) {
            return null;
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat placesShortcut(android.content.Context app) {
            return null;
        }
    }
}