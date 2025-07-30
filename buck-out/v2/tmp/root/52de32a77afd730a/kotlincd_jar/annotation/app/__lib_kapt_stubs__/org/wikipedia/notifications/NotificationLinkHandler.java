package org.wikipedia.notifications;

import android.content.Context;
import android.net.Uri;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.CustomTabsUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/notifications/NotificationLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "context", "Landroid/content/Context;", "category", "Lorg/wikipedia/notifications/NotificationCategory;", "(Landroid/content/Context;Lorg/wikipedia/notifications/NotificationCategory;)V", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onExternalLinkClicked", "uri", "Landroid/net/Uri;", "onInternalLinkClicked", "onMediaLinkClicked", "onPageLinkClicked", "anchor", "", "linkText", "app.lib"})
public final class NotificationLinkHandler extends org.wikipedia.page.LinkHandler {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.notifications.NotificationCategory category = null;
    public org.wikipedia.dataclient.WikiSite wikiSite;
    
    public NotificationLinkHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationCategory category) {
        super(null);
    }
    
    @java.lang.Override()
    public void onPageLinkClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String anchor, @org.jetbrains.annotations.NotNull()
    java.lang.String linkText) {
    }
    
    @java.lang.Override()
    public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, long revisionId) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @java.lang.Override()
    public void setWikiSite(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite p0) {
    }
    
    @java.lang.Override()
    public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onExternalLinkClicked(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
}