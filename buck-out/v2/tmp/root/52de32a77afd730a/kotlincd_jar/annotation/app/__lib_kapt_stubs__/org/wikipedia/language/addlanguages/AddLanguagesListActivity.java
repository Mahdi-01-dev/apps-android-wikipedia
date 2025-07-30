package org.wikipedia.language.addlanguages;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.Modifier;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.settings.languages.WikipediaLanguagesFragment;
import org.wikipedia.util.DeviceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/language/addlanguages/AddLanguagesListActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "isLanguageSearched", "", "viewModel", "Lorg/wikipedia/language/addlanguages/AddLanguagesViewModel;", "getViewModel", "()Lorg/wikipedia/language/addlanguages/AddLanguagesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class AddLanguagesListActivity extends org.wikipedia.activity.BaseActivity {
    private boolean isLanguageSearched = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE_SEARCHED = "language_searched";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.language.addlanguages.AddLanguagesListActivity.Companion Companion = null;
    
    public AddLanguagesListActivity() {
        super();
    }
    
    private final org.wikipedia.language.addlanguages.AddLanguagesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/language/addlanguages/AddLanguagesListActivity$Companion;", "", "()V", "LANGUAGE_SEARCHED", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}