package org.wikipedia.feed.configure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ItemFeedContentTypeBinding;
import org.wikipedia.feed.FeedContentType;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapter", "Lorg/wikipedia/feed/configure/LanguageItemAdapter;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "getCallback", "()Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "setCallback", "(Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;)V", "contentType", "Lorg/wikipedia/feed/FeedContentType;", "setContents", "", "setDragHandleTouchListener", "listener", "Landroid/view/View$OnTouchListener;", "showLangSelectDialog", "Callback", "app.lib"})
public final class ConfigureItemView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private org.wikipedia.feed.FeedContentType contentType;
    private org.wikipedia.feed.configure.LanguageItemAdapter adapter;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.configure.ConfigureItemView.Callback callback;
    
    public ConfigureItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.configure.ConfigureItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.configure.ConfigureItemView.Callback p0) {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.FeedContentType contentType) {
    }
    
    private final void showLangSelectDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void setDragHandleTouchListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "", "onCheckedChanged", "", "contentType", "Lorg/wikipedia/feed/FeedContentType;", "checked", "", "onLanguagesChanged", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onCheckedChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.FeedContentType contentType, boolean checked);
        
        public abstract void onLanguagesChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.FeedContentType contentType);
    }
}