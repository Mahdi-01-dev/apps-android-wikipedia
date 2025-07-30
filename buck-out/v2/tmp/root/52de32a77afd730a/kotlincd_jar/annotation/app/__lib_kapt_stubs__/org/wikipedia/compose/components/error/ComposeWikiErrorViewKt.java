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

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0003\u001a\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u001c\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002\u00a8\u0006\u0011"}, d2 = {"WikiErrorView", "", "modifier", "Landroidx/compose/ui/Modifier;", "caught", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "errorClickEvents", "Lorg/wikipedia/compose/components/error/WikiErrorClickEvents;", "WikiErrorViewPreview", "getClickEventForErrorType", "Lkotlin/Function0;", "wikiErrorClickEvents", "errorType", "Lorg/wikipedia/compose/components/error/ComposeErrorType;", "getErrorType", "app.lib"})
public final class ComposeWikiErrorViewKt {
    
    @androidx.compose.runtime.Composable()
    public static final void WikiErrorView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.Nullable()
    org.wikipedia.compose.components.error.WikiErrorClickEvents errorClickEvents) {
    }
    
    private static final kotlin.jvm.functions.Function0<kotlin.Unit> getClickEventForErrorType(org.wikipedia.compose.components.error.WikiErrorClickEvents wikiErrorClickEvents, org.wikipedia.compose.components.error.ComposeErrorType errorType) {
        return null;
    }
    
    private static final org.wikipedia.compose.components.error.ComposeErrorType getErrorType(java.lang.Throwable caught, org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void WikiErrorViewPreview() {
    }
}