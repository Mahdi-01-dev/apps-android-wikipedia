package org.wikipedia.talk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.suggestededits.SuggestedEditsRecentEditsActivity;
import org.wikipedia.suggestededits.SuggestionsActivity;
import org.wikipedia.usercontrib.UserContribListActivity;
import org.wikipedia.usercontrib.UserInformationDialog;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Ji\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J/\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010\u001fJ]\u0010 \u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0002\u0010!Jo\u0010 \u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010$J(\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/talk/UserTalkPopupHelper;", "", "()V", "getPopupHelper", "Landroidx/appcompat/view/menu/MenuPopupHelper;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "title", "Lorg/wikipedia/page/PageTitle;", "anon", "", "anchorView", "Landroid/view/View;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "historySource", "", "showContribs", "showUserInfo", "revisionId", "", "pageId", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/page/PageTitle;ZLandroid/view/View;Lorg/wikipedia/Constants$InvokeSource;IZZLjava/lang/Long;Ljava/lang/Integer;)Landroidx/appcompat/view/menu/MenuPopupHelper;", "sendPatrollerExperienceEvent", "", "Landroid/app/Activity;", "action", "", "sendThanks", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/Long;Lorg/wikipedia/page/PageTitle;)V", "show", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/page/PageTitle;ZLandroid/view/View;Lorg/wikipedia/Constants$InvokeSource;ILjava/lang/Long;Ljava/lang/Integer;Z)V", "x", "y", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/page/PageTitle;ZIILorg/wikipedia/Constants$InvokeSource;IZZLjava/lang/Long;Ljava/lang/Integer;)V", "showThankDialog", "app.lib"})
@android.annotation.SuppressLint(value = {"RestrictedApi"})
public final class UserTalkPopupHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.UserTalkPopupHelper INSTANCE = null;
    
    private UserTalkPopupHelper() {
        super();
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean anon, @org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource, int historySource, @org.jetbrains.annotations.Nullable()
    java.lang.Long revisionId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageId, boolean showUserInfo) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean anon, int x, int y, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource, int historySource, boolean showContribs, boolean showUserInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Long revisionId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageId) {
    }
    
    private final void showThankDialog(androidx.appcompat.app.AppCompatActivity activity, org.wikipedia.page.PageTitle title, long revisionId, int pageId) {
    }
    
    private final void sendThanks(androidx.appcompat.app.AppCompatActivity activity, org.wikipedia.dataclient.WikiSite wikiSite, java.lang.Long revisionId, org.wikipedia.page.PageTitle title) {
    }
    
    private final androidx.appcompat.view.menu.MenuPopupHelper getPopupHelper(androidx.appcompat.app.AppCompatActivity activity, org.wikipedia.page.PageTitle title, boolean anon, android.view.View anchorView, org.wikipedia.Constants.InvokeSource invokeSource, int historySource, boolean showContribs, boolean showUserInfo, java.lang.Long revisionId, java.lang.Integer pageId) {
        return null;
    }
    
    private final void sendPatrollerExperienceEvent(android.app.Activity activity, java.lang.String action) {
    }
}