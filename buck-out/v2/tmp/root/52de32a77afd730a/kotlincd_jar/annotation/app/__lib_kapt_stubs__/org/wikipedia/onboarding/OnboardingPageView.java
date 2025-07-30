package org.wikipedia.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewOnboardingPageBinding;
import org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.util.StringUtil;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003()*B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0002J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0014J\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0013J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "getCallback", "()Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "setCallback", "(Lorg/wikipedia/onboarding/OnboardingPageView$Callback;)V", "listDataType", "", "viewHeightDetected", "", "getListData", "", "dataType", "onLayout", "", "changed", "left", "", "top", "right", "bottom", "refreshLanguageList", "removeScrollViewContainerGravity", "setSecondaryText", "text", "", "setTertiaryTextViewVisible", "isVisible", "setUpLanguageListContainer", "showListView", "Callback", "DefaultCallback", "LanguageListAdapter", "app.lib"})
public final class OnboardingPageView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.onboarding.OnboardingPageView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String listDataType;
    private boolean viewHeightDetected = false;
    
    public OnboardingPageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.onboarding.OnboardingPageView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.onboarding.OnboardingPageView.Callback p0) {
    }
    
    public final void setSecondaryText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setTertiaryTextViewVisible(boolean isVisible) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    private final void removeScrollViewContainerGravity() {
    }
    
    private final void setUpLanguageListContainer(boolean showListView, java.lang.String dataType) {
    }
    
    private final java.util.List<java.lang.String> getListData(java.lang.String dataType) {
        return null;
    }
    
    public final void refreshLanguageList() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "", "onLinkClick", "", "view", "Lorg/wikipedia/onboarding/OnboardingPageView;", "url", "", "onListActionButtonClicked", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onLinkClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void onListActionButtonClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$DefaultCallback;", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "()V", "onLinkClick", "", "view", "Lorg/wikipedia/onboarding/OnboardingPageView;", "url", "", "onListActionButtonClicked", "app.lib"})
    public static final class DefaultCallback implements org.wikipedia.onboarding.OnboardingPageView.Callback {
        
        public DefaultCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onLinkClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @java.lang.Override()
        public void onListActionButtonClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0015\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter$OptionsViewHolder;", "Lorg/wikipedia/onboarding/OnboardingPageView;", "items", "", "", "(Lorg/wikipedia/onboarding/OnboardingPageView;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OptionsViewHolder", "app.lib"})
    public final class LanguageListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> items = null;
        
        public LanguageListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> items) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter$OptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter;Landroid/view/View;)V", "optionLabelTextView", "Landroid/widget/TextView;", "getOptionLabelTextView", "()Landroid/widget/TextView;", "setOptionLabelTextView", "(Landroid/widget/TextView;)V", "app.lib"})
        public final class OptionsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView optionLabelTextView;
            
            public OptionsViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getOptionLabelTextView() {
                return null;
            }
            
            public final void setOptionLabelTextView(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
        }
    }
}