package org.wikipedia.dataclient.donate;

import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import okhttp3.Request;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.json.JsonUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/donate/DonationConfigHelper;", "", "()V", "CONFIG_URL", "", "CONFIG_VERSION", "", "DONATE_WIKI_URL", "getConfig", "Lorg/wikipedia/dataclient/donate/DonationConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConfigProto", "app.lib"})
public final class DonationConfigHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DONATE_WIKI_URL = "https://donate.wikimedia.org/";
    private static final int CONFIG_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CONFIG_URL = "https://donate.wikimedia.org/wiki/MediaWiki:AppsDonationConfig.json?action=raw";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.donate.DonationConfigHelper INSTANCE = null;
    
    private DonationConfigHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.donate.DonationConfig> $completion) {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/donate/DonationConfigHelper$ConfigProto;", "", "version", "", "(I)V", "getVersion", "()I", "app.lib"})
    public static final class ConfigProto {
        private final int version = 0;
        
        public ConfigProto(int version) {
            super();
        }
        
        public final int getVersion() {
            return 0;
        }
        
        public ConfigProto() {
            super();
        }
    }
}