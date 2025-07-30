package org.wikipedia.page;

import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.language.AppLanguageLookUpTable;
import org.wikipedia.model.EnumCode;
import org.wikipedia.staticdata.*;
import java.util.*;

/**
 * An enumeration describing the different possible namespace codes. Do not attempt to use this
 * class to preserve URL path information such as Talk: or User: or localization.
 * @see [Wikipedia:Namespace](https://en.wikipedia.org/wiki/Wikipedia:Namespace)
 * @see [Extension default namespaces](https://www.mediawiki.org/wiki/Extension_default_namespaces)
 * @see [Manual:Namespace](https://www.mediawiki.org/wiki/Manual:Namespace.Built-in_namespaces)
 * @see [Namespaces reported by API](https://en.wikipedia.org/w/api.php?action=query&meta=siteinfo&siprop=namespaces|namespacealiases)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b~\b\u0086\u0081\u0002\u0018\u0000 \u0084\u00012\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u0084\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001\u00a8\u0006\u0085\u0001"}, d2 = {"Lorg/wikipedia/page/Namespace;", "", "Lorg/wikipedia/model/EnumCode;", "code", "", "(Ljava/lang/String;II)V", "file", "", "main", "special", "talk", "user", "userTalk", "MEDIA", "SPECIAL", "MAIN", "TALK", "USER", "USER_TALK", "PROJECT", "PROJECT_TALK", "FILE", "FILE_TALK", "MEDIAWIKI", "MEDIAWIKI_TALK", "TEMPLATE", "TEMPLATE_TALK", "HELP", "HELP_TALK", "CATEGORY", "CATEGORY_TALK", "THREAD", "THREAD_TALK", "SUMMARY", "SUMMARY_TALK", "PORTAL", "PORTAL_TALK", "PROPERTY", "PROPERTY_TALK", "TYPE", "TYPE_TALK", "FORM", "FORM_TALK", "BOOK", "BOOK_TALK", "FORUM", "FORUM_TALK", "DRAFT", "DRAFT_TALK", "USER_GROUP", "ACL", "FILTER", "FILTER_TALK", "USER_WIKI", "USER_WIKI_TALK", "USER_PROFILE", "USER_PROFILE_TALK", "ANNOTATION", "ANNOTATION_TALK", "PAGE", "PAGE_TALK", "INDEX", "INDEX_TALK", "MATH", "MATH_TALK", "WIDGET", "WIDGET_TALK", "JS_APPLET", "JS_APPLET_TALK", "POLL", "POLL_TALK", "COURSE", "COURSE_TALK", "MAPS_LAYER", "MAPS_LAYER_TALK", "QUIZ", "QUIZ_TALK", "EDUCATION_PROGRAM", "EDUCATION_PROGRAM_TALK", "BOILERPLATE", "BOILERPLATE_TALK", "CAMPAIGN", "CAMPAIGN_TALK", "SCHEMA", "SCHEMA_TALK", "JSON_CONFIG", "JSON_CONFIG_TALK", "GRAPH", "GRAPH_TALK", "JSON_DATA", "JSON_DATA_TALK", "NOVA_RESOURCE", "NOVA_RESOURCE_TALK", "GW_TOOLSET", "GW_TOOLSET_TALK", "BLOG", "BLOG_TALK", "USER_BOX", "USER_BOX_TALK", "LINK", "LINK_TALK", "TIMED_TEXT", "TIMED_TEXT_TALK", "GIT_ACCESS_ROOT", "GIT_ACCESS_ROOT_TALK", "INTERPRETATION", "INTERPRETATION_TALK", "MUSTACHE", "MUSTACHE_TALK", "JADE", "JADE_TALK", "R", "R_TALK", "MODULE", "MODULE_TALK", "SECURE_POLL", "SECURE_POLL_TALK", "COMMENT_STREAM", "COMMENT_STREAM_TALK", "CN_BANNER", "CN_BANNER_TALK", "GRAM", "GRAM_TALK", "TRANSLATIONS", "TRANSLATIONS_TALK", "EVENT", "EVENT_TALK", "GADGET", "GADGET_TALK", "GADGET_DEFINITION", "GADGET_DEFINITION_TALK", "TOPIC", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public enum Namespace implements org.wikipedia.model.EnumCode {
    /*public static final*/ MEDIA /* = new MEDIA(0) */,
    /*public static final*/ SPECIAL /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/page/Namespace$SPECIAL;", "Lorg/wikipedia/page/Namespace;", "talk", "", "app.lib"}) SPECIAL(0){
    
    SPECIAL() {
    }
    
    @java.lang.Override
    public boolean talk() {
        return false;
    }
} */,
    /*public static final*/ MAIN /* = new MAIN(0) */,
    /*public static final*/ TALK /* = new TALK(0) */,
    /*public static final*/ USER /* = new USER(0) */,
    /*public static final*/ USER_TALK /* = new USER_TALK(0) */,
    /*public static final*/ PROJECT /* = new PROJECT(0) */,
    /*public static final*/ PROJECT_TALK /* = new PROJECT_TALK(0) */,
    /*public static final*/ FILE /* = new FILE(0) */,
    /*public static final*/ FILE_TALK /* = new FILE_TALK(0) */,
    /*public static final*/ MEDIAWIKI /* = new MEDIAWIKI(0) */,
    /*public static final*/ MEDIAWIKI_TALK /* = new MEDIAWIKI_TALK(0) */,
    /*public static final*/ TEMPLATE /* = new TEMPLATE(0) */,
    /*public static final*/ TEMPLATE_TALK /* = new TEMPLATE_TALK(0) */,
    /*public static final*/ HELP /* = new HELP(0) */,
    /*public static final*/ HELP_TALK /* = new HELP_TALK(0) */,
    /*public static final*/ CATEGORY /* = new CATEGORY(0) */,
    /*public static final*/ CATEGORY_TALK /* = new CATEGORY_TALK(0) */,
    /*public static final*/ THREAD /* = new THREAD(0) */,
    /*public static final*/ THREAD_TALK /* = new THREAD_TALK(0) */,
    /*public static final*/ SUMMARY /* = new SUMMARY(0) */,
    /*public static final*/ SUMMARY_TALK /* = new SUMMARY_TALK(0) */,
    /*public static final*/ PORTAL /* = new PORTAL(0) */,
    /*public static final*/ PORTAL_TALK /* = new PORTAL_TALK(0) */,
    /*public static final*/ PROPERTY /* = new PROPERTY(0) */,
    /*public static final*/ PROPERTY_TALK /* = new PROPERTY_TALK(0) */,
    /*public static final*/ TYPE /* = new TYPE(0) */,
    /*public static final*/ TYPE_TALK /* = new TYPE_TALK(0) */,
    /*public static final*/ FORM /* = new FORM(0) */,
    /*public static final*/ FORM_TALK /* = new FORM_TALK(0) */,
    /*public static final*/ BOOK /* = new BOOK(0) */,
    /*public static final*/ BOOK_TALK /* = new BOOK_TALK(0) */,
    /*public static final*/ FORUM /* = new FORUM(0) */,
    /*public static final*/ FORUM_TALK /* = new FORUM_TALK(0) */,
    /*public static final*/ DRAFT /* = new DRAFT(0) */,
    /*public static final*/ DRAFT_TALK /* = new DRAFT_TALK(0) */,
    /*public static final*/ USER_GROUP /* = new USER_GROUP(0) */,
    /*public static final*/ ACL /* = new ACL(0) */,
    /*public static final*/ FILTER /* = new FILTER(0) */,
    /*public static final*/ FILTER_TALK /* = new FILTER_TALK(0) */,
    /*public static final*/ USER_WIKI /* = new USER_WIKI(0) */,
    /*public static final*/ USER_WIKI_TALK /* = new USER_WIKI_TALK(0) */,
    /*public static final*/ USER_PROFILE /* = new USER_PROFILE(0) */,
    /*public static final*/ USER_PROFILE_TALK /* = new USER_PROFILE_TALK(0) */,
    /*public static final*/ ANNOTATION /* = new ANNOTATION(0) */,
    /*public static final*/ ANNOTATION_TALK /* = new ANNOTATION_TALK(0) */,
    /*public static final*/ PAGE /* = new PAGE(0) */,
    /*public static final*/ PAGE_TALK /* = new PAGE_TALK(0) */,
    /*public static final*/ INDEX /* = new INDEX(0) */,
    /*public static final*/ INDEX_TALK /* = new INDEX_TALK(0) */,
    /*public static final*/ MATH /* = new MATH(0) */,
    /*public static final*/ MATH_TALK /* = new MATH_TALK(0) */,
    /*public static final*/ WIDGET /* = new WIDGET(0) */,
    /*public static final*/ WIDGET_TALK /* = new WIDGET_TALK(0) */,
    /*public static final*/ JS_APPLET /* = new JS_APPLET(0) */,
    /*public static final*/ JS_APPLET_TALK /* = new JS_APPLET_TALK(0) */,
    /*public static final*/ POLL /* = new POLL(0) */,
    /*public static final*/ POLL_TALK /* = new POLL_TALK(0) */,
    /*public static final*/ COURSE /* = new COURSE(0) */,
    /*public static final*/ COURSE_TALK /* = new COURSE_TALK(0) */,
    /*public static final*/ MAPS_LAYER /* = new MAPS_LAYER(0) */,
    /*public static final*/ MAPS_LAYER_TALK /* = new MAPS_LAYER_TALK(0) */,
    /*public static final*/ QUIZ /* = new QUIZ(0) */,
    /*public static final*/ QUIZ_TALK /* = new QUIZ_TALK(0) */,
    /*public static final*/ EDUCATION_PROGRAM /* = new EDUCATION_PROGRAM(0) */,
    /*public static final*/ EDUCATION_PROGRAM_TALK /* = new EDUCATION_PROGRAM_TALK(0) */,
    /*public static final*/ BOILERPLATE /* = new BOILERPLATE(0) */,
    /*public static final*/ BOILERPLATE_TALK /* = new BOILERPLATE_TALK(0) */,
    /*public static final*/ CAMPAIGN /* = new CAMPAIGN(0) */,
    /*public static final*/ CAMPAIGN_TALK /* = new CAMPAIGN_TALK(0) */,
    /*public static final*/ SCHEMA /* = new SCHEMA(0) */,
    /*public static final*/ SCHEMA_TALK /* = new SCHEMA_TALK(0) */,
    /*public static final*/ JSON_CONFIG /* = new JSON_CONFIG(0) */,
    /*public static final*/ JSON_CONFIG_TALK /* = new JSON_CONFIG_TALK(0) */,
    /*public static final*/ GRAPH /* = new GRAPH(0) */,
    /*public static final*/ GRAPH_TALK /* = new GRAPH_TALK(0) */,
    /*public static final*/ JSON_DATA /* = new JSON_DATA(0) */,
    /*public static final*/ JSON_DATA_TALK /* = new JSON_DATA_TALK(0) */,
    /*public static final*/ NOVA_RESOURCE /* = new NOVA_RESOURCE(0) */,
    /*public static final*/ NOVA_RESOURCE_TALK /* = new NOVA_RESOURCE_TALK(0) */,
    /*public static final*/ GW_TOOLSET /* = new GW_TOOLSET(0) */,
    /*public static final*/ GW_TOOLSET_TALK /* = new GW_TOOLSET_TALK(0) */,
    /*public static final*/ BLOG /* = new BLOG(0) */,
    /*public static final*/ BLOG_TALK /* = new BLOG_TALK(0) */,
    /*public static final*/ USER_BOX /* = new USER_BOX(0) */,
    /*public static final*/ USER_BOX_TALK /* = new USER_BOX_TALK(0) */,
    /*public static final*/ LINK /* = new LINK(0) */,
    /*public static final*/ LINK_TALK /* = new LINK_TALK(0) */,
    /*public static final*/ TIMED_TEXT /* = new TIMED_TEXT(0) */,
    /*public static final*/ TIMED_TEXT_TALK /* = new TIMED_TEXT_TALK(0) */,
    /*public static final*/ GIT_ACCESS_ROOT /* = new GIT_ACCESS_ROOT(0) */,
    /*public static final*/ GIT_ACCESS_ROOT_TALK /* = new GIT_ACCESS_ROOT_TALK(0) */,
    /*public static final*/ INTERPRETATION /* = new INTERPRETATION(0) */,
    /*public static final*/ INTERPRETATION_TALK /* = new INTERPRETATION_TALK(0) */,
    /*public static final*/ MUSTACHE /* = new MUSTACHE(0) */,
    /*public static final*/ MUSTACHE_TALK /* = new MUSTACHE_TALK(0) */,
    /*public static final*/ JADE /* = new JADE(0) */,
    /*public static final*/ JADE_TALK /* = new JADE_TALK(0) */,
    /*public static final*/ R /* = new R(0) */,
    /*public static final*/ R_TALK /* = new R_TALK(0) */,
    /*public static final*/ MODULE /* = new MODULE(0) */,
    /*public static final*/ MODULE_TALK /* = new MODULE_TALK(0) */,
    /*public static final*/ SECURE_POLL /* = new SECURE_POLL(0) */,
    /*public static final*/ SECURE_POLL_TALK /* = new SECURE_POLL_TALK(0) */,
    /*public static final*/ COMMENT_STREAM /* = new COMMENT_STREAM(0) */,
    /*public static final*/ COMMENT_STREAM_TALK /* = new COMMENT_STREAM_TALK(0) */,
    /*public static final*/ CN_BANNER /* = new CN_BANNER(0) */,
    /*public static final*/ CN_BANNER_TALK /* = new CN_BANNER_TALK(0) */,
    /*public static final*/ GRAM /* = new GRAM(0) */,
    /*public static final*/ GRAM_TALK /* = new GRAM_TALK(0) */,
    /*public static final*/ TRANSLATIONS /* = new TRANSLATIONS(0) */,
    /*public static final*/ TRANSLATIONS_TALK /* = new TRANSLATIONS_TALK(0) */,
    /*public static final*/ EVENT /* = new EVENT(0) */,
    /*public static final*/ EVENT_TALK /* = new EVENT_TALK(0) */,
    /*public static final*/ GADGET /* = new GADGET(0) */,
    /*public static final*/ GADGET_TALK /* = new GADGET_TALK(0) */,
    /*public static final*/ GADGET_DEFINITION /* = new GADGET_DEFINITION(0) */,
    /*public static final*/ GADGET_DEFINITION_TALK /* = new GADGET_DEFINITION_TALK(0) */,
    /*public static final*/ TOPIC /* = new TOPIC(0) */;
    private final int code = 0;
    private static final int TALK_MASK = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.Namespace.Companion Companion = null;
    
    Namespace(int code) {
    }
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    public final boolean special() {
        return false;
    }
    
    public final boolean user() {
        return false;
    }
    
    public final boolean userTalk() {
        return false;
    }
    
    public final boolean main() {
        return false;
    }
    
    public final boolean file() {
        return false;
    }
    
    public boolean talk() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.Namespace fromLegacyString(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.Namespace of(int code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.page.Namespace> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/page/Namespace$Companion;", "", "()V", "TALK_MASK", "", "fromLegacyString", "Lorg/wikipedia/page/Namespace;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "name", "", "of", "code", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.Namespace fromLegacyString(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
        java.lang.String name) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.Namespace of(int code) {
            return null;
        }
    }
}