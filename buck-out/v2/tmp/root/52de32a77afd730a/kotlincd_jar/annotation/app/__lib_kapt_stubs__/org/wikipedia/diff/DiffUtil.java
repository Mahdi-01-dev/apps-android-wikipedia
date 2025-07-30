package org.wikipedia.diff;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.dataclient.restbase.DiffResponse;
import org.wikipedia.dataclient.restbase.Revision;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0002J,\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/diff/DiffUtil;", "", "()V", "buildDiffLinesList", "", "Lorg/wikipedia/diff/DiffUtil$DiffLine;", "context", "Landroid/content/Context;", "diffList", "Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;", "singleRev", "Lorg/wikipedia/dataclient/restbase/Revision;", "createSpannableDiffText", "", "diff", "updateDiffTextDecor", "", "Landroid/text/SpannableStringBuilder;", "isAddition", "", "start", "", "end", "DiffLine", "DiffLineHolder", "DiffLinesAdapter", "app.lib"})
public final class DiffUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.diff.DiffUtil INSTANCE = null;
    
    private DiffUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.diff.DiffUtil.DiffLine> buildDiffLinesList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.DiffItem> diffList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.diff.DiffUtil.DiffLine> buildDiffLinesList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.restbase.Revision singleRev) {
        return null;
    }
    
    private final java.lang.CharSequence createSpannableDiffText(android.content.Context context, org.wikipedia.dataclient.restbase.DiffResponse.DiffItem diff) {
        return null;
    }
    
    private final void updateDiffTextDecor(android.text.SpannableStringBuilder $this$updateDiffTextDecor, android.content.Context context, boolean isAddition, int start, int end) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/diff/DiffUtil$DiffLine;", "", "context", "Landroid/content/Context;", "item", "Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;", "(Landroid/content/Context;Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;)V", "diff", "getDiff", "()Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;", "expanded", "", "getExpanded", "()Z", "setExpanded", "(Z)V", "lineEnd", "", "getLineEnd", "()I", "setLineEnd", "(I)V", "lineStart", "getLineStart", "parsedText", "", "getParsedText", "()Ljava/lang/CharSequence;", "setParsedText", "(Ljava/lang/CharSequence;)V", "app.lib"})
    public static final class DiffLine {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.restbase.DiffResponse.DiffItem diff = null;
        private final int lineStart = 0;
        private int lineEnd;
        @org.jetbrains.annotations.NotNull()
        private java.lang.CharSequence parsedText;
        private boolean expanded;
        
        public DiffLine(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.restbase.DiffResponse.DiffItem item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.restbase.DiffResponse.DiffItem getDiff() {
            return null;
        }
        
        public final int getLineStart() {
            return 0;
        }
        
        public final int getLineEnd() {
            return 0;
        }
        
        public final void setLineEnd(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence getParsedText() {
            return null;
        }
        
        public final void setParsedText(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence p0) {
        }
        
        public final boolean getExpanded() {
            return false;
        }
        
        public final void setExpanded(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/diff/DiffUtil$DiffLineHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lorg/wikipedia/diff/DiffLineView;", "(Lorg/wikipedia/diff/DiffLineView;)V", "bindItem", "", "item", "Lorg/wikipedia/diff/DiffUtil$DiffLine;", "app.lib"})
    static final class DiffLineHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public DiffLineHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.diff.DiffLineView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.diff.DiffUtil.DiffLine item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/diff/DiffUtil$DiffLinesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "diffLines", "", "Lorg/wikipedia/diff/DiffUtil$DiffLine;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    public static final class DiffLinesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.diff.DiffUtil.DiffLine> diffLines = null;
        
        public DiffLinesAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.diff.DiffUtil.DiffLine> diffLines) {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int pos) {
        }
    }
}