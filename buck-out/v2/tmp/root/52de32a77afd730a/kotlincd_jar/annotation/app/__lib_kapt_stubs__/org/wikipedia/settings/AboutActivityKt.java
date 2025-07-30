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

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a0\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0012\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u001a\"\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a5\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u001a6\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0007\u001a(\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a,\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007\u00a8\u0006\u001f"}, d2 = {"AboutScreenBody", "", "modifier", "Landroidx/compose/ui/Modifier;", "credits", "", "Lorg/wikipedia/compose/components/LinkTextData;", "AboutScreenContent", "versionName", "", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "AboutScreenFooter", "AboutScreenPreview", "AboutWikipediaHeader", "AboutWikipediaImage", "onSecretCountClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isEnabled", "AboutWikipediaScreen", "onBackButtonClick", "Lkotlin/Function0;", "LicenseTextWithHeader", "header", "LinkTextWithHeader", "html", "linkStyles", "Landroidx/compose/ui/text/TextLinkStyles;", "app.lib"})
public final class AboutActivityKt {
    
    @androidx.compose.runtime.Composable()
    public static final void AboutWikipediaScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.compose.components.LinkTextData> credits, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AboutScreenContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.compose.components.LinkTextData> credits, @org.jetbrains.annotations.NotNull()
    androidx.compose.material3.SnackbarHostState snackbarHostState) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AboutWikipediaHeader(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, @org.jetbrains.annotations.NotNull()
    androidx.compose.material3.SnackbarHostState snackbarHostState) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AboutWikipediaImage(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSecretCountClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AboutScreenBody(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.compose.components.LinkTextData> credits) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AboutScreenFooter(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LinkTextWithHeader(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String header, @org.jetbrains.annotations.NotNull()
    java.lang.String html, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextLinkStyles linkStyles) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LicenseTextWithHeader(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String header, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.compose.components.LinkTextData> credits) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void AboutScreenPreview() {
    }
}