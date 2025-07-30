package org.wikipedia.readinglist;

import android.Manifest;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.core.content.ContextCompat;
import kotlinx.serialization.Serializable;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.notifications.NotificationCategory;
import org.wikipedia.notifications.NotificationPresenter;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.FileUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003#$%B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsExportImportHelper;", "Lorg/wikipedia/activity/BaseActivity$Callback;", "()V", "lists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "getLists", "()Ljava/util/List;", "setLists", "(Ljava/util/List;)V", "addTitlesToList", "", "exportedList", "Lorg/wikipedia/readinglist/ReadingListsExportImportHelper$ExportableReadingList;", "list", "exportLists", "activity", "Lorg/wikipedia/activity/BaseActivity;", "readingLists", "extractListDataToExport", "Landroidx/appcompat/app/AppCompatActivity;", "getNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "numOfLists", "", "importLists", "jsonString", "", "onPermissionResult", "isGranted", "", "ExportableContents", "ExportablePage", "ExportableReadingList", "app.lib"})
public final class ReadingListsExportImportHelper implements org.wikipedia.activity.BaseActivity.Callback {
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<org.wikipedia.readinglist.database.ReadingList> lists;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListsExportImportHelper INSTANCE = null;
    
    private ReadingListsExportImportHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.readinglist.database.ReadingList> getLists() {
        return null;
    }
    
    public final void setLists(@org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> p0) {
    }
    
    public final void exportLists(@org.jetbrains.annotations.NotNull()
    org.wikipedia.activity.BaseActivity activity, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists) {
    }
    
    private final void extractListDataToExport(androidx.appcompat.app.AppCompatActivity activity, java.util.List<org.wikipedia.readinglist.database.ReadingList> exportLists) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder getNotificationBuilder(android.content.Context context, android.content.Intent intent, int numOfLists) {
        return null;
    }
    
    public final void importLists(@org.jetbrains.annotations.NotNull()
    org.wikipedia.activity.BaseActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String jsonString) {
    }
    
    private final void addTitlesToList(org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportableReadingList exportedList, org.wikipedia.readinglist.database.ReadingList list) {
    }
    
    @java.lang.Override()
    public void onPermissionResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.activity.BaseActivity activity, boolean isGranted) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsExportImportHelper$ExportableContents;", "", "readingListsV1", "", "Lorg/wikipedia/readinglist/ReadingListsExportImportHelper$ExportableReadingList;", "(Ljava/util/List;)V", "getReadingListsV1", "()Ljava/util/List;", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    static final class ExportableContents {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportableReadingList> readingListsV1 = null;
        
        public ExportableContents(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportableReadingList> readingListsV1) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportableReadingList> getReadingListsV1() {
            return null;
        }
        
        public ExportableContents() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsExportImportHelper$ExportablePage;", "", "title", "", "lang", "ns", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getLang", "()Ljava/lang/String;", "getNs", "()I", "getTitle", "app.lib"})
    static final class ExportablePage {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lang = null;
        private final int ns = 0;
        
        public ExportablePage(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, int ns) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLang() {
            return null;
        }
        
        public final int getNs() {
            return 0;
        }
        
        public ExportablePage() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsExportImportHelper$ExportableReadingList;", "", "name", "", "description", "pages", "", "Lorg/wikipedia/readinglist/ReadingListsExportImportHelper$ExportablePage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getName", "getPages", "()Ljava/util/List;", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    static final class ExportableReadingList {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportablePage> pages = null;
        
        public ExportableReadingList(@org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportablePage> pages) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.readinglist.ReadingListsExportImportHelper.ExportablePage> getPages() {
            return null;
        }
        
        public ExportableReadingList() {
            super();
        }
    }
}