package org.wikipedia.search;

import android.content.Context;
import android.content.Intent;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/search/SearchActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/search/SearchFragment;", "()V", "createFragment", "Companion", "app.lib"})
public final class SearchActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.search.SearchFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_EXTRA = "query";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_RETURN_LINK = "returnLink";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_RETURN_LINK_TITLE = "returnLinkTitle";
    public static final int RESULT_LINK_SUCCESS = 97;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.search.SearchActivity.Companion Companion = null;
    
    public SearchActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.search.SearchFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/search/SearchActivity$Companion;", "", "()V", "EXTRA_RETURN_LINK", "", "EXTRA_RETURN_LINK_TITLE", "QUERY_EXTRA", "RESULT_LINK_SUCCESS", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "query", "returnLink", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
        java.lang.String query, boolean returnLink) {
            return null;
        }
    }
}