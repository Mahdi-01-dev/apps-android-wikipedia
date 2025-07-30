package org.wikipedia.page;

import android.net.Uri;
import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.language.LanguageUtil;
import org.wikipedia.staticdata.ContributionsNameData;
import org.wikipedia.staticdata.MainPageNameData;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import java.util.*;

/**
 * Represents certain vital information about a page, including the title, namespace,
 * and fragment (section anchor target).  It can also contain a thumbnail URL for the
 * page, and a short description retrieved from Wikidata.
 *
 * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
 * description can be altered after construction. Therefore do NOT rely on all the fields
 * of a PageTitle to remain constant for the lifetime of the object.
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0001QB5\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB7\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fBA\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eB!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fB%\b\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011B_\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\t\u0010?\u001a\u00020\bH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Je\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010G\u001a\u00020\'2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\u0010\u0010J\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u0003H\u0002J\u0010\u0010L\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\b\u0010M\u001a\u00020NH\u0016J\u0006\u0010\u0002\u001a\u00020OJ\b\u0010P\u001a\u00020\u0003H\u0016R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\u0011\u0010&\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010(R\u0011\u0010)\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010*\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010(R\u0011\u0010,\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010(R\u0011\u0010-\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u001cR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u0011\u00101\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u001cR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u0011\u00107\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u001cR$\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0018\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u00a8\u0006R"}, d2 = {"Lorg/wikipedia/page/PageTitle;", "Landroid/os/Parcelable;", "namespace", "", "text", "fragment", "thumbUrl", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;)V", "description", "displayText", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "extract", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;)V", "title", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;)V", "_namespace", "wikiSite", "_text", "_displayText", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_displayText$annotations", "()V", "get_namespace$annotations", "get_text$annotations", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "value", "getDisplayText", "setDisplayText", "getExtract", "setExtract", "getFragment", "setFragment", "isContributions", "", "()Z", "isFilePage", "isMainPage", "isSpecial", "isUserPage", "mobileUri", "getMobileUri", "getNamespace", "setNamespace", "prefixedText", "getPrefixedText", "getText", "setText", "getThumbUrl", "setThumbUrl", "uri", "getUri", "getWikiSite$annotations", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "getUriForDomain", "domain", "getWebApiUrl", "hashCode", "", "Lorg/wikipedia/page/Namespace;", "toString", "Companion", "app.lib"})
@kotlinx.parcelize.Parcelize()
public final class PageTitle implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String _namespace;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.dataclient.WikiSite wikiSite;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String _text;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fragment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thumbUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String _displayText;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String extract;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageTitle.Companion Companion = null;
    
    private final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite component2() {
        return null;
    }
    
    private final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    private final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle copy(@org.jetbrains.annotations.Nullable()
    java.lang.String _namespace, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.lang.String _text, @org.jetbrains.annotations.Nullable()
    java.lang.String fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String _displayText, @org.jetbrains.annotations.Nullable()
    java.lang.String extract) {
        return null;
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String _namespace, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.lang.String _text, @org.jetbrains.annotations.Nullable()
    java.lang.String fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String _displayText, @org.jetbrains.annotations.Nullable()
    java.lang.String extract) {
        super();
    }
    
    @kotlinx.serialization.SerialName(value = "namespace")
    @java.lang.Deprecated()
    private static void get_namespace$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "site")
    @java.lang.Deprecated()
    public static void getWikiSite$annotations() {
    }
    
    public final void setWikiSite(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite p0) {
    }
    
    @kotlinx.serialization.SerialName(value = "text")
    @java.lang.Deprecated()
    private static void get_text$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbUrl() {
        return null;
    }
    
    public final void setThumbUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlinx.serialization.SerialName(value = "displayText")
    @java.lang.Deprecated()
    private static void get_displayText$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtract() {
        return null;
    }
    
    public final void setExtract(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayText() {
        return null;
    }
    
    public final void setDisplayText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefixedText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamespace() {
        return null;
    }
    
    public final void setNamespace(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean isFilePage() {
        return false;
    }
    
    public final boolean isSpecial() {
        return false;
    }
    
    public final boolean isUserPage() {
        return false;
    }
    
    public final boolean isMainPage() {
        return false;
    }
    
    public final boolean isContributions() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileUri() {
        return null;
    }
    
    /**
     * Notes on the `namespace` field:
     * The localised namespace of the page as a string, or null if the page is in mainspace.
     *
     * This field contains the prefix of the page's title, as opposed to the namespace ID used by
     * MediaWiki. Therefore, mainspace pages always have a null namespace, as they have no prefix,
     * and the namespace of a page will depend on the language of the wiki the user is currently
     * looking at.
     *
     * Examples:
     * * [[Manchester]] on enwiki will have a namespace of null
     * * [[Deutschland]] on dewiki will have a namespace of null
     * * [[User:Deskana]] on enwiki will have a namespace of "User"
     * * [[Utilisateur:Deskana]] on frwiki will have a namespace of "Utilisateur", even if you got
     * to the page by going to [[User:Deskana]] and having MediaWiki automatically redirect you.
     */
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String displayText) {
        super();
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String displayText, @org.jetbrains.annotations.Nullable()
    java.lang.String extract) {
        super();
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace namespace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebApiUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String fragment) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    private final java.lang.String getUriForDomain(java.lang.String domain) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/PageTitle$Companion;", "", "()V", "titleForInternalLink", "Lorg/wikipedia/page/PageTitle;", "internalLink", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "titleForUri", "uri", "Landroid/net/Uri;", "withSeparateFragment", "prefixedText", "fragment", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle withSeparateFragment(@org.jetbrains.annotations.NotNull()
        java.lang.String prefixedText, @org.jetbrains.annotations.Nullable()
        java.lang.String fragment, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle titleForInternalLink(@org.jetbrains.annotations.Nullable()
        java.lang.String internalLink, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle titleForUri(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
    }
}