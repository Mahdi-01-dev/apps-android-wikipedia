package org.wikipedia.suggestededits;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.FragmentSuggestedEditsCardsBinding;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.views.PositionAwareFragmentStateAdapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0005TUVWXB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0002J\u0006\u0010\'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\b\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0002J\u0012\u0010+\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0016J\"\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J$\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020$H\u0016J\u0010\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020CH\u0016J\u0006\u0010D\u001a\u00020$J\u0016\u0010E\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0002J\u001a\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010H\u001a\u00020$H\u0002J\b\u0010I\u001a\u00020$H\u0002J\b\u0010J\u001a\u00020$H\u0002J\u0010\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020\u000eH\u0002J\b\u0010M\u001a\u0004\u0018\u00010NJ\n\u0010O\u001a\u0004\u0018\u00010PH\u0002J\b\u0010Q\u001a\u00020$H\u0016J\u0010\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020/H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "app", "Lorg/wikipedia/WikipediaApp;", "binding", "getBinding", "()Lerror/NonExistentClass;", "resettingViewPager", "", "swappingLanguageSpinners", "topTitle", "Lorg/wikipedia/page/PageTitle;", "getTopTitle", "()Lorg/wikipedia/page/PageTitle;", "viewModel", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsViewModel;", "getViewModel", "()Lorg/wikipedia/suggestededits/SuggestedEditsCardsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewPagerListener", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$ViewPagerListener;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getActionBarTitle", "", "getLangCode", "getSinglePage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "initLanguageSpinners", "", "list", "", "langFromCode", "langToCode", "logSuccess", "maybeShowOnboarding", "nextPage", "sourceFragment", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "onSelectPage", "onSuccess", "onViewCreated", "view", "previousPage", "resetViewPagerItemAdapter", "setInitialUiState", "swapLanguageSpinnerSelection", "isFromLang", "topBaseChild", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "topChild", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemFragment;", "updateActionButton", "updateBackButton", "pagerPosition", "Companion", "OnFromSpinnerItemSelectedListener", "OnToSpinnerItemSelectedListener", "ViewPagerAdapter", "ViewPagerListener", "app.lib"})
public final class SuggestedEditsCardsFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider, org.wikipedia.suggestededits.SuggestedEditsItemFragment.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentSuggestedEditsCardsBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsCardsFragment.ViewPagerListener viewPagerListener = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.WikipediaApp app = null;
    private boolean swappingLanguageSpinners = false;
    private boolean resettingViewPager = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsCardsFragment.Companion Companion = null;
    
    public SuggestedEditsCardsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsCardsViewModel getViewModel() {
        return null;
    }
    
    private final org.wikipedia.page.PageTitle getTopTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.suggestededits.SuggestedEditsItemFragment topBaseChild() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String langFromCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String langToCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.descriptions.DescriptionEditActivity.Action action() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsCardsItemFragment topChild() {
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
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void onSuccess(java.util.List<java.lang.String> list) {
    }
    
    private final java.lang.String getActionBarTitle(org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
        return null;
    }
    
    private final void maybeShowOnboarding() {
    }
    
    private final void updateBackButton(int pagerPosition) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLangCode() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.dataclient.mwapi.MwQueryPage getSinglePage() {
        return null;
    }
    
    @java.lang.Override()
    public void updateActionButton() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void previousPage() {
    }
    
    @java.lang.Override()
    public void nextPage(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment sourceFragment) {
    }
    
    @java.lang.Override()
    public void logSuccess() {
    }
    
    public final void onSelectPage() {
    }
    
    private final void resetViewPagerItemAdapter() {
    }
    
    private final void setInitialUiState() {
    }
    
    private final void swapLanguageSpinnerSelection(boolean isFromLang) {
    }
    
    private final void initLanguageSpinners(java.util.List<java.lang.String> list) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsCardsFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$OnFromSpinnerItemSelectedListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;)V", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app.lib"})
    final class OnFromSpinnerItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        
        public OnFromSpinnerItemSelectedListener() {
            super();
        }
        
        @java.lang.Override()
        public void onItemSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
        android.view.View view, int position, long id) {
        }
        
        @java.lang.Override()
        public void onNothingSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$OnToSpinnerItemSelectedListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;)V", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app.lib"})
    final class OnToSpinnerItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        
        public OnToSpinnerItemSelectedListener() {
            super();
        }
        
        @java.lang.Override()
        public void onItemSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
        android.view.View view, int position, long id) {
        }
        
        @java.lang.Override()
        public void onNothingSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$ViewPagerAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app.lib"})
    final class ViewPagerAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        
        public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$ViewPagerListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;)V", "nextPageSelectedAutomatic", "", "prevPosition", "", "onPageSelected", "", "position", "setNextPageSelectedAutomatic", "app.lib"})
    final class ViewPagerListener extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private int prevPosition = 0;
        private boolean nextPageSelectedAutomatic = false;
        
        public ViewPagerListener() {
            super();
        }
        
        public final void setNextPageSelectedAutomatic() {
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
}