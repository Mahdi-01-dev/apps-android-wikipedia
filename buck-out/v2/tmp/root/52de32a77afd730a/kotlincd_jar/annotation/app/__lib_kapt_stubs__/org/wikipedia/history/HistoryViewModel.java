package org.wikipedia.history;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.util.Resource;
import org.wikipedia.util.SingleLiveData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\rJ\u0014\u0010 \u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\rJ\u000e\u0010!\u001a\u00020\u001cH\u0082@\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u001cH\u0014J\u0006\u0010$\u001a\u00020\u001cR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\u000b\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r \u000f*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u00050\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/history/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "deleteHistoryItemsAction", "Lorg/wikipedia/util/SingleLiveData;", "Lorg/wikipedia/util/Resource;", "", "getDeleteHistoryItemsAction", "()Lorg/wikipedia/util/SingleLiveData;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "historyItems", "Landroidx/lifecycle/MutableLiveData;", "", "", "kotlin.jvm.PlatformType", "getHistoryItems", "()Landroidx/lifecycle/MutableLiveData;", "searchJob", "Lkotlinx/coroutines/Job;", "value", "", "searchQuery", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "deleteAllHistoryItems", "", "deleteHistoryItems", "entries", "Lorg/wikipedia/history/HistoryEntry;", "insertHistoryItem", "loadHistoryItems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "reloadHistoryItems", "app.lib"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchQuery;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<java.lang.Object>>> historyItems = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> deleteHistoryItemsAction = null;
    
    public HistoryViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<java.lang.Object>>> getHistoryItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> getDeleteHistoryItemsAction() {
        return null;
    }
    
    public final void reloadHistoryItems() {
    }
    
    private final java.lang.Object loadHistoryItems(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void deleteAllHistoryItems() {
    }
    
    public final void deleteHistoryItems(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.history.HistoryEntry> entries) {
    }
    
    public final void insertHistoryItem(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.history.HistoryEntry> entries) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}