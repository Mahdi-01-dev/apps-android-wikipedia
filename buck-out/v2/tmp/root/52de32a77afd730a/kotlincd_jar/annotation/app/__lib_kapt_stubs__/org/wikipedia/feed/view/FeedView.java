package org.wikipedia.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.wikipedia.R;
import org.wikipedia.feed.dayheader.DayHeaderMarginItemDecoration;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.views.AutoFitRecyclerView;
import org.wikipedia.views.HeaderMarginItemDecoration;
import org.wikipedia.views.MarginItemDecoration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/feed/view/FeedView;", "Lorg/wikipedia/views/AutoFitRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "firstVisibleItemPosition", "", "getFirstVisibleItemPosition", "()I", "RecyclerViewColumnCallback", "app.lib"})
public final class FeedView extends org.wikipedia.views.AutoFitRecyclerView {
    
    public FeedView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    public final int getFirstVisibleItemPosition() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/view/FeedView$RecyclerViewColumnCallback;", "Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "(Lorg/wikipedia/feed/view/FeedView;)V", "onColumns", "", "columns", "", "app.lib"})
    final class RecyclerViewColumnCallback implements org.wikipedia.views.AutoFitRecyclerView.Callback {
        
        public RecyclerViewColumnCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onColumns(int columns) {
        }
    }
}