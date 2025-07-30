package org.wikipedia.dataclient.restbase;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/restbase/EditCount;", "", "()V", "count", "", "getCount", "()I", "limit", "", "getLimit", "()Z", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class EditCount {
    private final int count = 0;
    private final boolean limit = false;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_ANONYMOUS = "anonymous";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_TEMPORARY = "temporary";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_BOT = "bot";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_EDITORS = "editors";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_EDITS = "edits";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_MINOR = "minor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_REVERTED = "reverted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TYPE_ALL = "all";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.restbase.EditCount.Companion Companion = null;
    
    public EditCount() {
        super();
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final boolean getLimit() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/restbase/EditCount$Companion;", "", "()V", "EDIT_TYPE_ALL", "", "EDIT_TYPE_ANONYMOUS", "EDIT_TYPE_BOT", "EDIT_TYPE_EDITORS", "EDIT_TYPE_EDITS", "EDIT_TYPE_MINOR", "EDIT_TYPE_REVERTED", "EDIT_TYPE_TEMPORARY", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}