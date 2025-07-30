package org.wikipedia.settings.languages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.FragmentWikipediaLanguagesBinding;
import org.wikipedia.json.JsonUtil;
import org.wikipedia.language.addlanguages.AddLanguagesListActivity;
import org.wikipedia.push.WikipediaFirebaseMessagingService;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.SettingsActivity;
import org.wikipedia.views.DefaultViewHolder;
import org.wikipedia.views.MultiSelectActionModeCallback;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007FGHIJKLB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\"\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0018\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J$\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020!H\u0016J\u0010\u00108\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0010\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020!H\u0002J\u0010\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020\u0018H\u0002J\b\u0010?\u001a\u00020!H\u0002J\u0006\u0010@\u001a\u00020!J\u0010\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\u0012H\u0002J\b\u0010C\u001a\u00020!H\u0002J\b\u0010D\u001a\u00020!H\u0002J\b\u0010E\u001a\u00020\u0018H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/MenuProvider;", "Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$WikipediaLanguageItemAdapter;", "app", "Lorg/wikipedia/WikipediaApp;", "binding", "getBinding", "()Lerror/NonExistentClass;", "initialLanguageList", "", "interactionsCount", "", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isLanguageSearched", "", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "multiSelectCallback", "Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$MultiSelectCallback;", "selectedCodes", "", "wikipediaLanguages", "beginRemoveLanguageMode", "", "deleteSelectedLanguages", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCheckedChanged", "position", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLongPress", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "prepareWikipediaLanguagesList", "setMultiSelectEnabled", "enabled", "setupRecyclerView", "showRemoveLanguagesDialog", "toggleSelectedLanguage", "code", "unselectAllLanguages", "updateWikipediaLanguages", "wantResultFromItemClick", "Companion", "FooterViewHolder", "HeaderViewHolder", "MultiSelectCallback", "RearrangeableItemTouchHelperCallback", "WikipediaLanguageItemAdapter", "WikipediaLanguageItemHolder", "app.lib"})
public final class WikipediaLanguagesFragment extends androidx.fragment.app.Fragment implements androidx.core.view.MenuProvider, org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentWikipediaLanguagesBinding _binding;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private org.wikipedia.settings.languages.WikipediaLanguagesFragment.WikipediaLanguageItemAdapter adapter;
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private java.lang.String initialLanguageList;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.WikipediaApp app;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> wikipediaLanguages = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> selectedCodes = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.settings.languages.WikipediaLanguagesFragment.MultiSelectCallback multiSelectCallback = null;
    private int interactionsCount = 0;
    private boolean isLanguageSearched = false;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    private static final int VIEW_TYPE_FOOTER = 2;
    private static final int NUM_HEADERS = 1;
    private static final int NUM_FOOTERS = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVITY_RESULT_LANG_POSITION_DATA = "activity_result_lang_position_data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_LANGUAGE_INTERACTIONS = "add_language_interactions";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSION_TOKEN = "session_token";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.languages.WikipediaLanguagesFragment.Companion Companion = null;
    
    public WikipediaLanguagesFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCheckedChanged(int position) {
    }
    
    @java.lang.Override()
    public void onLongPress(int position) {
    }
    
    private final void prepareWikipediaLanguagesList() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void updateWikipediaLanguages() {
    }
    
    private final boolean wantResultFromItemClick() {
        return false;
    }
    
    private final void setMultiSelectEnabled(boolean enabled) {
    }
    
    private final void beginRemoveLanguageMode() {
    }
    
    private final void toggleSelectedLanguage(java.lang.String code) {
    }
    
    private final void unselectAllLanguages() {
    }
    
    private final void deleteSelectedLanguages() {
    }
    
    public final void showRemoveLanguagesDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$Companion;", "", "()V", "ACTIVITY_RESULT_LANG_POSITION_DATA", "", "ADD_LANGUAGE_INTERACTIONS", "NUM_FOOTERS", "", "NUM_HEADERS", "SESSION_TOKEN", "VIEW_TYPE_FOOTER", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "newInstance", "Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.settings.languages.WikipediaLanguagesFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$FooterViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;Landroid/view/View;)V", "app.lib"})
    final class FooterViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$HeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;Landroid/view/View;)V", "app.lib"})
    final class HeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$MultiSelectCallback;", "Lorg/wikipedia/views/MultiSelectActionModeCallback;", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;)V", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDeleteSelected", "", "onDestroyActionMode", "app.lib"})
    final class MultiSelectCallback extends org.wikipedia.views.MultiSelectActionModeCallback {
        
        public MultiSelectCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        protected void onDeleteSelected() {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$RearrangeableItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "adapter", "Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$WikipediaLanguageItemAdapter;", "Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$WikipediaLanguageItemAdapter;)V", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getMovementFlags", "", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onMove", "source", "target", "onSwiped", "direction", "app.lib"})
    final class RearrangeableItemTouchHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.settings.languages.WikipediaLanguagesFragment.WikipediaLanguageItemAdapter adapter = null;
        
        public RearrangeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
        org.wikipedia.settings.languages.WikipediaLanguagesFragment.WikipediaLanguageItemAdapter adapter) {
            super();
        }
        
        @java.lang.Override()
        public boolean isLongPressDragEnabled() {
            return false;
        }
        
        @java.lang.Override()
        public boolean isItemViewSwipeEnabled() {
            return false;
        }
        
        @java.lang.Override()
        public void onSwiped(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
        }
        
        @java.lang.Override()
        public int getMovementFlags(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return 0;
        }
        
        @java.lang.Override()
        public boolean onMove(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder source, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
            return false;
        }
        
        @java.lang.Override()
        public void clearView(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005J\u001c\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\u0014\u0010\u0017\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0018\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$WikipediaLanguageItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;)V", "checkboxEnabled", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCheckboxEnabled", "enabled", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onMoveItem", "oldPosition", "newPosition", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app.lib"})
    final class WikipediaLanguageItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> {
        private boolean checkboxEnabled = false;
        
        public WikipediaLanguageItemAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.views.DefaultViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder) {
        }
        
        public final void onMoveItem(int oldPosition, int newPosition) {
        }
        
        public final void onCheckboxEnabled(boolean enabled) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment$WikipediaLanguageItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView;", "itemView", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesFragment;Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView;)V", "bindItem", "", "languageCode", "", "position", "", "app.lib"})
    final class WikipediaLanguageItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.settings.languages.WikipediaLanguagesItemView> {
        
        public WikipediaLanguageItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.settings.languages.WikipediaLanguagesItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode, int position) {
        }
    }
}