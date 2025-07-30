package org.wikipedia.analytics.eventplatform;

import android.content.Context;
import org.wikipedia.readinglist.database.ReadingList;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/ReadingListsAnalyticsHelper;", "", "()V", "logExportLists", "", "context", "Landroid/content/Context;", "listCount", "", "logImportCancelled", "logImportFinished", "logImportStart", "logListShown", "logListsShown", "listsCount", "logReceiveCancel", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "logReceiveFinish", "logReceivePreview", "logReceiveStart", "logShareList", "logSurveyShown", "app.lib"})
public final class ReadingListsAnalyticsHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.ReadingListsAnalyticsHelper INSTANCE = null;
    
    private ReadingListsAnalyticsHelper() {
        super();
    }
    
    public final void logListsShown(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int listsCount) {
    }
    
    public final void logListShown(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int listCount) {
    }
    
    public final void logShareList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list) {
    }
    
    public final void logReceiveStart(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logReceivePreview(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list) {
    }
    
    public final void logReceiveCancel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList list) {
    }
    
    public final void logReceiveFinish(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.database.ReadingList list) {
    }
    
    public final void logSurveyShown(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logExportLists(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int listCount) {
    }
    
    public final void logImportStart(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logImportCancelled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void logImportFinished(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int listCount) {
    }
}