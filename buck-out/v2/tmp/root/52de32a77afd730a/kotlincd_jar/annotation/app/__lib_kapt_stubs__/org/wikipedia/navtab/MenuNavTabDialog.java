package org.wikipedia.navtab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.ImageViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.wikipedia.R;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.DonorExperienceEvent;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.ViewMainDrawerBinding;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.places.PlacesActivity;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/navtab/MenuNavTabDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/navtab/MenuNavTabDialog$Callback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onStart", "updateState", "Callback", "Companion", "app.lib"})
public final class MenuNavTabDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private ViewMainDrawerBinding _binding;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.navtab.MenuNavTabDialog.Companion Companion = null;
    
    public MenuNavTabDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void updateState() {
    }
    
    private final org.wikipedia.navtab.MenuNavTabDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/navtab/MenuNavTabDialog$Callback;", "", "contribsClick", "", "donateClick", "campaignId", "", "loginClick", "settingsClick", "talkClick", "usernameClick", "watchlistClick", "yearInReviewClick", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void usernameClick();
        
        public abstract void loginClick();
        
        public abstract void talkClick();
        
        public abstract void settingsClick();
        
        public abstract void watchlistClick();
        
        public abstract void contribsClick();
        
        public abstract void donateClick(@org.jetbrains.annotations.Nullable()
        java.lang.String campaignId);
        
        public abstract void yearInReviewClick();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/navtab/MenuNavTabDialog$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/navtab/MenuNavTabDialog;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.navtab.MenuNavTabDialog newInstance() {
            return null;
        }
    }
}