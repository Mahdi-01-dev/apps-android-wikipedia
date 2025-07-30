package org.wikipedia.dataclient.restbase;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/dataclient/restbase/RbDefinition;", "", "()V", "Definition", "Usage", "app.lib"})
public final class RbDefinition {
    
    public RbDefinition() {
        super();
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/restbase/RbDefinition$Definition;", "", "definition", "", "examples", "", "(Ljava/lang/String;Ljava/util/List;)V", "getDefinition", "()Ljava/lang/String;", "getExamples", "()Ljava/util/List;", "app.lib"})
    public static final class Definition {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String definition = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> examples = null;
        
        public Definition(@org.jetbrains.annotations.NotNull()
        java.lang.String definition, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> examples) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefinition() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getExamples() {
            return null;
        }
        
        public Definition() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/restbase/RbDefinition$Usage;", "", "partOfSpeech", "", "definitions", "", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Definition;", "(Ljava/lang/String;Ljava/util/List;)V", "getDefinitions", "()Ljava/util/List;", "getPartOfSpeech", "()Ljava/lang/String;", "app.lib"})
    public static final class Usage {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String partOfSpeech = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.restbase.RbDefinition.Definition> definitions = null;
        
        public Usage(@org.jetbrains.annotations.NotNull()
        java.lang.String partOfSpeech, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.restbase.RbDefinition.Definition> definitions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPartOfSpeech() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.restbase.RbDefinition.Definition> getDefinitions() {
            return null;
        }
    }
}