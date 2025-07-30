package org.wikipedia.dataclient.growthtasks;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.json.JsonUtil;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0003HIJB\u00c5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0018R\'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001cR\'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001cR\'\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u001e\u001a\u0004\b&\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010,\u001a\u0004\u0018\u00010-8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b.\u0010/R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b1\u00102R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b3\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b4\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b5\u00102R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b6\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b7\u00102R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\'\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020<0\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\u001e\u001a\u0004\b=\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0011\u0010\u0016\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bF\u00102\u001a\u0004\bG\u0010)\u00a8\u0006K"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact;", "", "version", "", "userId", "userName", "", "receivedThanksCount", "givenThanksCount", "mEditCountByNamespace", "Lkotlinx/serialization/json/JsonElement;", "mEditCountByDay", "mEditCountByTaskType", "totalUserEditCount", "totalEditsCount", "newcomerTaskEditCount", "revertedEditCount", "lastEditTimestamp", "", "totalArticlesCreatedCount", "mLongestEditingStreak", "mDailyTotalViews", "totalPageviewsCount", "mTopViewedArticles", "(IILjava/lang/String;IILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;IIIIJILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;JLkotlinx/serialization/json/JsonElement;)V", "dailyTotalViews", "", "getDailyTotalViews", "()Ljava/util/Map;", "dailyTotalViews$delegate", "Lkotlin/Lazy;", "editCountByDay", "getEditCountByDay", "editCountByDay$delegate", "editCountByNamespace", "getEditCountByNamespace", "editCountByNamespace$delegate", "editCountByTaskType", "getEditCountByTaskType", "editCountByTaskType$delegate", "getGivenThanksCount", "()I", "getLastEditTimestamp", "()J", "longestEditingStreak", "Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditStreak;", "getLongestEditingStreak", "()Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditStreak;", "longestEditingStreak$delegate", "getMDailyTotalViews$annotations", "()V", "getMEditCountByDay$annotations", "getMEditCountByNamespace$annotations", "getMEditCountByTaskType$annotations", "getMLongestEditingStreak$annotations", "getMTopViewedArticles$annotations", "getNewcomerTaskEditCount", "getReceivedThanksCount", "getRevertedEditCount", "topViewedArticles", "Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$ArticleViews;", "getTopViewedArticles", "topViewedArticles$delegate", "getTotalArticlesCreatedCount", "getTotalEditsCount", "getTotalPageviewsCount", "getTotalUserEditCount", "getUserId", "getUserName", "()Ljava/lang/String;", "getVersion$annotations", "getVersion", "ArticleViews", "EditDateRange", "EditStreak", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class GrowthUserImpact {
    private final int version = 0;
    private final int userId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userName = null;
    private final int receivedThanksCount = 0;
    private final int givenThanksCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement mEditCountByNamespace = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement mEditCountByDay = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement mEditCountByTaskType = null;
    private final int totalUserEditCount = 0;
    private final int totalEditsCount = 0;
    private final int newcomerTaskEditCount = 0;
    private final int revertedEditCount = 0;
    private final long lastEditTimestamp = 0L;
    private final int totalArticlesCreatedCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement mLongestEditingStreak = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement mDailyTotalViews = null;
    private final long totalPageviewsCount = 0L;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.serialization.json.JsonElement mTopViewedArticles = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy editCountByNamespace$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy editCountByDay$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy editCountByTaskType$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dailyTotalViews$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy topViewedArticles$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy longestEditingStreak$delegate = null;
    
    public GrowthUserImpact(int version, int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, int receivedThanksCount, int givenThanksCount, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement mEditCountByNamespace, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement mEditCountByDay, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement mEditCountByTaskType, int totalUserEditCount, int totalEditsCount, int newcomerTaskEditCount, int revertedEditCount, long lastEditTimestamp, int totalArticlesCreatedCount, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement mLongestEditingStreak, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement mDailyTotalViews, long totalPageviewsCount, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonElement mTopViewedArticles) {
        super();
    }
    
    public final int getVersion() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "@version")
    @java.lang.Deprecated()
    public static void getVersion$annotations() {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final int getReceivedThanksCount() {
        return 0;
    }
    
    public final int getGivenThanksCount() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "editCountByNamespace")
    @java.lang.Deprecated()
    private static void getMEditCountByNamespace$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "editCountByDay")
    @java.lang.Deprecated()
    private static void getMEditCountByDay$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "editCountByTaskType")
    @java.lang.Deprecated()
    private static void getMEditCountByTaskType$annotations() {
    }
    
    public final int getTotalUserEditCount() {
        return 0;
    }
    
    public final int getTotalEditsCount() {
        return 0;
    }
    
    public final int getNewcomerTaskEditCount() {
        return 0;
    }
    
    public final int getRevertedEditCount() {
        return 0;
    }
    
    public final long getLastEditTimestamp() {
        return 0L;
    }
    
    public final int getTotalArticlesCreatedCount() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "longestEditingStreak")
    @java.lang.Deprecated()
    private static void getMLongestEditingStreak$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "dailyTotalViews")
    @java.lang.Deprecated()
    private static void getMDailyTotalViews$annotations() {
    }
    
    public final long getTotalPageviewsCount() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "topViewedArticles")
    @java.lang.Deprecated()
    private static void getMTopViewedArticles$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.lang.Integer> getEditCountByNamespace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getEditCountByDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getEditCountByTaskType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getDailyTotalViews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.dataclient.growthtasks.GrowthUserImpact.ArticleViews> getTopViewedArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.growthtasks.GrowthUserImpact.EditStreak getLongestEditingStreak() {
        return null;
    }
    
    public GrowthUserImpact() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$ArticleViews;", "", "firstEditDate", "", "newestEdit", "imageUrl", "viewsCount", "", "views", "Lkotlinx/serialization/json/JsonElement;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/json/JsonElement;)V", "getFirstEditDate", "()Ljava/lang/String;", "getImageUrl", "getNewestEdit", "viewsByDay", "", "", "getViewsByDay", "()Ljava/util/Map;", "viewsByDay$delegate", "Lkotlin/Lazy;", "getViewsCount", "()J", "app.lib"})
    public static final class ArticleViews {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String firstEditDate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String newestEdit = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String imageUrl = null;
        private final long viewsCount = 0L;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement views = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy viewsByDay$delegate = null;
        
        public ArticleViews(@org.jetbrains.annotations.NotNull()
        java.lang.String firstEditDate, @org.jetbrains.annotations.NotNull()
        java.lang.String newestEdit, @org.jetbrains.annotations.NotNull()
        java.lang.String imageUrl, long viewsCount, @org.jetbrains.annotations.Nullable()
        kotlinx.serialization.json.JsonElement views) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirstEditDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNewestEdit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final long getViewsCount() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Integer> getViewsByDay() {
            return null;
        }
        
        public ArticleViews() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditDateRange;", "", "start", "", "end", "days", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDays", "()I", "getEnd", "()Ljava/lang/String;", "getStart", "app.lib"})
    public static final class EditDateRange {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String start = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String end = null;
        private final int days = 0;
        
        public EditDateRange(@org.jetbrains.annotations.NotNull()
        java.lang.String start, @org.jetbrains.annotations.NotNull()
        java.lang.String end, int days) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStart() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEnd() {
            return null;
        }
        
        public final int getDays() {
            return 0;
        }
        
        public EditDateRange() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditStreak;", "", "datePeriod", "Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditDateRange;", "totalEditCountForPeriod", "", "(Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditDateRange;I)V", "getDatePeriod", "()Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact$EditDateRange;", "getTotalEditCountForPeriod", "()I", "app.lib"})
    public static final class EditStreak {
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.growthtasks.GrowthUserImpact.EditDateRange datePeriod = null;
        private final int totalEditCountForPeriod = 0;
        
        public EditStreak(@org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.growthtasks.GrowthUserImpact.EditDateRange datePeriod, int totalEditCountForPeriod) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.growthtasks.GrowthUserImpact.EditDateRange getDatePeriod() {
            return null;
        }
        
        public final int getTotalEditCountForPeriod() {
            return 0;
        }
        
        public EditStreak() {
            super();
        }
    }
}