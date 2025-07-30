package org.wikipedia.dataclient;

import org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion;
import org.wikipedia.dataclient.growthtasks.GrowthUserImpact;
import org.wikipedia.dataclient.restbase.DiffResponse;
import org.wikipedia.dataclient.restbase.EditCount;
import org.wikipedia.dataclient.restbase.Revision;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u001b\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/dataclient/CoreRestService;", "", "addImageFeedback", "", "title", "", "body", "Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$AddImageFeedbackBody;", "(Ljava/lang/String;Lorg/wikipedia/dataclient/growthtasks/GrowthImageSuggestion$AddImageFeedbackBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDiff", "Lorg/wikipedia/dataclient/restbase/DiffResponse;", "oldRev", "", "newRev", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEditCount", "Lorg/wikipedia/dataclient/restbase/EditCount;", "editType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevision", "Lorg/wikipedia/dataclient/restbase/Revision;", "rev", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserImpact", "Lorg/wikipedia/dataclient/growthtasks/GrowthUserImpact;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app.lib"})
public abstract interface CoreRestService {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CORE_REST_API_PREFIX = "w/rest.php/";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.CoreRestService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "v1/revision/{oldRev}/compare/{newRev}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDiff(@retrofit2.http.Path(value = "oldRev")
    long oldRev, @retrofit2.http.Path(value = "newRev")
    long newRev, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.restbase.DiffResponse> $completion);
    
    @retrofit2.http.GET(value = "v1/page/{title}/history/counts/{editType}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEditCount(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Path(value = "editType")
    @org.jetbrains.annotations.NotNull()
    java.lang.String editType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.restbase.EditCount> $completion);
    
    @retrofit2.http.GET(value = "v1/revision/{rev}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRevision(@retrofit2.http.Path(value = "rev")
    long rev, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.restbase.Revision> $completion);
    
    @retrofit2.http.PUT(value = "growthexperiments/v0/suggestions/addimage/feedback/{title}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addImageFeedback(@retrofit2.http.Path(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.growthtasks.GrowthImageSuggestion.AddImageFeedbackBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @retrofit2.http.GET(value = "growthexperiments/v0/user-impact/%23{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserImpact(@retrofit2.http.Path(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.growthtasks.GrowthUserImpact> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/dataclient/CoreRestService$Companion;", "", "()V", "CORE_REST_API_PREFIX", "", "app.lib"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CORE_REST_API_PREFIX = "w/rest.php/";
        
        private Companion() {
            super();
        }
    }
}