package org.wikipedia.usercontrib;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.wikipedia.R;
import org.wikipedia.databinding.ItemUserContribBinding;
import org.wikipedia.dataclient.mwapi.UserContribution;
import org.wikipedia.util.DateUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.StringUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "listener", "Lorg/wikipedia/usercontrib/UserContribItemView$Listener;", "getListener", "()Lorg/wikipedia/usercontrib/UserContribItemView$Listener;", "setListener", "(Lorg/wikipedia/usercontrib/UserContribItemView$Listener;)V", "setContents", "", "contrib", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "currentQuery", "", "Listener", "app.lib"})
public final class UserContribItemView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.usercontrib.UserContribItemView.Listener listener;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object binding = null;
    
    public UserContribItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.usercontrib.UserContribItemView.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.usercontrib.UserContribItemView.Listener p0) {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.UserContribution contrib, @org.jetbrains.annotations.Nullable()
    java.lang.String currentQuery) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/usercontrib/UserContribItemView$Listener;", "", "onClick", "", "app.lib"})
    public static abstract interface Listener {
        
        public abstract void onClick();
    }
}