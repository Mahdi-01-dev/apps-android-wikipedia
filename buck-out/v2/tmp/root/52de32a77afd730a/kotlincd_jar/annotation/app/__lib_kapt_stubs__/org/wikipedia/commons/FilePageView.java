package org.wikipedia.commons;

import android.content.Context;
import android.icu.text.ListFormatter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewFilePageBinding;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.mwapi.MwQueryPage;
import org.wikipedia.descriptions.DescriptionEditActivity;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.suggestededits.PageSummaryForEdit;
import org.wikipedia.util.ImageUrlUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.ImageDetailView;
import org.wikipedia.views.ImageZoomHelper;
import org.wikipedia.views.ViewUtil;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J>\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J,\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0002J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u001a\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J(\u0010*\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020!2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0002Jx\u0010/\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020!2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001d0\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\"\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&R\u0013\u0010\u0007\u001a\u00020\b\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lorg/wikipedia/commons/FilePageView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "movementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "addActionButton", "", "buttonText", "", "listener", "Landroid/view/View$OnClickListener;", "addDetail", "showDivider", "", "titleString", "detail", "externalLink", "getImageTags", "imageTags", "", "", "languageCode", "getProperLanguageCode", "summary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "imageFromCommons", "imageCaptionOnClickListener", "summaryForEdit", "callback", "Lorg/wikipedia/commons/FilePageView$Callback;", "imageTagsOnClickListener", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "loadImage", "containerWidth", "", "thumbWidth", "thumbHeight", "setup", "showFilename", "showEditButton", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "Callback", "app.lib"})
public final class FilePageView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt movementMethod = null;
    
    public FilePageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    public final void setup(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> imageTags, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage page, int containerWidth, int thumbWidth, int thumbHeight, boolean imageFromCommons, boolean showFilename, boolean showEditButton, @org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.Nullable()
    org.wikipedia.commons.FilePageView.Callback callback) {
    }
    
    private final java.lang.String getImageTags(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> imageTags, java.lang.String languageCode) {
        return null;
    }
    
    private final java.lang.String getProperLanguageCode(org.wikipedia.suggestededits.PageSummaryForEdit summary, boolean imageFromCommons) {
        return null;
    }
    
    private final void loadImage(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, int containerWidth, int thumbWidth, int thumbHeight) {
    }
    
    private final android.view.View.OnClickListener imageCaptionOnClickListener(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, org.wikipedia.commons.FilePageView.Callback callback) {
        return null;
    }
    
    private final android.view.View.OnClickListener imageTagsOnClickListener(org.wikipedia.dataclient.mwapi.MwQueryPage page, org.wikipedia.commons.FilePageView.Callback callback) {
        return null;
    }
    
    private final void addDetail(boolean showDivider, java.lang.String titleString, java.lang.String detail, java.lang.String externalLink, android.view.View.OnClickListener listener) {
    }
    
    private final void addActionButton(java.lang.String buttonText, android.view.View.OnClickListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/commons/FilePageView$Callback;", "", "onImageCaptionClick", "", "summaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "onImageTagsClick", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onImageCaptionClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit);
        
        public abstract void onImageTagsClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage page);
    }
}