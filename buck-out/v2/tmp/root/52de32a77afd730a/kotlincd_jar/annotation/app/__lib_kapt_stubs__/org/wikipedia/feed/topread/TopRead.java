package org.wikipedia.feed.topread;

import android.os.Parcelable;
import kotlinx.parcelize.IgnoredOnParcel;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.page.PageSummary;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/topread/TopRead;", "Landroid/os/Parcelable;", "date", "", "articles", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "(Ljava/lang/String;Ljava/util/List;)V", "getArticles", "()Ljava/util/List;", "getDate", "()Ljava/lang/String;", "localDate", "Ljava/time/LocalDate;", "getLocalDate$annotations", "()V", "getLocalDate", "()Ljava/time/LocalDate;", "localDate$delegate", "Lkotlin/Lazy;", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class TopRead implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.page.PageSummary> articles = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy localDate$delegate = null;
    
    public TopRead(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> articles) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getLocalDate() {
        return null;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getLocalDate$annotations() {
    }
    
    public TopRead() {
        super();
    }
}