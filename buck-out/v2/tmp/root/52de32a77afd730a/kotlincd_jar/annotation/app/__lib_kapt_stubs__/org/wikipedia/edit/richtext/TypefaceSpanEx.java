package org.wikipedia.edit.richtext;

import android.graphics.Typeface;
import android.os.Build;
import android.text.style.TypefaceSpan;
import androidx.annotation.RequiresApi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/edit/richtext/TypefaceSpanEx;", "Landroid/text/style/TypefaceSpan;", "Lorg/wikipedia/edit/richtext/SpanExtents;", "typeface", "Landroid/graphics/Typeface;", "start", "", "syntaxRule", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "(Landroid/graphics/Typeface;ILorg/wikipedia/edit/richtext/SyntaxRule;)V", "end", "getEnd", "()I", "setEnd", "(I)V", "getStart", "setStart", "getSyntaxRule", "()Lorg/wikipedia/edit/richtext/SyntaxRule;", "setSyntaxRule", "(Lorg/wikipedia/edit/richtext/SyntaxRule;)V", "app.lib"})
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.P)
public final class TypefaceSpanEx extends android.text.style.TypefaceSpan implements org.wikipedia.edit.richtext.SpanExtents {
    private int start;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.edit.richtext.SyntaxRule syntaxRule;
    private int end = 0;
    
    public TypefaceSpanEx(@org.jetbrains.annotations.NotNull()
    android.graphics.Typeface typeface, int start, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRule syntaxRule) {
        super(null);
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