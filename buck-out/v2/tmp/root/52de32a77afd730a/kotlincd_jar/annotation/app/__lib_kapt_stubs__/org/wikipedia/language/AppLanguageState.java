package org.wikipedia.language;

import android.content.Context;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.ReleaseUtil;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010%\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u000e\u0010(\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007J\b\u0010)\u001a\u00020\u001dH\u0002J\u0014\u0010*\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u0014\u0010,\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b\u00a8\u0006-"}, d2 = {"Lorg/wikipedia/language/AppLanguageState;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_appLanguageCodes", "", "", "_mruLanguageCodes", "appLanguageCode", "getAppLanguageCode", "()Ljava/lang/String;", "appLanguageCodes", "", "getAppLanguageCodes", "()Ljava/util/List;", "appLanguageLocalizedNames", "getAppLanguageLocalizedNames", "appLanguageLookUpTable", "Lorg/wikipedia/language/AppLanguageLookUpTable;", "appMruLanguageCodes", "getAppMruLanguageCodes", "mruLanguageCodes", "getMruLanguageCodes", "remainingSuggestedLanguageCodes", "getRemainingSuggestedLanguageCodes", "systemLanguageCode", "getSystemLanguageCode", "addAppLanguageCode", "", "code", "addMruLanguageCode", "getAppLanguageCanonicalName", "getAppLanguageLocalizedName", "getBcp47LanguageCode", "langCode", "getDefaultLanguageCode", "getLanguageCodeIndex", "", "getLanguageVariants", "getWikiLanguageName", "initAppLanguageCodes", "removeAppLanguageCodes", "codes", "setAppLanguageCodes", "app.lib"})
public final class AppLanguageState {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.language.AppLanguageLookUpTable appLanguageLookUpTable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> _mruLanguageCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> _appLanguageCodes = null;
    
    public AppLanguageState(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAppLanguageCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMruLanguageCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppLanguageCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRemainingSuggestedLanguageCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSystemLanguageCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAppMruLanguageCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppLanguageLocalizedNames() {
        return null;
    }
    
    public final void addMruLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    /**
     * @return English name if app language is supported.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppLanguageCanonicalName(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    /**
     * @return Native name if app language is supported.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppLanguageLocalizedName(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLanguageVariants(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefaultLanguageCode(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    public final int getLanguageCodeIndex(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return 0;
    }
    
    public final void addAppLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public final void setAppLanguageCodes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> codes) {
    }
    
    public final void removeAppLanguageCodes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> codes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWikiLanguageName(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBcp47LanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return null;
    }
    
    private final void initAppLanguageCodes() {
    }
}