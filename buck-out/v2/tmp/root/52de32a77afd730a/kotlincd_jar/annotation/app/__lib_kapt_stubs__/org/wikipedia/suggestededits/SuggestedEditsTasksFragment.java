package org.wikipedia.suggestededits;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.databinding.FragmentSuggestedEditsTasksBinding;
import org.wikipedia.descriptions.DescriptionEditUtil;
import org.wikipedia.events.LoggedOutEvent;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.main.MainActivity;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.usercontrib.UserContribListActivity;
import org.wikipedia.usercontrib.UserContribStats;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ReleaseUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.DefaultRecyclerAdapter;
import org.wikipedia.views.DefaultViewHolder;
import java.time.LocalDateTime;
import java.time.ZoneId;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0003>?@B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\"H\u0016J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0016J\u001a\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0006\u00104\u001a\u00020\"J\b\u00105\u001a\u00020\"H\u0002J\b\u00106\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020\"H\u0002J\b\u00108\u001a\u00020\"H\u0002J\b\u00109\u001a\u00020\"H\u0002J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006A"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "addDescriptionsTask", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "addImageCaptionsTask", "addImageTagsTask", "binding", "getBinding", "()Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$TaskViewCallback;", "displayedTasks", "Ljava/util/ArrayList;", "imageRecommendationsTask", "requestAddImageTags", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestAddLanguage", "requestLogin", "sequentialTooltipRunnable", "Ljava/lang/Runnable;", "vandalismPatrolTask", "viewModel", "Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragmentViewModel;", "getViewModel", "()Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "clearContents", "", "shouldScrollToTop", "", "maybeSetPausedOrDisabled", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLoading", "onRequireLogin", "onResume", "onViewCreated", "view", "refreshContents", "setFinalUIState", "setIPBlockedStatus", "setUpTasks", "setUserStatsViewsAndTooltips", "setupTestingButtons", "showError", "t", "", "showOneTimeSequentialUserStatsTooltips", "Companion", "RecyclerAdapter", "TaskViewCallback", "app.lib"})
public final class SuggestedEditsTasksFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsTasksBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private org.wikipedia.suggestededits.SuggestedEditsTask addDescriptionsTask;
    private org.wikipedia.suggestededits.SuggestedEditsTask addImageCaptionsTask;
    private org.wikipedia.suggestededits.SuggestedEditsTask addImageTagsTask;
    private org.wikipedia.suggestededits.SuggestedEditsTask imageRecommendationsTask;
    private org.wikipedia.suggestededits.SuggestedEditsTask vandalismPatrolTask;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<org.wikipedia.suggestededits.SuggestedEditsTask> displayedTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsTasksFragment.TaskViewCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable sequentialTooltipRunnable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestAddLanguage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestAddImageTags = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLogin = null;
    private static final int MIN_CONTRIBUTIONS_FOR_SUGGESTED_EDITS = 3;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MIN_CONTRIBUTIONS_GATE_URL = "https://en.wikipedia.org/wiki/Help:Introduction_to_editing_with_Wiki_Markup/1";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsTasksFragment.Companion Companion = null;
    
    public SuggestedEditsTasksFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsTasksFragmentViewModel getViewModel() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void refreshContents() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onLoading() {
    }
    
    private final void onRequireLogin() {
    }
    
    private final void clearContents(boolean shouldScrollToTop) {
    }
    
    private final void showError(java.lang.Throwable t) {
    }
    
    private final void setFinalUIState() {
    }
    
    private final void setUserStatsViewsAndTooltips() {
    }
    
    private final void showOneTimeSequentialUserStatsTooltips() {
    }
    
    private final void setIPBlockedStatus() {
    }
    
    private final boolean maybeSetPausedOrDisabled() {
        return false;
    }
    
    private final void setupTestingButtons() {
    }
    
    private final void setUpTasks() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$Companion;", "", "()V", "MIN_CONTRIBUTIONS_FOR_SUGGESTED_EDITS", "", "MIN_CONTRIBUTIONS_GATE_URL", "", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsTasksFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$RecyclerAdapter;", "Lorg/wikipedia/views/DefaultRecyclerAdapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "Lorg/wikipedia/suggestededits/SuggestedEditsTaskView;", "tasks", "", "(Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;Ljava/util/List;)V", "onBindViewHolder", "", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "i", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    public final class RecyclerAdapter extends org.wikipedia.views.DefaultRecyclerAdapter<org.wikipedia.suggestededits.SuggestedEditsTask, org.wikipedia.suggestededits.SuggestedEditsTaskView> {
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.suggestededits.SuggestedEditsTask> tasks) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.views.DefaultViewHolder<org.wikipedia.suggestededits.SuggestedEditsTaskView> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<org.wikipedia.suggestededits.SuggestedEditsTaskView> holder, int i) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$TaskViewCallback;", "Lorg/wikipedia/suggestededits/SuggestedEditsTaskView$Callback;", "(Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;)V", "onViewClick", "", "task", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "secondary", "", "app.lib"})
    final class TaskViewCallback implements org.wikipedia.suggestededits.SuggestedEditsTaskView.Callback {
        
        public TaskViewCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onViewClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsTask task, boolean secondary) {
        }
    }
}