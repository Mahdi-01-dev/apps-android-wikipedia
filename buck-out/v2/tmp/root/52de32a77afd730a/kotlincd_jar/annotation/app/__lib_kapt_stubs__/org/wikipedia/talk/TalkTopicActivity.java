package org.wikipedia.talk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.ActivityTalkTopicBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.edit.EditHandler;
import org.wikipedia.edit.EditSectionActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.page.LinkHandler;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.SearchActionProvider;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 <2\u00020\u0001:\u0007<=>?@ABB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010-\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0002J(\u00101\u001a\u00020\u001e2\u0006\u0010*\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0002J\u0016\u00109\u001a\u00020\u001e2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002020;H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006C"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "headerAdapter", "Lorg/wikipedia/talk/TalkTopicActivity$HeaderItemAdapter;", "linkHandler", "Lorg/wikipedia/talk/TalkTopicActivity$TalkLinkHandler;", "linkMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "replyResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestEditSource", "requestLogin", "searchActionModeCallback", "Lorg/wikipedia/talk/TalkTopicActivity$SearchCallback;", "threadAdapter", "Lorg/wikipedia/talk/TalkTopicActivity$TalkReplyItemAdapter;", "viewModel", "Lorg/wikipedia/talk/TalkTopicViewModel;", "getViewModel", "()Lorg/wikipedia/talk/TalkTopicViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "expandOrCollapseAll", "", "expand", "", "loadTopics", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onInitialLoad", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "showFindInPage", "showUndoSnackbar", "undoRevId", "", "startReplyActivity", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "undoSubject", "", "undoBody", "updateOnError", "t", "", "updateOnSuccess", "threadItems", "", "Companion", "HeaderItemAdapter", "HeaderViewHolder", "SearchCallback", "TalkLinkHandler", "TalkReplyHolder", "TalkReplyItemAdapter", "app.lib"})
public final class TalkTopicActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityTalkTopicBinding binding;
    private org.wikipedia.talk.TalkTopicActivity.TalkLinkHandler linkHandler;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicActivity.TalkReplyItemAdapter threadAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicActivity.HeaderItemAdapter headerAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.TalkTopicActivity.SearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt linkMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEditSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> replyResult = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TOPIC_NAME = "topicName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TOPIC_ID = "topicId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REPLY_ID = "replyId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SEARCH_QUERY = "searchQuery";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.TalkTopicActivity.Companion Companion = null;
    
    public TalkTopicActivity() {
        super();
    }
    
    private final org.wikipedia.talk.TalkTopicViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void expandOrCollapseAll(boolean expand) {
    }
    
    private final void showFindInPage() {
    }
    
    private final void onInitialLoad() {
    }
    
    private final void loadTopics() {
    }
    
    private final void updateOnSuccess(java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems) {
    }
    
    private final void updateOnError(java.lang.Throwable t) {
    }
    
    private final void startReplyActivity(org.wikipedia.dataclient.discussiontools.ThreadItem item, java.lang.CharSequence undoSubject, java.lang.CharSequence undoBody) {
    }
    
    private final void showUndoSnackbar(long undoRevId) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJB\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$Companion;", "", "()V", "EXTRA_REPLY_ID", "", "EXTRA_SEARCH_QUERY", "EXTRA_TOPIC_ID", "EXTRA_TOPIC_NAME", "isHeaderTemplate", "", "item", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "isSubscribable", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "topicName", "topicId", "replyId", "searchQuery", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String topicName, @org.jetbrains.annotations.NotNull()
        java.lang.String topicId, @org.jetbrains.annotations.Nullable()
        java.lang.String replyId, @org.jetbrains.annotations.Nullable()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
        
        public final boolean isSubscribable(@org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.discussiontools.ThreadItem item) {
            return false;
        }
        
        public final boolean isHeaderTemplate(@org.jetbrains.annotations.Nullable()
        org.wikipedia.dataclient.discussiontools.ThreadItem item) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$HeaderItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/talk/TalkTopicActivity$HeaderViewHolder;", "Lorg/wikipedia/talk/TalkTopicActivity;", "(Lorg/wikipedia/talk/TalkTopicActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class HeaderItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.talk.TalkTopicActivity.HeaderViewHolder> {
        
        public HeaderItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.TalkTopicActivity.HeaderViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.TalkTopicActivity.HeaderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/wikipedia/talk/TalkThreadHeaderView$Callback;", "view", "Lorg/wikipedia/talk/TalkThreadHeaderView;", "(Lorg/wikipedia/talk/TalkTopicActivity;Lorg/wikipedia/talk/TalkThreadHeaderView;)V", "bindItem", "", "onSubscribeClick", "app.lib"})
    final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements org.wikipedia.talk.TalkThreadHeaderView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.talk.TalkThreadHeaderView view = null;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.TalkThreadHeaderView view) {
            super(null);
        }
        
        public final void bindItem() {
        }
        
        @java.lang.Override()
        public void onSubscribeClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/talk/TalkTopicActivity;)V", "searchActionProvider", "Lorg/wikipedia/views/SearchActionProvider;", "getSearchActionProvider", "()Lorg/wikipedia/views/SearchActionProvider;", "setSearchActionProvider", "(Lorg/wikipedia/views/SearchActionProvider;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J0\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$TalkLinkHandler;", "Lorg/wikipedia/page/LinkHandler;", "context", "Landroid/content/Context;", "(Lorg/wikipedia/talk/TalkTopicActivity;Landroid/content/Context;)V", "lastX", "", "lastY", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "onDiffLinkClicked", "", "title", "Lorg/wikipedia/page/PageTitle;", "revisionId", "", "onInternalLinkClicked", "onMediaLinkClicked", "onPageLinkClicked", "anchor", "", "linkText", "onUrlClick", "url", "x", "y", "app.lib"})
    public final class TalkLinkHandler extends org.wikipedia.page.LinkHandler {
        private int lastX = 0;
        private int lastY = 0;
        public org.wikipedia.dataclient.WikiSite wikiSite;
        
        public TalkLinkHandler(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        public final void onUrlClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText, int x, int y) {
        }
        
        @java.lang.Override()
        public void onMediaLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
        
        @java.lang.Override()
        public void onDiffLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long revisionId) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.dataclient.WikiSite getWikiSite() {
            return null;
        }
        
        @java.lang.Override()
        public void setWikiSite(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite p0) {
        }
        
        @java.lang.Override()
        public void onPageLinkClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String anchor, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText) {
        }
        
        @java.lang.Override()
        public void onInternalLinkClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$TalkReplyHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/wikipedia/talk/TalkThreadItemView$Callback;", "view", "Lorg/wikipedia/talk/TalkThreadItemView;", "(Lorg/wikipedia/talk/TalkTopicActivity;Lorg/wikipedia/talk/TalkThreadItemView;)V", "bindItem", "", "item", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "onExpandClick", "onReplyClick", "onShareClick", "onUserNameClick", "Landroid/view/View;", "app.lib"})
    public final class TalkReplyHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements org.wikipedia.talk.TalkThreadItemView.Callback {
        
        public TalkReplyHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.TalkThreadItemView view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item) {
        }
        
        @java.lang.Override()
        public void onExpandClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item) {
        }
        
        @java.lang.Override()
        public void onReplyClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item) {
        }
        
        @java.lang.Override()
        public void onShareClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item) {
        }
        
        @java.lang.Override()
        public void onUserNameClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.discussiontools.ThreadItem item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/talk/TalkTopicActivity$TalkReplyItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/talk/TalkTopicActivity$TalkReplyHolder;", "Lorg/wikipedia/talk/TalkTopicActivity;", "(Lorg/wikipedia/talk/TalkTopicActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    public final class TalkReplyItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.talk.TalkTopicActivity.TalkReplyHolder> {
        
        public TalkReplyItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.talk.TalkTopicActivity.TalkReplyHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.talk.TalkTopicActivity.TalkReplyHolder holder, int pos) {
        }
    }
}