package org.wikipedia.dataclient.restbase;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse;", "", "()V", "diff", "", "Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;", "getDiff", "()Ljava/util/List;", "from", "Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffRevision;", "to", "Companion", "DiffItem", "DiffOffset", "DiffRevision", "HighlightRange", "RevisionSection", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class DiffResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.restbase.DiffResponse.DiffRevision from = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.restbase.DiffResponse.DiffRevision to = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.DiffItem> diff = null;
    public static final int DIFF_TYPE_LINE_WITH_SAME_CONTENT = 0;
    public static final int DIFF_TYPE_LINE_ADDED = 1;
    public static final int DIFF_TYPE_LINE_REMOVED = 2;
    public static final int DIFF_TYPE_LINE_WITH_DIFF = 3;
    public static final int DIFF_TYPE_PARAGRAPH_MOVED_FROM = 4;
    public static final int DIFF_TYPE_PARAGRAPH_MOVED_TO = 5;
    public static final int HIGHLIGHT_TYPE_ADD = 0;
    public static final int HIGHLIGHT_TYPE_DELETE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.restbase.DiffResponse.Companion Companion = null;
    
    public DiffResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.DiffItem> getDiff() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse$Companion;", "", "()V", "DIFF_TYPE_LINE_ADDED", "", "DIFF_TYPE_LINE_REMOVED", "DIFF_TYPE_LINE_WITH_DIFF", "DIFF_TYPE_LINE_WITH_SAME_CONTENT", "DIFF_TYPE_PARAGRAPH_MOVED_FROM", "DIFF_TYPE_PARAGRAPH_MOVED_TO", "HIGHLIGHT_TYPE_ADD", "HIGHLIGHT_TYPE_DELETE", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;", "", "type", "", "lineNumber", "text", "", "offset", "Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffOffset;", "highlightRanges", "", "Lorg/wikipedia/dataclient/restbase/DiffResponse$HighlightRange;", "(IILjava/lang/String;Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffOffset;Ljava/util/List;)V", "getHighlightRanges", "()Ljava/util/List;", "getLineNumber", "()I", "getText", "()Ljava/lang/String;", "getType", "app.lib"})
    public static final class DiffItem {
        private final int type = 0;
        private final int lineNumber = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.dataclient.restbase.DiffResponse.DiffOffset offset = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.HighlightRange> highlightRanges = null;
        
        public DiffItem(int type, int lineNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.restbase.DiffResponse.DiffOffset offset, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.HighlightRange> highlightRanges) {
            super();
        }
        
        public final int getType() {
            return 0;
        }
        
        public final int getLineNumber() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.HighlightRange> getHighlightRanges() {
            return null;
        }
        
        public DiffItem() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffOffset;", "", "()V", "from", "", "Ljava/lang/Integer;", "to", "app.lib"})
    public static final class DiffOffset {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer from = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer to = null;
        
        public DiffOffset() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffRevision;", "", "()V", "id", "", "sections", "", "Lorg/wikipedia/dataclient/restbase/DiffResponse$RevisionSection;", "slotRole", "", "getSlotRole$annotations", "app.lib"})
    public static final class DiffRevision {
        private final long id = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String slotRole = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.RevisionSection> sections = null;
        
        public DiffRevision() {
            super();
        }
        
        @kotlinx.serialization.SerialName(value = "slot_role")
        @java.lang.Deprecated()
        private static void getSlotRole$annotations() {
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse$HighlightRange;", "", "start", "", "length", "type", "(III)V", "getLength", "()I", "getStart", "getType", "app.lib"})
    public static final class HighlightRange {
        private final int start = 0;
        private final int length = 0;
        private final int type = 0;
        
        public HighlightRange(int start, int length, int type) {
            super();
        }
        
        public final int getStart() {
            return 0;
        }
        
        public final int getLength() {
            return 0;
        }
        
        public final int getType() {
            return 0;
        }
        
        public HighlightRange() {
            super();
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/dataclient/restbase/DiffResponse$RevisionSection;", "", "()V", "heading", "", "level", "", "offset", "app.lib"})
    public static final class RevisionSection {
        private final int level = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String heading = null;
        private final int offset = 0;
        
        public RevisionSection() {
            super();
        }
    }
}