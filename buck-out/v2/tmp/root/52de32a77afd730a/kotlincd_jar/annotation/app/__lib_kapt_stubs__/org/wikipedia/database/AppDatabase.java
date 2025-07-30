package org.wikipedia.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.wikipedia.WikipediaApp;
import org.wikipedia.categories.db.Category;
import org.wikipedia.categories.db.CategoryDao;
import org.wikipedia.edit.db.EditSummary;
import org.wikipedia.edit.db.EditSummaryDao;
import org.wikipedia.games.db.DailyGameHistory;
import org.wikipedia.games.db.DailyGameHistoryDao;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.db.HistoryEntryDao;
import org.wikipedia.history.db.HistoryEntryWithImageDao;
import org.wikipedia.notifications.db.Notification;
import org.wikipedia.notifications.db.NotificationDao;
import org.wikipedia.offline.db.OfflineObject;
import org.wikipedia.offline.db.OfflineObjectDao;
import org.wikipedia.pageimages.db.PageImage;
import org.wikipedia.pageimages.db.PageImageDao;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.database.RecommendedPage;
import org.wikipedia.readinglist.db.ReadingListDao;
import org.wikipedia.readinglist.db.ReadingListPageDao;
import org.wikipedia.readinglist.db.RecommendedPageDao;
import org.wikipedia.search.db.RecentSearch;
import org.wikipedia.search.db.RecentSearchDao;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.talk.db.TalkPageSeen;
import org.wikipedia.talk.db.TalkPageSeenDao;
import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.talk.db.TalkTemplateDao;
import java.time.LocalDate;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "categoryDao", "Lorg/wikipedia/categories/db/CategoryDao;", "dailyGameHistoryDao", "Lorg/wikipedia/games/db/DailyGameHistoryDao;", "editSummaryDao", "Lorg/wikipedia/edit/db/EditSummaryDao;", "historyEntryDao", "Lorg/wikipedia/history/db/HistoryEntryDao;", "historyEntryWithImageDao", "Lorg/wikipedia/history/db/HistoryEntryWithImageDao;", "notificationDao", "Lorg/wikipedia/notifications/db/NotificationDao;", "offlineObjectDao", "Lorg/wikipedia/offline/db/OfflineObjectDao;", "pageImagesDao", "Lorg/wikipedia/pageimages/db/PageImageDao;", "readingListDao", "Lorg/wikipedia/readinglist/db/ReadingListDao;", "readingListPageDao", "Lorg/wikipedia/readinglist/db/ReadingListPageDao;", "recentSearchDao", "Lorg/wikipedia/search/db/RecentSearchDao;", "recommendedPageDao", "Lorg/wikipedia/readinglist/db/RecommendedPageDao;", "talkPageSeenDao", "Lorg/wikipedia/talk/db/TalkPageSeenDao;", "talkTemplateDao", "Lorg/wikipedia/talk/db/TalkTemplateDao;", "Companion", "app.lib"})
@androidx.room.Database(entities = {org.wikipedia.history.HistoryEntry.class, org.wikipedia.pageimages.db.PageImage.class, org.wikipedia.search.db.RecentSearch.class, org.wikipedia.talk.db.TalkPageSeen.class, org.wikipedia.edit.db.EditSummary.class, org.wikipedia.offline.db.OfflineObject.class, org.wikipedia.readinglist.database.ReadingList.class, org.wikipedia.readinglist.database.ReadingListPage.class, org.wikipedia.notifications.db.Notification.class, org.wikipedia.talk.db.TalkTemplate.class, org.wikipedia.categories.db.Category.class, org.wikipedia.games.db.DailyGameHistory.class, org.wikipedia.readinglist.database.RecommendedPage.class}, version = 31)
@androidx.room.TypeConverters(value = {org.wikipedia.database.DateTypeConverter.class, org.wikipedia.database.WikiSiteTypeConverter.class, org.wikipedia.database.NamespaceTypeConverter.class, org.wikipedia.database.NotificationTypeConverters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_19_20 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_20_21 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_21_22 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_22_23 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_23_24 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_24_25 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_25_26 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_26_27 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_27_28 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_26_28 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_28_29 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_29_30 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_30_31 = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy<?> instance$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.history.db.HistoryEntryDao historyEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.history.db.HistoryEntryWithImageDao historyEntryWithImageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.pageimages.db.PageImageDao pageImagesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.search.db.RecentSearchDao recentSearchDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.talk.db.TalkPageSeenDao talkPageSeenDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.edit.db.EditSummaryDao editSummaryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.offline.db.OfflineObjectDao offlineObjectDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.db.ReadingListDao readingListDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.db.ReadingListPageDao readingListPageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.notifications.db.NotificationDao notificationDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.talk.db.TalkTemplateDao talkTemplateDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.categories.db.CategoryDao categoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.games.db.DailyGameHistoryDao dailyGameHistoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.db.RecommendedPageDao recommendedPageDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/database/AppDatabase$Companion;", "", "()V", "MIGRATION_19_20", "Landroidx/room/migration/Migration;", "getMIGRATION_19_20", "()Landroidx/room/migration/Migration;", "MIGRATION_20_21", "getMIGRATION_20_21", "MIGRATION_21_22", "getMIGRATION_21_22", "MIGRATION_22_23", "getMIGRATION_22_23", "MIGRATION_23_24", "getMIGRATION_23_24", "MIGRATION_24_25", "getMIGRATION_24_25", "MIGRATION_25_26", "getMIGRATION_25_26", "MIGRATION_26_27", "getMIGRATION_26_27", "MIGRATION_26_28", "getMIGRATION_26_28", "MIGRATION_27_28", "getMIGRATION_27_28", "MIGRATION_28_29", "getMIGRATION_28_29", "MIGRATION_29_30", "getMIGRATION_29_30", "MIGRATION_30_31", "getMIGRATION_30_31", "instance", "Lorg/wikipedia/database/AppDatabase;", "getInstance", "()Lorg/wikipedia/database/AppDatabase;", "instance$delegate", "Lkotlin/Lazy;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_19_20() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_20_21() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_21_22() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_22_23() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_23_24() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_24_25() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_25_26() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_26_27() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_27_28() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_26_28() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_28_29() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_29_30() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_30_31() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.database.AppDatabase getInstance() {
            return null;
        }
    }
}