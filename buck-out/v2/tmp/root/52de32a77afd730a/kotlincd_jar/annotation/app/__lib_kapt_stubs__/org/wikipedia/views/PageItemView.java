package org.wikipedia.views;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.chip.Chip;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemPageListEntryBinding;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001?B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0018J\u0010\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u001aJ\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001dJ\u0010\u0010&\u001a\u00020\u001a2\b\u0010\'\u001a\u0004\u0018\u00010\u0010J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010)\u001a\u00020\u001aH\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001dJ\u0010\u0010,\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u0010J\u0018\u0010.\u001a\u00020\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0018J\u0010\u00100\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u0010J\u0006\u00102\u001a\u00020\u001aJ\u000e\u00103\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001dJ\u0014\u00106\u001a\u00020\u001a2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908J\u000e\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u0018J\u000e\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u0018J\b\u0010>\u001a\u00020\u001aH\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lorg/wikipedia/views/PageItemView;", "T", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/views/PageItemView$Callback;", "getCallback", "()Lorg/wikipedia/views/PageItemView$Callback;", "setCallback", "(Lorg/wikipedia/views/PageItemView$Callback;)V", "imageUrl", "", "item", "getItem", "()Ljava/lang/Object;", "setItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "selected", "", "hideChipGroup", "", "setActionHint", "id", "", "setCircularProgressVisibility", "visible", "setDescription", "text", "", "setDescriptionEllipsis", "setDescriptionMaxLines", "linesCount", "setImageUrl", "url", "setImageVisible", "setOnClickListeners", "setProgress", "progress", "setSearchQuery", "searchQuery", "setSecondaryActionIcon", "show", "setSelected", "setTitle", "setTitleEllipsis", "setTitleMaxLines", "setTitleTypeface", "typeface", "setUpChipGroup", "readingLists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "setViewsGreyedOut", "greyedOut", "setViewsRead", "read", "updateSelectedState", "Callback", "app.lib"})
public final class PageItemView<T extends java.lang.Object> extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageUrl;
    private boolean selected = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.PageItemView.Callback<T> callback;
    @org.jetbrains.annotations.Nullable()
    private T item;
    
    public PageItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.PageItemView.Callback<T> getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.PageItemView.Callback<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @java.lang.Override()
    public void setSelected(boolean selected) {
    }
    
    private final void setOnClickListeners() {
    }
    
    private final void updateSelectedState() {
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setTitleTypeface(int typeface) {
    }
    
    public final void setTitleMaxLines(int linesCount) {
    }
    
    public final void setTitleEllipsis() {
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setDescriptionMaxLines(int linesCount) {
    }
    
    public final void setDescriptionEllipsis() {
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public final void setImageVisible(boolean visible) {
    }
    
    public final void setSecondaryActionIcon(@androidx.annotation.DrawableRes()
    int id, boolean show) {
    }
    
    public final void setProgress(int progress) {
    }
    
    public final void setCircularProgressVisibility(boolean visible) {
    }
    
    public final void setActionHint(@androidx.annotation.StringRes()
    int id) {
    }
    
    public final void setUpChipGroup(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists) {
    }
    
    public final void hideChipGroup() {
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void setViewsGreyedOut(boolean greyedOut) {
    }
    
    public final void setViewsRead(boolean read) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/views/PageItemView$Callback;", "T", "", "onActionClick", "", "item", "view", "Landroid/view/View;", "(Ljava/lang/Object;Landroid/view/View;)V", "onClick", "(Ljava/lang/Object;)V", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "(Ljava/lang/Object;)Z", "app.lib"})
    public static abstract interface Callback<T extends java.lang.Object> {
        
        public abstract void onClick(@org.jetbrains.annotations.Nullable()
        T item);
        
        public abstract boolean onLongClick(@org.jetbrains.annotations.Nullable()
        T item);
        
        public abstract void onActionClick(@org.jetbrains.annotations.Nullable()
        T item, @org.jetbrains.annotations.NotNull()
        android.view.View view);
        
        public abstract void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
    }
}