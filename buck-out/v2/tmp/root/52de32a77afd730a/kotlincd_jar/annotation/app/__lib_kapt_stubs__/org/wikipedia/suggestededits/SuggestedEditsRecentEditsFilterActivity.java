package org.wikipedia.suggestededits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.PatrollerExperienceEvent;
import org.wikipedia.databinding.ActivitySuggestedEditsRecentEditsFiltersBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0006 !\"#$%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "appLanguagesList", "", "", "getAppLanguagesList", "()Ljava/util/List;", "appLanguagesPreFilterList", "", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "languageChooserLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "filterListWithHeaders", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "resetFilterSettings", "setUpRecyclerView", "Companion", "Filter", "RecentEditsFilterAdapter", "RecentEditsFilterHeaderViewHolder", "RecentEditsFilterItemViewAddLanguageViewHolder", "RecentEditsFilterItemViewHolder", "app.lib"})
public final class SuggestedEditsRecentEditsFilterActivity extends org.wikipedia.activity.BaseActivity {
    private ActivitySuggestedEditsRecentEditsFiltersBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> appLanguagesPreFilterList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> languageChooserLauncher = null;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    private static final int VIEW_TYPE_ADD_LANGUAGE = 2;
    public static final int FILTER_TYPE_WIKI = 0;
    public static final int FILTER_TYPE_CATEGORY = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterActivity.Companion Companion = null;
    
    public SuggestedEditsRecentEditsFilterActivity() {
        super();
    }
    
    private final java.util.List<java.lang.String> getAppLanguagesList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
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
    
    private final void setUpRecyclerView() {
    }
    
    private final void resetFilterSettings() {
    }
    
    private final java.util.List<java.lang.Object> filterListWithHeaders() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$Companion;", "", "()V", "FILTER_TYPE_CATEGORY", "", "FILTER_TYPE_WIKI", "VIEW_TYPE_ADD_LANGUAGE", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$Filter;", "", "type", "", "filterCode", "", "isCheckBox", "", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;ILjava/lang/String;Z)V", "getFilterCode", "()Ljava/lang/String;", "()Z", "getType", "()I", "isEnabled", "app.lib"})
    public final class Filter {
        private final int type = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterCode = null;
        private final boolean isCheckBox = false;
        
        public Filter(int type, @org.jetbrains.annotations.NotNull()
        java.lang.String filterCode, boolean isCheckBox) {
            super();
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilterCode() {
            return null;
        }
        
        public final boolean isCheckBox() {
            return false;
        }
        
        public final boolean isEnabled() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$RecentEditsFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterItemView$Callback;", "context", "Landroid/content/Context;", "filtersList", "", "", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "includedTypeCodes", "", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCheckedChanged", "filter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$Filter;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class RecentEditsFilterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> implements org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Object> filtersList = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<java.lang.String> includedTypeCodes;
        
        public RecentEditsFilterAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> filtersList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.views.DefaultViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder, int position) {
        }
        
        @java.lang.Override()
        public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterActivity.Filter filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$RecentEditsFilterHeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "headerText", "Landroid/widget/TextView;", "bindItem", "", "filterHeader", "", "app.lib"})
    public static final class RecentEditsFilterHeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView headerText = null;
        
        public RecentEditsFilterHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String filterHeader) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$RecentEditsFilterItemViewAddLanguageViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterItemView;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterItemView$Callback;", "filterItemView", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterItemView;)V", "bindItem", "", "text", "", "onCheckedChanged", "filter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$Filter;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;", "app.lib"})
    final class RecentEditsFilterItemViewAddLanguageViewHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView> implements org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView filterItemView = null;
        
        public RecentEditsFilterItemViewAddLanguageViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView filterItemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
        
        @java.lang.Override()
        public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterActivity.Filter filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bR\u00020\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$RecentEditsFilterItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterItemView;", "itemView", "(Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterItemView;)V", "bindItem", "", "filter", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity$Filter;", "Lorg/wikipedia/suggestededits/SuggestedEditsRecentEditsFilterActivity;", "app.lib"})
    public static final class RecentEditsFilterItemViewHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView> {
        
        public RecentEditsFilterItemViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsRecentEditsFilterActivity.Filter filter) {
        }
    }
}