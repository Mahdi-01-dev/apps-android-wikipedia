package org.wikipedia.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.PopupMenu;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewCardHeaderBinding;
import org.wikipedia.feed.model.Card;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002!\"B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/feed/view/CardHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/feed/view/CardHeaderView$Callback;", "card", "Lorg/wikipedia/feed/model/Card;", "<set-?>", "titleView", "getTitleView", "()Lerror/NonExistentClass;", "setCallback", "setCard", "setLangCode", "langCode", "", "setSecondaryIcon", "id", "", "setTitle", "title", "", "showOverflowMenu", "", "anchorView", "Landroid/view/View;", "Callback", "CardHeaderMenuClickListener", "app.lib"})
public final class CardHeaderView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.model.Card card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.CardHeaderView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object titleView;
    
    public CardHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTitleView() {
        return null;
    }
    
    private final void showOverflowMenu(android.view.View anchorView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardHeaderView setCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardHeaderView setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.CardHeaderView.Callback callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardHeaderView setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardHeaderView setTitle(@androidx.annotation.StringRes()
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardHeaderView setLangCode(@org.jetbrains.annotations.Nullable()
    java.lang.String langCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.CardHeaderView setSecondaryIcon(@androidx.annotation.DrawableRes()
    int id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/view/CardHeaderView$Callback;", "", "onRequestCustomize", "", "card", "Lorg/wikipedia/feed/model/Card;", "onRequestDismissCard", "", "onRequestEditCardLanguages", "app.lib"})
    public static abstract interface Callback {
        
        public abstract boolean onRequestDismissCard(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card);
        
        public abstract void onRequestEditCardLanguages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card);
        
        public abstract void onRequestCustomize(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/view/CardHeaderView$CardHeaderMenuClickListener;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "(Lorg/wikipedia/feed/view/CardHeaderView;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app.lib"})
    final class CardHeaderMenuClickListener implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
        
        public CardHeaderMenuClickListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}