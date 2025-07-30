package org.wikipedia.language;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import org.wikipedia.R;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.util.UiState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001ah\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a.\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007\u001a$\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u00a8\u0006\u0018"}, d2 = {"ComposeLangLinksScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "uiState", "Lorg/wikipedia/util/UiState;", "", "Lorg/wikipedia/language/LangLinksItem;", "onLanguageSelected", "Lkotlin/Function1;", "wikiErrorClickEvents", "Lorg/wikipedia/compose/components/error/WikiErrorClickEvents;", "onBackButtonClick", "Lkotlin/Function0;", "onSearchQueryChange", "", "LangLinksItemView", "localizedLanguageName", "canonicalName", "articleName", "ListHeader", "title", "titleStyle", "Landroidx/compose/ui/text/TextStyle;", "app.lib"})
public final class LangLinksScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ComposeLangLinksScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    org.wikipedia.util.UiState<? extends java.util.List<org.wikipedia.language.LangLinksItem>> uiState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.language.LangLinksItem, kotlin.Unit> onLanguageSelected, @org.jetbrains.annotations.Nullable()
    org.wikipedia.compose.components.error.WikiErrorClickEvents wikiErrorClickEvents, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchQueryChange) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ListHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle titleStyle) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LangLinksItemView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String localizedLanguageName, @org.jetbrains.annotations.Nullable()
    java.lang.String canonicalName, @org.jetbrains.annotations.NotNull()
    java.lang.String articleName) {
    }
}