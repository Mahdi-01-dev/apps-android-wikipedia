package org.wikipedia.edit.templates;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.adapter.PagingDataAdapterPatched;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.ActivityTemplatesSearchBinding;
import org.wikipedia.databinding.ItemTemplatesSearchBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.TemplateDataResponse;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0004+,-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001dJ\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u001dH\u0002J\u000e\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "insertTemplateFragment", "Lorg/wikipedia/edit/templates/InsertTemplateFragment;", "searchCloseListener", "Landroidx/appcompat/widget/SearchView$OnCloseListener;", "searchQueryListener", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "templatesSearchAdapter", "Lorg/wikipedia/edit/templates/TemplatesSearchActivity$TemplatesSearchAdapter;", "viewModel", "Lorg/wikipedia/edit/templates/TemplatesSearchViewModel;", "getViewModel", "()Lorg/wikipedia/edit/templates/TemplatesSearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "closeSearch", "", "initSearchView", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendPatrollerExperienceEvent", "action", "", "activeInterface", "actionData", "showInsertTemplateFragment", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "templateData", "Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;", "startSearch", "term", "updateInsertButton", "enabled", "", "updateToolbarElevation", "Companion", "TemplatesSearchAdapter", "TemplatesSearchDiffCallback", "TemplatesSearchItemHolder", "app.lib"})
public final class TemplatesSearchActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityTemplatesSearchBinding binding;
    private org.wikipedia.edit.templates.InsertTemplateFragment insertTemplateFragment;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.edit.templates.TemplatesSearchActivity.TemplatesSearchAdapter templatesSearchAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.SearchView.OnCloseListener searchCloseListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.SearchView.OnQueryTextListener searchQueryListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FROM_DIFF = "isFromDiff";
    public static final int RESULT_INSERT_TEMPLATE_SUCCESS = 100;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_WIKI_TEXT = "resultWikiText";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.templates.TemplatesSearchActivity.Companion Companion = null;
    
    public TemplatesSearchActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.templates.TemplatesSearchViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initSearchView() {
    }
    
    private final void startSearch(java.lang.String term) {
    }
    
    private final void closeSearch() {
    }
    
    private final void showInsertTemplateFragment(org.wikipedia.page.PageTitle pageTitle, org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData) {
    }
    
    public final void updateInsertButton(boolean enabled) {
    }
    
    private final void updateToolbarElevation(boolean enabled) {
    }
    
    public final void sendPatrollerExperienceEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String activeInterface, @org.jetbrains.annotations.NotNull()
    java.lang.String actionData) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchActivity$Companion;", "", "()V", "EXTRA_FROM_DIFF", "", "RESULT_INSERT_TEMPLATE_SUCCESS", "", "RESULT_WIKI_TEXT", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "isFromDiff", "", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, boolean isFromDiff, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchActivity$TemplatesSearchAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/page/PageTitle;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/edit/templates/TemplatesSearchActivity;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "Lorg/wikipedia/edit/templates/TemplatesSearchActivity$TemplatesSearchItemHolder;", "Lorg/wikipedia/edit/templates/TemplatesSearchActivity;", "parent", "Landroid/view/ViewGroup;", "pos", "app.lib"})
    final class TemplatesSearchAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.page.PageTitle, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public TemplatesSearchAdapter() {
            super(null, null, null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.edit.templates.TemplatesSearchActivity.TemplatesSearchItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchActivity$TemplatesSearchDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/edit/templates/TemplatesSearchActivity;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    final class TemplatesSearchDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.page.PageTitle> {
        
        public TemplatesSearchDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle oldItem, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/templates/TemplatesSearchActivity$TemplatesSearchItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/edit/templates/TemplatesSearchActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    final class TemplatesSearchItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ItemTemplatesSearchBinding binding = null;
        
        public TemplatesSearchItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemTemplatesSearchBinding getBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle) {
        }
    }
}