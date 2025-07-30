package org.wikipedia.search;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.LongPressHandler;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.adapter.PagingDataAdapterPatched;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.databinding.FragmentSearchResultsBinding;
import org.wikipedia.databinding.ItemSearchNoResultsBinding;
import org.wikipedia.databinding.ItemSearchResultBinding;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00073456789B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001fJ$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u001fJ\u0018\u00100\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u00010\u000f2\u0006\u00102\u001a\u00020\nR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006:"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "isShowing", "", "()Z", "noSearchResultAdapter", "Lorg/wikipedia/search/SearchResultsFragment$NoSearchResultAdapter;", "searchLanguageCode", "", "getSearchLanguageCode", "()Ljava/lang/String;", "searchResultsAdapter", "Lorg/wikipedia/search/SearchResultsFragment$SearchResultsAdapter;", "searchResultsConcatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "viewModel", "Lorg/wikipedia/search/SearchResultsViewModel;", "getViewModel", "()Lorg/wikipedia/search/SearchResultsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callback", "Lorg/wikipedia/search/SearchResultsFragment$Callback;", "clearResults", "", "hide", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setInvokeSource", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "setLayoutDirection", "langCode", "show", "startSearch", "term", "force", "Callback", "NoSearchResultAdapter", "NoSearchResultItemViewHolder", "SearchResultItemViewHolder", "SearchResultsAdapter", "SearchResultsDiffCallback", "SearchResultsFragmentLongPressHandler", "app.lib"})
public final class SearchResultsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentSearchResultsBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.search.SearchResultsFragment.SearchResultsAdapter searchResultsAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.search.SearchResultsFragment.NoSearchResultAdapter noSearchResultAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ConcatAdapter searchResultsConcatAdapter = null;
    
    public SearchResultsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.search.SearchResultsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public final void setLayoutDirection(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
    }
    
    public final void startSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String term, boolean force) {
    }
    
    private final void clearResults() {
    }
    
    private final org.wikipedia.search.SearchResultsFragment.Callback callback() {
        return null;
    }
    
    public final void setInvokeSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    private final java.lang.String getSearchLanguageCode() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$Callback;", "", "navigateToTitle", "", "item", "Lorg/wikipedia/page/PageTitle;", "inNewTab", "", "position", "", "location", "Landroid/location/Location;", "onSearchAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "onSearchMovePageToList", "sourceReadingListId", "", "onSearchProgressBar", "enabled", "setSearchText", "text", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSearchAddPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault);
        
        public abstract void onSearchMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onSearchProgressBar(boolean enabled);
        
        public abstract void navigateToTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle item, boolean inNewTab, int position, @org.jetbrains.annotations.Nullable()
        android.location.Location location);
        
        public abstract void setSearchText(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$NoSearchResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/search/SearchResultsFragment$NoSearchResultItemViewHolder;", "Lorg/wikipedia/search/SearchResultsFragment;", "(Lorg/wikipedia/search/SearchResultsFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class NoSearchResultAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.search.SearchResultsFragment.NoSearchResultItemViewHolder> {
        
        public NoSearchResultAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.search.SearchResultsFragment.NoSearchResultItemViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.search.SearchResultsFragment.NoSearchResultItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$NoSearchResultItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemBinding", "error/NonExistentClass", "(Lorg/wikipedia/search/SearchResultsFragment;Lerror/NonExistentClass;)V", "accentColorStateList", "Landroid/content/res/ColorStateList;", "getItemBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "secondaryColorStateList", "bindItem", "", "resultPair", "Lkotlin/Pair;", "", "", "app.lib"})
    final class NoSearchResultItemViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final ItemSearchNoResultsBinding itemBinding = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.res.ColorStateList accentColorStateList = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.res.ColorStateList secondaryColorStateList = null;
        
        public NoSearchResultItemViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemSearchNoResultsBinding getItemBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        kotlin.Pair<java.lang.String, java.lang.Integer> resultPair) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0013\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemBinding", "error/NonExistentClass", "(Lorg/wikipedia/search/SearchResultsFragment;Lerror/NonExistentClass;)V", "getItemBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "position", "", "searchResult", "Lorg/wikipedia/search/SearchResult;", "app.lib"})
    final class SearchResultItemViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final ItemSearchResultBinding itemBinding = null;
        
        public SearchResultItemViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemSearchResultBinding getItemBinding() {
            return null;
        }
        
        public final void bindItem(int position, @org.jetbrains.annotations.NotNull()
        org.wikipedia.search.SearchResult searchResult) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultsAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/search/SearchResult;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "(Lorg/wikipedia/search/SearchResultsFragment;)V", "onBindViewHolder", "", "holder", "pos", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class SearchResultsAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.search.SearchResult, org.wikipedia.views.DefaultViewHolder<android.view.View>> {
        
        public SearchResultsAdapter() {
            super(null, null, null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.views.DefaultViewHolder<android.view.View> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<android.view.View> holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultsDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/search/SearchResult;", "(Lorg/wikipedia/search/SearchResultsFragment;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    final class SearchResultsDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.search.SearchResult> {
        
        public SearchResultsDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.search.SearchResult oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.search.SearchResult newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.search.SearchResult oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.search.SearchResult newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultsFragmentLongPressHandler;", "Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "lastPositionRequested", "", "(Lorg/wikipedia/search/SearchResultsFragment;I)V", "onAddRequest", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMoveRequest", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "onOpenInNewTab", "onOpenLink", "app.lib"})
    final class SearchResultsFragmentLongPressHandler implements org.wikipedia.readinglist.LongPressMenu.Callback {
        private final int lastPositionRequested = 0;
        
        public SearchResultsFragmentLongPressHandler(int lastPositionRequested) {
            super();
        }
        
        @java.lang.Override()
        public void onOpenLink(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @java.lang.Override()
        public void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @java.lang.Override()
        public void onAddRequest(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
        }
        
        @java.lang.Override()
        public void onMoveRequest(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @java.lang.Override()
        public void onOpenInPlaces(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        android.location.Location location) {
        }
        
        @java.lang.Override()
        public void onRemoveRequest() {
        }
    }
}