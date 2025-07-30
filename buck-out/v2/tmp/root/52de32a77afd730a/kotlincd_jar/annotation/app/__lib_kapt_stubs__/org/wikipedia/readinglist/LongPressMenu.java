package org.wikipedia.readinglist;

import android.content.ContextWrapper;
import android.icu.text.ListFormatter;
import android.location.Location;
import android.os.Build;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.PlacesEvent;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.ClipboardUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.GeoUtil;
import org.wikipedia.util.ShareUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/readinglist/LongPressMenu;", "", "anchorView", "Landroid/view/View;", "existsInAnyList", "", "openPageInPlaces", "menuRes", "", "location", "Landroid/location/Location;", "callback", "Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "(Landroid/view/View;ZZILandroid/location/Location;Lorg/wikipedia/readinglist/LongPressMenu$Callback;)V", "entry", "Lorg/wikipedia/history/HistoryEntry;", "listsContainingPage", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "deleteOrShowDialog", "", "getActivity", "Landroidx/appcompat/app/AppCompatActivity;", "sendPlacesEvent", "action", "", "show", "showMenu", "Callback", "PageSaveMenuClickListener", "app.lib"})
public final class LongPressMenu {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View anchorView = null;
    private final boolean existsInAnyList = false;
    private final boolean openPageInPlaces = false;
    private int menuRes;
    @org.jetbrains.annotations.Nullable()
    private final android.location.Location location = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.readinglist.LongPressMenu.Callback callback = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<org.wikipedia.readinglist.database.ReadingList> listsContainingPage;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.history.HistoryEntry entry;
    
    public LongPressMenu(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, boolean existsInAnyList, boolean openPageInPlaces, int menuRes, @org.jetbrains.annotations.Nullable()
    android.location.Location location, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.LongPressMenu.Callback callback) {
        super();
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    private final void showMenu() {
    }
    
    private final void deleteOrShowDialog() {
    }
    
    private final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    private final void sendPlacesEvent(java.lang.String action) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "", "onAddRequest", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMoveRequest", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "onOpenInNewTab", "onOpenInPlaces", "location", "Landroid/location/Location;", "onOpenLink", "onRemoveRequest", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onOpenLink(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onOpenInPlaces(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        android.location.Location location);
        
        public abstract void onAddRequest(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault);
        
        public abstract void onMoveRequest(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onRemoveRequest();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onOpenLink(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.LongPressMenu.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.history.HistoryEntry entry) {
            }
            
            public static void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.LongPressMenu.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.history.HistoryEntry entry) {
            }
            
            public static void onOpenInPlaces(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.LongPressMenu.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
            android.location.Location location) {
            }
            
            public static void onRemoveRequest(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.LongPressMenu.Callback $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/LongPressMenu$PageSaveMenuClickListener;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "(Lorg/wikipedia/readinglist/LongPressMenu;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app.lib"})
    final class PageSaveMenuClickListener implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
        
        public PageSaveMenuClickListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}