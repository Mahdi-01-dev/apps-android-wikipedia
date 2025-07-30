package org.wikipedia.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.EventPlatformClient;
import org.wikipedia.savedpages.SavedPageSyncService;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/connectivity/ConnectionStateMonitor;", "Landroid/net/ConnectivityManager$NetworkCallback;", "()V", "callbacks", "", "Lorg/wikipedia/connectivity/ConnectionStateMonitor$Callback;", "lastCheckedMillis", "", "networkCallbackRegistered", "", "online", "prevOnline", "enable", "", "ensureNetworkCallbackRegistered", "isOnline", "onAvailable", "network", "Landroid/net/Network;", "onLost", "registerCallback", "callback", "unregisterCallback", "updateOnlineState", "state", "(Ljava/lang/Boolean;)V", "Callback", "Companion", "app.lib"})
public final class ConnectionStateMonitor extends android.net.ConnectivityManager.NetworkCallback {
    private boolean online = true;
    private boolean prevOnline = true;
    private long lastCheckedMillis = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.connectivity.ConnectionStateMonitor.Callback> callbacks = null;
    private boolean networkCallbackRegistered = false;
    private static final long ONLINE_CHECK_THRESHOLD_MILLIS = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.connectivity.ConnectionStateMonitor.Companion Companion = null;
    
    public ConnectionStateMonitor() {
        super();
    }
    
    public final void enable() {
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    public final void registerCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.connectivity.ConnectionStateMonitor.Callback callback) {
    }
    
    public final void unregisterCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.connectivity.ConnectionStateMonitor.Callback callback) {
    }
    
    @java.lang.Override()
    public void onAvailable(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    @java.lang.Override()
    public void onLost(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    private final void ensureNetworkCallbackRegistered() {
    }
    
    private final void updateOnlineState(java.lang.Boolean state) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/connectivity/ConnectionStateMonitor$Callback;", "", "onGoOffline", "", "onGoOnline", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onGoOnline();
        
        public abstract void onGoOffline();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/connectivity/ConnectionStateMonitor$Companion;", "", "()V", "ONLINE_CHECK_THRESHOLD_MILLIS", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}