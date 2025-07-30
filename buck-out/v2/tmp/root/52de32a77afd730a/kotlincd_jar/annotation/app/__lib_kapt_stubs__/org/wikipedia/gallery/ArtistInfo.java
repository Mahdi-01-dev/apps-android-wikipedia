package org.wikipedia.gallery;

import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/gallery/ArtistInfo;", "Lorg/wikipedia/gallery/TextInfo;", "name", "", "userPage", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUserPage$annotations", "()V", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class ArtistInfo extends org.wikipedia.gallery.TextInfo {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userPage = null;
    
    public ArtistInfo(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String userPage) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "user_page")
    @java.lang.Deprecated()
    private static void getUserPage$annotations() {
    }
    
    public ArtistInfo() {
        super(null, null, null);
    }
}