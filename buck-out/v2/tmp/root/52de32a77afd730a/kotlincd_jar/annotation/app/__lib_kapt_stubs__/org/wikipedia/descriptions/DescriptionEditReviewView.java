package org.wikipedia.descriptions;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.wikipedia.databinding.ViewDescriptionEditReviewBinding;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.StringUtil;
import org.wikipedia.views.ViewUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000eR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditReviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "isShowing", "", "()Z", "hide", "", "setDescriptionReviewView", "summaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "description", "", "setGalleryReviewView", "setLoginCallback", "callback", "Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Callback;", "setSummary", "captionReview", "show", "Companion", "app.lib"})
public final class DescriptionEditReviewView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    public static final int ARTICLE_EXTRACT_MAX_LINE_WITH_IMAGE = 2;
    public static final int ARTICLE_EXTRACT_MAX_LINE_WITHOUT_IMAGE = 5;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditReviewView.Companion Companion = null;
    
    public DescriptionEditReviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final void setLoginCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditLicenseView.Callback callback) {
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean captionReview) {
    }
    
    private final void setDescriptionReviewView(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, java.lang.String description) {
    }
    
    private final void setGalleryReviewView(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, java.lang.String description) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditReviewView$Companion;", "", "()V", "ARTICLE_EXTRACT_MAX_LINE_WITHOUT_IMAGE", "", "ARTICLE_EXTRACT_MAX_LINE_WITH_IMAGE", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}