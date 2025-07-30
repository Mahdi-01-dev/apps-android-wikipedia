package org.wikipedia.readinglist.recommended;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ListItemDefaults;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.RadioButtonDefaults;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.tooling.preview.Preview;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.compose.components.error.WikiErrorClickEvents;
import org.wikipedia.compose.theme.WikipediaTheme;
import org.wikipedia.theme.Theme;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0003\u001a\u0012\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001a\u008a\u0001\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001a\u0012\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001a.\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001aJ\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u00bc\u0001\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007\u001a\b\u0010*\u001a\u00020\u0001H\u0003\u001a.\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00112\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001a:\u0010.\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00112\u001c\u00100\u001a\u0018\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b2\u00a2\u0006\u0002\b3H\u0007\u001a\u001a\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001a.\u00106\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u00a8\u00067"}, d2 = {"ArticlesNumberView", "", "articlesNumber", "", "onArticleNumberChanged", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "maxArticleNumber", "minArticleNumber", "DisabledState", "EnabledState", "selectedFrequency", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "discoverSource", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "isNotificationEnabled", "", "onUpdateFrequency", "onRecommendedReadingListSourceClick", "Lkotlin/Function0;", "onInterestClick", "onNotificationStateChanged", "InterestsView", "NotificationView", "RadioListDialog", "options", "", "", "selectedOption", "onDismissRequest", "onOptionSelected", "RecommendedReadingListSettingsScreen", "uiState", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSettingsState;", "resetUiState", "Lorg/wikipedia/util/Resource;", "onBackButtonClick", "onRecommendedReadingListSwitchClick", "onListGenerated", "wikiErrorClickEvents", "Lorg/wikipedia/compose/components/error/WikiErrorClickEvents;", "RecommendedReadingListSettingsScreenPreview", "RecommendedReadingListSwitch", "isRecommendedReadingListEnabled", "onCheckedChange", "SettingsSection", "canShowDivider", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SourceView", "source", "UpdatesFrequencyView", "app.lib"})
public final class RecommendedReadingListSettingsScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void RecommendedReadingListSettingsScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSettingsState uiState, @org.jetbrains.annotations.NotNull()
    org.wikipedia.util.Resource<java.lang.Boolean> resetUiState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRecommendedReadingListSourceClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onInterestClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onRecommendedReadingListSwitchClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onNotificationStateChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onArticleNumberChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency, kotlin.Unit> onUpdateFrequency, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onListGenerated, @org.jetbrains.annotations.Nullable()
    org.wikipedia.compose.components.error.WikiErrorClickEvents wikiErrorClickEvents) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void DisabledState(androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EnabledState(int articlesNumber, org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency selectedFrequency, org.wikipedia.readinglist.recommended.RecommendedReadingListSource discoverSource, boolean isNotificationEnabled, kotlin.jvm.functions.Function1<? super org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency, kotlin.Unit> onUpdateFrequency, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onArticleNumberChanged, kotlin.jvm.functions.Function0<kotlin.Unit> onRecommendedReadingListSourceClick, kotlin.jvm.functions.Function0<kotlin.Unit> onInterestClick, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onNotificationStateChanged, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ArticlesNumberView(int articlesNumber, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onArticleNumberChanged, androidx.compose.ui.Modifier modifier, int maxArticleNumber, int minArticleNumber) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void UpdatesFrequencyView(org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency selectedFrequency, kotlin.jvm.functions.Function1<? super org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency, kotlin.Unit> onUpdateFrequency, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void RecommendedReadingListSwitch(boolean isRecommendedReadingListEnabled, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SourceView(org.wikipedia.readinglist.recommended.RecommendedReadingListSource source, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void InterestsView(androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void NotificationView(androidx.compose.ui.Modifier modifier, boolean isNotificationEnabled, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onNotificationStateChanged) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RadioListDialog(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> options, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedOption, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onOptionSelected) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SettingsSection(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean canShowDivider, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void RecommendedReadingListSettingsScreenPreview() {
    }
}