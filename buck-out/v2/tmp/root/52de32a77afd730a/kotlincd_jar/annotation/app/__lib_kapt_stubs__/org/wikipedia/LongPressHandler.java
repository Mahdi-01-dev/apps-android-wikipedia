package org.wikipedia;

import android.annotation.SuppressLint;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.LongPressMenu;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001aH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/LongPressHandler;", "Landroid/view/View$OnCreateContextMenuListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "historySource", "", "callback", "Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "title", "Lorg/wikipedia/page/PageTitle;", "(Landroid/view/View;ILorg/wikipedia/readinglist/LongPressMenu$Callback;Lorg/wikipedia/page/PageTitle;)V", "clickPositionX", "", "clickPositionY", "prevId", "", "referrer", "", "onCreateContextMenu", "", "menu", "Landroid/view/ContextMenu;", "menuInfo", "Landroid/view/ContextMenu$ContextMenuInfo;", "onTouch", "", "motionEvent", "Landroid/view/MotionEvent;", "showPopupMenu", "createAnchorView", "WebViewMenuCallback", "app.lib"})
public final class LongPressHandler implements android.view.View.OnCreateContextMenuListener, android.view.View.OnTouchListener {
    private final int historySource = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.readinglist.LongPressMenu.Callback callback = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String referrer;
    private long prevId = -1L;
    private float clickPositionX = 0.0F;
    private float clickPositionY = 0.0F;
    
    public LongPressHandler(@org.jetbrains.annotations.NotNull()
    android.view.View view, int historySource, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.LongPressMenu.Callback callback, @org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle title) {
        super();
    }
    
    @java.lang.Override()
    public void onCreateContextMenu(@org.jetbrains.annotations.NotNull()
    android.view.ContextMenu menu, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ContextMenu.ContextMenuInfo menuInfo) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    private final void showPopupMenu(android.view.View view, boolean createAnchorView) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/LongPressHandler$WebViewMenuCallback;", "Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "historyEntryId", "", "getHistoryEntryId", "()J", "referrer", "", "getReferrer", "()Ljava/lang/String;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "app.lib"})
    public static abstract interface WebViewMenuCallback extends org.wikipedia.readinglist.LongPressMenu.Callback {
        
        @org.jetbrains.annotations.Nullable()
        public abstract org.wikipedia.dataclient.WikiSite getWikiSite();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getReferrer();
        
        public abstract long getHistoryEntryId();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
            org.wikipedia.LongPressHandler.WebViewMenuCallback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.history.HistoryEntry entry) {
            }
            
            public static void onOpenInPlaces(@org.jetbrains.annotations.NotNull()
            org.wikipedia.LongPressHandler.WebViewMenuCallback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
            android.location.Location location) {
            }
            
            public static void onOpenLink(@org.jetbrains.annotations.NotNull()
            org.wikipedia.LongPressHandler.WebViewMenuCallback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.history.HistoryEntry entry) {
            }
            
            public static void onRemoveRequest(@org.jetbrains.annotations.NotNull()
            org.wikipedia.LongPressHandler.WebViewMenuCallback $this) {
            }
        }
    }
}