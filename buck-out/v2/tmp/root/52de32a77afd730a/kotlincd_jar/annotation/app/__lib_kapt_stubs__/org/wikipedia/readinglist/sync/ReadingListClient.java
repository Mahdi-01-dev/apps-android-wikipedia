package org.wikipedia.readinglist.sync;

import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import retrofit2.Response;
import java.io.IOException;
import java.time.Instant;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\u0013\u001a\u00020\u0010J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020\u0012J\u0010\u0010(\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010)\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&J\u0014\u0010*\u001a\u00020\u001b2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,H\u0002J\u000e\u0010-\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010/\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListClient;", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;)V", "allLists", "", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingList;", "getAllLists", "()Ljava/util/List;", "<set-?>", "Ljava/time/Instant;", "lastDateHeader", "getLastDateHeader", "()Ljava/time/Instant;", "addPageToList", "", "csrfToken", "", "listId", "entry", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "addPagesToList", "entries", "createList", "list", "deleteList", "", "deletePageFromList", "entryId", "getChangesSince", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists;", "date", "getListEntries", "getListsContaining", "isErrorType", "", "t", "", "errorType", "isServiceError", "isUnavailableError", "saveLastDateHeader", "response", "Lretrofit2/Response;", "setup", "tearDown", "updateList", "Companion", "app.lib"})
public final class ReadingListClient {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    @org.jetbrains.annotations.Nullable()
    private java.time.Instant lastDateHeader;
    private static final int MAX_CONTINUE_CYCLES = 256;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.sync.ReadingListClient.Companion Companion = null;
    
    public ReadingListClient(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.Instant getLastDateHeader() {
        return null;
    }
    
    /**
     * Sets up reading list syncing on the server, and returns true if the setup was successful,
     * or false if syncing is already set up.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final boolean setup(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken) throws java.lang.Throwable {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final void tearDown(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken) throws java.lang.Throwable {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> getAllLists() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.sync.SyncedReadingLists getChangesSince(@org.jetbrains.annotations.NotNull()
    java.lang.String date) throws java.lang.Throwable {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    @kotlin.Suppress(names = {"unused"})
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList> getListsContaining(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry entry) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> getListEntries(long listId) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final long createList(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList list) throws java.lang.Throwable {
        return 0L;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, long listId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList list) throws java.lang.Throwable {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final void deleteList(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, long listId) throws java.lang.Throwable {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final long addPageToList(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, long listId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry entry) throws java.lang.Throwable {
        return 0L;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> addPagesToList(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, long listId, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry> entries) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    public final void deletePageFromList(@org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, long listId, long entryId) throws java.lang.Throwable {
    }
    
    public final boolean isErrorType(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t, @org.jetbrains.annotations.NotNull()
    java.lang.String errorType) {
        return false;
    }
    
    public final boolean isServiceError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
        return false;
    }
    
    public final boolean isUnavailableError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
        return false;
    }
    
    private final void saveLastDateHeader(retrofit2.Response<?> response) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListClient$Companion;", "", "()V", "MAX_CONTINUE_CYCLES", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}