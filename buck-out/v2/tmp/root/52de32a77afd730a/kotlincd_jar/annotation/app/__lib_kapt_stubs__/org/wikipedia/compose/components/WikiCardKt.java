package org.wikipedia.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ExperimentalLayoutApi;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a\u0085\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0003\u001aY\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\r\u00a2\u0006\u0002\b\u001cH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a\b\u0010\u001f\u001a\u00020\u0001H\u0003\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006 "}, d2 = {"BorderAndElevationWikiTextPreview", "", "MessageCard", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "message", "imageRes", "", "positiveButtonText", "negativeButtonText", "onPositiveButtonClick", "Lkotlin/Function0;", "onNegativeButtonClick", "onContainerClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "MessageCardPreview", "WikiCard", "elevation", "Landroidx/compose/ui/unit/Dp;", "colors", "Landroidx/compose/material3/CardColors;", "border", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "content", "Landroidx/compose/runtime/Composable;", "WikiCard-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/material3/CardColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;)V", "WikiCardSimpleWikiTextPreview", "app.lib"})
public final class WikiCardKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.layout.ExperimentalLayoutApi.class})
    @androidx.compose.runtime.Composable()
    public static final void MessageCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer imageRes, @org.jetbrains.annotations.Nullable()
    java.lang.String positiveButtonText, @org.jetbrains.annotations.Nullable()
    java.lang.String negativeButtonText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPositiveButtonClick, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNegativeButtonClick, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onContainerClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    private static final void WikiCardSimpleWikiTextPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    private static final void BorderAndElevationWikiTextPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    private static final void MessageCardPreview() {
    }
}