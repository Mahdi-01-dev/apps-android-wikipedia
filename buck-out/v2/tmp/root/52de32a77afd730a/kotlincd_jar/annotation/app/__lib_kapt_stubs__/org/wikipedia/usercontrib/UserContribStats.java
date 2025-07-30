package org.wikipedia.usercontrib;

import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.UserContribution;
import org.wikipedia.settings.Prefs;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribStats;", "", "()V", "PAUSE_DURATION_DAYS", "", "REVERT_SEVERITY_DISABLE_THRESHOLD", "REVERT_SEVERITY_PAUSE_THRESHOLD", "totalEdits", "totalReverts", "getTotalReverts", "()I", "setTotalReverts", "(I)V", "getPageViews", "", "homeWikiContributions", "", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "wikidataContributions", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevertSeverity", "isDisabled", "", "maybePauseAndGetEndDate", "Ljava/util/Date;", "verifyEditCountsAndPauseState", "", "totalContributionsList", "app.lib"})
public final class UserContribStats {
    private static final int REVERT_SEVERITY_PAUSE_THRESHOLD = 5;
    private static final int REVERT_SEVERITY_DISABLE_THRESHOLD = 7;
    private static final int PAUSE_DURATION_DAYS = 7;
    private static int totalEdits = 0;
    private static int totalReverts = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.usercontrib.UserContribStats INSTANCE = null;
    
    private UserContribStats() {
        super();
    }
    
    public final int getTotalReverts() {
        return 0;
    }
    
    public final void setTotalReverts(int p0) {
    }
    
    public final void verifyEditCountsAndPauseState(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> totalContributionsList) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPageViews(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> homeWikiContributions, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> wikidataContributions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    public final int getRevertSeverity() {
        return 0;
    }
    
    public final boolean isDisabled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date maybePauseAndGetEndDate() {
        return null;
    }
}