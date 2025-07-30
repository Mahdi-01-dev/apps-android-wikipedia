package org.wikipedia.talk.template;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemTalkTemplatesBinding;
import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\b\u0010 \u001a\u00020\u0011H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/talk/template/TalkTemplatesItemView$Callback;", "getCallback", "()Lorg/wikipedia/talk/template/TalkTemplatesItemView$Callback;", "setCallback", "(Lorg/wikipedia/talk/template/TalkTemplatesItemView$Callback;)V", "setCheckBoxChecked", "", "checked", "", "setCheckBoxEnabled", "enabled", "setContents", "talkTemplate", "Lorg/wikipedia/talk/db/TalkTemplate;", "position", "", "isSaveMessagesTab", "setDragHandleEnabled", "setDragHandleTouchListener", "listener", "Landroid/view/View$OnTouchListener;", "updateBackgroundColor", "Callback", "app.lib"})
public final class TalkTemplatesItemView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.talk.template.TalkTemplatesItemView.Callback callback;
    
    public TalkTemplatesItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.talk.template.TalkTemplatesItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.talk.template.TalkTemplatesItemView.Callback p0) {
    }
    
    private final void updateBackgroundColor() {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplate talkTemplate, int position, boolean isSaveMessagesTab) {
    }
    
    public final void setCheckBoxEnabled(boolean enabled) {
    }
    
    public final void setCheckBoxChecked(boolean checked) {
    }
    
    public final void setDragHandleEnabled(boolean enabled) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void setDragHandleTouchListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesItemView$Callback;", "", "onCheckedChanged", "", "position", "", "onClick", "onLongPress", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onClick(int position);
        
        public abstract void onCheckedChanged(int position);
        
        public abstract void onLongPress(int position);
    }
}