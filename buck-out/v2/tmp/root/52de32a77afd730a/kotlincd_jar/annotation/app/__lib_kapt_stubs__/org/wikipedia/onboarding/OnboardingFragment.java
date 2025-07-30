package org.wikipedia.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import com.google.android.material.tabs.TabLayoutMediator;
import org.wikipedia.BackPressedHandler;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.databinding.FragmentOnboardingPagerBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002*+B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH$J\b\u0010\u001e\u001a\u00020\u0004H\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "enableSkip", "", "(Z)V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "doneButtonText", "", "getDoneButtonText", "()I", "getEnableSkip", "()Z", "forwardClickListener", "Landroid/view/View$OnClickListener;", "pageChangeCallback", "Lorg/wikipedia/onboarding/OnboardingFragment$PageChangeCallback;", "advancePage", "", "atLastPage", "callback", "Lorg/wikipedia/onboarding/OnboardingFragment$Callback;", "finish", "getAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "updateButtonState", "updatePageIndicatorContentDescription", "Callback", "PageChangeCallback", "app.lib"})
public abstract class OnboardingFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler {
    private final boolean enableSkip = false;
    @org.jetbrains.annotations.Nullable()
    private FragmentOnboardingPagerBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.onboarding.OnboardingFragment.PageChangeCallback pageChangeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener forwardClickListener = null;
    
    public OnboardingFragment(boolean enableSkip) {
        super();
    }
    
    public final boolean getEnableSkip() {
        return false;
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract androidx.viewpager2.adapter.FragmentStateAdapter getAdapter();
    
    @androidx.annotation.StringRes()
    protected abstract int getDoneButtonText();
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    public final void advancePage() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.wikipedia.onboarding.OnboardingFragment.Callback callback() {
        return null;
    }
    
    private final void finish() {
    }
    
    private final boolean atLastPage() {
        return false;
    }
    
    private final void updatePageIndicatorContentDescription() {
    }
    
    private final void updateButtonState() {
    }
    
    public OnboardingFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingFragment$Callback;", "", "onComplete", "", "onSkip", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSkip();
        
        public abstract void onComplete();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingFragment$PageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/onboarding/OnboardingFragment;)V", "onPageSelected", "", "position", "", "app.lib"})
    final class PageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        
        public PageChangeCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
}