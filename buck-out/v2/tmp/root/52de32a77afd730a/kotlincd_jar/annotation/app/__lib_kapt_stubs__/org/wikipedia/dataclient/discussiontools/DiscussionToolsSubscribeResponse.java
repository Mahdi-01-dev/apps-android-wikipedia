package org.wikipedia.dataclient.discussiontools;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsSubscribeResponse;", "", "()V", "status", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsSubscribeResponse$SubscribeStatus;", "getStatus$annotations", "getStatus", "()Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsSubscribeResponse$SubscribeStatus;", "SubscribeStatus", "app.lib"})
public final class DiscussionToolsSubscribeResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.discussiontools.DiscussionToolsSubscribeResponse.SubscribeStatus status = null;
    
    public DiscussionToolsSubscribeResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.discussiontools.DiscussionToolsSubscribeResponse.SubscribeStatus getStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "discussiontoolssubscribe")
    @java.lang.Deprecated()
    public static void getStatus$annotations() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsSubscribeResponse$SubscribeStatus;", "", "page", "", "topicName", "subscribe", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPage", "()Ljava/lang/String;", "getSubscribe", "()Z", "getTopicName$annotations", "()V", "getTopicName", "app.lib"})
    public static final class SubscribeStatus {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String page = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String topicName = null;
        private final boolean subscribe = false;
        
        public SubscribeStatus(@org.jetbrains.annotations.NotNull()
        java.lang.String page, @org.jetbrains.annotations.NotNull()
        java.lang.String topicName, boolean subscribe) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTopicName() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "commentname")
        @java.lang.Deprecated()
        public static void getTopicName$annotations() {
        }
        
        public final boolean getSubscribe() {
            return false;
        }
        
        public SubscribeStatus() {
            super();
        }
    }
}