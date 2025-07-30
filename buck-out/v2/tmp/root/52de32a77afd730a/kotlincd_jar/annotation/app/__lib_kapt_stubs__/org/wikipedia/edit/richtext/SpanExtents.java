package org.wikipedia.edit.richtext;

/**
 * Interface for creating Span styles that contain beginning & end information,
 * as well as the syntax rule with which the span is associated.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/edit/richtext/SpanExtents;", "", "end", "", "getEnd", "()I", "setEnd", "(I)V", "start", "getStart", "setStart", "syntaxRule", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "getSyntaxRule", "()Lorg/wikipedia/edit/richtext/SyntaxRule;", "setSyntaxRule", "(Lorg/wikipedia/edit/richtext/SyntaxRule;)V", "app.lib"})
public abstract interface SpanExtents {
    
    /**
     * Starting position that this span will take.
     * NOTE: This should only be used when initially applying the span. This variable does not get
     * updated when the span is moved around in the Editable string, and should not be used to
     * determine the span's position after setting it.
     */
    public abstract int getStart();
    
    /**
     * Starting position that this span will take.
     * NOTE: This should only be used when initially applying the span. This variable does not get
     * updated when the span is moved around in the Editable string, and should not be used to
     * determine the span's position after setting it.
     */
    public abstract void setStart(int p0);
    
    /**
     * Ending position that this span will take.
     * NOTE: This should only be used when initially applying the span. This variable does not get
     * updated when the span is moved around in the Editable string, and should not be used to
     * determine the span's position after setting it.
     */
    public abstract int getEnd();
    
    /**
     * Ending position that this span will take.
     * NOTE: This should only be used when initially applying the span. This variable does not get
     * updated when the span is moved around in the Editable string, and should not be used to
     * determine the span's position after setting it.
     */
    public abstract void setEnd(int p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.edit.richtext.SyntaxRule getSyntaxRule();
    
    public abstract void setSyntaxRule(@org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRule p0);
}