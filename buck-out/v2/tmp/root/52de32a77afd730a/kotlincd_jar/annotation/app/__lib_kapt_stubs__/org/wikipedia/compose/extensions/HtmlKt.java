package org.wikipedia.compose.extensions;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u001a8\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002\u001a(\u0010\u0012\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002\u001a(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a$\u0010\u0019\u001a\u00020\u0016*\u00020\u00142\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u001fH\u0002\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"AnnotationTag", "", "ContentHandlerReplacementTag", "optionalFontFamilyFromName", "Landroidx/compose/ui/text/font/FontFamily;", "familyName", "addSpan", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "span", "", "start", "", "end", "linkStyles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "addSpans", "spanned", "Landroid/text/Spanned;", "composeFromHtml", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/AnnotatedString$Companion;", "htmlString", "toAnnotatedString", "toParagraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroid/text/style/AlignmentSpan;", "toSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "Landroid/text/style/StyleSpan;", "Landroid/text/style/TypefaceSpan;", "app.lib"})
public final class HtmlKt {
    
    /**
     * This tag is added at the beginning of a string fed to the HTML parser in order to trigger
     * a TagHandler's callback early on so we can replace the ContentHandler with our
     * own [AnnotationContentHandler]. This is needed to handle the opening <annotation> tags since by
     * the time TagHandler is triggered, the parser already visited and left the opening <annotation>
     * tag which contains the attributes. Note that closing tag doesn't have the attributes and
     * therefore not enough to construct the intermediate [AnnotationSpan] object that is later
     * transformed into [AnnotatedString]'s string annotation.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AnnotationTag = "annotation";
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.text.AnnotatedString composeFromHtml(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.AnnotatedString.Companion $this$composeFromHtml, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlString, @org.jetbrains.annotations.Nullable()
    androidx.compose.ui.text.TextLinkStyles linkStyles, @org.jetbrains.annotations.Nullable()
    androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.text.AnnotatedString toAnnotatedString(@org.jetbrains.annotations.NotNull()
    android.text.Spanned $this$toAnnotatedString, @org.jetbrains.annotations.Nullable()
    androidx.compose.ui.text.TextLinkStyles linkStyles, @org.jetbrains.annotations.Nullable()
    androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
        return null;
    }
    
    private static final void addSpans(androidx.compose.ui.text.AnnotatedString.Builder $this$addSpans, android.text.Spanned spanned, androidx.compose.ui.text.TextLinkStyles linkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
    }
    
    private static final void addSpan(androidx.compose.ui.text.AnnotatedString.Builder $this$addSpan, java.lang.Object span, int start, int end, androidx.compose.ui.text.TextLinkStyles linkStyles, androidx.compose.ui.text.LinkInteractionListener linkInteractionListener) {
    }
    
    private static final androidx.compose.ui.text.ParagraphStyle toParagraphStyle(android.text.style.AlignmentSpan $this$toParagraphStyle) {
        return null;
    }
    
    private static final androidx.compose.ui.text.SpanStyle toSpanStyle(android.text.style.StyleSpan $this$toSpanStyle) {
        return null;
    }
    
    private static final androidx.compose.ui.text.SpanStyle toSpanStyle(android.text.style.TypefaceSpan $this$toSpanStyle) {
        return null;
    }
    
    /**
     * Mirrors [androidx.compose.ui.text.font.PlatformTypefaces.optionalOnDeviceFontFamilyByName]
     * behavior with both font weight and font style being Normal in this case
     */
    private static final androidx.compose.ui.text.font.FontFamily optionalFontFamilyFromName(java.lang.String familyName) {
        return null;
    }
}