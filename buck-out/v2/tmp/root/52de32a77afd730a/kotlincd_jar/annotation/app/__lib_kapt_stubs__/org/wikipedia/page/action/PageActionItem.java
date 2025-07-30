package org.wikipedia.page.action;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import org.wikipedia.R;
import org.wikipedia.model.EnumCode;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002%&B?\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem;", "", "Lorg/wikipedia/model/EnumCode;", "id", "", "viewId", "titleResId", "iconResId", "isAvailableOnMobileWeb", "", "isExternalLink", "(Ljava/lang/String;IIIIIZZ)V", "getIconResId", "()I", "getId", "()Z", "getTitleResId", "getViewId", "code", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "SAVE", "LANGUAGE", "FIND_IN_ARTICLE", "THEME", "CONTENTS", "SHARE", "ADD_TO_WATCHLIST", "VIEW_TALK_PAGE", "VIEW_EDIT_HISTORY", "NEW_TAB", "EXPLORE", "CATEGORIES", "EDIT_ARTICLE", "VIEW_ON_MAP", "Callback", "Companion", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public enum PageActionItem implements org.wikipedia.model.EnumCode {
    /*public static final*/ SAVE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$SAVE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) SAVE(0, 0, 0, 0, false, false){
    
    SAVE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ LANGUAGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$LANGUAGE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) LANGUAGE(0, 0, 0, 0, false, false){
    
    LANGUAGE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ FIND_IN_ARTICLE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$FIND_IN_ARTICLE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) FIND_IN_ARTICLE(0, 0, 0, 0, false, false){
    
    FIND_IN_ARTICLE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ THEME /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$THEME;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) THEME(0, 0, 0, 0, false, false){
    
    THEME() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ CONTENTS /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$CONTENTS;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) CONTENTS(0, 0, 0, 0, false, false){
    
    CONTENTS() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ SHARE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$SHARE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) SHARE(0, 0, 0, 0, false, false){
    
    SHARE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ ADD_TO_WATCHLIST /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$ADD_TO_WATCHLIST;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) ADD_TO_WATCHLIST(0, 0, 0, 0, false, false){
    
    ADD_TO_WATCHLIST() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ VIEW_TALK_PAGE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$VIEW_TALK_PAGE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) VIEW_TALK_PAGE(0, 0, 0, 0, false, false){
    
    VIEW_TALK_PAGE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ VIEW_EDIT_HISTORY /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$VIEW_EDIT_HISTORY;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) VIEW_EDIT_HISTORY(0, 0, 0, 0, false, false){
    
    VIEW_EDIT_HISTORY() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ NEW_TAB /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$NEW_TAB;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) NEW_TAB(0, 0, 0, 0, false, false){
    
    NEW_TAB() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ EXPLORE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$EXPLORE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) EXPLORE(0, 0, 0, 0, false, false){
    
    EXPLORE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ CATEGORIES /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$CATEGORIES;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) CATEGORIES(0, 0, 0, 0, false, false){
    
    CATEGORIES() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ EDIT_ARTICLE /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$EDIT_ARTICLE;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) EDIT_ARTICLE(0, 0, 0, 0, false, false){
    
    EDIT_ARTICLE() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */,
    /*public static final*/ VIEW_ON_MAP /* = new @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$VIEW_ON_MAP;", "Lorg/wikipedia/page/action/PageActionItem;", "select", "", "cb", "Lorg/wikipedia/page/action/PageActionItem$Callback;", "app.lib"}) VIEW_ON_MAP(0, 0, 0, 0, false, false){
    
    VIEW_ON_MAP() {
    }
    
    @java.lang.Override
    public void select(@org.jetbrains.annotations.NotNull
    org.wikipedia.page.action.PageActionItem.Callback cb) {
    }
} */;
    private final int id = 0;
    private final int viewId = 0;
    private final int titleResId = 0;
    private final int iconResId = 0;
    private final boolean isAvailableOnMobileWeb = false;
    private final boolean isExternalLink = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> DEFAULT_TOOLBAR_LIST = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> DEFAULT_OVERFLOW_MENU_LIST = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.action.PageActionItem.Companion Companion = null;
    
    PageActionItem(int id, int viewId, @androidx.annotation.StringRes()
    int titleResId, @androidx.annotation.DrawableRes()
    int iconResId, boolean isAvailableOnMobileWeb, boolean isExternalLink) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getViewId() {
        return 0;
    }
    
    public final int getTitleResId() {
        return 0;
    }
    
    public final int getIconResId() {
        return 0;
    }
    
    public final boolean isAvailableOnMobileWeb() {
        return false;
    }
    
    public final boolean isExternalLink() {
        return false;
    }
    
    public abstract void select(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.action.PageActionItem.Callback cb);
    
    @java.lang.Override()
    public int code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<org.wikipedia.page.action.PageActionItem> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$Callback;", "", "forwardClick", "", "onAddToWatchlistSelected", "onCategoriesSelected", "onContentsSelected", "onEditArticleSelected", "onExploreSelected", "onFindInArticleSelected", "onLanguageSelected", "onNewTabSelected", "onSaveSelected", "onShareSelected", "onThemeSelected", "onViewEditHistorySelected", "onViewOnMapSelected", "onViewTalkPageSelected", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSaveSelected();
        
        public abstract void onLanguageSelected();
        
        public abstract void onFindInArticleSelected();
        
        public abstract void onThemeSelected();
        
        public abstract void onContentsSelected();
        
        public abstract void onShareSelected();
        
        public abstract void onAddToWatchlistSelected();
        
        public abstract void onViewTalkPageSelected();
        
        public abstract void onViewEditHistorySelected();
        
        public abstract void onNewTabSelected();
        
        public abstract void onExploreSelected();
        
        public abstract void onCategoriesSelected();
        
        public abstract void onEditArticleSelected();
        
        public abstract void onViewOnMapSelected();
        
        public abstract void forwardClick();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/page/action/PageActionItem$Companion;", "", "()V", "DEFAULT_OVERFLOW_MENU_LIST", "", "", "getDEFAULT_OVERFLOW_MENU_LIST", "()Ljava/util/List;", "DEFAULT_TOOLBAR_LIST", "getDEFAULT_TOOLBAR_LIST", "editArticleIcon", "isProtected", "", "find", "Lorg/wikipedia/page/action/PageActionItem;", "id", "readingListIcon", "pageSaved", "watchlistIcon", "isWatched", "hasWatchlistExpiry", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> getDEFAULT_TOOLBAR_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> getDEFAULT_OVERFLOW_MENU_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.action.PageActionItem find(int id) {
            return null;
        }
        
        @androidx.annotation.DrawableRes()
        public final int watchlistIcon(boolean isWatched, boolean hasWatchlistExpiry) {
            return 0;
        }
        
        @androidx.annotation.DrawableRes()
        public final int readingListIcon(boolean pageSaved) {
            return 0;
        }
        
        @androidx.annotation.DrawableRes()
        public final int editArticleIcon(boolean isProtected) {
            return 0;
        }
    }
}