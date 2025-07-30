package org.wikipedia.feed.news;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.databinding.FragmentNewsBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.view.ListCardItemView;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageActivity;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.richtext.RichTextUtil;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.GradientUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.TabUtil;
import org.wikipedia.views.DefaultRecyclerAdapter;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.DrawableItemDecoration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0003\u001f !B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/feed/news/NewsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "binding", "getBinding", "()Lerror/NonExistentClass;", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "viewModel", "Lorg/wikipedia/feed/news/NewsViewModel;", "getViewModel", "()Lorg/wikipedia/feed/news/NewsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Callback", "Companion", "RecyclerAdapter", "app.lib"})
public final class NewsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentNewsBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener offsetChangedListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.news.NewsFragment.Companion Companion = null;
    
    public NewsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.feed.news.NewsViewModel getViewModel() {
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
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J7\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H\u0016\u00a2\u0006\u0002\u0010\u0014J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0016\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/feed/news/NewsFragment$Callback;", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "(Lorg/wikipedia/feed/news/NewsFragment;)V", "onAddPageToList", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMovePageToList", "sourceReadingListId", "", "onSelectPage", "card", "Lorg/wikipedia/feed/model/Card;", "sharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "", "(Lorg/wikipedia/feed/model/Card;Lorg/wikipedia/history/HistoryEntry;[Landroid/util/Pair;)V", "openInNewBackgroundTab", "app.lib"})
    final class Callback implements org.wikipedia.feed.view.ListCardItemView.Callback {
        
        public Callback() {
            super();
        }
        
        @java.lang.Override()
        public void onSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean openInNewBackgroundTab) {
        }
        
        @java.lang.Override()
        public void onSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        android.util.Pair<android.view.View, java.lang.String>[] sharedElements) {
        }
        
        @java.lang.Override()
        public void onAddPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
        }
        
        @java.lang.Override()
        public void onMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/news/NewsFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/feed/news/NewsFragment;", "item", "Lorg/wikipedia/feed/news/NewsItem;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.news.NewsFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItem item, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007R\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/news/NewsFragment$RecyclerAdapter;", "Lorg/wikipedia/views/DefaultRecyclerAdapter;", "Lorg/wikipedia/feed/news/NewsLinkCard;", "Lorg/wikipedia/feed/view/ListCardItemView;", "items", "", "callback", "Lorg/wikipedia/feed/news/NewsFragment$Callback;", "Lorg/wikipedia/feed/news/NewsFragment;", "(Ljava/util/List;Lorg/wikipedia/feed/news/NewsFragment$Callback;)V", "onBindViewHolder", "", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    static final class RecyclerAdapter extends org.wikipedia.views.DefaultRecyclerAdapter<org.wikipedia.feed.news.NewsLinkCard, org.wikipedia.feed.view.ListCardItemView> {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.feed.news.NewsFragment.Callback callback = null;
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.news.NewsLinkCard> items, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsFragment.Callback callback) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> holder, int position) {
        }
    }
}