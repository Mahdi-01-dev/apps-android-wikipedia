package org.wikipedia.usercontrib;

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
import org.wikipedia.databinding.ActivityUserContribWikiSelectBinding;
import org.wikipedia.page.Namespace;
import org.wikipedia.settings.Prefs;
import org.wikipedia.settings.languages.WikipediaLanguagesActivity;
import org.wikipedia.staticdata.TalkAliasData;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.staticdata.UserTalkAliasData;
import org.wikipedia.views.DefaultViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "langUpdateLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getNamespaceCode", "", "text", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "AddLanguageViewHolder", "Companion", "FilterHeaderViewHolder", "Item", "ItemAdapter", "ItemViewHolder", "app.lib"})
public final class UserContribFilterActivity extends org.wikipedia.activity.BaseActivity {
    private ActivityUserContribWikiSelectBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> langUpdateLauncher = null;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    private static final int VIEW_TYPE_ADD_LANGUAGE = 2;
    public static final int FILTER_TYPE_WIKI = 0;
    public static final int FILTER_TYPE_NAMESPACE = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> NAMESPACE_LIST = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.usercontrib.UserContribFilterActivity.Companion Companion = null;
    
    public UserContribFilterActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final int getNamespaceCode(java.lang.String text) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity$AddLanguageViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/usercontrib/UserContribFilterItemView;", "Lorg/wikipedia/usercontrib/UserContribFilterItemView$Callback;", "filterItemView", "(Lorg/wikipedia/usercontrib/UserContribFilterActivity;Lorg/wikipedia/usercontrib/UserContribFilterItemView;)V", "bindItem", "", "text", "", "onSelected", "item", "Lorg/wikipedia/usercontrib/UserContribFilterActivity$Item;", "Lorg/wikipedia/usercontrib/UserContribFilterActivity;", "app.lib"})
    final class AddLanguageViewHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.usercontrib.UserContribFilterItemView> implements org.wikipedia.usercontrib.UserContribFilterItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.usercontrib.UserContribFilterItemView filterItemView = null;
        
        public AddLanguageViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribFilterItemView filterItemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
        
        @java.lang.Override()
        public void onSelected(@org.jetbrains.annotations.Nullable()
        org.wikipedia.usercontrib.UserContribFilterActivity.Item item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity$Companion;", "", "()V", "FILTER_TYPE_NAMESPACE", "", "FILTER_TYPE_WIKI", "NAMESPACE_LIST", "", "getNAMESPACE_LIST", "()Ljava/util/List;", "VIEW_TYPE_ADD_LANGUAGE", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> getNAMESPACE_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity$FilterHeaderViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/usercontrib/UserContribFilterActivity;Landroid/view/View;)V", "headerText", "Landroid/widget/TextView;", "getHeaderText", "()Landroid/widget/TextView;", "bindItem", "", "filterHeader", "", "app.lib"})
    final class FilterHeaderViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView headerText = null;
        
        public FilterHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getHeaderText() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.lang.String filterHeader) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity$Item;", "", "type", "", "filterCode", "", "imageRes", "(Lorg/wikipedia/usercontrib/UserContribFilterActivity;ILjava/lang/String;Ljava/lang/Integer;)V", "getFilterCode", "()Ljava/lang/String;", "getImageRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()I", "isEnabled", "", "app.lib"})
    public final class Item {
        private final int type = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer imageRes = null;
        
        public Item(int type, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u001aH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity$ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/usercontrib/UserContribFilterItemView$Callback;", "context", "Landroid/content/Context;", "(Lorg/wikipedia/usercontrib/UserContribFilterActivity;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "itemList", "", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "onSelected", "item", "Lorg/wikipedia/usercontrib/UserContribFilterActivity$Item;", "Lorg/wikipedia/usercontrib/UserContribFilterActivity;", "app.lib"})
    final class ItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> implements org.wikipedia.usercontrib.UserContribFilterItemView.Callback {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Object> itemList = null;
        
        public ItemAdapter(@org.jetbrains.annotations.NotNull()
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
        public void onSelected(@org.jetbrains.annotations.Nullable()
        org.wikipedia.usercontrib.UserContribFilterActivity.Item item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bR\u00020\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribFilterActivity$ItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/usercontrib/UserContribFilterItemView;", "itemView", "(Lorg/wikipedia/usercontrib/UserContribFilterActivity;Lorg/wikipedia/usercontrib/UserContribFilterItemView;)V", "bindItem", "", "item", "Lorg/wikipedia/usercontrib/UserContribFilterActivity$Item;", "Lorg/wikipedia/usercontrib/UserContribFilterActivity;", "app.lib"})
    public final class ItemViewHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.usercontrib.UserContribFilterItemView> {
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribFilterItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.usercontrib.UserContribFilterActivity.Item item) {
        }
    }
}