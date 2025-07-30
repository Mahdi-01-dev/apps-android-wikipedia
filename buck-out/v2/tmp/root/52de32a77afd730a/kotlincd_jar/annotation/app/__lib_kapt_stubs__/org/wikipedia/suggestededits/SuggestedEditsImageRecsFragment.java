package org.wikipedia.suggestededits;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuProvider;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.palette.graphics.Palette;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.EditAttemptStepEvent;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.FragmentSuggestedEditsImageRecsItemBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.edit.EditHandler;
import org.wikipedia.edit.EditSectionActivity;
import org.wikipedia.edit.insertmedia.InsertMediaActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ImageZoomHelper;
import org.wikipedia.views.imageservice.ImageLoadListener;
import org.wikipedia.views.imageservice.ImageService;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001SB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002J;\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010)\u001a\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020#J\b\u0010,\u001a\u00020\u000fH\u0016J\u0018\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J$\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020#H\u0002J\b\u0010;\u001a\u00020#H\u0016J\u001e\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0@H\u0016J\u0010\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020CH\u0002J\u0006\u0010D\u001a\u00020#J\b\u0010E\u001a\u00020#H\u0002J\b\u0010F\u001a\u00020#H\u0002J\u0010\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0016J\b\u0010K\u001a\u00020#H\u0016J\b\u0010L\u001a\u00020#H\u0016J\u001a\u0010M\u001a\u00020#2\u0006\u0010N\u001a\u0002032\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010O\u001a\u00020#H\u0016J\b\u0010P\u001a\u00020\u000fH\u0016J\b\u0010Q\u001a\u00020\u000fH\u0016J\b\u0010R\u001a\u00020#H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006T"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsFragment;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "Landroidx/core/view/MenuProvider;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "infoClicked", "", "isImpressionLogged", "isLoaded", "isVisibleToUser", "requestEdit", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "resumedMillis", "", "scrolled", "viewModel", "Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsFragmentViewModel;", "getViewModel", "()Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "doPublish", "", "getActionStringForAnalytics", "", "acceptanceState", "rejectionReasons", "revisionId", "addTimeSpent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)Ljava/lang/String;", "logImpression", "onBackPressed", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDepletedState", "onDestroyView", "onDialogSubmit", "response", "", "selectedItems", "", "onError", "throwable", "", "onInfoClicked", "onLoadSuccess", "onLoading", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "onPrepareMenu", "onResume", "onStart", "onViewCreated", "view", "publish", "publishEnabled", "publishOutlined", "showTooltipSequence", "Companion", "app.lib"})
public final class SuggestedEditsImageRecsFragment extends org.wikipedia.suggestededits.SuggestedEditsItemFragment implements androidx.core.view.MenuProvider, org.wikipedia.suggestededits.SuggestedEditsImageRecsDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsImageRecsItemBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean infoClicked = false;
    private boolean scrolled = false;
    private long resumedMillis = 0L;
    private boolean isVisibleToUser = false;
    private boolean isImpressionLogged = false;
    private boolean isLoaded = false;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<androidx.coordinatorlayout.widget.CoordinatorLayout> bottomSheetBehavior;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEdit = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_LANG = "lang";
    public static final int MIN_TIME_WARNING_MILLIS = 5000;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageRecsFragment.Companion Companion = null;
    
    public SuggestedEditsImageRecsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsImageRecsFragmentViewModel getViewModel() {
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
    
    public final void logImpression() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void onLoading() {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    private final void onLoadSuccess() {
    }
    
    private final void onDepletedState() {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public void onPrepareMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void showTooltipSequence() {
    }
    
    @java.lang.Override()
    public void publish() {
    }
    
    private final void doPublish() {
    }
    
    @java.lang.Override()
    public boolean publishEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean publishOutlined() {
        return false;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsItemFragment.Callback callback() {
        return null;
    }
    
    public final void onInfoClicked() {
    }
    
    @java.lang.Override()
    public void onDialogSubmit(int response, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> selectedItems) {
    }
    
    private final java.lang.String getActionStringForAnalytics(java.lang.String acceptanceState, java.lang.String rejectionReasons, java.lang.Long revisionId, boolean addTimeSpent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageRecsFragment$Companion;", "", "()V", "ARG_LANG", "", "MIN_TIME_WARNING_MILLIS", "", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsItemFragment newInstance() {
            return null;
        }
    }
}