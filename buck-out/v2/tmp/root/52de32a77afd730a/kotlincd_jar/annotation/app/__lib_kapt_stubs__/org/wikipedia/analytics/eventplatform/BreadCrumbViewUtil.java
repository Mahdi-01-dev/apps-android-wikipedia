package org.wikipedia.analytics.eventplatform;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import org.wikipedia.R;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.feed.view.ListCardItemView;
import org.wikipedia.feed.view.ListCardView;
import org.wikipedia.main.MainActivity;
import org.wikipedia.main.MainFragment;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.onboarding.InitialOnboardingActivity;
import org.wikipedia.onboarding.InitialOnboardingFragment;
import org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/BreadCrumbViewUtil;", "", "()V", "VIEW_UNNAMED", "", "getCurrentFragmentName", "context", "Landroid/content/Context;", "getInitialOnboardingScreenName", "fragment", "Landroidx/fragment/app/Fragment;", "getMainFragmentTabName", "getReadableNameForView", "view", "Landroid/view/View;", "getReadableScreenName", "getViewResourceName", "getVisibleFragment", "app.lib"})
public final class BreadCrumbViewUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String VIEW_UNNAMED = "unnamed";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.BreadCrumbViewUtil INSTANCE = null;
    
    private BreadCrumbViewUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReadableNameForView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    private final java.lang.String getViewResourceName(android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReadableScreenName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
        return null;
    }
    
    private final java.lang.String getCurrentFragmentName(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getMainFragmentTabName(androidx.fragment.app.Fragment fragment) {
        return null;
    }
    
    private final java.lang.String getInitialOnboardingScreenName(androidx.fragment.app.Fragment fragment) {
        return null;
    }
    
    private final androidx.fragment.app.Fragment getVisibleFragment(android.content.Context context) {
        return null;
    }
}