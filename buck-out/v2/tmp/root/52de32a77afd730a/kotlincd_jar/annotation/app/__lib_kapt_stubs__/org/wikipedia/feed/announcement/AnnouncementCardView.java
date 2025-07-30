package org.wikipedia.feed.announcement;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.text.method.LinkMovementMethodCompat;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.databinding.ViewCardAnnouncementBinding;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.onboarding.YIROnboardingCard;
import org.wikipedia.feed.view.DefaultFeedCardView;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR(\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/feed/announcement/AnnouncementCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/announcement/AnnouncementCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "card", "getCard", "()Lorg/wikipedia/feed/announcement/AnnouncementCard;", "setCard", "(Lorg/wikipedia/feed/announcement/AnnouncementCard;)V", "localCallback", "Lorg/wikipedia/feed/announcement/AnnouncementCardView$Callback;", "getLocalCallback", "()Lorg/wikipedia/feed/announcement/AnnouncementCardView$Callback;", "setLocalCallback", "(Lorg/wikipedia/feed/announcement/AnnouncementCardView$Callback;)V", "onNegativeActionClick", "", "onPositiveActionClick", "Callback", "app.lib"})
public final class AnnouncementCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.announcement.AnnouncementCard> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.announcement.AnnouncementCardView.Callback localCallback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.announcement.AnnouncementCard card;
    
    public AnnouncementCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.announcement.AnnouncementCardView.Callback getLocalCallback() {
        return null;
    }
    
    public final void setLocalCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.announcement.AnnouncementCardView.Callback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.announcement.AnnouncementCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.announcement.AnnouncementCard value) {
    }
    
    private final void onPositiveActionClick() {
    }
    
    private final void onNegativeActionClick() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/announcement/AnnouncementCardView$Callback;", "", "onAnnouncementNegativeAction", "", "card", "Lorg/wikipedia/feed/model/Card;", "onAnnouncementPositiveAction", "uri", "Landroid/net/Uri;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onAnnouncementPositiveAction(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri);
        
        public abstract void onAnnouncementNegativeAction(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card);
    }
}