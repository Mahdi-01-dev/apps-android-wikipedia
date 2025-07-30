package org.wikipedia.suggestededits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.databinding.ActivitySuggestedEditsFeedCardImageTagsBinding;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagEditActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "getPage", "()Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "setPage", "(Lorg/wikipedia/dataclient/mwapi/MwQueryPage;)V", "suggestedEditsImageTagsFragment", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsFragment;", "getLangCode", "", "getSinglePage", "logSuccess", "", "maybeShowOnboarding", "nextPage", "sourceFragment", "Landroidx/fragment/app/Fragment;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateActionButton", "Companion", "app.lib"})
public final class SuggestedEditsImageTagEditActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.suggestededits.SuggestedEditsItemFragment.Callback {
    private ActivitySuggestedEditsFeedCardImageTagsBinding binding;
    private org.wikipedia.suggestededits.SuggestedEditsImageTagsFragment suggestedEditsImageTagsFragment;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.mwapi.MwQueryPage page;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_PAGE = "imageTagPage";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageTagEditActivity.Companion Companion = null;
    
    public SuggestedEditsImageTagEditActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.mwapi.MwQueryPage getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.mwapi.MwQueryPage p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLangCode() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.dataclient.mwapi.MwQueryPage getSinglePage() {
        return null;
    }
    
    @java.lang.Override()
    public void updateActionButton() {
    }
    
    @java.lang.Override()
    public void nextPage(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment sourceFragment) {
    }
    
    @java.lang.Override()
    public void logSuccess() {
    }
    
    private final void maybeShowOnboarding() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagEditActivity$Companion;", "", "()V", "ARG_PAGE", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage page, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}