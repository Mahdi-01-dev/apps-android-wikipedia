package org.wikipedia.edit;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputType;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import org.wikipedia.R;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.log.L;

/**
 * Notice that this view inherits from the platform EditText class, instead of AppCompatEditText.
 * This is because AppCompatEditText actually has very poor performance when displaying large
 * amounts of text. Inheriting directly from the base EditText provides a vast improvement in
 * performance, but it means we need to keep an eye on the source code of AppCompatEditText, in
 * case we need to copy over any useful compatibility logic.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010,\u001a\u00020-H\u0002J\"\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u000e\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020\u000eJ\u0006\u00106\u001a\u00020-J\b\u00107\u001a\u000208H\u0016J\u000e\u00109\u001a\u00020-2\u0006\u00102\u001a\u000203J\u0012\u0010:\u001a\u0004\u0018\u00010\u00122\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0014J0\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\tH\u0014J\u0012\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020GH\u0017J\u0006\u0010I\u001a\u00020-J\u0012\u0010J\u001a\u00020\u000e2\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010L\u001a\u00020-R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006M"}, d2 = {"Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "Landroid/widget/EditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actualLineFromRenderedLine", "", "allowScrollToCursor", "", "gutterRect", "Landroid/graphics/Rect;", "inputConnection", "Landroid/view/inputmethod/InputConnection;", "getInputConnection", "()Landroid/view/inputmethod/InputConnection;", "setInputConnection", "(Landroid/view/inputmethod/InputConnection;)V", "isRtl", "lineNumberBackgroundPaint", "Landroid/graphics/Paint;", "lineNumberGapWidth", "lineNumberPaint", "Landroid/text/TextPaint;", "paddingWithLineNumbers", "paddingWithoutLineNumbers", "prevLineCount", "scrollView", "Landroid/view/View;", "getScrollView", "()Landroid/view/View;", "setScrollView", "(Landroid/view/View;)V", "value", "showLineNumbers", "getShowLineNumbers", "()Z", "setShowLineNumbers", "(Z)V", "applyPaddingForLineNumbers", "", "computeLineNumbers", "lineCount", "layout", "Landroid/text/Layout;", "text", "", "enableTypingSuggestions", "enabled", "enqueueNoScrollingLayoutChange", "getText", "Landroid/text/Editable;", "highlightText", "onCreateInputConnection", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", "top", "right", "bottom", "onReceiveContent", "Landroid/view/ContentInfo;", "payload", "redo", "requestRectangleOnScreen", "rectangle", "undo", "app.lib"})
@android.annotation.SuppressLint(value = {"AppCompatCustomView"})
public class SyntaxHighlightableEditText extends android.widget.EditText {
    private int prevLineCount = -1;
    @org.jetbrains.annotations.NotNull()
    private final android.text.TextPaint lineNumberPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint lineNumberBackgroundPaint = null;
    private final boolean isRtl = false;
    private final int paddingWithoutLineNumbers = 0;
    private final int paddingWithLineNumbers = 0;
    private final int lineNumberGapWidth = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect gutterRect = null;
    private boolean allowScrollToCursor = true;
    @org.jetbrains.annotations.Nullable()
    private android.view.View scrollView;
    private int[] actualLineFromRenderedLine;
    @org.jetbrains.annotations.Nullable()
    private android.view.inputmethod.InputConnection inputConnection;
    private boolean showLineNumbers = false;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getScrollView() {
        return null;
    }
    
    public final void setScrollView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.InputConnection getInputConnection() {
        return null;
    }
    
    public final void setInputConnection(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.InputConnection p0) {
    }
    
    public final boolean getShowLineNumbers() {
        return false;
    }
    
    public final void setShowLineNumbers(boolean value) {
    }
    
    public SyntaxHighlightableEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public SyntaxHighlightableEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SyntaxHighlightableEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void enqueueNoScrollingLayoutChange() {
    }
    
    public final void enableTypingSuggestions(boolean enabled) {
    }
    
    @java.lang.Override()
    public boolean requestRectangleOnScreen(@org.jetbrains.annotations.Nullable()
    android.graphics.Rect rectangle) {
        return false;
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void computeLineNumbers(int lineCount, android.text.Layout layout, java.lang.String text) {
    }
    
    private final void applyPaddingForLineNumbers() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.text.Editable getText() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.inputmethod.InputConnection onCreateInputConnection(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.EditorInfo outAttrs) {
        return null;
    }
    
    @java.lang.Override()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
    @org.jetbrains.annotations.Nullable()
    public android.view.ContentInfo onReceiveContent(@org.jetbrains.annotations.NotNull()
    android.view.ContentInfo payload) {
        return null;
    }
    
    public final void undo() {
    }
    
    public final void redo() {
    }
    
    public final void highlightText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}