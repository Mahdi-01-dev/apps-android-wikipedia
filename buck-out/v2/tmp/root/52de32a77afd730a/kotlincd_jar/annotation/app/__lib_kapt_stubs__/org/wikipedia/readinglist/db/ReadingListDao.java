package org.wikipedia.readinglist.db;

import androidx.room.*;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0015J \u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\'J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0003H\'J\b\u0010\"\u001a\u00020\tH\'J\u0018\u0010#\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010$\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\'\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/readinglist/db/ReadingListDao;", "", "createList", "Lorg/wikipedia/readinglist/database/ReadingList;", "title", "", "description", "createNewList", "deleteList", "", "list", "queueForSync", "", "deleteReadingList", "getAllLists", "", "getAllListsWithUnsyncedPages", "getDefaultList", "getListById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "populatePages", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListsByIds", "readingListIds", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListsFromPageOccurrences", "pages", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListsWithoutContents", "insertReadingList", "markAllListsUnsynced", "updateList", "updateLists", "lists", "updateReadingList", "app.lib"})
@androidx.room.Dao()
public abstract interface ReadingListDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insertReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    @androidx.room.Update(onConflict = 1)
    public abstract void updateReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    @androidx.room.Delete()
    public abstract void deleteReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingList")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getListsWithoutContents();
    
    @androidx.room.Query(value = "SELECT * FROM ReadingList WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingList> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM ReadingList WHERE id IN (:readingListIds)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListsByIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> readingListIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.ReadingList>> $completion);
    
    @androidx.room.Query(value = "UPDATE ReadingList SET remoteId = -1")
    public abstract void markAllListsUnsynced();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllLists();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListById(long id, boolean populatePages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingList> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllListsWithUnsyncedPages();
    
    public abstract void updateList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync);
    
    public abstract void updateLists(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, boolean queueForSync);
    
    public abstract void deleteList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListsFromPageOccurrences(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.ReadingList>> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.database.ReadingList createList(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.database.ReadingList getDefaultList();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllLists(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getListById(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, long id, boolean populatePages, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingList> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllListsWithUnsyncedPages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this) {
            return null;
        }
        
        public static void updateList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync) {
        }
        
        public static void updateLists(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, boolean queueForSync) {
        }
        
        public static void deleteList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getListsFromPageOccurrences(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<org.wikipedia.readinglist.database.ReadingList>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.readinglist.database.ReadingList createList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String description) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.readinglist.database.ReadingList getDefaultList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this) {
            return null;
        }
        
        private static org.wikipedia.readinglist.database.ReadingList createNewList(org.wikipedia.readinglist.db.ReadingListDao $this, java.lang.String title, java.lang.String description) {
            return null;
        }
    }
}