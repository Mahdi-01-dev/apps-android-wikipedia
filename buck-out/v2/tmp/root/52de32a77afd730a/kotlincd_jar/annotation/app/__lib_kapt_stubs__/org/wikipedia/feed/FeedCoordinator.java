package org.wikipedia.feed;

import android.content.Context;
import org.wikipedia.WikipediaApp;
import org.wikipedia.feed.aggregated.AggregatedFeedContentClient;
import org.wikipedia.feed.announcement.AnnouncementClient;
import org.wikipedia.feed.offline.OfflineCardClient;
import org.wikipedia.feed.onboarding.OnboardingClient;
import org.wikipedia.feed.searchbar.SearchClient;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinator;", "Lorg/wikipedia/feed/FeedCoordinatorBase;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "buildScript", "", "age", "", "reset", "app.lib"})
public final class FeedCoordinator extends org.wikipedia.feed.FeedCoordinatorBase {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient = null;
    
    public FeedCoordinator(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void reset() {
    }
    
    @java.lang.Override()
    protected void buildScript(int age) {
    }
}