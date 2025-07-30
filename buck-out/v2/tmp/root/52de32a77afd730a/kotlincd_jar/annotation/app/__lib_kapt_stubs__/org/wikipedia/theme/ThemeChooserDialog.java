package org.wikipedia.theme;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.analytics.eventplatform.AppearanceSettingInteractionEvent;
import org.wikipedia.concurrency.FlowEventBus;
import org.wikipedia.databinding.DialogThemeChooserBinding;
import org.wikipedia.events.WebViewInvalidateEvent;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u0006789:;<B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0010H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0017H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\b\u0010/\u001a\u00020\u0017H\u0002J\u0018\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0010H\u0002J\u0018\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u0002042\u0006\u00105\u001a\u00020\u0010H\u0002J\b\u00106\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "app", "Lorg/wikipedia/WikipediaApp;", "appearanceSettingInteractionEvent", "Lorg/wikipedia/analytics/eventplatform/AppearanceSettingInteractionEvent;", "binding", "getBinding", "()Lerror/NonExistentClass;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isEditing", "", "isMatchingSystemThemeEnabled", "()Z", "updatingFont", "callback", "Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "conditionallyDisableThemeButtons", "", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onToggleDimImages", "enabled", "onToggleMatchSystemTheme", "onToggleReadingFocusMode", "updateComponents", "updateDimImagesSwitch", "updateFontFamily", "updateFontSize", "updateForEditing", "updateMatchSystemThemeSwitch", "updateThemeButtonAlpha", "button", "translucent", "updateThemeButtonStroke", "Lcom/google/android/material/button/MaterialButton;", "selected", "updateThemeButtons", "Callback", "Companion", "FontFamilyListener", "FontSizeAction", "FontSizeButtonListener", "ThemeButtonListener", "app.lib"})
public final class ThemeChooserDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private DialogThemeChooserBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.WikipediaApp app;
    private org.wikipedia.analytics.eventplatform.AppearanceSettingInteractionEvent appearanceSettingInteractionEvent;
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private boolean updatingFont = false;
    private boolean isEditing = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_IS_EDITING = "isEditing";
    private static final int BUTTON_STROKE_WIDTH = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.theme.ThemeChooserDialog.Companion Companion = null;
    
    public ThemeChooserDialog() {
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final void updateForEditing() {
    }
    
    private final void onToggleDimImages(boolean enabled) {
    }
    
    private final void onToggleMatchSystemTheme(boolean enabled) {
    }
    
    private final void onToggleReadingFocusMode(boolean enabled) {
    }
    
    private final void conditionallyDisableThemeButtons() {
    }
    
    private final void updateThemeButtonAlpha(android.view.View button, boolean translucent) {
    }
    
    private final boolean isMatchingSystemThemeEnabled() {
        return false;
    }
    
    private final void updateComponents() {
    }
    
    private final void updateMatchSystemThemeSwitch() {
    }
    
    private final void updateFontSize() {
    }
    
    private final void updateFontFamily() {
    }
    
    private final void updateThemeButtons() {
    }
    
    private final void updateThemeButtonStroke(com.google.android.material.button.MaterialButton button, boolean selected) {
    }
    
    private final void updateDimImagesSwitch() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.theme.ThemeChooserDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "", "onCancelThemeChooser", "", "onEditingPrefsChanged", "onToggleDimImages", "onToggleReadingFocusMode", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onToggleDimImages();
        
        public abstract void onToggleReadingFocusMode();
        
        public abstract void onCancelThemeChooser();
        
        public abstract void onEditingPrefsChanged();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$Companion;", "", "()V", "BUTTON_STROKE_WIDTH", "", "EXTRA_IS_EDITING", "", "newInstance", "Lorg/wikipedia/theme/ThemeChooserDialog;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "isEditing", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.theme.ThemeChooserDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, boolean isEditing) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$FontFamilyListener;", "Landroid/view/View$OnClickListener;", "(Lorg/wikipedia/theme/ThemeChooserDialog;)V", "onClick", "", "v", "Landroid/view/View;", "app.lib"})
    final class FontFamilyListener implements android.view.View.OnClickListener {
        
        public FontFamilyListener() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeAction;", "", "(Ljava/lang/String;I)V", "INCREASE", "DECREASE", "RESET", "app.lib"})
    static enum FontSizeAction {
        /*public static final*/ INCREASE /* = new INCREASE() */,
        /*public static final*/ DECREASE /* = new DECREASE() */,
        /*public static final*/ RESET /* = new RESET() */;
        
        FontSizeAction() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.theme.ThemeChooserDialog.FontSizeAction> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeButtonListener;", "Landroid/view/View$OnClickListener;", "action", "Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeAction;", "(Lorg/wikipedia/theme/ThemeChooserDialog;Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeAction;)V", "onClick", "", "view", "Landroid/view/View;", "app.lib"})
    final class FontSizeButtonListener implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.theme.ThemeChooserDialog.FontSizeAction action = null;
        
        public FontSizeButtonListener(@org.jetbrains.annotations.NotNull()
        org.wikipedia.theme.ThemeChooserDialog.FontSizeAction action) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$ThemeButtonListener;", "Landroid/view/View$OnClickListener;", "theme", "Lorg/wikipedia/theme/Theme;", "(Lorg/wikipedia/theme/ThemeChooserDialog;Lorg/wikipedia/theme/Theme;)V", "onClick", "", "v", "Landroid/view/View;", "app.lib"})
    final class ThemeButtonListener implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.theme.Theme theme = null;
        
        public ThemeButtonListener(@org.jetbrains.annotations.NotNull()
        org.wikipedia.theme.Theme theme) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
}