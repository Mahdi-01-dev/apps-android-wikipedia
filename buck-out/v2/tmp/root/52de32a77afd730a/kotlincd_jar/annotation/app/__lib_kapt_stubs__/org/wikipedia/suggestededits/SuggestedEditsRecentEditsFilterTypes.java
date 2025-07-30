package org.wikipedia.suggestededits;

import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.model.EnumCode;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001(B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000ej\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'\u00a8\u0006)"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterTypes;", "", "Lorg/wikipedia/model/EnumCode;", "id", "", "value", "title", "", "description", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "getTitle", "()I", "getValue", "code", "ALL_EDITS", "MINOR_EDITS", "NON_MINOR_EDITS", "ALL_EDITORS", "BOT", "HUMAN", "LATEST_REVISION", "NOT_LATEST_REVISION", "UNREGISTERED", "REGISTERED", "NEWCOMERS", "LEARNERS", "EXPERIENCED_USERS", "DAMAGING_GOOD", "DAMAGING_MAY_PROBLEMS", "DAMAGING_LIKELY_PROBLEMS", "DAMAGING_VERY_LIKELY_PROBLEMS", "GOODFAITH_GOOD", "GOODFAITH_MAY_PROBLEMS", "GOODFAITH_LIKELY_PROBLEMS", "GOODFAITH_VERY_LIKELY_PROBLEMS", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public enum SuggestedEditsRecentEditsFilterTypes implements org.wikipedia.model.EnumCode {
    /*public static final*/ ALL_EDITS /* = new ALL_EDITS(null, null, 0, null) */,
    /*public static final*/ MINOR_EDITS /* = new MINOR_EDITS(null, null, 0, null) */,
    /*public static final*/ NON_MINOR_EDITS /* = new NON_MINOR_EDITS(null, null, 0, null) */,
    /*public static final*/ ALL_EDITORS /* = new ALL_EDITORS(null, null, 0, null) */,
    /*public static final*/ BOT /* = new BOT(null, null, 0, null) */,
    /*public static final*/ HUMAN /* = new HUMAN(null, null, 0, null) */,
    /*public static final*/ LATEST_REVISION /* = new LATEST_REVISION(null, null, 0, null) */,
    /*public static final*/ NOT_LATEST_REVISION /* = new NOT_LATEST_REVISION(null, null, 0, null) */,
    /*public static final*/ UNREGISTERED /* = new UNREGISTERED(null, null, 0, null) */,
    /*public static final*/ REGISTERED /* = new REGISTERED(null, null, 0, null) */,
    /*public static final*/ NEWCOMERS /* = new NEWCOMERS(null, null, 0, null) */,
    /*public static final*/ LEARNERS /* = new LEARNERS(null, null, 0, null) */,
    /*public static final*/ EXPERIENCED_USERS /* = new EXPERIENCED_USERS(null, null, 0, null) */,
    /*public static final*/ DAMAGING_GOOD /* = new DAMAGING_GOOD(null, null, 0, null) */,
    /*public static final*/ DAMAGING_MAY_PROBLEMS /* = new DAMAGING_MAY_PROBLEMS(null, null, 0, null) */,
    /*public static final*/ DAMAGING_LIKELY_PROBLEMS /* = new DAMAGING_LIKELY_PROBLEMS(null, null, 0, null) */,
    /*public static final*/ DAMAGING_VERY_LIKELY_PROBLEMS /* = new DAMAGING_VERY_LIKELY_PROBLEMS(null, null, 0, null) */,
    /*public static final*/ GOODFAITH_GOOD /* = new GOODFAITH_GOOD(null, null, 0, null) */,
    /*public static final*/ GOODFAITH_MAY_PROBLEMS /* = new GOODFAITH_MAY_PROBLEMS(null, null, 0, null) */,
    /*public static final*/ GOODFAITH_LIKELY_PROBLEMS /* = new GOODFAITH_LIKELY_PROBLEMS(null, null, 0, null) */,
    /*public static final*/ GOODFAITH_VERY_LIKELY_PROBLEMS /* = new GOODFAITH_VERY_LIKELY_PROBLEMS(null, null, 0, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    private final int title = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer description = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> MINOR_EDITS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> BOT_EDITS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> LATEST_REVISIONS_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> USER_REGISTRATION_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> USER_EXPERIENCE_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> DAMAGING_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> GOODFAITH_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> DEFAULT_FILTER_USER_STATUS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> DEFAULT_FILTER_OTHERS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> DEFAULT_FILTER_TYPE_SET = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes.Companion Companion = null;
    
    SuggestedEditsRecentEditsFilterTypes(java.lang.String id, java.lang.String value, @androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    java.lang.Integer description) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    public final int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDescription() {
        return null;
    }
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u001eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterTypes$Companion;", "", "()V", "BOT_EDITS_GROUP", "", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterTypes;", "getBOT_EDITS_GROUP", "()Ljava/util/List;", "DAMAGING_GROUP", "getDAMAGING_GROUP", "DEFAULT_FILTER_OTHERS", "", "getDEFAULT_FILTER_OTHERS", "()Ljava/util/Set;", "DEFAULT_FILTER_TYPE_SET", "getDEFAULT_FILTER_TYPE_SET", "DEFAULT_FILTER_USER_STATUS", "getDEFAULT_FILTER_USER_STATUS", "GOODFAITH_GROUP", "getGOODFAITH_GROUP", "LATEST_REVISIONS_GROUP", "getLATEST_REVISIONS_GROUP", "MINOR_EDITS_GROUP", "getMINOR_EDITS_GROUP", "USER_EXPERIENCE_GROUP", "getUSER_EXPERIENCE_GROUP", "USER_REGISTRATION_GROUP", "getUSER_REGISTRATION_GROUP", "find", "id", "", "findGroup", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getMINOR_EDITS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getBOT_EDITS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getLATEST_REVISIONS_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getUSER_REGISTRATION_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getUSER_EXPERIENCE_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getDAMAGING_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getGOODFAITH_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getDEFAULT_FILTER_USER_STATUS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getDEFAULT_FILTER_OTHERS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> getDEFAULT_FILTER_TYPE_SET() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes find(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes> findGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
    }
}