package org.wikipedia.feed.onthisday;

import android.app.ActivityOptions;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.page.PageSummary;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.PageActivity;
import org.wikipedia.readinglist.LongPressMenu;
import org.wikipedia.readinglist.ReadingListBehaviorsUtil;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.FeedbackUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.TabUtil;
import org.wikipedia.util.TransitionUtil;
import org.wikipedia.views.FaceAndColorDetectImageView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eJ\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayPagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "v", "Landroid/view/View;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;Lorg/wikipedia/dataclient/WikiSite;)V", "image", "Lorg/wikipedia/views/FaceAndColorDetectImageView;", "imageContainer", "Landroid/widget/FrameLayout;", "selectedPage", "Lorg/wikipedia/dataclient/page/PageSummary;", "onBaseViewClicked", "", "setFields", "page", "setImage", "url", "", "showOverflowMenu", "", "anchorView", "app.lib"})
public final class OnThisDayPagesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.FrameLayout imageContainer = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.FaceAndColorDetectImageView image = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.PageSummary selectedPage;
    
    public OnThisDayPagesViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super(null);
    }
    
    public final void setFields(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary page) {
    }
    
    private final void setImage(java.lang.String url) {
    }
    
    private final void onBaseViewClicked() {
    }
    
    private final boolean showOverflowMenu(android.view.View anchorView) {
        return false;
    }
}