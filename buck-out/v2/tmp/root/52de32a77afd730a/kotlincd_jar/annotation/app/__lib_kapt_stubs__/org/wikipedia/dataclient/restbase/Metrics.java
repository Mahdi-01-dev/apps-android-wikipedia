package org.wikipedia.dataclient.restbase;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/restbase/Metrics;", "", "()V", "firstItem", "Lorg/wikipedia/dataclient/restbase/Metrics$Items;", "getFirstItem", "()Lorg/wikipedia/dataclient/restbase/Metrics$Items;", "items", "", "getItems", "()Ljava/util/List;", "Items", "Results", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class Metrics {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.restbase.Metrics.Items> items = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.restbase.Metrics.Items firstItem = null;
    
    public Metrics() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.restbase.Metrics.Items> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.restbase.Metrics.Items getFirstItem() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/dataclient/restbase/Metrics$Items;", "", "()V", "editorType", "", "getEditorType$annotations", "getEditorType", "()Ljava/lang/String;", "granularity", "getGranularity", "pageTitle", "getPageTitle$annotations", "getPageTitle", "project", "getProject", "results", "", "Lorg/wikipedia/dataclient/restbase/Metrics$Results;", "getResults", "()Ljava/util/List;", "app.lib"})
    public static final class Items {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String project = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String editorType = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pageTitle = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String granularity = "";
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.restbase.Metrics.Results> results = null;
        
        public Items() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getProject() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEditorType() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "editor-type")
        @java.lang.Deprecated()
        public static void getEditorType$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPageTitle() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "page-title")
        @java.lang.Deprecated()
        public static void getPageTitle$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGranularity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.restbase.Metrics.Results> getResults() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/restbase/Metrics$Results;", "", "()V", "edits", "", "getEdits", "()I", "timestamp", "", "getTimestamp", "()Ljava/lang/String;", "app.lib"})
    public static final class Results {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String timestamp = "";
        private final int edits = 0;
        
        public Results() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTimestamp() {
            return null;
        }
        
        public final int getEdits() {
            return 0;
        }
    }
}