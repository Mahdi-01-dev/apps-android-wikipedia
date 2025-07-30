package org.wikipedia.games.onthisday;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.databinding.FragmentOnThisDayGameResultBinding;
import org.wikipedia.databinding.ItemOnThisDayGameShareTopicBinding;
import org.wikipedia.databinding.ItemOnThisDayGameTopicBinding;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageActivity;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.MarginItemDecoration;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.views.imageservice.ImageLoadListener;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0006;<=>?@B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J(\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)H\u0002J$\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\u0018\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006A"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;", "Lorg/wikipedia/games/onthisday/OnThisDayGameBaseFragment;", "Lorg/wikipedia/games/onthisday/OnThisDayGameArticleBottomSheet$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "handler", "Landroid/os/Handler;", "loadedImagesForShare", "", "mainActivity", "Lorg/wikipedia/games/onthisday/OnThisDayGameActivity;", "timeUpdateRunnable", "Ljava/lang/Runnable;", "viewModel", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "getViewModel", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "buildSharableContent", "", "gameState", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameState;", "articlesMentioned", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "createDots", "onArchiveDateSelected", "date", "Ljava/time/LocalDate;", "onBookmarkIconClick", "view", "Landroid/view/View;", "pageSummary", "position", "isSaved", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onGameEnded", "gameStatistics", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel$GameStatistics;", "onPageBookmarkChanged", "page", "updateOnError", "t", "", "updateOnLoading", "Companion", "RecyclerViewAdapter", "RecyclerViewItemHolder", "ShareImageLoadListener", "ShareRecyclerViewAdapter", "ShareRecyclerViewItemHolder", "app.lib"})
public final class OnThisDayGameResultFragment extends org.wikipedia.games.onthisday.OnThisDayGameBaseFragment implements org.wikipedia.games.onthisday.OnThisDayGameArticleBottomSheet.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentOnThisDayGameResultBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private java.lang.Runnable timeUpdateRunnable;
    private int loadedImagesForShare = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.games.onthisday.OnThisDayGameActivity mainActivity;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_GAME_COMPLETED = "onThisDayGameCompleted";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGameResultFragment.Companion Companion = null;
    
    public OnThisDayGameResultFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.games.onthisday.OnThisDayGameViewModel getViewModel() {
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
    public void onArchiveDateSelected(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateOnLoading() {
    }
    
    private final void updateOnError(java.lang.Throwable t) {
    }
    
    private final void onGameEnded(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState, org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameStatistics gameStatistics) {
    }
    
    private final void buildSharableContent(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState, java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> articlesMentioned) {
    }
    
    private final void createDots(org.wikipedia.games.onthisday.OnThisDayGameViewModel.GameState gameState) {
    }
    
    @java.lang.Override()
    public void onPageBookmarkChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary page) {
    }
    
    private final void onBookmarkIconClick(android.view.View view, org.wikipedia.dataclient.page.PageSummary pageSummary, int position, boolean isSaved) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$Companion;", "", "()V", "EXTRA_GAME_COMPLETED", "", "maybeShowOnThisDayGameEndContent", "", "activity", "Landroid/app/Activity;", "newInstance", "Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "timeUntilNextDay", "Ljava/time/Duration;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameResultFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.Duration timeUntilNextDay() {
            return null;
        }
        
        public final void maybeShowOnThisDayGameEndContent(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$RecyclerViewItemHolder;", "Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;", "pages", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "(Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;Ljava/util/List;)V", "getPages", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.games.onthisday.OnThisDayGameResultFragment.RecyclerViewItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.page.PageSummary> pages = null;
        
        public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> pages) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getPages() {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.games.onthisday.OnThisDayGameResultFragment.RecyclerViewItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameResultFragment.RecyclerViewItemHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u0013\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$RecyclerViewItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "page", "Lorg/wikipedia/dataclient/page/PageSummary;", "position", "", "bindItem", "", "onClick", "v", "Landroid/view/View;", "updateBookmark", "", "app.lib"})
    final class RecyclerViewItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final ItemOnThisDayGameTopicBinding binding = null;
        private org.wikipedia.dataclient.page.PageSummary page;
        private int position = 0;
        
        public RecyclerViewItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemOnThisDayGameTopicBinding getBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary page, int position) {
        }
        
        private final boolean updateBookmark() {
            return false;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$ShareImageLoadListener;", "Lorg/wikipedia/views/imageservice/ImageLoadListener;", "(Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;)V", "onError", "", "error", "", "onSuccess", "image", "", "width", "", "height", "app.lib"})
    final class ShareImageLoadListener implements org.wikipedia.views.imageservice.ImageLoadListener {
        
        public ShareImageLoadListener() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.Object image, int width, int height) {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$ShareRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$ShareRecyclerViewItemHolder;", "Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;", "pages", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "(Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;Ljava/util/List;)V", "getPages", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class ShareRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.games.onthisday.OnThisDayGameResultFragment.ShareRecyclerViewItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.page.PageSummary> pages = null;
        
        public ShareRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> pages) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getPages() {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.games.onthisday.OnThisDayGameResultFragment.ShareRecyclerViewItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.games.onthisday.OnThisDayGameResultFragment.ShareRecyclerViewItemHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment$ShareRecyclerViewItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/games/onthisday/OnThisDayGameResultFragment;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "page", "Lorg/wikipedia/dataclient/page/PageSummary;", "app.lib"})
    final class ShareRecyclerViewItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ItemOnThisDayGameShareTopicBinding binding = null;
        
        public ShareRecyclerViewItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemOnThisDayGameShareTopicBinding getBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary page) {
        }
    }
}