package org.wikipedia.views;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\fH\u0004\u00a2\u0006\u0002\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/views/DefaultRecyclerAdapter;", "T", "V", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "items", "", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getItemCount", "", "item", "position", "(I)Ljava/lang/Object;", "app.lib"})
public abstract class DefaultRecyclerAdapter<T extends java.lang.Object, V extends android.view.View> extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<V>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> items = null;
    
    public DefaultRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItems() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    protected final T item(int position) {
        return null;
    }
}