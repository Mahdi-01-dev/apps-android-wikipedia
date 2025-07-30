package org.wikipedia.feed.onboarding;

import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.feed.announcement.Announcement;
import org.wikipedia.feed.model.CardType;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/feed/onboarding/CustomizeOnboardingCard;", "Lorg/wikipedia/feed/onboarding/OnboardingCard;", "announcement", "Lorg/wikipedia/feed/announcement/Announcement;", "(Lorg/wikipedia/feed/announcement/Announcement;)V", "prefKey", "", "shouldShow", "", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class CustomizeOnboardingCard extends org.wikipedia.feed.onboarding.OnboardingCard {
    
    public CustomizeOnboardingCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.announcement.Announcement announcement) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    public boolean shouldShow() {
        return false;
    }
    
    @java.lang.Override()
    public int prefKey() {
        return 0;
    }
}