package org.wikipedia.views;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentAt", "position", "", "removeFragmentAt", "", "app.lib"})
public abstract class PositionAwareFragmentStateAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    
    public PositionAwareFragmentStateAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super(null);
    }
    
    public PositionAwareFragmentStateAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getFragmentAt(int position) {
        return null;
    }
    
    public final void removeFragmentAt(int position) {
    }
}