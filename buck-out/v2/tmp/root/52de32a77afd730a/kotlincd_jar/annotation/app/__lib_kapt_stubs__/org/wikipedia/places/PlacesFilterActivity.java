package org.wikipedia.places;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.databinding.ActivityPlacesFiltersBinding;
import org.wikipedia.databinding.ViewPlacesFilterItemBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "addLanguageLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getAddLanguageLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "filtersList", "", "", "initLanguage", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpRecyclerView", "Companion", "PlacesFilterFooterViewHolder", "PlacesFilterHeaderViewHolder", "PlacesFilterItemViewHolder", "PlacesLangListFilterAdapter", "app.lib"})
public final class PlacesFilterActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityPlacesFiltersBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String initLanguage;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> filtersList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> addLanguageLauncher = null;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_FOOTER = 1;
    private static final int VIEW_TYPE_ITEM = 2;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String HEADER = "header";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FOOTER = "footer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LANG_CHANGED = "langChanged";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.places.PlacesFilterActivity.Companion Companion = null;
    
    public PlacesFilterActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getAddLanguageLauncher() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity$Companion;", "", "()V", "EXTRA_LANG_CHANGED", "", "FOOTER", "HEADER", "VIEW_TYPE_FOOTER", "", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterFooterViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/places/PlacesFilterActivity;Landroid/view/View;)V", "bindItem", "", "app.lib"})
    public final class PlacesFilterFooterViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public PlacesFilterFooterViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterHeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/places/PlacesFilterActivity;Landroid/view/View;)V", "headerText", "Landroid/widget/TextView;", "bindItem", "", "filterHeader", "", "app.lib"})
    public final class PlacesFilterHeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView headerText = null;
        
        public PlacesFilterHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String filterHeader) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemViewBinding", "error/NonExistentClass", "callback", "Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterItemViewHolder$Callback;", "(Lerror/NonExistentClass;Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterItemViewHolder$Callback;)V", "getCallback", "()Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterItemViewHolder$Callback;", "Lerror/NonExistentClass;", "bindItem", "", "languageCode", "", "Callback", "app.lib"})
    public static final class PlacesFilterItemViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final ViewPlacesFilterItemBinding itemViewBinding = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.places.PlacesFilterActivity.PlacesFilterItemViewHolder.Callback callback = null;
        
        public PlacesFilterItemViewHolder(@org.jetbrains.annotations.NotNull()
        ViewPlacesFilterItemBinding itemViewBinding, @org.jetbrains.annotations.NotNull()
        org.wikipedia.places.PlacesFilterActivity.PlacesFilterItemViewHolder.Callback callback) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.places.PlacesFilterActivity.PlacesFilterItemViewHolder.Callback getCallback() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterItemViewHolder$Callback;", "", "onLangSelected", "", "app.lib"})
        public static abstract interface Callback {
            
            public abstract void onLangSelected();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/places/PlacesFilterActivity$PlacesLangListFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/places/PlacesFilterActivity$PlacesFilterItemViewHolder$Callback;", "context", "Landroid/content/Context;", "(Lorg/wikipedia/places/PlacesFilterActivity;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "onLangSelected", "app.lib"})
    final class PlacesLangListFilterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> implements org.wikipedia.places.PlacesFilterActivity.PlacesFilterItemViewHolder.Callback {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public PlacesLangListFilterAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
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
        public void onLangSelected() {
        }
    }
}