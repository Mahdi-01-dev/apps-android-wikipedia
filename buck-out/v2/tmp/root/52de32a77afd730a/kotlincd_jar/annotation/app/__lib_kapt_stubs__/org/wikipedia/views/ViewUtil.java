package org.wikipedia.views;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.databinding.ViewActionModeCloseButtonBinding;
import org.wikipedia.views.imageservice.ImageLoadListener;
import org.wikipedia.views.imageservice.ImageService;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J?\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/views/ViewUtil;", "", "()V", "adjustImagePlaceholderHeight", "", "containerWidth", "", "thumbWidth", "thumbHeight", "findClickableViewAtPoint", "Landroid/view/View;", "parentView", "point", "Landroid/graphics/Point;", "getTitleViewFromToolbar", "Landroid/widget/TextView;", "toolbar", "Landroid/view/ViewGroup;", "jumpToPositionWithoutAnimation", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "position", "loadImage", "view", "Landroid/widget/ImageView;", "url", "", "force", "", "placeholderId", "listener", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "(Landroid/widget/ImageView;Ljava/lang/String;ZLjava/lang/Integer;Lorg/wikipedia/views/imageservice/ImageLoadListener;)V", "setCloseButtonInActionMode", "context", "Landroid/content/Context;", "actionMode", "Landroid/view/ActionMode;", "app.lib"})
public final class ViewUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.ViewUtil INSTANCE = null;
    
    private ViewUtil() {
        super();
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean force, @androidx.annotation.DrawableRes()
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeholderId, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.imageservice.ImageLoadListener listener) {
    }
    
    public final void setCloseButtonInActionMode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode) {
    }
    
    public final int adjustImagePlaceholderHeight(float containerWidth, float thumbWidth, float thumbHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View findClickableViewAtPoint(@org.jetbrains.annotations.NotNull()
    android.view.View parentView, @org.jetbrains.annotations.NotNull()
    android.graphics.Point point) {
        return null;
    }
    
    public final void jumpToPositionWithoutAnimation(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTitleViewFromToolbar(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup toolbar) {
        return null;
    }
}