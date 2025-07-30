package org.wikipedia.feed.suggestededits;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.FragmentSuggestedEditsCardItemBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.SuggestedEditsImageTagEditActivity;
import org.wikipedia.suggestededits.SuggestedEditsSnackbars;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0015J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010\'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00061"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "itemClickable", "", "requestSuggestedEditsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "viewModel", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardItemViewModel;", "getViewModel", "()Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardItemViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initRequestLauncher", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "caught", "", "onLoading", "onViewCreated", "view", "showAddDescriptionUI", "showAddImageCaptionUI", "showCardContent", "showImageTagsUI", "showItemImage", "showTranslateDescriptionUI", "showTranslateImageCaptionUI", "startDescriptionEditScreen", "startDescriptionEditScreenListener", "Landroid/view/View$OnClickListener;", "updateContents", "Companion", "app.lib"})
public final class SuggestedEditsCardItemFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsCardItemBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean itemClickable = false;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestSuggestedEditsLauncher;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AGE = "age";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ACTION_TYPE = "actionType";
    public static final long MAX_RETRY_LIMIT = 5L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.suggestededits.SuggestedEditsCardItemFragment.Companion Companion = null;
    
    public SuggestedEditsCardItemFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.feed.suggestededits.SuggestedEditsCardItemViewModel getViewModel() {
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
    
    private final void initRequestLauncher() {
    }
    
    private final void updateContents() {
    }
    
    private final android.view.View.OnClickListener startDescriptionEditScreenListener() {
        return null;
    }
    
    private final void startDescriptionEditScreen() {
    }
    
    private final void showCardContent() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void showImageTagsUI() {
    }
    
    private final void showAddDescriptionUI() {
    }
    
    private final void showTranslateDescriptionUI() {
    }
    
    private final void showAddImageCaptionUI() {
    }
    
    private final void showTranslateImageCaptionUI() {
    }
    
    private final void showItemImage() {
    }
    
    public final void onLoading() {
    }
    
    public final void onError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardItemFragment$Companion;", "", "()V", "EXTRA_ACTION_TYPE", "", "EXTRA_AGE", "MAX_RETRY_LIMIT", "", "newInstance", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardItemFragment;", "age", "", "cardActionType", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.suggestededits.SuggestedEditsCardItemFragment newInstance(int age, @org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action cardActionType) {
            return null;
        }
    }
}