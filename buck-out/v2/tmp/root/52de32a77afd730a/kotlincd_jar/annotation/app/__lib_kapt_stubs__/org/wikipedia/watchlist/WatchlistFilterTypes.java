package org.wikipedia.watchlist;

import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.model.EnumCode;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\"B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFilterTypes;", "", "Lorg/wikipedia/model/EnumCode;", "id", "", "title", "", "value", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "()I", "getValue", "code", "PAGE_EDITS", "PAGE_CREATIONS", "CATEGORY_CHANGES", "WIKIDATA_EDITS", "LOGGED_ACTIONS", "ALL_EDITS", "MINOR_EDITS", "NON_MINOR_EDITS", "ALL_EDITORS", "BOT", "HUMAN", "ALL_CHANGES", "UNSEEN_CHANGES", "SEEN_CHANGES", "LATEST_REVISION", "NOT_LATEST_REVISION", "ALL_USERS", "UNREGISTERED", "REGISTERED", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public enum WatchlistFilterTypes implements org.wikipedia.model.EnumCode {
    /*public static final*/ PAGE_EDITS /* = new PAGE_EDITS(null, 0, null) */,
    /*public static final*/ PAGE_CREATIONS /* = new PAGE_CREATIONS(null, 0, null) */,
    /*public static final*/ CATEGORY_CHANGES /* = new CATEGORY_CHANGES(null, 0, null) */,
    /*public static final*/ WIKIDATA_EDITS /* = new WIKIDATA_EDITS(null, 0, null) */,
    /*public static final*/ LOGGED_ACTIONS /* = new LOGGED_ACTIONS(null, 0, null) */,
    /*public static final*/ ALL_EDITS /* = new ALL_EDITS(null, 0, null) */,
    /*public static final*/ MINOR_EDITS /* = new MINOR_EDITS(null, 0, null) */,
    /*public static final*/ NON_MINOR_EDITS /* = new NON_MINOR_EDITS(null, 0, null) */,
    /*public static final*/ ALL_EDITORS /* = new ALL_EDITORS(null, 0, null) */,
    /*public static final*/ BOT /* = new BOT(null, 0, null) */,
    /*public static final*/ HUMAN /* = new HUMAN(null, 0, null) */,
    /*public static final*/ ALL_CHANGES /* = new ALL_CHANGES(null, 0, null) */,
    /*public static final*/ UNSEEN_CHANGES /* = new UNSEEN_CHANGES(null, 0, null) */,
    /*public static final*/ SEEN_CHANGES /* = new SEEN_CHANGES(null, 0, null) */,
    /*public static final*/ LATEST_REVISION /* = new LATEST_REVISION(null, 0, null) */,
    /*public static final*/ NOT_LATEST_REVISION /* = new NOT_LATEST_REVISION(null, 0, null) */,
    /*public static final*/ ALL_USERS /* = new ALL_USERS(null, 0, null) */,
    /*public static final*/ UNREGISTERED /* = new UNREGISTERED(null, 0, null) */,
    /*public static final*/ REGISTERED /* = new REGISTERED(null, 0, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final int title = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> TYPE_OF_CHANGES_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> MINOR_EDITS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> BOT_EDITS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> UNSEEN_CHANGES_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> LATEST_REVISIONS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> USER_STATUS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.wikipedia.watchlist.WatchlistFilterTypes> DEFAULT_FILTER_TYPE_OF_CHANGES = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.wikipedia.watchlist.WatchlistFilterTypes> DEFAULT_FILTER_OTHERS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.wikipedia.watchlist.WatchlistFilterTypes> DEFAULT_FILTER_TYPE_SET = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.watchlist.WatchlistFilterTypes.Companion Companion = null;
    
    WatchlistFilterTypes(java.lang.String id, @androidx.annotation.StringRes()
    int title, java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.watchlist.WatchlistFilterTypes> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFilterTypes$Companion;", "", "()V", "BOT_EDITS_GROUP", "", "Lorg/wikipedia/watchlist/WatchlistFilterTypes;", "getBOT_EDITS_GROUP", "()Ljava/util/List;", "DEFAULT_FILTER_OTHERS", "", "getDEFAULT_FILTER_OTHERS", "()Ljava/util/Set;", "DEFAULT_FILTER_TYPE_OF_CHANGES", "getDEFAULT_FILTER_TYPE_OF_CHANGES", "DEFAULT_FILTER_TYPE_SET", "getDEFAULT_FILTER_TYPE_SET", "LATEST_REVISIONS_GROUP", "getLATEST_REVISIONS_GROUP", "MINOR_EDITS_GROUP", "getMINOR_EDITS_GROUP", "TYPE_OF_CHANGES_GROUP", "getTYPE_OF_CHANGES_GROUP", "UNSEEN_CHANGES_GROUP", "getUNSEEN_CHANGES_GROUP", "USER_STATUS_GROUP", "getUSER_STATUS_GROUP", "find", "id", "", "findGroup", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> getTYPE_OF_CHANGES_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> getMINOR_EDITS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> getBOT_EDITS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> getUNSEEN_CHANGES_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> getLATEST_REVISIONS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> getUSER_STATUS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.watchlist.WatchlistFilterTypes> getDEFAULT_FILTER_TYPE_OF_CHANGES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.watchlist.WatchlistFilterTypes> getDEFAULT_FILTER_OTHERS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.watchlist.WatchlistFilterTypes> getDEFAULT_FILTER_TYPE_SET() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.watchlist.WatchlistFilterTypes find(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.watchlist.WatchlistFilterTypes> findGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
    }
}