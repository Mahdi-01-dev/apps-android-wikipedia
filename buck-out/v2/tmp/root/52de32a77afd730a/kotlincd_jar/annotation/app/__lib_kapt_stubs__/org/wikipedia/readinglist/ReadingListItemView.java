package org.wikipedia.readinglist;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import org.wikipedia.R;
import org.wikipedia.activity.BaseActivity;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.analytics.eventplatform.RecommendedReadingListEvent;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.ItemReadingListBinding;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003?@AB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(J*\u0010)\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020(J\u0010\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u001fJ\u000e\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020(J\u0010\u00102\u001a\u00020\"2\b\b\u0001\u00103\u001a\u000204J2\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0006\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u000204H\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020(H\u0002J\b\u0010>\u001a\u00020\"H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0011\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013\u00a8\u0006B"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "getCallback", "()Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "setCallback", "(Lorg/wikipedia/readinglist/ReadingListItemView$Callback;)V", "imageViews", "listTitle", "getListTitle", "()Lerror/NonExistentClass;", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "saveClickListener", "Landroid/view/View$OnClickListener;", "getSaveClickListener", "()Landroid/view/View$OnClickListener;", "setSaveClickListener", "(Landroid/view/View$OnClickListener;)V", "shareButton", "getShareButton", "buildStatisticalDetailText", "", "buildStatisticalSummaryText", "clearThumbnails", "", "setMode", "readingListMode", "Lorg/wikipedia/readinglist/ReadingListMode;", "setOverflowViewVisibility", "isVisible", "", "setReadingList", "description", "Lorg/wikipedia/readinglist/ReadingListItemView$Description;", "selectMode", "newImport", "setSearchQuery", "searchQuery", "setThumbnailVisible", "visible", "setTitleTextAppearance", "id", "", "showOverflowMenu", "isLongPress", "anchorView", "Landroid/view/View;", "gravity", "statsTextListSize", "", "updateDetails", "showCheckBoxes", "updateThumbnails", "Callback", "Description", "OverflowMenuClickListener", "app.lib"})
@android.annotation.SuppressLint(value = {"RestrictedApi"})
public final class ReadingListItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.database.ReadingList readingList;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object imageViews = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.ReadingListItemView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener saveClickListener;
    
    public ReadingListItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.readinglist.ReadingListItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.ReadingListItemView.Callback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getSaveClickListener() {
        return null;
    }
    
    public final void setSaveClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getShareButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getListTitle() {
        return null;
    }
    
    public final void setReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListItemView.Description description, boolean selectMode, boolean newImport) {
    }
    
    public final void setThumbnailVisible(boolean visible) {
    }
    
    public final void setTitleTextAppearance(@androidx.annotation.StyleRes()
    int id) {
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void setOverflowViewVisibility(boolean isVisible) {
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListMode readingListMode) {
    }
    
    private final void updateDetails(boolean showCheckBoxes) {
    }
    
    private final void clearThumbnails() {
    }
    
    private final void updateThumbnails() {
    }
    
    private final java.lang.String buildStatisticalSummaryText(org.wikipedia.readinglist.database.ReadingList readingList) {
        return null;
    }
    
    private final java.lang.String buildStatisticalDetailText(org.wikipedia.readinglist.database.ReadingList readingList) {
        return null;
    }
    
    private final float statsTextListSize(org.wikipedia.readinglist.database.ReadingList readingList) {
        return 0.0F;
    }
    
    private final void showOverflowMenu(boolean isLongPress, org.wikipedia.readinglist.database.ReadingList readingList, org.wikipedia.readinglist.ReadingListMode readingListMode, android.view.View anchorView, int gravity) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "", "onAbout", "", "onChecked", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onClick", "onCustomize", "onDelete", "onNotification", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "onSaveToList", "onSelectList", "onShare", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onRename(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onDelete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onSelectList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onChecked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onShare(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onSaveToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onNotification();
        
        public abstract void onCustomize();
        
        public abstract void onAbout();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onClick(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onRename(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onDelete(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onSelectList(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onChecked(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onShare(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onSaveToList(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this, @org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.database.ReadingList readingList) {
            }
            
            public static void onNotification(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this) {
            }
            
            public static void onCustomize(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this) {
            }
            
            public static void onAbout(@org.jetbrains.annotations.NotNull()
            org.wikipedia.readinglist.ReadingListItemView.Callback $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView$Description;", "", "(Ljava/lang/String;I)V", "DETAIL", "SUMMARY", "app.lib"})
    public static enum Description {
        /*public static final*/ DETAIL /* = new DETAIL() */,
        /*public static final*/ SUMMARY /* = new SUMMARY() */;
        
        Description() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<org.wikipedia.readinglist.ReadingListItemView.Description> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView$OverflowMenuClickListener;", "Landroidx/appcompat/view/menu/MenuBuilder$Callback;", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "(Lorg/wikipedia/readinglist/ReadingListItemView;Lorg/wikipedia/readinglist/database/ReadingList;)V", "onMenuItemSelected", "", "menu", "Landroidx/appcompat/view/menu/MenuBuilder;", "menuItem", "Landroid/view/MenuItem;", "onMenuModeChange", "", "app.lib"})
    final class OverflowMenuClickListener implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.readinglist.database.ReadingList list = null;
        
        public OverflowMenuClickListener(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingList list) {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemSelected(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.menu.MenuBuilder menu, @org.jetbrains.annotations.NotNull()
        android.view.MenuItem menuItem) {
            return false;
        }
        
        @java.lang.Override()
        public void onMenuModeChange(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.menu.MenuBuilder menu) {
        }
    }
}