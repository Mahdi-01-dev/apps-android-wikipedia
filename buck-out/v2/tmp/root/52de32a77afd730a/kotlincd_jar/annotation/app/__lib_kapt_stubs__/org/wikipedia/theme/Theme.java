package org.wikipedia.theme;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import org.wikipedia.R;
import org.wikipedia.model.EnumCode;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0019B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0004X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0004X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/theme/Theme;", "", "Lorg/wikipedia/model/EnumCode;", "marshallingId", "", "tag", "", "resourceId", "nameId", "(Ljava/lang/String;IILjava/lang/String;II)V", "isDark", "", "()Z", "isDefault", "getMarshallingId", "()I", "getNameId", "getResourceId", "getTag", "()Ljava/lang/String;", "code", "LIGHT", "DARK", "BLACK", "SEPIA", "Companion", "app.lib"})
public enum Theme implements org.wikipedia.model.EnumCode {
    /*public static final*/ LIGHT /* = new LIGHT(0, null, 0, 0) */,
    /*public static final*/ DARK /* = new DARK(0, null, 0, 0) */,
    /*public static final*/ BLACK /* = new BLACK(0, null, 0, 0) */,
    /*public static final*/ SEPIA /* = new SEPIA(0, null, 0, 0) */;
    private final int marshallingId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tag = null;
    @androidx.annotation.StyleRes()
    private final int resourceId = 0;
    @androidx.annotation.StringRes()
    private final int nameId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.theme.Theme.Companion Companion = null;
    
    Theme(int marshallingId, java.lang.String tag, @androidx.annotation.StyleRes()
    int resourceId, @androidx.annotation.StringRes()
    int nameId) {
    }
    
    public final int getMarshallingId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTag() {
        return null;
    }
    
    @androidx.annotation.StyleRes()
    public final int getResourceId() {
        return 0;
    }
    
    @androidx.annotation.StringRes()
    public final int getNameId() {
        return 0;
    }
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    public final boolean isDefault() {
        return false;
    }
    
    public final boolean isDark() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.theme.Theme> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/theme/Theme$Companion;", "", "()V", "fallback", "Lorg/wikipedia/theme/Theme;", "getFallback", "()Lorg/wikipedia/theme/Theme;", "ofMarshallingId", "id", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.theme.Theme getFallback() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.theme.Theme ofMarshallingId(int id) {
            return null;
        }
    }
}