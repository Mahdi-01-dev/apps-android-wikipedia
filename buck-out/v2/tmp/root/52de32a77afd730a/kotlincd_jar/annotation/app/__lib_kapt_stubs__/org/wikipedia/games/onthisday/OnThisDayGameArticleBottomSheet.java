package org.wikipedia.games.onthisday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.DialogOnThisDayGameArticleBinding;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.AllowSnackbarOverBottomSheet;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameArticleBottomSheet;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "Lorg/wikipedia/views/AllowSnackbarOverBottomSheet;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "pageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "viewModel", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "getViewModel", "()Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callback", "Lorg/wikipedia/games/onthisday/OnThisDayGameArticleBottomSheet$Callback;", "onBookmarkIconClick", "", "view", "Landroid/widget/ImageView;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onStart", "Callback", "Companion", "app.lib"})
public final class OnThisDayGameArticleBottomSheet extends org.wikipedia.page.ExtendedBottomSheetDialogFragment implements org.wikipedia.views.AllowSnackbarOverBottomSheet {
    @org.jetbrains.annotations.Nullable()
    private DialogOnThisDayGameArticleBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private org.wikipedia.dataclient.page.PageSummary pageSummary;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.games.onthisday.OnThisDayGameArticleBottomSheet.Companion Companion = null;
    
    public OnThisDayGameArticleBottomSheet() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.games.onthisday.OnThisDayGameViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void onBookmarkIconClick(android.widget.ImageView view, org.wikipedia.dataclient.page.PageSummary pageSummary) {
    }
    
    private final org.wikipedia.games.onthisday.OnThisDayGameArticleBottomSheet.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameArticleBottomSheet$Callback;", "", "onPageBookmarkChanged", "", "page", "Lorg/wikipedia/dataclient/page/PageSummary;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onPageBookmarkChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary page);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameArticleBottomSheet$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/games/onthisday/OnThisDayGameArticleBottomSheet;", "page", "Lorg/wikipedia/dataclient/page/PageSummary;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.games.onthisday.OnThisDayGameArticleBottomSheet newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary page) {
            return null;
        }
    }
}