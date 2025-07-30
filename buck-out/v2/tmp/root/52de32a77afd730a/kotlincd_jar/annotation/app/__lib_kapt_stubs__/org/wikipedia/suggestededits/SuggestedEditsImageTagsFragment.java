package org.wikipedia.suggestededits;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.core.text.method.LinkMovementMethodCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.chip.Chip;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.EditAttemptStepEvent;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.FragmentSuggestedEditsImageTagsItemBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.gallery.ImageInfo;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ImageZoomHelper;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010#2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001bH\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u001bH\u0016J\u001a\u00106\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020\u001bH\u0016J\u0012\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J$\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u000204H\u0016J\u0010\u0010E\u001a\u0002042\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u000204H\u0002J\u0010\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020\u0013H\u0016J\u0010\u0010K\u001a\u0002042\u0006\u0010L\u001a\u00020#H\u0016J\b\u0010M\u001a\u000204H\u0016J\b\u0010N\u001a\u000204H\u0002J\u001a\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020<2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010Q\u001a\u000204H\u0002J\b\u0010R\u001a\u000204H\u0016J\b\u0010S\u001a\u00020\u001bH\u0016J\b\u0010T\u001a\u00020\u001bH\u0016J\u0010\u0010U\u001a\u0002042\u0006\u0010V\u001a\u00020GH\u0002J\u001c\u0010W\u001a\u0002042\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010[\u001a\u000204H\u0002J\b\u0010\\\u001a\u000204H\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'R\u000e\u0010*\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsFragment;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/view/View$OnClickListener;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "setInvokeSource", "(Lorg/wikipedia/Constants$InvokeSource;)V", "lastSearchTerm", "", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "publishSuccess", "", "publishing", "getPublishing", "()Z", "setPublishing", "(Z)V", "tagList", "", "Lorg/wikipedia/suggestededits/ImageTag;", "viewModel", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsViewModel;", "getViewModel", "()Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wasCaptionLongClicked", "addChip", "Lcom/google/android/material/chip/Chip;", "label", "typeface", "Landroid/graphics/Typeface;", "atLeastOneTagChecked", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "getNextItem", "", "onBackPressed", "onCheckedChanged", "button", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "caught", "", "onLoading", "onSearchDismiss", "searchTerm", "onSearchSelect", "item", "onStart", "onSuccess", "onViewCreated", "view", "playSuccessVibration", "publish", "publishEnabled", "publishOutlined", "setErrorState", "t", "updateContents", "imageInfo", "Lorg/wikipedia/gallery/ImageInfo;", "caption", "updateLicenseTextShown", "updateTagChips", "Companion", "app.lib"})
public final class SuggestedEditsImageTagsFragment extends org.wikipedia.suggestededits.SuggestedEditsItemFragment implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener, org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsImageTagsItemBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean publishing = false;
    private boolean publishSuccess = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage page;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.suggestededits.ImageTag> tagList = null;
    private boolean wasCaptionLongClicked = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastSearchTerm = "";
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.Constants.InvokeSource invokeSource = org.wikipedia.Constants.InvokeSource.SUGGESTED_EDITS;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageTagsFragment.Companion Companion = null;
    
    public SuggestedEditsImageTagsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsImageTagsViewModel getViewModel() {
        return null;
    }
    
    public final boolean getPublishing() {
        return false;
    }
    
    public final void setPublishing(boolean p0) {
    }
    
    private final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    public final void setInvokeSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource p0) {
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void getNextItem() {
    }
    
    private final void onLoading() {
    }
    
    private final void setErrorState(java.lang.Throwable t) {
    }
    
    private final void updateContents(org.wikipedia.gallery.ImageInfo imageInfo, java.lang.String caption) {
    }
    
    private final void updateTagChips() {
    }
    
    private final com.google.android.material.chip.Chip addChip(org.wikipedia.suggestededits.ImageTag label, android.graphics.Typeface typeface) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton button, boolean isChecked) {
    }
    
    @java.lang.Override()
    public void onSearchSelect(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.ImageTag item) {
    }
    
    @java.lang.Override()
    public void onSearchDismiss(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
    }
    
    @java.lang.Override()
    public void publish() {
    }
    
    private final void onSuccess() {
    }
    
    private final void onError(java.lang.Throwable caught) {
    }
    
    private final void playSuccessVibration() {
    }
    
    private final void updateLicenseTextShown() {
    }
    
    private final boolean atLeastOneTagChecked() {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "app.lib"})
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