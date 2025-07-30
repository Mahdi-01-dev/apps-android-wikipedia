package org.wikipedia.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewMessageCardBinding;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0012\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0010J \u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\"\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010#\u001a\u00020\r2\b\b\u0001\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001fR\u0013\u0010\u0007\u001a\u00020\b\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/views/MessageCardView;", "Lorg/wikipedia/views/WikiCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "setDefaultState", "", "setDisabled", "message", "", "setIPBlocked", "setImageResource", "imageResource", "", "visible", "", "setMessageLabel", "setMessageText", "text", "setMessageTitle", "title", "setNegativeButton", "stringRes", "listener", "Landroid/view/View$OnClickListener;", "applyListenerToContainer", "setOnboarding", "setPaused", "setPositiveButton", "setRequiredLogin", "onClickListener", "app.lib"})
public final class MessageCardView extends org.wikipedia.views.WikiCardView {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public MessageCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    public final void setMessageTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setMessageText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void setImageResource(@androidx.annotation.DrawableRes()
    int imageResource, boolean visible) {
    }
    
    public final void setPositiveButton(@androidx.annotation.StringRes()
    int stringRes, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener, boolean applyListenerToContainer) {
    }
    
    public final void setNegativeButton(@androidx.annotation.StringRes()
    int stringRes, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener, boolean applyListenerToContainer) {
    }
    
    public final void setOnboarding(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setPaused(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setDisabled(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setIPBlocked(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void setRequiredLogin(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener onClickListener) {
    }
    
    public final void setMessageLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    private final void setDefaultState() {
    }
}