package org.wikipedia.richtext;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.ParagraphStyle;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.imageservice.ImageService;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
import java.util.Stack;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0005/0123B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J&\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016J,\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020 H\u0016J\"\u0010!\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010*\u001a\u00020\rH\u0016J0\u0010+\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001c\u0010.\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lorg/wikipedia/richtext/CustomHtmlParser;", "Landroid/text/Html$TagHandler;", "Lorg/xml/sax/ContentHandler;", "handler", "Lorg/wikipedia/richtext/CustomHtmlParser$TagHandler;", "(Lorg/wikipedia/richtext/CustomHtmlParser$TagHandler;)V", "tagStatus", "Lkotlin/collections/ArrayDeque;", "", "text", "Landroid/text/Editable;", "wrapped", "characters", "", "ch", "", "start", "", "length", "endDocument", "endElement", "uri", "", "localName", "qName", "endPrefixMapping", "prefix", "handleTag", "opening", "tag", "output", "xmlReader", "Lorg/xml/sax/XMLReader;", "ignorableWhitespace", "processingInstruction", "target", "data", "setDocumentLocator", "locator", "Lorg/xml/sax/Locator;", "skippedEntity", "name", "startDocument", "startElement", "attributes", "Lorg/xml/sax/Attributes;", "startPrefixMapping", "BlankBitmapPlaceholder", "Companion", "CustomImageGetter", "CustomTagHandler", "TagHandler", "app.lib"})
public final class CustomHtmlParser implements android.text.Html.TagHandler, org.xml.sax.ContentHandler {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.richtext.CustomHtmlParser.TagHandler handler = null;
    @org.jetbrains.annotations.Nullable()
    private org.xml.sax.ContentHandler wrapped;
    @org.jetbrains.annotations.Nullable()
    private android.text.Editable text;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.collections.ArrayDeque<java.lang.Boolean> tagStatus = null;
    private static final int MIN_IMAGE_SIZE = 64;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<android.content.Context, java.util.Map<java.lang.String, android.graphics.drawable.BitmapDrawable>> contextBmpMap = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.richtext.CustomHtmlParser.Companion Companion = null;
    
    public CustomHtmlParser(@org.jetbrains.annotations.NotNull()
    org.wikipedia.richtext.CustomHtmlParser.TagHandler handler) {
        super();
    }
    
    @java.lang.Override()
    public void handleTag(boolean opening, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    android.text.Editable output, @org.jetbrains.annotations.NotNull()
    org.xml.sax.XMLReader xmlReader) {
    }
    
    @java.lang.Override()
    public void startElement(@org.jetbrains.annotations.Nullable()
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    java.lang.String localName, @org.jetbrains.annotations.Nullable()
    java.lang.String qName, @org.jetbrains.annotations.Nullable()
    org.xml.sax.Attributes attributes) {
    }
    
    @java.lang.Override()
    public void endElement(@org.jetbrains.annotations.Nullable()
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    java.lang.String localName, @org.jetbrains.annotations.Nullable()
    java.lang.String qName) {
    }
    
    @java.lang.Override()
    public void setDocumentLocator(@org.jetbrains.annotations.Nullable()
    org.xml.sax.Locator locator) {
    }
    
    @java.lang.Override()
    public void startDocument() {
    }
    
    @java.lang.Override()
    public void endDocument() {
    }
    
    @java.lang.Override()
    public void startPrefixMapping(@org.jetbrains.annotations.Nullable()
    java.lang.String prefix, @org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
    }
    
    @java.lang.Override()
    public void endPrefixMapping(@org.jetbrains.annotations.Nullable()
    java.lang.String prefix) {
    }
    
    @java.lang.Override()
    public void characters(@org.jetbrains.annotations.Nullable()
    char[] ch, int start, int length) {
    }
    
    @java.lang.Override()
    public void ignorableWhitespace(@org.jetbrains.annotations.Nullable()
    char[] ch, int start, int length) {
    }
    
    @java.lang.Override()
    public void processingInstruction(@org.jetbrains.annotations.Nullable()
    java.lang.String target, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @java.lang.Override()
    public void skippedEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/richtext/CustomHtmlParser$BlankBitmapPlaceholder;", "Landroid/graphics/drawable/BitmapDrawable;", "res", "Landroid/content/res/Resources;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app.lib"})
    public static final class BlankBitmapPlaceholder extends android.graphics.drawable.BitmapDrawable {
        
        public BlankBitmapPlaceholder(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources res, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap bitmap) {
            super();
        }
        
        @java.lang.Override()
        public void draw(@org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/richtext/CustomHtmlParser$Companion;", "", "()V", "MIN_IMAGE_SIZE", "", "contextBmpMap", "", "Landroid/content/Context;", "", "Landroid/graphics/drawable/BitmapDrawable;", "fromHtml", "Landroid/text/Spanned;", "html", "view", "Landroid/widget/TextView;", "getValue", "attributes", "Lorg/xml/sax/Attributes;", "name", "pruneBitmaps", "", "context", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.Spanned fromHtml(@org.jetbrains.annotations.Nullable()
        java.lang.String html, @org.jetbrains.annotations.Nullable()
        android.widget.TextView view) {
            return null;
        }
        
        public final void pruneBitmaps(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final java.lang.String getValue(org.xml.sax.Attributes attributes, java.lang.String name) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/richtext/CustomHtmlParser$CustomImageGetter;", "Landroid/text/Html$ImageGetter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDrawable", "Landroid/graphics/drawable/Drawable;", "source", "", "app.lib"})
    public static final class CustomImageGetter implements android.text.Html.ImageGetter {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public CustomImageGetter(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.Nullable()
        java.lang.String source) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/richtext/CustomHtmlParser$CustomTagHandler;", "Lorg/wikipedia/richtext/CustomHtmlParser$TagHandler;", "view", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "lastAClass", "", "listItemCounts", "Ljava/util/Stack;", "", "listParents", "", "handleListTag", "", "output", "Landroid/text/Editable;", "handleTag", "", "opening", "tag", "attributes", "Lorg/xml/sax/Attributes;", "app.lib"})
    public static final class CustomTagHandler implements org.wikipedia.richtext.CustomHtmlParser.TagHandler {
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView view = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String lastAClass = "";
        @org.jetbrains.annotations.NotNull()
        private java.util.Stack<java.lang.Integer> listItemCounts;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> listParents = null;
        
        public CustomTagHandler(@org.jetbrains.annotations.Nullable()
        android.widget.TextView view) {
            super();
        }
        
        @java.lang.Override()
        public boolean handleTag(boolean opening, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        android.text.Editable output, @org.jetbrains.annotations.Nullable()
        org.xml.sax.Attributes attributes) {
            return false;
        }
        
        private final void handleListTag(android.text.Editable output) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/richtext/CustomHtmlParser$TagHandler;", "", "handleTag", "", "opening", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "app.lib"})
    public static abstract interface TagHandler {
        
        public abstract boolean handleTag(boolean opening, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        android.text.Editable output, @org.jetbrains.annotations.Nullable()
        org.xml.sax.Attributes attributes);
    }
}