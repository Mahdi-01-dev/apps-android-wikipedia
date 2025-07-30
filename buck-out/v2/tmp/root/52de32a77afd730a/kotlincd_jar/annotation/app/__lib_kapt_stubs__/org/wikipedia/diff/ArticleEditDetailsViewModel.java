package org.wikipedia.diff;

import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.dataclient.restbase.DiffResponse;
import org.wikipedia.dataclient.restbase.Revision;
import org.wikipedia.dataclient.rollback.RollbackPostResponse;
import org.wikipedia.dataclient.wikidata.EntityPostResponse;
import org.wikipedia.edit.Edit;
import org.wikipedia.edit.EditTags;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.provider.EditingSuggestionsProvider;
import org.wikipedia.util.Resource;
import org.wikipedia.util.SingleLiveData;
import org.wikipedia.watchlist.WatchlistExpiry;
import org.wikipedia.watchlist.WatchlistViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\u00020*2\u0006\u0010U\u001a\u0002032\u0006\u0010V\u001a\u000203H\u0002J\u0010\u0010W\u001a\u00020P2\u0006\u0010X\u001a\u00020PH\u0002J\b\u0010Y\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020*2\u0006\u0010Z\u001a\u0002032\b\b\u0002\u0010[\u001a\u000203J\u0006\u0010\\\u001a\u00020*J\u0006\u0010]\u001a\u00020*J\u0016\u0010^\u001a\u00020*2\u0006\u0010_\u001a\u00020%2\u0006\u0010`\u001a\u00020PJ\u0016\u0010a\u001a\u00020*2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u000203J.\u0010e\u001a\u00020*2\u0006\u0010_\u001a\u00020%2\u0006\u0010`\u001a\u00020P2\u0006\u0010f\u001a\u00020P2\u0006\u0010d\u001a\u0002032\u0006\u0010g\u001a\u000203J\u000e\u0010h\u001a\u00020*2\u0006\u0010i\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000eR\u001e\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020%@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0014R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R\u001a\u0010;\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00110?\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001d\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0014R\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0014R\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00110?\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010BR\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00110?\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010BR)\u0010N\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020P0O0\u00110?\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010BR\u001d\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0014\u00a8\u0006j"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "canGoForward", "", "getCanGoForward", "()Z", "setCanGoForward", "(Z)V", "diffSize", "", "getDiffSize", "()I", "diffText", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/dataclient/restbase/DiffResponse;", "getDiffText", "()Landroidx/lifecycle/MutableLiveData;", "fromRecentEdits", "getFromRecentEdits", "hasRollbackRights", "getHasRollbackRights", "setHasRollbackRights", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isWatched", "setWatched", "ns", "getNs", "setNs", "(I)V", "<set-?>", "pageId", "getPageId", "Lorg/wikipedia/page/PageTitle;", "pageTitle", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "revisionDetails", "", "getRevisionDetails", "revisionFrom", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "getRevisionFrom", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "setRevisionFrom", "(Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;)V", "revisionFromId", "", "getRevisionFromId", "()J", "setRevisionFromId", "(J)V", "revisionTo", "getRevisionTo", "setRevisionTo", "revisionToId", "getRevisionToId", "setRevisionToId", "rollbackResponse", "Lorg/wikipedia/util/SingleLiveData;", "Lorg/wikipedia/dataclient/rollback/RollbackPostResponse;", "getRollbackResponse", "()Lorg/wikipedia/util/SingleLiveData;", "rollbackRights", "getRollbackRights", "singleRevisionText", "Lorg/wikipedia/dataclient/restbase/Revision;", "getSingleRevisionText", "thankStatus", "Lorg/wikipedia/dataclient/wikidata/EntityPostResponse;", "getThankStatus", "undoEditResponse", "Lorg/wikipedia/edit/Edit;", "getUndoEditResponse", "watchResponse", "Lkotlin/Pair;", "", "getWatchResponse", "watchedStatus", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getWatchedStatus", "oldRevisionId", "newRevisionId", "getEditTags", "tag", "getNextRecentEdit", "revisionIdTo", "revisionIdFrom", "goBackward", "goForward", "postRollback", "title", "user", "sendThanks", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "revisionId", "undoEdit", "comment", "revisionIdAfter", "watchOrUnwatch", "unwatch", "app.lib"})
public final class ArticleEditDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwQueryPage>> watchedStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> rollbackRights = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<kotlin.Unit>> revisionDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.restbase.DiffResponse>> diffText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.restbase.Revision>> singleRevisionText = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.wikidata.EntityPostResponse>> thankStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<kotlin.Pair<java.lang.Boolean, java.lang.String>>> watchResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.edit.Edit>> undoEditResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.rollback.RollbackPostResponse>> rollbackResponse = null;
    private final boolean fromRecentEdits = false;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle pageTitle;
    private int pageId;
    private long revisionToId;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revisionTo;
    private long revisionFromId;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage.Revision revisionFrom;
    private boolean canGoForward = false;
    private boolean hasRollbackRights = false;
    private boolean isWatched = false;
    private int ns = 0;
    
    public ArticleEditDetailsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwQueryPage>> getWatchedStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> getRollbackRights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<kotlin.Unit>> getRevisionDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.restbase.DiffResponse>> getDiffText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.restbase.Revision>> getSingleRevisionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.wikidata.EntityPostResponse>> getThankStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<kotlin.Pair<java.lang.Boolean, java.lang.String>>> getWatchResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.edit.Edit>> getUndoEditResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.dataclient.rollback.RollbackPostResponse>> getRollbackResponse() {
        return null;
    }
    
    public final boolean getFromRecentEdits() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final int getPageId() {
        return 0;
    }
    
    public final long getRevisionToId() {
        return 0L;
    }
    
    public final void setRevisionToId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision getRevisionTo() {
        return null;
    }
    
    public final void setRevisionTo(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryPage.Revision p0) {
    }
    
    public final long getRevisionFromId() {
        return 0L;
    }
    
    public final void setRevisionFromId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage.Revision getRevisionFrom() {
        return null;
    }
    
    public final void setRevisionFrom(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryPage.Revision p0) {
    }
    
    public final boolean getCanGoForward() {
        return false;
    }
    
    public final void setCanGoForward(boolean p0) {
    }
    
    public final boolean getHasRollbackRights() {
        return false;
    }
    
    public final void setHasRollbackRights(boolean p0) {
    }
    
    public final boolean isWatched() {
        return false;
    }
    
    public final void setWatched(boolean p0) {
    }
    
    public final int getNs() {
        return 0;
    }
    
    public final void setNs(int p0) {
    }
    
    public final int getDiffSize() {
        return 0;
    }
    
    public final void getRevisionDetails(long revisionIdTo, long revisionIdFrom) {
    }
    
    private final void getNextRecentEdit() {
    }
    
    public final void goBackward() {
    }
    
    public final void goForward() {
    }
    
    private final void getDiffText(long oldRevisionId, long newRevisionId) {
    }
    
    public final void sendThanks(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, long revisionId) {
    }
    
    public final void watchOrUnwatch(boolean unwatch) {
    }
    
    public final void undoEdit(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String comment, long revisionId, long revisionIdAfter) {
    }
    
    public final void postRollback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String user) {
    }
    
    private final java.lang.String getEditTags(java.lang.String tag) {
        return null;
    }
}