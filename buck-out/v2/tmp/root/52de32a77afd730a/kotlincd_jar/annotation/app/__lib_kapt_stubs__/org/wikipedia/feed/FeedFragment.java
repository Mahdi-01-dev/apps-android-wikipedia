package org.wikipedia.feed;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.BackPressedHandler;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.FragmentFeedBinding;
import org.wikipedia.feed.FeedCoordinatorBase.FeedUpdateListener;
import org.wikipedia.feed.configure.ConfigureActivity;
import org.wikipedia.feed.configure.ConfigureItemLanguageDialogView;
import org.wikipedia.feed.configure.LanguageItemAdapter;
import org.wikipedia.feed.image.FeaturedImage;
import org.wikipedia.feed.image.FeaturedImageCard;
import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.model.WikiSiteCard;
import org.wikipedia.feed.news.NewsCard;
import org.wikipedia.feed.news.NewsItemView;
import org.wikipedia.feed.random.RandomCardView;
import org.wikipedia.feed.topread.TopReadArticlesActivity;
import org.wikipedia.feed.topread.TopReadListCard;
import org.wikipedia.feed.view.FeedAdapter;
import org.wikipedia.feed.view.RegionalLanguageVariantSelectionDialog;
import org.wikipedia.games.onthisday.OnThisDayGameMainMenuFragment;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.language.AppLanguageLookUpTable;
import org.wikipedia.random.RandomActivity;
import org.wikipedia.readinglist.sync.ReadingListSyncAdapter;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.SettingsActivity;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004?@ABB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001fH\u0016J\u0012\u0010\'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J$\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010/\u001a\u00020%H\u0016J\b\u00100\u001a\u00020%H\u0016J\u0006\u00101\u001a\u00020%J\u0006\u00102\u001a\u00020%J\b\u00103\u001a\u00020%H\u0016J\u0006\u00104\u001a\u00020%J\u0006\u00105\u001a\u00020%J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u00106\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\u00020%2\u0006\u0010\"\u001a\u00020#2\u0006\u0010;\u001a\u000209H\u0002J\u0010\u0010<\u001a\u00020%2\u0006\u00108\u001a\u00020=H\u0002J\u0006\u0010>\u001a\u00020%R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lorg/wikipedia/feed/FeedFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "app", "Lorg/wikipedia/WikipediaApp;", "binding", "getBinding", "()Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/feed/FeedFragment$Callback;", "getCallback", "()Lorg/wikipedia/feed/FeedFragment$Callback;", "coordinator", "Lorg/wikipedia/feed/FeedCoordinator;", "feedAdapter", "Lorg/wikipedia/feed/view/FeedAdapter;", "Landroid/view/View;", "feedCallback", "Lorg/wikipedia/feed/FeedFragment$FeedCallback;", "feedScrollListener", "Lorg/wikipedia/feed/FeedFragment$FeedScrollListener;", "requestFeedConfigurationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestLanguageChangeLauncher", "shouldElevateToolbar", "", "getCardLanguageCode", "", "card", "Lorg/wikipedia/feed/model/Card;", "maybeShowRegionalLanguageVariantDialog", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onGoOffline", "onGoOnline", "onResume", "refresh", "scrollToTop", "showCardLangSelectDialog", "showConfigureActivity", "invokeSource", "", "showDismissCardUndoSnackbar", "position", "showLanguagesActivity", "Lorg/wikipedia/Constants$InvokeSource;", "updateHiddenCards", "Callback", "Companion", "FeedCallback", "FeedScrollListener", "app.lib"})
public final class FeedFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler {
    @org.jetbrains.annotations.Nullable()
    private FragmentFeedBinding _binding;
    private org.wikipedia.feed.view.FeedAdapter<android.view.View> feedAdapter;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.FeedFragment.FeedCallback feedCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.FeedFragment.FeedScrollListener feedScrollListener = null;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.WikipediaApp app;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.feed.FeedCoordinator coordinator;
    private boolean shouldElevateToolbar = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestFeedConfigurationLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLanguageChangeLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.FeedFragment.Companion Companion = null;
    
    public FeedFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.feed.FeedFragment.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    public final boolean shouldElevateToolbar() {
        return false;
    }
    
    public final void scrollToTop() {
    }
    
    public final void onGoOffline() {
    }
    
    public final void onGoOnline() {
    }
    
    public final void refresh() {
    }
    
    public final void updateHiddenCards() {
    }
    
    private final void showDismissCardUndoSnackbar(org.wikipedia.feed.model.Card card, int position) {
    }
    
    private final void showCardLangSelectDialog(org.wikipedia.feed.model.Card card) {
    }
    
    private final void maybeShowRegionalLanguageVariantDialog() {
    }
    
    private final void showConfigureActivity(int invokeSource) {
    }
    
    private final void showLanguagesActivity(org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    private final java.lang.String getCardLanguageCode(org.wikipedia.feed.model.Card card) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0017H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\nH&J/\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH&\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\nH&\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/feed/FeedFragment$Callback;", "", "onFeaturedImageSelected", "", "card", "Lorg/wikipedia/feed/image/FeaturedImageCard;", "onFeedAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onFeedDownloadImage", "image", "Lorg/wikipedia/feed/image/FeaturedImage;", "onFeedMovePageToList", "sourceReadingListId", "", "onFeedNewsItemSelected", "Lorg/wikipedia/feed/news/NewsCard;", "view", "Lorg/wikipedia/feed/news/NewsItemView;", "onFeedSeCardFooterClicked", "onFeedSearchRequested", "Landroid/view/View;", "onFeedSelectPage", "openInNewBackgroundTab", "onFeedSelectPageWithAnimation", "sharedElements", "", "Landroid/util/Pair;", "", "(Lorg/wikipedia/history/HistoryEntry;[Landroid/util/Pair;)V", "onFeedShareImage", "onFeedVoiceSearchRequested", "onLoginRequested", "updateToolbarElevation", "elevate", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onFeedSearchRequested(@org.jetbrains.annotations.NotNull()
        android.view.View view);
        
        public abstract void onFeedVoiceSearchRequested();
        
        public abstract void onFeedSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean openInNewBackgroundTab);
        
        public abstract void onFeedSelectPageWithAnimation(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        android.util.Pair<android.view.View, java.lang.String>[] sharedElements);
        
        public abstract void onFeedAddPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault);
        
        public abstract void onFeedMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onFeedNewsItemSelected(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCard card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItemView view);
        
        public abstract void onFeedSeCardFooterClicked();
        
        public abstract void onFeedShareImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImageCard card);
        
        public abstract void onFeedDownloadImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImage image);
        
        public abstract void onFeaturedImageSelected(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImageCard card);
        
        public abstract void onLoginRequested();
        
        public abstract void updateToolbarElevation(boolean elevate);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/FeedFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/feed/FeedFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.FeedFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010\'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020(H\u0016J7\u0010)\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020-0,0+H\u0016\u00a2\u0006\u0002\u0010.J \u0010)\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0016H\u0016J\b\u00101\u001a\u00020\u0004H\u0016\u00a8\u00062"}, d2 = {"Lorg/wikipedia/feed/FeedFragment$FeedCallback;", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "(Lorg/wikipedia/feed/FeedFragment;)V", "onAddPageToList", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onAnnouncementNegativeAction", "card", "Lorg/wikipedia/feed/model/Card;", "onAnnouncementPositiveAction", "uri", "Landroid/net/Uri;", "onDownloadImage", "image", "Lorg/wikipedia/feed/image/FeaturedImage;", "onError", "t", "", "onFeaturedImageSelected", "Lorg/wikipedia/feed/image/FeaturedImageCard;", "onFooterClick", "onMovePageToList", "sourceReadingListId", "", "onNewsItemSelected", "Lorg/wikipedia/feed/news/NewsCard;", "view", "Lorg/wikipedia/feed/news/NewsItemView;", "onRandomClick", "Lorg/wikipedia/feed/random/RandomCardView;", "onRequestCustomize", "onRequestDismissCard", "onRequestEditCardLanguages", "onRequestMore", "onRetryFromOffline", "onSeCardFooterClicked", "onSearchRequested", "Landroid/view/View;", "onSelectPage", "sharedElements", "", "Landroid/util/Pair;", "", "(Lorg/wikipedia/feed/model/Card;Lorg/wikipedia/history/HistoryEntry;[Landroid/util/Pair;)V", "openInNewBackgroundTab", "onShareImage", "onVoiceSearchRequested", "app.lib"})
    final class FeedCallback implements org.wikipedia.feed.view.FeedAdapter.Callback {
        
        public FeedCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onRequestMore() {
        }
        
        @java.lang.Override()
        public void onRetryFromOffline() {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable t) {
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
        
        @java.lang.Override()
        public void onSearchRequested(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onVoiceSearchRequested() {
        }
        
        @java.lang.Override()
        public boolean onRequestDismissCard(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card) {
            return false;
        }
        
        @java.lang.Override()
        public void onRequestEditCardLanguages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card) {
        }
        
        @java.lang.Override()
        public void onRequestCustomize(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card) {
        }
        
        @java.lang.Override()
        public void onNewsItemSelected(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsCard card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.news.NewsItemView view) {
        }
        
        @java.lang.Override()
        public void onShareImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImageCard card) {
        }
        
        @java.lang.Override()
        public void onDownloadImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImage image) {
        }
        
        @java.lang.Override()
        public void onFeaturedImageSelected(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImageCard card) {
        }
        
        @java.lang.Override()
        public void onAnnouncementPositiveAction(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
        }
        
        @java.lang.Override()
        public void onAnnouncementNegativeAction(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card) {
        }
        
        @java.lang.Override()
        public void onRandomClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.random.RandomCardView view) {
        }
        
        @java.lang.Override()
        public void onFooterClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card) {
        }
        
        @java.lang.Override()
        public void onSeCardFooterClicked() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedFragment$FeedScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "(Lorg/wikipedia/feed/FeedFragment;)V", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app.lib"})
    final class FeedScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
        
        public FeedScrollListener() {
            super();
        }
        
        @java.lang.Override()
        public void onScrolled(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
        }
    }
}