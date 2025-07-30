package org.wikipedia.talk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.adapter.PagingDataAdapterPatched;
import org.wikipedia.databinding.ActivityArchivedTalkPagesBinding;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.PageItemView;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.views.WikiErrorView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\t\u001c\u001d\u001e\u001f !\"#$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "archivedTalkPagesAdapter", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ArchivedTalkPagesAdapter;", "archivedTalkPagesConcatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "archivedTalkPagesLoadFooter", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity$LoadingItemAdapter;", "archivedTalkPagesLoadHeader", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "itemCallback", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ItemCallback;", "viewModel", "Lorg/wikipedia/talk/ArchivedTalkPagesViewModel;", "getViewModel", "()Lorg/wikipedia/talk/ArchivedTalkPagesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setToolbarTitle", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "ArchivedTalkPageItemHolder", "ArchivedTalkPagesAdapter", "ArchivedTalkPagesDiffCallback", "Companion", "EmptyItemAdapter", "EmptyViewHolder", "ItemCallback", "LoadingItemAdapter", "LoadingViewHolder", "app.lib"})
public final class ArchivedTalkPagesActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityArchivedTalkPagesBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.ArchivedTalkPagesActivity.ArchivedTalkPagesAdapter archivedTalkPagesAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.ArchivedTalkPagesActivity.LoadingItemAdapter archivedTalkPagesLoadHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.ArchivedTalkPagesActivity.LoadingItemAdapter archivedTalkPagesLoadFooter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ConcatAdapter archivedTalkPagesConcatAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.ArchivedTalkPagesActivity.ItemCallback itemCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.ArchivedTalkPagesActivity.Companion Companion = null;
    
    public ArchivedTalkPagesActivity() {
        super();
    }
    
    private final org.wikipedia.talk.ArchivedTalkPagesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setToolbarTitle(org.wikipedia.page.PageTitle pageTitle) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ArchivedTalkPageItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;Lorg/wikipedia/views/PageItemView;)V", "getView", "()Lorg/wikipedia/views/PageItemView;", "bindItem", "", "title", "app.lib"})
    final class ArchivedTalkPageItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.views.PageItemView<org.wikipedia.page.PageTitle> view = null;
        
        public ArchivedTalkPageItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.page.PageTitle> view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.views.PageItemView<org.wikipedia.page.PageTitle> getView() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ArchivedTalkPagesAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/page/PageTitle;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ArchivedTalkPageItemHolder;", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity;", "parent", "Landroid/view/ViewGroup;", "pos", "app.lib"})
    final class ArchivedTalkPagesAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.page.PageTitle, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public ArchivedTalkPagesAdapter() {
            super(null, null, null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.ArchivedTalkPagesActivity.ArchivedTalkPageItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ArchivedTalkPagesDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    final class ArchivedTalkPagesDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.page.PageTitle> {
        
        public ArchivedTalkPagesDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "talkTopicTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle talkTopicTitle) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$EmptyItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity$EmptyViewHolder;", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity;", "text", "", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;I)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class EmptyItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.talk.ArchivedTalkPagesActivity.EmptyViewHolder> {
        private final int text = 0;
        
        public EmptyItemAdapter(@androidx.annotation.StringRes()
        int text) {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.ArchivedTalkPagesActivity.EmptyViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.ArchivedTalkPagesActivity.EmptyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;Landroid/view/View;)V", "bindItem", "", "text", "", "app.lib"})
    final class EmptyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@androidx.annotation.StringRes()
        int text) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$ItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app.lib"})
    final class ItemCallback implements org.wikipedia.views.PageItemView.Callback<org.wikipedia.page.PageTitle> {
        
        public ItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle item) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle item) {
            return false;
        }
        
        @java.lang.Override()
        public void onActionClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$LoadingItemAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity$LoadingViewHolder;", "Lorg/wikipedia/talk/ArchivedTalkPagesActivity;", "retry", "Lkotlin/Function0;", "", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app.lib"})
    final class LoadingItemAdapter extends androidx.paging.LoadStateAdapter<org.wikipedia.talk.ArchivedTalkPagesActivity.LoadingViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
        
        public LoadingItemAdapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.ArchivedTalkPagesActivity.LoadingViewHolder holder, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.ArchivedTalkPagesActivity.LoadingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/talk/ArchivedTalkPagesActivity$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/talk/ArchivedTalkPagesActivity;Landroid/view/View;)V", "bindItem", "", "loadState", "Landroidx/paging/LoadState;", "retry", "Lkotlin/Function0;", "app.lib"})
    final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        }
    }
}