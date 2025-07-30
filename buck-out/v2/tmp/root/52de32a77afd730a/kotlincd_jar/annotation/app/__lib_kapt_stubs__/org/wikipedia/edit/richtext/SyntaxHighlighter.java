package org.wikipedia.edit.richtext;

import android.os.Build;
import android.text.Spanned;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import kotlinx.coroutines.*;
import org.wikipedia.edit.SyntaxHighlightableEditText;
import org.wikipedia.util.log.L;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0015H\u0002J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010#\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002J\u000e\u0010&\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0002\u0010\'J\u0012\u0010(\u001a\u00020\u001d2\b\b\u0002\u0010)\u001a\u00020\tH\u0002J\u0016\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\tH\u0082@\u00a2\u0006\u0002\u0010+J&\u0010,\u001a\u00020\u001d2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "", "activity", "Landroidx/activity/ComponentActivity;", "textBox", "Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "scrollView", "Landroid/widget/ScrollView;", "highlightDelayMillis", "", "(Landroidx/activity/ComponentActivity;Lorg/wikipedia/edit/SyntaxHighlightableEditText;Landroid/widget/ScrollView;J)V", "currentHighlightJob", "Lkotlinx/coroutines/Job;", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "lastScrollY", "", "searchQueryLength", "searchQueryPositionIndex", "searchQueryPositions", "", "syntaxRules", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "cleanup", "", "clearSearchQueryInfo", "getHighlightSpans", "Lorg/wikipedia/edit/richtext/SpanExtents;", "text", "", "startOffset", "getSyntaxMatches", "textLength", "highlightOnScroll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performHighlight", "delayMillis", "runHighlightTasks", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSearchQueryInfo", "Companion", "app.lib"})
public final class SyntaxHighlighter {
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.ComponentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.SyntaxHighlightableEditText textBox = null;
    @org.jetbrains.annotations.Nullable()
    private final android.widget.ScrollView scrollView = null;
    private final long highlightDelayMillis = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.edit.richtext.SyntaxRule> syntaxRules = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job currentHighlightJob;
    private int lastScrollY = -1;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> searchQueryPositions;
    private int searchQueryLength = 0;
    private int searchQueryPositionIndex = 0;
    private boolean enabled = true;
    public static final long HIGHLIGHT_DELAY_MILLIS = 500L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.richtext.SyntaxHighlighter.Companion Companion = null;
    
    public SyntaxHighlighter(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.SyntaxHighlightableEditText textBox, @org.jetbrains.annotations.Nullable()
    android.widget.ScrollView scrollView, long highlightDelayMillis) {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean value) {
    }
    
    private final void performHighlight(long delayMillis) {
    }
    
    private final java.lang.Object runHighlightTasks(long delayMillis, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.util.List<org.wikipedia.edit.richtext.SpanExtents> getHighlightSpans(java.lang.CharSequence text, int startOffset) {
        return null;
    }
    
    private final java.util.List<org.wikipedia.edit.richtext.SpanExtents> getSyntaxMatches(int startOffset, int textLength) {
        return null;
    }
    
    public final void setSearchQueryInfo(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> searchQueryPositions, int searchQueryLength, int searchQueryPositionIndex) {
    }
    
    public final void clearSearchQueryInfo() {
    }
    
    public final void cleanup() {
    }
    
    private final java.lang.Object highlightOnScroll(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxHighlighter$Companion;", "", "()V", "HIGHLIGHT_DELAY_MILLIS", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}