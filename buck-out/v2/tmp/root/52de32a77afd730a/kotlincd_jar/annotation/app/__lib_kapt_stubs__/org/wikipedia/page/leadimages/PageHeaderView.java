package org.wikipedia.page.leadimages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.wikipedia.R;
import org.wikipedia.databinding.ViewPageHeaderBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.GradientUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.LinearLayoutOverWebView;
import org.wikipedia.views.ObservableWebView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0010J0\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014J \u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020%H\u0016J\u0006\u0010.\u001a\u00020 J\u0006\u0010/\u001a\u00020 J\u0012\u00100\u001a\u00020 2\b\b\u0002\u0010,\u001a\u00020\nH\u0002R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00062"}, d2 = {"Lorg/wikipedia/page/leadimages/PageHeaderView;", "Lorg/wikipedia/views/LinearLayoutOverWebView;", "Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "value", "", "callToActionText", "getCallToActionText", "()Ljava/lang/String;", "setCallToActionText", "(Ljava/lang/String;)V", "callback", "Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;", "getCallback", "()Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;", "setCallback", "(Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;)V", "imageView", "getImageView", "()Lerror/NonExistentClass;", "hide", "", "loadImage", "url", "onLayout", "changed", "", "left", "top", "right", "bottom", "onScrollChanged", "oldScrollY", "scrollY", "isHumanScroll", "refreshCallToActionVisibility", "show", "updateScroll", "Callback", "app.lib"})
public final class PageHeaderView extends org.wikipedia.views.LinearLayoutOverWebView implements org.wikipedia.views.ObservableWebView.OnScrollChangeListener {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String callToActionText;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.leadimages.PageHeaderView.Callback callback;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCallToActionText() {
        return null;
    }
    
    public final void setCallToActionText(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.leadimages.PageHeaderView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.leadimages.PageHeaderView.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getImageView() {
        return null;
    }
    
    public PageHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PageHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PageHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    public void onScrollChanged(int oldScrollY, int scrollY, boolean isHumanScroll) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    private final void updateScroll(int scrollY) {
    }
    
    public final void hide() {
    }
    
    public final void show() {
    }
    
    public final void refreshCallToActionVisibility() {
    }
    
    public final void loadImage(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;", "", "onCallToActionClicked", "", "onImageClicked", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onImageClicked();
        
        public abstract void onCallToActionClicked();
    }
}