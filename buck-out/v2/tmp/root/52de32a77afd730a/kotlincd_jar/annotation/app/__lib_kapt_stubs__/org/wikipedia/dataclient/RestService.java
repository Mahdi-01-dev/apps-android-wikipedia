package org.wikipedia.dataclient;

import org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.dataclient.page.TalkPage;
import org.wikipedia.dataclient.restbase.Metrics;
import org.wikipedia.dataclient.restbase.RbDefinition;
import org.wikipedia.feed.aggregated.AggregatedFeedContent;
import org.wikipedia.feed.announcement.AnnouncementList;
import org.wikipedia.feed.configure.FeedAvailability;
import org.wikipedia.feed.onthisday.OnThisDay;
import org.wikipedia.gallery.MediaList;
import org.wikipedia.readinglist.sync.SyncedReadingLists;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponseBatch;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry;
import org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntryBatch;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 N2\u00020\u0001:\u0001NJ0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\'J0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000eH\'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\'J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J\u000e\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u0018J6\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010!J*\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#2\b\b\u0001\u0010\u001e\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010&J>\u0010\'\u001a\u00020(2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010!J\"\u0010-\u001a\u00020.2\b\b\u0001\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u00100JH\u0010-\u001a\u00020.2\b\b\u0001\u0010\u001e\u001a\u00020\b2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u00105J\"\u00106\u001a\u0002072\b\b\u0001\u0010*\u001a\u0002082\b\b\u0001\u0010+\u001a\u000208H\u00a7@\u00a2\u0006\u0002\u00109JT\u0010:\u001a\u00020;2\b\b\u0001\u0010\u001e\u001a\u00020\b2\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010=J\u000e\u0010>\u001a\u00020;H\u00a7@\u00a2\u0006\u0002\u0010\u0018J&\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\bH\'J$\u0010C\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\bH\'J\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020@0\u00032\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\bH\'J2\u0010E\u001a\b\u0012\u0004\u0012\u00020@0\u00032\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\bH\'JZ\u0010G\u001a\b\u0012\u0004\u0012\u00020;0H2\b\b\u0001\u0010\u001e\u001a\u00020\b2\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010=J\u001a\u0010I\u001a\u00020J2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\bH\u00a7@\u00a2\u0006\u0002\u0010&J\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J0\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\'\u00a8\u0006O"}, d2 = {"Lorg/wikipedia/dataclient/RestService;", "", "addEntriesToReadingList", "Lretrofit2/Call;", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponseBatch;", "listId", "", "token", "", "batch", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntryBatch;", "addEntryToReadingList", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponse;", "entry", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "createReadingList", "list", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingList;", "deleteEntryFromReadingList", "", "entryId", "deleteReadingList", "feedAvailability", "Lorg/wikipedia/feed/configure/FeedAvailability;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnnouncements", "Lorg/wikipedia/feed/announcement/AnnouncementList;", "getArticleMetrics", "Lorg/wikipedia/dataclient/restbase/Metrics;", "wikiAuthority", "title", "fromDate", "toDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefinition", "", "", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Usage;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeedFeatured", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "year", "month", "day", "lang", "getMediaList", "Lorg/wikipedia/gallery/MediaList;", "revision", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheControl", "saveHeader", "langHeader", "titleHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOnThisDay", "Lorg/wikipedia/feed/onthisday/OnThisDay;", "", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "referrerUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomSummary", "getReadingListChangesSince", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists;", "iso8601Date", "next", "getReadingListEntries", "getReadingLists", "getReadingListsContaining", "project", "getSummaryResponse", "Lretrofit2/Response;", "getTalkPage", "Lorg/wikipedia/dataclient/page/TalkPage;", "setupReadingLists", "tearDownReadingLists", "updateReadingList", "Companion", "app.lib"})
public abstract interface RestService {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REST_API_PREFIX = "/api/rest_v1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_PREFIX = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_SUMMARY = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\"";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_DEFINITION = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/definition/0.7.2\"";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_MOBILE_HTML = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Mobile-HTML/1.2.1\"";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_HTML_ENDPOINT = "page/mobile-html/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_HTML_PREVIEW_ENDPOINT = "transform/wikitext/to/mobile-html/";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.RestService.Companion Companion = null;
    
    @retrofit2.http.Headers(value = {"x-analytics: preview=1", "Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    @retrofit2.http.GET(value = "page/summary/{title}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPageSummary(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Header(value = "Referer")
    @org.jetbrains.annotations.Nullable()
    java.lang.String referrerUrl, @retrofit2.http.Header(value = "Cache-Control")
    @org.jetbrains.annotations.Nullable()
    java.lang.String cacheControl, @retrofit2.http.Header(value = "X-Offline-Save")
    @org.jetbrains.annotations.Nullable()
    java.lang.String saveHeader, @retrofit2.http.Header(value = "X-Offline-Lang")
    @org.jetbrains.annotations.Nullable()
    java.lang.String langHeader, @retrofit2.http.Header(value = "X-Offline-Title")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titleHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.page.PageSummary> $completion);
    
    @retrofit2.http.Headers(value = {"x-analytics: preview=1", "Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    @retrofit2.http.GET(value = "page/summary/{title}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSummaryResponse(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Header(value = "Referer")
    @org.jetbrains.annotations.Nullable()
    java.lang.String referrerUrl, @retrofit2.http.Header(value = "Cache-Control")
    @org.jetbrains.annotations.Nullable()
    java.lang.String cacheControl, @retrofit2.http.Header(value = "X-Offline-Save")
    @org.jetbrains.annotations.Nullable()
    java.lang.String saveHeader, @retrofit2.http.Header(value = "X-Offline-Lang")
    @org.jetbrains.annotations.Nullable()
    java.lang.String langHeader, @retrofit2.http.Header(value = "X-Offline-Title")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titleHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.wikipedia.dataclient.page.PageSummary>> $completion);
    
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/definition/0.7.2\""})
    @retrofit2.http.GET(value = "page/definition/{title}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDefinition(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<org.wikipedia.dataclient.restbase.RbDefinition.Usage>>> $completion);
    
    @retrofit2.http.GET(value = "page/random/summary")
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRandomSummary(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.page.PageSummary> $completion);
    
    @retrofit2.http.GET(value = "page/media-list/{title}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMediaList(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Header(value = "Cache-Control")
    @org.jetbrains.annotations.Nullable()
    java.lang.String cacheControl, @retrofit2.http.Header(value = "X-Offline-Save")
    @org.jetbrains.annotations.Nullable()
    java.lang.String saveHeader, @retrofit2.http.Header(value = "X-Offline-Lang")
    @org.jetbrains.annotations.Nullable()
    java.lang.String langHeader, @retrofit2.http.Header(value = "X-Offline-Title")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titleHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.gallery.MediaList> $completion);
    
    @retrofit2.http.GET(value = "page/media-list/{title}/{revision}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMediaList(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Path(value = "revision")
    long revision, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.gallery.MediaList> $completion);
    
    @retrofit2.http.GET(value = "feed/onthisday/events/{mm}/{dd}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOnThisDay(@retrofit2.http.Path(value = "mm")
    int month, @retrofit2.http.Path(value = "dd")
    int day, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.feed.onthisday.OnThisDay> $completion);
    
    @retrofit2.http.GET(value = "feed/announcements")
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/announcements/0.1.0\""})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAnnouncements(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.feed.announcement.AnnouncementList> $completion);
    
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/aggregated-feed/0.5.0\""})
    @retrofit2.http.GET(value = "feed/featured/{year}/{month}/{day}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFeedFeatured(@retrofit2.http.Path(value = "year")
    @org.jetbrains.annotations.Nullable()
    java.lang.String year, @retrofit2.http.Path(value = "month")
    @org.jetbrains.annotations.Nullable()
    java.lang.String month, @retrofit2.http.Path(value = "day")
    @org.jetbrains.annotations.Nullable()
    java.lang.String day, @retrofit2.http.Query(value = "lang")
    @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.feed.aggregated.AggregatedFeedContent> $completion);
    
    @retrofit2.http.GET(value = "feed/availability")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object feedAvailability(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.feed.configure.FeedAvailability> $completion);
    
    @retrofit2.http.POST(value = "data/lists/setup")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<kotlin.Unit> setupReadingLists(@retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    @retrofit2.http.POST(value = "data/lists/teardown")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<kotlin.Unit> tearDownReadingLists(@retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "data/lists/")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingLists(@retrofit2.http.Query(value = "next")
    @org.jetbrains.annotations.Nullable()
    java.lang.String next);
    
    @retrofit2.http.POST(value = "data/lists/")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse> createReadingList(@retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList list);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.PUT(value = "data/lists/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<kotlin.Unit> updateReadingList(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList list);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.DELETE(value = "data/lists/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<kotlin.Unit> deleteReadingList(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "data/lists/changes/since/{date}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingListChangesSince(@retrofit2.http.Path(value = "date")
    @org.jetbrains.annotations.Nullable()
    java.lang.String iso8601Date, @retrofit2.http.Query(value = "next")
    @org.jetbrains.annotations.Nullable()
    java.lang.String next);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "data/lists/pages/{project}/{title}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingListsContaining(@retrofit2.http.Path(value = "project")
    @org.jetbrains.annotations.Nullable()
    java.lang.String project, @retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.Nullable()
    java.lang.String title, @retrofit2.http.Query(value = "next")
    @org.jetbrains.annotations.Nullable()
    java.lang.String next);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "data/lists/{id}/entries/")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingListEntries(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Query(value = "next")
    @org.jetbrains.annotations.Nullable()
    java.lang.String next);
    
    @retrofit2.http.POST(value = "data/lists/{id}/entries/")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse> addEntryToReadingList(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry entry);
    
    @retrofit2.http.POST(value = "data/lists/{id}/entries/batch")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponseBatch> addEntriesToReadingList(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntryBatch batch);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.DELETE(value = "data/lists/{id}/entries/{entry_id}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<kotlin.Unit> deleteEntryFromReadingList(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Path(value = "entry_id")
    long entryId, @retrofit2.http.Query(value = "csrf_token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "page/talk/{title}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTalkPage(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.page.TalkPage> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "metrics/edits/per-page/{wikiAuthority}/{title}/all-editor-types/monthly/{fromDate}/{toDate}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getArticleMetrics(@retrofit2.http.Path(value = "wikiAuthority")
    @org.jetbrains.annotations.NotNull()
    java.lang.String wikiAuthority, @retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Path(value = "fromDate")
    @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @retrofit2.http.Path(value = "toDate")
    @org.jetbrains.annotations.NotNull()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.restbase.Metrics> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/RestService$Companion;", "", "()V", "ACCEPT_HEADER_DEFINITION", "", "ACCEPT_HEADER_MOBILE_HTML", "ACCEPT_HEADER_PREFIX", "ACCEPT_HEADER_SUMMARY", "PAGE_HTML_ENDPOINT", "PAGE_HTML_PREVIEW_ENDPOINT", "REST_API_PREFIX", "app.lib"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REST_API_PREFIX = "/api/rest_v1";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_PREFIX = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_SUMMARY = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\"";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_DEFINITION = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/definition/0.7.2\"";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_MOBILE_HTML = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Mobile-HTML/1.2.1\"";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGE_HTML_ENDPOINT = "page/mobile-html/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGE_HTML_PREVIEW_ENDPOINT = "transform/wikitext/to/mobile-html/";
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}