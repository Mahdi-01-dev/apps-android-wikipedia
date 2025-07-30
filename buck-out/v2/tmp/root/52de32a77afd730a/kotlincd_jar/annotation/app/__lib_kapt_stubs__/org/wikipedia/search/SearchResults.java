package org.wikipedia.search;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.mwapi.MwQueryResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB!\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0003J%\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/search/SearchResults;", "", "pages", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "continuation", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;", "(Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;)V", "results", "", "Lorg/wikipedia/search/SearchResult;", "(Ljava/util/List;Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;)V", "getContinuation", "()Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;", "setContinuation", "(Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app.lib"})
public final class SearchResults {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.search.SearchResult> results;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation continuation;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.search.SearchResult> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.search.SearchResults copy(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.search.SearchResult> results, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation continuation) {
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
    
    public SearchResults(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.search.SearchResult> results, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation continuation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.search.SearchResult> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.search.SearchResult> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation getContinuation() {
        return null;
    }
    
    public final void setContinuation(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation p0) {
    }
    
    public SearchResults(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage> pages, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation continuation) {
        super();
    }
    
    public SearchResults() {
        super();
    }
}