package org.wikipedia.navtab;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import org.wikipedia.R;
import org.wikipedia.feed.FeedFragment;
import org.wikipedia.history.HistoryFragment;
import org.wikipedia.model.EnumCode;
import org.wikipedia.readinglist.ReadingListsFragment;
import org.wikipedia.suggestededits.SuggestedEditsTasksFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B#\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u000eH&R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/navtab/NavTab;", "", "Lorg/wikipedia/model/EnumCode;", "text", "", "id", "icon", "(Ljava/lang/String;IIII)V", "getIcon", "()I", "getId", "getText", "code", "newInstance", "Landroidx/fragment/app/Fragment;", "EXPLORE", "READING_LISTS", "SEARCH", "EDITS", "MORE", "Companion", "app.lib"})
public enum NavTab implements org.wikipedia.model.EnumCode {
    /*public static final*/ EXPLORE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/navtab/NavTab$EXPLORE;", "Lorg/wikipedia/navtab/NavTab;", "newInstance", "Landroidx/fragment/app/Fragment;", "app.lib"}) EXPLORE(0, 0, 0){
    
    EXPLORE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment newInstance() {
        return null;
    }
} */,
    /*public static final*/ READING_LISTS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/navtab/NavTab$READING_LISTS;", "Lorg/wikipedia/navtab/NavTab;", "newInstance", "Landroidx/fragment/app/Fragment;", "app.lib"}) READING_LISTS(0, 0, 0){
    
    READING_LISTS() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment newInstance() {
        return null;
    }
} */,
    /*public static final*/ SEARCH /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/navtab/NavTab$SEARCH;", "Lorg/wikipedia/navtab/NavTab;", "newInstance", "Landroidx/fragment/app/Fragment;", "app.lib"}) SEARCH(0, 0, 0){
    
    SEARCH() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment newInstance() {
        return null;
    }
} */,
    /*public static final*/ EDITS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/navtab/NavTab$EDITS;", "Lorg/wikipedia/navtab/NavTab;", "newInstance", "Landroidx/fragment/app/Fragment;", "app.lib"}) EDITS(0, 0, 0){
    
    EDITS() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment newInstance() {
        return null;
    }
} */,
    /*public static final*/ MORE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/navtab/NavTab$MORE;", "Lorg/wikipedia/navtab/NavTab;", "newInstance", "Landroidx/fragment/app/Fragment;", "app.lib"}) MORE(0, 0, 0){
    
    MORE() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment newInstance() {
        return null;
    }
} */;
    private final int text = 0;
    private final int id = 0;
    private final int icon = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.navtab.NavTab.Companion Companion = null;
    
    NavTab(@androidx.annotation.StringRes()
    int text, int id, @androidx.annotation.DrawableRes()
    int icon) {
    }
    
    public final int getText() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.fragment.app.Fragment newInstance();
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.navtab.NavTab> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/navtab/NavTab$Companion;", "", "()V", "of", "Lorg/wikipedia/navtab/NavTab;", "code", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.navtab.NavTab of(int code) {
            return null;
        }
    }
}