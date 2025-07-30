package org.wikipedia.language;

import android.content.Context;
import org.wikipedia.R;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020%2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007R\'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\u000fR-\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\tR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/language/AppLanguageLookUpTable;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bcp47codes", "", "", "getBcp47codes", "()Ljava/util/Map;", "bcp47codes$delegate", "Lkotlin/Lazy;", "canonicalNames", "", "getCanonicalNames", "()Ljava/util/List;", "canonicalNames$delegate", "codes", "getCodes", "codes$delegate", "languageVariants", "", "getLanguageVariants", "languageVariants$delegate", "localizedNames", "getLocalizedNames", "localizedNames$delegate", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getBcp47Code", "code", "getCanonicalName", "getDefaultLanguageCodeFromVariant", "getLocalizedName", "getStringList", "id", "", "indexOfCode", "isSupportedCode", "", "Companion", "app.lib"})
public final class AppLanguageLookUpTable {
    private final android.content.res.Resources resources = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy codes$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bcp47codes$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy canonicalNames$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy localizedNames$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy languageVariants$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAIWAN_COUNTRY_CODE = "TW";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String HONG_KONG_COUNTRY_CODE = "HK";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MACAU_COUNTRY_CODE = "MO";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SINGAPORE_COUNTRY_CODE = "SG";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MALAYSIA_COUNTRY_CODE = "MY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHINA_COUNTRY_CODE = "CN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIMPLIFIED_CHINESE_LANGUAGE_CODE = "zh-hans";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRADITIONAL_CHINESE_LANGUAGE_CODE = "zh-hant";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_CN_LANGUAGE_CODE = "zh-cn";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_HK_LANGUAGE_CODE = "zh-hk";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_MO_LANGUAGE_CODE = "zh-mo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_MY_LANGUAGE_CODE = "zh-my";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_SG_LANGUAGE_CODE = "zh-sg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_TW_LANGUAGE_CODE = "zh-tw";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_YUE_LANGUAGE_CODE = "zh-yue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHINESE_LANGUAGE_CODE = "zh";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NORWEGIAN_LEGACY_LANGUAGE_CODE = "no";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NORWEGIAN_BOKMAL_LANGUAGE_CODE = "nb";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BELARUSIAN_LEGACY_LANGUAGE_CODE = "be-x-old";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BELARUSIAN_TARASK_LANGUAGE_CODE = "be-tarask";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEST_LANGUAGE_CODE = "test";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FALLBACK_LANGUAGE_CODE = "en";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.language.AppLanguageLookUpTable.Companion Companion = null;
    
    public AppLanguageLookUpTable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getBcp47codes() {
        return null;
    }
    
    private final java.util.List<java.lang.String> getCanonicalNames() {
        return null;
    }
    
    private final java.util.List<java.lang.String> getLocalizedNames() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getLanguageVariants() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCanonicalName(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalizedName(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLanguageVariants(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefaultLanguageCodeFromVariant(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBcp47Code(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public final boolean isSupportedCode(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return false;
    }
    
    public final int indexOfCode(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return 0;
    }
    
    private final java.util.List<java.lang.String> getStringList(int id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/language/AppLanguageLookUpTable$Companion;", "", "()V", "BELARUSIAN_LEGACY_LANGUAGE_CODE", "", "BELARUSIAN_TARASK_LANGUAGE_CODE", "CHINA_COUNTRY_CODE", "CHINESE_CN_LANGUAGE_CODE", "CHINESE_HK_LANGUAGE_CODE", "CHINESE_LANGUAGE_CODE", "CHINESE_MO_LANGUAGE_CODE", "CHINESE_MY_LANGUAGE_CODE", "CHINESE_SG_LANGUAGE_CODE", "CHINESE_TW_LANGUAGE_CODE", "CHINESE_YUE_LANGUAGE_CODE", "FALLBACK_LANGUAGE_CODE", "HONG_KONG_COUNTRY_CODE", "MACAU_COUNTRY_CODE", "MALAYSIA_COUNTRY_CODE", "NORWEGIAN_BOKMAL_LANGUAGE_CODE", "NORWEGIAN_LEGACY_LANGUAGE_CODE", "SIMPLIFIED_CHINESE_LANGUAGE_CODE", "SINGAPORE_COUNTRY_CODE", "TAIWAN_COUNTRY_CODE", "TEST_LANGUAGE_CODE", "TRADITIONAL_CHINESE_LANGUAGE_CODE", "chineseLocaleToWikiLanguageCode", "locale", "Ljava/util/Locale;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String chineseLocaleToWikiLanguageCode(@org.jetbrains.annotations.NotNull()
        java.util.Locale locale) {
            return null;
        }
    }
}