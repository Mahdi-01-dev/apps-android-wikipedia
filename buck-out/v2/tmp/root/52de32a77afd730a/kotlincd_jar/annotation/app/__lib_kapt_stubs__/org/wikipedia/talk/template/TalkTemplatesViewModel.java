package org.wikipedia.talk.template;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.page.PageTitle;
import org.wikipedia.talk.TalkReplyActivity;
import org.wikipedia.talk.db.TalkTemplate;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.Resource;
import java.util.Collections;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u000278B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010+\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0-J\b\u0010.\u001a\u00020\nH\u0002J\u0006\u0010/\u001a\u00020\nJ\b\u00100\u001a\u00020\nH\u0002J\u0014\u00101\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0-J\u0016\u00102\u001a\u00020\n2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204J\u0006\u00106\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0010\u00a8\u00069"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_actionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState;", "_uiState", "Lorg/wikipedia/util/Resource;", "", "actionExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "actionState", "Lkotlinx/coroutines/flow/StateFlow;", "getActionState", "()Lkotlinx/coroutines/flow/StateFlow;", "exceptionHandler", "fromRevisionId", "", "getFromRevisionId", "()J", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "savedTemplatesList", "", "Lorg/wikipedia/talk/db/TalkTemplate;", "getSavedTemplatesList", "()Ljava/util/List;", "talkTemplatesList", "getTalkTemplatesList", "talkTemplatesRepository", "Lorg/wikipedia/talk/template/TalkTemplatesRepository;", "templateManagementMode", "", "getTemplateManagementMode", "()Z", "toRevisionId", "getToRevisionId", "uiState", "getUiState", "deleteTemplates", "talkTemplates", "", "loadSavedTemplates", "loadTalkTemplates", "resetOrder", "saveTemplates", "swapList", "oldPosition", "", "newPosition", "updateItemOrder", "ActionState", "Companion", "app.lib"})
public final class TalkTemplatesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.talk.template.TalkTemplatesRepository talkTemplatesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler actionExceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.talk.db.TalkTemplate> talkTemplatesList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.talk.db.TalkTemplate> savedTemplatesList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Unit>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.talk.template.TalkTemplatesViewModel.ActionState> _actionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.talk.template.TalkTemplatesViewModel.ActionState> actionState = null;
    private final boolean templateManagementMode = false;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    private final long fromRevisionId = 0L;
    private final long toRevisionId = 0L;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> savedMessagesTitleList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> savedMessagesSubjectList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> savedMessagesBodyList = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.template.TalkTemplatesViewModel.Companion Companion = null;
    
    public TalkTemplatesViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.talk.db.TalkTemplate> getTalkTemplatesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.talk.db.TalkTemplate> getSavedTemplatesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Unit>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.talk.template.TalkTemplatesViewModel.ActionState> getActionState() {
        return null;
    }
    
    public final boolean getTemplateManagementMode() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    public final long getFromRevisionId() {
        return 0L;
    }
    
    public final long getToRevisionId() {
        return 0L;
    }
    
    public final void loadTalkTemplates() {
    }
    
    private final void loadSavedTemplates() {
    }
    
    public final void swapList(int oldPosition, int newPosition) {
    }
    
    private final void resetOrder() {
    }
    
    public final void updateItemOrder() {
    }
    
    public final void saveTemplates(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.talk.db.TalkTemplate> talkTemplates) {
    }
    
    public final void deleteTemplates(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.talk.db.TalkTemplate> talkTemplates) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState;", "", "()V", "Added", "Deleted", "Error", "app.lib"})
    public static class ActionState {
        
        public ActionState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState$Added;", "Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState;", "()V", "app.lib"})
        public static final class Added extends org.wikipedia.talk.template.TalkTemplatesViewModel.ActionState {
            
            public Added() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState$Deleted;", "Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState;", "size", "", "(I)V", "getSize", "()I", "app.lib"})
        public static final class Deleted extends org.wikipedia.talk.template.TalkTemplatesViewModel.ActionState {
            private final int size = 0;
            
            public Deleted(int size) {
                super();
            }
            
            public final int getSize() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState$Error;", "Lorg/wikipedia/talk/template/TalkTemplatesViewModel$ActionState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "app.lib"})
        public static final class Error extends org.wikipedia.talk.template.TalkTemplatesViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesViewModel$Companion;", "", "()V", "savedMessagesBodyList", "", "", "savedMessagesSubjectList", "savedMessagesTitleList", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}