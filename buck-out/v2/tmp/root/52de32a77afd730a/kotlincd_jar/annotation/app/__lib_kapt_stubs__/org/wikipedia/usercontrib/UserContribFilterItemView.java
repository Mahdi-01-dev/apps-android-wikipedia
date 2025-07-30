package org.wikipedia.usercontrib;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.ImageViewCompat;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ItemUserContribFilterBinding;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/usercontrib/UserContribFilterItemView$Callback;", "getCallback", "()Lorg/wikipedia/usercontrib/UserContribFilterItemView$Callback;", "setCallback", "(Lorg/wikipedia/usercontrib/UserContribFilterItemView$Callback;)V", "item", "Lorg/wikipedia/usercontrib/UserContribFilterActivity$Item;", "Lorg/wikipedia/usercontrib/UserContribFilterActivity;", "getTitleCodeFor", "", "itemCode", "setContents", "", "setSingleLabel", "text", "Callback", "app.lib"})
public final class UserContribFilterItemView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.usercontrib.UserContribFilterActivity.Item item;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.usercontrib.UserContribFilterItemView.Callback callback;
    
    public UserContribFilterItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.usercontrib.UserContribFilterItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.usercontrib.UserContribFilterItemView.Callback p0) {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.usercontrib.UserContribFilterActivity.Item item) {
    }
    
    public final void setSingleLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    private final java.lang.String getTitleCodeFor(java.lang.String itemCode) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterItemView$Callback;", "", "onSelected", "", "item", "Lorg/wikipedia/usercontrib/UserContribFilterActivity$Item;", "Lorg/wikipedia/usercontrib/UserContribFilterActivity;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSelected(@org.jetbrains.annotations.Nullable()
        org.wikipedia.usercontrib.UserContribFilterActivity.Item item);
    }
}