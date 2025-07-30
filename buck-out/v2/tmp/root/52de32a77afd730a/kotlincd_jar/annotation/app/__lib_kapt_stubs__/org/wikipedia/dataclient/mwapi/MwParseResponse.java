package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwParseResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "parse", "Lorg/wikipedia/dataclient/mwapi/MwParseResponse$Parse;", "text", "", "getText", "()Ljava/lang/String;", "Parse", "app.lib"})
public final class MwParseResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.MwParseResponse.Parse parse = null;
    
    public MwParseResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/MwParseResponse$Parse;", "", "()V", "text", "", "getText", "()Ljava/lang/String;", "app.lib"})
    static final class Parse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String text = null;
        
        public Parse() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getText() {
            return null;
        }
    }
}