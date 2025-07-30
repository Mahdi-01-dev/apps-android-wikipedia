package org.wikipedia.readinglist.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.ArticleSavedOrDeletedEvent;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.savedpages.SavedPageSyncService;
import org.wikipedia.search.SearchResult;
import org.wikipedia.search.SearchResults;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b!\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0017J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0017J&\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0017J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0019\u001a\u00020\u0012H\'J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\'J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\'J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u000e2\u0006\u0010)\u001a\u00020\u0016H\'J8\u0010*\u001a\u0004\u0018\u00010\u000e2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0002\u00101J:\u0010*\u001a\u0004\u0018\u00010\u000e2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0016H\'J\u001a\u00103\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u00102\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0016H\'J6\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0016H\'J\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u00107\u001a\u000208H\u00a7@\u00a2\u0006\u0002\u00109J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\tH\'J\u000e\u0010<\u001a\u000208H\u00a7@\u00a2\u0006\u0002\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u000e2\u0006\u0010,\u001a\u00020\u0012H\'J\u0018\u0010?\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010@\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\'J\b\u0010A\u001a\u00020\u0003H\'J \u0010B\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0016J(\u0010D\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0017J&\u0010E\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0017J \u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J,\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0017J\u0018\u0010J\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010K\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u0003H\u0016J\b\u0010M\u001a\u00020\u0003H\u0016J*\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u000e2\b\u0010P\u001a\u0004\u0018\u00010\u00122\b\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0096@\u00a2\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0017J\u0010\u0010T\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\'J \u0010U\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\tH\'J,\u0010X\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00122\b\u0010Q\u001a\u0004\u0018\u00010\u00122\b\u0010P\u001a\u0004\u0018\u00010\u0012H\'\u00a8\u0006Y"}, d2 = {"Lorg/wikipedia/readinglist/db/ReadingListPageDao;", "", "addPageToList", "", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "title", "Lorg/wikipedia/page/PageTitle;", "queueForSync", "", "addPageToLists", "lists", "", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "addPagesToList", "pages", "addPagesToListIfNotExist", "", "titles", "deletePagesByStatus", "status", "", "deleteReadingListPage", "findPageBySearchTerm", "term", "findPageForSearchQueryInAnyList", "Lorg/wikipedia/search/SearchResults;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "searchQuery", "findPageInAnyList", "(Lorg/wikipedia/page/PageTitle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPageOccurrences", "getAllPages", "getAllPagesToBeDeleted", "getAllPagesToBeForcedSave", "getAllPagesToBeSaved", "getAllPagesToBeSynced", "getAllPagesToBeUnsaved", "getPageById", "id", "getPageByParams", "wiki", "lang", "ns", "Lorg/wikipedia/page/Namespace;", "apiTitle", "excludedStatus", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Lorg/wikipedia/page/Namespace;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listId", "getPageByTitle", "getPagesByListId", "getPagesByParams", "getPagesByRandom", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPagesByStatus", "offline", "getPagesCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomPage", "insertPageIntoDb", "insertReadingListPage", "markAllPagesUnsynced", "markPageForOffline", "forcedSave", "markPagesForDeletion", "markPagesForOffline", "movePageToList", "sourceList", "destList", "movePagesToListAndDeleteSourcePages", "pageExistsInList", "populateListPages", "purgeDeletedPages", "resetUnsavedPageStatus", "updateMetadataByTitle", "pageProto", "description", "thumbUrl", "(Lorg/wikipedia/readinglist/database/ReadingListPage;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePages", "updateReadingListPage", "updateStatus", "oldStatus", "newStatus", "updateThumbAndDescriptionByName", "app.lib"})
@androidx.room.Dao()
public abstract interface ReadingListPageDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insertReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page);
    
    @androidx.room.Update(onConflict = 1)
    public abstract void updateReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page);
    
    @androidx.room.Delete()
    public abstract void deleteReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPages();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM ReadingListPage")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPagesCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageById(long id);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE status = :status AND offline = :offline")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByStatus(long status, boolean offline);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE status = :status")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByStatus(long status);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE wiki = :wiki AND lang = :lang AND namespace = :ns AND apiTitle = :apiTitle AND listId = :listId AND status != :excludedStatus")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageByParams(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace ns, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long listId, long excludedStatus);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE wiki = :wiki AND lang = :lang AND namespace = :ns AND apiTitle = :apiTitle AND status != :excludedStatus")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPageByParams(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace ns, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long excludedStatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingListPage> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE wiki = :wiki AND lang = :lang AND namespace = :ns AND apiTitle = :apiTitle AND status != :excludedStatus")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByParams(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace ns, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long excludedStatus);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage ORDER BY RANDOM() DESC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPagesByRandom(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.ReadingListPage>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE listId = :listId AND status != :excludedStatus")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByListId(long listId, long excludedStatus);
    
    @androidx.room.Query(value = "UPDATE ReadingListPage SET thumbUrl = :thumbUrl, description = :description WHERE lang = :lang AND apiTitle = :apiTitle")
    public abstract void updateThumbAndDescriptionByName(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description);
    
    @androidx.room.Query(value = "UPDATE ReadingListPage SET status = :newStatus WHERE status = :oldStatus AND offline = :offline")
    public abstract void updateStatus(long oldStatus, long newStatus, boolean offline);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE lang = :lang ORDER BY RANDOM() LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingListPage getRandomPage(@org.jetbrains.annotations.NotNull()
    java.lang.String lang);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE UPPER(displayTitle) LIKE UPPER(:term) ESCAPE \'\\\'")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> findPageBySearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term);
    
    @androidx.room.Query(value = "DELETE FROM ReadingListPage WHERE status = :status")
    public abstract void deletePagesByStatus(long status);
    
    @androidx.room.Query(value = "UPDATE ReadingListPage SET remoteId = -1")
    public abstract void markAllPagesUnsynced();
    
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE remoteId < 1")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeSynced();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeSaved();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeForcedSave();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeUnsaved();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeDeleted();
    
    public abstract void populateListPages(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    public abstract void addPagesToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync);
    
    @androidx.room.Transaction()
    public abstract void addPagesToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> addPagesToListIfNotExist(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> titles);
    
    @androidx.room.Transaction()
    public abstract void updatePages(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateMetadataByTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage pageProto, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findPageInAnyList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingListPage> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.search.SearchResults findPageForSearchQueryInAnyList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    public abstract boolean pageExistsInList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    public abstract void resetUnsavedPageStatus();
    
    @androidx.room.Transaction()
    public abstract void markPagesForDeletion(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync);
    
    public abstract void markPageForOffline(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page, boolean offline, boolean forcedSave);
    
    @androidx.room.Transaction()
    public abstract void markPagesForOffline(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean offline, boolean forcedSave);
    
    public abstract void purgeDeletedPages();
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> movePagesToListAndDeleteSourcePages(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList sourceList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList destList, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> titles);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageByTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    public abstract void addPageToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean queueForSync);
    
    @androidx.room.Transaction()
    public abstract void addPageToLists(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page, boolean queueForSync);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPageOccurrences(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeSaved(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeForcedSave(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeUnsaved(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeDeleted(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        public static void populateListPages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list) {
        }
        
        public static void addPagesToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync) {
        }
        
        @androidx.room.Transaction()
        public static void addPagesToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
        }
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<java.lang.String> addPagesToListIfNotExist(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> titles) {
            return null;
        }
        
        @androidx.room.Transaction()
        public static void updatePages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object updateMetadataByTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage pageProto, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String thumbUrl, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object findPageInAnyList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingListPage> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.search.SearchResults findPageForSearchQueryInAnyList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            return null;
        }
        
        public static boolean pageExistsInList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return false;
        }
        
        public static void resetUnsavedPageStatus(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
        }
        
        @androidx.room.Transaction()
        public static void markPagesForDeletion(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync) {
        }
        
        public static void markPageForOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page, boolean offline, boolean forcedSave) {
        }
        
        @androidx.room.Transaction()
        public static void markPagesForOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean offline, boolean forcedSave) {
        }
        
        public static void purgeDeletedPages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
        }
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<java.lang.String> movePagesToListAndDeleteSourcePages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList sourceList, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList destList, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> titles) {
            return null;
        }
        
        private static void movePageToList(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList sourceList, org.wikipedia.readinglist.database.ReadingList destList, org.wikipedia.page.PageTitle title) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public static org.wikipedia.readinglist.database.ReadingListPage getPageByTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        public static void addPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, boolean queueForSync) {
        }
        
        @androidx.room.Transaction()
        public static void addPageToLists(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page, boolean queueForSync) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPageOccurrences(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        private static void addPageToList(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList list, org.wikipedia.page.PageTitle title) {
        }
        
        private static void insertPageIntoDb(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList list, org.wikipedia.readinglist.database.ReadingListPage page) {
        }
    }
}