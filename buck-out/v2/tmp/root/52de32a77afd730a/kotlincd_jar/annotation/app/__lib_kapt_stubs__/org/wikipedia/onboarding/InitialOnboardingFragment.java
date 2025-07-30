package org.wikipedia.onboarding;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.model.EnumCode;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0004\u001e\u001f !B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "()V", "doneButtonText", "", "getDoneButtonText", "()I", "languageChanged", "", "getLanguageChanged", "()Z", "setLanguageChanged", "(Z)V", "languageChooserLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loginLauncher", "onboardingPageView", "Lorg/wikipedia/onboarding/OnboardingPageView;", "getAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "onLinkClick", "", "view", "url", "", "onListActionButtonClicked", "onResume", "Companion", "ItemFragment", "OnboardingPage", "OnboardingPagerAdapter", "app.lib"})
public final class InitialOnboardingFragment extends org.wikipedia.onboarding.OnboardingFragment implements org.wikipedia.onboarding.OnboardingPageView.Callback {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.onboarding.OnboardingPageView onboardingPageView;
    private final int doneButtonText = 0;
    private boolean languageChanged = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> loginLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> languageChooserLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.onboarding.InitialOnboardingFragment.Companion Companion = null;
    
    public InitialOnboardingFragment() {
        super(false);
    }
    
    @java.lang.Override()
    protected int getDoneButtonText() {
        return 0;
    }
    
    public final boolean getLanguageChanged() {
        return false;
    }
    
    public final void setLanguageChanged(boolean p0) {
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/onboarding/InitialOnboardingFragment;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.onboarding.InitialOnboardingFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$ItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callback", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "getCallback", "()Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
    public static final class ItemFragment extends androidx.fragment.app.Fragment {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.onboarding.InitialOnboardingFragment.ItemFragment.Companion Companion = null;
        
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$ItemFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/onboarding/InitialOnboardingFragment$ItemFragment;", "position", "", "app.lib"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.onboarding.InitialOnboardingFragment.ItemFragment newInstance(int position) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPage;", "", "Lorg/wikipedia/model/EnumCode;", "layout", "", "(Ljava/lang/String;II)V", "getLayout", "()I", "code", "PAGE_WELCOME", "PAGE_EXPLORE", "PAGE_READING_LISTS", "PAGE_DATA_PRIVACY", "Companion", "app.lib"})
    @kotlin.Suppress(names = {"unused"})
    public static enum OnboardingPage implements org.wikipedia.model.EnumCode {
        /*public static final*/ PAGE_WELCOME /* = new PAGE_WELCOME(0) */,
        /*public static final*/ PAGE_EXPLORE /* = new PAGE_EXPLORE(0) */,
        /*public static final*/ PAGE_READING_LISTS /* = new PAGE_READING_LISTS(0) */,
        /*public static final*/ PAGE_DATA_PRIVACY /* = new PAGE_DATA_PRIVACY(0) */;
        private final int layout = 0;
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage.Companion Companion = null;
        
        OnboardingPage(@androidx.annotation.LayoutRes()
        int layout) {
        }
        
        public final int getLayout() {
            return 0;
        }
        
        @java.lang.Override()
        public int code() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPage$Companion;", "", "()V", "of", "Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPage;", "code", "", "app.lib"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage of(int code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app.lib"})
    static final class OnboardingPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public OnboardingPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
}