package org.wikipedia.page;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ActionProvider;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import org.wikipedia.BackPressedHandler;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.LongPressHandler;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.eventplatform.ArticleFindInPageInteractionEvent;
import org.wikipedia.analytics.eventplatform.ArticleInteractionEvent;
import org.wikipedia.analytics.eventplatform.DonorExperienceEvent;
import org.wikipedia.analytics.eventplatform.EventPlatformClient;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.analytics.eventplatform.WatchlistAnalyticsHelper;
import org.wikipedia.analytics.metricsplatform.ArticleFindInPageInteraction;
import org.wikipedia.analytics.metricsplatform.ArticleToolbarInteraction;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.bridge.CommunicationBridge;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.categories.CategoryActivity;
import org.wikipedia.categories.CategoryDialog;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.databinding.FragmentPageBinding;
import org.wikipedia.databinding.GroupFindReferencesInPageBinding;
import org.wikipedia.dataclient.RestService;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.donate.CampaignCollection;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.okhttp.HttpStatusException;
import org.wikipedia.dataclient.okhttp.OkHttpWebViewClient;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.diff.ArticleEditDetailsActivity;
import org.wikipedia.edit.EditHandler;
import org.wikipedia.gallery.GalleryActivity;
import org.wikipedia.games.onthisday.OnThisDayGameMainMenuFragment;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.main.MainActivity;
import org.wikipedia.media.AvPlayer;
import org.wikipedia.navtab.NavTab;
import org.wikipedia.notifications.PollNotificationWorker;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.page.campaign.CampaignDialog;
import org.wikipedia.page.edithistory.EditHistoryListActivity;
import org.wikipedia.page.issues.PageIssuesDialog;
import org.wikipedia.page.leadimages.LeadImagesHandler;
import org.wikipedia.page.references.PageReferences;
import org.wikipedia.page.references.ReferenceDialog;
import org.wikipedia.page.shareafact.ShareHandler;
import org.wikipedia.page.tabs.Tab;
import org.wikipedia.places.PlacesActivity;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.settings.Prefs;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.talk.TalkTopicsActivity;
import org.wikipedia.theme.ThemeChooserDialog;
import org.wikipedia.util.ActiveTimer;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.ThrowableUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.ObservableWebView;
import org.wikipedia.views.PageActionOverflowView;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.watchlist.WatchlistExpiry;
import org.wikipedia.watchlist.WatchlistExpiryDialog;
import org.wikipedia.watchlist.WatchlistViewModel;
import org.wikipedia.wiktionary.WiktionaryDialog;
import java.time.Duration;
import java.time.Instant;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0082\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\f\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002B\u0005\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u001bH\u0002J\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001J\n\u0010\u0091\u0001\u001a\u00030\u008d\u0001H\u0002J\u0016\u0010\u0092\u0001\u001a\u00030\u008d\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0002J\n\u0010\u0095\u0001\u001a\u00030\u008d\u0001H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020}2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0002J\b\u0010\u0099\u0001\u001a\u00030\u008d\u0001J\u001b\u0010\u009a\u0001\u001a\u00030\u008d\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u000207J\u0014\u0010\u009e\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u008d\u0001H\u0002J\n\u0010\u00a0\u0001\u001a\u00030\u008d\u0001H\u0002J\u001c\u0010\u00a1\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J9\u0010\u00a1\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0007\u0010\u00a4\u0001\u001a\u0002002\u0007\u0010\u00a5\u0001\u001a\u0002002\t\b\u0002\u0010\u00a6\u0001\u001a\u000200J9\u0010\u00a1\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0007\u0010\u00a4\u0001\u001a\u0002002\u0007\u0010\u00a7\u0001\u001a\u00020\u001b2\t\b\u0002\u0010\u00a6\u0001\u001a\u000200J\n\u0010\u00a8\u0001\u001a\u00030\u008d\u0001H\u0002J\u0012\u0010\u00a9\u0001\u001a\u00030\u008d\u00012\b\u0010\u00aa\u0001\u001a\u00030\u00ab\u0001J\t\u0010\u00ac\u0001\u001a\u000200H\u0016J\n\u0010\u00ad\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010\u00ae\u0001\u001a\u00030\u008d\u00012\b\u0010\u00af\u0001\u001a\u00030\u00b0\u0001H\u0016J,\u0010\u00b1\u0001\u001a\u00030\u00b2\u00012\b\u0010\u00b3\u0001\u001a\u00030\u00b4\u00012\n\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u00b6\u00012\n\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b8\u0001H\u0016J\n\u0010\u00b9\u0001\u001a\u00030\u008d\u0001H\u0016J\n\u0010\u00ba\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010\u00bb\u0001\u001a\u00030\u008d\u00012\b\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001H\u0016J\u0012\u0010\u00be\u0001\u001a\u00030\u008d\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0015\u0010\u00bf\u0001\u001a\u00030\u008d\u00012\u000b\b\u0002\u0010\u00c0\u0001\u001a\u0004\u0018\u000107J\n\u0010\u00c1\u0001\u001a\u00030\u008d\u0001H\u0002J\n\u0010\u00c2\u0001\u001a\u00030\u008d\u0001H\u0016J1\u0010\u00c3\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00c4\u0001\u001a\u00020\u001b2\t\u0010\u00c5\u0001\u001a\u0004\u0018\u0001072\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\t\u0010\u00c6\u0001\u001a\u0004\u0018\u000107J\n\u0010\u00c7\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010\u00c8\u0001\u001a\u00030\u008d\u00012\b\u0010\u00c9\u0001\u001a\u00030\u00b8\u0001H\u0016J\n\u0010\u00ca\u0001\u001a\u00030\u008d\u0001H\u0016J\n\u0010\u00cb\u0001\u001a\u00030\u008d\u0001H\u0016J \u0010\u00cc\u0001\u001a\u00030\u008d\u00012\b\u0010\u00cd\u0001\u001a\u00030\u00b2\u00012\n\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b8\u0001H\u0016J\u001c\u0010\u00ce\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J\u001c\u0010\u00cf\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J\u001c\u0010\u00d0\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J\'\u0010\u00d1\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0007\u0010\u00d2\u0001\u001a\u00020\u001bH\u0002J\u0013\u0010\u00d3\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010\u00a7\u0001\u001a\u00020\u001bJ\u0013\u0010\u00d4\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010\u00d5\u0001\u001a\u000200J\u0013\u0010\u00d6\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00c5\u0001\u001a\u000207H\u0002J\u0013\u0010\u00d7\u0001\u001a\u00020\u001b2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J\u0013\u0010\u00d8\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00d2\u0001\u001a\u00020\u001bH\u0002J\n\u0010\u00d9\u0001\u001a\u00030\u008d\u0001H\u0002J\b\u0010\u00da\u0001\u001a\u00030\u008d\u0001J\u0013\u0010\u00db\u0001\u001a\u0002002\b\u0010\u00dc\u0001\u001a\u00030\u00dd\u0001H\u0002J\b\u0010\u00de\u0001\u001a\u00030\u008d\u0001J\u0012\u0010\u00df\u0001\u001a\u00030\u008d\u00012\b\u0010\u00e0\u0001\u001a\u00030\u00e1\u0001J\b\u0010\u00e2\u0001\u001a\u00030\u008d\u0001J-\u0010\u00e3\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00e4\u0001\u001a\u0002072\u000f\u0010\u00e5\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\\2\u0007\u0010\u00e6\u0001\u001a\u000207H\u0002J\u0012\u0010\u00e7\u0001\u001a\u00030\u008d\u00012\b\u0010\u00e8\u0001\u001a\u00030\u00b2\u0001J\u001f\u0010\u00e9\u0001\u001a\u00030\u008d\u00012\t\u0010\u00ea\u0001\u001a\u0004\u0018\u0001072\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001H\u0002J\u0013\u0010\u00ed\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00ee\u0001\u001a\u000207H\u0002J\n\u0010\u00ef\u0001\u001a\u00030\u008d\u0001H\u0002J\u0012\u0010\u00f0\u0001\u001a\u00030\u008d\u00012\b\u0010\u00f1\u0001\u001a\u00030\u00f2\u0001J\u001f\u0010\u00f3\u0001\u001a\u00030\u008d\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\t\b\u0002\u0010\u00f4\u0001\u001a\u000200H\u0002J\n\u0010\u00f5\u0001\u001a\u00030\u008d\u0001H\u0002J\b\u0010\u00f6\u0001\u001a\u00030\u008d\u0001J\b\u0010\u00f7\u0001\u001a\u00030\u008d\u0001J\u0013\u0010\u00f8\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00f9\u0001\u001a\u000200H\u0002J\b\u0010\u00fa\u0001\u001a\u00030\u008d\u0001J\b\u0010\u00fb\u0001\u001a\u00030\u008d\u0001J\u0012\u0010\u00fc\u0001\u001a\u00030\u008d\u00012\b\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001J\u001d\u0010\u00fd\u0001\u001a\u00030\u008d\u00012\t\u0010\u00ea\u0001\u001a\u0004\u0018\u0001072\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001J\u0013\u0010\u00fe\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00ff\u0001\u001a\u000207H\u0016R\u0010\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u001dR\u0011\u00103\u001a\u0002008F\u00a2\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00104R\u0013\u00106\u001a\u0004\u0018\u0001078F\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u000e\u0010:\u001a\u00020;X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u00020=X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020CX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020IX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0013\u0010N\u001a\u0004\u0018\u00010O8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010R\u001a\u00060SR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010[\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0012\u0010f\u001a\u00060gR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010i\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010jX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010l\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bm\u0010\u001dR\u001a\u0010n\u001a\u00020oX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010t\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bu\u00104R\u001a\u0010v\u001a\u00020wX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020}8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018F\u00a2\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u001dR \u0010\u0086\u0001\u001a\u00030\u0087\u0001X\u0096.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001\u00a8\u0006\u0086\u0002"}, d2 = {"Lorg/wikipedia/page/PageFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "Lorg/wikipedia/bridge/CommunicationBridge$CommunicationBridgeListener;", "Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "Lorg/wikipedia/page/references/ReferenceDialog$Callback;", "Lorg/wikipedia/wiktionary/WiktionaryDialog$Callback;", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "activeTimer", "Lorg/wikipedia/util/ActiveTimer;", "app", "Lorg/wikipedia/WikipediaApp;", "articleInteractionEvent", "Lorg/wikipedia/analytics/eventplatform/ArticleInteractionEvent;", "getArticleInteractionEvent$app_lib", "()Lorg/wikipedia/analytics/eventplatform/ArticleInteractionEvent;", "setArticleInteractionEvent$app_lib", "(Lorg/wikipedia/analytics/eventplatform/ArticleInteractionEvent;)V", "avCallback", "Lorg/wikipedia/page/PageFragment$AvCallback;", "avPlayer", "Lorg/wikipedia/media/AvPlayer;", "backgroundTabPosition", "", "getBackgroundTabPosition", "()I", "binding", "getBinding", "()Lerror/NonExistentClass;", "bottomBarHideHandler", "Lorg/wikipedia/page/ViewHideHandler;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "currentTab", "Lorg/wikipedia/page/tabs/Tab;", "getCurrentTab", "()Lorg/wikipedia/page/tabs/Tab;", "editHandler", "Lorg/wikipedia/edit/EditHandler;", "getEditHandler", "()Lorg/wikipedia/edit/EditHandler;", "setEditHandler", "(Lorg/wikipedia/edit/EditHandler;)V", "errorState", "", "foregroundTabPosition", "getForegroundTabPosition", "isLoading", "()Z", "isPreview", "leadImageEditLang", "", "getLeadImageEditLang", "()Ljava/lang/String;", "leadImagesHandler", "Lorg/wikipedia/page/leadimages/LeadImagesHandler;", "linkHandler", "Lorg/wikipedia/page/LinkHandler;", "getLinkHandler", "()Lorg/wikipedia/page/LinkHandler;", "setLinkHandler", "(Lorg/wikipedia/page/LinkHandler;)V", "metricsPlatformArticleEventToolbarInteraction", "Lorg/wikipedia/analytics/metricsplatform/ArticleToolbarInteraction;", "getMetricsPlatformArticleEventToolbarInteraction$app_lib", "()Lorg/wikipedia/analytics/metricsplatform/ArticleToolbarInteraction;", "setMetricsPlatformArticleEventToolbarInteraction$app_lib", "(Lorg/wikipedia/analytics/metricsplatform/ArticleToolbarInteraction;)V", "model", "Lorg/wikipedia/page/PageViewModel;", "getModel", "()Lorg/wikipedia/page/PageViewModel;", "setModel", "(Lorg/wikipedia/page/PageViewModel;)V", "page", "Lorg/wikipedia/page/Page;", "getPage", "()Lorg/wikipedia/page/Page;", "pageActionItemCallback", "Lorg/wikipedia/page/PageFragment$PageActionItemCallback;", "pageFragmentLoadState", "Lorg/wikipedia/page/PageFragmentLoadState;", "pageRefreshListener", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "pageRefreshed", "references", "Lorg/wikipedia/page/references/PageReferences;", "referencesGroup", "", "Lorg/wikipedia/page/references/PageReferences$Reference;", "getReferencesGroup", "()Ljava/util/List;", "revision", "", "getRevision", "()J", "setRevision", "(J)V", "scrollTriggerListener", "Lorg/wikipedia/page/PageFragment$WebViewScrollTriggerListener;", "scrolledUpForThemeChange", "sections", "", "Lorg/wikipedia/page/Section;", "selectedReferenceIndex", "getSelectedReferenceIndex", "shareHandler", "Lorg/wikipedia/page/shareafact/ShareHandler;", "getShareHandler", "()Lorg/wikipedia/page/shareafact/ShareHandler;", "setShareHandler", "(Lorg/wikipedia/page/shareafact/ShareHandler;)V", "shouldCreateNewTab", "getShouldCreateNewTab", "sidePanelHandler", "Lorg/wikipedia/page/SidePanelHandler;", "getSidePanelHandler", "()Lorg/wikipedia/page/SidePanelHandler;", "setSidePanelHandler", "(Lorg/wikipedia/page/SidePanelHandler;)V", "tabLayoutOffsetParams", "Landroid/widget/LinearLayout$LayoutParams;", "getTabLayoutOffsetParams", "()Landroid/widget/LinearLayout$LayoutParams;", "title", "Lorg/wikipedia/page/PageTitle;", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "toolbarMargin", "getToolbarMargin", "webView", "Lorg/wikipedia/views/ObservableWebView;", "getWebView", "()Lorg/wikipedia/views/ObservableWebView;", "setWebView", "(Lorg/wikipedia/views/ObservableWebView;)V", "addTimeSpentReading", "", "timeSpentSec", "callback", "Lorg/wikipedia/page/PageFragment$Callback;", "clearActivityActionBarTitle", "disableActionTabs", "caught", "", "dismissBottomSheet", "getContentTopOffsetParams", "context", "Landroid/content/Context;", "goForward", "goToMainActivity", "tab", "Lorg/wikipedia/navtab/NavTab;", "tabExtra", "handleInternalLink", "hidePageContent", "initWebViewListeners", "loadPage", "entry", "Lorg/wikipedia/history/HistoryEntry;", "pushBackStack", "squashBackstack", "isRefresh", "stagedScrollY", "maybeShowAnnouncement", "onActionModeShown", "mode", "Landroid/view/ActionMode;", "onBackPressed", "onCancelThemeChooser", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onEditingPrefsChanged", "onExpiryChanged", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onPageLoadError", "onPageMetadataLoaded", "redirectedFrom", "onPageSetupEvent", "onPause", "onRequestEditSection", "sectionId", "sectionAnchor", "highlightText", "onResume", "onSaveInstanceState", "outState", "onToggleDimImages", "onToggleReadingFocusMode", "onViewCreated", "view", "openFromExistingTab", "openInNewBackgroundTab", "openInNewForegroundTab", "openInNewTab", "position", "refreshPage", "reloadFromBackstack", "forceReload", "scrollToSection", "selectedTabPosition", "setCurrentTabAndReset", "setupMessageHandlers", "sharePageLink", "shouldLoadFromBackstack", "activity", "Landroid/app/Activity;", "showAnonNotification", "showBottomSheet", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "showFindInPage", "showFindReferenceInPage", "referenceAnchor", "backLinksList", "referenceText", "showOverflowMenu", "anchor", "startDescriptionEditActivity", "text", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "startGalleryActivity", "fileName", "startLangLinksActivity", "startSupportActionMode", "actionModeCallback", "Landroid/view/ActionMode$Callback;", "startTalkTopicsActivity", "stripUrlFragment", "trimTabCount", "updateBookmarkAndMenuOptionsFromDao", "updateFontSize", "updateProgressBar", "visible", "updateQuickActionsAndMenuOptions", "updateWatchlist", "updateWatchlistExpiry", "verifyBeforeEditingDescription", "wiktionaryShowDialogForTerm", "term", "AvCallback", "Callback", "Companion", "FindReferenceInPageActionProvider", "PageActionItemCallback", "WebViewScrollTriggerListener", "app.lib"})
public final class PageFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler, org.wikipedia.bridge.CommunicationBridge.CommunicationBridgeListener, org.wikipedia.theme.ThemeChooserDialog.Callback, org.wikipedia.page.references.ReferenceDialog.Callback, org.wikipedia.wiktionary.WiktionaryDialog.Callback, org.wikipedia.watchlist.WatchlistExpiryDialog.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentPageBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.ActiveTimer activeTimer = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment.WebViewScrollTriggerListener scrollTriggerListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener pageRefreshListener = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment.PageActionItemCallback pageActionItemCallback = null;
    private org.wikipedia.bridge.CommunicationBridge bridge;
    private org.wikipedia.page.leadimages.LeadImagesHandler leadImagesHandler;
    private org.wikipedia.page.PageFragmentLoadState pageFragmentLoadState;
    private org.wikipedia.page.ViewHideHandler bottomBarHideHandler;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.eventplatform.ArticleInteractionEvent articleInteractionEvent;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.analytics.metricsplatform.ArticleToolbarInteraction metricsPlatformArticleEventToolbarInteraction;
    private boolean pageRefreshed = false;
    private boolean errorState = false;
    private boolean scrolledUpForThemeChange = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.references.PageReferences references;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.media.AvPlayer avPlayer;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageFragment.AvCallback avCallback;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<org.wikipedia.page.Section> sections;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.WikipediaApp app;
    public org.wikipedia.page.LinkHandler linkHandler;
    public org.wikipedia.views.ObservableWebView webView;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageViewModel model;
    public org.wikipedia.page.SidePanelHandler sidePanelHandler;
    public org.wikipedia.page.shareafact.ShareHandler shareHandler;
    public org.wikipedia.edit.EditHandler editHandler;
    private long revision = 0L;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_THEME_CHANGE_SCROLLED = "themeChangeScrolled";
    private static final int REFRESH_SPINNER_ADDITIONAL_OFFSET = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageFragment.Companion Companion = null;
    
    public PageFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.analytics.eventplatform.ArticleInteractionEvent getArticleInteractionEvent$app_lib() {
        return null;
    }
    
    public final void setArticleInteractionEvent$app_lib(@org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.ArticleInteractionEvent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.metricsplatform.ArticleToolbarInteraction getMetricsPlatformArticleEventToolbarInteraction$app_lib() {
        return null;
    }
    
    public final void setMetricsPlatformArticleEventToolbarInteraction$app_lib(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.metricsplatform.ArticleToolbarInteraction p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.page.LinkHandler getLinkHandler() {
        return null;
    }
    
    public void setLinkHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.LinkHandler p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.views.ObservableWebView getWebView() {
        return null;
    }
    
    public void setWebView(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.page.PageViewModel getModel() {
        return null;
    }
    
    public void setModel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel p0) {
    }
    
    @java.lang.Override()
    public int getToolbarMargin() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isPreview() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.util.List<org.wikipedia.page.references.PageReferences.Reference> getReferencesGroup() {
        return null;
    }
    
    @java.lang.Override()
    public int getSelectedReferenceIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.SidePanelHandler getSidePanelHandler() {
        return null;
    }
    
    public final void setSidePanelHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.SidePanelHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.shareafact.ShareHandler getShareHandler() {
        return null;
    }
    
    public final void setShareHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.shareafact.ShareHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.EditHandler getEditHandler() {
        return null;
    }
    
    public final void setEditHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.EditHandler p0) {
    }
    
    public final long getRevision() {
        return 0L;
    }
    
    public final void setRevision(long p0) {
    }
    
    private final boolean getShouldCreateNewTab() {
        return false;
    }
    
    private final int getBackgroundTabPosition() {
        return 0;
    }
    
    private final int getForegroundTabPosition() {
        return 0;
    }
    
    private final android.widget.LinearLayout.LayoutParams getTabLayoutOffsetParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.tabs.Tab getCurrentTab() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.Page getPage() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeadImageEditLang() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onToggleDimImages() {
    }
    
    @java.lang.Override()
    public void onToggleReadingFocusMode() {
    }
    
    @java.lang.Override()
    public void onCancelThemeChooser() {
    }
    
    @java.lang.Override()
    public void onEditingPrefsChanged() {
    }
    
    @java.lang.Override()
    public void wiktionaryShowDialogForTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term) {
    }
    
    @java.lang.Override()
    public void onExpiryChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    private final boolean shouldLoadFromBackstack(android.app.Activity activity) {
        return false;
    }
    
    private final void initWebViewListeners() {
    }
    
    private final void onPageSetupEvent() {
    }
    
    private final void handleInternalLink(org.wikipedia.page.PageTitle title) {
    }
    
    private final void setCurrentTabAndReset(int position) {
    }
    
    private final int selectedTabPosition(org.wikipedia.page.PageTitle title) {
        return 0;
    }
    
    private final void openInNewTab(org.wikipedia.page.PageTitle title, org.wikipedia.history.HistoryEntry entry, int position) {
    }
    
    private final void dismissBottomSheet() {
    }
    
    private final void updateProgressBar(boolean visible) {
    }
    
    private final void startLangLinksActivity() {
    }
    
    private final void trimTabCount() {
    }
    
    private final void addTimeSpentReading(int timeSpentSec) {
    }
    
    private final android.widget.LinearLayout.LayoutParams getContentTopOffsetParams(android.content.Context context) {
        return null;
    }
    
    private final void disableActionTabs(java.lang.Throwable caught) {
    }
    
    private final void startTalkTopicsActivity(org.wikipedia.page.PageTitle title, boolean stripUrlFragment) {
    }
    
    private final void startGalleryActivity(java.lang.String fileName) {
    }
    
    private final void hidePageContent() {
    }
    
    public final void updateWatchlistExpiry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    private final void maybeShowAnnouncement() {
    }
    
    private final void showFindReferenceInPage(java.lang.String referenceAnchor, java.util.List<java.lang.String> backLinksList, java.lang.String referenceText) {
    }
    
    private final void setupMessageHandlers() {
    }
    
    public final void reloadFromBackstack(boolean forceReload) {
    }
    
    public final void onPageMetadataLoaded(@org.jetbrains.annotations.Nullable()
    java.lang.String redirectedFrom) {
    }
    
    public final void openInNewBackgroundTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void openInNewForegroundTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void openFromExistingTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void loadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean pushBackStack, boolean squashBackstack, boolean isRefresh) {
    }
    
    public final void loadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean pushBackStack, int stagedScrollY, boolean isRefresh) {
    }
    
    public final void updateFontSize() {
    }
    
    public final void updateQuickActionsAndMenuOptions() {
    }
    
    public final void updateBookmarkAndMenuOptionsFromDao() {
    }
    
    public final void onActionModeShown(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    public final void onRequestEditSection(int sectionId, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionAnchor, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
    java.lang.String highlightText) {
    }
    
    public final void sharePageLink() {
    }
    
    public final void showFindInPage() {
    }
    
    private final void scrollToSection(java.lang.String sectionAnchor) {
    }
    
    public final void onPageLoadError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable caught) {
    }
    
    public final void refreshPage(int stagedScrollY) {
    }
    
    private final void clearActivityActionBarTitle() {
    }
    
    public final void verifyBeforeEditingDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    private final void startDescriptionEditActivity(java.lang.String text, org.wikipedia.Constants.InvokeSource invokeSource) {
    }
    
    public final void goForward() {
    }
    
    public final void showBottomSheet(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialogFragment dialog) {
    }
    
    public final void loadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void startSupportActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode.Callback actionModeCallback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageFragment.Callback callback() {
        return null;
    }
    
    public final void updateWatchlist() {
    }
    
    public final void showAnonNotification() {
    }
    
    public final void showOverflowMenu(@org.jetbrains.annotations.NotNull()
    android.view.View anchor) {
    }
    
    public final void goToMainActivity(@org.jetbrains.annotations.NotNull()
    org.wikipedia.navtab.NavTab tab, @org.jetbrains.annotations.NotNull()
    java.lang.String tabExtra) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/PageFragment$AvCallback;", "Lorg/wikipedia/media/AvPlayer$Callback;", "(Lorg/wikipedia/page/PageFragment;)V", "onError", "", "code", "", "extra", "onSuccess", "app.lib"})
    final class AvCallback implements org.wikipedia.media.AvPlayer.Callback {
        
        public AvCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
        
        @java.lang.Override()
        public void onError(int code, int extra) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J>\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H&J,\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0019H&J:\u0010$\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020)H&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020+H&J\u0010\u00102\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u000205H&J\u0010\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020+H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&\u00a8\u0006;"}, d2 = {"Lorg/wikipedia/page/PageFragment$Callback;", "", "onPageCloseActionMode", "", "onPageDismissBottomSheet", "onPageHideSoftKeyboard", "onPageInitWebView", "v", "Lorg/wikipedia/views/ObservableWebView;", "onPageLoadComplete", "onPageLoadError", "title", "Lorg/wikipedia/page/PageTitle;", "onPageLoadErrorBackPressed", "onPageLoadMainPageInForegroundTab", "onPageLoadPage", "entry", "Lorg/wikipedia/history/HistoryEntry;", "onPageRequestAddImageTags", "mwQueryPage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "onPageRequestEditDescription", "text", "", "sourceSummary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "targetSummary", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "onPageRequestEditSection", "sectionId", "", "sectionAnchor", "highlightText", "onPageRequestGallery", "fileName", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "revision", "", "isLeadImage", "", "options", "Landroidx/core/app/ActivityOptionsCompat;", "onPageRequestLangLinks", "historyEntryId", "onPageSetToolbarElevationEnabled", "enabled", "onPageShowLinkPreview", "onPageStartSupportActionMode", "callback", "Landroid/view/ActionMode$Callback;", "onPageUpdateProgressBar", "visible", "onPageWatchlistExpirySelect", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onPageDismissBottomSheet();
        
        public abstract void onPageLoadComplete();
        
        public abstract void onPageLoadPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onPageInitWebView(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.ObservableWebView v);
        
        public abstract void onPageShowLinkPreview(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onPageLoadMainPageInForegroundTab();
        
        public abstract void onPageUpdateProgressBar(boolean visible);
        
        public abstract void onPageStartSupportActionMode(@org.jetbrains.annotations.NotNull()
        android.view.ActionMode.Callback callback);
        
        public abstract void onPageHideSoftKeyboard();
        
        public abstract void onPageWatchlistExpirySelect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry);
        
        public abstract void onPageLoadError(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title);
        
        public abstract void onPageLoadErrorBackPressed();
        
        public abstract void onPageSetToolbarElevationEnabled(boolean enabled);
        
        public abstract void onPageCloseActionMode();
        
        public abstract void onPageRequestEditSection(int sectionId, @org.jetbrains.annotations.Nullable()
        java.lang.String sectionAnchor, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
        java.lang.String highlightText);
        
        public abstract void onPageRequestLangLinks(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, long historyEntryId);
        
        public abstract void onPageRequestGallery(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, long revision, boolean isLeadImage, @org.jetbrains.annotations.Nullable()
        androidx.core.app.ActivityOptionsCompat options);
        
        public abstract void onPageRequestAddImageTags(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage mwQueryPage, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource);
        
        public abstract void onPageRequestEditDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary, @org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.PageSummaryForEdit targetSummary, @org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/PageFragment$Companion;", "", "()V", "ARG_THEME_CHANGE_SCROLLED", "", "REFRESH_SPINNER_ADDITIONAL_OFFSET", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/page/PageFragment$FindReferenceInPageActionProvider;", "Landroid/view/ActionProvider;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "referenceAnchor", "", "referenceText", "backLinksList", "", "(Lorg/wikipedia/page/PageFragment;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "currentPos", "", "onClick", "", "v", "Landroid/view/View;", "onCreateActionView", "overridesItemVisibility", "", "scrollTo", "position", "app.lib"})
    final class FindReferenceInPageActionProvider extends android.view.ActionProvider implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String referenceAnchor = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String referenceText = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> backLinksList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object binding = null;
        private int currentPos = 0;
        
        public FindReferenceInPageActionProvider(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String referenceAnchor, @org.jetbrains.annotations.NotNull()
        java.lang.String referenceText, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> backLinksList) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public android.view.View onCreateActionView() {
            return null;
        }
        
        @java.lang.Override()
        public boolean overridesItemVisibility() {
            return false;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        private final void scrollTo(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/page/PageFragment$PageActionItemCallback;", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "(Lorg/wikipedia/page/PageFragment;)V", "forwardClick", "", "onAddToWatchlistSelected", "onCategoriesSelected", "onContentsSelected", "onEditArticleSelected", "onExploreSelected", "onFindInArticleSelected", "onLanguageSelected", "onNewTabSelected", "onSaveSelected", "onShareSelected", "onThemeSelected", "onViewEditHistorySelected", "onViewOnMapSelected", "onViewTalkPageSelected", "app.lib"})
    public final class PageActionItemCallback implements org.wikipedia.page.action.PageActionItem.Callback {
        
        public PageActionItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSaveSelected() {
        }
        
        @java.lang.Override()
        public void onLanguageSelected() {
        }
        
        @java.lang.Override()
        public void onFindInArticleSelected() {
        }
        
        @java.lang.Override()
        public void onThemeSelected() {
        }
        
        @java.lang.Override()
        public void onContentsSelected() {
        }
        
        @java.lang.Override()
        public void onShareSelected() {
        }
        
        @java.lang.Override()
        public void onAddToWatchlistSelected() {
        }
        
        @java.lang.Override()
        public void onViewTalkPageSelected() {
        }
        
        @java.lang.Override()
        public void onViewEditHistorySelected() {
        }
        
        @java.lang.Override()
        public void onNewTabSelected() {
        }
        
        @java.lang.Override()
        public void onExploreSelected() {
        }
        
        @java.lang.Override()
        public void onCategoriesSelected() {
        }
        
        @java.lang.Override()
        public void onEditArticleSelected() {
        }
        
        @java.lang.Override()
        public void onViewOnMapSelected() {
        }
        
        @java.lang.Override()
        public void forwardClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/PageFragment$WebViewScrollTriggerListener;", "Lorg/wikipedia/views/ObservableWebView$OnContentHeightChangedListener;", "(Lorg/wikipedia/page/PageFragment;)V", "stagedScrollY", "", "getStagedScrollY", "()I", "setStagedScrollY", "(I)V", "onContentHeightChanged", "", "contentHeight", "app.lib"})
    final class WebViewScrollTriggerListener implements org.wikipedia.views.ObservableWebView.OnContentHeightChangedListener {
        private int stagedScrollY = 0;
        
        public WebViewScrollTriggerListener() {
            super();
        }
        
        public final int getStagedScrollY() {
            return 0;
        }
        
        public final void setStagedScrollY(int p0) {
        }
        
        @java.lang.Override()
        public void onContentHeightChanged(int contentHeight) {
        }
    }
}