package org.wikipedia.edit.richtext;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorInt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/edit/richtext/ColorSpanEx;", "Landroid/text/style/ForegroundColorSpan;", "Lorg/wikipedia/edit/richtext/SpanExtents;", "foreColor", "", "backColor", "start", "syntaxRule", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "(IIILorg/wikipedia/edit/richtext/SyntaxRule;)V", "end", "getEnd", "()I", "setEnd", "(I)V", "getStart", "setStart", "getSyntaxRule", "()Lorg/wikipedia/edit/richtext/SyntaxRule;", "setSyntaxRule", "(Lorg/wikipedia/edit/richtext/SyntaxRule;)V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "app.lib"})
public final class ColorSpanEx extends android.text.style.ForegroundColorSpan implements org.wikipedia.edit.richtext.SpanExtents {
    private final int backColor = 0;
    private int start;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.edit.richtext.SyntaxRule syntaxRule;
    private int end = 0;
    
    public ColorSpanEx(@androidx.annotation.ColorInt()
    int foreColor, @androidx.annotation.ColorInt()
    int backColor, int start, @org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    public void updateDrawState(@org.jetbrains.annotations.NotNull()
    android.text.TextPaint tp) {
    }
}