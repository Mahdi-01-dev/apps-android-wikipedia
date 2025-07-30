package org.wikipedia.views;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.edit.SyntaxHighlightableEditText;
import org.wikipedia.staticdata.UserAliasData;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014J\b\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0016\u0010\'\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lorg/wikipedia/views/UserMentionEditText;", "Lorg/wikipedia/edit/SyntaxHighlightableEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isEnteringUserName", "", "()Z", "isUserNameCommitting", "listener", "Lorg/wikipedia/views/UserMentionEditText$Listener;", "getListener", "()Lorg/wikipedia/views/UserMentionEditText$Listener;", "setListener", "(Lorg/wikipedia/views/UserMentionEditText$Listener;)V", "spacesPressedCount", "textWatcher", "Landroid/text/TextWatcher;", "userNameEndPos", "userNameStartPos", "composeUserNameLink", "", "userName", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "onCancelUserNameEntry", "", "onCommitUserName", "onSelectionChanged", "selStart", "selEnd", "onStartUserNameEntry", "onUserNameChanged", "prepopulateUserName", "Listener", "app.lib"})
public final class UserMentionEditText extends org.wikipedia.edit.SyntaxHighlightableEditText {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.UserMentionEditText.Listener listener;
    @org.jetbrains.annotations.Nullable()
    private final android.text.TextWatcher textWatcher = null;
    private int userNameStartPos = -1;
    private int userNameEndPos = -1;
    private int spacesPressedCount = 0;
    private boolean isUserNameCommitting = false;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.UserMentionEditText.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.UserMentionEditText.Listener p0) {
    }
    
    private final boolean isEnteringUserName() {
        return false;
    }
    
    public UserMentionEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public UserMentionEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public UserMentionEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onSelectionChanged(int selStart, int selEnd) {
    }
    
    private final void onStartUserNameEntry() {
    }
    
    private final void onCancelUserNameEntry() {
    }
    
    private final void onUserNameChanged(java.lang.String userName) {
    }
    
    public final void prepopulateUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite) {
    }
    
    public final void onCommitUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite) {
    }
    
    private final java.lang.String composeUserNameLink(java.lang.String userName, org.wikipedia.dataclient.WikiSite wikiSite) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/UserMentionEditText$Listener;", "", "onCancelUserNameEntry", "", "onStartUserNameEntry", "onUserNameChanged", "userName", "", "app.lib"})
    public static abstract interface Listener {
        
        public abstract void onStartUserNameEntry();
        
        public abstract void onCancelUserNameEntry();
        
        public abstract void onUserNameChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String userName);
    }
}