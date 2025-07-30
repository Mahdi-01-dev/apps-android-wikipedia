package org.wikipedia.talk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.MenuItemCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.ActivityTalkTopicsBinding;
import org.wikipedia.databinding.ItemTalkTopicBinding;
import org.wikipedia.databinding.ViewTalkTopicsHeaderBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import org.wikipedia.edit.EditHandler;
import org.wikipedia.edit.EditSectionActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.notifications.NotificationActivity;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.page.edithistory.EditHistoryListActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.settings.languages.WikipediaLanguagesFragment;
import org.wikipedia.staticdata.TalkAliasData;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.DrawableItemDecoration;
import org.wikipedia.views.NotificationButtonView;
import org.wikipedia.views.SearchActionProvider;
import org.wikipedia.views.SwipeableItemTouchHelperCallback;
import org.wikipedia.views.TalkTopicsSortOverflowView;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.watchlist.WatchlistExpiry;
import org.wikipedia.watchlist.WatchlistExpiryDialog;
import org.wikipedia.watchlist.WatchlistViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0005JKLMNB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010)\u001a\u00020*H\u0016J\b\u00102\u001a\u00020$H\u0016J\b\u00103\u001a\u00020$H\u0016J\b\u00104\u001a\u00020$H\u0002J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020$H\u0002J\u0010\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020$H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>H\u0002J\u001e\u0010?\u001a\u00020$2\u0006\u00106\u001a\u0002072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\u0018\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0002J\u0010\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020IH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006O"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "concatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "goToTopic", "", "headerAdapter", "Lorg/wikipedia/talk/TalkTopicsActivity$HeaderItemAdapter;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "notificationButtonView", "Lorg/wikipedia/views/NotificationButtonView;", "requestEditSource", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestGoToTopic", "requestLanguageChange", "requestNewTopic", "searchActionModeCallback", "Lorg/wikipedia/talk/TalkTopicsActivity$SearchCallback;", "talkTopicItemAdapter", "Lorg/wikipedia/talk/TalkTopicsActivity$TalkTopicItemAdapter;", "viewModel", "Lorg/wikipedia/talk/TalkTopicsViewModel;", "getViewModel", "()Lorg/wikipedia/talk/TalkTopicsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "goToPage", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onExpiryChanged", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onResume", "onUnreadNotification", "resetViews", "setToolbarTitle", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "updateConcatAdapter", "updateNotificationDot", "animate", "updateOnEmpty", "updateOnError", "t", "", "updateOnSuccess", "threadItems", "", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "updateOnUndoSave", "undoneSubject", "", "undoneBody", "updateOnWatch", "message", "", "Companion", "HeaderItemAdapter", "HeaderViewHolder", "SearchCallback", "TalkTopicItemAdapter", "app.lib"})
public final class TalkTopicsActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.watchlist.WatchlistExpiryDialog.Callback {
    private ActivityTalkTopicsBinding binding;
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private org.wikipedia.views.NotificationButtonView notificationButtonView;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ConcatAdapter concatAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicsActivity.HeaderItemAdapter headerAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicsActivity.TalkTopicItemAdapter talkTopicItemAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicsActivity.SearchCallback searchActionModeCallback = null;
    private boolean goToTopic = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLanguageChange = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestNewTopic = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEditSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestGoToTopic = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_GO_TO_TOPIC = "goToTopic";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.TalkTopicsActivity.Companion Companion = null;
    
    public TalkTopicsActivity() {
        super();
    }
    
    private final org.wikipedia.talk.TalkTopicsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    @java.lang.Override()
    public void onExpiryChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    private final void resetViews() {
    }
    
    private final void updateOnSuccess(org.wikipedia.page.PageTitle pageTitle, java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems) {
    }
    
    private final void updateOnError(java.lang.Throwable t) {
    }
    
    private final void updateOnEmpty() {
    }
    
    private final void updateOnUndoSave(java.lang.CharSequence undoneSubject, java.lang.CharSequence undoneBody) {
    }
    
    private final void updateOnWatch(java.lang.String message) {
    }
    
    private final void setToolbarTitle(org.wikipedia.page.PageTitle pageTitle) {
    }
    
    private final void updateNotificationDot(boolean animate) {
    }
    
    private final void goToPage() {
    }
    
    private final void updateConcatAdapter() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsActivity$Companion;", "", "()V", "EXTRA_GO_TO_TOPIC", "", "getNonTalkPageTitle", "Lorg/wikipedia/page/PageTitle;", "title", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle getNonTalkPageTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsActivity$HeaderItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/talk/TalkTopicsActivity$HeaderViewHolder;", "Lorg/wikipedia/talk/TalkTopicsActivity;", "(Lorg/wikipedia/talk/TalkTopicsActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class HeaderItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.talk.TalkTopicsActivity.HeaderViewHolder> {
        
        public HeaderItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.TalkTopicsActivity.HeaderViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.TalkTopicsActivity.HeaderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsActivity$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/talk/TalkTopicsActivity;Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "bindItem", "", "app.lib"})
    final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ViewTalkTopicsHeaderBinding binding = null;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        public final void bindItem() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsActivity$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/talk/TalkTopicsActivity;)V", "searchActionProvider", "Lorg/wikipedia/views/SearchActionProvider;", "getSearchActionProvider", "()Lorg/wikipedia/views/SearchActionProvider;", "setSearchActionProvider", "(Lorg/wikipedia/views/SearchActionProvider;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
    final class SearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.views.SearchActionProvider searchActionProvider;
        
        public SearchCallback() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.views.SearchActionProvider getSearchActionProvider() {
            return null;
        }
        
        public final void setSearchActionProvider(@org.jetbrains.annotations.Nullable()
        org.wikipedia.views.SearchActionProvider p0) {
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        protected void onQueryChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected java.lang.String getSearchHintString() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected android.content.Context getParentContext() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/talk/TalkTopicsActivity$TalkTopicItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/talk/TalkTopicsActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    public final class TalkTopicItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public TalkTopicItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int pos) {
        }
    }
}