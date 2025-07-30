package org.wikipedia.csrf;

import kotlinx.coroutines.Dispatchers;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.LoggedOutInBackgroundEvent;
import org.wikipedia.login.LoginClient;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.log.L;
import java.io.IOException;
import java.util.concurrent.Semaphore;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J,\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/csrf/CsrfTokenClient;", "", "()V", "ANON_TOKEN", "", "MAX_RETRIES", "", "MUTEX", "Ljava/util/concurrent/Semaphore;", "bailWithLogout", "", "getToken", "site", "Lorg/wikipedia/dataclient/WikiSite;", "type", "svc", "Lorg/wikipedia/dataclient/Service;", "(Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Lorg/wikipedia/dataclient/Service;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenRequiresLogin", "", "token", "app.lib"})
public final class CsrfTokenClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.Semaphore MUTEX = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ANON_TOKEN = "+\\";
    private static final int MAX_RETRIES = 3;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.csrf.CsrfTokenClient INSTANCE = null;
    
    private CsrfTokenClient() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getToken(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.Service svc, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final boolean tokenRequiresLogin(java.lang.String token) {
        return false;
    }
    
    private final void bailWithLogout() {
    }
}