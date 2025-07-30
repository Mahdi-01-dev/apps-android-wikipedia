package org.wikipedia.talk;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.discussiontools.ThreadItem;
import org.wikipedia.edit.EditTags;
import org.wikipedia.page.PageTitle;
import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.talk.template.TalkTemplatesRepository;
import org.wikipedia.util.Resource;
import org.wikipedia.util.SingleLiveData;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020:H\u0002J\u0016\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>J\u001e\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>J&\u0010B\u001a\u00020:2\u0006\u0010A\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010C\u001a\u00020 R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00140\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010 \u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\b\"\u0004\b\'\u0010\nR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020 0)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\nR\u0011\u00101\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0011\u00103\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u000106\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108\u00a8\u0006D"}, d2 = {"Lorg/wikipedia/talk/TalkReplyViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "doesPageExist", "", "getDoesPageExist", "()Z", "setDoesPageExist", "(Z)V", "fromRevisionId", "", "getFromRevisionId", "()J", "isExampleTemplate", "isFromDiff", "isNewTopic", "pageExistsData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "getPageExistsData", "()Landroidx/lifecycle/MutableLiveData;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "postReplyData", "Lorg/wikipedia/util/SingleLiveData;", "getPostReplyData", "()Lorg/wikipedia/util/SingleLiveData;", "saveTemplateData", "Lorg/wikipedia/talk/db/TalkTemplate;", "getSaveTemplateData", "selectedTemplate", "getSelectedTemplate", "()Lorg/wikipedia/talk/db/TalkTemplate;", "talkTemplateSaved", "getTalkTemplateSaved", "setTalkTemplateSaved", "talkTemplatesList", "", "getTalkTemplatesList", "()Ljava/util/List;", "talkTemplatesRepository", "Lorg/wikipedia/talk/template/TalkTemplatesRepository;", "tempAccountsEnabled", "getTempAccountsEnabled", "setTempAccountsEnabled", "templateManagementMode", "getTemplateManagementMode", "toRevisionId", "getToRevisionId", "topic", "Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "getTopic", "()Lorg/wikipedia/dataclient/discussiontools/ThreadItem;", "checkPageExists", "", "loadTemplates", "postReply", "subject", "", "body", "saveTemplate", "title", "updateTemplate", "talkTemplate", "app.lib"})
public final class TalkReplyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.template.TalkTemplatesRepository talkTemplatesRepository = null;
    private boolean talkTemplateSaved = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.talk.db.TalkTemplate> talkTemplatesList = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.discussiontools.ThreadItem topic = null;
    private final boolean isFromDiff = false;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.talk.db.TalkTemplate selectedTemplate = null;
    private final boolean isExampleTemplate = false;
    private final boolean templateManagementMode = false;
    private final long fromRevisionId = 0L;
    private final long toRevisionId = 0L;
    private final boolean isNewTopic = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Long>> postReplyData = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.talk.db.TalkTemplate>> saveTemplateData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> pageExistsData = null;
    private boolean doesPageExist = false;
    private boolean tempAccountsEnabled = true;
    
    public TalkReplyViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final boolean getTalkTemplateSaved() {
        return false;
    }
    
    public final void setTalkTemplateSaved(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.talk.db.TalkTemplate> getTalkTemplatesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.discussiontools.ThreadItem getTopic() {
        return null;
    }
    
    public final boolean isFromDiff() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.talk.db.TalkTemplate getSelectedTemplate() {
        return null;
    }
    
    public final boolean isExampleTemplate() {
        return false;
    }
    
    public final boolean getTemplateManagementMode() {
        return false;
    }
    
    public final long getFromRevisionId() {
        return 0L;
    }
    
    public final long getToRevisionId() {
        return 0L;
    }
    
    public final boolean isNewTopic() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<java.lang.Long>> getPostReplyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.util.SingleLiveData<org.wikipedia.util.Resource<org.wikipedia.talk.db.TalkTemplate>> getSaveTemplateData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.lang.Boolean>> getPageExistsData() {
        return null;
    }
    
    public final boolean getDoesPageExist() {
        return false;
    }
    
    public final void setDoesPageExist(boolean p0) {
    }
    
    public final boolean getTempAccountsEnabled() {
        return false;
    }
    
    public final void setTempAccountsEnabled(boolean p0) {
    }
    
    @kotlin.Suppress(names = {"KotlinConstantConditions"})
    private final void checkPageExists() {
    }
    
    private final void loadTemplates() {
    }
    
    public final void postReply(@org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
    
    public final void saveTemplate(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
    
    public final void updateTemplate(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkTemplate talkTemplate) {
    }
}