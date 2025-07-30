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

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2 = {"DATABASE_NAME", "", "DATABASE_VERSION", "", "app.lib"})
public final class AppDatabaseKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "wikipedia.db";
    public static final int DATABASE_VERSION = 31;
}