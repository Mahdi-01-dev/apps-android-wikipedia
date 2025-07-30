package org.wikipedia.edit;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.csrf.CsrfTokenClient;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.mwapi.MwServiceError;
import org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.Resource;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010F\u001a\u00020GJI\u0010H\u001a\u00020G2\b\u0010I\u001a\u0004\u0018\u00010\u00162\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u00122\b\u0010N\u001a\u0004\u0018\u00010\u00122\b\u0010O\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010PJ\u000e\u0010Q\u001a\u00020G2\u0006\u0010R\u001a\u00020\fR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u001c\u0010-\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R\u001c\u0010;\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\u001a\u0010>\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010\u001aR\u001c\u0010A\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R\u001d\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\u001e\u00a8\u0006S"}, d2 = {"Lorg/wikipedia/edit/EditSectionViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_fetchSectionTextState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "_postEditState", "Lorg/wikipedia/edit/Edit;", "_waitForRevisionState", "", "clientJob", "Lkotlinx/coroutines/Job;", "currentRevision", "editNotices", "", "", "getEditNotices", "()Ljava/util/List;", "editingAllowed", "", "getEditingAllowed", "()Z", "setEditingAllowed", "(Z)V", "fetchSectionTextState", "Lkotlinx/coroutines/flow/StateFlow;", "getFetchSectionTextState", "()Lkotlinx/coroutines/flow/StateFlow;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "setInvokeSource", "(Lorg/wikipedia/Constants$InvokeSource;)V", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "setPageTitle", "(Lorg/wikipedia/page/PageTitle;)V", "postEditState", "getPostEditState", "sectionAnchor", "getSectionAnchor", "()Ljava/lang/String;", "setSectionAnchor", "(Ljava/lang/String;)V", "sectionID", "", "getSectionID", "()I", "setSectionID", "(I)V", "sectionWikitext", "getSectionWikitext", "setSectionWikitext", "sectionWikitextOriginal", "getSectionWikitextOriginal", "setSectionWikitextOriginal", "tempAccountsEnabled", "getTempAccountsEnabled", "setTempAccountsEnabled", "textToHighlight", "getTextToHighlight", "setTextToHighlight", "waitForRevisionState", "getWaitForRevisionState", "fetchSectionText", "", "postEdit", "isMinorEdit", "watchThisPage", "summaryText", "editSectionText", "editTags", "captchaId", "captchaWord", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "waitForRevisionUpdate", "newRevision", "app.lib"})
public final class EditSectionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle pageTitle;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private int sectionID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionAnchor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String textToHighlight;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionWikitext;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionWikitextOriginal;
    private boolean tempAccountsEnabled = true;
    private boolean editingAllowed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> editNotices = null;
    private long currentRevision = 0L;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwServiceError>> _fetchSectionTextState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwServiceError>> fetchSectionTextState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.edit.Edit>> _postEditState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.edit.Edit>> postEditState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<java.lang.Long>> _waitForRevisionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Long>> waitForRevisionState = null;
    
    public EditSectionViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final void setPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    public final void setInvokeSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource p0) {
    }
    
    public final int getSectionID() {
        return 0;
    }
    
    public final void setSectionID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSectionAnchor() {
        return null;
    }
    
    public final void setSectionAnchor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTextToHighlight() {
        return null;
    }
    
    public final void setTextToHighlight(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSectionWikitext() {
        return null;
    }
    
    public final void setSectionWikitext(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSectionWikitextOriginal() {
        return null;
    }
    
    public final void setSectionWikitextOriginal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getTempAccountsEnabled() {
        return false;
    }
    
    public final void setTempAccountsEnabled(boolean p0) {
    }
    
    public final boolean getEditingAllowed() {
        return false;
    }
    
    public final void setEditingAllowed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getEditNotices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.dataclient.mwapi.MwServiceError>> getFetchSectionTextState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.edit.Edit>> getPostEditState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<java.lang.Long>> getWaitForRevisionState() {
        return null;
    }
    
    public final void fetchSectionText() {
    }
    
    public final void postEdit(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isMinorEdit, @org.jetbrains.annotations.NotNull()
    java.lang.String watchThisPage, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryText, @org.jetbrains.annotations.NotNull()
    java.lang.String editSectionText, @org.jetbrains.annotations.NotNull()
    java.lang.String editTags, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
    java.lang.String captchaWord) {
    }
    
    public final void waitForRevisionUpdate(long newRevision) {
    }
}