package org.wikipedia.page.linkpreview;

import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.util.L10nUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewContents;", "", "pageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/page/PageSummary;Lorg/wikipedia/dataclient/WikiSite;)V", "extract", "", "getExtract", "()Ljava/lang/String;", "isDisambiguation", "", "()Z", "ns", "Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "getNs", "()Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "title", "Lorg/wikipedia/page/PageTitle;", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "app.lib"})
public final class LinkPreviewContents {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle title = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer ns = null;
    private final boolean isDisambiguation = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String extract = null;
    
    public LinkPreviewContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary pageSummary, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer getNs() {
        return null;
    }
    
    public final boolean isDisambiguation() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtract() {
        return null;
    }
}