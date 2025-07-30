package org.wikipedia.readinglist;

import android.util.Base64;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.Namespace;
import org.wikipedia.readinglist.ReadingListsShareHelper.ExportedReadingListPage;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsReceiveHelper;", "", "()V", "getExportedReadingLists", "Lorg/wikipedia/readinglist/ReadingListsShareHelper$ExportedReadingList;", "json", "", "encoded", "", "receiveReadingLists", "Lorg/wikipedia/readinglist/database/ReadingList;", "emptyTitle", "emptyDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
public final class ReadingListsReceiveHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListsReceiveHelper INSTANCE = null;
    
    private ReadingListsReceiveHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object receiveReadingLists(@org.jetbrains.annotations.NotNull()
    java.lang.String emptyTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String emptyDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String json, boolean encoded, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.readinglist.database.ReadingList> $completion) {
        return null;
    }
    
    private final org.wikipedia.readinglist.ReadingListsShareHelper.ExportedReadingList getExportedReadingLists(java.lang.String json, boolean encoded) {
        return null;
    }
}