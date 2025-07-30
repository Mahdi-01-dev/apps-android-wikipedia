package org.wikipedia.wiktionary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import org.wikipedia.Constants;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.page.ExtendedBottomSheetDialogFragment;
import org.wikipedia.page.PageTitle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/wiktionary/WiktionaryDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "viewModel", "Lorg/wikipedia/wiktionary/WiktionaryViewModel;", "getViewModel", "()Lorg/wikipedia/wiktionary/WiktionaryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callback", "Lorg/wikipedia/wiktionary/WiktionaryDialog$Callback;", "maybeShowNewDialogForLink", "", "url", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showNewDialogForLink", "Callback", "Companion", "app.lib"})
public final class WiktionaryDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PATH_WIKI = "/wiki/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PATH_CURRENT = "./";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKTIONARY_DOMAIN = ".wiktionary.org";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> enabledLanguages = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.wiktionary.WiktionaryDialog.Companion Companion = null;
    
    public WiktionaryDialog() {
        super();
    }
    
    private final org.wikipedia.wiktionary.WiktionaryViewModel getViewModel() {
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
    
    private final void maybeShowNewDialogForLink(java.lang.String url) {
    }
    
    private final void showNewDialogForLink(java.lang.String url) {
    }
    
    private final org.wikipedia.wiktionary.WiktionaryDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/wiktionary/WiktionaryDialog$Callback;", "", "wiktionaryShowDialogForTerm", "", "term", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void wiktionaryShowDialogForTerm(@org.jetbrains.annotations.NotNull()
        java.lang.String term);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/wiktionary/WiktionaryDialog$Companion;", "", "()V", "PATH_CURRENT", "", "PATH_WIKI", "WIKTIONARY_DOMAIN", "enabledLanguages", "", "getEnabledLanguages", "()Ljava/util/List;", "newInstance", "Lorg/wikipedia/wiktionary/WiktionaryDialog;", "title", "Lorg/wikipedia/page/PageTitle;", "selectedText", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getEnabledLanguages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.wiktionary.WiktionaryDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        java.lang.String selectedText) {
            return null;
        }
    }
}