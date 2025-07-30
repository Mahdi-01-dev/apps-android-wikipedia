package org.wikipedia.readinglist.recommended;

import androidx.annotation.StringRes;
import org.wikipedia.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "", "displayStringRes", "", "dialogStringRes", "snackbarStringRes", "(Ljava/lang/String;IIII)V", "getDialogStringRes", "()I", "getDisplayStringRes", "getSnackbarStringRes", "DAILY", "WEEKLY", "MONTHLY", "app.lib"})
public enum RecommendedReadingListUpdateFrequency {
    /*public static final*/ DAILY /* = new DAILY(0, 0, 0) */,
    /*public static final*/ WEEKLY /* = new WEEKLY(0, 0, 0) */,
    /*public static final*/ MONTHLY /* = new MONTHLY(0, 0, 0) */;
    private final int displayStringRes = 0;
    private final int dialogStringRes = 0;
    private final int snackbarStringRes = 0;
    
    RecommendedReadingListUpdateFrequency(@androidx.annotation.StringRes()
    int displayStringRes, @androidx.annotation.StringRes()
    int dialogStringRes, @androidx.annotation.StringRes()
    int snackbarStringRes) {
    }
    
    public final int getDisplayStringRes() {
        return 0;
    }
    
    public final int getDialogStringRes() {
        return 0;
    }
    
    public final int getSnackbarStringRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency> getEntries() {
        return null;
    }
}