package org.wikipedia.page.edithistory;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.ImageViewCompat;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemEditHistoryBinding;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "listener", "Lorg/wikipedia/page/edithistory/EditHistoryItemView$Listener;", "getListener", "()Lorg/wikipedia/page/edithistory/EditHistoryItemView$Listener;", "setListener", "(Lorg/wikipedia/page/edithistory/EditHistoryItemView$Listener;)V", "setContents", "", "itemRevision", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "currentQuery", "", "setSelectedState", "selectedState", "", "Listener", "app.lib"})
public final class EditHistoryItemView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.edithistory.EditHistoryItemView.Listener listener;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public EditHistoryItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.edithistory.EditHistoryItemView.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.edithistory.EditHistoryItemView.Listener p0) {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage.Revision itemRevision, @org.jetbrains.annotations.Nullable()
    java.lang.String currentQuery) {
    }
    
    public final void setSelectedState(int selectedState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/edithistory/EditHistoryItemView$Listener;", "", "onClick", "", "onLongClick", "onToggleSelect", "onUserNameClick", "v", "Landroid/view/View;", "app.lib"})
    public static abstract interface Listener {
        
        public abstract void onClick();
        
        public abstract void onLongClick();
        
        public abstract void onUserNameClick(@org.jetbrains.annotations.NotNull()
        android.view.View v);
        
        public abstract void onToggleSelect();
    }
}