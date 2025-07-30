package org.wikipedia.commons;

import org.wikipedia.Constants;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.wikidata.Claims;
import org.wikipedia.language.LanguageUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0007J0\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/commons/ImageTagsProvider;", "", "()V", "getDepictsClaims", "", "", "claims", "", "Lorg/wikipedia/dataclient/wikidata/Claims$Claim;", "getImageTags", "pageId", "", "langCode", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
public final class ImageTagsProvider {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.commons.ImageTagsProvider INSTANCE = null;
    
    private ImageTagsProvider() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImageTags(int pageId, @org.jetbrains.annotations.NotNull()
    java.lang.String langCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDepictsClaims(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<org.wikipedia.dataclient.wikidata.Claims.Claim>> claims) {
        return null;
    }
}