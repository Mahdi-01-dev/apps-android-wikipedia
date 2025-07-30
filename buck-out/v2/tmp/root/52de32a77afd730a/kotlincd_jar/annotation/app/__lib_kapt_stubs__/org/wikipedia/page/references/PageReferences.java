package org.wikipedia.page.references;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/page/references/PageReferences;", "", "selectedIndex", "", "tid", "", "referencesGroup", "", "Lorg/wikipedia/page/references/PageReferences$Reference;", "(ILjava/lang/String;Ljava/util/List;)V", "getReferencesGroup", "()Ljava/util/List;", "getSelectedIndex", "()I", "getTid", "()Ljava/lang/String;", "Reference", "app.lib"})
public final class PageReferences {
    private final int selectedIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.page.references.PageReferences.Reference> referencesGroup = null;
    
    public PageReferences(int selectedIndex, @org.jetbrains.annotations.Nullable()
    java.lang.String tid, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.references.PageReferences.Reference> referencesGroup) {
        super();
    }
    
    public final int getSelectedIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.references.PageReferences.Reference> getReferencesGroup() {
        return null;
    }
    
    public PageReferences() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/page/references/PageReferences$Reference;", "", "id", "", "href", "text", "html", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "getHtml", "getId", "getText", "app.lib"})
    public static final class Reference {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String href = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String html = null;
        
        public Reference(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String href, @org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        java.lang.String html) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHref() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHtml() {
            return null;
        }
        
        public Reference() {
            super();
        }
    }
}