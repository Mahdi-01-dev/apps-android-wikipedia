package org.wikipedia.language.addlanguages;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UiState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u008b\u0001\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007\u001a\b\u0010\u0018\u001a\u00020\u0001H\u0003\u001a$\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a8\u0006\u001d"}, d2 = {"LanguageListItemView", "", "modifier", "Landroidx/compose/ui/Modifier;", "localizedLanguageName", "", "subtitle", "LanguagesListScreen", "uiState", "Lorg/wikipedia/util/UiState;", "", "Lorg/wikipedia/language/addlanguages/LanguageListItem;", "onBackButtonClick", "Lkotlin/Function0;", "onSearchQueryChange", "Lkotlin/Function1;", "onListItemClick", "Lkotlin/ParameterName;", "name", "code", "onLanguageSearched", "", "wikiErrorClickEvents", "Lorg/wikipedia/compose/components/error/WikiErrorClickEvents;", "LanguagesListScreenPreview", "ListHeader", "title", "titleStyle", "Landroidx/compose/ui/text/TextStyle;", "app.lib"})
public final class AddLanguagesListScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void LanguagesListScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    org.wikipedia.util.UiState<? extends java.util.List<org.wikipedia.language.addlanguages.LanguageListItem>> uiState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchQueryChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onListItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onLanguageSearched, @org.jetbrains.annotations.Nullable()
    org.wikipedia.compose.components.error.WikiErrorClickEvents wikiErrorClickEvents) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ListHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle titleStyle) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LanguageListItemView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String localizedLanguageName, @org.jetbrains.annotations.Nullable()
    java.lang.String subtitle) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void LanguagesListScreenPreview() {
    }
}