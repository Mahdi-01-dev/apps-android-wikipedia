package org.wikipedia.feed.onboarding;

import androidx.annotation.StringRes;
import org.wikipedia.feed.announcement.Announcement;
import org.wikipedia.feed.announcement.AnnouncementCard;
import org.wikipedia.settings.PrefsIoUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\'J\b\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/feed/onboarding/OnboardingCard;", "Lorg/wikipedia/feed/announcement/AnnouncementCard;", "announcement", "Lorg/wikipedia/feed/announcement/Announcement;", "(Lorg/wikipedia/feed/announcement/Announcement;)V", "onDismiss", "", "onRestore", "prefKey", "", "shouldShow", "", "app.lib"})
public abstract class OnboardingCard extends org.wikipedia.feed.announcement.AnnouncementCard {
    
    public OnboardingCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.announcement.Announcement announcement) {
        super(null);
    }
    
    @androidx.annotation.StringRes()
    public abstract int prefKey();
    
    public boolean shouldShow() {
        return false;
    }
    
    @java.lang.Override()
    public void onDismiss() {
    }
    
    @java.lang.Override()
    public void onRestore() {
    }
}