package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/views/GoneIfEmptyTextView;", "Lorg/wikipedia/views/AppTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onTextChanged", "", "text", "", "start", "", "lengthBefore", "lengthAfter", "app.lib"})
public final class GoneIfEmptyTextView extends org.wikipedia.views.AppTextView {
    
    public GoneIfEmptyTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    @java.lang.Override()
    protected void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) {
    }
}