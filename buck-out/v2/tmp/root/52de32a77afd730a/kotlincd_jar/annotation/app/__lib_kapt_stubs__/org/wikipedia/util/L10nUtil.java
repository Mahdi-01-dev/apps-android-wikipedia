package org.wikipedia.util;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.core.os.ConfigurationCompat;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.page.PageTitle;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/util/L10nUtil;", "", "()V", "isDeviceRTL", "", "()Z", "getDesiredLanguageCode", "", "langCode", "getDesiredLocale", "Ljava/util/Locale;", "desiredLocale", "getPagesForLanguageVariant", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "list", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "shouldUpdateExtracts", "(Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "resId", "", "languageCode", "title", "Lorg/wikipedia/page/PageTitle;", "getStringForLocale", "context", "Landroid/content/Context;", "targetLocale", "isLangRTL", "lang", "setDesiredLocale", "", "config", "Landroid/content/res/Configuration;", "app.lib"})
public final class L10nUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.L10nUtil INSTANCE = null;
    
    private L10nUtil() {
        super();
    }
    
    public final boolean isDeviceRTL() {
        return false;
    }
    
    public final boolean isLangRTL(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final java.lang.String getString(@androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, @androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringForLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Locale targetLocale, @androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    private final java.util.Locale getDesiredLocale(java.util.Locale desiredLocale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDesiredLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return null;
    }
    
    public final void setDesiredLocale(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration config, @org.jetbrains.annotations.NotNull()
    java.util.Locale desiredLocale) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPagesForLanguageVariant(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, boolean shouldUpdateExtracts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends org.wikipedia.dataclient.page.PageSummary>> $completion) {
        return null;
    }
}