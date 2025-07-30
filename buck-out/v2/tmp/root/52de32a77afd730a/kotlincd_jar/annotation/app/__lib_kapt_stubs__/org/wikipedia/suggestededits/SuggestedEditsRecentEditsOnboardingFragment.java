package org.wikipedia.suggestededits;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.onboarding.OnboardingFragment;
import org.wikipedia.onboarding.OnboardingPageView;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsOnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "()V", "doneButtonText", "", "getDoneButtonText", "()I", "getAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "onLinkClick", "", "view", "Lorg/wikipedia/onboarding/OnboardingPageView;", "url", "", "onListActionButtonClicked", "Companion", "DescriptionEditTutorialPagerAdapter", "ItemFragment", "app.lib"})
public final class SuggestedEditsRecentEditsOnboardingFragment extends org.wikipedia.onboarding.OnboardingFragment implements org.wikipedia.onboarding.OnboardingPageView.Callback {
    private final int doneButtonText = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_POSITION = "position";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Integer[] pages = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsRecentEditsOnboardingFragment.Companion Companion = null;
    
    public SuggestedEditsRecentEditsOnboardingFragment() {
        super(false);
    }
    
    @java.lang.Override()
    protected int getDoneButtonText() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected androidx.viewpager2.adapter.FragmentStateAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onLinkClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.onboarding.OnboardingPageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onListActionButtonClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.onboarding.OnboardingPageView view) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsOnboardingFragment$Companion;", "", "()V", "ARG_POSITION", "", "pages", "", "", "getPages", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsOnboardingFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Integer[] getPages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsRecentEditsOnboardingFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsOnboardingFragment$DescriptionEditTutorialPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsOnboardingFragment;Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app.lib"})
    public final class DescriptionEditTutorialPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public DescriptionEditTutorialPagerAdapter(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsOnboardingFragment$ItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callback", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "getCallback", "()Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app.lib"})
    public static final class ItemFragment extends androidx.fragment.app.Fragment {
        
        public ItemFragment() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
        android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        private final org.wikipedia.onboarding.OnboardingPageView.Callback getCallback() {
            return null;
        }
    }
}