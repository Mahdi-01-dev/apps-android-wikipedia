package org.wikipedia.analytics.eventplatform;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Event Platform intake service interface.
 *
 * To match the existing event logging behavior, we send hastily, i.e., we ask the service to
 * respond immediately, before events are processed and regardless of whether they are
 * ultimately processed successfully.
 *
 * TODO: In the future, consider updating to wait for processing and handle partial-success and
 * failure responses.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0013\b\u0001\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0013\b\u0001\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventService;", "", "postEvents", "Lretrofit2/Response;", "", "events", "", "Lorg/wikipedia/analytics/eventplatform/Event;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEventsHasty", "app.lib"})
public abstract interface EventService {
    
    @retrofit2.http.POST(value = "/v1/events?hasty=true")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postEventsHasty(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.analytics.eventplatform.Event> events, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.POST(value = "/v1/events")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postEvents(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.analytics.eventplatform.Event> events, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
}