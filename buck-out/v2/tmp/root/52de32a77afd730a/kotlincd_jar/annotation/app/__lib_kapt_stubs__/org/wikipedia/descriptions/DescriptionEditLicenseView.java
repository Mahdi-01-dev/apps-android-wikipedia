package org.wikipedia.descriptions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.widget.TextViewCompat;
import org.wikipedia.R;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.databinding.ViewDescriptionEditLicenseBinding;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0017\u001a\u00020\u0013R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditLicenseView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "callback", "Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Callback;", "getCallback", "()Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Callback;", "setCallback", "(Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Callback;)V", "movementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "buildLicenseNotice", "", "arg", "", "lang", "darkLicenseView", "Callback", "Companion", "app.lib"})
public final class DescriptionEditLicenseView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.descriptions.DescriptionEditLicenseView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.page.LinkMovementMethodExt movementMethod = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_NOTICE_DEFAULT = "defaultNotice";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_NOTICE_IMAGE_CAPTION = "imageCaptionNotice";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_NOTICE_ARTICLE_DESCRIPTION = "articleDescriptionNotice";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditLicenseView.Companion Companion = null;
    
    public DescriptionEditLicenseView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.descriptions.DescriptionEditLicenseView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditLicenseView.Callback p0) {
    }
    
    public final void buildLicenseNotice(@org.jetbrains.annotations.NotNull()
    java.lang.String arg, @org.jetbrains.annotations.Nullable()
    java.lang.String lang) {
    }
    
    public final void darkLicenseView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Callback;", "", "onLoginClick", "", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onLoginClick();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditLicenseView$Companion;", "", "()V", "ARG_NOTICE_ARTICLE_DESCRIPTION", "", "ARG_NOTICE_DEFAULT", "ARG_NOTICE_IMAGE_CAPTION", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}