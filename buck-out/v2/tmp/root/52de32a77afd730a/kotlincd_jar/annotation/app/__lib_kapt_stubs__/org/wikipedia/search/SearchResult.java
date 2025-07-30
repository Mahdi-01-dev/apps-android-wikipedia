package org.wikipedia.search;

import android.location.Location;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.page.PageTitle;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eB1\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0010H\u00d6\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/search/SearchResult;", "", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "coordinates", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Coordinates;", "(Lorg/wikipedia/dataclient/mwapi/MwQueryPage;Lorg/wikipedia/dataclient/WikiSite;Ljava/util/List;)V", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "searchResultType", "Lorg/wikipedia/search/SearchResult$SearchResultType;", "(Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/search/SearchResult$SearchResultType;)V", "redirectFrom", "", "type", "(Lorg/wikipedia/page/PageTitle;Ljava/lang/String;Lorg/wikipedia/search/SearchResult$SearchResultType;Ljava/util/List;)V", "getCoordinates", "()Ljava/util/List;", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "getRedirectFrom", "()Ljava/lang/String;", "getType", "()Lorg/wikipedia/search/SearchResult$SearchResultType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchResultType", "app.lib"})
public final class SearchResult {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String redirectFrom = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.search.SearchResult.SearchResultType type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> coordinates = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.search.SearchResult.SearchResultType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.search.SearchResult copy(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String redirectFrom, @org.jetbrains.annotations.NotNull()
    org.wikipedia.search.SearchResult.SearchResultType type, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> coordinates) {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public SearchResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String redirectFrom, @org.jetbrains.annotations.NotNull()
    org.wikipedia.search.SearchResult.SearchResultType type, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> coordinates) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedirectFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.search.SearchResult.SearchResultType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> getCoordinates() {
        return null;
    }
    
    public SearchResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage page, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.Coordinates> coordinates) {
        super();
    }
    
    public SearchResult(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.search.SearchResult.SearchResultType searchResultType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLocation() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/search/SearchResult$SearchResultType;", "", "(Ljava/lang/String;I)V", "SEARCH", "HISTORY", "READING_LIST", "TAB_LIST", "app.lib"})
    public static enum SearchResultType {
        /*public static final*/ SEARCH /* = new SEARCH() */,
        /*public static final*/ HISTORY /* = new HISTORY() */,
        /*public static final*/ READING_LIST /* = new READING_LIST() */,
        /*public static final*/ TAB_LIST /* = new TAB_LIST() */;
        
        SearchResultType() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.search.SearchResult.SearchResultType> getEntries() {
            return null;
        }
    }
}