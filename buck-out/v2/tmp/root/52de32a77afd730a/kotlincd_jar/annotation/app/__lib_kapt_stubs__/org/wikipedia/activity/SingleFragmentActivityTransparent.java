package org.wikipedia.activity;

import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import org.wikipedia.R;

/**
 * Boilerplate for a FragmentActivity containing a single stack of
 * Fragments, with a transparent background.
 *
 * Set a theme on the activity in AndroidManifest.xml to specify a background tint.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0014\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/activity/SingleFragmentActivityTransparent;", "T", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setTheme", "app.lib"})
public abstract class SingleFragmentActivityTransparent<T extends androidx.fragment.app.Fragment> extends org.wikipedia.activity.SingleFragmentActivity<T> {
    
    public SingleFragmentActivityTransparent() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setTheme() {
    }
}