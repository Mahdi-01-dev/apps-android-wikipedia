package org.wikipedia.wiktionary;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.dataclient.restbase.RbDefinition;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a;\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001aG\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00122!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0014\u001a\u00020\u0001H\u0007\u001a3\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u0018"}, d2 = {"DefinitionList", "", "usage", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Usage;", "onDialogLinkClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "DefinitionWithExamples", "definition", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Definition;", "count", "", "WiktionaryDialogContent", "title", "wiktionaryDialogState", "Lorg/wikipedia/util/Resource;", "", "WiktionaryDialogPreview", "WiktionaryDialogScreen", "viewModel", "Lorg/wikipedia/wiktionary/WiktionaryViewModel;", "app.lib"})
public final class WiktionaryDialogScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void WiktionaryDialogScreen(@org.jetbrains.annotations.NotNull()
    org.wikipedia.wiktionary.WiktionaryViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDialogLinkClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WiktionaryDialogContent(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.restbase.RbDefinition.Usage>> wiktionaryDialogState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDialogLinkClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DefinitionList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.restbase.RbDefinition.Usage usage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDialogLinkClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DefinitionWithExamples(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.restbase.RbDefinition.Definition definition, int count, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDialogLinkClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void WiktionaryDialogPreview() {
    }
}