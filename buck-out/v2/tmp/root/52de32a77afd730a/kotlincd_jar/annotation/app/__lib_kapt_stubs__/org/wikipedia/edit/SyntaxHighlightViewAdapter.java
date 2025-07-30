package org.wikipedia.edit;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.wikipedia.Constants;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.edit.insertmedia.InsertMediaActivity;
import org.wikipedia.edit.templates.TemplatesSearchActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.ExclusiveBottomSheetPresenter;
import org.wikipedia.page.PageTitle;
import org.wikipedia.page.linkpreview.LinkPreviewDialog;
import org.wikipedia.search.SearchActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010\'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/edit/SyntaxHighlightViewAdapter;", "Lorg/wikipedia/edit/WikiTextKeyboardView$Callback;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "editText", "Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "wikiTextKeyboardView", "Lorg/wikipedia/edit/WikiTextKeyboardView;", "wikiTextKeyboardFormattingView", "Lorg/wikipedia/edit/WikiTextKeyboardFormattingView;", "wikiTextKeyboardHeadingsView", "Lorg/wikipedia/edit/WikiTextKeyboardHeadingsView;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "requestInsertMedia", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "isFromDiff", "", "showUserMention", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/edit/SyntaxHighlightableEditText;Lorg/wikipedia/edit/WikiTextKeyboardView;Lorg/wikipedia/edit/WikiTextKeyboardFormattingView;Lorg/wikipedia/edit/WikiTextKeyboardHeadingsView;Lorg/wikipedia/Constants$InvokeSource;Landroidx/activity/result/ActivityResultLauncher;ZZ)V", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "getEditText", "()Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "requestInsertTemplate", "requestLinkFromSearch", "hideAllSyntaxModals", "", "onPreviewLink", "title", "", "onRequestFormatting", "onRequestHeading", "onRequestInsertLink", "onRequestInsertMedia", "onRequestInsertTemplate", "onSyntaxOverlayCollapse", "app.lib"})
public final class SyntaxHighlightViewAdapter implements org.wikipedia.edit.WikiTextKeyboardView.Callback {
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.SyntaxHighlightableEditText editText = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.WikiTextKeyboardView wikiTextKeyboardView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.WikiTextKeyboardFormattingView wikiTextKeyboardFormattingView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.WikiTextKeyboardHeadingsView wikiTextKeyboardHeadingsView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestInsertMedia = null;
    private final boolean isFromDiff = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestLinkFromSearch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestInsertTemplate = null;
    
    public SyntaxHighlightViewAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.SyntaxHighlightableEditText editText, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.WikiTextKeyboardView wikiTextKeyboardView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.WikiTextKeyboardFormattingView wikiTextKeyboardFormattingView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.WikiTextKeyboardHeadingsView wikiTextKeyboardHeadingsView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestInsertMedia, boolean isFromDiff, boolean showUserMention) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.SyntaxHighlightableEditText getEditText() {
        return null;
    }
    
    @java.lang.Override()
    public void onPreviewLink(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void onRequestInsertMedia() {
    }
    
    @java.lang.Override()
    public void onRequestInsertTemplate() {
    }
    
    @java.lang.Override()
    public void onRequestInsertLink() {
    }
    
    @java.lang.Override()
    public void onRequestHeading() {
    }
    
    @java.lang.Override()
    public void onRequestFormatting() {
    }
    
    @java.lang.Override()
    public void onSyntaxOverlayCollapse() {
    }
    
    private final void hideAllSyntaxModals() {
    }
}