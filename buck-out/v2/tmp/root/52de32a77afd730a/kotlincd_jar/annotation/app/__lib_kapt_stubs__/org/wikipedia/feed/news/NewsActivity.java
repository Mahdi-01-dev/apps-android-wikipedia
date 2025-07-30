package org.wikipedia.feed.news;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\t\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/feed/news/NewsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/feed/news/NewsFragment;", "()V", "createFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateNavigationBarColor", "Companion", "app.lib"})
public final class NewsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.feed.news.NewsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NEWS_ITEM = "item";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.news.NewsActivity.Companion Companion = null;
    
    public NewsActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.news.NewsFragment createFragment() {
        return null;
    }
    
    public final void updateNavigationBarColor() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/feed/news/NewsActivity$Companion;", "", "()V", "EXTRA_NEWS_ITEM", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "item", "Lorg/wikipedia/feed/news/NewsItem;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItem item, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
    }
}