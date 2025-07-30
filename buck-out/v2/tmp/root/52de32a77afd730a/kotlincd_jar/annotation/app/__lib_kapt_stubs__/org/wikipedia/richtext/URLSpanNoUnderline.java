package org.wikipedia.richtext;

import android.text.TextPaint;
import android.text.style.URLSpan;
import androidx.annotation.ColorInt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/richtext/URLSpanNoUnderline;", "Landroid/text/style/URLSpan;", "url", "", "color", "", "(Ljava/lang/String;I)V", "updateDrawState", "", "paint", "Landroid/text/TextPaint;", "app.lib"})
public class URLSpanNoUnderline extends android.text.style.URLSpan {
    private final int color = 0;
    
    public URLSpanNoUnderline(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @androidx.annotation.ColorInt()
    int color) {
        super(null);
    }
    
    @java.lang.Override()
    public void updateDrawState(@org.jetbrains.annotations.NotNull()
    android.text.TextPaint paint) {
    }
}