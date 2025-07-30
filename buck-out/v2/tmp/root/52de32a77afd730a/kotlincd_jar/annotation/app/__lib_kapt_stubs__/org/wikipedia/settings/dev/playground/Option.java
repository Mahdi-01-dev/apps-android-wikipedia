package org.wikipedia.settings.dev.playground;

import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.categories.db.Category;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.UiState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/settings/dev/playground/Option;", "", "(Ljava/lang/String;I)V", "ENTRY", "FILTER", "DELETE", "app.lib"})
public enum Option {
    /*public static final*/ ENTRY /* = new ENTRY() */,
    /*public static final*/ FILTER /* = new FILTER() */,
    /*public static final*/ DELETE /* = new DELETE() */;
    
    Option() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.settings.dev.playground.Option> getEntries() {
        return null;
    }
}