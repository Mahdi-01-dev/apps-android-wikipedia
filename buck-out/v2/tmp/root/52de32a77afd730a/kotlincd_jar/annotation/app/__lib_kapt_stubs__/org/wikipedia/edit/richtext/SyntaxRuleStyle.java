package org.wikipedia.edit.richtext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.RequiresApi;
import org.wikipedia.R;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "", "(Ljava/lang/String;I)V", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "PRE_TEMPLATE", "TEMPLATE", "INTERNAL_LINK", "EXTERNAL_LINK", "REF", "BOLD", "ITALIC", "UNDERLINE", "STRIKETHROUGH", "TEXT_LARGE", "TEXT_SMALL", "CODE", "SUPERSCRIPT", "SUBSCRIPT", "HEADING_LARGE", "HEADING_MEDIUM", "HEADING_SMALL", "SEARCH_MATCHES", "SEARCH_MATCH_SELECTED", "app.lib"})
public enum SyntaxRuleStyle {
    /*public static final*/ PRE_TEMPLATE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$PRE_TEMPLATE;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) PRE_TEMPLATE(){
    
    PRE_TEMPLATE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ TEMPLATE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$TEMPLATE;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) TEMPLATE(){
    
    TEMPLATE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ INTERNAL_LINK /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$INTERNAL_LINK;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) INTERNAL_LINK(){
    
    INTERNAL_LINK() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ EXTERNAL_LINK /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$EXTERNAL_LINK;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) EXTERNAL_LINK(){
    
    EXTERNAL_LINK() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ REF /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$REF;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) REF(){
    
    REF() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ BOLD /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$BOLD;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) BOLD(){
    
    BOLD() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ ITALIC /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$ITALIC;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) ITALIC(){
    
    ITALIC() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ UNDERLINE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$UNDERLINE;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) UNDERLINE(){
    
    UNDERLINE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ STRIKETHROUGH /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$STRIKETHROUGH;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) STRIKETHROUGH(){
    
    STRIKETHROUGH() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ TEXT_LARGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$TEXT_LARGE;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) TEXT_LARGE(){
    
    TEXT_LARGE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ TEXT_SMALL /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$TEXT_SMALL;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) TEXT_SMALL(){
    
    TEXT_SMALL() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ CODE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$CODE;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) CODE(){
    
    CODE() {
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.P)
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ SUPERSCRIPT /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$SUPERSCRIPT;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) SUPERSCRIPT(){
    
    SUPERSCRIPT() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ SUBSCRIPT /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$SUBSCRIPT;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) SUBSCRIPT(){
    
    SUBSCRIPT() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ HEADING_LARGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$HEADING_LARGE;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) HEADING_LARGE(){
    
    HEADING_LARGE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ HEADING_MEDIUM /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$HEADING_MEDIUM;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) HEADING_MEDIUM(){
    
    HEADING_MEDIUM() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ HEADING_SMALL /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$HEADING_SMALL;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) HEADING_SMALL(){
    
    HEADING_SMALL() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ SEARCH_MATCHES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$SEARCH_MATCHES;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) SEARCH_MATCHES(){
    
    SEARCH_MATCHES() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */,
    /*public static final*/ SEARCH_MATCH_SELECTED /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRuleStyle$SEARCH_MATCH_SELECTED;", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "createSpan", "Lorg/wikipedia/edit/richtext/SpanExtents;", "ctx", "Landroid/content/Context;", "spanStart", "", "syntaxItem", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "app.lib"}) SEARCH_MATCH_SELECTED(){
    
    SEARCH_MATCH_SELECTED() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem) {
        return null;
    }
} */;
    
    SyntaxRuleStyle() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.edit.richtext.SpanExtents createSpan(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, int spanStart, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRule syntaxItem);
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.edit.richtext.SyntaxRuleStyle> getEntries() {
        return null;
    }
}