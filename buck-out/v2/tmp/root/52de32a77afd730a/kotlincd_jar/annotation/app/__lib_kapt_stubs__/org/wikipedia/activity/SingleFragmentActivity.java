package org.wikipedia.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import org.wikipedia.R;
import org.wikipedia.util.DeviceUtil;

/**
 * Boilerplate for a FragmentActivity containing a single stack of Fragments.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0014J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/activity/SingleFragmentActivity;", "T", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "fragment", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "(Landroidx/fragment/app/Fragment;)V", "Landroidx/fragment/app/Fragment;", "createFragment", "disableFitsSystemWindows", "", "inflateAndSetContentView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app.lib"})
public abstract class SingleFragmentActivity<T extends androidx.fragment.app.Fragment> extends org.wikipedia.activity.BaseActivity {
    public T fragment;
    
    public SingleFragmentActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract T createFragment();
    
    protected void inflateAndSetContentView() {
    }
    
    public final void disableFitsSystemWindows() {
    }
}