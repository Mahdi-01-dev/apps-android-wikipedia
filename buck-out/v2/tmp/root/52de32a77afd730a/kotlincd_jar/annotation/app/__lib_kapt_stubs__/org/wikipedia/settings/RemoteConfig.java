package org.wikipedia.settings;

import kotlinx.serialization.Serializable;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/settings/RemoteConfig;", "", "()V", "config", "Lorg/wikipedia/settings/RemoteConfig$RemoteConfigImpl;", "getConfig", "()Lorg/wikipedia/settings/RemoteConfig$RemoteConfigImpl;", "curConfig", "updateConfig", "", "configStr", "", "RemoteConfigImpl", "app.lib"})
public final class RemoteConfig {
    @org.jetbrains.annotations.Nullable()
    private static org.wikipedia.settings.RemoteConfig.RemoteConfigImpl curConfig;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.RemoteConfig INSTANCE = null;
    
    private RemoteConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.settings.RemoteConfig.RemoteConfigImpl getConfig() {
        return null;
    }
    
    public final void updateConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String configStr) {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/settings/RemoteConfig$RemoteConfigImpl;", "", "()V", "disableAnonEditing", "", "getDisableAnonEditing", "()Z", "disableReadingListSync", "getDisableReadingListSync", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static final class RemoteConfigImpl {
        private final boolean disableReadingListSync = false;
        private final boolean disableAnonEditing = false;
        
        public RemoteConfigImpl() {
            super();
        }
        
        public final boolean getDisableReadingListSync() {
            return false;
        }
        
        public final boolean getDisableAnonEditing() {
            return false;
        }
    }
}