package org.wikipedia.suggestededits;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import org.wikipedia.R;
import org.wikipedia.databinding.FragmentSuggestedEditsCardsItemBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ImageZoomHelper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0002J\u001a\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020(2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u00100\u001a\u00020(H\u0002J \u00101\u001a\u00020(2\u0016\u00102\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001103H\u0002J\b\u00104\u001a\u00020(H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00066"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemFragment;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "<set-?>", "", "addedContribution", "getAddedContribution", "()Ljava/lang/String;", "setAddedContribution$app_lib", "(Ljava/lang/String;)V", "binding", "getBinding", "()Lerror/NonExistentClass;", "sourceSummaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "getSourceSummaryForEdit", "()Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "setSourceSummaryForEdit", "(Lorg/wikipedia/suggestededits/PageSummaryForEdit;)V", "targetSummaryForEdit", "getTargetSummaryForEdit", "setTargetSummaryForEdit", "viewModel", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemViewModel;", "getViewModel", "()Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onLoading", "onViewCreated", "view", "setErrorState", "t", "", "showAddedContributionView", "updateCaptionContents", "updateContents", "pair", "Lkotlin/Pair;", "updateDescriptionContents", "Companion", "app.lib"})
public final class SuggestedEditsCardsItemFragment extends org.wikipedia.suggestededits.SuggestedEditsItemFragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsCardsItemBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.PageSummaryForEdit sourceSummaryForEdit;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.suggestededits.PageSummaryForEdit targetSummaryForEdit;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addedContribution = "";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsCardsItemFragment.Companion Companion = null;
    
    public SuggestedEditsCardsItemFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsCardsItemViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getSourceSummaryForEdit() {
        return null;
    }
    
    public final void setSourceSummaryForEdit(@org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.PageSummaryForEdit getTargetSummaryForEdit() {
        return null;
    }
    
    public final void setTargetSummaryForEdit(@org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddedContribution() {
        return null;
    }
    
    public final void setAddedContribution$app_lib(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void showAddedContributionView(@org.jetbrains.annotations.Nullable()
    java.lang.String addedContribution) {
    }
    
    private final void onLoading() {
    }
    
    private final void setErrorState(java.lang.Throwable t) {
    }
    
    private final void updateContents(kotlin.Pair<org.wikipedia.suggestededits.PageSummaryForEdit, org.wikipedia.suggestededits.PageSummaryForEdit> pair) {
    }
    
    private final void updateDescriptionContents() {
    }
    
    private final void updateCaptionContents() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "app.lib"})
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