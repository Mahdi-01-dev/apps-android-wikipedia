package org.wikipedia.page;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import org.json.JSONException;
import org.json.JSONObject;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.ArticleTocInteractionEvent;
import org.wikipedia.analytics.metricsplatform.ArticleTocInteraction;
import org.wikipedia.bridge.CommunicationBridge;
import org.wikipedia.bridge.JavaScriptActionHandler;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.ObservableWebView;
import org.wikipedia.views.ObservableWebView.OnContentHeightChangedListener;
import org.wikipedia.views.PageScrollerView;
import org.wikipedia.views.SwipeableListView.OnSwipeOutListener;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003<=>B\u0017\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u000fH\u0016J \u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0015H\u0016J\u0018\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020 H\u0002J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u000fH\u0002J\u0012\u00102\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u000e\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\u0015J\b\u00107\u001a\u00020 H\u0003J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0007J\u0006\u0010;\u001a\u00020 R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lorg/wikipedia/page/SidePanelHandler;", "Lorg/wikipedia/views/ObservableWebView$OnClickListener;", "Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "Lorg/wikipedia/views/ObservableWebView$OnContentHeightChangedListener;", "fragment", "Lorg/wikipedia/page/PageFragment;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "(Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/bridge/CommunicationBridge;)V", "articleTocInteractionEvent", "Lorg/wikipedia/analytics/eventplatform/ArticleTocInteractionEvent;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "currentItemSelected", "", "isVisible", "()Lerror/NonExistentClass;", "metricsPlatformArticleEventTocInteraction", "Lorg/wikipedia/analytics/metricsplatform/ArticleTocInteraction;", "rtl", "", "scrollerViewParams", "Landroid/widget/FrameLayout$LayoutParams;", "sectionOffsetsCallback", "Landroid/webkit/ValueCallback;", "", "tocAdapter", "Lorg/wikipedia/page/SidePanelHandler$ToCAdapter;", "webView", "Lorg/wikipedia/views/ObservableWebView;", "hide", "", "log", "onClick", "x", "", "y", "onContentHeightChanged", "contentHeight", "onScrollChanged", "oldScrollY", "scrollY", "isHumanScroll", "onScrollerMoved", "dy", "scrollWebView", "onStartShow", "scrollToListSectionByOffset", "yOffset", "scrollToSection", "section", "Lorg/wikipedia/page/Section;", "setEnabled", "enabled", "setScrollerPosition", "setupForNewPage", "page", "Lorg/wikipedia/page/Page;", "showToC", "Companion", "ScrollerCallback", "ToCAdapter", "app.lib"})
public final class SidePanelHandler implements org.wikipedia.views.ObservableWebView.OnClickListener, org.wikipedia.views.ObservableWebView.OnScrollChangeListener, org.wikipedia.views.ObservableWebView.OnContentHeightChangedListener {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.PageFragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.bridge.CommunicationBridge bridge = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.FrameLayout.LayoutParams scrollerViewParams = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.ObservableWebView webView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.SidePanelHandler.ToCAdapter tocAdapter = null;
    private boolean rtl = false;
    private int currentItemSelected = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.eventplatform.ArticleTocInteractionEvent articleTocInteractionEvent;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.metricsplatform.ArticleTocInteraction metricsPlatformArticleEventTocInteraction;
    @org.jetbrains.annotations.NotNull()
    private final android.webkit.ValueCallback<java.lang.String> sectionOffsetsCallback = null;
    private static final float SCROLLER_BUTTON_SIZE = 44.0F;
    private static final float SCROLLER_BUTTON_REVEAL_MARGIN = 12.0F;
    private static final float TOC_LEAD_TEXT_SIZE = 24.0F;
    private static final float TOC_SECTION_TEXT_SIZE = 18.0F;
    private static final float TOC_SUBSECTION_TEXT_SIZE = 14.0F;
    private static final float TOC_SECTION_TOP_OFFSET_ADJUST = 70.0F;
    private static final int MAX_LEVELS = 3;
    private static final int ABOUT_SECTION_ID = -1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.SidePanelHandler.Companion Companion = null;
    
    public SidePanelHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge bridge) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object isVisible() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"RtlHardcoded"})
    public final void setupForNewPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Page page) {
    }
    
    private final void scrollToSection(org.wikipedia.page.Section section) {
    }
    
    private final void onStartShow() {
    }
    
    public final void showToC() {
    }
    
    public final void hide() {
    }
    
    public final void log() {
    }
    
    public final void setEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public boolean onClick(float x, float y) {
        return false;
    }
    
    @java.lang.Override()
    public void onScrollChanged(int oldScrollY, int scrollY, boolean isHumanScroll) {
    }
    
    @java.lang.Override()
    public void onContentHeightChanged(int contentHeight) {
    }
    
    @android.annotation.SuppressLint(value = {"RtlHardcoded"})
    private final void setScrollerPosition() {
    }
    
    private final void scrollToListSectionByOffset(int yOffset) {
    }
    
    private final void onScrollerMoved(float dy, boolean scrollWebView) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/page/SidePanelHandler$Companion;", "", "()V", "ABOUT_SECTION_ID", "", "MAX_LEVELS", "SCROLLER_BUTTON_REVEAL_MARGIN", "", "SCROLLER_BUTTON_SIZE", "TOC_LEAD_TEXT_SIZE", "TOC_SECTION_TEXT_SIZE", "TOC_SECTION_TOP_OFFSET_ADJUST", "TOC_SUBSECTION_TEXT_SIZE", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/page/SidePanelHandler$ScrollerCallback;", "Lorg/wikipedia/views/PageScrollerView$Callback;", "(Lorg/wikipedia/page/SidePanelHandler;)V", "onClick", "", "onScrollStart", "onScrollStop", "onVerticalScroll", "dy", "", "app.lib"})
    final class ScrollerCallback implements org.wikipedia.views.PageScrollerView.Callback {
        
        public ScrollerCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick() {
        }
        
        @java.lang.Override()
        public void onScrollStart() {
        }
        
        @java.lang.Override()
        public void onScrollStop() {
        }
        
        @java.lang.Override()
        public void onVerticalScroll(float dy) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/page/SidePanelHandler$ToCAdapter;", "Landroid/widget/BaseAdapter;", "(Lorg/wikipedia/page/SidePanelHandler;)V", "highlightedSection", "", "sectionYOffsets", "Landroid/util/SparseIntArray;", "sections", "Ljava/util/ArrayList;", "Lorg/wikipedia/page/Section;", "getCount", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "getYOffset", "id", "setHighlightedSection", "", "setPage", "page", "Lorg/wikipedia/page/Page;", "setYOffset", "yOffset", "app.lib"})
    public final class ToCAdapter extends android.widget.BaseAdapter {
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<org.wikipedia.page.Section> sections = null;
        @org.jetbrains.annotations.NotNull()
        private final android.util.SparseIntArray sectionYOffsets = null;
        private int highlightedSection = 0;
        
        public ToCAdapter() {
            super();
        }
        
        public final void setPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.Page page) {
        }
        
        public final void setHighlightedSection(int id) {
        }
        
        public final int getYOffset(int id) {
            return 0;
        }
        
        public final void setYOffset(int id, int yOffset) {
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.page.Section getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public long getItemId(int position) {
            return 0L;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
        android.view.View convertView, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
    }
}