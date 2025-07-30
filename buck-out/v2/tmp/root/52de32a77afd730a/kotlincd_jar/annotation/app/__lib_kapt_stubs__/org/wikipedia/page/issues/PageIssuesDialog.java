package org.wikipedia.page.issues;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.R;
import org.wikipedia.databinding.DialogPageIssuesBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.DrawableItemDecoration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u0012H\u0016R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/page/issues/PageIssuesDialog;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "activity", "Landroid/app/Activity;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "pageIssues", "", "", "callback", "Lorg/wikipedia/page/issues/PageIssuesDialog$Callback;", "(Landroid/app/Activity;Lorg/wikipedia/dataclient/WikiSite;Ljava/util/List;Lorg/wikipedia/page/issues/PageIssuesDialog$Callback;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "getCallback", "()Lorg/wikipedia/page/issues/PageIssuesDialog$Callback;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "movementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "getPageIssues", "()Ljava/util/List;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "show", "Callback", "DefaultViewHolder", "EditNoticesAdapter", "app.lib"})
public final class PageIssuesDialog extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> pageIssues = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.issues.PageIssuesDialog.Callback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt movementMethod = null;
    
    public PageIssuesDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> pageIssues, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.issues.PageIssuesDialog.Callback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPageIssues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.issues.PageIssuesDialog.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog show() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/page/issues/PageIssuesDialog$Callback;", "", "onLinkClicked", "", "url", "", "title", "linkText", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onLinkClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String linkText);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0092\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/issues/PageIssuesDialog$DefaultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/page/issues/PageIssuesDialog;Landroid/view/View;)V", "bindItem", "", "position", "", "app.lib"})
    class DefaultViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public DefaultViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public void bindItem(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/issues/PageIssuesDialog$EditNoticesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/page/issues/PageIssuesDialog$DefaultViewHolder;", "Lorg/wikipedia/page/issues/PageIssuesDialog;", "(Lorg/wikipedia/page/issues/PageIssuesDialog;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class EditNoticesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.page.issues.PageIssuesDialog.DefaultViewHolder> {
        
        public EditNoticesAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.page.issues.PageIssuesDialog.DefaultViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.issues.PageIssuesDialog.DefaultViewHolder holder, int pos) {
        }
    }
}