package org.wikipedia.talk;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.DiffUtil;
import org.wikipedia.Constants;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.talk.db.TalkPageSeen;
import org.wikipedia.util.Resource;
import org.wikipedia.util.SingleLiveData;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010B\u001a\u00020CJ\u0012\u0010D\u001a\u0004\u0018\u00010\r2\b\u0010E\u001a\u0004\u0018\u00010\u0006J$\u0010F\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0*2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J$\u0010J\u001a\u00020C2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0*2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\r0*H\u0002J\u0006\u0010M\u001a\u00020GJ\u0014\u0010N\u001a\u0004\u0018\u00010\u00062\b\u0010O\u001a\u0004\u0018\u00010\rH\u0002J\u000e\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020\rJ\u0006\u0010R\u001a\u00020GJ\u000e\u0010S\u001a\u00020G2\u0006\u0010T\u001a\u00020UJ\b\u0010V\u001a\u00020GH\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0*0!0)\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u001c\u0010<\u001a\u0004\u0018\u000105X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00107\"\u0004\b>\u00109R\u001c\u0010?\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\b\"\u0004\bA\u0010\n\u00a8\u0006W"}, d2 = {"Lorg/wikipedia/talk/TalkTopicViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "currentSearchQuery", "", "getCurrentSearchQuery", "()Ljava/lang/String;", "setCurrentSearchQuery", "(Ljava/lang/String;)V", "flattenedThreadItems", "", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "getFlattenedThreadItems", "()Ljava/util/List;", "isExpandable", "", "()Z", "isFullyExpanded", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "scrollTargetId", "getScrollTargetId", "setScrollTargetId", "sectionId", "", "getSectionId", "()I", "subscribeData", "Lorg/wikipedia/util/SingleLiveData;", "Lorg/wikipedia/util/Resource;", "getSubscribeData", "()Lorg/wikipedia/util/SingleLiveData;", "<set-?>", "subscribed", "getSubscribed", "threadItems", "threadItemsData", "Landroidx/lifecycle/MutableLiveData;", "", "getThreadItemsData", "()Landroidx/lifecycle/MutableLiveData;", "topic", "getTopic", "()Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "setTopic", "(Lorg/wikipedia/dataclient/discussiontools/ThreadItem;)V", "topicId", "topicName", "undoBody", "", "getUndoBody", "()Ljava/lang/CharSequence;", "setUndoBody", "(Ljava/lang/CharSequence;)V", "undoResponseData", "getUndoResponseData", "undoSubject", "getUndoSubject", "setUndoSubject", "undoTopicId", "getUndoTopicId", "setUndoTopicId", "expandOrCollapseAll", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "findTopicById", "id", "flattenThreadLevel", "", "list", "flatList", "getDiffResult", "prevList", "newList", "loadTopic", "threadSha", "threadItem", "toggleItemExpanded", "item", "toggleSubscription", "undo", "undoRevId", "", "updateFlattenedThreadItems", "app.lib"})
public final class TalkTopicViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topicName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topicId = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scrollTargetId;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> threadItems = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.discussiontools.ThreadItem topic;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> flattenedThreadItems = null;
    private boolean subscribed = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem>>> threadItemsData = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> subscribeData = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> undoResponseData = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence undoSubject;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence undoBody;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String undoTopicId;
    
    public TalkTopicViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentSearchQuery() {
        return null;
    }
    
    public final void setCurrentSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScrollTargetId() {
        return null;
    }
    
    public final void setScrollTargetId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.discussiontools.ThreadItem getTopic() {
        return null;
    }
    
    public final void setTopic(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.discussiontools.ThreadItem p0) {
    }
    
    public final int getSectionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> getFlattenedThreadItems() {
        return null;
    }
    
    public final boolean getSubscribed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem>>> getThreadItemsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> getSubscribeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> getUndoResponseData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getUndoSubject() {
        return null;
    }
    
    public final void setUndoSubject(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getUndoBody() {
        return null;
    }
    
    public final void setUndoBody(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUndoTopicId() {
        return null;
    }
    
    public final void setUndoTopicId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isExpandable() {
        return false;
    }
    
    public final boolean isFullyExpanded() {
        return false;
    }
    
    public final void loadTopic() {
    }
    
    public final void toggleSubscription() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.DiffResult toggleItemExpanded(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.discussiontools.ThreadItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.DiffResult expandOrCollapseAll() {
        return null;
    }
    
    private final androidx.recyclerview.widget.DiffUtil.DiffResult getDiffResult(java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> prevList, java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> newList) {
        return null;
    }
    
    public final void undo(long undoRevId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.discussiontools.ThreadItem findTopicById(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    private final java.lang.String threadSha(org.wikipedia.dataclient.discussiontools.ThreadItem threadItem) {
        return null;
    }
    
    private final void updateFlattenedThreadItems() {
    }
    
    private final void flattenThreadLevel(java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> list, java.util.List<org.wikipedia.dataclient.discussiontools.ThreadItem> flatList) {
    }
}