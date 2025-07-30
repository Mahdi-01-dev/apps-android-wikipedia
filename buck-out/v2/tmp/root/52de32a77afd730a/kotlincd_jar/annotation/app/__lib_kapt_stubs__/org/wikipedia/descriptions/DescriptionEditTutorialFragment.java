package org.wikipedia.descriptions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.MachineGeneratedArticleDescriptionsAnalyticsHelper;
import org.wikipedia.onboarding.OnboardingFragment;
import org.wikipedia.onboarding.OnboardingPageView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0003\u0013\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment;", "Lorg/wikipedia/onboarding/OnboardingFragment;", "()V", "doneButtonText", "", "getDoneButtonText", "()I", "showAIOnBoarding", "", "getShowAIOnBoarding", "()Z", "setShowAIOnBoarding", "(Z)V", "getAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "DescriptionEditTutorialPagerAdapter", "ItemFragment", "app.lib"})
public final class DescriptionEditTutorialFragment extends org.wikipedia.onboarding.OnboardingFragment {
    private final int doneButtonText = 0;
    private boolean showAIOnBoarding = false;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_POSITION = "position";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Integer[] pages = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditTutorialFragment.Companion Companion = null;
    
    public DescriptionEditTutorialFragment() {
        super(false);
    }
    
    @java.lang.Override()
    protected int getDoneButtonText() {
        return 0;
    }
    
    public final boolean getShowAIOnBoarding() {
        return false;
    }
    
    public final void setShowAIOnBoarding(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected androidx.viewpager2.adapter.FragmentStateAdapter getAdapter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment$Companion;", "", "()V", "ARG_POSITION", "", "pages", "", "", "getPages", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "newInstance", "Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment;", "showAIOnBoarding", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Integer[] getPages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.descriptions.DescriptionEditTutorialFragment newInstance(boolean showAIOnBoarding) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment$DescriptionEditTutorialPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment;Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditTutorialFragment$ItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app.lib"})
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
    }
}