package org.wikipedia.random;

import android.app.ActivityOptions;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.databinding.FragmentRandomBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.events.ArticleSavedOrDeletedEvent;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.log.L;
import org.wikipedia.views.PositionAwareFragmentStateAdapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u0003234B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0002J-\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\n2\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020+0*0)\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0018H\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u000200H\u0002J\u0014\u00101\u001a\u00020\u00182\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lorg/wikipedia/random/RandomFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "topTitle", "Lorg/wikipedia/page/PageTitle;", "getTopTitle", "()Lorg/wikipedia/page/PageTitle;", "viewModel", "Lorg/wikipedia/random/RandomViewModel;", "getViewModel", "()Lorg/wikipedia/random/RandomViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewPagerListener", "Lorg/wikipedia/random/RandomFragment$ViewPagerListener;", "getTopChild", "Lorg/wikipedia/random/RandomItemFragment;", "onBackClick", "", "onChildLoaded", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onNextClick", "onResume", "onSaveShareClick", "onSelectPage", "title", "sharedElements", "", "Landroid/util/Pair;", "", "(Lorg/wikipedia/page/PageTitle;[Landroid/util/Pair;)V", "setSaveButton", "updateBackButton", "pagerPosition", "", "updateSaveButton", "Companion", "RandomItemAdapter", "ViewPagerListener", "app.lib"})
public final class RandomFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private FragmentRandomBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.random.RandomFragment.ViewPagerListener viewPagerListener = null;
    public static final int DEFAULT_PAGER_TAB = 0;
    public static final float ENABLED_BACK_BUTTON_ALPHA = 1.0F;
    public static final float DISABLED_BACK_BUTTON_ALPHA = 0.5F;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.random.RandomFragment.Companion Companion = null;
    
    public RandomFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.random.RandomViewModel getViewModel() {
        return null;
    }
    
    private final org.wikipedia.page.PageTitle getTopTitle() {
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onNextClick() {
    }
    
    private final void onBackClick() {
    }
    
    private final void onSaveShareClick() {
    }
    
    public final void onSelectPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    android.util.Pair<android.view.View, java.lang.String>[] sharedElements) {
    }
    
    private final void updateBackButton(int pagerPosition) {
    }
    
    private final void updateSaveButton(org.wikipedia.page.PageTitle title) {
    }
    
    private final void setSaveButton() {
    }
    
    public final void onChildLoaded() {
    }
    
    private final org.wikipedia.random.RandomItemFragment getTopChild() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/random/RandomFragment$Companion;", "", "()V", "DEFAULT_PAGER_TAB", "", "DISABLED_BACK_BUTTON_ALPHA", "", "ENABLED_BACK_BUTTON_ALPHA", "newInstance", "Lorg/wikipedia/random/RandomFragment;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.random.RandomFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/random/RandomFragment$RandomItemAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lorg/wikipedia/random/RandomFragment;Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app.lib"})
    final class RandomItemAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        
        public RandomItemAdapter(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/random/RandomFragment$ViewPagerListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/random/RandomFragment;)V", "nextPageSelectedAutomatic", "", "prevPosition", "", "onPageSelected", "", "position", "setNextPageSelectedAutomatic", "app.lib"})
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