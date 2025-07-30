package org.wikipedia.adapter;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.paging.PagingData;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.Dispatchers;
import kotlin.coroutines.CoroutineContext;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\'\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "T", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/paging/PagingDataAdapter;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "mainDispatcher", "Lkotlin/coroutines/CoroutineContext;", "workerDispatcher", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "submitCompleted", "", "submitData", "", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "pagingData", "Landroidx/paging/PagingData;", "app.lib"})
public abstract class PagingDataAdapterPatched<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.paging.PagingDataAdapter<T, VH> {
    private boolean submitCompleted = true;
    
    public PagingDataAdapterPatched(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext mainDispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workerDispatcher) {
        super(null, null);
    }
    
    public final void submitData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleCoroutineScope scope, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingData<T> pagingData) {
    }
}