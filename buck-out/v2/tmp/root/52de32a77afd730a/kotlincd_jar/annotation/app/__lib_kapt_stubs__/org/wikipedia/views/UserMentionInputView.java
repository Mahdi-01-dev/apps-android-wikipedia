package org.wikipedia.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewUserMentionInputBinding;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.edit.richtext.SyntaxHighlighter;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u00039:;B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0014J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020*H\u0002J\b\u00104\u001a\u00020*H\u0016J\u0010\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u001cH\u0002R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006<"}, d2 = {"Lorg/wikipedia/views/UserMentionInputView;", "Landroid/widget/LinearLayout;", "Lorg/wikipedia/views/UserMentionEditText$Listener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "clientJob", "Lkotlinx/coroutines/Job;", "editText", "getEditText", "()Lerror/NonExistentClass;", "listener", "Lorg/wikipedia/views/UserMentionInputView$Listener;", "getListener", "()Lorg/wikipedia/views/UserMentionInputView$Listener;", "setListener", "(Lorg/wikipedia/views/UserMentionInputView$Listener;)V", "syntaxHighlighter", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "textInputLayout", "getTextInputLayout", "userNameHints", "", "", "getUserNameHints", "()Ljava/util/Set;", "setUserNameHints", "(Ljava/util/Set;)V", "userNameList", "", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "maybePrepopulateUserName", "", "currentUserName", "currentPageTitle", "Lorg/wikipedia/page/PageTitle;", "onCancelUserNameEntry", "onDetachedFromWindow", "onSearchError", "t", "", "onSearchResults", "onStartUserNameEntry", "onUserNameChanged", "userName", "searchForUserName", "prefix", "Listener", "UserNameAdapter", "UserNameViewHolder", "app.lib"})
public final class UserMentionInputView extends android.widget.LinearLayout implements org.wikipedia.views.UserMentionEditText.Listener {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.dataclient.WikiSite wikiSite;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.UserMentionInputView.Listener listener;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> userNameHints;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> userNameList = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job clientJob;
    
    public UserMentionInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTextInputLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    public final void setWikiSite(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.UserMentionInputView.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.UserMentionInputView.Listener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getUserNameHints() {
        return null;
    }
    
    public final void setUserNameHints(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    public void onStartUserNameEntry() {
    }
    
    @java.lang.Override()
    public void onCancelUserNameEntry() {
    }
    
    @java.lang.Override()
    public void onUserNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
    }
    
    public final void maybePrepopulateUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String currentUserName, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle currentPageTitle) {
    }
    
    private final void searchForUserName(java.lang.String prefix) {
    }
    
    private final void onSearchResults() {
    }
    
    private final void onSearchError(java.lang.Throwable t) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/views/UserMentionInputView$Listener;", "", "onUserMentionComplete", "", "onUserMentionListUpdate", "app.lib"})
    public static abstract interface Listener {
        
        public abstract void onUserMentionListUpdate();
        
        public abstract void onUserMentionComplete();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/views/UserMentionInputView$UserNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/UserMentionInputView$UserNameViewHolder;", "Lorg/wikipedia/views/UserMentionInputView;", "(Lorg/wikipedia/views/UserMentionInputView;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app.lib"})
    final class UserNameAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.UserMentionInputView.UserNameViewHolder> {
        
        public UserNameAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.views.UserMentionInputView.UserNameViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.UserMentionInputView.UserNameViewHolder holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/views/UserMentionInputView$UserNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/views/UserMentionInputView;Landroid/view/View;)V", "userName", "", "bindItem", "", "position", "", "onClick", "v", "app.lib"})
    final class UserNameViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private java.lang.String userName;
        
        public UserNameViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(int position) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
}