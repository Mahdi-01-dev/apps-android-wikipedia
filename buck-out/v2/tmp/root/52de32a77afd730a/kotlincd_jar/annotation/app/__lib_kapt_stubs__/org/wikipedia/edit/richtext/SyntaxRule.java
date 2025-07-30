package org.wikipedia.edit.richtext;

/**
 * Represents a single syntax highlighting rule.
 *
 * example:   [[ lorem ipsum ]]
 *            |       |      |
 *       startSymbol  |      |
 *                    |  endSymbol
 *                    |
 *                spanStyle
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRule;", "", "startSymbol", "", "endSymbol", "spanStyle", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "(Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;)V", "endChars", "", "getEndChars", "()[C", "getSpanStyle", "()Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "startChars", "getStartChars", "app.lib"})
public final class SyntaxRule {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.richtext.SyntaxRuleStyle spanStyle = null;
    @org.jetbrains.annotations.NotNull()
    private final char[] startChars = null;
    @org.jetbrains.annotations.NotNull()
    private final char[] endChars = null;
    
    public SyntaxRule(@org.jetbrains.annotations.NotNull()
    java.lang.String startSymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String endSymbol, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRuleStyle spanStyle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.richtext.SyntaxRuleStyle getSpanStyle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final char[] getStartChars() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final char[] getEndChars() {
        return null;
    }
}