package org.wikipedia.games.onthisday;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.Serializable;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.feed.onthisday.OnThisDay;
import org.wikipedia.games.PlayTypes;
import org.wikipedia.games.WikiGames;
import org.wikipedia.games.db.DailyGameHistory;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.log.L;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u0000 P2\u00020\u0001:\fPQRSTUVWXYZ[B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0011H\u0002J\f\u00103\u001a\b\u0012\u0004\u0012\u00020)04J\u0006\u00105\u001a\u00020\bJ\u0006\u00106\u001a\u000207J,\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0011092\b\b\u0002\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u000207H\u0086@\u00a2\u0006\u0002\u0010=J\u000e\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u000207J\u000e\u0010@\u001a\u00020AH\u0082@\u00a2\u0006\u0002\u0010BJ\u000e\u0010C\u001a\u00020#2\u0006\u0010?\u001a\u000207J\u0010\u0010D\u001a\u0004\u0018\u0001072\u0006\u0010E\u001a\u00020\u0019J\u0010\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020#J\u000e\u0010I\u001a\u00020GH\u0082@\u00a2\u0006\u0002\u0010BJ\u0012\u0010J\u001a\u00020G2\b\b\u0002\u0010K\u001a\u00020#H\u0002J\u000e\u0010L\u001a\u00020G2\u0006\u0010M\u001a\u00020\nJ\u000e\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/\u00a8\u0006\\"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_gameState", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "currentDate", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "getCurrentDate", "()Ljava/time/LocalDate;", "setCurrentDate", "(Ljava/time/LocalDate;)V", "currentDay", "", "getCurrentDay", "()I", "currentMonth", "getCurrentMonth", "currentState", "events", "", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "gameState", "Landroidx/lifecycle/LiveData;", "getGameState", "()Landroidx/lifecycle/LiveData;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "isArchiveGame", "", "()Z", "setArchiveGame", "(Z)V", "overrideDate", "savedPages", "Lorg/wikipedia/dataclient/page/PageSummary;", "getSavedPages", "()Ljava/util/List;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "composeQuestionState", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$QuestionState;", "index", "getArticlesMentioned", "", "getCurrentGameState", "getCurrentScreenName", "", "getDataForArchiveCalendar", "", "", "gameName", "language", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEventByPageTitle", "pageTitle", "getGameStatistics", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionCorrectByPageTitle", "getThumbnailUrlForEvent", "event", "loadGameState", "", "useDateFromState", "migrateGameHistoryFromPrefsToDatabase", "persistState", "removeCurrentState", "relaunchForDate", "date", "submitCurrentResponse", "selectedYear", "Companion", "CurrentQuestion", "CurrentQuestionCorrect", "CurrentQuestionIncorrect", "GameEnded", "GameHistory", "GameStarted", "GameState", "GameStatistics", "QuestionState", "TotalGameHistory", "TotalGameState", "app.lib"})
public final class OnThisDayGameViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState>> _gameState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    private org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState currentState;
    private final boolean overrideDate = false;
    private java.time.LocalDate currentDate;
    private boolean isArchiveGame = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> events = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.page.PageSummary> savedPages = null;
    public static final int MAX_QUESTIONS = 5;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_DATE = "date";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> LANG_CODES_SUPPORTED = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGameViewModel.Companion Companion = null;
    
    public OnThisDayGameViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState>> getGameState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    public final java.time.LocalDate getCurrentDate() {
        return null;
    }
    
    public final void setCurrentDate(java.time.LocalDate p0) {
    }
    
    public final int getCurrentMonth() {
        return 0;
    }
    
    public final int getCurrentDay() {
        return 0;
    }
    
    public final boolean isArchiveGame() {
        return false;
    }
    
    public final void setArchiveGame(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getSavedPages() {
        return null;
    }
    
    public final void loadGameState(boolean useDateFromState) {
    }
    
    public final void submitCurrentResponse(int selectedYear) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentScreenName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getArticlesMentioned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.onthisday.OnThisDay.Event getEventByPageTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String pageTitle) {
        return null;
    }
    
    public final boolean getQuestionCorrectByPageTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String pageTitle) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnailUrlForEvent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.onthisday.OnThisDay.Event event) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDataForArchiveCalendar(int gameName, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.Long, java.lang.Integer>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState getCurrentGameState() {
        return null;
    }
    
    private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState composeQuestionState(int index) {
        return null;
    }
    
    private final void persistState(boolean removeCurrentState) {
    }
    
    public final void relaunchForDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
    }
    
    private final java.lang.Object getGameStatistics(kotlin.coroutines.Continuation<? super org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameStatistics> $completion) {
        return null;
    }
    
    private final java.lang.Object migrateGameHistoryFromPrefsToDatabase(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$Companion;", "", "()V", "EXTRA_DATE", "", "LANG_CODES_SUPPORTED", "", "getLANG_CODES_SUPPORTED", "()Ljava/util/List;", "MAX_QUESTIONS", "", "dateReleasedForLang", "Ljava/time/LocalDate;", "lang", "isLangSupported", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getLANG_CODES_SUPPORTED() {
            return null;
        }
        
        public final boolean isLangSupported(@org.jetbrains.annotations.NotNull()
        java.lang.String lang) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate dateReleasedForLang(@org.jetbrains.annotations.NotNull()
        java.lang.String lang) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$CurrentQuestion;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "data", "(Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;)V", "getData", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "app.lib"})
    public static final class CurrentQuestion extends org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data = null;
        
        public CurrentQuestion(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$CurrentQuestionCorrect;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "data", "(Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;)V", "getData", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "app.lib"})
    public static final class CurrentQuestionCorrect extends org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data = null;
        
        public CurrentQuestionCorrect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$CurrentQuestionIncorrect;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "data", "(Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;)V", "getData", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "app.lib"})
    public static final class CurrentQuestionIncorrect extends org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data = null;
        
        public CurrentQuestionIncorrect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameEnded;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "data", "gameStatistics", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;", "(Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;)V", "getData", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "getGameStatistics", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;", "app.lib"})
    public static final class GameEnded extends org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameStatistics gameStatistics = null;
        
        public GameEnded(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data, @org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameStatistics gameStatistics) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameStatistics getGameStatistics() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u00122\b\u0002\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00030\u0003\u00a2\u0006\u0002\u0010\u0007J3\u0010\n\u001a,\u0012\u0004\u0012\u00020\u0004\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00030\u0003H\u00c6\u0003J=\u0010\u000b\u001a\u00020\u000022\b\u0002\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00030\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R;\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameHistory;", "", "history", "", "", "", "", "(Ljava/util/Map;)V", "getHistory", "()Ljava/util/Map;", "component1", "copy", "equals", "other", "hashCode", "toString", "", "app.lib"})
    public static final class GameHistory {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.List<java.lang.Boolean>>>> history = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.List<java.lang.Boolean>>>> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameHistory copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Integer, ? extends java.util.Map<java.lang.Integer, ? extends java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.Boolean>>>> history) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public GameHistory(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Integer, ? extends java.util.Map<java.lang.Integer, ? extends java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.Boolean>>>> history) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.List<java.lang.Boolean>>>> getHistory() {
            return null;
        }
        
        public GameHistory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStarted;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "data", "(Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;)V", "getData", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "app.lib"})
    public static final class GameStarted extends org.wikipedia.util.Resource<org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data = null;
        
        public GameStarted(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState getData() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "", "totalQuestions", "", "currentQuestionIndex", "answerState", "", "", "currentQuestionState", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$QuestionState;", "gamePlayDate", "", "lastActiveDate", "(IILjava/util/List;Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$QuestionState;Ljava/lang/String;Ljava/lang/String;)V", "getAnswerState", "()Ljava/util/List;", "getCurrentQuestionIndex", "()I", "getCurrentQuestionState", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$QuestionState;", "getGamePlayDate", "()Ljava/lang/String;", "setGamePlayDate", "(Ljava/lang/String;)V", "getLastActiveDate", "setLastActiveDate", "getTotalQuestions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app.lib"})
    public static final class GameState {
        private final int totalQuestions = 0;
        private final int currentQuestionIndex = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Boolean> answerState = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState currentQuestionState = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String gamePlayDate;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String lastActiveDate;
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Boolean> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState copy(int totalQuestions, int currentQuestionIndex, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Boolean> answerState, @org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState currentQuestionState, @org.jetbrains.annotations.NotNull()
        java.lang.String gamePlayDate, @org.jetbrains.annotations.NotNull()
        java.lang.String lastActiveDate) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public GameState(int totalQuestions, int currentQuestionIndex, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Boolean> answerState, @org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState currentQuestionState, @org.jetbrains.annotations.NotNull()
        java.lang.String gamePlayDate, @org.jetbrains.annotations.NotNull()
        java.lang.String lastActiveDate) {
            super();
        }
        
        public final int getTotalQuestions() {
            return 0;
        }
        
        public final int getCurrentQuestionIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Boolean> getAnswerState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState getCurrentQuestionState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGamePlayDate() {
            return null;
        }
        
        public final void setGamePlayDate(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastActiveDate() {
            return null;
        }
        
        public final void setLastActiveDate(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;", "", "totalGamesPlayed", "", "averageScore", "", "currentStreak", "(ILjava/lang/Double;I)V", "getAverageScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrentStreak", "()I", "getTotalGamesPlayed", "component1", "component2", "component3", "copy", "(ILjava/lang/Double;I)Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;", "equals", "", "other", "hashCode", "toString", "", "app.lib"})
    public static final class GameStatistics {
        private final int totalGamesPlayed = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double averageScore = null;
        private final int currentStreak = 0;
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameStatistics copy(int totalGamesPlayed, @org.jetbrains.annotations.Nullable()
        java.lang.Double averageScore, int currentStreak) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public GameStatistics(int totalGamesPlayed, @org.jetbrains.annotations.Nullable()
        java.lang.Double averageScore, int currentStreak) {
            super();
        }
        
        public final int getTotalGamesPlayed() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getAverageScore() {
            return null;
        }
        
        public final int getCurrentStreak() {
            return 0;
        }
        
        public GameStatistics() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$QuestionState;", "", "event1", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "event2", "month", "", "day", "yearSelected", "goToNext", "", "(Lorg/wikipedia/feed/onthisday/OnThisDay$Event;Lorg/wikipedia/feed/onthisday/OnThisDay$Event;IILjava/lang/Integer;Z)V", "getDay", "()I", "getEvent1", "()Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "getEvent2", "getGoToNext", "()Z", "getMonth", "getYearSelected", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lorg/wikipedia/feed/onthisday/OnThisDay$Event;Lorg/wikipedia/feed/onthisday/OnThisDay$Event;IILjava/lang/Integer;Z)Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$QuestionState;", "equals", "other", "hashCode", "toString", "", "app.lib"})
    public static final class QuestionState {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.onthisday.OnThisDay.Event event1 = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.onthisday.OnThisDay.Event event2 = null;
        private final int month = 0;
        private final int day = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer yearSelected = null;
        private final boolean goToNext = false;
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.onthisday.OnThisDay.Event component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.onthisday.OnThisDay.Event component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.QuestionState copy(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.onthisday.OnThisDay.Event event1, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.onthisday.OnThisDay.Event event2, int month, int day, @org.jetbrains.annotations.Nullable()
        java.lang.Integer yearSelected, boolean goToNext) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public QuestionState(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.onthisday.OnThisDay.Event event1, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.onthisday.OnThisDay.Event event2, int month, int day, @org.jetbrains.annotations.Nullable()
        java.lang.Integer yearSelected, boolean goToNext) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.onthisday.OnThisDay.Event getEvent1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.onthisday.OnThisDay.Event getEvent2() {
            return null;
        }
        
        public final int getMonth() {
            return 0;
        }
        
        public final int getDay() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getYearSelected() {
            return null;
        }
        
        public final boolean getGoToNext() {
            return false;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$TotalGameHistory;", "", "langToHistory", "", "", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameHistory;", "(Ljava/util/Map;)V", "getLangToHistory", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app.lib"})
    public static final class TotalGameHistory {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameHistory> langToHistory = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameHistory> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.TotalGameHistory copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameHistory> langToHistory) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public TotalGameHistory(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameHistory> langToHistory) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameHistory> getLangToHistory() {
            return null;
        }
        
        public TotalGameHistory() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$TotalGameState;", "", "langToState", "", "", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "(Ljava/util/Map;)V", "getLangToState", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app.lib"})
    public static final class TotalGameState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> langToState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameViewModel.TotalGameState copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> langToState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public TotalGameState(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> langToState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState> getLangToState() {
            return null;
        }
        
        public TotalGameState() {
            super();
        }
    }
}