package org.wikipedia.games.onthisday;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.ContextCompat;
import com.google.android.material.datepicker.DayViewDecorator;
import org.wikipedia.R;
import java.util.Calendar;
import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B)\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J:\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J:\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u000bH\u0016R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/games/onthisday/DateDecorator;", "Lcom/google/android/material/datepicker/DayViewDecorator;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "startDate", "Ljava/util/Date;", "endDate", "scoreData", "", "", "", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "describeContents", "getBackgroundColor", "Landroid/content/res/ColorStateList;", "context", "Landroid/content/Context;", "year", "month", "day", "valid", "", "selected", "getTextColor", "isDateInRange", "writeToParcel", "", "dest", "flags", "CREATOR", "app.lib"})
public final class DateDecorator extends com.google.android.material.datepicker.DayViewDecorator {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date startDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date endDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Long, java.lang.Integer> scoreData = null;
    private final java.util.Calendar calendar = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.DateDecorator.CREATOR CREATOR = null;
    
    public DateDecorator(@org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, java.lang.Integer> scoreData) {
        super();
    }
    
    private final boolean isDateInRange(int year, int month, int day) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.content.res.ColorStateList getBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int year, int month, int day, boolean valid, boolean selected) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.content.res.ColorStateList getTextColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int year, int month, int day, boolean valid, boolean selected) {
        return null;
    }
    
    public DateDecorator(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u001d\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/games/onthisday/DateDecorator$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lorg/wikipedia/games/onthisday/DateDecorator;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "getDateKey", "", "year", "", "month", "day", "newArray", "", "size", "(I)[Lorg/wikipedia/games/onthisday/DateDecorator;", "app.lib"})
    public static final class CREATOR implements android.os.Parcelable.Creator<org.wikipedia.games.onthisday.DateDecorator> {
        
        private CREATOR() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.games.onthisday.DateDecorator createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.games.onthisday.DateDecorator[] newArray(int size) {
            return null;
        }
        
        public final long getDateKey(int year, int month, int day) {
            return 0L;
        }
    }
}