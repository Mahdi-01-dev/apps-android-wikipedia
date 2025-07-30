package org.wikipedia.dataclient.wikidata;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Search;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "results", "", "Lorg/wikipedia/dataclient/wikidata/Search$SearchResult;", "getResults$annotations", "getResults", "()Ljava/util/List;", "SearchResult", "app.lib"})
public final class Search extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.wikidata.Search.SearchResult> results = null;
    
    public Search() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.wikidata.Search.SearchResult> getResults() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "search")
    @java.lang.Deprecated()
    public static void getResults$annotations() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/wikidata/Search$SearchResult;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "id", "getId", "label", "getLabel", "app.lib"})
    public static final class SearchResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = "";
        
        public SearchResult() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
    }
}