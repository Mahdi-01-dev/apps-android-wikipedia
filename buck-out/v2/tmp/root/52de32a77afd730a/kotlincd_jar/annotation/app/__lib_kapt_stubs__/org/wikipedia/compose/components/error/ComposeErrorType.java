package org.wikipedia.compose.components.error;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B9\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType;", "", "icon", "", "text", "buttonText", "hasFooterText", "", "footerText", "(IIIZI)V", "getButtonText", "()I", "getFooterText", "getHasFooterText", "()Z", "getIcon", "getText", "Empty", "Generic", "LoggedOut", "Offline", "PageMissing", "Timeout", "UserPageMissing", "Lorg/wikipedia/compose/components/error/ComposeErrorType$Empty;", "Lorg/wikipedia/compose/components/error/ComposeErrorType$Generic;", "Lorg/wikipedia/compose/components/error/ComposeErrorType$LoggedOut;", "Lorg/wikipedia/compose/components/error/ComposeErrorType$Offline;", "Lorg/wikipedia/compose/components/error/ComposeErrorType$PageMissing;", "Lorg/wikipedia/compose/components/error/ComposeErrorType$Timeout;", "Lorg/wikipedia/compose/components/error/ComposeErrorType$UserPageMissing;", "app.lib"})
public abstract class ComposeErrorType {
    private final int icon = 0;
    private final int text = 0;
    private final int buttonText = 0;
    private final boolean hasFooterText = false;
    private final int footerText = 0;
    
    private ComposeErrorType(@androidx.annotation.DrawableRes()
    int icon, @androidx.annotation.StringRes()
    int text, @androidx.annotation.StringRes()
    int buttonText, boolean hasFooterText, @androidx.annotation.StringRes()
    int footerText) {
        super();
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final int getText() {
        return 0;
    }
    
    public final int getButtonText() {
        return 0;
    }
    
    public final boolean getHasFooterText() {
        return false;
    }
    
    public final int getFooterText() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$Empty;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class Empty extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public Empty() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$Generic;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class Generic extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public Generic() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$LoggedOut;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class LoggedOut extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public LoggedOut() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$Offline;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class Offline extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public Offline() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$PageMissing;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class PageMissing extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public PageMissing() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$Timeout;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class Timeout extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public Timeout() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/compose/components/error/ComposeErrorType$UserPageMissing;", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "()V", "app.lib"})
    public static final class UserPageMissing extends org.wikipedia.compose.components.error.ComposeErrorType {
        
        public UserPageMissing() {
        }
    }
}