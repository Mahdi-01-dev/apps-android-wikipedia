package org.wikipedia.edit.richtext;

import android.text.style.StyleSpan;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/edit/richtext/StyleSpanEx;", "Landroid/text/style/StyleSpan;", "Lorg/wikipedia/edit/richtext/SpanExtents;", "style", "", "start", "syntaxRule", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "(IILorg/wikipedia/edit/richtext/SyntaxRule;)V", "end", "getEnd", "()I", "setEnd", "(I)V", "getStart", "setStart", "getSyntaxRule", "()Lorg/wikipedia/edit/richtext/SyntaxRule;", "setSyntaxRule", "(Lorg/wikipedia/edit/richtext/SyntaxRule;)V", "app.lib"})
public final class StyleSpanEx extends android.text.style.StyleSpan implements org.wikipedia.edit.richtext.SpanExtents {
    private int start;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.edit.richtext.SyntaxRule syntaxRule;
    private int end = 0;
    
    public StyleSpanEx(int style, int start, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRule syntaxRule) {
        super(0);
    }
    
    @java.lang.Override()
    public int getStart() {
        return 0;
    }
    
    @java.lang.Override()
    public void setStart(int p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.edit.richtext.SyntaxRule getSyntaxRule() {
        return null;
    }
    
    @java.lang.Override()
    public void setSyntaxRule(@org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRule p0) {
    }
    
    @java.lang.Override()
    public int getEnd() {
        return 0;
    }
    
    @java.lang.Override()
    public void setEnd(int p0) {
    }
}