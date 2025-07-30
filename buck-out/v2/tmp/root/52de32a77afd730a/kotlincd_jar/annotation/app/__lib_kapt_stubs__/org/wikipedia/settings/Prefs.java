package org.wikipedia.settings;

import android.location.Location;
import okhttp3.Cookie;
import okhttp3.logging.HttpLoggingInterceptor;
import org.wikipedia.BuildConfig;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.analytics.SessionData;
import org.wikipedia.analytics.eventplatform.AppSessionEvent;
import org.wikipedia.analytics.eventplatform.StreamConfig;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.donate.DonationResult;
import org.wikipedia.games.onthisday.OnThisDayGameNotificationState;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.action.PageActionItem;
import org.wikipedia.page.tabs.Tab;
import org.wikipedia.readinglist.recommended.RecommendedReadingListSource;
import org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency;
import org.wikipedia.readinglist.recommended.SourceWithOffset;
import org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterTypes;
import org.wikipedia.util.StringUtil;
import org.wikipedia.watchlist.WatchlistFilterTypes;
import java.util.Date;

/**
 * Shared preferences utility for convenient POJO access.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c5\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0003\b\u00bf\u0001\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0089\u0004\u001a\u00030\u008a\u00042\r\u0010\u00aa\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aJ\u0017\u0010\u008b\u0004\u001a\u00030\u008a\u00042\r\u0010\u00aa\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aJ\u0018\u0010\u008c\u0004\u001a\u00030\u008a\u00042\u000e\u0010\u00aa\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ea\u00020\u001aJ\u0010\u0010\u008d\u0004\u001a\u00020\u000f2\u0007\u0010\u008e\u0004\u001a\u00020\u000bJ\b\u0010\u008f\u0004\u001a\u00030\u008a\u0004J\u0010\u0010\u0090\u0004\u001a\u00020\u00132\u0007\u0010\u0091\u0004\u001a\u00020\u000bJ\u0012\u0010\u0092\u0004\u001a\u00020\u000b2\u0007\u0010\u0091\u0004\u001a\u00020\u000bH\u0002J\u0010\u0010\u0093\u0004\u001a\u00020\u00042\u0007\u0010\u0094\u0004\u001a\u00020\u0004J\u0010\u0010\u0095\u0004\u001a\u00020\u00042\u0007\u0010\u0094\u0004\u001a\u00020\u0004J\b\u0010\u0096\u0004\u001a\u00030\u008a\u0004J\b\u0010\u0097\u0004\u001a\u00030\u008a\u0004J\u0007\u0010\u0098\u0004\u001a\u00020\u000fJ\b\u0010\u0099\u0004\u001a\u00030\u008a\u0004J\b\u0010\u009a\u0004\u001a\u00030\u008a\u0004J\b\u0010\u009b\u0004\u001a\u00030\u008a\u0004J\u0011\u0010\u009c\u0004\u001a\u00030\u008a\u00042\u0007\u0010\u008e\u0004\u001a\u00020\u000bJ\u0019\u0010\u009d\u0004\u001a\u00030\u008a\u00042\u0007\u0010\u0091\u0004\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u009e\u0004\u001a\u00030\u008a\u00042\u0007\u0010\u009f\u0004\u001a\u00020\u0004J\u0011\u0010\u00a0\u0004\u001a\u00030\u008a\u00042\u0007\u0010\u009f\u0004\u001a\u00020\u0004J\u0007\u0010\u00a1\u0004\u001a\u00020\u000fR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0007R(\u0010#\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\rR(\u0010*\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010&R0\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0-2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0011\"\u0004\b5\u00106RH\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09082\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09088F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR0\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040-2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u00100\"\u0004\bG\u00102R0\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040-2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R$\u0010K\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\u0011\"\u0004\bM\u00106R$\u0010N\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010\u0011\"\u0004\bP\u00106R0\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0-2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020Q0-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bS\u00100\"\u0004\bT\u00102R$\u0010U\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010\r\"\u0004\bW\u0010&R$\u0010X\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010\u0011\"\u0004\bZ\u00106R$\u0010[\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010\u0011\"\u0004\b]\u00106R$\u0010^\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010\u0011\"\u0004\b`\u00106R$\u0010a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bb\u0010\u0011\"\u0004\bc\u00106R$\u0010e\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bf\u0010\u0007\"\u0004\bg\u0010\tR\u0011\u0010h\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\bi\u0010\rR(\u0010k\u001a\u0004\u0018\u00010\u000b2\b\u0010j\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bl\u0010\r\"\u0004\bm\u0010&R\u0011\u0010n\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\bo\u0010\u0007R0\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000f0-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\br\u00100\"\u0004\bs\u00102RH\u0010u\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0-082\u0018\u0010t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0-088F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bv\u0010=\"\u0004\bw\u0010?RH\u0010y\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0-082\u0018\u0010x\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0-088F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bz\u0010=\"\u0004\b{\u0010?R0\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00040-2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b}\u00100\"\u0004\b~\u00102R&\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010\r\"\u0005\b\u0081\u0001\u0010&R\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\rR\'\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010\u0011\"\u0005\b\u0086\u0001\u00106R\u0013\u0010\u0087\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0011R\'\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010\u0011\"\u0005\b\u008b\u0001\u00106R4\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\r\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010\u001d\"\u0005\b\u008f\u0001\u0010\u001fR\u0013\u0010\u0090\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u0011R\u0013\u0010\u0092\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u0011R\'\u0010\u0094\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0095\u0001\u0010\u0011\"\u0005\b\u0096\u0001\u00106R\'\u0010\u0097\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010\u0011\"\u0005\b\u0099\u0001\u00106R(\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u009a\u0001\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010\u0007\"\u0005\b\u009d\u0001\u0010\tR\u0013\u0010\u009e\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0011R(\u0010\u00a0\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a0\u0001\u0010\u0011\"\u0005\b\u00a1\u0001\u00106R\'\u0010\u00a2\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a2\u0001\u0010\u0011\"\u0005\b\u00a3\u0001\u00106R\u0013\u0010\u00a4\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00a4\u0001\u0010\u0011R\u0013\u0010\u00a5\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00a5\u0001\u0010\u0011R\'\u0010\u00a6\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a6\u0001\u0010\u0011\"\u0005\b\u00a7\u0001\u00106R\u0013\u0010\u00a8\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00a8\u0001\u0010\u0011R(\u0010\u00a9\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a9\u0001\u0010\u0011\"\u0005\b\u00aa\u0001\u00106R\u0013\u0010\u00ab\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00ab\u0001\u0010\u0011R\u0013\u0010\u00ac\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00ac\u0001\u0010\u0011R\'\u0010\u00ad\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ad\u0001\u0010\u0011\"\u0005\b\u00ae\u0001\u00106R\'\u0010\u00af\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00af\u0001\u0010\u0011\"\u0005\b\u00b0\u0001\u00106R\'\u0010\u00b1\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b1\u0001\u0010\u0011\"\u0005\b\u00b2\u0001\u00106R(\u0010\u00b4\u0001\u001a\u00020\u000f2\u0007\u0010\u00b3\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b4\u0001\u0010\u0011\"\u0005\b\u00b5\u0001\u00106R(\u0010\u00b6\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b6\u0001\u0010\u0011\"\u0005\b\u00b7\u0001\u00106R(\u0010\u00b8\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b8\u0001\u0010\u0011\"\u0005\b\u00b9\u0001\u00106R(\u0010\u00ba\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ba\u0001\u0010\u0011\"\u0005\b\u00bb\u0001\u00106R\'\u0010\u00bc\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bc\u0001\u0010\u0011\"\u0005\b\u00bd\u0001\u00106R(\u0010\u00bf\u0001\u001a\u00020\u000f2\u0007\u0010\u00be\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bf\u0001\u0010\u0011\"\u0005\b\u00c0\u0001\u00106R(\u0010\u00c1\u0001\u001a\u00020\u000f2\u0007\u0010\u00be\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c1\u0001\u0010\u0011\"\u0005\b\u00c2\u0001\u00106R\'\u0010\u00c3\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c3\u0001\u0010\u0011\"\u0005\b\u00c4\u0001\u00106R\'\u0010\u00c5\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c5\u0001\u0010\u0011\"\u0005\b\u00c6\u0001\u00106R\'\u0010\u00c7\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c7\u0001\u0010\u0011\"\u0005\b\u00c8\u0001\u00106R(\u0010\u00c9\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c9\u0001\u0010\u0011\"\u0005\b\u00ca\u0001\u00106R(\u0010\u00cb\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00cb\u0001\u0010\u0011\"\u0005\b\u00cc\u0001\u00106R(\u0010\u00ce\u0001\u001a\u00020\u000f2\u0007\u0010\u00cd\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ce\u0001\u0010\u0011\"\u0005\b\u00cf\u0001\u00106R\u0013\u0010\u00d0\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00d0\u0001\u0010\u0011R\'\u0010\u00d1\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d1\u0001\u0010\u0011\"\u0005\b\u00d2\u0001\u00106R\'\u0010\u00d3\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d4\u0001\u0010\u0016\"\u0005\b\u00d5\u0001\u0010\u0018R+\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d7\u0001\u0010\r\"\u0005\b\u00d8\u0001\u0010&R\'\u0010\u00d9\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00da\u0001\u0010\u0016\"\u0005\b\u00db\u0001\u0010\u0018R+\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00dd\u0001\u0010\r\"\u0005\b\u00de\u0001\u0010&R\'\u0010\u00df\u0001\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e0\u0001\u0010\u0016\"\u0005\b\u00e1\u0001\u0010\u0018R\'\u0010\u00e2\u0001\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e3\u0001\u0010\r\"\u0005\b\u00e4\u0001\u0010&R,\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e7\u0001\u0010\r\"\u0005\b\u00e8\u0001\u0010&R\'\u0010\u00e9\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ea\u0001\u0010\u0011\"\u0005\b\u00eb\u0001\u00106R\'\u0010\u00ec\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ed\u0001\u0010\u0011\"\u0005\b\u00ee\u0001\u00106R\u0013\u0010\u00ef\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00f0\u0001\u0010\u0011R\u0013\u0010\u00f1\u0001\u001a\u00020\u000b8F\u00a2\u0006\u0007\u001a\u0005\b\u00f2\u0001\u0010\rR3\u0010\u00f3\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0-2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0-8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f4\u0001\u00100\"\u0005\b\u00f5\u0001\u00102R4\u0010\u00f7\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\r\u0010\u00f6\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f8\u0001\u0010\u001d\"\u0005\b\u00f9\u0001\u0010\u001fR4\u0010\u00fb\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\r\u0010\u00fa\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00fc\u0001\u0010\u001d\"\u0005\b\u00fd\u0001\u0010\u001fR(\u0010\u00ff\u0001\u001a\u00020\u00042\u0007\u0010\u00fe\u0001\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0080\u0002\u0010\u0007\"\u0005\b\u0081\u0002\u0010\tR\'\u0010\u0082\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0083\u0002\u0010\u0011\"\u0005\b\u0084\u0002\u00106R\'\u0010\u0085\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0086\u0002\u0010\u0011\"\u0005\b\u0087\u0002\u00106R\'\u0010\u0088\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0089\u0002\u0010\r\"\u0005\b\u008a\u0002\u0010&R\'\u0010\u008b\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008c\u0002\u0010\u0007\"\u0005\b\u008d\u0002\u0010\tR\'\u0010\u008e\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008f\u0002\u0010\r\"\u0005\b\u0090\u0002\u0010&R+\u0010\u0092\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u0003\u001a\u00030\u0091\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R\'\u0010\u0097\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0098\u0002\u0010\u0007\"\u0005\b\u0099\u0002\u0010\tR\u0013\u0010\u009a\u0002\u001a\u00020\u00048F\u00a2\u0006\u0007\u001a\u0005\b\u009b\u0002\u0010\u0007R\u0013\u0010\u009c\u0002\u001a\u00020\u00048F\u00a2\u0006\u0007\u001a\u0005\b\u009d\u0002\u0010\u0007R\'\u0010\u009e\u0002\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009f\u0002\u0010\u0016\"\u0005\b\u00a0\u0002\u0010\u0018R\'\u0010\u00a1\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a2\u0002\u0010\r\"\u0005\b\u00a3\u0002\u0010&R\'\u0010\u00a4\u0002\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a5\u0002\u0010\u0016\"\u0005\b\u00a6\u0002\u0010\u0018R\'\u0010\u00a7\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a8\u0002\u0010\r\"\u0005\b\u00a9\u0002\u0010&R,\u0010\u00ab\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010\u00aa\u0002\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ac\u0002\u0010\r\"\u0005\b\u00ad\u0002\u0010&RL\u0010\u00b2\u0002\u001a\u0013\u0012\u0005\u0012\u00030\u00b0\u0002\u0012\u0005\u0012\u00030\u00b1\u0002\u0018\u00010\u00af\u00022\u0018\u0010\u00ae\u0002\u001a\u0013\u0012\u0005\u0012\u00030\u00b0\u0002\u0012\u0005\u0012\u00030\u00b1\u0002\u0018\u00010\u00af\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00b3\u0002\u0010\u00b4\u0002\"\u0006\b\u00b5\u0002\u0010\u00b6\u0002R\'\u0010\u00b7\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b8\u0002\u0010\r\"\u0005\b\u00b9\u0002\u0010&R\'\u0010\u00ba\u0002\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bb\u0002\u0010\u0007\"\u0005\b\u00bc\u0002\u0010\tR(\u0010\u00be\u0002\u001a\u00020\u000b2\u0007\u0010\u00bd\u0002\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bf\u0002\u0010\r\"\u0005\b\u00c0\u0002\u0010&R(\u0010\u00c1\u0002\u001a\u00020\u000b2\u0007\u0010\u00bd\u0002\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c2\u0002\u0010\r\"\u0005\b\u00c3\u0002\u0010&R\'\u0010\u00c4\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c5\u0002\u0010\u0011\"\u0005\b\u00c6\u0002\u00106R4\u0010\u00c7\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\r\u0010\u00aa\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c8\u0002\u0010\u001d\"\u0005\b\u00c9\u0002\u0010\u001fR\'\u0010\u00ca\u0002\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00cb\u0002\u0010\u0016\"\u0005\b\u00cc\u0002\u0010\u0018R\'\u0010\u00cd\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ce\u0002\u0010\u0011\"\u0005\b\u00cf\u0002\u00106R4\u0010\u00d0\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\r\u0010\u00aa\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d1\u0002\u0010\u001d\"\u0005\b\u00d2\u0002\u0010\u001fR,\u0010\u00d4\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010\u00d3\u0002\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d5\u0002\u0010\r\"\u0005\b\u00d6\u0002\u0010&R(\u0010\u00d8\u0002\u001a\u00020\u00042\u0007\u0010\u00d7\u0002\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d9\u0002\u0010\u0007\"\u0005\b\u00da\u0002\u0010\tR+\u0010\u00db\u0002\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00dc\u0002\u0010\r\"\u0005\b\u00dd\u0002\u0010&R8\u0010\u00df\u0002\u001a\t\u0012\u0004\u0012\u00020\u000b0\u00de\u00022\u000e\u0010\u00f6\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u00de\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00e0\u0002\u0010\u00e1\u0002\"\u0006\b\u00e2\u0002\u0010\u00e3\u0002R\'\u0010\u00e4\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e5\u0002\u0010\u0011\"\u0005\b\u00e6\u0002\u00106R\'\u0010\u00e7\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e8\u0002\u0010\r\"\u0005\b\u00e9\u0002\u0010&R6\u0010\u00eb\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ea\u00020\u001a2\u000e\u0010\u00aa\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ea\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ec\u0002\u0010\u001d\"\u0005\b\u00ed\u0002\u0010\u001fR\'\u0010\u00ee\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ef\u0002\u0010\u0007\"\u0005\b\u00f0\u0002\u0010\tR6\u0010\u00f1\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ea\u00020-2\u000e\u0010\u00f6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ea\u00020-8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f2\u0002\u00100\"\u0005\b\u00f3\u0002\u00102R+\u0010\u00f5\u0002\u001a\u00030\u00f4\u00022\u0007\u0010\u0003\u001a\u00030\u00f4\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00f6\u0002\u0010\u00f7\u0002\"\u0006\b\u00f8\u0002\u0010\u00f9\u0002R6\u0010\u00fb\u0002\u001a\t\u0012\u0005\u0012\u00030\u00fa\u00020-2\u000e\u0010\u00f6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fa\u00020-8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00fc\u0002\u00100\"\u0005\b\u00fd\u0002\u00102R+\u0010\u00ff\u0002\u001a\u00030\u00fe\u00022\u0007\u0010\u0003\u001a\u00030\u00fe\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0080\u0003\u0010\u0081\u0003\"\u0006\b\u0082\u0003\u0010\u0083\u0003R(\u0010\u0085\u0003\u001a\u00020\u000b2\u0007\u0010\u0084\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0086\u0003\u0010\r\"\u0005\b\u0087\u0003\u0010&R(\u0010\u0089\u0003\u001a\u00020\u000b2\u0007\u0010\u0088\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008a\u0003\u0010\r\"\u0005\b\u008b\u0003\u0010&R\'\u0010\u008c\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008d\u0003\u0010\u0011\"\u0005\b\u008e\u0003\u00106R\u0013\u0010\u008f\u0003\u001a\u00020\u000b8F\u00a2\u0006\u0007\u001a\u0005\b\u0090\u0003\u0010\rR\u0015\u0010\u0091\u0003\u001a\u00030\u0092\u00038F\u00a2\u0006\b\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003R(\u0010\u0096\u0003\u001a\u00020\u00042\u0007\u0010\u0095\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0097\u0003\u0010\u0007\"\u0005\b\u0098\u0003\u0010\tR,\u0010\u009b\u0003\u001a\u00030\u009a\u00032\b\u0010\u0099\u0003\u001a\u00030\u009a\u00038F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u009c\u0003\u0010\u009d\u0003\"\u0006\b\u009e\u0003\u0010\u009f\u0003R\u0013\u0010\u00a0\u0003\u001a\u00020\u00048F\u00a2\u0006\u0007\u001a\u0005\b\u00a1\u0003\u0010\u0007R\'\u0010\u00a2\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a3\u0003\u0010\u0011\"\u0005\b\u00a4\u0003\u00106R\'\u0010\u00a5\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a6\u0003\u0010\u0011\"\u0005\b\u00a7\u0003\u00106R\'\u0010\u00a8\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a9\u0003\u0010\u0011\"\u0005\b\u00aa\u0003\u00106R\'\u0010\u00ab\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ac\u0003\u0010\u0011\"\u0005\b\u00ad\u0003\u00106R\'\u0010\u00ae\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00af\u0003\u0010\u0011\"\u0005\b\u00b0\u0003\u00106R\'\u0010\u00b1\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b2\u0003\u0010\u0011\"\u0005\b\u00b3\u0003\u00106R\'\u0010\u00b4\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b5\u0003\u0010\u0011\"\u0005\b\u00b6\u0003\u00106R\'\u0010\u00b7\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b8\u0003\u0010\u0011\"\u0005\b\u00b9\u0003\u00106R\'\u0010\u00ba\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bb\u0003\u0010\u0011\"\u0005\b\u00bc\u0003\u00106R\'\u0010\u00bd\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00be\u0003\u0010\u0011\"\u0005\b\u00bf\u0003\u00106R\'\u0010\u00c0\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c1\u0003\u0010\u0011\"\u0005\b\u00c2\u0003\u00106R\'\u0010\u00c3\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c4\u0003\u0010\u0011\"\u0005\b\u00c5\u0003\u00106R\'\u0010\u00c6\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c7\u0003\u0010\u0011\"\u0005\b\u00c8\u0003\u00106RA\u0010\u00ca\u0003\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u00c9\u0003082\u0013\u0010\u0003\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u00c9\u0003088F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00cb\u0003\u0010=\"\u0005\b\u00cc\u0003\u0010?R\'\u0010\u00cd\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ce\u0003\u0010\u0011\"\u0005\b\u00cf\u0003\u00106R\'\u0010\u00d0\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d1\u0003\u0010\u0011\"\u0005\b\u00d2\u0003\u00106R,\u0010\u00d5\u0003\u001a\u00030\u00d4\u00032\b\u0010\u00d3\u0003\u001a\u00030\u00d4\u00038F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00d6\u0003\u0010\u00d7\u0003\"\u0006\b\u00d8\u0003\u0010\u00d9\u0003R(\u0010\u00da\u0003\u001a\u00020\u00042\u0007\u0010\u00fe\u0001\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00db\u0003\u0010\u0007\"\u0005\b\u00dc\u0003\u0010\tR6\u0010\u00dd\u0003\u001a\t\u0012\u0005\u0012\u00030\u00de\u00030-2\u000e\u0010\u00dd\u0003\u001a\t\u0012\u0005\u0012\u00030\u00de\u00030-8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00df\u0003\u00100\"\u0005\b\u00e0\u0003\u00102R\'\u0010\u00e1\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e2\u0003\u0010\u0011\"\u0005\b\u00e3\u0003\u00106R\'\u0010\u00e4\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e5\u0003\u0010\u0007\"\u0005\b\u00e6\u0003\u0010\tR\'\u0010\u00e7\u0003\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e8\u0003\u0010\u0016\"\u0005\b\u00e9\u0003\u0010\u0018R\'\u0010\u00ea\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00eb\u0003\u0010\u0011\"\u0005\b\u00ec\u0003\u00106R\'\u0010\u00ed\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ee\u0003\u0010\u0011\"\u0005\b\u00ef\u0003\u00106R+\u0010\u00f0\u0003\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f1\u0003\u0010\r\"\u0005\b\u00f2\u0003\u0010&R\'\u0010\u00f3\u0003\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f4\u0003\u0010\u0007\"\u0005\b\u00f5\u0003\u0010\tR\u0013\u0010\u00f6\u0003\u001a\u00020\u00048F\u00a2\u0006\u0007\u001a\u0005\b\u00f7\u0003\u0010\u0007R\u0013\u0010\u00f8\u0003\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00f9\u0003\u0010\u0011R3\u0010\u00fa\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00fb\u0003\u0010\u001d\"\u0005\b\u00fc\u0003\u0010\u001fR\'\u0010\u00fd\u0003\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00fe\u0003\u0010\r\"\u0005\b\u00ff\u0003\u0010&R4\u0010\u0080\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\r\u0010\u00fa\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0081\u0004\u0010\u001d\"\u0005\b\u0082\u0004\u0010\u001fR8\u0010\u0083\u0004\u001a\t\u0012\u0004\u0012\u00020\u000b0\u00de\u00022\u000e\u0010\u00f6\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u00de\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0084\u0004\u0010\u00e1\u0002\"\u0006\b\u0085\u0004\u0010\u00e3\u0002R\'\u0010\u0086\u0004\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0087\u0004\u0010\u0011\"\u0005\b\u0088\u0004\u00106\u00a8\u0006\u00a2\u0004"}, d2 = {"Lorg/wikipedia/settings/Prefs;", "", "()V", "value", "", "analyticsQueueSize", "getAnalyticsQueueSize", "()I", "setAnalyticsQueueSize", "(I)V", "announcementCustomTabTestUrl", "", "getAnnouncementCustomTabTestUrl", "()Ljava/lang/String;", "announcementDebugUrl", "", "getAnnouncementDebugUrl", "()Z", "time", "", "announcementPauseTime", "getAnnouncementPauseTime", "()J", "setAnnouncementPauseTime", "(J)V", "newAnnouncementIds", "", "announcementShownDialogs", "getAnnouncementShownDialogs", "()Ljava/util/Set;", "setAnnouncementShownDialogs", "(Ljava/util/Set;)V", "announcementsVersionCode", "getAnnouncementsVersionCode", "channel", "appChannel", "getAppChannel", "setAppChannel", "(Ljava/lang/String;)V", "appChannelKey", "getAppChannelKey", "id", "appInstallId", "getAppInstallId", "setAppInstallId", "", "appLanguageCodeList", "getAppLanguageCodeList", "()Ljava/util/List;", "setAppLanguageCodeList", "(Ljava/util/List;)V", "autoShowEditNotices", "getAutoShowEditNotices", "setAutoShowEditNotices", "(Z)V", "cookieMap", "", "", "Lokhttp3/Cookie;", "cookies", "getCookies", "()Ljava/util/Map;", "setCookies", "(Ljava/util/Map;)V", "theme", "currentThemeId", "getCurrentThemeId", "setCurrentThemeId", "orderList", "customizeToolbarMenuOrder", "getCustomizeToolbarMenuOrder", "setCustomizeToolbarMenuOrder", "customizeToolbarOrder", "getCustomizeToolbarOrder", "setCustomizeToolbarOrder", "dimDarkModeImages", "getDimDarkModeImages", "setDimDarkModeImages", "donationBannerOptIn", "getDonationBannerOptIn", "setDonationBannerOptIn", "Lorg/wikipedia/donate/DonationResult;", "donationResults", "getDonationResults", "setDonationResults", "editHistoryFilterType", "getEditHistoryFilterType", "setEditHistoryFilterType", "editLineNumbersEnabled", "getEditLineNumbersEnabled", "setEditLineNumbersEnabled", "editMonoSpaceFontEnabled", "getEditMonoSpaceFontEnabled", "setEditMonoSpaceFontEnabled", "editSyntaxHighlightEnabled", "getEditSyntaxHighlightEnabled", "setEditSyntaxHighlightEnabled", "editTypingSuggestionsEnabled", "getEditTypingSuggestionsEnabled", "setEditTypingSuggestionsEnabled", "multiplier", "editingTextSizeMultiplier", "getEditingTextSizeMultiplier", "setEditingTextSizeMultiplier", "eventPlatformIntakeUriOverride", "getEventPlatformIntakeUriOverride", "sessionId", "eventPlatformSessionId", "getEventPlatformSessionId", "setEventPlatformSessionId", "exploreFeedVisitCount", "getExploreFeedVisitCount", "enabledList", "feedCardsEnabled", "getFeedCardsEnabled", "setFeedCardsEnabled", "langDisabledMap", "feedCardsLangDisabled", "getFeedCardsLangDisabled", "setFeedCardsLangDisabled", "langSupportedMap", "feedCardsLangSupported", "getFeedCardsLangSupported", "setFeedCardsLangSupported", "feedCardsOrder", "getFeedCardsOrder", "setFeedCardsOrder", "fontFamily", "getFontFamily", "setFontFamily", "geoIPCountryOverride", "getGeoIPCountryOverride", "hasAnonymousNotification", "getHasAnonymousNotification", "setHasAnonymousNotification", "hasTabs", "getHasTabs", "hasVisitedArticlePage", "getHasVisitedArticlePage", "setHasVisitedArticlePage", "cards", "hiddenCards", "getHiddenCards", "setHiddenCards", "hideReadNotificationsEnabled", "getHideReadNotificationsEnabled", "ignoreDateForAnnouncements", "getIgnoreDateForAnnouncements", "importReadingListsDialogShown", "getImportReadingListsDialogShown", "setImportReadingListsDialogShown", "importReadingListsNewInstallDialogShown", "getImportReadingListsNewInstallDialogShown", "setImportReadingListsNewInstallDialogShown", "attempts", "installReferrerAttempts", "getInstallReferrerAttempts", "setInstallReferrerAttempts", "isCollapseTablesEnabled", "enabled", "isDescriptionEditTutorialEnabled", "setDescriptionEditTutorialEnabled", "isDonationTestEnvironment", "setDonationTestEnvironment", "isDownloadOnlyOverWiFiEnabled", "isDownloadingReadingListArticlesEnabled", "isEditNoticesTooltipShown", "setEditNoticesTooltipShown", "isImageDownloadEnabled", "isInitialOnboardingEnabled", "setInitialOnboardingEnabled", "isLinkPreviewEnabled", "isMemoryLeakTestEnabled", "isNewRecommendedReadingListGenerated", "setNewRecommendedReadingListGenerated", "isOtdSoundOn", "setOtdSoundOn", "isPushNotificationOptionsSet", "setPushNotificationOptionsSet", "subscribed", "isPushNotificationTokenSubscribed", "setPushNotificationTokenSubscribed", "isReadingListLoginReminderEnabled", "setReadingListLoginReminderEnabled", "isReadingListSyncEnabled", "setReadingListSyncEnabled", "isReadingListSyncReminderEnabled", "setReadingListSyncReminderEnabled", "isReadingListsFirstTimeSync", "setReadingListsFirstTimeSync", "pending", "isReadingListsRemoteDeletePending", "setReadingListsRemoteDeletePending", "isReadingListsRemoteSetupPending", "setReadingListsRemoteSetupPending", "isRecommendedReadingListEnabled", "setRecommendedReadingListEnabled", "isRecommendedReadingListNotificationEnabled", "setRecommendedReadingListNotificationEnabled", "isRecommendedReadingListOnboardingShown", "setRecommendedReadingListOnboardingShown", "isShowDeveloperSettingsEnabled", "setShowDeveloperSettingsEnabled", "isSuggestedEditsHighestPriorityEnabled", "setSuggestedEditsHighestPriorityEnabled", "pass", "isSuggestedEditsReactivationPassStageOne", "setSuggestedEditsReactivationPassStageOne", "isSuggestedEditsReactivationTestEnabled", "isYearInReviewEnabled", "setYearInReviewEnabled", "lastAnonEditTime", "getLastAnonEditTime", "setLastAnonEditTime", "lastAnonNotificationLang", "getLastAnonNotificationLang", "setLastAnonNotificationLang", "lastAnonNotificationTime", "getLastAnonNotificationTime", "setLastAnonNotificationTime", "lastAnonUserWithMessages", "getLastAnonUserWithMessages", "setLastAnonUserWithMessages", "lastDescriptionEditTime", "getLastDescriptionEditTime", "setLastDescriptionEditTime", "lastOtdGameDateOverride", "getLastOtdGameDateOverride", "setLastOtdGameDateOverride", "className", "localClassName", "getLocalClassName", "setLocalClassName", "loggedOutInBackground", "getLoggedOutInBackground", "setLoggedOutInBackground", "loginForceEmailAuth", "getLoginForceEmailAuth", "setLoginForceEmailAuth", "mediaWikiBaseUriSupportsLangCode", "getMediaWikiBaseUriSupportsLangCode", "mediaWikiBaseUrl", "getMediaWikiBaseUrl", "mruLanguageCodeList", "getMruLanguageCodeList", "setMruLanguageCodeList", "types", "notificationExcludedTypeCodes", "getNotificationExcludedTypeCodes", "setNotificationExcludedTypeCodes", "wikis", "notificationExcludedWikiCodes", "getNotificationExcludedWikiCodes", "setNotificationExcludedWikiCodes", "count", "notificationUnreadCount", "getNotificationUnreadCount", "setNotificationUnreadCount", "otdEntryDialogShown", "getOtdEntryDialogShown", "setOtdEntryDialogShown", "otdGameFirstPlayedShown", "getOtdGameFirstPlayedShown", "setOtdGameFirstPlayedShown", "otdGameHistory", "getOtdGameHistory", "setOtdGameHistory", "otdGameQuestionsPerDay", "getOtdGameQuestionsPerDay", "setOtdGameQuestionsPerDay", "otdGameState", "getOtdGameState", "setOtdGameState", "Lorg/wikipedia/games/onthisday/OnThisDayGameNotificationState;", "otdNotificationState", "getOtdNotificationState", "()Lorg/wikipedia/games/onthisday/OnThisDayGameNotificationState;", "setOtdNotificationState", "(Lorg/wikipedia/games/onthisday/OnThisDayGameNotificationState;)V", "overrideSuggestedEditContribution", "getOverrideSuggestedEditContribution", "setOverrideSuggestedEditContribution", "overrideSuggestedEditCount", "getOverrideSuggestedEditCount", "overrideSuggestedRevertCount", "getOverrideSuggestedRevertCount", "pageLastShown", "getPageLastShown", "setPageLastShown", "paymentMethodsGatewayId", "getPaymentMethodsGatewayId", "setPaymentMethodsGatewayId", "paymentMethodsLastQueryTime", "getPaymentMethodsLastQueryTime", "setPaymentMethodsLastQueryTime", "paymentMethodsMerchantId", "getPaymentMethodsMerchantId", "setPaymentMethodsMerchantId", "set", "placesDefaultLocationLatLng", "getPlacesDefaultLocationLatLng", "setPlacesDefaultLocationLatLng", "pair", "Lkotlin/Pair;", "Landroid/location/Location;", "", "placesLastLocationAndZoomLevel", "getPlacesLastLocationAndZoomLevel", "()Lkotlin/Pair;", "setPlacesLastLocationAndZoomLevel", "(Lkotlin/Pair;)V", "placesWikiCode", "getPlacesWikiCode", "setPlacesWikiCode", "previousThemeId", "getPreviousThemeId", "setPreviousThemeId", "token", "pushNotificationToken", "getPushNotificationToken", "setPushNotificationToken", "pushNotificationTokenOld", "getPushNotificationTokenOld", "setPushNotificationTokenOld", "readingFocusModeEnabled", "getReadingFocusModeEnabled", "setReadingFocusModeEnabled", "readingListPagesDeletedIds", "getReadingListPagesDeletedIds", "setReadingListPagesDeletedIds", "readingListRecentReceivedId", "getReadingListRecentReceivedId", "setReadingListRecentReceivedId", "readingListShareTooltipShown", "getReadingListShareTooltipShown", "setReadingListShareTooltipShown", "readingListsDeletedIds", "getReadingListsDeletedIds", "setReadingListsDeletedIds", "timeStr", "readingListsLastSyncTime", "getReadingListsLastSyncTime", "setReadingListsLastSyncTime", "saveCount", "readingListsPageSaveCount", "getReadingListsPageSaveCount", "setReadingListsPageSaveCount", "receiveReadingListsData", "getReceiveReadingListsData", "setReceiveReadingListsData", "", "recentEditsIncludedTypeCodes", "getRecentEditsIncludedTypeCodes", "()Ljava/util/Collection;", "setRecentEditsIncludedTypeCodes", "(Ljava/util/Collection;)V", "recentEditsOnboardingShown", "getRecentEditsOnboardingShown", "setRecentEditsOnboardingShown", "recentEditsWikiCode", "getRecentEditsWikiCode", "setRecentEditsWikiCode", "Lorg/wikipedia/page/PageTitle;", "recentUsedTemplates", "getRecentUsedTemplates", "setRecentUsedTemplates", "recommendedReadingListArticlesNumber", "getRecommendedReadingListArticlesNumber", "setRecommendedReadingListArticlesNumber", "recommendedReadingListInterests", "getRecommendedReadingListInterests", "setRecommendedReadingListInterests", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "recommendedReadingListSource", "getRecommendedReadingListSource", "()Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;", "setRecommendedReadingListSource", "(Lorg/wikipedia/readinglist/recommended/RecommendedReadingListSource;)V", "Lorg/wikipedia/readinglist/recommended/SourceWithOffset;", "recommendedReadingListSourceTitlesWithOffset", "getRecommendedReadingListSourceTitlesWithOffset", "setRecommendedReadingListSourceTitlesWithOffset", "Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "recommendedReadingListUpdateFrequency", "getRecommendedReadingListUpdateFrequency", "()Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;", "setRecommendedReadingListUpdateFrequency", "(Lorg/wikipedia/readinglist/recommended/RecommendedReadingListUpdateFrequency;)V", "json", "remoteConfigJson", "getRemoteConfigJson", "setRemoteConfigJson", "seenTime", "remoteNotificationsSeenTime", "getRemoteNotificationsSeenTime", "setRemoteNotificationsSeenTime", "resetRecommendedReadingList", "getResetRecommendedReadingList", "setResetRecommendedReadingList", "restbaseUriFormat", "getRestbaseUriFormat", "retrofitLogLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getRetrofitLogLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "position", "selectedLanguagePositionInSearch", "getSelectedLanguagePositionInSearch", "setSelectedLanguagePositionInSearch", "data", "Lorg/wikipedia/analytics/SessionData;", "sessionData", "getSessionData", "()Lorg/wikipedia/analytics/SessionData;", "setSessionData", "(Lorg/wikipedia/analytics/SessionData;)V", "sessionTimeout", "getSessionTimeout", "shouldMatchSystemTheme", "getShouldMatchSystemTheme", "setShouldMatchSystemTheme", "showDescriptionEditSuccessPrompt", "getShowDescriptionEditSuccessPrompt", "setShowDescriptionEditSuccessPrompt", "showEditTalkPageSourcePrompt", "getShowEditTalkPageSourcePrompt", "setShowEditTalkPageSourcePrompt", "showHistoryOfflineArticlesToast", "getShowHistoryOfflineArticlesToast", "setShowHistoryOfflineArticlesToast", "showImageTagsOnboarding", "getShowImageTagsOnboarding", "setShowImageTagsOnboarding", "showImageZoomTooltip", "getShowImageZoomTooltip", "setShowImageZoomTooltip", "showOneTimeCustomizeToolbarTooltip", "getShowOneTimeCustomizeToolbarTooltip", "setShowOneTimeCustomizeToolbarTooltip", "showOneTimeRecentEditsFeedbackForm", "getShowOneTimeRecentEditsFeedbackForm", "setShowOneTimeRecentEditsFeedbackForm", "showOneTimeSequentialRecentEditsDiffTooltip", "getShowOneTimeSequentialRecentEditsDiffTooltip", "setShowOneTimeSequentialRecentEditsDiffTooltip", "showOneTimeSequentialUserStatsTooltip", "getShowOneTimeSequentialUserStatsTooltip", "setShowOneTimeSequentialUserStatsTooltip", "showReadingListSyncEnablePrompt", "getShowReadingListSyncEnablePrompt", "setShowReadingListSyncEnablePrompt", "showSearchTabTooltip", "getShowSearchTabTooltip", "setShowSearchTabTooltip", "showSuggestedEditsTooltip", "getShowSuggestedEditsTooltip", "setShowSuggestedEditsTooltip", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "streamConfigs", "getStreamConfigs", "setStreamConfigs", "suggestedEditsImageRecsOnboardingShown", "getSuggestedEditsImageRecsOnboardingShown", "setSuggestedEditsImageRecsOnboardingShown", "suggestedEditsMachineGeneratedDescriptionTooltipShown", "getSuggestedEditsMachineGeneratedDescriptionTooltipShown", "setSuggestedEditsMachineGeneratedDescriptionTooltipShown", "date", "Ljava/util/Date;", "suggestedEditsPauseDate", "getSuggestedEditsPauseDate", "()Ljava/util/Date;", "setSuggestedEditsPauseDate", "(Ljava/util/Date;)V", "suggestedEditsPauseReverts", "getSuggestedEditsPauseReverts", "setSuggestedEditsPauseReverts", "tabs", "Lorg/wikipedia/page/tabs/Tab;", "getTabs", "setTabs", "talkTopicExpandOrCollapseByDefault", "getTalkTopicExpandOrCollapseByDefault", "setTalkTopicExpandOrCollapseByDefault", "talkTopicsSortMode", "getTalkTopicsSortMode", "setTalkTopicsSortMode", "tempAccountCreateDay", "getTempAccountCreateDay", "setTempAccountCreateDay", "tempAccountDialogShown", "getTempAccountDialogShown", "setTempAccountDialogShown", "tempAccountWelcomeShown", "getTempAccountWelcomeShown", "setTempAccountWelcomeShown", "temporaryWikitext", "getTemporaryWikitext", "setTemporaryWikitext", "textSizeMultiplier", "getTextSizeMultiplier", "setTextSizeMultiplier", "totalAnonDescriptionsEdited", "getTotalAnonDescriptionsEdited", "useUrlShortenerForSharing", "getUseUrlShortenerForSharing", "userContribFilterExcludedNs", "getUserContribFilterExcludedNs", "setUserContribFilterExcludedNs", "userContribFilterLangCode", "getUserContribFilterLangCode", "setUserContribFilterLangCode", "watchlistExcludedWikiCodes", "getWatchlistExcludedWikiCodes", "setWatchlistExcludedWikiCodes", "watchlistIncludedTypeCodes", "getWatchlistIncludedTypeCodes", "setWatchlistIncludedTypeCodes", "yirSurveyShown", "getYirSurveyShown", "setYirSurveyShown", "addReadingListPagesDeletedIds", "", "addReadingListsDeletedIds", "addRecentUsedTemplates", "askedForPermissionOnce", "permission", "clearTabs", "getLastRunTime", "task", "getLastRunTimeKey", "getReadingListPageSortMode", "defaultValue", "getReadingListSortMode", "incrementExploreFeedVisitCount", "incrementTotalAnonDescriptionsEdited", "preferOfflineContent", "resetAnnouncementShownDialogs", "resetFeedCustomizations", "resetToolbarAndMenuOrder", "setAskedForPermissionOnce", "setLastRunTime", "setReadingListPageSortMode", "sortMode", "setReadingListSortMode", "shouldOverrideSuggestedEditCounts", "app.lib"})
public final class Prefs {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.Prefs INSTANCE = null;
    
    private Prefs() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppChannel() {
        return null;
    }
    
    public final void setAppChannel(@org.jetbrains.annotations.Nullable()
    java.lang.String channel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppChannelKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppInstallId() {
        return null;
    }
    
    public final void setAppInstallId(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    public final int getCurrentThemeId() {
        return 0;
    }
    
    public final void setCurrentThemeId(int theme) {
    }
    
    public final int getPreviousThemeId() {
        return 0;
    }
    
    public final void setPreviousThemeId(int theme) {
    }
    
    public final boolean getReadingFocusModeEnabled() {
        return false;
    }
    
    public final void setReadingFocusModeEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFontFamily() {
        return null;
    }
    
    public final void setFontFamily(@org.jetbrains.annotations.NotNull()
    java.lang.String fontFamily) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<okhttp3.Cookie>> getCookies() {
        return null;
    }
    
    public final void setCookies(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<okhttp3.Cookie>> cookieMap) {
    }
    
    public final boolean isShowDeveloperSettingsEnabled() {
        return false;
    }
    
    public final void setShowDeveloperSettingsEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMruLanguageCodeList() {
        return null;
    }
    
    public final void setMruLanguageCodeList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAppLanguageCodeList() {
        return null;
    }
    
    public final void setAppLanguageCodeList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemoteConfigJson() {
        return null;
    }
    
    public final void setRemoteConfigJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.tabs.Tab> getTabs() {
        return null;
    }
    
    public final void setTabs(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.tabs.Tab> tabs) {
    }
    
    public final boolean getHasTabs() {
        return false;
    }
    
    public final void clearTabs() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getHiddenCards() {
        return null;
    }
    
    public final void setHiddenCards(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> cards) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.SessionData getSessionData() {
        return null;
    }
    
    public final void setSessionData(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.SessionData data) {
    }
    
    public final int getSessionTimeout() {
        return 0;
    }
    
    public final int getTextSizeMultiplier() {
        return 0;
    }
    
    public final void setTextSizeMultiplier(int multiplier) {
    }
    
    public final int getEditingTextSizeMultiplier() {
        return 0;
    }
    
    public final void setEditingTextSizeMultiplier(int multiplier) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGeoIPCountryOverride() {
        return null;
    }
    
    public final boolean getIgnoreDateForAnnouncements() {
        return false;
    }
    
    public final long getAnnouncementPauseTime() {
        return 0L;
    }
    
    public final void setAnnouncementPauseTime(long time) {
    }
    
    public final boolean getAnnouncementDebugUrl() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnnouncementCustomTabTestUrl() {
        return null;
    }
    
    public final int getAnnouncementsVersionCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor.Level getRetrofitLogLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestbaseUriFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaWikiBaseUrl() {
        return null;
    }
    
    public final boolean getMediaWikiBaseUriSupportsLangCode() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEventPlatformIntakeUriOverride() {
        return null;
    }
    
    public final long getLastRunTime(@org.jetbrains.annotations.NotNull()
    java.lang.String task) {
        return 0L;
    }
    
    public final void setLastRunTime(@org.jetbrains.annotations.NotNull()
    java.lang.String task, long time) {
    }
    
    private final java.lang.String getLastRunTimeKey(java.lang.String task) {
        return null;
    }
    
    public final long getPageLastShown() {
        return 0L;
    }
    
    public final void setPageLastShown(long value) {
    }
    
    public final boolean isImageDownloadEnabled() {
        return false;
    }
    
    public final boolean isDownloadOnlyOverWiFiEnabled() {
        return false;
    }
    
    public final boolean isDownloadingReadingListArticlesEnabled() {
        return false;
    }
    
    public final boolean isLinkPreviewEnabled() {
        return false;
    }
    
    public final boolean isCollapseTablesEnabled() {
        return false;
    }
    
    public final int getReadingListSortMode(int defaultValue) {
        return 0;
    }
    
    public final void setReadingListSortMode(int sortMode) {
    }
    
    public final int getReadingListsPageSaveCount() {
        return 0;
    }
    
    public final void setReadingListsPageSaveCount(int saveCount) {
    }
    
    public final int getReadingListPageSortMode(int defaultValue) {
        return 0;
    }
    
    public final void setReadingListPageSortMode(int sortMode) {
    }
    
    public final boolean getLoginForceEmailAuth() {
        return false;
    }
    
    public final void setLoginForceEmailAuth(boolean value) {
    }
    
    public final boolean isMemoryLeakTestEnabled() {
        return false;
    }
    
    public final boolean isDescriptionEditTutorialEnabled() {
        return false;
    }
    
    public final void setDescriptionEditTutorialEnabled(boolean enabled) {
    }
    
    public final long getLastDescriptionEditTime() {
        return 0L;
    }
    
    public final void setLastDescriptionEditTime(long time) {
    }
    
    public final int getTotalAnonDescriptionsEdited() {
        return 0;
    }
    
    public final void incrementTotalAnonDescriptionsEdited() {
    }
    
    public final boolean isReadingListSyncEnabled() {
        return false;
    }
    
    public final void setReadingListSyncEnabled(boolean enabled) {
    }
    
    public final boolean isReadingListSyncReminderEnabled() {
        return false;
    }
    
    public final void setReadingListSyncReminderEnabled(boolean enabled) {
    }
    
    public final boolean isReadingListLoginReminderEnabled() {
        return false;
    }
    
    public final void setReadingListLoginReminderEnabled(boolean enabled) {
    }
    
    public final boolean isReadingListsRemoteDeletePending() {
        return false;
    }
    
    public final void setReadingListsRemoteDeletePending(boolean pending) {
    }
    
    public final boolean isReadingListsRemoteSetupPending() {
        return false;
    }
    
    public final void setReadingListsRemoteSetupPending(boolean pending) {
    }
    
    public final boolean isInitialOnboardingEnabled() {
        return false;
    }
    
    public final void setInitialOnboardingEnabled(boolean enabled) {
    }
    
    public final boolean askedForPermissionOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public final void setAskedForPermissionOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
    }
    
    public final boolean getDimDarkModeImages() {
        return false;
    }
    
    public final void setDimDarkModeImages(boolean value) {
    }
    
    public final int getNotificationUnreadCount() {
        return 0;
    }
    
    public final void setNotificationUnreadCount(int count) {
    }
    
    public final boolean getHasAnonymousNotification() {
        return false;
    }
    
    public final void setHasAnonymousNotification(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastAnonUserWithMessages() {
        return null;
    }
    
    public final void setLastAnonUserWithMessages(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final long getLastAnonEditTime() {
        return 0L;
    }
    
    public final void setLastAnonEditTime(long value) {
    }
    
    public final long getLastAnonNotificationTime() {
        return 0L;
    }
    
    public final void setLastAnonNotificationTime(long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastAnonNotificationLang() {
        return null;
    }
    
    public final void setLastAnonNotificationLang(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final boolean preferOfflineContent() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Boolean> getFeedCardsEnabled() {
        return null;
    }
    
    public final void setFeedCardsEnabled(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Boolean> enabledList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getFeedCardsOrder() {
        return null;
    }
    
    public final void setFeedCardsOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> orderList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> getFeedCardsLangSupported() {
        return null;
    }
    
    public final void setFeedCardsLangSupported(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.String>> langSupportedMap) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> getFeedCardsLangDisabled() {
        return null;
    }
    
    public final void setFeedCardsLangDisabled(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.String>> langDisabledMap) {
    }
    
    public final void resetFeedCustomizations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReadingListsLastSyncTime() {
        return null;
    }
    
    public final void setReadingListsLastSyncTime(@org.jetbrains.annotations.Nullable()
    java.lang.String timeStr) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Long> getReadingListsDeletedIds() {
        return null;
    }
    
    public final void setReadingListsDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> set) {
    }
    
    public final void addReadingListsDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> set) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getReadingListPagesDeletedIds() {
        return null;
    }
    
    public final void setReadingListPagesDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> set) {
    }
    
    public final void addReadingListPagesDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> set) {
    }
    
    public final boolean getShowReadingListSyncEnablePrompt() {
        return false;
    }
    
    public final void setShowReadingListSyncEnablePrompt(boolean value) {
    }
    
    public final boolean isReadingListsFirstTimeSync() {
        return false;
    }
    
    public final void setReadingListsFirstTimeSync(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemoteNotificationsSeenTime() {
        return null;
    }
    
    public final void setRemoteNotificationsSeenTime(@org.jetbrains.annotations.NotNull()
    java.lang.String seenTime) {
    }
    
    public final boolean getShowHistoryOfflineArticlesToast() {
        return false;
    }
    
    public final void setShowHistoryOfflineArticlesToast(boolean value) {
    }
    
    public final boolean getLoggedOutInBackground() {
        return false;
    }
    
    public final void setLoggedOutInBackground(boolean value) {
    }
    
    public final boolean getShowDescriptionEditSuccessPrompt() {
        return false;
    }
    
    public final void setShowDescriptionEditSuccessPrompt(boolean value) {
    }
    
    public final boolean getShowSuggestedEditsTooltip() {
        return false;
    }
    
    public final void setShowSuggestedEditsTooltip(boolean value) {
    }
    
    public final boolean getHasVisitedArticlePage() {
        return false;
    }
    
    public final void setHasVisitedArticlePage(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getAnnouncementShownDialogs() {
        return null;
    }
    
    public final void setAnnouncementShownDialogs(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> newAnnouncementIds) {
    }
    
    public final void resetAnnouncementShownDialogs() {
    }
    
    public final boolean getShouldMatchSystemTheme() {
        return false;
    }
    
    public final void setShouldMatchSystemTheme(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getSuggestedEditsPauseDate() {
        return null;
    }
    
    public final void setSuggestedEditsPauseDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    public final int getSuggestedEditsPauseReverts() {
        return 0;
    }
    
    public final void setSuggestedEditsPauseReverts(int count) {
    }
    
    public final boolean shouldOverrideSuggestedEditCounts() {
        return false;
    }
    
    public final int getOverrideSuggestedEditCount() {
        return 0;
    }
    
    public final int getOverrideSuggestedEditContribution() {
        return 0;
    }
    
    public final void setOverrideSuggestedEditContribution(int value) {
    }
    
    public final int getOverrideSuggestedRevertCount() {
        return 0;
    }
    
    public final int getInstallReferrerAttempts() {
        return 0;
    }
    
    public final void setInstallReferrerAttempts(int attempts) {
    }
    
    public final boolean getShowImageTagsOnboarding() {
        return false;
    }
    
    public final void setShowImageTagsOnboarding(boolean value) {
    }
    
    public final boolean getShowImageZoomTooltip() {
        return false;
    }
    
    public final void setShowImageZoomTooltip(boolean value) {
    }
    
    public final boolean isSuggestedEditsReactivationPassStageOne() {
        return false;
    }
    
    public final void setSuggestedEditsReactivationPassStageOne(boolean pass) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemporaryWikitext() {
        return null;
    }
    
    public final void setTemporaryWikitext(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushNotificationToken() {
        return null;
    }
    
    public final void setPushNotificationToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushNotificationTokenOld() {
        return null;
    }
    
    public final void setPushNotificationTokenOld(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final boolean isPushNotificationTokenSubscribed() {
        return false;
    }
    
    public final void setPushNotificationTokenSubscribed(boolean subscribed) {
    }
    
    public final boolean isPushNotificationOptionsSet() {
        return false;
    }
    
    public final void setPushNotificationOptionsSet(boolean value) {
    }
    
    public final boolean isSuggestedEditsReactivationTestEnabled() {
        return false;
    }
    
    public final boolean isSuggestedEditsHighestPriorityEnabled() {
        return false;
    }
    
    public final void setSuggestedEditsHighestPriorityEnabled(boolean enabled) {
    }
    
    public final void incrementExploreFeedVisitCount() {
    }
    
    public final int getExploreFeedVisitCount() {
        return 0;
    }
    
    public final int getSelectedLanguagePositionInSearch() {
        return 0;
    }
    
    public final void setSelectedLanguagePositionInSearch(int position) {
    }
    
    public final boolean getShowOneTimeSequentialUserStatsTooltip() {
        return false;
    }
    
    public final void setShowOneTimeSequentialUserStatsTooltip(boolean value) {
    }
    
    public final boolean getShowSearchTabTooltip() {
        return false;
    }
    
    public final void setShowSearchTabTooltip(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEventPlatformSessionId() {
        return null;
    }
    
    public final void setEventPlatformSessionId(@org.jetbrains.annotations.Nullable()
    java.lang.String sessionId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getNotificationExcludedWikiCodes() {
        return null;
    }
    
    public final void setNotificationExcludedWikiCodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> wikis) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getNotificationExcludedTypeCodes() {
        return null;
    }
    
    public final void setNotificationExcludedTypeCodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> types) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> getStreamConfigs() {
        return null;
    }
    
    public final void setStreamConfigs(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalClassName() {
        return null;
    }
    
    public final void setLocalClassName(@org.jetbrains.annotations.Nullable()
    java.lang.String className) {
    }
    
    public final boolean getAutoShowEditNotices() {
        return false;
    }
    
    public final void setAutoShowEditNotices(boolean value) {
    }
    
    public final boolean isEditNoticesTooltipShown() {
        return false;
    }
    
    public final void setEditNoticesTooltipShown(boolean value) {
    }
    
    public final boolean getHideReadNotificationsEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getCustomizeToolbarOrder() {
        return null;
    }
    
    public final void setCustomizeToolbarOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> orderList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getCustomizeToolbarMenuOrder() {
        return null;
    }
    
    public final void setCustomizeToolbarMenuOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> orderList) {
    }
    
    public final void resetToolbarAndMenuOrder() {
    }
    
    public final boolean getShowOneTimeCustomizeToolbarTooltip() {
        return false;
    }
    
    public final void setShowOneTimeCustomizeToolbarTooltip(boolean value) {
    }
    
    public final boolean getShowEditTalkPageSourcePrompt() {
        return false;
    }
    
    public final void setShowEditTalkPageSourcePrompt(boolean value) {
    }
    
    public final int getTalkTopicsSortMode() {
        return 0;
    }
    
    public final void setTalkTopicsSortMode(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEditHistoryFilterType() {
        return null;
    }
    
    public final void setEditHistoryFilterType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean getTalkTopicExpandOrCollapseByDefault() {
        return false;
    }
    
    public final void setTalkTopicExpandOrCollapseByDefault(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Integer> getUserContribFilterExcludedNs() {
        return null;
    }
    
    public final void setUserContribFilterExcludedNs(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Integer> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserContribFilterLangCode() {
        return null;
    }
    
    public final void setUserContribFilterLangCode(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean getDonationBannerOptIn() {
        return false;
    }
    
    public final void setDonationBannerOptIn(boolean value) {
    }
    
    public final boolean getImportReadingListsNewInstallDialogShown() {
        return false;
    }
    
    public final void setImportReadingListsNewInstallDialogShown(boolean value) {
    }
    
    public final boolean getImportReadingListsDialogShown() {
        return false;
    }
    
    public final void setImportReadingListsDialogShown(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiveReadingListsData() {
        return null;
    }
    
    public final void setReceiveReadingListsData(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final boolean getEditSyntaxHighlightEnabled() {
        return false;
    }
    
    public final void setEditSyntaxHighlightEnabled(boolean value) {
    }
    
    public final boolean getEditMonoSpaceFontEnabled() {
        return false;
    }
    
    public final void setEditMonoSpaceFontEnabled(boolean value) {
    }
    
    public final boolean getEditLineNumbersEnabled() {
        return false;
    }
    
    public final void setEditLineNumbersEnabled(boolean value) {
    }
    
    public final boolean getEditTypingSuggestionsEnabled() {
        return false;
    }
    
    public final void setEditTypingSuggestionsEnabled(boolean value) {
    }
    
    public final boolean getUseUrlShortenerForSharing() {
        return false;
    }
    
    public final boolean getTempAccountWelcomeShown() {
        return false;
    }
    
    public final void setTempAccountWelcomeShown(boolean value) {
    }
    
    public final boolean getTempAccountDialogShown() {
        return false;
    }
    
    public final void setTempAccountDialogShown(boolean value) {
    }
    
    public final long getTempAccountCreateDay() {
        return 0L;
    }
    
    public final void setTempAccountCreateDay(long value) {
    }
    
    public final boolean getReadingListShareTooltipShown() {
        return false;
    }
    
    public final void setReadingListShareTooltipShown(boolean value) {
    }
    
    public final long getReadingListRecentReceivedId() {
        return 0L;
    }
    
    public final void setReadingListRecentReceivedId(long value) {
    }
    
    public final boolean getSuggestedEditsImageRecsOnboardingShown() {
        return false;
    }
    
    public final void setSuggestedEditsImageRecsOnboardingShown(boolean value) {
    }
    
    public final boolean getSuggestedEditsMachineGeneratedDescriptionTooltipShown() {
        return false;
    }
    
    public final void setSuggestedEditsMachineGeneratedDescriptionTooltipShown(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getWatchlistExcludedWikiCodes() {
        return null;
    }
    
    public final void setWatchlistExcludedWikiCodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> wikis) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<java.lang.String> getWatchlistIncludedTypeCodes() {
        return null;
    }
    
    public final void setWatchlistIncludedTypeCodes(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> types) {
    }
    
    public final int getAnalyticsQueueSize() {
        return 0;
    }
    
    public final void setAnalyticsQueueSize(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRecentEditsWikiCode() {
        return null;
    }
    
    public final void setRecentEditsWikiCode(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<java.lang.String> getRecentEditsIncludedTypeCodes() {
        return null;
    }
    
    public final void setRecentEditsIncludedTypeCodes(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> types) {
    }
    
    public final boolean getRecentEditsOnboardingShown() {
        return false;
    }
    
    public final void setRecentEditsOnboardingShown(boolean value) {
    }
    
    public final boolean getShowOneTimeSequentialRecentEditsDiffTooltip() {
        return false;
    }
    
    public final void setShowOneTimeSequentialRecentEditsDiffTooltip(boolean value) {
    }
    
    public final boolean getShowOneTimeRecentEditsFeedbackForm() {
        return false;
    }
    
    public final void setShowOneTimeRecentEditsFeedbackForm(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlacesWikiCode() {
        return null;
    }
    
    public final void setPlacesWikiCode(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlacesDefaultLocationLatLng() {
        return null;
    }
    
    public final void setPlacesDefaultLocationLatLng(@org.jetbrains.annotations.Nullable()
    java.lang.String set) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<android.location.Location, java.lang.Double> getPlacesLastLocationAndZoomLevel() {
        return null;
    }
    
    public final void setPlacesLastLocationAndZoomLevel(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<? extends android.location.Location, java.lang.Double> pair) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.wikipedia.page.PageTitle> getRecentUsedTemplates() {
        return null;
    }
    
    public final void setRecentUsedTemplates(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.wikipedia.page.PageTitle> set) {
    }
    
    public final void addRecentUsedTemplates(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.wikipedia.page.PageTitle> set) {
    }
    
    public final long getPaymentMethodsLastQueryTime() {
        return 0L;
    }
    
    public final void setPaymentMethodsLastQueryTime(long value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentMethodsMerchantId() {
        return null;
    }
    
    public final void setPaymentMethodsMerchantId(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentMethodsGatewayId() {
        return null;
    }
    
    public final void setPaymentMethodsGatewayId(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean isDonationTestEnvironment() {
        return false;
    }
    
    public final void setDonationTestEnvironment(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.donate.DonationResult> getDonationResults() {
        return null;
    }
    
    public final void setDonationResults(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.donate.DonationResult> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastOtdGameDateOverride() {
        return null;
    }
    
    public final void setLastOtdGameDateOverride(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtdGameState() {
        return null;
    }
    
    public final void setOtdGameState(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtdGameHistory() {
        return null;
    }
    
    public final void setOtdGameHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getOtdGameQuestionsPerDay() {
        return 0;
    }
    
    public final void setOtdGameQuestionsPerDay(int value) {
    }
    
    public final boolean getOtdEntryDialogShown() {
        return false;
    }
    
    public final void setOtdEntryDialogShown(boolean value) {
    }
    
    public final boolean getOtdGameFirstPlayedShown() {
        return false;
    }
    
    public final void setOtdGameFirstPlayedShown(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.games.onthisday.OnThisDayGameNotificationState getOtdNotificationState() {
        return null;
    }
    
    public final void setOtdNotificationState(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.onthisday.OnThisDayGameNotificationState value) {
    }
    
    public final boolean isOtdSoundOn() {
        return false;
    }
    
    public final void setOtdSoundOn(boolean value) {
    }
    
    public final boolean isYearInReviewEnabled() {
        return false;
    }
    
    public final void setYearInReviewEnabled(boolean value) {
    }
    
    public final boolean getYirSurveyShown() {
        return false;
    }
    
    public final void setYirSurveyShown(boolean value) {
    }
    
    public final boolean isRecommendedReadingListEnabled() {
        return false;
    }
    
    public final void setRecommendedReadingListEnabled(boolean value) {
    }
    
    public final int getRecommendedReadingListArticlesNumber() {
        return 0;
    }
    
    public final void setRecommendedReadingListArticlesNumber(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency getRecommendedReadingListUpdateFrequency() {
        return null;
    }
    
    public final void setRecommendedReadingListUpdateFrequency(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListUpdateFrequency value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.readinglist.recommended.RecommendedReadingListSource getRecommendedReadingListSource() {
        return null;
    }
    
    public final void setRecommendedReadingListSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.recommended.RecommendedReadingListSource value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.PageTitle> getRecommendedReadingListInterests() {
        return null;
    }
    
    public final void setRecommendedReadingListInterests(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> types) {
    }
    
    public final boolean isRecommendedReadingListNotificationEnabled() {
        return false;
    }
    
    public final void setRecommendedReadingListNotificationEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.readinglist.recommended.SourceWithOffset> getRecommendedReadingListSourceTitlesWithOffset() {
        return null;
    }
    
    public final void setRecommendedReadingListSourceTitlesWithOffset(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.recommended.SourceWithOffset> types) {
    }
    
    public final boolean isRecommendedReadingListOnboardingShown() {
        return false;
    }
    
    public final void setRecommendedReadingListOnboardingShown(boolean value) {
    }
    
    public final boolean isNewRecommendedReadingListGenerated() {
        return false;
    }
    
    public final void setNewRecommendedReadingListGenerated(boolean value) {
    }
    
    public final boolean getResetRecommendedReadingList() {
        return false;
    }
    
    public final void setResetRecommendedReadingList(boolean value) {
    }
}