package org.wikipedia.descriptions;

import org.wikipedia.page.Page;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditUtil;", "", "()V", "DESCRIPTION_SOURCE_LOCAL", "", "DESCRIPTION_SOURCE_WIKIDATA", "isEditAllowed", "", "page", "Lorg/wikipedia/page/Page;", "wikiUsesLocalDescriptions", "lang", "app.lib"})
public final class DescriptionEditUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DESCRIPTION_SOURCE_LOCAL = "local";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DESCRIPTION_SOURCE_WIKIDATA = "central";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditUtil INSTANCE = null;
    
    private DescriptionEditUtil() {
        super();
    }
    
    public final boolean wikiUsesLocalDescriptions(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return false;
    }
    
    public final boolean isEditAllowed(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Page page) {
        return false;
    }
}