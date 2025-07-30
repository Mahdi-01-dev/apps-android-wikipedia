package org.wikipedia.edit;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import org.wikipedia.edit.richtext.SyntaxHighlighter;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.views.FindInPageActionProvider;
import org.wikipedia.views.FindInPageActionProvider.FindInPageListener;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/edit/FindInEditorActionProvider;", "Lorg/wikipedia/views/FindInPageActionProvider;", "Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;", "scrollView", "Landroid/view/View;", "textView", "Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "syntaxHighlighter", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "actionMode", "Landroid/view/ActionMode;", "(Landroid/view/View;Lorg/wikipedia/edit/SyntaxHighlightableEditText;Lorg/wikipedia/edit/richtext/SyntaxHighlighter;Landroid/view/ActionMode;)V", "currentResultIndex", "", "resultPositions", "", "searchQuery", "", "onCloseClicked", "", "onCreateActionView", "menuItem", "Landroid/view/MenuItem;", "onFindNextClicked", "onFindNextLongClicked", "onFindPrevClicked", "onFindPrevLongClicked", "onSearchTextChanged", "text", "scrollToCurrentResult", "app.lib"})
public final class FindInEditorActionProvider extends org.wikipedia.views.FindInPageActionProvider implements org.wikipedia.views.FindInPageActionProvider.FindInPageListener {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View scrollView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.SyntaxHighlightableEditText textView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.ActionMode actionMode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> resultPositions = null;
    private int currentResultIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchQuery;
    
    public FindInEditorActionProvider(@org.jetbrains.annotations.NotNull()
    android.view.View scrollView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.SyntaxHighlightableEditText textView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter, @org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateActionView(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return null;
    }
    
    @java.lang.Override()
    public void onFindNextClicked() {
    }
    
    @java.lang.Override()
    public void onFindNextLongClicked() {
    }
    
    @java.lang.Override()
    public void onFindPrevClicked() {
    }
    
    @java.lang.Override()
    public void onFindPrevLongClicked() {
    }
    
    @java.lang.Override()
    public void onCloseClicked() {
    }
    
    @java.lang.Override()
    public void onSearchTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    private final void scrollToCurrentResult() {
    }
}