package org.wikipedia.feed.onboarding;

import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.feed.announcement.Announcement;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.util.GeoUtil;
import java.time.LocalDate;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/feed/onboarding/YIROnboardingCard;", "Lorg/wikipedia/feed/onboarding/OnboardingCard;", "announcement", "Lorg/wikipedia/feed/announcement/Announcement;", "(Lorg/wikipedia/feed/announcement/Announcement;)V", "excludedCountries", "", "", "prefKey", "", "shouldShow", "", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public final class YIROnboardingCard extends org.wikipedia.feed.onboarding.OnboardingCard {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> excludedCountries = null;
    
    public YIROnboardingCard(@org.jetbrains.annotations.NotNull()
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