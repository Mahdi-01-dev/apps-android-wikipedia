package org.wikipedia.language;

import android.content.Context;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import androidx.core.os.LocaleListCompat;
import org.apache.commons.lang3.StringUtils;
import org.wikipedia.WikipediaApp;
import org.wikipedia.util.StringUtil;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/language/LanguageUtil;", "", "()V", "MAX_SUGGESTED_LANGUAGES", "", "suggestedLanguagesFromSystem", "", "", "getSuggestedLanguagesFromSystem", "()Ljava/util/List;", "convertToUselangIfNeeded", "languageCode", "formatLangCodeForButton", "isChineseVariant", "", "langCode", "localeToWikiLanguageCode", "locale", "Ljava/util/Locale;", "startsWithArticle", "text", "language", "app.lib"})
public final class LanguageUtil {
    private static final int MAX_SUGGESTED_LANGUAGES = 8;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.language.LanguageUtil INSTANCE = null;
    
    private LanguageUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSuggestedLanguagesFromSystem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String localeToWikiLanguageCode(@org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    public final boolean isChineseVariant(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return false;
    }
    
    public final boolean startsWithArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertToUselangIfNeeded(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatLangCodeForButton(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
}