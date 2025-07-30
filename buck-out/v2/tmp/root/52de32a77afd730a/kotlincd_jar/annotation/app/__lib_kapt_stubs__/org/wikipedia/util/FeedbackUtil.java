package org.wikipedia.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import com.skydoves.balloon.*;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.databinding.ViewPlainTextTooltipBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.main.MainActivity;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.edithistory.EditHistoryListActivity;
import org.wikipedia.random.RandomActivity;
import org.wikipedia.readinglist.ReadingListActivity;
import org.wikipedia.suggestededits.SuggestionsActivity;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.util.log.L;
import org.wikipedia.views.AllowSnackbarOverBottomSheet;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002Jd\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0003\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004J:\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'H\u0002J*\u0010(\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020,J*\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020,J\u001f\u0010.\u001a\u00020\u000b2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001300\"\u00020\u0013\u00a2\u0006\u0002\u00101J\u001f\u00102\u001a\u00020\u000b2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001300\"\u00020\u0013\u00a2\u0006\u0002\u00101J\u000e\u00103\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u00104\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0003\u00105\u001a\u00020\u0004J\u000e\u00106\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u00107\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u00108\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010+\u001a\u00020,J \u0010;\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u0004J\u0018\u0010;\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010<\u001a\u00020\u0004J \u0010;\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010<\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010;\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'2\b\b\u0001\u0010\u0018\u001a\u00020\u0004J\u0016\u0010;\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u0018\u001a\u00020\u000fJ\u0016\u0010=\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0019J\u000e\u0010?\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010@\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010B\u001a\u00020C2\u0006\u0010-\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020\u0004JL\u0010D\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001bJ@\u0010D\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00132\b\b\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010D\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lorg/wikipedia/util/FeedbackUtil;", "", "()V", "LENGTH_DEFAULT", "", "LENGTH_LONG", "LENGTH_MEDIUM", "LENGTH_SHORT", "TOOLBAR_ON_CLICK_LISTENER", "Landroid/view/View$OnClickListener;", "composeEmail", "", "context", "Landroid/content/Context;", "emailAddress", "", "subject", "body", "findBestView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "getTooltip", "Lcom/skydoves/balloon/Balloon;", "text", "", "autoDismiss", "", "arrowAnchorPadding", "topOrBottomMargin", "aboveOrBelow", "showDismissButton", "dismissButtonText", "countNum", "countTotal", "layoutRes", "getTopmostBottomSheetFragment", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "fragment", "Landroidx/fragment/app/Fragment;", "makeSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "duration", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "view", "setButtonOnClickToast", "views", "", "([Landroid/view/View;)V", "setButtonTooltip", "showAboutWikipedia", "showAndroidAppEditingFAQ", "urlStr", "showAndroidAppFAQ", "showAndroidAppRequestAnAccount", "showError", "e", "", "showMessage", "resId", "showMessageAsPlainText", "possibleHtml", "showOfflineReadingAndData", "showPrivacyPolicy", "showTermsOfUse", "showToastOverView", "Landroid/widget/Toast;", "showTooltip", "anchor", "balloon", "app.lib"})
public final class FeedbackUtil {
    private static final int LENGTH_SHORT = 3000;
    private static final int LENGTH_DEFAULT = 5000;
    public static final int LENGTH_MEDIUM = 8000;
    public static final int LENGTH_LONG = 15000;
    @org.jetbrains.annotations.NotNull()
    private static final android.view.View.OnClickListener TOOLBAR_ON_CLICK_LISTENER = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.FeedbackUtil INSTANCE = null;
    
    private FeedbackUtil() {
        super();
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite) {
    }
    
    public final void showMessageAsPlainText(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence possibleHtml) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @androidx.annotation.StringRes()
    int text) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @androidx.annotation.StringRes()
    int resId) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @androidx.annotation.StringRes()
    int resId, int duration) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
    }
    
    public final void showPrivacyPolicy(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showTermsOfUse(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showOfflineReadingAndData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showAboutWikipedia(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showAndroidAppFAQ(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showAndroidAppRequestAnAccount(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showAndroidAppEditingFAQ(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.StringRes()
    int urlStr) {
    }
    
    public final void composeEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String emailAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
    
    public final void setButtonTooltip(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    public final void setButtonOnClickToast(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.snackbar.Snackbar makeSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.snackbar.Snackbar makeSnackbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast showToastOverView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.balloon.Balloon showTooltip(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.view.View anchor, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, boolean aboveOrBelow, boolean autoDismiss, int arrowAnchorPadding, int topOrBottomMargin, boolean showDismissButton) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.balloon.Balloon showTooltip(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.view.View anchor, @androidx.annotation.LayoutRes()
    int layoutRes, int arrowAnchorPadding, int topOrBottomMargin, boolean aboveOrBelow, boolean autoDismiss) {
        return null;
    }
    
    private final com.skydoves.balloon.Balloon showTooltip(android.app.Activity activity, com.skydoves.balloon.Balloon balloon, android.view.View anchor, boolean aboveOrBelow, boolean autoDismiss) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.balloon.Balloon getTooltip(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, boolean autoDismiss, int arrowAnchorPadding, int topOrBottomMargin, boolean aboveOrBelow, boolean showDismissButton, @androidx.annotation.StringRes()
    int dismissButtonText, int countNum, int countTotal) {
        return null;
    }
    
    private final com.skydoves.balloon.Balloon getTooltip(android.content.Context context, @androidx.annotation.LayoutRes()
    int layoutRes, int arrowAnchorPadding, int topOrBottomMargin, boolean aboveOrBelow, boolean autoDismiss) {
        return null;
    }
    
    private final android.view.View findBestView(android.app.Activity activity) {
        return null;
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetDialogFragment getTopmostBottomSheetFragment(android.app.Activity activity) {
        return null;
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetDialogFragment getTopmostBottomSheetFragment(androidx.fragment.app.Fragment fragment) {
        return null;
    }
}