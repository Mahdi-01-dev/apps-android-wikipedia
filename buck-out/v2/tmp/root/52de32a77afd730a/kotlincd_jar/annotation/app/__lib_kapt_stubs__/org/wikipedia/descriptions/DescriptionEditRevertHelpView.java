package org.wikipedia.descriptions;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.databinding.ViewDescriptionEditRevertHelpBinding;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditRevertHelpView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "qNumber", "", "(Landroid/content/Context;Ljava/lang/String;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "createReason", "Landroid/text/SpannedString;", "htmlString", "getHistoryUri", "Landroid/net/Uri;", "app.lib"})
public final class DescriptionEditRevertHelpView extends android.widget.ScrollView {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String qNumber = "";
    
    public DescriptionEditRevertHelpView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public DescriptionEditRevertHelpView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String qNumber) {
        super(null);
    }
    
    private final android.text.SpannedString createReason(java.lang.String htmlString) {
        return null;
    }
    
    private final android.net.Uri getHistoryUri(java.lang.String qNumber) {
        return null;
    }
}