package org.wikipedia.edit.insertmedia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.databinding.FragmentInsertMediaAdvancedSettingsBinding;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u0017J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010(\u001a\u00020\u0017R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaAdvancedSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/edit/insertmedia/InsertMediaImagePositionDialog$Callback;", "Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog$Callback;", "Lorg/wikipedia/edit/insertmedia/InsertMediaImageSizeDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "activity", "Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;", "binding", "getBinding", "()Lerror/NonExistentClass;", "isActive", "", "()Z", "viewModel", "Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "getViewModel", "()Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "handleBackPressed", "hide", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onToggleWrapImage", "enabled", "onUpdateImagePosition", "onUpdateImageSize", "onUpdateImageType", "onViewCreated", "view", "show", "app.lib"})
public final class InsertMediaAdvancedSettingsFragment extends androidx.fragment.app.Fragment implements org.wikipedia.edit.insertmedia.InsertMediaImagePositionDialog.Callback, org.wikipedia.edit.insertmedia.InsertMediaImageTypeDialog.Callback, org.wikipedia.edit.insertmedia.InsertMediaImageSizeDialog.Callback {
    private org.wikipedia.edit.insertmedia.InsertMediaActivity activity;
    @org.jetbrains.annotations.Nullable()
    private FragmentInsertMediaAdvancedSettingsBinding _binding;
    
    public InsertMediaAdvancedSettingsFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.edit.insertmedia.InsertMediaViewModel getViewModel() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onToggleWrapImage(boolean enabled) {
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onUpdateImagePosition() {
    }
    
    @java.lang.Override()
    public void onUpdateImageType() {
    }
    
    @java.lang.Override()
    public void onUpdateImageSize() {
    }
}