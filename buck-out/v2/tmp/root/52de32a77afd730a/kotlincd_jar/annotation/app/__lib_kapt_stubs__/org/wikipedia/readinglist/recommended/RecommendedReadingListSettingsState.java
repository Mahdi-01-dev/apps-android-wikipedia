package org.wikipedia.readinglist.recommended;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.StateFlow;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsState;", "", "isRecommendedReadingListEnabled", "", "articlesNumber", "", "updateFrequency", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "recommendedReadingListSource", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "isRecommendedReadingListNotificationEnabled", "(ZILorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;Z)V", "getArticlesNumber", "()I", "()Z", "getRecommendedReadingListSource", "()Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "getUpdateFrequency", "()Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app.lib"})
public final class RecommendedReadingListSettingsState {
    private final boolean isRecommendedReadingListEnabled = false;
    private final int articlesNumber = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency updateFrequency = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.recommended.RecommendedReadingListSource recommendedReadingListSource = null;
    private final boolean isRecommendedReadingListNotificationEnabled = false;
    
    public final boolean component1() {
        return false;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListSource component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsState copy(boolean isRecommendedReadingListEnabled, int articlesNumber, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency updateFrequency, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSource recommendedReadingListSource, boolean isRecommendedReadingListNotificationEnabled) {
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
    
    public RecommendedReadingListSettingsState(boolean isRecommendedReadingListEnabled, int articlesNumber, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency updateFrequency, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSource recommendedReadingListSource, boolean isRecommendedReadingListNotificationEnabled) {
        super();
    }
    
    public final boolean isRecommendedReadingListEnabled() {
        return false;
    }
    
    public final int getArticlesNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency getUpdateFrequency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListSource getRecommendedReadingListSource() {
        return null;
    }
    
    public final boolean isRecommendedReadingListNotificationEnabled() {
        return false;
    }
    
    public RecommendedReadingListSettingsState() {
        super();
    }
}