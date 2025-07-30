package org.wikipedia.dataclient.discussiontools;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsEditResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "()V", "result", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsEditResponse$EditResult;", "getResult$annotations", "getResult", "()Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsEditResponse$EditResult;", "EditResult", "app.lib"})
public final class DiscussionToolsEditResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.discussiontools.DiscussionToolsEditResponse.EditResult result = null;
    
    public DiscussionToolsEditResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.discussiontools.DiscussionToolsEditResponse.EditResult getResult() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "discussiontoolsedit")
    @java.lang.Deprecated()
    public static void getResult$annotations() {
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsEditResponse$EditResult;", "", "result", "", "content", "newRevId", "", "watched", "", "(Ljava/lang/String;Ljava/lang/String;JZ)V", "getContent", "()Ljava/lang/String;", "getNewRevId$annotations", "()V", "getNewRevId", "()J", "getResult", "getWatched", "()Z", "app.lib"})
    public static final class EditResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String result = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String content = null;
        private final long newRevId = 0L;
        private final boolean watched = false;
        
        public EditResult(@org.jetbrains.annotations.NotNull()
        java.lang.String result, @org.jetbrains.annotations.NotNull()
        java.lang.String content, long newRevId, boolean watched) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getResult() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContent() {
            return null;
        }
        
        public final long getNewRevId() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "newrevid")
        @java.lang.Deprecated()
        public static void getNewRevId$annotations() {
        }
        
        public final boolean getWatched() {
            return false;
        }
        
        public EditResult() {
            super();
        }
    }
}