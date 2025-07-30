package org.wikipedia.util;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.icu.text.CompactDecimalFormat;
import android.location.Location;
import android.os.Build;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.IntRange;
import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;
import org.wikipedia.richtext.CustomHtmlParser;
import org.wikipedia.staticdata.UserAliasData;
import java.nio.charset.StandardCharsets;
import java.text.Collator;
import java.text.Normalizer;
import java.util.EnumSet;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\"\u001a\u00020\u00042\b\b\u0001\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020$J\u0016\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010*\u001a\u00020+J\u001e\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004J\u001a\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020$J\u0018\u00105\u001a\u0002062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u00107\u001a\u00020$H\u0002J\u0016\u00108\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015J\u000e\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004J\u001a\u0010<\u001a\u0002062\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010>\u001a\u0004\u0018\u00010\u0004J\u000e\u0010?\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010@\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010B\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010C\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010D\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004J \u0010G\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0004J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020P2\u0006\u0010;\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006Q"}, d2 = {"Lorg/wikipedia/util/StringUtil;", "", "()V", "CSV_DELIMITER", "", "SEARCH_REGEX_OPTIONS", "", "Lkotlin/text/RegexOption;", "getSEARCH_REGEX_OPTIONS", "()Ljava/util/Set;", "addUnderscores", "text", "boldenKeywordText", "", "textView", "Landroid/widget/TextView;", "parentText", "searchQuery", "capitalize", "str", "csvToList", "", "csv", "dbNameToLangCode", "wikiDbName", "delimiterStringToList", "delimitedString", "delimiter", "fromHtml", "Landroid/text/Spanned;", "source", "geoHackToLocation", "Landroid/location/Location;", "params", "getBase26String", "number", "", "getDiffBytesText", "context", "Landroid/content/Context;", "diffSize", "getPageViewText", "pageViews", "", "highlightEditText", "editText", "Landroid/widget/EditText;", "highlightText", "indexOf", "original", "search", "intToHexStr", "i", "isIndexInsideHtmlTag", "", "index", "listToCsv", "list", "md5string", "s", "normalizedEquals", "str1", "str2", "removeCiteMarkup", "removeHTMLTags", "removeNamespace", "removeSectionAnchor", "removeStyleTags", "removeUnderscores", "sanitizeAbuseFilterCode", "code", "setHighlightedAndBoldenedText", "", "query", "userPageTitleFromName", "Lorg/wikipedia/page/PageTitle;", "userName", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "utf8Indices", "", "app.lib"})
public final class StringUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CSV_DELIMITER = ",";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<kotlin.text.RegexOption> SEARCH_REGEX_OPTIONS = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.StringUtil INSTANCE = null;
    
    private StringUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<kotlin.text.RegexOption> getSEARCH_REGEX_OPTIONS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String listToCsv(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> csvToList(@org.jetbrains.annotations.NotNull()
    java.lang.String csv) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> delimiterStringToList(@org.jetbrains.annotations.NotNull()
    java.lang.String delimitedString, @org.jetbrains.annotations.NotNull()
    java.lang.String delimiter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String md5string(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String intToHexStr(int i) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String addUnderscores(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeUnderscores(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dbNameToLangCode(@org.jetbrains.annotations.NotNull()
    java.lang.String wikiDbName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeSectionAnchor(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeNamespace(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeHTMLTags(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeStyleTags(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String removeCiteMarkup(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sanitizeAbuseFilterCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public final boolean normalizedEquals(@org.jetbrains.annotations.Nullable()
    java.lang.String str1, @org.jetbrains.annotations.Nullable()
    java.lang.String str2) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String source) {
        return null;
    }
    
    public final void highlightEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    java.lang.String parentText, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText) {
    }
    
    public final void boldenKeywordText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.String parentText, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void setHighlightedAndBoldenedText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence parentText, @org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    private final boolean isIndexInsideHtmlTag(java.lang.String text, int index) {
        return false;
    }
    
    private final int indexOf(java.lang.String original, java.lang.String search) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase26String(@androidx.annotation.IntRange(from = 1L)
    int number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] utf8Indices(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle userPageTitleFromName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPageViewText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long pageViews) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiffBytesText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int diffSize) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String capitalize(@org.jetbrains.annotations.Nullable()
    java.lang.String str) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location geoHackToLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String params) {
        return null;
    }
}