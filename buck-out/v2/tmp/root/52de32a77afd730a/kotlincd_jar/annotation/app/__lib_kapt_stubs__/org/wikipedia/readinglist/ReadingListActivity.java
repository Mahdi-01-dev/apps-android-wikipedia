package org.wikipedia.readinglist;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper;
import org.wikipedia.main.MainActivity;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.recommended.RecommendedReadingListNotificationManager;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/readinglist/ReadingListFragment;", "Lorg/wikipedia/activity/BaseActivity$Callback;", "()V", "readingListMode", "Lorg/wikipedia/readinglist/ReadingListMode;", "createFragment", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionResult", "activity", "Lorg/wikipedia/activity/BaseActivity;", "isGranted", "", "updateNavigationBarColor", "updateStatusBarColor", "inActionMode", "Companion", "app.lib"})
public final class ReadingListActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.readinglist.ReadingListFragment> implements org.wikipedia.activity.BaseActivity.Callback {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.readinglist.ReadingListMode readingListMode = org.wikipedia.readinglist.ReadingListMode.DEFAULT;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_READING_LIST_TITLE = "readingListTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_READING_LIST_ID = "readingListId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_READING_LIST_MODE = "readingListMode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE = "invokeSource";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListActivity.Companion Companion = null;
    
    public ReadingListActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.readinglist.ReadingListFragment createFragment() {
        return null;
    }
    
    public final void updateStatusBarColor(boolean inActionMode) {
    }
    
    public final void updateNavigationBarColor() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onPermissionResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.activity.BaseActivity activity, boolean isGranted) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListActivity$Companion;", "", "()V", "EXTRA_READING_LIST_ID", "", "EXTRA_READING_LIST_MODE", "EXTRA_READING_LIST_TITLE", "EXTRA_SOURCE", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "readingListMode", "Lorg/wikipedia/readinglist/ReadingListMode;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.ReadingListMode readingListMode, @org.jetbrains.annotations.Nullable()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}