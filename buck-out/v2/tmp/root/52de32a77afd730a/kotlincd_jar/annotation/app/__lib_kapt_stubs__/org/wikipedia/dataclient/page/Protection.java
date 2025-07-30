package org.wikipedia.dataclient.page;

import kotlinx.serialization.Serializable;

/**
 * Protection settings for a page
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/dataclient/page/Protection;", "", "()V", "edit", "", "editRoles", "", "getEditRoles", "()Ljava/util/Set;", "expiry", "getExpiry", "()Ljava/lang/String;", "firstAllowedEditorRole", "getFirstAllowedEditorRole", "level", "getLevel", "type", "getType", "app.lib"})
public final class Protection {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String edit = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String level = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String expiry = "";
    
    public Protection() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstAllowedEditorRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getEditRoles() {
        return null;
    }
}