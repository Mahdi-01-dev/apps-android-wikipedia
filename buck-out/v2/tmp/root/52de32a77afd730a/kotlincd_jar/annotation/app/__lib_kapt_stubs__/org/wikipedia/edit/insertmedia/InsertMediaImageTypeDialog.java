package org.wikipedia.edit.insertmedia;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.databinding.DialogInsertMediaTypeBinding;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0003\'()B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "imageTypeList", "", "", "[Ljava/lang/String;", "imageTypeOptions", "Landroid/view/View;", "[Landroid/view/View;", "viewModel", "Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "getViewModel", "()Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "callback", "Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog$Callback;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "resetAllOptions", "selectOption", "imageType", "setupListeners", "updateOptionView", "view", "enabled", "", "Callback", "Companion", "ImageTypeOptionClickListener", "app.lib"})
public final class InsertMediaImageTypeDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private DialogInsertMediaTypeBinding _binding;
    private android.view.View[] imageTypeOptions;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] imageTypeList = {"img_thumbnail", "img_framed", "img_frameless", "basic"};
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.insertmedia.InsertMediaImageTypeDialog.Companion Companion = null;
    
    public InsertMediaImageTypeDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.edit.insertmedia.InsertMediaViewModel getViewModel() {
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
    
    private final void setupListeners() {
    }
    
    private final void selectOption(java.lang.String imageType) {
    }
    
    private final void resetAllOptions() {
    }
    
    private final void updateOptionView(android.view.View view, boolean enabled) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final org.wikipedia.edit.insertmedia.InsertMediaImageTypeDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog$Callback;", "", "onUpdateImageType", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onUpdateImageType();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.edit.insertmedia.InsertMediaImageTypeDialog newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog$ImageTypeOptionClickListener;", "Landroid/view/View$OnClickListener;", "(Lorg/wikipedia/edit/insertmedia/InsertMediaImageTypeDialog;)V", "onClick", "", "view", "Landroid/view/View;", "app.lib"})
    public final class ImageTypeOptionClickListener implements android.view.View.OnClickListener {
        
        public ImageTypeOptionClickListener() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
}