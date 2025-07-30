package org.wikipedia.page.linkpreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewLinkPreviewErrorBinding;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\"#$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!R\u0015\u0010\u000b\u001a\u00060\fR\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0018\u001a\u00060\u0019R\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addToListCallback", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$OverlayViewAddToListCallback;", "getAddToListCallback", "()Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$OverlayViewAddToListCallback;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$Callback;", "getCallback", "()Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$Callback;", "setCallback", "(Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$Callback;)V", "dismissCallback", "Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$OverlayViewDismissCallback;", "getDismissCallback", "()Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$OverlayViewDismissCallback;", "setError", "", "caught", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "Callback", "OverlayViewAddToListCallback", "OverlayViewDismissCallback", "app.lib"})
public final class LinkPreviewErrorView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.linkpreview.LinkPreviewErrorView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.linkpreview.LinkPreviewErrorView.OverlayViewAddToListCallback addToListCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.linkpreview.LinkPreviewErrorView.OverlayViewDismissCallback dismissCallback = null;
    
    public LinkPreviewErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public LinkPreviewErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public LinkPreviewErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.linkpreview.LinkPreviewErrorView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.linkpreview.LinkPreviewErrorView.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.linkpreview.LinkPreviewErrorView.OverlayViewAddToListCallback getAddToListCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.linkpreview.LinkPreviewErrorView.OverlayViewDismissCallback getDismissCallback() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$Callback;", "", "onAddToList", "", "onDismiss", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onAddToList();
        
        public abstract void onDismiss();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$OverlayViewAddToListCallback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "(Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;)V", "onPrimaryClick", "", "onSecondaryClick", "onTertiaryClick", "app.lib"})
    public final class OverlayViewAddToListCallback implements org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback {
        
        public OverlayViewAddToListCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPrimaryClick() {
        }
        
        @java.lang.Override()
        public void onSecondaryClick() {
        }
        
        @java.lang.Override()
        public void onTertiaryClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView$OverlayViewDismissCallback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "(Lorg/wikipedia/page/linkpreview/LinkPreviewErrorView;)V", "onPrimaryClick", "", "onSecondaryClick", "onTertiaryClick", "app.lib"})
    public final class OverlayViewDismissCallback implements org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback {
        
        public OverlayViewDismissCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPrimaryClick() {
        }
        
        @java.lang.Override()
        public void onSecondaryClick() {
        }
        
        @java.lang.Override()
        public void onTertiaryClick() {
        }
    }
}