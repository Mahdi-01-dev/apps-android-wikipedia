package org.wikipedia.bridge;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.*;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import org.wikipedia.dataclient.RestService;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.PageViewModel;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;

/**
 * Two-way communications bridge between JS in a WebView and Java.
 *
 * Messages TO the WebView are sent by calling loadUrl() with the Javascript payload in it.
 *
 * Messages FROM the WebView are received by leveraging @JavascriptInterface methods.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0006&\'()*+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0016J\u001c\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00072\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0012J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge;", "", "communicationBridgeListener", "Lorg/wikipedia/bridge/CommunicationBridge$CommunicationBridgeListener;", "(Lorg/wikipedia/bridge/CommunicationBridge$CommunicationBridgeListener;)V", "eventListeners", "Ljava/util/HashMap;", "", "", "Lorg/wikipedia/bridge/CommunicationBridge$JSEventListener;", "incomingMessageHandler", "Landroid/os/Handler;", "isLoading", "", "()Z", "isMetadataReady", "isPcsReady", "pendingEvals", "Landroid/webkit/ValueCallback;", "pendingJSMessages", "Ljava/util/ArrayList;", "addListener", "", "type", "listener", "cleanup", "evaluate", "js", "callback", "evaluateImmediate", "execute", "flushMessages", "loadBlankPage", "onMetadataReady", "onPcsReady", "resetHtml", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "BridgeMessage", "CommunicatingChrome", "CommunicationBridgeListener", "Companion", "JSEventListener", "PcsClientJavascriptInterface", "app.lib"})
@android.annotation.SuppressLint(value = {"AddJavascriptInterface", "SetJavaScriptEnabled"})
public final class CommunicationBridge {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.bridge.CommunicationBridge.CommunicationBridgeListener communicationBridgeListener = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.String, java.util.List<org.wikipedia.bridge.CommunicationBridge.JSEventListener>> eventListeners = null;
    private boolean isMetadataReady = false;
    private boolean isPcsReady = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> pendingJSMessages = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.String, android.webkit.ValueCallback<java.lang.String>> pendingEvals = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.Handler incomingMessageHandler;
    private static final int MESSAGE_HANDLE_MESSAGE_FROM_JS = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.bridge.CommunicationBridge.Companion Companion = null;
    
    public CommunicationBridge(@org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge.CommunicationBridgeListener communicationBridgeListener) {
        super();
    }
    
    public final void onPcsReady() {
    }
    
    public final void loadBlankPage() {
    }
    
    public final void onMetadataReady() {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void resetHtml(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    public final void cleanup() {
    }
    
    public final void addListener(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge.JSEventListener listener) {
    }
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    java.lang.String js) {
    }
    
    public final void evaluate(@org.jetbrains.annotations.NotNull()
    java.lang.String js, @org.jetbrains.annotations.NotNull()
    android.webkit.ValueCallback<java.lang.String> callback) {
    }
    
    public final void evaluateImmediate(@org.jetbrains.annotations.NotNull()
    java.lang.String js, @org.jetbrains.annotations.Nullable()
    android.webkit.ValueCallback<java.lang.String> callback) {
    }
    
    private final void flushMessages() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge$BridgeMessage;", "", "()V", "action", "", "getAction", "()Ljava/lang/String;", "data", "Lkotlinx/serialization/json/JsonObject;", "getData", "()Lkotlinx/serialization/json/JsonObject;", "app.lib"})
    static final class BridgeMessage {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = "";
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.serialization.json.JsonObject data = null;
        
        public BridgeMessage() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAction() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.serialization.json.JsonObject getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge$CommunicatingChrome;", "Landroid/webkit/WebChromeClient;", "()V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "app.lib"})
    static final class CommunicatingChrome extends android.webkit.WebChromeClient {
        
        public CommunicatingChrome() {
            super();
        }
        
        @java.lang.Override()
        public boolean onConsoleMessage(@org.jetbrains.annotations.NotNull()
        android.webkit.ConsoleMessage consoleMessage) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge$CommunicationBridgeListener;", "", "isPreview", "", "()Z", "model", "Lorg/wikipedia/page/PageViewModel;", "getModel", "()Lorg/wikipedia/page/PageViewModel;", "toolbarMargin", "", "getToolbarMargin", "()I", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "app.lib"})
    public static abstract interface CommunicationBridgeListener {
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.webkit.WebView getWebView();
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.wikipedia.page.PageViewModel getModel();
        
        public abstract boolean isPreview();
        
        public abstract int getToolbarMargin();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge$Companion;", "", "()V", "MESSAGE_HANDLE_MESSAGE_FROM_JS", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge$JSEventListener;", "", "onMessage", "", "messageType", "", "messagePayload", "Lkotlinx/serialization/json/JsonObject;", "app.lib"})
    public static abstract interface JSEventListener {
        
        public abstract void onMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String messageType, @org.jetbrains.annotations.Nullable()
        kotlinx.serialization.json.JsonObject messagePayload);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/bridge/CommunicationBridge$PcsClientJavascriptInterface;", "", "(Lorg/wikipedia/bridge/CommunicationBridge;)V", "setupSettings", "", "getSetupSettings", "()Ljava/lang/String;", "onReceiveMessage", "", "message", "app.lib"})
    final class PcsClientJavascriptInterface {
        
        public PcsClientJavascriptInterface() {
            super();
        }
        
        /**
         * Called from Javascript to send a message packet to the Java layer. The message must be
         * formatted in JSON, and URL-encoded.
         *
         * @param message JSON structured message received from the WebView.
         */
        @android.webkit.JavascriptInterface()
        @kotlin.jvm.Synchronized()
        public final synchronized void onReceiveMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
        }
        
        @android.webkit.JavascriptInterface()
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.NotNull()
        public final synchronized java.lang.String getSetupSettings() {
            return null;
        }
    }
}