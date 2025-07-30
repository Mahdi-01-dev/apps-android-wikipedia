package org.wikipedia.talk;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemTalkTopicBinding;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.page.Namespace;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.util.*;
import org.wikipedia.util.log.L;
import org.wikipedia.views.SwipeableItemTouchHelperCallback;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\'\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/talk/TalkTopicHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "binding", "error/NonExistentClass", "context", "Landroidx/appcompat/app/AppCompatActivity;", "viewModel", "Lorg/wikipedia/talk/TalkTopicsViewModel;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "(Lerror/NonExistentClass;Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/talk/TalkTopicsViewModel;Lorg/wikipedia/Constants$InvokeSource;)V", "Lerror/NonExistentClass;", "threadItem", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "bindItem", "", "item", "isSwipeable", "", "markAsSeen", "force", "onClick", "v", "Landroid/view/View;", "onSwipe", "showOverflowMenu", "anchorView", "app.lib"})
public final class TalkTopicHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
    @org.jetbrains.annotations.NotNull()
    private final ItemTalkTopicBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity context = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicsViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    private org.wikipedia.dataclient.discussiontools.ThreadItem threadItem;
    
    public TalkTopicHolder(@org.jetbrains.annotations.NotNull()
    ItemTalkTopicBinding binding, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.TalkTopicsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
        super(null);
    }
    
    public final void bindItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.discussiontools.ThreadItem item) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onSwipe() {
    }
    
    @java.lang.Override()
    public boolean isSwipeable() {
        return false;
    }
    
    private final void markAsSeen(boolean force) {
    }
    
    private final void showOverflowMenu(android.view.View anchorView) {
    }
}