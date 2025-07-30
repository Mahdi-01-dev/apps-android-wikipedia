package org.wikipedia.diff;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.databinding.ActivityArticleEditDetailsBinding;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class ArticleEditDetailsActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityArticleEditDetailsBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ARTICLE_TITLE = "articleTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAGE_ID = "pageId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EDIT_REVISION_FROM = "revisionFrom";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EDIT_REVISION_TO = "revisionTo";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.diff.ArticleEditDetailsActivity.Companion Companion = null;
    
    public ArticleEditDetailsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsActivity$Companion;", "", "()V", "EXTRA_ARTICLE_TITLE", "", "EXTRA_EDIT_REVISION_FROM", "EXTRA_EDIT_REVISION_TO", "EXTRA_PAGE_ID", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "title", "Lorg/wikipedia/page/PageTitle;", "pageId", "", "revisionFrom", "", "revisionTo", "source", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long revisionTo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, int pageId, long revisionFrom, long revisionTo, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source) {
            return null;
        }
    }
}