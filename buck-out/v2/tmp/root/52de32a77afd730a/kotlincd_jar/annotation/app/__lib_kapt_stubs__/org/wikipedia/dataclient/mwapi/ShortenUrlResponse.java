package org.wikipedia.dataclient.mwapi;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/ShortenUrlResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "shortenUrl", "Lorg/wikipedia/dataclient/mwapi/ShortenUrlResponse$ShortenUrl;", "getShortenUrl$annotations", "getShortenUrl", "()Lorg/wikipedia/dataclient/mwapi/ShortenUrlResponse$ShortenUrl;", "ShortenUrl", "app.lib"})
public final class ShortenUrlResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.mwapi.ShortenUrlResponse.ShortenUrl shortenUrl = null;
    
    public ShortenUrlResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.ShortenUrlResponse.ShortenUrl getShortenUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "shortenurl")
    @java.lang.Deprecated()
    public static void getShortenUrl$annotations() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/ShortenUrlResponse$ShortenUrl;", "", "()V", "shortUrl", "", "getShortUrl$annotations", "getShortUrl", "()Ljava/lang/String;", "shortUrlAlt", "getShortUrlAlt$annotations", "getShortUrlAlt", "app.lib"})
    public static final class ShortenUrl {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String shortUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String shortUrlAlt = null;
        
        public ShortenUrl() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getShortUrl() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "shorturl")
        @java.lang.Deprecated()
        public static void getShortUrl$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getShortUrlAlt() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "shorturlalt")
        @java.lang.Deprecated()
        public static void getShortUrlAlt$annotations() {
        }
    }
}