package org.wikipedia.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.wikipedia.databinding.ViewWikiArticleCardBinding;
import org.wikipedia.page.PageTitle;
import org.wikipedia.settings.Prefs;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.TransitionUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u001d\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012R\u0013\u0010\u0007\u001a\u00020\b\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/views/WikiArticleCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "getImageView", "Lorg/wikipedia/views/FaceAndColorDetectImageView;", "getSharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "", "()[Landroid/util/Pair;", "prepareForTransition", "", "title", "Lorg/wikipedia/page/PageTitle;", "setDescription", "description", "setExtract", "extract", "maxLines", "", "setImageUri", "uri", "Landroid/net/Uri;", "hideInLandscape", "", "setTitle", "app.lib"})
public final class WikiArticleCardView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public WikiArticleCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBinding() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String description) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.FaceAndColorDetectImageView getImageView() {
        return null;
    }
    
    public final void setExtract(@org.jetbrains.annotations.Nullable()
    java.lang.String extract, int maxLines) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.Pair<android.view.View, java.lang.String>[] getSharedElements() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, boolean hideInLandscape) {
    }
    
    public final void prepareForTransition(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
}