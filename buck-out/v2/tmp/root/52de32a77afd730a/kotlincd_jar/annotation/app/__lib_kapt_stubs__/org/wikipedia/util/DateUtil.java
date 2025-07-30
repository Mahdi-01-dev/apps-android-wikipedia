package org.wikipedia.util;

import android.content.Context;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Build;
import android.text.format.DateFormat;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.feed.model.UtcDate;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J*\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0010J\u000e\u0010(\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020$J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010+\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010,\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005J\u0016\u00102\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u00102\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0005J\u0016\u00103\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00104\u001a\u000205J\u0016\u00103\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u00106\u001a\u0002072\u0006\u0010%\u001a\u00020\u0010J\u000e\u00108\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u00109\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010;\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010<\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020\u0005J\u0018\u0010?\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u000e\u0010@\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lorg/wikipedia/util/DateUtil;", "", "()V", "DATE_FORMATS", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/text/SimpleDateFormat;", "DATE_TIME_FORMATTERS", "Ljava/time/format/DateTimeFormatter;", "dbDateFormat", "date", "Ljava/util/Date;", "dbDateParse", "endOfYearInMillis", "", "year", "", "zoneId", "Ljava/time/ZoneId;", "epochMilliToYear", "epochMilli", "getCachedDateFormat", "pattern", "locale", "Ljava/util/Locale;", "utc", "", "skeleton", "getCachedDateTimeFormatter", "getDateAndTime", "context", "Landroid/content/Context;", "getDateStringWithSkeletonPattern", "temporalAccessor", "Ljava/time/temporal/TemporalAccessor;", "getDefaultDateFor", "Ljava/util/Calendar;", "age", "getExtraShortDateString", "getFeedCardDateString", "getFeedCardShortDateString", "getMDYDateString", "getMMMMdYYYY", "getMonthOnlyDateString", "getMonthOnlyWithoutDayDateString", "getShortDateString", "localDate", "Ljava/time/LocalDate;", "getShortDayWithTimeString", "dateStr", "getTimeAndDateString", "getTimeString", "localDateTime", "Ljava/time/LocalDateTime;", "getUtcRequestDateFor", "Lorg/wikipedia/feed/model/UtcDate;", "getYMDDateString", "getYearDifferenceString", "languageCode", "getYearOnlyDateString", "iso8601DateParse", "iso8601LocalDateTimeParse", "timestamp", "startOfYearInMillis", "yearToStringWithEra", "app.lib"})
public final class DateUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.text.SimpleDateFormat> DATE_FORMATS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.time.format.DateTimeFormatter> DATE_TIME_FORMATTERS = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.DateUtil INSTANCE = null;
    
    private DateUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date iso8601DateParse(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime iso8601LocalDateTimeParse(@org.jetbrains.annotations.NotNull()
    java.lang.String timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dbDateFormat(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date dbDateParse(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeedCardDateString(int age) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeedCardShortDateString(@org.jetbrains.annotations.NotNull()
    java.util.Calendar date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMDYDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthOnlyDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthOnlyWithoutDayDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearOnlyDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYMDDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMMMMdYYYY(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    private final java.lang.String getExtraShortDateString(java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime localDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortDayWithTimeString(@org.jetbrains.annotations.NotNull()
    java.lang.String dateStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortDayWithTimeString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeAndDateString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeAndDateString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String dateStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateAndTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    private final java.lang.String getDateStringWithSkeletonPattern(java.util.Date date, java.lang.String pattern) {
        return null;
    }
    
    private final java.lang.String getDateStringWithSkeletonPattern(java.time.temporal.TemporalAccessor temporalAccessor, java.lang.String pattern) {
        return null;
    }
    
    private final java.text.SimpleDateFormat getCachedDateFormat(java.lang.String pattern, java.util.Locale locale, boolean utc, boolean skeleton) {
        return null;
    }
    
    private final java.time.format.DateTimeFormatter getCachedDateTimeFormatter(java.lang.String pattern, java.util.Locale locale, boolean utc, boolean skeleton) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortDateString(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate localDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.model.UtcDate getUtcRequestDateFor(int age) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getDefaultDateFor(int age) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String yearToStringWithEra(int year) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearDifferenceString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int year, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    public final long startOfYearInMillis(int year, @org.jetbrains.annotations.NotNull()
    java.time.ZoneId zoneId) {
        return 0L;
    }
    
    public final long endOfYearInMillis(int year, @org.jetbrains.annotations.NotNull()
    java.time.ZoneId zoneId) {
        return 0L;
    }
    
    public final int epochMilliToYear(long epochMilli, @org.jetbrains.annotations.NotNull()
    java.time.ZoneId zoneId) {
        return 0;
    }
}