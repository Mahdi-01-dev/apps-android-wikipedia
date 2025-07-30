package org.wikipedia.notifications;

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
import org.wikipedia.databinding.ActivityNotificationsFiltersBinding;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "languageChooserLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "filterListWithHeaders", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setUpRecyclerView", "Companion", "Filter", "NotificationFilterAddLanguageViewHolder", "NotificationFilterHeaderViewHolder", "NotificationFilterItemViewHolder", "NotificationsFilterAdapter", "app.lib"})
public final class NotificationFilterActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityNotificationsFiltersBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> languageChooserLauncher = null;
    public static final int ACTIVITY_RESULT_LANGUAGES_CHANGED = 2;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    private static final int VIEW_TYPE_ADD_LANGUAGE = 2;
    private static final int FILTER_TYPE_WIKI = 0;
    private static final int FILTER_TYPE_CATEGORY = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationFilterActivity.Companion Companion = null;
    
    public NotificationFilterActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final java.util.List<java.lang.Object> filterListWithHeaders() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity$Companion;", "", "()V", "ACTIVITY_RESULT_LANGUAGES_CHANGED", "", "FILTER_TYPE_CATEGORY", "FILTER_TYPE_WIKI", "VIEW_TYPE_ADD_LANGUAGE", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "allTypesIdList", "", "", "allWikisList", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> allWikisList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> allTypesIdList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity$Filter;", "", "type", "", "filterCode", "", "imageRes", "(Lorg/wikipedia/notifications/NotificationFilterActivity;ILjava/lang/String;Ljava/lang/Integer;)V", "getFilterCode", "()Ljava/lang/String;", "getImageRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()I", "isEnabled", "", "app.lib"})
    public final class Filter {
        private final int type = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer imageRes = null;
        
        public Filter(int type, @org.jetbrains.annotations.NotNull()
        java.lang.String filterCode, @org.jetbrains.annotations.Nullable()
        java.lang.Integer imageRes) {
            super();
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilterCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getImageRes() {
            return null;
        }
        
        public final boolean isEnabled() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity$NotificationFilterAddLanguageViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/notifications/NotificationFilterItemView;", "Lorg/wikipedia/notifications/NotificationFilterItemView$Callback;", "filterItemView", "(Lorg/wikipedia/notifications/NotificationFilterActivity;Lorg/wikipedia/notifications/NotificationFilterItemView;)V", "bindItem", "", "text", "", "onCheckedChanged", "filter", "Lorg/wikipedia/notifications/NotificationFilterActivity$Filter;", "Lorg/wikipedia/notifications/NotificationFilterActivity;", "app.lib"})
    final class NotificationFilterAddLanguageViewHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.notifications.NotificationFilterItemView> implements org.wikipedia.notifications.NotificationFilterItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.notifications.NotificationFilterItemView filterItemView = null;
        
        public NotificationFilterAddLanguageViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationFilterItemView filterItemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
        
        @java.lang.Override()
        public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
        org.wikipedia.notifications.NotificationFilterActivity.Filter filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity$NotificationFilterHeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "headerText", "Landroid/widget/TextView;", "bindItem", "", "filterHeader", "", "app.lib"})
    public static final class NotificationFilterHeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView headerText = null;
        
        public NotificationFilterHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String filterHeader) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bR\u00020\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity$NotificationFilterItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/notifications/NotificationFilterItemView;", "itemView", "(Lorg/wikipedia/notifications/NotificationFilterItemView;)V", "bindItem", "", "filter", "Lorg/wikipedia/notifications/NotificationFilterActivity$Filter;", "Lorg/wikipedia/notifications/NotificationFilterActivity;", "app.lib"})
    public static final class NotificationFilterItemViewHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.notifications.NotificationFilterItemView> {
        
        public NotificationFilterItemViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationFilterItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationFilterActivity.Filter filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterActivity$NotificationsFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/notifications/NotificationFilterItemView$Callback;", "context", "Landroid/content/Context;", "filtersList", "", "", "(Lorg/wikipedia/notifications/NotificationFilterActivity;Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "excludedTypeCodes", "", "", "excludedWikiCodes", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCheckedChanged", "filter", "Lorg/wikipedia/notifications/NotificationFilterActivity$Filter;", "Lorg/wikipedia/notifications/NotificationFilterActivity;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app.lib"})
    final class NotificationsFilterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> implements org.wikipedia.notifications.NotificationFilterItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Object> filtersList = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<java.lang.String> excludedWikiCodes;
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<java.lang.String> excludedTypeCodes;
        
        public NotificationsFilterAdapter(@org.jetbrains.annotations.NotNull()
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
        org.wikipedia.notifications.NotificationFilterActivity.Filter filter) {
        }
    }
}