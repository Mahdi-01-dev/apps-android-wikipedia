package org.wikipedia.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.DialogRegionalLanguageVariantSelectionBinding;
import org.wikipedia.databinding.ItemLanguageVariantSelectionBinding;
import org.wikipedia.language.AppLanguageLookUpTable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/feed/view/RegionalLanguageVariantSelectionDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "regionalLanguageVariants", "", "", "selectedLanguageCode", "buildRadioButtons", "", "clearCheckedButtons", "setPositiveButtonEnabled", "enabled", "", "show", "Companion", "app.lib"})
public final class RegionalLanguageVariantSelectionDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object binding;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedLanguageCode = "zh-tw";
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> regionalLanguageVariants;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.view.RegionalLanguageVariantSelectionDialog.Companion Companion = null;
    
    public RegionalLanguageVariantSelectionDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog show() {
        return null;
    }
    
    private final void buildRadioButtons(android.content.Context context) {
    }
    
    private final void clearCheckedButtons() {
    }
    
    private final void setPositiveButtonEnabled(boolean enabled) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/view/RegionalLanguageVariantSelectionDialog$Companion;", "", "()V", "removeNonRegionalLanguageVariants", "", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> removeNonRegionalLanguageVariants() {
            return null;
        }
    }
}