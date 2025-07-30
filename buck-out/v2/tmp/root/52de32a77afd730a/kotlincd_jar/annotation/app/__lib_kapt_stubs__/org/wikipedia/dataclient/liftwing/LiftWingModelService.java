package org.wikipedia.dataclient.liftwing;

import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/dataclient/liftwing/LiftWingModelService;", "", "getDescriptionSuggestion", "Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion$Response;", "body", "Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion$Request;", "(Lorg/wikipedia/dataclient/liftwing/DescriptionSuggestion$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app.lib"})
public abstract interface LiftWingModelService {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_URL = "https://api.wikimedia.org/service/lw/inference/v1/";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.liftwing.LiftWingModelService.Companion Companion = null;
    
    @retrofit2.http.POST(value = "models/article-descriptions:predict")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDescriptionSuggestion(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.liftwing.DescriptionSuggestion.Request body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.liftwing.DescriptionSuggestion.Response> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/dataclient/liftwing/LiftWingModelService$Companion;", "", "()V", "API_URL", "", "app.lib"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_URL = "https://api.wikimedia.org/service/lw/inference/v1/";
        
        private Companion() {
            super();
        }
    }
}