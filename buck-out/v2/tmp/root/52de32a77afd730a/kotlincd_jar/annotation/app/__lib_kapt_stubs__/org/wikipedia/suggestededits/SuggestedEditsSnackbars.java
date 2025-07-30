package org.wikipedia.suggestededits;

import android.app.Activity;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.descriptions.DescriptionEditActivity.Action;
import org.wikipedia.util.FeedbackUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002JD\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsSnackbars;", "", "()V", "MAX_SHOW_PER_SESSION", "", "snackbarSessionMap", "", "", "getMapKey", "activity", "Landroid/app/Activity;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getSessionCount", "incrementSessionMap", "", "show", "sequentialSnackbar", "", "targetLanguageCode", "enableViewAction", "listener", "Lorg/wikipedia/suggestededits/SuggestedEditsSnackbars$OpenPageListener;", "showFeedLinkSnackbar", "OpenPageListener", "app.lib"})
public final class SuggestedEditsSnackbars {
    private static final int MAX_SHOW_PER_SESSION = 2;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.Integer> snackbarSessionMap = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsSnackbars INSTANCE = null;
    
    private SuggestedEditsSnackbars() {
        super();
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, boolean sequentialSnackbar, @org.jetbrains.annotations.Nullable()
    java.lang.String targetLanguageCode, boolean enableViewAction, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.SuggestedEditsSnackbars.OpenPageListener listener) {
    }
    
    private final void showFeedLinkSnackbar(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    private final void incrementSessionMap(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    private final int getSessionCount(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
        return 0;
    }
    
    private final java.lang.String getMapKey(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsSnackbars$OpenPageListener;", "", "open", "", "actionView", "Landroid/view/View;", "app.lib"})
    public static abstract interface OpenPageListener {
        
        public abstract void open(@org.jetbrains.annotations.NotNull()
        android.view.View actionView);
    }
}