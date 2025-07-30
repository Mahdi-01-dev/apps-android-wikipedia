package org.wikipedia.dataclient.discussiontools;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsInfoResponse;", "", "()V", "pageInfo", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsInfoResponse$PageInfo;", "getPageInfo$annotations", "getPageInfo", "()Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsInfoResponse$PageInfo;", "PageInfo", "app.lib"})
public final class DiscussionToolsInfoResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.discussiontools.DiscussionToolsInfoResponse.PageInfo pageInfo = null;
    
    public DiscussionToolsInfoResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.discussiontools.DiscussionToolsInfoResponse.PageInfo getPageInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "discussiontoolspageinfo")
    @java.lang.Deprecated()
    public static void getPageInfo$annotations() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsInfoResponse$PageInfo;", "", "threads", "", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "(Ljava/util/List;)V", "getThreads$annotations", "()V", "getThreads", "()Ljava/util/List;", "app.lib"})
    public static final class PageInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threads = null;
        
        public PageInfo(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threads) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> getThreads() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "threaditemshtml")
        @java.lang.Deprecated()
        public static void getThreads$annotations() {
        }
        
        public PageInfo() {
            super();
        }
    }
}