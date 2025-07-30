package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.util.log.L;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "getTemplateData", "", "Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;", "getGetTemplateData", "()Ljava/util/List;", "pages", "", "", "TemplateData", "TemplateDataParam", "app.lib"})
public final class TemplateDataResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData> pages = null;
    
    public TemplateDataResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData> getGetTemplateData() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "format", "getFormat", "getParams", "", "Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateDataParam;", "getGetParams", "()Ljava/util/Map;", "noTemplateData", "", "getNoTemplateData$annotations", "getNoTemplateData", "()Z", "params", "Lkotlinx/serialization/json/JsonElement;", "title", "getTitle", "app.lib"})
    public static final class TemplateData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = "";
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement params = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String format = null;
        private final boolean noTemplateData = false;
        
        public TemplateData() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFormat() {
            return null;
        }
        
        public final boolean getNoTemplateData() {
            return false;
        }
        
        @kotlinx.serialization.SerialName(value = "notemplatedata")
        @java.lang.Deprecated()
        public static void getNoTemplateData$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateDataParam> getGetParams() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000b\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateDataParam;", "", "()V", "aliases", "", "", "getAliases", "()Ljava/util/List;", "autoValue", "getAutoValue$annotations", "getAutoValue", "()Ljava/lang/String;", "default", "getDefault", "deprecated", "Lkotlinx/serialization/json/JsonElement;", "description", "getDescription", "example", "getExample", "isDeprecated", "", "()Z", "label", "getLabel", "required", "getRequired", "suggested", "getSuggested", "suggestedValues", "getSuggestedValues$annotations", "getSuggestedValues", "type", "getType", "app.lib"})
    public static final class TemplateDataParam {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String label = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String example = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = "";
        private final boolean required = false;
        private final boolean suggested = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String autoValue = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> suggestedValues = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> aliases = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement deprecated = null;
        
        public TemplateDataParam() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefault() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getExample() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public final boolean getRequired() {
            return false;
        }
        
        public final boolean getSuggested() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAutoValue() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "autovalue")
        @java.lang.Deprecated()
        public static void getAutoValue$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getSuggestedValues() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "suggestedvalues")
        @java.lang.Deprecated()
        public static void getSuggestedValues$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAliases() {
            return null;
        }
        
        public final boolean isDeprecated() {
            return false;
        }
    }
}