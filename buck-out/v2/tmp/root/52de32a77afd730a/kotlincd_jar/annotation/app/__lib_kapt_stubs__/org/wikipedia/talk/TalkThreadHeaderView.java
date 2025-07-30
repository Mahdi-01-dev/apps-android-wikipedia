package org.wikipedia.talk;

import android.content.Context;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemTalkThreadHeaderBinding;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.page.PageTitle;
import org.wikipedia.staticdata.TalkAliasData;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J4\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/talk/TalkThreadHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/talk/TalkThreadHeaderView$Callback;", "getCallback", "()Lorg/wikipedia/talk/TalkThreadHeaderView$Callback;", "setCallback", "(Lorg/wikipedia/talk/TalkThreadHeaderView$Callback;)V", "bind", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "item", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "subscribed", "", "movementMethod", "Landroid/text/method/MovementMethod;", "searchQuery", "", "Callback", "app.lib"})
public final class TalkThreadHeaderView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.talk.TalkThreadHeaderView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public TalkThreadHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.talk.TalkThreadHeaderView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.talk.TalkThreadHeaderView.Callback p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.discussiontools.ThreadItem item, boolean subscribed, @org.jetbrains.annotations.NotNull()
    android.text.method.MovementMethod movementMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/talk/TalkThreadHeaderView$Callback;", "", "onSubscribeClick", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSubscribeClick();
    }
}