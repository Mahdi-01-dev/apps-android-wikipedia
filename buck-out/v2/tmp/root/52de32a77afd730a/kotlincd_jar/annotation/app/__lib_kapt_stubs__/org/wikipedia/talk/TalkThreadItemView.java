package org.wikipedia.talk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.*;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.wikipedia.R;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.ItemTalkThreadItemBinding;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.richtext.CustomHtmlParser;
import org.wikipedia.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J,\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/talk/TalkThreadItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/talk/TalkThreadItemView$Callback;", "getCallback", "()Lorg/wikipedia/talk/TalkThreadItemView$Callback;", "setCallback", "(Lorg/wikipedia/talk/TalkThreadItemView$Callback;)V", "item", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "overflowMenuListener", "Landroidx/appcompat/view/menu/MenuBuilder$Callback;", "animateSelectedBackground", "", "bindItem", "movementMethod", "Landroid/text/method/MovementMethod;", "replying", "", "searchQuery", "", "updateExpandedState", "Callback", "app.lib"})
@android.annotation.SuppressLint(value = {"RestrictedApi"})
public final class TalkThreadItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.talk.TalkThreadItemView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    private org.wikipedia.dataclient.discussiontools.ThreadItem item;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.view.menu.MenuBuilder.Callback overflowMenuListener = null;
    
    public TalkThreadItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.talk.TalkThreadItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.talk.TalkThreadItemView.Callback p0) {
    }
    
    public final void bindItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.discussiontools.ThreadItem item, @org.jetbrains.annotations.NotNull()
    android.text.method.MovementMethod movementMethod, boolean replying, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void animateSelectedBackground() {
    }
    
    private final void updateExpandedState() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/talk/TalkThreadItemView$Callback;", "", "onExpandClick", "", "item", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "onReplyClick", "onShareClick", "onUserNameClick", "view", "Landroid/view/View;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onExpandClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item);
        
        public abstract void onReplyClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item);
        
        public abstract void onShareClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item);
        
        public abstract void onUserNameClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
}