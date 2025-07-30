package org.wikipedia.page;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/page/Page;", "", "title", "Lorg/wikipedia/page/PageTitle;", "sections", "", "Lorg/wikipedia/page/Section;", "pageProperties", "Lorg/wikipedia/page/PageProperties;", "(Lorg/wikipedia/page/PageTitle;Ljava/util/List;Lorg/wikipedia/page/PageProperties;)V", "displayTitle", "", "getDisplayTitle", "()Ljava/lang/String;", "isArticle", "", "()Z", "isMainPage", "isProtected", "getPageProperties", "()Lorg/wikipedia/page/PageProperties;", "getSections", "()Ljava/util/List;", "setSections", "(Ljava/util/List;)V", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "app.lib"})
public final class Page {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle title = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.page.Section> sections;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageProperties pageProperties = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayTitle = null;
    private final boolean isMainPage = false;
    private final boolean isArticle = false;
    private final boolean isProtected = false;
    
    public Page(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.Section> sections, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageProperties pageProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.Section> getSections() {
        return null;
    }
    
    public final void setSections(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.Section> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageProperties getPageProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final boolean isMainPage() {
        return false;
    }
    
    public final boolean isArticle() {
        return false;
    }
    
    public final boolean isProtected() {
        return false;
    }
}