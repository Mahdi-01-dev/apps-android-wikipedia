package org.wikipedia.feed.topread;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.wikipedia.R;
import org.wikipedia.activity.SingleFragmentActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadArticlesActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/feed/topread/TopReadFragment;", "()V", "createFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class TopReadArticlesActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.feed.topread.TopReadFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOP_READ_CARD = "item";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.topread.TopReadArticlesActivity.Companion Companion = null;
    
    public TopReadArticlesActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.feed.topread.TopReadFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadArticlesActivity$Companion;", "", "()V", "TOP_READ_CARD", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "card", "Lorg/wikipedia/feed/topread/TopReadListCard;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.topread.TopReadListCard card) {
            return null;
        }
    }
}