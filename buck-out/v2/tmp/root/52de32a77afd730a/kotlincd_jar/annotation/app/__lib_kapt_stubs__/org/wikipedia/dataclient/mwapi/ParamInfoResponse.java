package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "paraminfo", "Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$ParamInfo;", "getParaminfo", "()Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$ParamInfo;", "Module", "ParamInfo", "Parameter", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class ParamInfoResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.ParamInfoResponse.ParamInfo paraminfo = null;
    
    public ParamInfoResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.ParamInfoResponse.ParamInfo getParaminfo() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$Module;", "", "()V", "classname", "", "getClassname", "()Ljava/lang/String;", "name", "getName", "parameters", "", "Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$Parameter;", "getParameters", "()Ljava/util/List;", "path", "getPath", "source", "getSource", "app.lib"})
    public static final class Module {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String classname = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String path = "";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = "";
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.mwapi.ParamInfoResponse.Parameter> parameters = null;
        
        public Module() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClassname() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPath() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.mwapi.ParamInfoResponse.Parameter> getParameters() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$ParamInfo;", "", "()V", "modules", "", "Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$Module;", "getModules", "()Ljava/util/List;", "app.lib"})
    public static final class ParamInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.mwapi.ParamInfoResponse.Module> modules = null;
        
        public ParamInfo() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.mwapi.ParamInfoResponse.Module> getModules() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse$Parameter;", "", "()V", "index", "", "getIndex", "()I", "multi", "", "getMulti", "()Z", "name", "", "getName", "()Ljava/lang/String;", "required", "getRequired", "type", "Lkotlinx/serialization/json/JsonElement;", "getType", "()Lkotlinx/serialization/json/JsonElement;", "typeAsEnum", "", "getTypeAsEnum", "()Ljava/util/List;", "typeAsString", "getTypeAsString", "app.lib"})
    public static final class Parameter {
        private final int index = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = "";
        private final boolean required = false;
        private final boolean multi = false;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonElement type = null;
        
        public Parameter() {
            super();
        }
        
        public final int getIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final boolean getRequired() {
            return false;
        }
        
        public final boolean getMulti() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.serialization.json.JsonElement getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTypeAsString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getTypeAsEnum() {
            return null;
        }
    }
}