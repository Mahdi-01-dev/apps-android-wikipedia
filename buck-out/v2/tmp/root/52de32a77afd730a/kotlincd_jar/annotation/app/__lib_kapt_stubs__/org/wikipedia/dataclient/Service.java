package org.wikipedia.dataclient;

import org.wikipedia.captcha.Captcha;
import org.wikipedia.dataclient.discussiontools.DiscussionToolsEditResponse;
import org.wikipedia.dataclient.discussiontools.DiscussionToolsInfoResponse;
import org.wikipedia.dataclient.discussiontools.DiscussionToolsSubscribeResponse;
import org.wikipedia.dataclient.discussiontools.DiscussionToolsSubscriptionList;
import org.wikipedia.dataclient.donate.PaymentResponseContainer;
import org.wikipedia.dataclient.mwapi.CreateAccountResponse;
import org.wikipedia.dataclient.mwapi.MwParseResponse;
import org.wikipedia.dataclient.mwapi.MwPostResponse;
import org.wikipedia.dataclient.mwapi.MwQueryResponse;
import org.wikipedia.dataclient.mwapi.MwStreamConfigsResponse;
import org.wikipedia.dataclient.mwapi.ParamInfoResponse;
import org.wikipedia.dataclient.mwapi.ShortenUrlResponse;
import org.wikipedia.dataclient.mwapi.SiteMatrix;
import org.wikipedia.dataclient.mwapi.TemplateDataResponse;
import org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor;
import org.wikipedia.dataclient.rollback.RollbackPostResponse;
import org.wikipedia.dataclient.watch.WatchPostResponse;
import org.wikipedia.dataclient.wikidata.Claims;
import org.wikipedia.dataclient.wikidata.Entities;
import org.wikipedia.dataclient.wikidata.EntityPostResponse;
import org.wikipedia.dataclient.wikidata.Search;
import org.wikipedia.edit.Edit;
import org.wikipedia.login.LoginResponse;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import java.time.Instant;

/**
 * Retrofit service layer for all API interactions, including regular MediaWiki and RESTBase.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u0098\u00022\u00020\u0001:\u0002\u0098\u0002J0\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ.\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ.\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ2\u0010\f\u001a\u00020\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J8\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u00052\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\"\u0010#\u001a\u00020$2\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010%\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J6\u0010&\u001a\u00020\u00032\b\b\u0001\u0010\'\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00072\b\b\u0001\u0010)\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010+J0\u0010,\u001a\u00020\u00032\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010/J\"\u00100\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u00101\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J,\u00102\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u00103\u001a\u00020\u00052\b\b\u0001\u00104\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J&\u00105\u001a\u00020\u00032\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J\u0018\u00107\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u00108\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u000e\u00109\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J0\u0010:\u001a\u00020\u00032\b\b\u0001\u0010;\u001a\u00020\u00052\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010=\u001a\u00020>H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010?\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J>\u0010@\u001a\u00020\u00032\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010C\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010DJ\u0018\u0010E\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010F\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010GJ\u0018\u0010H\u001a\u00020I2\b\b\u0001\u0010J\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010K\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010N\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010O\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010P\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010GJ\u0018\u0010Q\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010GJR\u0010R\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010S\u001a\u00020\u00052\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010V\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010WJ<\u0010X\u001a\u00020\u00032\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00072\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010ZH\u00a7@\u00a2\u0006\u0002\u0010[J:\u0010\\\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00072\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010]J,\u0010^\u001a\u00020\u00032\b\b\u0001\u00106\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010Y\u001a\u00020ZH\u00a7@\u00a2\u0006\u0002\u0010_J,\u0010`\u001a\u00020\u00032\b\b\u0001\u00106\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010Y\u001a\u00020ZH\u00a7@\u00a2\u0006\u0002\u0010_J\u000e\u0010a\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010b\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010c\u001a\u00020dH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010e\u001a\u00020fH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010g\u001a\u00020h2\b\b\u0001\u0010i\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J6\u0010j\u001a\u00020k2\b\b\u0001\u0010l\u001a\u00020\u00052\b\b\u0001\u0010A\u001a\u00020\u00052\b\b\u0001\u0010B\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010DJ\"\u0010m\u001a\u00020n2\b\b\u0001\u0010o\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J\u0018\u0010p\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016JF\u0010q\u001a\u00020\u00032\b\b\u0001\u0010r\u001a\u00020\u00052\b\b\u0001\u0010s\u001a\u00020\u00072\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010vJN\u0010w\u001a\u00020\u00032\b\b\u0001\u0010r\u001a\u00020\u00052\b\b\u0001\u0010s\u001a\u00020\u00072\b\b\u0001\u0010x\u001a\u00020y2\b\b\u0001\u0010z\u001a\u00020y2\n\b\u0003\u0010t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010u\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010{J:\u0010|\u001a\u00020\u00032\b\b\u0001\u0010r\u001a\u00020\u00052\b\b\u0001\u0010s\u001a\u00020\u00072\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010}J\u000e\u0010~\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u007f\u001a\u00020\u00032\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0081\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J#\u0010\u0082\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u00101\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J\u000f\u0010\u0083\u0001\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0084\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0085\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0086\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J5\u0010\u0088\u0001\u001a\u00020\u00032\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u008b\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u00052\u000b\b\u0001\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0003\u0010\u008d\u0001J-\u0010\u008e\u0001\u001a\u00020$2\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010%\u001a\u00020\u00052\b\b\u0001\u0010o\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J#\u0010\u008f\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u00101\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J4\u0010\u0090\u0001\u001a\u00020$2\t\b\u0001\u0010\u0091\u0001\u001a\u00020\u00052\u000b\b\u0003\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0094\u0001\u001a\u00020\u00032\t\b\u0001\u0010\u0095\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J;\u0010\u0096\u0001\u001a\u00030\u0097\u00012\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\t\b\u0001\u0010\u0099\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010DJ\u000f\u0010\u009b\u0001\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J4\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001b\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\t\b\u0001\u0010\u00a1\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u001b\u0010\u00a2\u0001\u001a\u00030\u00a0\u00012\t\b\u0001\u0010\u00a3\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u001b\u0010\u00a4\u0001\u001a\u00030\u00a0\u00012\t\b\u0001\u0010\u00a5\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016Jo\u0010\u00a6\u0001\u001a\u00030\u00a7\u00012\t\b\u0001\u0010\u00a8\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00a9\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00aa\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00ab\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00af\u0001Jy\u0010\u00b0\u0001\u001a\u00030\u00b1\u00012\t\b\u0001\u0010\u00b2\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00b3\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00b4\u0001\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\t\b\u0001\u0010\u00b5\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00b8\u0001JN\u0010\u00b9\u0001\u001a\u00030\u00b1\u00012\t\b\u0001\u0010\u00ba\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00bc\u0001J\u00bf\u0001\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\b\b\u0001\u0010\u0019\u001a\u00020\u00052\u000b\b\u0001\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u00b6\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u00c1\u0001\u001a\u00020Z2\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u00052\f\b\u0003\u0010\u00c2\u0001\u001a\u0005\u0018\u00010\u00c3\u00012\u000b\b\u0003\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00c5\u0001Jy\u0010\u00c6\u0001\u001a\u00030\u00b1\u00012\t\b\u0001\u0010\u00b2\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00b3\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00b4\u0001\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\t\b\u0001\u0010\u00b5\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00b8\u0001J\u0094\u0001\u0010\u00c7\u0001\u001a\u00030\u00c8\u00012\u000b\b\u0003\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u00052\f\b\u0003\u0010\u00cd\u0001\u001a\u0005\u0018\u00010\u00c3\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u00ce\u0001J\u001b\u0010\u00cf\u0001\u001a\u00030\u0097\u00012\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016JK\u0010\u00d0\u0001\u001a\u00030\u00d1\u00012\b\b\u0001\u0010\u0019\u001a\u00020\u00052\u000b\b\u0001\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u00a8\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00bc\u0001J&\u0010\u00d2\u0001\u001a\u00030\u0097\u00012\t\b\u0001\u0010\u00d3\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!Jo\u0010\u00d4\u0001\u001a\u00030\u00d5\u00012\b\b\u0001\u0010l\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\t\b\u0001\u0010\u00a3\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0003\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00ad\u0001\u001a\u0004\u0018\u00010Z2\u000b\b\u0003\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00d6\u0001Jp\u0010\u00d7\u0001\u001a\u00030\u00d5\u00012\b\b\u0001\u0010l\u001a\u00020\u00052\t\b\u0001\u0010\u00d8\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00a3\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\u000b\b\u0003\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00ad\u0001\u001a\u0004\u0018\u00010Z2\u000b\b\u0003\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00d6\u0001J\'\u0010\u00d9\u0001\u001a\u00030\u00b1\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020Z2\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00db\u0001Je\u0010\u00dc\u0001\u001a\u00030\u00be\u00012\b\b\u0001\u0010\u0019\u001a\u00020\u00052\u000b\b\u0003\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00dd\u0001\u001a\u00020Z2\u000b\b\u0003\u0010\u00de\u0001\u001a\u0004\u0018\u00010Z2\u000b\b\u0003\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00df\u0001J\u00b0\u0001\u0010\u00e0\u0001\u001a\u00030\u00be\u00012\t\b\u0001\u0010\u00e1\u0001\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u008c\u0001\u001a\u00020\u00072\u000b\b\u0001\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u00b6\u0001\u001a\u00020\u00052\u000b\b\u0001\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u00052\f\b\u0003\u0010\u00c2\u0001\u001a\u0005\u0018\u00010\u00c3\u00012\u000b\b\u0003\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0003\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u00e4\u0001J3\u0010\u00e5\u0001\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u00e6\u0001\u001a\u00020\u00072\u000b\b\u0001\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ&\u0010\u00e8\u0001\u001a\u00020\u00032\t\b\u0001\u0010\u00e9\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00e6\u0001\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0003\u0010\u00ea\u0001J0\u0010\u00eb\u0001\u001a\u00030\u00ec\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\t\b\u0001\u0010\u00ed\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00ee\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J=\u0010\u00ef\u0001\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\t\b\u0001\u0010\u00f0\u0001\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0003\u0010\u00f1\u0001J\u001b\u0010\u00f2\u0001\u001a\u00030\u00f3\u00012\t\b\u0001\u0010\u00f4\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u00e0\u0001\u0010\u00f5\u0001\u001a\u00020L2\t\b\u0001\u0010\u00f6\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00f7\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00f8\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00f9\u0001\u001a\u00020\u00052\b\b\u0001\u0010M\u001a\u00020\u00052\t\b\u0001\u0010\u00fa\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00fb\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00ac\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00fc\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00b2\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00fd\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00fe\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u00ff\u0001\u001a\u00020\u00052\t\b\u0001\u0010\u0080\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0081\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0082\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0083\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0084\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0085\u0002\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u0086\u0002J%\u0010\u0087\u0002\u001a\u00020\u00032\t\b\u0001\u0010\u0088\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0089\u0002\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J?\u0010\u008a\u0002\u001a\u00030\u008b\u00022\b\b\u0001\u0010l\u001a\u00020\u00052\t\b\u0001\u0010\u008c\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u00052\f\b\u0001\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u00c3\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u008e\u0002J\u000f\u0010\u008f\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0090\u0002\u001a\u00020\u00032\t\b\u0001\u0010\u0088\u0002\u001a\u00020\u00052\t\b\u0001\u0010\u0089\u0002\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!J\u001a\u0010\u0091\u0002\u001a\u00020\u00032\t\b\u0001\u0010\u0095\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J$\u0010\u0092\u0002\u001a\u00020\u00032\t\b\u0001\u0010\u0095\u0001\u001a\u00020\u00052\b\b\u0001\u0010;\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010!JN\u0010\u0093\u0002\u001a\u00030\u0094\u00022\u000b\b\u0001\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u00052\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0003\u0010\u0097\u0002\u00a8\u0006\u0099\u0002"}, d2 = {"Lorg/wikipedia/dataclient/Service;", "", "fullTextSearch", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse;", "searchTerm", "", "gsrLimit", "", "gsrOffset", "(Ljava/lang/String;ILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fullTextSearchCommons", "fullTextSearchTemplates", "getAllNotifications", "wikiList", "filter", "continueStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthManagerForLogin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthManagerInfo", "getCategories", "titles", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoriesProps", "getCategoryMembers", "title", "type", "count", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClaims", "Lorg/wikipedia/dataclient/wikidata/Claims;", "entity", "property", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDescription", "getEntitiesByTitleSuspend", "Lorg/wikipedia/dataclient/wikidata/Entities;", "sites", "getGeoSearch", "coordinates", "radius", "ggsLimit", "coLimit", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrowthTasks", "taskTypes", "topics", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageInfo", "lang", "getImageInfoWithEntityTerms", "metadataLang", "entityLang", "getInfoByPageIdsOrTitles", "pageIds", "getLangLinks", "getLastModified", "getLoginToken", "getMessages", "messages", "args", "getNewCaptcha", "Lorg/wikipedia/captcha/Captcha;", "getPageIds", "getPageNamespaceWithSiteInfo", "saveHeader", "langHeader", "titleHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPageViewsForTitles", "getPagesWithImageRecommendations", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParamInfo", "Lorg/wikipedia/dataclient/mwapi/ParamInfoResponse;", "modules", "getPaymentMethods", "Lorg/wikipedia/dataclient/donate/PaymentResponseContainer;", "country", "getProtection", "getProtectionWithUserInfo", "getRandomImages", "getRandomPages", "getRecentEdits", "startTimeStamp", "direction", "latestRevisions", "filters", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevisionDetailsAscending", "revisionStartId", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevisionDetailsDescending", "(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevisionDetailsWithInfo", "(Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevisionDetailsWithUserInfo", "getSiteInfo", "getSiteInfoWithMagicWords", "getSiteMatrix", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix;", "getStreamConfigs", "Lorg/wikipedia/dataclient/mwapi/MwStreamConfigsResponse;", "getTalkPageTopicSubscriptions", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsSubscriptionList;", "topicNames", "getTalkPageTopics", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsInfoResponse;", "page", "getTemplateData", "Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse;", "langCode", "getToken", "getUserContrib", "username", "maxCount", "ns", "uccontinue", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserContribsByTimeFrame", "startDate", "Ljava/time/Instant;", "endDate", "(Ljava/lang/String;ILjava/time/Instant;Ljava/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserContributions", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "getUserList", "userNames", "getVariantTitlesByTitles", "getVideoInfo", "getWatchToken", "getWatchedStatus", "getWatchedStatusWithCategories", "getWatchedStatusWithRights", "getWatchedStatusWithUserOptions", "getWatchlist", "showCriteria", "typeOfChanges", "getWikiTextForSectionWithInfo", "section", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWikidataDescription", "getWikidataEntityTerms", "getWikidataLabelsAndDescriptions", "idList", "languages", "siteFilter", "globalUserInfo", "userName", "invalidateImageRecommendation", "Lorg/wikipedia/dataclient/mwapi/MwPostResponse;", "taskType", "fileName", "token", "lastUnreadNotification", "markRead", "readList", "unreadList", "parsePage", "Lorg/wikipedia/dataclient/mwapi/MwParseResponse;", "pageTitle", "parseText", "text", "parseTextForMainPage", "mainPageTitle", "postCreateAccount", "Lorg/wikipedia/dataclient/mwapi/CreateAccountResponse;", "user", "pass", "retype", "returnurl", "email", "captchaId", "captchaWord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postDescriptionEdit", "Lorg/wikipedia/dataclient/wikidata/EntityPostResponse;", "language", "useLang", "site", "newDescription", "summary", "tags", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEditEntity", "id", "data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEditSubmit", "Lorg/wikipedia/edit/Edit;", "newSectionTitle", "appendText", "baseRevId", "minor", "", "watchlist", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLabelEdit", "postLogIn", "Lorg/wikipedia/login/LoginResponse;", "twoFactorCode", "emailAuthToken", "returnUrl", "loginToken", "loginContinue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLogout", "postRollback", "Lorg/wikipedia/dataclient/rollback/RollbackPostResponse;", "postSetOptions", "change", "postTalkPageTopic", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsEditResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postTalkPageTopicReply", "commentId", "postThanksToRevision", "revisionId", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postUndoEdit", "undoRevId", "undoRevAfter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postVisualEditorEdit", "action", "plugins", "imageRecommendationJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prefixSearch", "maxResults", "gpsOffset", "prefixSearchUsers", "prefix", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchEntities", "Lorg/wikipedia/dataclient/wikidata/Search;", "searchLang", "resultLang", "searchMoreLike", "piLimit", "(Ljava/lang/String;IILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shortenUrl", "Lorg/wikipedia/dataclient/mwapi/ShortenUrlResponse;", "url", "submitPayment", "amount", "appVersion", "banner", "city", "currency", "donorCountry", "fullName", "recurring", "paymentToken", "optIn", "payTheFee", "paymentMethod", "paymentNetwork", "postalCode", "stateProvince", "streetAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribePush", "csrfToken", "providerToken", "subscribeTalkPageTopic", "Lorg/wikipedia/dataclient/discussiontools/DiscussionToolsSubscribeResponse;", "topicName", "subscribe", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unreadNotificationWikis", "unsubscribePush", "userInfo", "userInfoWithMessages", "watch", "Lorg/wikipedia/dataclient/watch/WatchPostResponse;", "unwatch", "expiry", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app.lib"})
public abstract interface Service {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKIPEDIA_URL = "https://wikipedia.org/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKIDATA_URL = "https://www.wikidata.org/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMONS_URL = "https://commons.wikimedia.org/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URL_FRAGMENT_FROM_COMMONS = "/wikipedia/commons/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MW_API_PREFIX = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&";
    public static final int PREFERRED_THUMB_SIZE = 320;
    public static final int SITE_INFO_MAXAGE = 86400;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.Service.Companion Companion = null;
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&redirects=&converttitles=&prop=description|pageimages|coordinates|info&piprop=thumbnail&pilicense=any&generator=prefixsearch&gpsnamespace=0&inprop=varianttitles|displaytitle&pithumbsize=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object prefixSearch(@retrofit2.http.Query(value = "gpssearch")
    @org.jetbrains.annotations.Nullable()
    java.lang.String searchTerm, @retrofit2.http.Query(value = "gpslimit")
    int maxResults, @retrofit2.http.Query(value = "gpsoffset")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer gpsOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&converttitles=&prop=description|pageimages|pageprops|coordinates|info&ppprop=mainpage|disambiguation&generator=search&gsrnamespace=0&gsrwhat=text&inprop=varianttitles|displaytitle&gsrinfo=&gsrprop=redirecttitle&piprop=thumbnail&pilicense=any&pithumbsize=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fullTextSearch(@retrofit2.http.Query(value = "gsrsearch")
    @org.jetbrains.annotations.Nullable()
    java.lang.String searchTerm, @retrofit2.http.Query(value = "gsrlimit")
    int gsrLimit, @retrofit2.http.Query(value = "gsroffset")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer gsrOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=allusers&auwitheditsonly=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object prefixSearchUsers(@retrofit2.http.Query(value = "auprefix")
    @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @retrofit2.http.Query(value = "aulimit")
    int maxResults, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=search&prop=imageinfo&iiprop=extmetadata|url&gsrnamespace=6&iiurlwidth=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fullTextSearchCommons(@retrofit2.http.Query(value = "gsrsearch")
    @org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @retrofit2.http.Query(value = "gsrlimit")
    int gsrLimit, @retrofit2.http.Query(value = "gsroffset")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer gsrOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&converttitles=&prop=description|info&generator=search&gsrnamespace=0&gsrwhat=text&inprop=varianttitles|displaytitle&gsrinfo=&gsrprop=redirecttitle")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fullTextSearchTemplates(@retrofit2.http.Query(value = "gsrsearch")
    @org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @retrofit2.http.Query(value = "gsrlimit")
    int gsrLimit, @retrofit2.http.Query(value = "gsroffset")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer gsrOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=search&gsrnamespace=0&gsrqiprofile=classic_noboostlinks&origin=*&piprop=thumbnail&pilicense=any&prop=pageimages|description|info|pageprops&inprop=varianttitles&smaxage=86400&maxage=86400&pithumbsize=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMoreLike(@retrofit2.http.Query(value = "gsrsearch")
    @org.jetbrains.annotations.Nullable()
    java.lang.String searchTerm, @retrofit2.http.Query(value = "gsrlimit")
    int gsrLimit, @retrofit2.http.Query(value = "pilimit")
    int piLimit, @retrofit2.http.Query(value = "gsroffset")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer gsrOffset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=fancycaptchareload")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNewCaptcha(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.captcha.Captcha> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=langlinks&lllimit=500&redirects=&converttitles=")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLangLinks(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=description&redirects=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDescription(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|description|pageimages&pilicense=any&inprop=varianttitles|displaytitle&redirects=1&pithumbsize=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getInfoByPageIdsOrTitles(@retrofit2.http.Query(value = "pageids")
    @org.jetbrains.annotations.Nullable()
    java.lang.String pageIds, @retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=siteinfo&siprop=general|autocreatetempuser")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPageIds(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=imageinfo&iiprop=timestamp|user|url|mime|metadata|extmetadata&iiurlwidth=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImageInfo(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "iiextmetadatalanguage")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=videoinfo&viprop=timestamp|user|url|mime|metadata|extmetadata|derivatives&viurlwidth=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideoInfo(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "viextmetadatalanguage")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=imageinfo|entityterms&iiprop=timestamp|user|url|mime|extmetadata&iiurlwidth=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImageInfoWithEntityTerms(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "iiextmetadatalanguage")
    @org.jetbrains.annotations.NotNull()
    java.lang.String metadataLang, @retrofit2.http.Query(value = "wbetlanguage")
    @org.jetbrains.annotations.NotNull()
    java.lang.String entityLang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&inprop=protection")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProtection(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=userinfo&prop=info&inprop=protection&uiprop=groups")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProtectionWithUserInfo(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=sitematrix&smtype=language&smlangprop=code|name|localname&maxage=86400&smaxage=86400")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSiteMatrix(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.SiteMatrix> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=siteinfo&siprop=namespaces")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPageNamespaceWithSiteInfo(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.Nullable()
    java.lang.String title, @retrofit2.http.Header(value = "X-Offline-Save")
    @org.jetbrains.annotations.Nullable()
    java.lang.String saveHeader, @retrofit2.http.Header(value = "X-Offline-Lang")
    @org.jetbrains.annotations.Nullable()
    java.lang.String langHeader, @retrofit2.http.Header(value = "X-Offline-Title")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titleHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=siteinfo&maxage=86400&smaxage=86400")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSiteInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=siteinfo&siprop=general|magicwords")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSiteInfoWithMagicWords(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=parse&prop=text&mobileformat=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object parsePage(@retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pageTitle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwParseResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=parse&prop=text&mobileformat=1&contentmodel=wikitext&disablelimitreport=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object parseText(@retrofit2.http.Query(value = "text")
    @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwParseResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=parse&prop=text&mobileformat=1&mainpage=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object parseTextForMainPage(@retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mainPageTitle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwParseResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&generator=categories&inprop=varianttitles|displaytitle&gclshow=!hidden&gcllimit=500")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategories(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=categories&clshow=!hidden&cllimit=100")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategoriesProps(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=description|pageimages|info&pilicense=any&generator=categorymembers&inprop=varianttitles|displaytitle&gcmprop=ids|title")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategoryMembers(@retrofit2.http.Query(value = "gcmtitle")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Query(value = "gcmtype")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "gcmlimit")
    int count, @retrofit2.http.Query(value = "gcmcontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=random&redirects=1&grnnamespace=0&prop=pageprops|description|info&inprop=protection")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRandomPages(@retrofit2.http.Query(value = "grnlimit")
    int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=random&redirects=1&grnnamespace=6&prop=info|description|imageinfo|revisions|globalusage&inprop=protection&gunamespace=0&rvprop=ids|timestamp|flags|comment|user|content&rvslots=mediainfo&iiprop=timestamp|user|url|mime|extmetadata&iilocalonly=1&iiurlwidth=320")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRandomImages(@retrofit2.http.Query(value = "grnlimit")
    int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=recentchanges&rcprop=title|timestamp|ids|oresscores|sizes|tags|user|parsedcomment|comment|flags&rcnamespace=0&rctype=edit|new")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecentEdits(@retrofit2.http.Query(value = "rclimit")
    int count, @retrofit2.http.Query(value = "rcstart")
    @org.jetbrains.annotations.NotNull()
    java.lang.String startTimeStamp, @retrofit2.http.Query(value = "rcdir")
    @org.jetbrains.annotations.Nullable()
    java.lang.String direction, @retrofit2.http.Query(value = "rctoponly")
    @org.jetbrains.annotations.Nullable()
    java.lang.String latestRevisions, @retrofit2.http.Query(value = "rcshow")
    @org.jetbrains.annotations.Nullable()
    java.lang.String filters, @retrofit2.http.Query(value = "rccontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=options")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postSetOptions(@retrofit2.http.Field(value = "change")
    @org.jetbrains.annotations.NotNull()
    java.lang.String change, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwPostResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=streamconfigs&format=json&constraints=destination_event_service=eventgate-analytics-external")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStreamConfigs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwStreamConfigsResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=allmessages&amenableparser=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessages(@retrofit2.http.Query(value = "ammessages")
    @org.jetbrains.annotations.NotNull()
    java.lang.String messages, @retrofit2.http.Query(value = "amargs")
    @org.jetbrains.annotations.Nullable()
    java.lang.String args, @retrofit2.http.Query(value = "amlang")
    @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=shortenurl")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object shortenUrl(@retrofit2.http.Field(value = "url")
    @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.ShortenUrlResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=geosearch&prop=coordinates|description|pageimages|info&inprop=varianttitles|displaytitle&pilicense=any")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGeoSearch(@retrofit2.http.Query(value = "ggscoord", encoded = true)
    @org.jetbrains.annotations.NotNull()
    java.lang.String coordinates, @retrofit2.http.Query(value = "ggsradius")
    int radius, @retrofit2.http.Query(value = "ggslimit")
    int ggsLimit, @retrofit2.http.Query(value = "colimit")
    int coLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "api.php?format=json&action=getPaymentMethods")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaymentMethods(@retrofit2.http.Query(value = "country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.donate.PaymentResponseContainer> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "api.php?format=json&action=submitPayment")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object submitPayment(@retrofit2.http.Field(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount, @retrofit2.http.Field(value = "app_version")
    @org.jetbrains.annotations.NotNull()
    java.lang.String appVersion, @retrofit2.http.Field(value = "banner")
    @org.jetbrains.annotations.NotNull()
    java.lang.String banner, @retrofit2.http.Field(value = "city")
    @org.jetbrains.annotations.NotNull()
    java.lang.String city, @retrofit2.http.Field(value = "country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country, @retrofit2.http.Field(value = "currency")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @retrofit2.http.Field(value = "donor_country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String donorCountry, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull()
    java.lang.String email, @retrofit2.http.Field(value = "full_name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @retrofit2.http.Field(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Field(value = "recurring")
    @org.jetbrains.annotations.NotNull()
    java.lang.String recurring, @retrofit2.http.Field(value = "payment_token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paymentToken, @retrofit2.http.Field(value = "opt_in")
    @org.jetbrains.annotations.NotNull()
    java.lang.String optIn, @retrofit2.http.Field(value = "pay_the_fee")
    @org.jetbrains.annotations.NotNull()
    java.lang.String payTheFee, @retrofit2.http.Field(value = "payment_method")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod, @retrofit2.http.Field(value = "payment_network")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paymentNetwork, @retrofit2.http.Field(value = "postal_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @retrofit2.http.Field(value = "state_province")
    @org.jetbrains.annotations.NotNull()
    java.lang.String stateProvince, @retrofit2.http.Field(value = "street_address")
    @org.jetbrains.annotations.NotNull()
    java.lang.String streetAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.donate.PaymentResponseContainer> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getToken(@retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=createaccount&createmessageformat=html")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postCreateAccount(@retrofit2.http.Field(value = "username")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @retrofit2.http.Field(value = "retype")
    @org.jetbrains.annotations.NotNull()
    java.lang.String retype, @retrofit2.http.Field(value = "createtoken")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "createreturnurl")
    @org.jetbrains.annotations.NotNull()
    java.lang.String returnurl, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.Nullable()
    java.lang.String email, @retrofit2.http.Field(value = "captchaId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @retrofit2.http.Field(value = "captchaWord")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.CreateAccountResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens&type=login")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLoginToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=clientlogin&rememberMe=")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postLogIn(@retrofit2.http.Field(value = "username")
    @org.jetbrains.annotations.Nullable()
    java.lang.String user, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.Nullable()
    java.lang.String pass, @retrofit2.http.Field(value = "retype")
    @org.jetbrains.annotations.Nullable()
    java.lang.String retype, @retrofit2.http.Field(value = "OATHToken")
    @org.jetbrains.annotations.Nullable()
    java.lang.String twoFactorCode, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.Nullable()
    java.lang.String emailAuthToken, @retrofit2.http.Field(value = "captchaId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @retrofit2.http.Field(value = "captchaWord")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @retrofit2.http.Field(value = "loginreturnurl")
    @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, @retrofit2.http.Field(value = "logintoken")
    @org.jetbrains.annotations.Nullable()
    java.lang.String loginToken, @retrofit2.http.Field(value = "logincontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean loginContinue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.login.LoginResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=logout")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postLogout(@retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwPostResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=authmanagerinfo|tokens&amirequestsfor=create&type=createaccount")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAuthManagerInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=authmanagerinfo&amirequestsfor=login")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAuthManagerForLogin(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=userinfo&uiprop=groups|blockinfo|editcount|latestcontrib|hasmsg|options")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=users&usprop=editcount|groups|registration|rights")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object userInfo(@retrofit2.http.Query(value = "ususers")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=users&usprop=editcount|groups|registration|rights&meta=allmessages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object userInfoWithMessages(@retrofit2.http.Query(value = "ususers")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @retrofit2.http.Query(value = "ammessages")
    @org.jetbrains.annotations.NotNull()
    java.lang.String messages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=globaluserinfo&guiprop=editcount|groups|rights")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object globalUserInfo(@retrofit2.http.Query(value = "guiuser")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=users&usprop=groups|cancreate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserList(@retrofit2.http.Query(value = "ususers")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userNames, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=notifications&notformat=model&notlimit=max")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllNotifications(@retrofit2.http.Query(value = "notwikis")
    @org.jetbrains.annotations.Nullable()
    java.lang.String wikiList, @retrofit2.http.Query(value = "notfilter")
    @org.jetbrains.annotations.Nullable()
    java.lang.String filter, @retrofit2.http.Query(value = "notcontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=echomarkread")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markRead(@retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "list")
    @org.jetbrains.annotations.Nullable()
    java.lang.String readList, @retrofit2.http.Field(value = "unreadlist")
    @org.jetbrains.annotations.Nullable()
    java.lang.String unreadList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=notifications&notwikis=*&notprop=list&notfilter=!read&notlimit=1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object lastUnreadNotification(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=unreadnotificationpages&unplimit=max&unpwikis=*")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object unreadNotificationWikis(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=echopushsubscriptions&command=create&provider=fcm")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object subscribePush(@retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, @retrofit2.http.Field(value = "providertoken")
    @org.jetbrains.annotations.NotNull()
    java.lang.String providerToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=echopushsubscriptions&command=delete&provider=fcm")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object unsubscribePush(@retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String csrfToken, @retrofit2.http.Field(value = "providertoken")
    @org.jetbrains.annotations.NotNull()
    java.lang.String providerToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=revisions|info&meta=siteinfo&siprop=general|autocreatetempuser&rvslots=main&rvprop=content|timestamp|ids&rvlimit=1&converttitles=&intestactions=edit&intestactionsdetail=full&inprop=editintro")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWikiTextForSectionWithInfo(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Query(value = "rvsection")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer section, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=edit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postUndoEdit(@retrofit2.http.Field(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "assert")
    @org.jetbrains.annotations.Nullable()
    java.lang.String user, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "undo")
    long undoRevId, @retrofit2.http.Field(value = "undoafter")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long undoRevAfter, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.edit.Edit> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=edit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postEditSubmit(@retrofit2.http.Field(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "section")
    @org.jetbrains.annotations.Nullable()
    java.lang.String section, @retrofit2.http.Field(value = "sectiontitle")
    @org.jetbrains.annotations.Nullable()
    java.lang.String newSectionTitle, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @retrofit2.http.Field(value = "assert")
    @org.jetbrains.annotations.Nullable()
    java.lang.String user, @retrofit2.http.Field(value = "text")
    @org.jetbrains.annotations.Nullable()
    java.lang.String text, @retrofit2.http.Field(value = "appendtext")
    @org.jetbrains.annotations.Nullable()
    java.lang.String appendText, @retrofit2.http.Field(value = "baserevid")
    long baseRevId, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "captchaid")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @retrofit2.http.Field(value = "captchaword")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @retrofit2.http.Field(value = "minor")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean minor, @retrofit2.http.Field(value = "watchlist")
    @org.jetbrains.annotations.Nullable()
    java.lang.String watchlist, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.edit.Edit> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=visualeditoredit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postVisualEditorEdit(@retrofit2.http.Field(value = "paction")
    @org.jetbrains.annotations.NotNull()
    java.lang.String action, @retrofit2.http.Field(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "section")
    int section, @retrofit2.http.Field(value = "sectiontitle")
    @org.jetbrains.annotations.Nullable()
    java.lang.String newSectionTitle, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @retrofit2.http.Field(value = "assert")
    @org.jetbrains.annotations.Nullable()
    java.lang.String user, @retrofit2.http.Field(value = "captchaid")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @retrofit2.http.Field(value = "captchaword")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @retrofit2.http.Field(value = "minor")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean minor, @retrofit2.http.Field(value = "watchlist")
    @org.jetbrains.annotations.Nullable()
    java.lang.String watchlist, @retrofit2.http.Field(value = "plugins")
    @org.jetbrains.annotations.Nullable()
    java.lang.String plugins, @retrofit2.http.Field(value = "data-ge-task-image-recommendation")
    @org.jetbrains.annotations.Nullable()
    java.lang.String imageRecommendationJson, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.edit.Edit> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=usercontribs&ucprop=ids|title|timestamp|comment|size|flags|sizediff|tags&meta=userinfo&uiprop=groups|blockinfo|editcount|latestcontrib|rights|registrationdate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserContributions(@retrofit2.http.Query(value = "ucuser")
    @org.jetbrains.annotations.NotNull()
    java.lang.String username, @retrofit2.http.Query(value = "uclimit")
    int maxCount, @retrofit2.http.Query(value = "ucnamespace")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer ns, @retrofit2.http.Query(value = "uccontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String uccontinue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=usercontribs&ucprop=ids|title|timestamp|comment|size|flags|sizediff|tags")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserContrib(@retrofit2.http.Query(value = "ucuser")
    @org.jetbrains.annotations.NotNull()
    java.lang.String username, @retrofit2.http.Query(value = "uclimit")
    int maxCount, @retrofit2.http.Query(value = "ucnamespace")
    @org.jetbrains.annotations.Nullable()
    java.lang.String ns, @retrofit2.http.Query(value = "ucshow")
    @org.jetbrains.annotations.Nullable()
    java.lang.String filter, @retrofit2.http.Query(value = "uccontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String uccontinue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=usercontribs&meta=userinfo&uiprop=editcount")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserContribsByTimeFrame(@retrofit2.http.Query(value = "ucuser")
    @org.jetbrains.annotations.NotNull()
    java.lang.String username, @retrofit2.http.Query(value = "uclimit")
    int maxCount, @retrofit2.http.Query(value = "ucstart")
    @org.jetbrains.annotations.NotNull()
    java.time.Instant startDate, @retrofit2.http.Query(value = "ucend")
    @org.jetbrains.annotations.NotNull()
    java.time.Instant endDate, @retrofit2.http.Query(value = "ucnamespace")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer ns, @retrofit2.http.Query(value = "uccontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String uccontinue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=pageviews")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPageViewsForTitles(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=rollback")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postRollback(@retrofit2.http.Field(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "user")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.rollback.RollbackPostResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetentities")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEntitiesByTitleSuspend(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "sites")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sites, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.Entities> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsearchentities&type=item&limit=20")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchEntities(@retrofit2.http.Query(value = "search")
    @org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String searchLang, @retrofit2.http.Query(value = "uselang")
    @org.jetbrains.annotations.NotNull()
    java.lang.String resultLang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.Search> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=entityterms")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWikidataEntityTerms(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "wbetlanguage")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetclaims")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getClaims(@retrofit2.http.Query(value = "entity")
    @org.jetbrains.annotations.NotNull()
    java.lang.String entity, @retrofit2.http.Query(value = "property")
    @org.jetbrains.annotations.Nullable()
    java.lang.String property, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.Claims> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetentities&props=descriptions|labels|sitelinks")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWikidataLabelsAndDescriptions(@retrofit2.http.Query(value = "ids")
    @org.jetbrains.annotations.NotNull()
    java.lang.String idList, @retrofit2.http.Query(value = "languages")
    @org.jetbrains.annotations.Nullable()
    java.lang.String languages, @retrofit2.http.Query(value = "sitefilter")
    @org.jetbrains.annotations.Nullable()
    java.lang.String siteFilter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.Entities> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetentities&props=descriptions|labels")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWikidataDescription(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "sites")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sites, @retrofit2.http.Query(value = "languages")
    @org.jetbrains.annotations.NotNull()
    java.lang.String langCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.Entities> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsetdescription&errorlang=uselang")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postDescriptionEdit(@retrofit2.http.Field(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Field(value = "uselang")
    @org.jetbrains.annotations.NotNull()
    java.lang.String useLang, @retrofit2.http.Field(value = "site")
    @org.jetbrains.annotations.NotNull()
    java.lang.String site, @retrofit2.http.Field(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "value")
    @org.jetbrains.annotations.NotNull()
    java.lang.String newDescription, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "assert")
    @org.jetbrains.annotations.Nullable()
    java.lang.String user, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.EntityPostResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsetlabel&errorlang=uselang")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postLabelEdit(@retrofit2.http.Field(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Field(value = "uselang")
    @org.jetbrains.annotations.NotNull()
    java.lang.String useLang, @retrofit2.http.Field(value = "site")
    @org.jetbrains.annotations.NotNull()
    java.lang.String site, @retrofit2.http.Field(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "value")
    @org.jetbrains.annotations.NotNull()
    java.lang.String newDescription, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "assert")
    @org.jetbrains.annotations.Nullable()
    java.lang.String user, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.EntityPostResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbeditentity&errorlang=uselang")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postEditEntity(@retrofit2.http.Field(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "data")
    @org.jetbrains.annotations.Nullable()
    java.lang.String data, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.EntityPostResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&converttitles=&redirects=&inprop=watched")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWatchedStatus(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&converttitles=&redirects=&inprop=watched&meta=userinfo&uiprop=options")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWatchedStatusWithUserOptions(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&converttitles=&redirects=&inprop=watched&meta=userinfo&uiprop=rights")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWatchedStatusWithRights(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|categories&converttitles=&redirects=&inprop=watched&clshow=!hidden&cllimit=100")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWatchedStatusWithCategories(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=watchlist&wllimit=500&wlprop=ids|title|flags|comment|parsedcomment|timestamp|sizes|user|loginfo")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWatchlist(@retrofit2.http.Query(value = "wlallrev")
    @org.jetbrains.annotations.Nullable()
    java.lang.String latestRevisions, @retrofit2.http.Query(value = "wlshow")
    @org.jetbrains.annotations.Nullable()
    java.lang.String showCriteria, @retrofit2.http.Query(value = "wltype")
    @org.jetbrains.annotations.Nullable()
    java.lang.String typeOfChanges, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=revisions&rvslots=main&rvprop=timestamp|user|ids|comment|tags")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLastModified(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|revisions&rvslots=main&rvprop=ids|timestamp|size|flags|comment|parsedcomment|user|oresscores&rvdir=newer")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRevisionDetailsAscending(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titles, @retrofit2.http.Query(value = "pageids")
    @org.jetbrains.annotations.Nullable()
    java.lang.String pageIds, @retrofit2.http.Query(value = "rvlimit")
    int count, @retrofit2.http.Query(value = "rvstartid")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long revisionStartId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|revisions&rvslots=main&rvprop=ids|timestamp|size|flags|comment|parsedcomment|user|oresscores&rvdir=older")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRevisionDetailsDescending(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @retrofit2.http.Query(value = "rvlimit")
    int count, @retrofit2.http.Query(value = "rvstartid")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long revisionStartId, @retrofit2.http.Query(value = "rvcontinue")
    @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|revisions&rvslots=main&rvprop=ids|timestamp|size|flags|comment|parsedcomment|user|oresscores&rvdir=older")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRevisionDetailsWithInfo(@retrofit2.http.Query(value = "pageids")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pageIds, @retrofit2.http.Query(value = "rvlimit")
    int count, @retrofit2.http.Query(value = "rvstartid")
    long revisionStartId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|revisions&rvslots=main&rvprop=ids|timestamp|size|flags|comment|parsedcomment|user|oresscores&rvdir=older&inprop=watched&meta=userinfo&uiprop=rights")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRevisionDetailsWithUserInfo(@retrofit2.http.Query(value = "pageids")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pageIds, @retrofit2.http.Query(value = "rvlimit")
    int count, @retrofit2.http.Query(value = "rvstartid")
    long revisionStartId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=thank")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postThanksToRevision(@retrofit2.http.Field(value = "rev")
    long revisionId, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.wikidata.EntityPostResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=watch&converttitles=&redirects=")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object watch(@retrofit2.http.Field(value = "unwatch")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer unwatch, @retrofit2.http.Field(value = "pageids")
    @org.jetbrains.annotations.Nullable()
    java.lang.String pageIds, @retrofit2.http.Field(value = "titles")
    @org.jetbrains.annotations.Nullable()
    java.lang.String titles, @retrofit2.http.Field(value = "expiry")
    @org.jetbrains.annotations.Nullable()
    java.lang.String expiry, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.watch.WatchPostResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens&type=watch")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWatchToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=discussiontoolspageinfo&prop=threaditemshtml")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTalkPageTopics(@retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String page, @retrofit2.http.Header(value = "X-Offline-Save")
    @org.jetbrains.annotations.NotNull()
    java.lang.String saveHeader, @retrofit2.http.Header(value = "X-Offline-Lang")
    @org.jetbrains.annotations.NotNull()
    java.lang.String langHeader, @retrofit2.http.Header(value = "X-Offline-Title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titleHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.discussiontools.DiscussionToolsInfoResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=discussiontoolssubscribe")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object subscribeTalkPageTopic(@retrofit2.http.Field(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String page, @retrofit2.http.Field(value = "commentname")
    @org.jetbrains.annotations.NotNull()
    java.lang.String topicName, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "subscribe")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subscribe, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.discussiontools.DiscussionToolsSubscribeResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=discussiontoolsgetsubscriptions")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTalkPageTopicSubscriptions(@retrofit2.http.Query(value = "commentname")
    @org.jetbrains.annotations.NotNull()
    java.lang.String topicNames, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.discussiontools.DiscussionToolsSubscriptionList> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=discussiontoolsedit&paction=addtopic")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postTalkPageTopic(@retrofit2.http.Field(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String page, @retrofit2.http.Field(value = "sectiontitle")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "wikitext")
    @org.jetbrains.annotations.NotNull()
    java.lang.String text, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "captchaid")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long captchaId, @retrofit2.http.Field(value = "captchaword")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.discussiontools.DiscussionToolsEditResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=discussiontoolsedit&paction=addcomment")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postTalkPageTopicReply(@retrofit2.http.Field(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String page, @retrofit2.http.Field(value = "commentid")
    @org.jetbrains.annotations.NotNull()
    java.lang.String commentId, @retrofit2.http.Field(value = "wikitext")
    @org.jetbrains.annotations.NotNull()
    java.lang.String text, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "summary")
    @org.jetbrains.annotations.Nullable()
    java.lang.String summary, @retrofit2.http.Field(value = "captchaid")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long captchaId, @retrofit2.http.Field(value = "captchaword")
    @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord, @retrofit2.http.Field(value = "matags")
    @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.discussiontools.DiscussionToolsEditResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=growthtasks")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGrowthTasks(@retrofit2.http.Query(value = "ggttasktypes")
    @org.jetbrains.annotations.Nullable()
    java.lang.String taskTypes, @retrofit2.http.Query(value = "ggttopics")
    @org.jetbrains.annotations.Nullable()
    java.lang.String topics, @retrofit2.http.Query(value = "ggtlimit")
    int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=search&gsrsearch=hasrecommendation%3Aimage&gsrnamespace=0&gsrsort=random&prop=growthimagesuggestiondata|revisions|pageimages&pilicense=any&rvprop=ids|timestamp|flags|comment|user|content&rvslots=main&rvsection=0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPagesWithImageRecommendations(@retrofit2.http.Query(value = "gsrlimit")
    int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=growthinvalidateimagerecommendation")
    @retrofit2.http.FormUrlEncoded()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object invalidateImageRecommendation(@retrofit2.http.Field(value = "tasktype")
    @org.jetbrains.annotations.NotNull()
    java.lang.String taskType, @retrofit2.http.Field(value = "title")
    @org.jetbrains.annotations.NotNull()
    java.lang.String title, @retrofit2.http.Field(value = "filename")
    @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwPostResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=paraminfo")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getParamInfo(@retrofit2.http.Query(value = "modules")
    @org.jetbrains.annotations.NotNull()
    java.lang.String modules, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.ParamInfoResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=templatedata&includeMissingTitles=&converttitles=")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTemplateData(@retrofit2.http.Query(value = "lang")
    @org.jetbrains.annotations.NotNull()
    java.lang.String langCode, @retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.TemplateDataResponse> $completion);
    
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&converttitles=&inprop=varianttitles")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVariantTitlesByTitles(@retrofit2.http.Query(value = "titles")
    @org.jetbrains.annotations.NotNull()
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/Service$Companion;", "", "()V", "COMMONS_URL", "", "MW_API_PREFIX", "PREFERRED_THUMB_SIZE", "", "SITE_INFO_MAXAGE", "URL_FRAGMENT_FROM_COMMONS", "WIKIDATA_URL", "WIKIPEDIA_URL", "app.lib"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WIKIPEDIA_URL = "https://wikipedia.org/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WIKIDATA_URL = "https://www.wikidata.org/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMMONS_URL = "https://commons.wikimedia.org/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String URL_FRAGMENT_FROM_COMMONS = "/wikipedia/commons/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MW_API_PREFIX = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&";
        public static final int PREFERRED_THUMB_SIZE = 320;
        public static final int SITE_INFO_MAXAGE = 86400;
        
        private Companion() {
            super();
        }
    }
    
    /**
     * Retrofit service layer for all API interactions, including regular MediaWiki and RESTBase.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}