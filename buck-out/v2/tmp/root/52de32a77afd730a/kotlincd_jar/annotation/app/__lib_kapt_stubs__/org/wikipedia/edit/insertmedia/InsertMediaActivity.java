package org.wikipedia.edit.insertmedia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.ActionMode;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.MenuItemCompat;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.adapter.PagingDataAdapterPatched;
import org.wikipedia.analytics.eventplatform.ImageRecommendationsEvent;
import org.wikipedia.commons.FilePageActivity;
import org.wikipedia.databinding.ActivityInsertMediaBinding;
import org.wikipedia.databinding.ItemEditActionbarButtonBinding;
import org.wikipedia.databinding.ItemInsertMediaBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.history.SearchActionModeCallback;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.ImageZoomHelper;
import org.wikipedia.views.SearchActionProvider;
import org.wikipedia.views.ViewUtil;
import org.wikipedia.views.imageservice.ImageLoadListener;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 +2\u00020\u0001:\u0005+,-./B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0006\u0010(\u001a\u00020\u0017J\b\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00060"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "insertMediaAdapter", "Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$InsertMediaAdapter;", "insertMediaAdvancedSettingsFragment", "Lorg/wikipedia/edit/insertmedia/InsertMediaAdvancedSettingsFragment;", "insertMediaSettingsFragment", "Lorg/wikipedia/edit/insertmedia/InsertMediaSettingsFragment;", "searchActionModeCallback", "Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$SearchCallback;", "viewModel", "Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "getViewModel", "()Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adjustRefreshViewLayoutParams", "", "removeLayoutBehavior", "", "applyActionBarButtonStyle", "menuItem", "Landroid/view/MenuItem;", "emphasize", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "onPrepareOptionsMenu", "showMediaAdvancedSettingsFragment", "showMediaSettingsFragment", "showSelectedImage", "Companion", "InsertMediaAdapter", "InsertMediaDiffCallback", "InsertMediaItemHolder", "SearchCallback", "app.lib"})
public final class InsertMediaActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityInsertMediaBinding binding;
    private org.wikipedia.edit.insertmedia.InsertMediaSettingsFragment insertMediaSettingsFragment;
    private org.wikipedia.edit.insertmedia.InsertMediaAdvancedSettingsFragment insertMediaAdvancedSettingsFragment;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.edit.insertmedia.InsertMediaActivity.InsertMediaAdapter insertMediaAdapter;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.insertmedia.InsertMediaActivity.SearchCallback searchActionModeCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SEARCH_QUERY = "searchQuery";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_IMAGE_TITLE = "imageTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_IMAGE_SOURCE = "imageSource";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_IMAGE_SOURCE_PROJECTS = "imageSourceProjects";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ATTEMPT_INSERT_INTO_INFOBOX = "attemptInsertIntoInfobox";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_INSERTED_INTO_INFOBOX = "insertedIntoInfobox";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_IMAGE_CAPTION = "resultImageCaption";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_IMAGE_ALT = "resultImageAlt";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_IMAGE_SIZE = "resultImageSize";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_IMAGE_TYPE = "resultImageType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_IMAGE_POS = "resultImagePos";
    public static final int RESULT_INSERT_MEDIA_SUCCESS = 100;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.insertmedia.InsertMediaActivity.Companion Companion = null;
    
    public InsertMediaActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.insertmedia.InsertMediaViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void adjustRefreshViewLayoutParams(boolean removeLayoutBehavior) {
    }
    
    private final void applyActionBarButtonStyle(android.view.MenuItem menuItem, boolean emphasize) {
    }
    
    private final void showMediaSettingsFragment() {
    }
    
    public final void showMediaAdvancedSettingsFragment() {
    }
    
    private final void showSelectedImage() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JF\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$Companion;", "", "()V", "EXTRA_ATTEMPT_INSERT_INTO_INFOBOX", "", "EXTRA_IMAGE_SOURCE", "EXTRA_IMAGE_SOURCE_PROJECTS", "EXTRA_IMAGE_TITLE", "EXTRA_INSERTED_INTO_INFOBOX", "EXTRA_SEARCH_QUERY", "RESULT_IMAGE_ALT", "RESULT_IMAGE_CAPTION", "RESULT_IMAGE_POS", "RESULT_IMAGE_SIZE", "RESULT_IMAGE_TYPE", "RESULT_INSERT_MEDIA_SUCCESS", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "searchQuery", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "imageTitle", "Lorg/wikipedia/page/PageTitle;", "imageSource", "imageSourceProjects", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle imageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String imageSource, @org.jetbrains.annotations.NotNull()
        java.lang.String imageSourceProjects) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$InsertMediaAdapter;", "Lorg/wikipedia/adapter/PagingDataAdapterPatched;", "Lorg/wikipedia/page/PageTitle;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$InsertMediaItemHolder;", "Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;", "parent", "Landroid/view/ViewGroup;", "pos", "app.lib"})
    final class InsertMediaAdapter extends org.wikipedia.adapter.PagingDataAdapterPatched<org.wikipedia.page.PageTitle, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public InsertMediaAdapter() {
            super(null, null, null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.edit.insertmedia.InsertMediaActivity.InsertMediaItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$InsertMediaDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app.lib"})
    final class InsertMediaDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.wikipedia.page.PageTitle> {
        
        public InsertMediaDiffCallback() {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$InsertMediaItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bindItem", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
    final class InsertMediaItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ItemInsertMediaBinding binding = null;
        
        public InsertMediaItemHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ItemInsertMediaBinding getBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaActivity$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/edit/insertmedia/InsertMediaActivity;)V", "searchActionProvider", "Lorg/wikipedia/views/SearchActionProvider;", "getSearchActionProvider", "()Lorg/wikipedia/views/SearchActionProvider;", "setSearchActionProvider", "(Lorg/wikipedia/views/SearchActionProvider;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app.lib"})
    final class SearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        @org.jetbrains.annotations.Nullable()
        private org.wikipedia.views.SearchActionProvider searchActionProvider;
        
        public SearchCallback() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.views.SearchActionProvider getSearchActionProvider() {
            return null;
        }
        
        public final void setSearchActionProvider(@org.jetbrains.annotations.Nullable()
        org.wikipedia.views.SearchActionProvider p0) {
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        protected void onQueryChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected java.lang.String getSearchHintString() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        protected android.content.Context getParentContext() {
            return null;
        }
    }
}