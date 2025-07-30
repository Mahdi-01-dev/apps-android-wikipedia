package org.wikipedia.offline.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.log.L;
import java.io.File;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0014\u001a\u00020\u0010H\'J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0005H\'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0019\u001a\u00020\u0005H\'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/offline/db/OfflineObjectDao;", "", "addObject", "", "url", "", "lang", "path", "pageTitle", "deleteAll", "deleteFilesForObject", "obj", "Lorg/wikipedia/offline/db/OfflineObject;", "deleteObjectsForPageId", "ids", "", "", "deleteOfflineObject", "findObject", "getFromUsedById", "id", "getOfflineObject", "getTotalBytesForPageId", "insertOfflineObject", "searchForOfflineObject", "urlFragment", "searchForOfflineObjects", "updateOfflineObject", "app.lib"})
@androidx.room.Dao()
public abstract interface OfflineObjectDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertOfflineObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @androidx.room.Update(onConflict = 1)
    public abstract void updateOfflineObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url = :url AND lang = :lang LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.offline.db.OfflineObject getOfflineObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String lang);
    
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url = :url LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.offline.db.OfflineObject getOfflineObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url LIKE \'%/\' || :urlFragment || \'/%\' LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.offline.db.OfflineObject searchForOfflineObject(@org.jetbrains.annotations.NotNull()
    java.lang.String urlFragment);
    
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url LIKE \'%\' || :urlFragment || \'%\'")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.offline.db.OfflineObject> searchForOfflineObjects(@org.jetbrains.annotations.NotNull()
    java.lang.String urlFragment);
    
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE usedByStr LIKE \'%|\' || :id || \'|%\'")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.offline.db.OfflineObject> getFromUsedById(long id);
    
    @androidx.room.Delete()
    public abstract void deleteOfflineObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @androidx.room.Query(value = "DELETE FROM OfflineObject")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.offline.db.OfflineObject findObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String lang);
    
    public abstract void addObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String pageTitle);
    
    public abstract void deleteObjectsForPageId(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids);
    
    public abstract long getTotalBytesForPageId(long id);
    
    public abstract void deleteFilesForObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static org.wikipedia.offline.db.OfflineObject findObject(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String lang) {
            return null;
        }
        
        public static void addObject(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        java.lang.String pageTitle) {
        }
        
        public static void deleteObjectsForPageId(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> ids) {
        }
        
        public static long getTotalBytesForPageId(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, long id) {
            return 0L;
        }
        
        public static void deleteFilesForObject(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObject obj) {
        }
    }
}