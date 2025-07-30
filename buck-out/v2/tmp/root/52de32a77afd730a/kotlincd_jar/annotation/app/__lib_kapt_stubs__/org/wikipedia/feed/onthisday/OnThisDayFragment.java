package org.wikipedia.feed.onthisday;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.R;
import org.wikipedia.databinding.FragmentOnThisDayBinding;
import org.wikipedia.databinding.ViewEventsLayoutBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.Resource;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.log.L;
import org.wikipedia.views.CustomDatePicker;
import org.wikipedia.views.HeaderMarginItemDecoration;
import java.util.Calendar;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0005./012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002J\u0016\u0010&\u001a\u00020\u00132\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u001a\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010,\u001a\u00020\u0013H\u0002J\u0012\u0010-\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u00063"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/views/CustomDatePicker$Callback;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "viewModel", "Lorg/wikipedia/feed/onthisday/OnThisDayViewModel;", "getViewModel", "()Lorg/wikipedia/feed/onthisday/OnThisDayViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "maybeHideDateIndicator", "", "onCalendarClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDatePicked", "calendar", "Ljava/util/Calendar;", "onDestroyView", "onError", "throwable", "", "onIndicatorLayoutClicked", "onLoading", "onSuccess", "events", "", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "onViewCreated", "view", "setUpToolbar", "setUpTransitionAnimation", "Companion", "EventsViewHolder", "FooterViewHolder", "RecyclerAdapter", "ViewPagerAdapter", "app.lib"})
public final class OnThisDayFragment extends androidx.fragment.app.Fragment implements org.wikipedia.views.CustomDatePicker.Callback {
    @org.jetbrains.annotations.Nullable()
    private FragmentOnThisDayBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener offsetChangedListener = null;
    private static final int VIEW_TYPE_ITEM = 0;
    private static final int VIEW_TYPE_FOOTER = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.onthisday.OnThisDayFragment.Companion Companion = null;
    
    public OnThisDayFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    private final org.wikipedia.feed.onthisday.OnThisDayViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onLoading() {
    }
    
    private final void setUpTransitionAnimation(android.os.Bundle savedInstanceState) {
    }
    
    private final void onSuccess(java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> events) {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    private final void setUpToolbar() {
    }
    
    private final void maybeHideDateIndicator() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDatePicked(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
    }
    
    private final void onCalendarClicked() {
    }
    
    private final void onIndicatorLayoutClicked() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayFragment$Companion;", "", "()V", "VIEW_TYPE_FOOTER", "", "VIEW_TYPE_ITEM", "newInstance", "Lorg/wikipedia/feed/onthisday/OnThisDayFragment;", "age", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "year", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.onthisday.OnThisDayFragment newInstance(int age, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, int year, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayFragment$EventsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "eventBinding", "error/NonExistentClass", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/feed/onthisday/OnThisDayFragment;Lerror/NonExistentClass;Lorg/wikipedia/dataclient/WikiSite;)V", "otdEventLayout", "Lerror/NonExistentClass;", "animateRadioButton", "", "setFields", "event", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "setPagesViewPager", "app.lib"})
    final class EventsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.WikiSite wiki = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object otdEventLayout = null;
        
        public EventsViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass eventBinding, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            super(null);
        }
        
        public final void setFields(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.onthisday.OnThisDay.Event event) {
        }
        
        private final void setPagesViewPager(org.wikipedia.feed.onthisday.OnThisDay.Event event) {
        }
        
        public final void animateRadioButton() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayFragment$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lorg/wikipedia/feed/onthisday/OnThisDayFragment;Landroid/view/View;)V", "app.lib"})
    final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayFragment$RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "events", "", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/feed/onthisday/OnThisDayFragment;Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "app.lib"})
    final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> events = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.WikiSite wiki = null;
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> events, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayFragment$ViewPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/feed/onthisday/OnThisDayPagesViewHolder;", "pages", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/feed/onthisday/OnThisDayFragment;Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;)V", "getItemCount", "", "onBindViewHolder", "", "onThisDayPagesViewHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "app.lib"})
    public final class ViewPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.feed.onthisday.OnThisDayPagesViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.page.PageSummary> pages = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.dataclient.WikiSite wiki = null;
        
        public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> pages, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.feed.onthisday.OnThisDayPagesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int i) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.onthisday.OnThisDayPagesViewHolder onThisDayPagesViewHolder, int i) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
}