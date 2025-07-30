package org.wikipedia.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;
import org.wikipedia.databinding.ViewTalkTopicsSortOverflowBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/views/TalkTopicsSortOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/TalkTopicsSortOverflowView$Callback;", "currentSortMode", "", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismissPopupWindowHost", "", "setButtonsListener", "show", "anchorView", "Landroid/view/View;", "sortMode", "Callback", "Companion", "app.lib"})
public final class TalkTopicsSortOverflowView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.TalkTopicsSortOverflowView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow popupWindowHost;
    private int currentSortMode = 0;
    public static final int SORT_BY_DATE_PUBLISHED_DESCENDING = 0;
    public static final int SORT_BY_DATE_PUBLISHED_ASCENDING = 1;
    public static final int SORT_BY_TOPIC_NAME_DESCENDING = 2;
    public static final int SORT_BY_TOPIC_NAME_ASCENDING = 3;
    public static final int SORT_BY_DATE_UPDATED_DESCENDING = 4;
    public static final int SORT_BY_DATE_UPDATED_ASCENDING = 5;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.TalkTopicsSortOverflowView.Companion Companion = null;
    
    public TalkTopicsSortOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, int sortMode, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.TalkTopicsSortOverflowView.Callback callback) {
    }
    
    private final void dismissPopupWindowHost() {
    }
    
    private final void setButtonsListener() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/TalkTopicsSortOverflowView$Callback;", "", "sortByClicked", "", "sortByMode", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void sortByClicked(int sortByMode);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/views/TalkTopicsSortOverflowView$Companion;", "", "()V", "SORT_BY_DATE_PUBLISHED_ASCENDING", "", "SORT_BY_DATE_PUBLISHED_DESCENDING", "SORT_BY_DATE_UPDATED_ASCENDING", "SORT_BY_DATE_UPDATED_DESCENDING", "SORT_BY_TOPIC_NAME_ASCENDING", "SORT_BY_TOPIC_NAME_DESCENDING", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}