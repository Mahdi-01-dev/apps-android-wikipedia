package org.wikipedia.settings;

import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.BuildConfig;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.compose.components.LinkTextData;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.DeviceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/AboutActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "credits", "", "Lorg/wikipedia/compose/components/LinkTextData;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class AboutActivity extends org.wikipedia.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.compose.components.LinkTextData> credits = null;
    public static final int SECRET_CLICK_LIMIT = 7;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.AboutActivity.Companion Companion = null;
    
    public AboutActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/settings/AboutActivity$Companion;", "", "()V", "SECRET_CLICK_LIMIT", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}