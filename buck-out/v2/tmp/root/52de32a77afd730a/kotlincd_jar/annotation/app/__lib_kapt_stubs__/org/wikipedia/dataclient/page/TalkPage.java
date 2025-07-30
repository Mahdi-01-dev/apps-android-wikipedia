package org.wikipedia.dataclient.page;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8F\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/dataclient/page/TalkPage;", "", "()V", "revision", "", "getRevision", "()J", "topics", "", "Lorg/wikipedia/dataclient/page/TalkPage$Topic;", "getTopics", "()Ljava/util/List;", "Topic", "TopicReply", "TopicShas", "app.lib"})
public final class TalkPage {
    private final long revision = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.page.TalkPage.Topic> topics = null;
    
    public TalkPage() {
        super();
    }
    
    public final long getRevision() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.page.TalkPage.Topic> getTopics() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8F\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/page/TalkPage$Topic;", "", "()V", "depth", "", "getDepth", "()I", "html", "", "getHtml", "()Ljava/lang/String;", "id", "getId", "replies", "", "Lorg/wikipedia/dataclient/page/TalkPage$TopicReply;", "getReplies", "()Ljava/util/List;", "shas", "Lorg/wikipedia/dataclient/page/TalkPage$TopicShas;", "getShas", "()Lorg/wikipedia/dataclient/page/TalkPage$TopicShas;", "getIndicatorSha", "app.lib"})
    public static final class Topic {
        private final int id = 0;
        private final int depth = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String html = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.page.TalkPage.TopicShas shas = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<org.wikipedia.dataclient.page.TalkPage.TopicReply> replies = null;
        
        public Topic() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final int getDepth() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHtml() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.dataclient.page.TalkPage.TopicShas getShas() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<org.wikipedia.dataclient.page.TalkPage.TopicReply> getReplies() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIndicatorSha() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/dataclient/page/TalkPage$TopicReply;", "", "()V", "depth", "", "getDepth", "()I", "html", "", "getHtml", "()Ljava/lang/String;", "sha", "getSha", "app.lib"})
    public static final class TopicReply {
        private final int depth = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sha = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String html = null;
        
        public TopicReply() {
            super();
        }
        
        public final int getDepth() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSha() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHtml() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/page/TalkPage$TopicShas;", "", "()V", "html", "", "getHtml", "()Ljava/lang/String;", "indicator", "getIndicator", "app.lib"})
    public static final class TopicShas {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String html = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String indicator = null;
        
        public TopicShas() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHtml() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIndicator() {
            return null;
        }
    }
}