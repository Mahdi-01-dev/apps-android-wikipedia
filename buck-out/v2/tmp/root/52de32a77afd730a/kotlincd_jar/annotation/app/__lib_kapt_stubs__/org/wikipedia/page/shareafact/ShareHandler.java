package org.wikipedia.page.shareafact;

import android.os.Build;
import android.view.ActionMode;
import android.view.MenuItem;
import kotlinx.serialization.Serializable;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.bridge.CommunicationBridge;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.page.PageFragment;
import org.wikipedia.util.log.L;
import org.wikipedia.wiktionary.WiktionaryDialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler;", "", "fragment", "Lorg/wikipedia/page/PageFragment;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "(Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/bridge/CommunicationBridge;)V", "webViewActionMode", "Landroid/view/ActionMode;", "finishActionMode", "", "onEditHerePayload", "sectionID", "", "text", "", "isEditingDescription", "", "onTextSelected", "mode", "shouldEnableWiktionaryDialog", "showWiktionaryDefinition", "Companion", "RequestTextSelectOnMenuItemClickListener", "TextSelectResponse", "app.lib"})
public final class ShareHandler {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.bridge.CommunicationBridge bridge = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.ActionMode webViewActionMode;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PAYLOAD_PURPOSE_DEFINE = "define";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PAYLOAD_PURPOSE_EDIT_HERE = "edit_here";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.shareafact.ShareHandler.Companion Companion = null;
    
    public ShareHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge bridge) {
        super();
    }
    
    private final void onEditHerePayload(int sectionID, java.lang.String text, boolean isEditingDescription) {
    }
    
    private final void finishActionMode() {
    }
    
    public final void showWiktionaryDefinition(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onTextSelected(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    public final boolean shouldEnableWiktionaryDialog() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler$Companion;", "", "()V", "PAYLOAD_PURPOSE_DEFINE", "", "PAYLOAD_PURPOSE_EDIT_HERE", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler$RequestTextSelectOnMenuItemClickListener;", "Landroid/view/MenuItem$OnMenuItemClickListener;", "purpose", "", "(Lorg/wikipedia/page/shareafact/ShareHandler;Ljava/lang/String;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app.lib"})
    final class RequestTextSelectOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String purpose = null;
        
        public RequestTextSelectOnMenuItemClickListener(@org.jetbrains.annotations.NotNull()
        java.lang.String purpose) {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler$TextSelectResponse;", "", "()V", "isTitleDescription", "", "()Z", "section", "", "getSection", "()I", "text", "", "getText", "()Ljava/lang/String;", "app.lib"})
    static final class TextSelectResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = "";
        private final int section = 0;
        private final boolean isTitleDescription = false;
        
        public TextSelectResponse() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public final int getSection() {
            return 0;
        }
        
        public final boolean isTitleDescription() {
            return false;
        }
    }
}